package com.liucl.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot+mybatis+dubbo   -->provider
 *
 */
@SpringBootApplication
public class ProviderApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
