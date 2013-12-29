package ru.shigin.lab5.tests;


import org.junit.Test;
import static org.junit.Assert.*; 

import ru.shigin.lab5.*;

/**
*  Тестирование методов класса "Точка"
*
*  @author Shigin Andrei
*/

public class PointTest 
{
    @Test
    public void testDistance()
    {
	System.out.println("Проверка метода distance() в классе Point");
	Point p = new Point(3,4,0);
	Point0 o = new Point0(0,0,0);
	
	assertEquals(5, p.distance( o ), 0.00001);
    }
    
    @Test
    public void testMove()
    {
	System.out.println("Проверка метода Move() в классе Vector");
	Point p = new Point(0, 0, 0); // начальный
	Point t = new Point(-4, 0, 3); // конечный
	
	p.move(new Point0(4,0,0), new Point0(0,0,3));
	
	assertEquals( t.getX(), p.getX(), 0.00001);
	assertEquals( t.getY(), p.getY(), 0.00001);
	assertEquals( t.getZ(), p.getZ(), 0.00001);
    }
    
}
/*    
  
 /**
 * Метод вычисления расстояния до какой нибудь точки
 *
 * @param p точка до которой вычисляется расстояние
 * @return расстояние
 *

    public double distance( Point0 p )  
    {
        double dx = this.x - p.getX();
        double dy = this.y - p.getY();
        double dz = this.z - p.getZ();
        
        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }
        
 */