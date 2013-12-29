package ru.shigin.lab5;

/**
*  Класс: "техническая" точка
*
*  @author Shigin Andrei
*/

public class Point0
{
    private double x, y, z;
 
    public Point0(double x, double y, double z)    // конструктор
    { 
        this.x = x;
        this.y = y;
        this.z = z;
    }
/**
 * Метод вычисления расстоянии до какой нибудь точки
 *
 * @param p точка до которой вычисляется расстояние
 * @return расстояние
 */

    public double distance( Point0 p )  // метод вычисдения расстоянии до какой нибудь точки
    {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        double dz = this.z - p.z;
        
        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }
    
    public void setPoint( double x, double y, double z)
    {
    	this.x = x;
    	this.y = y;
    	this.z = z;
    }
 
    public double getX()
    {
        return x;
    }
    
    public double getY()
    {
        return y;
    }
    
    public double getZ()
    {
        return z;
    }   
}
