/**
 * 
 */

/**
 * @author Matt
 *
 */

	import junit.framework.Test;
	import junit.framework.TestCase;
	import junit.framework.TestSuite;

	/**
	 * NOTE matt this class is really generated via archetype quickstart for junit 3.8.1. But since 4.x is backward compatible works with 4.x as well.
	 * Unit test for simple App.
	 */
	public class AppTest 
	    extends TestCase
	{
	    /**
	     * Create the test case
	     *
	     * @param testName name of the test case
	     */
	    public AppTest( String testName )
	    {
	        super( testName );
	    	System.out.println("matt exiting AppTest(" + testName + ")");
	    }

	    /**
	     * @return the suite of tests being tested
	     */
	    public static Test suite()
	    {
	    	System.out.println("matt entered suite()");
	        return new TestSuite( AppTest.class );
	    }

	    /**
	     * Rigourous Test :-)
	     */
	    public void testApp()
	    {
	    	System.out.println("matt entered testApp()");
	        assertTrue( true );
	    }
	}

