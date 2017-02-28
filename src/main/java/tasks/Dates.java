/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author jonassimonsen
 */
public class Dates {
    
    private Calendar calendar;
    
    public static void main(String[] args) throws Exception {
        System.out.println(new Dates().getNumDaysInMonth(2, 2000));
    }
    
        
    private boolean validateMonth(int month) {
        return month > 0 && month < 13;
    }
    
    private boolean validateYear(int year) {
        return year > 0;
    }
    
    public int getNumDaysInMonth(int month, int year) throws Exception {
        if(!validateMonth(month) || !validateYear(year)) {
            throw new Exception("Error, invalid parameters");
        }
        calendar = new GregorianCalendar(year, month-1, 1);
        
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}
