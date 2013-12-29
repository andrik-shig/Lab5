package ru.shigin.lab5;

import java.text.DecimalFormat;

/**
*  Класс "Точка"
*
*  @author Shigin Andrei
*/

public class Point implements Movable, Symmetry
{
    private int id;
    private static int nextId = 1;
    private String name = "Точка";
    private double x, y, z;
     
    { id = nextId++; }
    
    public Point(double x, double y, double z)    // конструктор
    { 
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getId()
    {
        return id;
    }
    
    public void setId( int id)
    {
        this.id = id;
    }
    
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name0)
    {
        name = name0;
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

 /**
 * Метод вычисления расстояния до какой нибудь точки
 *
 * @param p точка до которой вычисляется расстояние
 * @return расстояние
 */
    public double distance( Point0 p )  
    {
        double dx = this.x - p.getX();
        double dy = this.y - p.getY();
        double dz = this.z - p.getZ();
        
        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }
        
    public String toString()
    {
        String str;
        str = " ID = " + this.getId() + " - " + this.getName() + " \n";
        str = str + " Координаты: (" + this.getX() + ", " + this.getY() + ", " + this.getZ() +")\n" ;
        str = str + " Удаленность от центра = " + f(this.distance( new Point0(0,0,0)));
        str = str + "\n-----------------";
        return str;
    }
    
/**
 * Метод преобразование формата вывода числа с плавающей точкой
 *
 * @param a число с плавающей точкой
 * @return строка с преобразованным числом
 */
    public String f( double a)
    {
        DecimalFormat f = new DecimalFormat("0.###");
        return f.format(a);       
    }
/**
 * Реализация перемещения объекта на заданный вектор
 * 
 */
    public void move( Point0 A, Point0 B) 
    {
        double dx = B.getX() - A.getX();
        double dy = B.getY() - A.getY();
        double dz = B.getZ() - A.getZ();
		
        double x = this.getX();
        double y = this.getY();
        double z = this.getZ();
        this.setPoint(dx + x , dy + y, dz + z);
    }
   
    public void setPoint( double x, double y, double z)
    {
    	this.x = x;
    	this.y = y;
    	this.z = z;
    }
    
/**
 * Реализация семместрии объекта относительно начала координат
 *
 */
    public void reflect() 
    {
        double x = this.getX();
        double y = this.getY();
        double z = this.getZ();
        this.setPoint( (-1)*x , (-1)*y, (-1)*z);
    }    
}
