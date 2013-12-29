package ru.shigin.lab5.tests;

/**
 * Тестирование методов класса "Четырёхугольник"
 *
 *  @author Shigin Andrei
 */
 
 
import org.junit.Test;
import static org.junit.Assert.*; 

import ru.shigin.lab5.*;


public class QuadrangleTest 
{

    @Test
    public void testMove()
    {
	System.out.println("Проверка метода Move() в классе Quadrangle");
	Quadrangle p = new Quadrangle(new Point0(4, 0, 0), new Point0(4, 3, 0), new Point0(0, 3, 3), new Point0(0, 0, 3));
	Quadrangle t = new Quadrangle(new Point0(4, 0, -3), new Point0(4, 3, -3), new Point0(0, 3, 0), new Point0(0, 0, 0));
	
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
	
	assertEquals( t.getD().getX(), p.getD().getX(), 0.00001);
	assertEquals( t.getD().getY(), p.getD().getY(), 0.00001);
	assertEquals( t.getD().getZ(), p.getD().getZ(), 0.00001);
    }
    
    @Test
    public void testReflect()
    {
	System.out.println("Проверка метода Reflect() в классе Quadrangle");
	Quadrangle p = new Quadrangle(new Point0(4, 0, 0), new Point0(4, 3, 0), new Point0(0, 3, 3), new Point0(0, 0, 3));
	Quadrangle t = new Quadrangle(new Point0(-4, 0, 0), new Point0(-4, -3, 0), new Point0(0, -3, -3), new Point0(0, 0, -3));
	
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
	
	assertEquals( t.getD().getX(), p.getD().getX(), 0.00001);
	assertEquals( t.getD().getY(), p.getD().getY(), 0.00001);
	assertEquals( t.getD().getZ(), p.getD().getZ(), 0.00001);
    }
    
    @Test
    public void testGetArea()
    {
	System.out.println("Проверка метода getArea() в классе Quadrangle");
	Quadrangle p = new Quadrangle(new Point0(4, 0, 0), new Point0(4, 3, 0), new Point0(0, 3, 3), new Point0(0, 0, 3));
	
	assertEquals(15, p.getArea(), 0.00001);
    }
    
    @Test
    public void testGetPerimetr()
    {
	System.out.println("Проверка метода getPerimeter() в классе Quadrangle");
	Quadrangle p = new Quadrangle(new Point0(4, 0, 0), new Point0(4, 3, 0), new Point0(0, 3, 3), new Point0(0, 0, 3));
	
	assertEquals( 16, p.getPerimeter(), 0.00001);
    }
    
    public void testGetSt()
    {
	System.out.println("Проверка метода нахождения сторон и диагоналей в классе Quadrangle");
	Quadrangle p = new Quadrangle(new Point0(4, 0, 0), new Point0(4, 3, 0), new Point0(0, 3, 3), new Point0(0, 0, 3));
	
	assertEquals( 3, p.getAB(), 0.00001);
	assertEquals( 5, p.getBC(), 0.00001);
	assertEquals( 3, p.getCD(), 0.00001);
	assertEquals( 5, p.getAD(), 0.00001);
	
	assertEquals( 5.83095, p.getCD(), 0.00001);
	assertEquals( 5.83095, p.getAD(), 0.00001);
    }   
}