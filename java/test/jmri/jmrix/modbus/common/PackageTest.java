package jmri.jmrix.modbus.common;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Tests for the jmri.jmrix.modbus.common package.
 *
 * @author	Bob Jacobsen Copyright 2001, 2003, 2014
 */
public class PackageTest extends TestCase {

    // from here down is testing infrastructure
    public PackageTest(String s) {
        super(s);
    }

    // Main entry point
    static public void main(String[] args) {
        String[] testCaseName = {PackageTest.class.getName()};
        junit.textui.TestRunner.main(testCaseName);
    }

    // test suite from all defined tests
    public static Test suite() {
        TestSuite suite = new TestSuite("jmri.jmrix.modbus.common.PackageTest");  // no tests in this class itself

        // suite.addTest(jmri.jmrix.modbus.common.FooTest.suite());
        if (!System.getProperty("jmri.headlesstest", "false").equals("true")) {
            //suite.addTest(jmri.jmrix.modbus.common.FooTest.suite());
        }

        return suite;
    }

}
