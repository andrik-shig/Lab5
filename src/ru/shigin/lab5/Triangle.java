package ru.shigin.lab5;

/**
* Класс "Треугольник"
*
*  @author Shigin Andrei
*/

public class Triangle extends Point
{
    private Point0 A, B, C;
    
    public Triangle (Point0 A, Point0 B, Point0 C)
    {
        super(A.getX(), A.getY(), A.getZ());
        this.A = A;
        this.B = B;
        this.C = C;
        
        this.setName("Треугольник");
    }
    
        
    public Point0 getA()
    {
	return A;
    }
    
    public Point0 getB()
    {
	return B;
    }
    
    public Point0 getC()
    {
	return C;
    }
    
/**
 * Реализация перемещения объекта на заданный вектор
 *
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

        x = this.C.getX();
        y = this.C.getY();
        z = this.C.getZ();
        this.C.setPoint(dx + x, dy + y, dz + z);
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

        x = this.C.getX();
        y = this.C.getY();
        z = this.C.getZ();
        this.C.setPoint( (-1)*x , (-1)*y, (-1)*z);
    }
/**
 * Метод вычисления стороны 
 *
 */	
    public double getAB()
    {
        return A.distance(B);
    }
/**
 * Метод вычисления стороны BC
 *
 */    
    public double getBC()
    {
        return B.distance(C);
    }
/**
 * Метод вычисления стороны AC
 *
 */    
    public double getAC()
    {
        return A.distance(C);
    }
/**
 * Метод вычисления площади треугольника
 *
 * @return Площадь треугольника
 */    
    public double getArea()
    {
    	double p = this.getPerimeter()/2;
    	
        return Math.sqrt( p*( p - this.getAB() )*( p - this.getBC() )*( p - this.getAC() ) ); // формула герона
    }
/**
 * Метод вычисления периметра треугольника
 *
 * @return Периметр треугольника
 */     
    public double getPerimeter()
    {   
        return ( this.getAB() + this.getBC() + this.getAC() );
    }
/**
 * Метод вычисления косинуса угла A
 *
 */    
    public double getCosA()
    {
    	double cos;
    	
    	double AB = A.distance(B);
    	double BC = B.distance(C);
    	double AC = A.distance(C);
    	
    	cos = (AB*AB + AC*AC - BC*BC)/(2*AB*AC);
    	
    	return cos;
    }
/**
 * Метод вычисления косинуса угла B
 *
 */    
    public double getCosB()
    {
    	double cos;
    	
    	double AB = A.distance(B);
    	double BC = B.distance(C);
    	double AC = A.distance(C);
    	
    	cos = ( AB*AB + BC*BC - AC*AC)/(2*AB*BC);
    	
    	return cos;
    }
/**
 * Метод вычисления косинуса угла C
 *
 */    
    public double getCosC()
    {
    	double cos;

    	double AB = A.distance(B);
    	double BC = B.distance(C);
    	double AC = A.distance(C);
    	
    	cos = ( AC*AC + BC*BC - AB*AB)/( 2*AC*BC);
    	
    	return cos;
    }
    
    public String toString()
    {
        String str;
        str = " ID = " + this.getId() + " - " + this.getName();
        str = str + "\n Стороны: AB = " + f(this.getAB()) + ", BC = " + f(this.getBC()) + ", AC = " + f(this.getAB());;
        str = str + "\n Координаты:";
        str = str +	 " A(" + A.getX() + ", " + A.getY() + ", " + A.getZ() +")";
        str = str + ", B(" + B.getX() + ", " + B.getY() + ", " + B.getZ() +")";
        str = str + ", C(" + C.getX() + ", " + C.getY() + ", " + C.getZ() +")";
        str = str + "\n Косинусы углов:";
        str = str + "\n    cos(А) = " + f( getCosA() );
        str = str + "\n    cos(B) = " + f( getCosB() );
        str = str + "\n    cos(C) = " + f( getCosC() );
        str = str + "\n Площадь = " + f(this.getArea()) + ", Периметр = " + f(this.getPerimeter());
        str = str + "\n Удаленность от центра = " + f( A.distance( new Point0(0,0,0) ));
        str = str + "\n-----------------";
        return str;
    }
}
