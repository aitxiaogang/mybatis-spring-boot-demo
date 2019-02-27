package com.xiaogang.mybatisspringbootdemo;

import com.xiaogang.mybatisspringbootdemo.constants.CountryLevel;
import com.xiaogang.mybatisspringbootdemo.mapper.CountryMapper;
import com.xiaogang.mybatisspringbootdemo.model.Country;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisSpringBootDemoApplicationTests {

	@Autowired
	private CountryMapper countryMapper;

	@Test
	public void contextLoads() {
		List<Country> countries = countryMapper.selectAll();
		for (Country country : countries) {
			System.out.println(country);
		}
	}

	@Test
	public void testInsert() throws Exception{
		Country c = new Country();
		c.setCountryName("test");
		c.setCountryCode("11111");
		c.setCountryLevel(CountryLevel.TWO);
		countryMapper.insert(c);
	}
	
}
