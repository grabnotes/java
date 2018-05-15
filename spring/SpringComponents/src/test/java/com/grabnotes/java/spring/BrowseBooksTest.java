/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.java.spring;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class BrowseBooksTest extends TestCase{
	 /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public BrowseBooksTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( BrowseBooksTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

}
