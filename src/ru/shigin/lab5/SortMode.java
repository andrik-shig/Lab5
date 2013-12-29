package ru.shigin.lab5;

import java.util.Comparator;
/**
  *  Класс содержащий в себе параметры сортировки объектов
  *
  *  @author Shigin Andrei
  */
public class SortMode implements Comparator<Point>
{
    private int sortMode;
    private boolean sortDown;
    
    public SortMode(boolean sortDown, int sortMode) 
    {
	this.sortDown = sortDown;
	this.sortMode = sortMode;
    }
/**
 * Метод сравнения объектов
 *
 * @return 1 Если p1 > p2
 * @return -1 Если p2 > p1
 * @return 0 Если p1 = p2
 */ 
    public int compare(Point p1, Point p2) 
    {
	int res = 0;
	Point0 c = new Point0(0,0,0);
	        
        if ( sortMode == 0)
        {
            if ( p1.getId() > p2.getId() ) res = 1;  
            else res = -1;         
        }
	        
        if ( sortMode == 1 )
        {
            res = p1.getName().compareTo(p2.getName());
        }
	        
        if ( sortMode == 2 )
        {
            if ( p1.distance(c) > p2.distance( c ) ) res = 1;
            else res = -1;
        }
	        
        if (sortDown) res*=(-1);

        return res;
    }
}
