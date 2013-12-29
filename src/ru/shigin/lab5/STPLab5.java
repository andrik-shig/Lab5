package ru.shigin.lab5;

import java.io.*;
import java.util.*;
  
/**
 * Основной класс программы
 *
 *  @author Shigin Andrei
 */
public class STPLab5
{
    private static List<Point> list; 
    
/**
 * Метод получения данных
 *
 */
    private static void GetData()
    {
    	list = new ArrayList();
    	
 /*   	list.add(new Point(4,0,-9));
    	
    	list.add(new Vector(new Point0(0,0,0), new Point0(1,1,0)));
      
        list.add(new Triangle(new Point0(2, 1, 0), new Point0( 1, 1, -5), new Point0(7, 1, 4)));
     
        list.add(new Vector(new Point0(6,6,6), new Point0(3,1,7)));
         
        list.add(new Quadrangle(new Point0(2, 6, 4), new Point0(7, 1, 0), new Point0(0, 1, 4), new Point0(7, 0, 4)));
        
        list.add(new Point(-1,4,8));
       
        list.add(new Quadrangle(new Point0(0, 0, 4), new Point0(7, -5, 4), new Point0(-7, 0, 1), new Point0(2, 1, 6)));
       
        list.add(new Vector(new Point0(2, 1, 1), new Point0(1, 1, 0)));
      
        list.add(new Triangle(new Point0(-1, 1, 4), new Point0(0, 1, 3), new Point0(0, 0, 7)));
      
        list.add(new Quadrangle(new Point0(0, 2, 5), new Point0(5, 8, 1), new Point0(1, 1, 1), new Point0(0, 0, 4)));
        
        list.add(new Triangle(new Point0(7, 1, 4), new Point0(-1, 1, -1), new Point0(0, 1, 4)));
        
        list.add(new Quadrangle(new Point0(0, 0, 0), new Point0(0, 3, 0), new Point0(4, 3, 0), new Point0(4, 0, 0)));     
        */
    }
/**
 * Метод вывода данных на консоль
 *
 */
    private static void OutData( boolean sortDown, int sortMode )
    {
        Collections.sort(list, new SortMode(sortDown,sortMode));
        
        for (Point p: list ) 
        {
            System.out.println(p);
        }
    }
    
