
package ru.shigin.lab5;


/**
* Класс "Вектор"
*
*  @author Shigin Andrei
*/

public class Vector extends Point
{
    private Point0 A, B;
    
    public Vector( Point0 A, Point0 B)
    {
        super(A.getX(), A.getY(), A.getZ() );
        this.A = A;
        this.B = B;
        this.setName("Отрезок");
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
	
	double x = this.A.getX();
	double y = this.A.getY();
	double z = this.A.getZ();
	this.A.setPoint(dx + x , dy + y, dz + z);

	x = this.B.getX();
	y = this.B.getY();
	z = this.B.getZ();
	this.B.setPoint(dx + x, dy + y, dz + z);
    }
/**
 * Реализация семместрии объекта относительно начала координат
 *
 */ 
    public void reflect()
    {
	double x = this.A.getX();
	double y = this.A.getY();
	double z = this.A.getZ();
	this.A.setPoint( (-1)*x , (-1)*y, (-1)*z);

	x = this.B.getX();
	y = this.B.getY();
	z = this.B.getZ();
	this.B.setPoint( (-1)*x , (-1)*y, (-1)*z);
    }
    
    public Point0 getA()
    {
        return A;
    }
    
    public Point0 getB()
    {
        return B;
    }
    
/**
 * Метод вычисления длины вектора
 *
 */      
    public double getAB()
    {
        return A.distance(B);
    }
    
/**
 * Метод получения координаты вектора по оси Оx
 *
 */
    public double getKord_X()
    {
    	return B.getX() - A.getX();
    }
/**
 * Метод получения координаты вектора по оси Оy
 *
 */
    public double getKord_Y()
    {
    	return B.getY() - A.getY();
    }
/**
 * Метод получения координаты вектора по оси Оz
 *
 */
    public double getKord_Z()
    {
    	return B.getZ() - A.getZ();
    }
    
/**
 * Метод получения косинуса угла между вектором и осью Ox
 *
 */
    public double getCosX()	// косинус угла между нашим вектором и осью Ох(1,0,0)
    {
    	double cos;
    	double x = getKord_X();
    	double y = getKord_Y();
    	double z = getKord_Z();
    	
    	cos = x / Math.sqrt(x*x+y*y+z*z); 
    	
    	return Math.abs(cos);
    }
/**
 * Метод получения косинуса угла между вектором и осью Oy
 *
 */
    public double getCosY()
    {
    	double cos;
    	double x = getKord_X();
    	double y = getKord_Y();
    	double z = getKord_Z();
    	
    	cos = y / Math.sqrt(x*x+y*y+z*z); 
    	
	    return Math.abs(cos);
    }
/**
 * Метод получения косинуса угла между вектором и осью Oz
 *
 */
    public double getCosZ()
    {
    	double cos;
    	double x = getKord_X();
    	double y = getKord_Y();
    	double z = getKord_Z();
    	
    	cos = z / Math.sqrt(x*x+y*y+z*z); 
    	
        return Math.abs(cos);
    }
    
    public String toString()
    {
        String str;
        str = " ID = " + this.getId() + " - " + this.getName();
        str = str + "\n Координаты: A(" + A.getX() + ", " + A.getY() + ", " + A.getZ() +")" ;
        str = str + ", B(" + B.getX() + ", " + B.getY() + ", " + B.getZ() +")";
        str = str + "\n Координаты вектора AB(" + getKord_X() + ", " + getKord_Y() + ", " + getKord_Z() +")" ;
        str = str + "\n Длина = " + f(this.getAB() );
        str = str + "\n Косинус угла между вектором и осями координат:";
        str = str + "\n   c осью X = " + f( getCosX() );
        str = str + "\n   c осью Y = " + f( getCosY() );
        str = str + "\n   c осью Z = " + f( getCosZ() );
        str = str + "\n Удаленность от центра = " + f( A.distance( new Point0(0,0,0) ));
        str = str + "\n-----------------";
        
        return str;
    }
}