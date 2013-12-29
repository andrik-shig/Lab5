
package ru.shigin.lab5.tests;

/**
* Тестирование методов класса "Отрезок"
*
*  @author Shigin Andrei
*/

 
import org.junit.Test;
import static org.junit.Assert.*; 

import ru.shigin.lab5.*;

public class VectorTest 
{
    Vector p = new Vector(new Point0(4, 0, 0), new Point0(4, 3, 0)); // начальный
	
    
    @Test
    public void testMove()
    {
	System.out.println("Проверка метода Move() в классе Vector");
	Vector t = new Vector(new Point0(0, 0, 3), new Point0(0, 3, 3)); // конечный
	
	p.move(new Point0(4,0,0), new Point0(0,0,3));
	
	assertEquals( t.getA().getX(), p.getA().getX(), 0.00001);
	assertEquals( t.getA().getY(), p.getA().getY(), 0.00001);
	assertEquals( t.getA().getZ(), p.getA().getZ(), 0.00001);
	
	assertEquals( t.getB().getX(), p.getB().getX(), 0.00001);
	assertEquals( t.getB().getY(), p.getB().getY(), 0.00001);
	assertEquals( t.getB().getZ(), p.getB().getZ(), 0.00001);
    }
    
 
    @Test
    public void testReflect()
    {
	System.out.println("Проверка метода Reflect() в классе Vector");
	Vector t = new Vector(new Point0(-4, 0, 0), new Point0(-4, -3, 0)); // конечный
	
	p.reflect();
	
	assertEquals( t.getA().getX(), p.getA().getX(), 0.00001);
	assertEquals( t.getA().getY(), p.getA().getY(), 0.00001);
	assertEquals( t.getA().getZ(), p.getA().getZ(), 0.00001);
	
	assertEquals( t.getB().getX(), p.getB().getX(), 0.00001);
	assertEquals( t.getB().getY(), p.getB().getY(), 0.00001);
	assertEquals( t.getB().getZ(), p.getB().getZ(), 0.00001);
    }
    
    @Test
    public void testGetCos()
    {
	System.out.println("Проверка методов getCos() в классе Vector");
	Vector p = new Vector(new Point0(4, 0, 0), new Point0(0, 0, 3)); // начальный
	
	
	
	assertEquals( 0.8, p.getCosX(), 0.00001);
	assertEquals( 0,  p.getCosY(), 0.00001);
	assertEquals( 0.6, p.getCosZ(), 0.00001);
    }
    
    @Test
    public void testGetKord()
    {
	System.out.println("Проверка методов getKord() в классе Vector");
	Vector p = new Vector(new Point0(4, 0, 0), new Point0(0, 0, 3)); // начальный
	
	assertEquals( 0-4, p.getKord_X(), 0.00001);
	assertEquals( 0-0,  p.getKord_Y(), 0.00001);
	assertEquals( 3-0, p.getKord_Z(), 0.00001);
    }
    
    public void testGetAB()
    {
	System.out.println("Проверка методов getAB() в классе Vector");
	Vector p = new Vector(new Point0(4, 0, 0), new Point0(0, 0, 3)); // начальный
	
	assertEquals( 5, p.getAB(), 0.00001);

    }   
}