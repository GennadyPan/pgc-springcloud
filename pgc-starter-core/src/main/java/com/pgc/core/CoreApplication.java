package com.pgc.core;

import com.pgc.core.dao.ExampleDao;
import com.pgc.core.entity.ExampleEntity;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication(scanBasePackages = "com.pgc")
/**
 * 全局配置，扫描指定包下的dao接口，不用每个dao接口上都写@Mapper注解了
 */
@MapperScan(basePackages = "com.pgc.**.dao")
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}

}
