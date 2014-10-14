/**
 * Copyright (c) 2014. CodeGen Ltd. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * @author Supun Dharmarathne 
 * @since Oct 14, 2014
 */
package it.codegen.tbx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{

	/**
	 * @param args
	 * @throws Exception
	 */
	@SuppressWarnings("resource")
	public static void main( String[] args ) throws Exception
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		ctx.register( AppConfig.class );
		ctx.refresh();

		CustomerBo customer = ( CustomerBo ) ctx.getBean( "customerBoImpl" );
		// customer.addCustomer();
		customer.addCustomerAround( "ABC" );
		// customer.addCustomerReturnValue();
	}

}