    public static void main(String[] args) throws IOException
    {
        GetData();
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        String str, st;
        boolean sortDown = false;
        int sortMode = 0;
        double x,y,z;
        
        OutData( sortDown, sortMode);
        for ( ; ; )
        { 
            System.out.println("---------------------------------------------------");
            System.out.println("|                << Меню >>                       |");
            System.out.println("---------------------------------------------------");
            System.out.println("|  <  1 > - по убыванию ID                        |");
            System.out.println("|  <  2 > - по возврастанию ID                    |");
            System.out.println("|  <  3 > - по убыванию имени                     |");
            System.out.println("|  <  4 > - по возврастанию имени                 |");
            System.out.println("|  <  5 > - по убыванию отдаления от центра       |");
            System.out.println("|  <  6 > - по возврастанию отдаления от центра   |");
            System.out.println("|  <  7 > - переместить на вектор                 |");
            System.out.println("|  <  8 > - отразить, относительно точки O(0,0,0) |");
            System.out.println("|  <  9 > - добавить элемент                      |");
            System.out.println("|  < 10 > - удалить элемент                       |");
            System.out.println("|           < 0 > - Выход                         |");
            System.out.println("---------------------------------------------------");
            System.out.print(  "| Ваш выбор = > ");
            str = input.readLine();
            System.out.println("---------------------------------------------------");
            
            if ( str.equals("0") ) break;
            
            sortDown = str.equals("1") || str.equals("3") || str.equals("5");   // убывание - возрастание
            sortMode = -1;
            if ( str.equals("1") || str.equals("2") || str.equals("7") || str.equals("8") || str.equals("9") || str.equals("10") )  sortMode = 0;  // по ID
            if ( str.equals("3") || str.equals("4") )  sortMode = 1;  // по имени
            if ( str.equals("5") || str.equals("6") )  sortMode = 2;  // по периметру
            if ( str.equals("7") ) // ввод вектора/перемещение
            { 
            	System.out.println("--------------------------------------------------");
            
            	System.out.println("|==>| Введите ID объекта:                        |");
            	System.out.print(  "|==>| ID = ");
            	
            	st = input.readLine();
            	
            	int id = Integer.parseInt(st);
            	System.out.println("|==>| Введите координаты вектора АВ:             |");
            	System.out.print(  "|====>| Координаты точки А: x = ");
            	x = Double.parseDouble( input.readLine() );
            	System.out.print(  "|====>| Координаты точки А: y = ");
                y = Double.parseDouble( input.readLine() );
            	System.out.print(  "|====>| Координаты точки А: z = ");
                z = Double.parseDouble( input.readLine() );
            	
            	Point0 A = new Point0 (x,y,z);
            	
            	System.out.print("\n|====>| Координаты точки B: x = ");
            	x = Double.parseDouble( input.readLine() );
            	System.out.print(  "|====>| Координаты точки B: y = ");
            	y = Double.parseDouble( input.readLine() );
            	System.out.print(  "|====>| Координаты точки B: z = ");
            	z = Double.parseDouble( input.readLine() );
            	System.out.println("--------------------------------------------------");
                
            	Point0 B = new Point0 (x,y,z);
            	
            	list.get(id-1).move( A, B);
             	System.out.println("--------------------------------------------------  "   );
            }
            
            if( str.equals("8") ) // отражение относительно начала координат
            {
            	System.out.println("--------------------------------------------------");
                
            	System.out.println("|==>| Введите ID объекта:                        |");
            	System.out.print(  "|==>| ID = ");
            	
            	st = input.readLine();
            	
            	int id = Integer.parseInt(st);
            	
                for(int i = 0; i< list.size(); i++)
            	{
                    if( list.get(i).getId() == id) 
                    {
                        list.get(i).reflect();
                        break;
                    }
            	}
             	System.out.println("--------------------------------------------------  ");
            }
            
            if(str.equals("9"))
            {
            	System.out.println("--------------------------------------------------");
            	System.out.println("|==>|         Добавление элемента           |<===|");
            	System.out.println("--------------------------------------------------");
            	System.out.println("|==>|==>| Выберите тип нового элемента:     |<===|");
            	System.out.println("--------------------------------------------------");
            	System.out.println("|==>|==>|  < 1 > - Точка (А)                |<===|");
            	System.out.println("|==>|==>|  < 2 > - Отрезок (AB)             |<===|");
               	System.out.println("|==>|==>|  < 3 > - Треугольник (ABC)        |<===|");
               	System.out.println("|==>|==>|  < 4 > - Четырёхугольник (ABCD)   |<===|");
                System.out.println("--------------------------------------------------");
                System.out.print(  "| Ваш выбор = > ");
                st = input.readLine();
                System.out.println("--------------------------------------------------");
             
                System.out.println("|==>| Введите координаты точки А:             |");
            	System.out.print(  "|====>| Координаты точки А: x = ");
            	x = Double.parseDouble( input.readLine() );
            	System.out.print(  "|====>| Координаты точки А: y = ");
                y = Double.parseDouble( input.readLine() );
            	System.out.print(  "|====>| Координаты точки А: z = ");
                z = Double.parseDouble( input.readLine() );
                Point0 A = new Point0 (x,y,z);
                
                if ( st.equals("1") )
                {
                    list.add( new Point( x, y, z) );
                }
                else
                {
                    System.out.println("\n|==>| Введите координаты точки B:             |");
                    System.out.print(  "|====>| Координаты точки B: x = ");
                    x = Double.parseDouble( input.readLine() );
                    System.out.print(  "|====>| Координаты точки B: y = ");
                    y = Double.parseDouble( input.readLine() );
                    System.out.print(  "|====>| Координаты точки B: z = ");
                    z = Double.parseDouble( input.readLine() );
                    Point0 B = new Point0 (x,y,z);

                    if ( st.equals("2") )
                    {
                        list.add(new Vector( A, B));
                    }
                    else
                    {
                        System.out.println("\n|==>| Введите координаты точки C:             |");
                        System.out.print(  "|====>| Координаты точки C: x = ");
                        x = Double.parseDouble( input.readLine() );
                        System.out.print(  "|====>| Координаты точки C: y = ");
                        y = Double.parseDouble( input.readLine() );
                        System.out.print(  "|====>| Координаты точки C: z = ");
                        z = Double.parseDouble( input.readLine() );
                        Point0 C = new Point0 (x,y,z);

                        if ( st.equals("3") )
                        {
                            list.add( new Triangle( A, B, C) );
                        }
                        else
                        {
                            System.out.println("\n|==>| Введите координаты точки D:             |");
                            System.out.print(  "|====>| Координаты точки D: x = ");
                            x = Double.parseDouble( input.readLine() );
                            System.out.print(  "|====>| Координаты точки D: y = ");
                            y = Double.parseDouble( input.readLine() );
                            System.out.print(  "|====>| Координаты точки D: z = ");
                            z = Double.parseDouble( input.readLine() );
                            Point0 D = new Point0 (x,y,z);

                            if ( st.equals("4") )
                            {
                                list.add( new Quadrangle(A, B, C, D) );
                            }
                        }
                    }
                }
                System.out.println("--------------------------------------------------  ");
            }
            
            if(str.equals("10"))
            {
            	System.out.println("--------------------------------------------------");
            	System.out.println("|==>|         Удаление элемента             |<===|");
            	System.out.println("--------------------------------------------------");
            	System.out.print("|==>|==>| Введите ID объекта: ");
            	
            	st = input.readLine();
            	int id = Integer.parseInt(st);
            	
            	for(int i = 0; i< list.size(); i++)
            	{
                    if( list.get(i).getId() == id) 
                    {
                        list.remove(i);
                        break;
                    }
            	}
            	
            	System.out.println("--------------------------------------------------");
            }
            		
            if( sortMode < 0 )
            {
                System.out.println("|      Ошибка при вводе. Попробуйте еще раз...   |");
                System.out.println("==================================================");  
            }
            else 
            {
            	 OutData( sortDown, sortMode);
            }
        }
    }
}
