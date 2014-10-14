/**
 * Copyright (c) 2014. CodeGen Ltd. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * @author Supun Dharmarathne 
 * @since Oct 14, 2014
 */
package it.codegen.tbx;

public interface CustomerBo
{
	void addCustomer();

	String addCustomerReturnValue();

	void addCustomerThrowException() throws Exception;

	void addCustomerAround( String name );

}
