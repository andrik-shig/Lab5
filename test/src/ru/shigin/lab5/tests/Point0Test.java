package ru.shigin.lab5.tests;


import org.junit.Test;
import static org.junit.Assert.*; 

import ru.shigin.lab5.*;

/**
*  Тестирование методова класс " техническая точка"
*
*  @author Shigin Andrei
*/

public class Point0Test 
{
    @Test
    public void testDistance()
    {
	System.out.println("Проверка метода distance() в классе Point0");
	Point0 p = new Point0(3,4,0);
	Point0 o = new Point0(0,0,0);
	
	assertEquals(5, p.distance( o ), 0.00001);
    }
}
  