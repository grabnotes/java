/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.a05.equals;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class EqualsDemoTest extends TestCase {
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EqualsDemoTest( String testName )
    {
        super( testName );
    }
    
	public void testRegular() {
		boolean actual = new EqualsDemo().isFound("Jack");
		assertTrue(actual);
	}
	
	public void testNull() {
		boolean actual = new EqualsDemo().isFound(null);
		assertTrue(!actual);
	}

}
