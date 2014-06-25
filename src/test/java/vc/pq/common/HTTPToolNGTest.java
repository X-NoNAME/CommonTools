/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vc.pq.common;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.testng.Assert.*;

/**
 *
 * @author Ivan Kazakov
 */
public class HTTPToolNGTest {
    
    public HTTPToolNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Тест метод getResponseCode, класса HTTPTool.
     */
    @org.testng.annotations.Test
    public void testGetResponseCode() {
        
        String address = "http://pq.vc/";
        int expResult = 200;
        int result;
        try {
            result = HTTPTool.getResponseCode(address);
            System.out.println("getResponseCode="+result+" must be "+expResult);
            assertEquals(result, expResult);
        } catch (IOException ex) {
            Logger.getLogger(HTTPToolNGTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Some error during test.",ex);
        }
        
    }
    
}
