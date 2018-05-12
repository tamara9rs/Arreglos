/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Alumno
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[][] arEntero=new int[10][10];
        int n=1;
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                arEntero[i][j]=n;
                n++;
            }
        }
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                System.out.println("\t"+arEntero[i][j]);
            }
            System.out.println("\n");
        }
        
        
        /*int[] arEntero=new int[20];
        for(int i=0;i<20;i++)
        {
            arEntero[i]=3*i;   
        }
        for(int i=0;i<20;i++)
        {
            //System.out.println(arEntero[i]);
            if(arEntero[i]%2!=0)
            {
                System.out.println("Impares:  "+arEntero[i]);
            }
        }*/
        
       /* 
        arEntero[0]=5;
        arEntero[1]=10;
        arEntero[2]=15;
        arEntero[3]=20;
        arEntero[4]=25;
        //System.out.println(arEntero[2]);
        
        for(int i=0;i<5;i++)
        {
            //System.out.println(arEntero[i]);
            if(i%2!=0)
                System.out.println("POSICIONES IMPARES: "+arEntero[i]);
        }
       */
       
        // TODO code application logic here
    }
    
}
