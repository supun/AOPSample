
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
