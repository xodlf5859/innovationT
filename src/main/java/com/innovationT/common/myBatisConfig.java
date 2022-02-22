package com.innovationT.common;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan(value = {""})
@EnableTransactionManagement
public class myBatisConfig {

	
	
}
