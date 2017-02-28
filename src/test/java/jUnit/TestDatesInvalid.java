/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jUnit;

import tasks.Dates;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author jonassimonsen
 */
@RunWith(Parameterized.class)
public class TestDatesInvalid {
    
    Dates dates = new Dates();
    int month, year, expected;
    
    public TestDatesInvalid(int month, int year) {
        this.month = month;
        this.year = year;
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Parameters
    public static Collection<Object[]> invalidEquivalence() {
        return Arrays.asList(new Object[][] {
            {0, 1984}, 
            {-5, 1984},
            {1, -5},
            {-5, -5},
            {24, 1900},
            {24, -5},
            
            {-5, 2000},
            {14, 2000}
        });
    }
    
    @Test(expected = Exception.class)
    public void testGetInvalid() throws Exception {
        dates.getNumDaysInMonth(month, year);
    }

    
}
