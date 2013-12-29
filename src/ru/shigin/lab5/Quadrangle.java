package ru.shigin.lab5;

/**
 * Класс "Четырёхугольник"
 *
 *  @author Shigin Andrei
 */
public class Quadrangle extends Point
{
    private Point0 A,B,C,D;
    
    public Quadrangle( Point0 A, Point0 B, Point0 C, Point0 D)
    {
        super(A.getX(), A.getY(), A.getZ() );
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        
        this.setName("Четырёхугольник");
    }
 /**
  * Метод вычисления площади четырёхугольника
  *
  * @return Площадь четырёхугольника
  */     
    public double getArea()	// две формулы герона
    {
    	double S_1, S_2;
    	double p1, p2;
    	double AB = this.getAB();
        double BC = this.getBC();
        double AC = A.distance(C);
        double AD = this.getAD();
        double CD = this.getCD();
    	p1 = ( AB + BC + AC )/2; // AB + BC + AC
    	p2 = ( AD + CD + AC )/2; // AD + CD + AC
    	
    	S_1 = Math.sqrt( p1*( p1 - AB )*( p1 - BC )*( p1 - AC ) ); // формула Герона
    	S_2 = Math.sqrt( p2*( p2 - AD )*( p2 - CD )*( p2 - AC ) ); // формула Герона
   	  
        return S_1 + S_2 ;
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
	
	x = this.C.getX();
	y = this.C.getY();
	z = this.C.getZ();
	this.C.setPoint(dx + x, dy + y, dz + z);
	
	x = this.D.getX();
	y = this.D.getY();
	z = this.D.getZ();
	this.D.setPoint(dx + x, dy + y, dz + z);
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

	x = this.D.getX();
	y = this.D.getY();
	z = this.D.getZ();
	this.D.setPoint( (-1)*x , (-1)*y, (-1)*z);
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
    
    public Point0 getD()
    {
	return D;
    }
/**
 * Метод вычисления периметра четырёхугольника
 *
 * @return Периметр четырёхугольника
 */  
    public double getPerimeter()
    {
       return (this.getAB() + this.getBC() + this.getCD() + this.getAD()); 
    }

/**
 * Метод вычисления стороны AB
 *
 */ 
    public double getAB()	// AB
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
 * Метод вычисления стороны CD
 *
 */ 
    public double getCD()
    {
        return C.distance(D);
    }
/**
 * Метод вычисления стороны AD
 *
 */  
    public double getAD()
    {
        return A.distance(D);
    }
/**
 * Метод вычисления диагонали AC
 *
 */ 
    public double getD_AC()
    {
        return A.distance(C);
    }
/**
 * Метод вычисления диагонали BD
 *
 */   
    public double getD_BD()
    {
        return B.distance(D);
    }
    
    public String toString()
    {
        String str;
        str = " ID = " + this.getId() + " - " + this.getName();
        str = str + "\n Длина = " + f(this.getAB()) + ", Ширина = " + f(this.getBC());
        str = str + "\n Диагонали: ";
        str = str + "\n   AC = " + f( getD_AC() ) + ", BD = " + f( getD_BD() ); 
        str = str + "\n Координаты: A(" + A.getX() + ", " + A.getY() + ", " + A.getZ() +" )" ;
        str = str + ", A(" + B.getX() + ", " + B.getY() + ", " + B.getZ() + ")";
        str = str + ", B(" + C.getX() + ", " + C.getY() + ", " + C.getZ() +")";
        str = str + ", C(" + D.getX() + ", " + D.getY() + ", " + D.getZ() +")";
        str = str + "\n Площадь = " + f(this.getArea()) + ", Периметр = " + f(this.getPerimeter());
        str = str + "\n Удаленность от центра = " + f(A.distance( new Point0(0,0,0)));
        str = str + "\n-----------------";
        
        return str;
    }
}
