package com.TestExa.boot.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter(MybatisConfig.class) // 保证在MybatisConfig类实例化后才实例化此方法
public class MybatisScannerConfig { 
	
	// dao接口的扫描器
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer() {
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setBasePackage("com.TestExa.boot.dao");
		return mapperScannerConfigurer;
	}
}
