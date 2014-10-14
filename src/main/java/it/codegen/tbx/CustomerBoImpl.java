/**
 * Copyright (c) 2014. CodeGen Ltd. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * @author Supun Dharmarathne 
 * @since Oct 14, 2014
 */
package it.codegen.tbx;

public class CustomerBoImpl implements CustomerBo
{

	/*
	 * (non-Javadoc)
	 * @see it.codegen.tbx.CustomerBo#addCustomer()
	 */
	@Override
	public void addCustomer()
	{
		// TODO Auto-generated method stub
		System.out.println( "addCustomer() is running " );

	}

	/*
	 * (non-Javadoc)
	 * @see it.codegen.tbx.CustomerBo#addCustomerReturnValue()
	 */
	@Override
	public String addCustomerReturnValue()
	{
		// TODO Auto-generated method stub
		System.out.println( "addCustomerReturnValue() is running " );
		return "abc";
	}

	/*
	 * (non-Javadoc)
	 * @see it.codegen.tbx.CustomerBo#addCustomerThrowException()
	 */
	@Override
	public void addCustomerThrowException() throws Exception
	{
		// TODO Auto-generated method stub
		System.out.println( "addCustomerThrowException() is running " );
		throw new Exception( "Generic Error" );

	}

	/*
	 * (non-Javadoc)
	 * @see it.codegen.tbx.CustomerBo#addCustomerAround(java.lang.String)
	 */
	@Override
	public void addCustomerAround( String name )
	{
		// TODO Auto-generated method stub
		System.out.println( "addCustomerAround() is running, args : " + name );

	}
}
