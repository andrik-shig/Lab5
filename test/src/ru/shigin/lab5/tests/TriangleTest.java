package ru.shigin.lab5.tests;

/**
* Тестирование методов класса "Треугольник"
*
*  @author Shigin Andrei
*/

 
import org.junit.Test;
import static org.junit.Assert.*; 

import ru.shigin.lab5.*;

public class TriangleTest 
{
    @Test
    public void testMove()
    {
	System.out.println("Проверка метода Move() в классе Triangle");
	Triangle p = new Triangle(new Point0(4, 0, 0), new Point0(4, 3, 0), new Point0(0, 3, 3));
	Triangle t = new Triangle(new Point0(4, 0, -3), new Point0(4, 3, -3), new Point0(0, 3, 0));
	
	p.move(new Point0(0,0,3), new Point0(0,0,0));
	
	assertEquals( t.getA().getX(), p.getA().getX(), 0.00001);
	assertEquals( t.getA().getY(), p.getA().getY(), 0.00001);
	assertEquals( t.getA().getZ(), p.getA().getZ(), 0.00001);
	
	assertEquals( t.getB().getX(), p.getB().getX(), 0.00001);
	assertEquals( t.getB().getY(), p.getB().getY(), 0.00001);
	assertEquals( t.getB().getZ(), p.getB().getZ(), 0.00001);
	
	assertEquals( t.getC().getX(), p.getC().getX(), 0.00001);
	assertEquals( t.getC().getY(), p.getC().getY(), 0.00001);
	assertEquals( t.getC().getZ(), p.getC().getZ(), 0.00001);
    }
    
    @Test
    public void testReflect()
    {
	System.out.println("Проверка метода Reflect() в классе Triangle");
	Triangle p = new Triangle(new Point0(4, 0, 0), new Point0(4, 3, 0), new Point0(0, 3, 3));
	Triangle t = new Triangle(new Point0(-4, 0, 0), new Point0(-4, -3, 0), new Point0(0, -3, -3));
	
	p.reflect();
	
	assertEquals( t.getA().getX(), p.getA().getX(), 0.00001);
	assertEquals( t.getA().getY(), p.getA().getY(), 0.00001);
	assertEquals( t.getA().getZ(), p.getA().getZ(), 0.00001);
	
	assertEquals( t.getB().getX(), p.getB().getX(), 0.00001);
	assertEquals( t.getB().getY(), p.getB().getY(), 0.00001);
	assertEquals( t.getB().getZ(), p.getB().getZ(), 0.00001);
	
	assertEquals( t.getC().getX(), p.getC().getX(), 0.00001);
	assertEquals( t.getC().getY(), p.getC().getY(), 0.00001);
	assertEquals( t.getC().getZ(), p.getC().getZ(), 0.00001);
    }
    
    public void testGetSt()
    {
	System.out.println("Проверка метода нахождения сторон и диагоналей в классе Triangle");
	Triangle p = new Triangle(new Point0(4, 0, 0), new Point0(4, 3, 0), new Point0(0, 3, 3));
	
	assertEquals( 3, p.getAB(), 0.00001);
	assertEquals( 5, p.getBC(), 0.00001);
	assertEquals( 5.83095, p.getAC(), 0.00001);
    }   
    
    @Test
    public void testGetArea()
    {
	System.out.println("Проверка метода getArea() в классе Triangle");
	Triangle p = new Triangle(new Point0(4, 0, 0), new Point0(4, 3, 0), new Point0(0, 3, 3));
	
	assertEquals( 7.5, p.getArea(), 0.00001);
    }
    
    @Test
    public void testGetPerimetr()
    {
	System.out.println("Проверка метода getPerimeter() в классе Triangle");
	Triangle p = new Triangle(new Point0(4, 0, 0), new Point0(4, 3, 0), new Point0(0, 3, 3));
	
	assertEquals( 13.83095, p.getPerimeter(), 0.00001);
    }
    
    @Test
    public void testGetCos()
    {
	System.out.println("Проверка метода getCos() в классе Triangle");
	Triangle p = new Triangle(new Point0(4, 0, 0), new Point0(4, 3, 0), new Point0(0, 3, 3));
	
	assertEquals( 0.5144957559, p.getCosA(), 0.00001);
	assertEquals( 0, p.getCosB(), 0.00001);
	assertEquals( 0.857492926, p.getCosC(), 0.00001);
    }     
}