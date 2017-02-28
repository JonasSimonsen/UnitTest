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
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author jonassimonsen
 */
@RunWith(Parameterized.class)
public class TestDeductibleInvalid {
    
    Deductible deductible = new Deductible();
    
    boolean isDeductibleMet;
    String typeOfVisit;
    
    public TestDeductibleInvalid(boolean isDeductibleMet, String typeOfVisit) {
        this.isDeductibleMet = isDeductibleMet;
        this.typeOfVisit = typeOfVisit;
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
            {true, "Dactar"},
            {false, "Haspitol"},
        });
    }
    
    @Test(expected = Exception.class)
    public void testGetReimbursedFromValidDicisionTable() throws Exception {
        deductible.getReimbursing(isDeductibleMet, typeOfVisit);
    }
}
