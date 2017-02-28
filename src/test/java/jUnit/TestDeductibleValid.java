/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jUnit;

import tasks.Deductible;
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

/**
 *
 * @author jonassimonsen
 */
@RunWith(Parameterized.class)
public class TestDeductibleValid {
    
    Deductible reductible = new Deductible();
    
    boolean isDeductibleMet;
    String typeOfVisit;
    int expectedResult;
    
    public TestDeductibleValid(boolean isDeductibleMet, String typeOfVisit, int expectedResult) {
        this.isDeductibleMet = isDeductibleMet;
        this.typeOfVisit = typeOfVisit;
        this.expectedResult = expectedResult;
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
    
    @Parameterized.Parameters
    public static Collection<Object[]> validEquivalence() {
        return Arrays.asList(new Object[][] { 
             {false, "Doctor", 0},
            {false, "Hospital", 0},
            {true, "Doctor", 50},
            {true, "Hospital", 80}
        });
    }
    
    @Test
    public void testGetReimbursedFromValidDicisionTable() throws Exception {
        assertEquals(expectedResult, reductible.getReimbursing(isDeductibleMet, typeOfVisit));
    }
    
}
