/**
 * Copyright (c) 2014. CodeGen Ltd. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * @author Supun Dharmarathne 
 * @since Oct 14, 2014
 */
package it.codegen.tbx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = { "it.codegen.tbx" })
public class AppConfig
{
	@Bean
	public CustomerBoImpl customerBoImpl()
	{
		return new CustomerBoImpl();
	}

	@Bean
	public LoggingAspect loggingAspect()
	{
		return new LoggingAspect();
	}

}
