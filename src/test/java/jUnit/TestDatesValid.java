package jUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import tasks.Dates;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author jonassimonsen
 */
@RunWith(Parameterized.class)
public class TestDatesValid {
    
    Dates dates = new Dates();
    
    int month, year, expected;
    
    public TestDatesValid(int month, int year, int expected) {
        this.month = month;
        this.year = year;
        this.expected = expected;
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
    public static Collection<Object[]> validEquivalence() {
        return Arrays.asList(new Object[][] { 
            {1, 1981, 31}, // Months with 31 days, non-leap year
            {1, 1984, 31}, // Months with 31 days, leap year
            {4, 1981, 30}, // Months with 30 days, non-leap year
            {4, 1984, 30}, // Months with 30 days, leap year
            {2, 1981, 28}, // February, non-leap year
            {2, 1984, 29},  // February, leap year
                
            {2, 2000, 29}, 
            {2, 1900, 28}
        });
    }
    
    @Test
    public void testGetNumDaysInMonth() throws Exception {
        assertEquals(expected, dates.getNumDaysInMonth(month, year));
    }
}
