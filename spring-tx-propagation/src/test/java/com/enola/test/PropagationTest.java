package com.enola.test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.enola.demo.PrepagationService;

@SpringJUnitConfig(locations= "classpath:/application.xml")
@Sql(statements = {
		"set foreign_key_checks = 0;",
		"truncate table details_tbl;",
		"truncate table header_tbl;",
		"set foreign_key_checks = 1;"
})
public class PropagationTest {
	@Autowired
	private PrepagationService service;
	
	@ParameterizedTest
	@CsvSource({
		"Header,Details,2,1,1" //test parameter value
	})
	void test1(String header, String details,int status, int headerId, int detailsId) {
		var result = service.save(status, header, details);
		
		assertNotNull(result.headerId());
		assertEquals(headerId,result.headerId());
		
		assertNotNull(result.detailsId());
		assertEquals(detailsId, result.detailsId().get(0));
	
	}
		
}
