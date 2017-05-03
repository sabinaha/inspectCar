package se.kth.iv1350.carInspection.integration;

import static org.junit.Assert.*;
import org.junit.Test;

public class InspectionItemTest {
    
    @Test
    public void testUpdatedInspectionResult() {
    	InspectionItem expResult = new InspectionItem("Brakes", 105, "Passed");
    	InspectionItem testResult = new InspectionItem("Brakes", 105, "Failed");
    	
    	testResult.updateResult("Passed");
    	
    	assertEquals("The inspection result was not updated: ", expResult, testResult);
       
    }
    
    @Test
    public void testUpdatedNullResult() {
    	InspectionItem expResult = new InspectionItem("Brakes", 105, null);
    	InspectionItem testResult = new InspectionItem("Brakes", 105, "Failed");
    	
    	testResult.updateResult(null);
    	
    	assertEquals("The inspection result was not updated: ", expResult, testResult);
       
    }

}
