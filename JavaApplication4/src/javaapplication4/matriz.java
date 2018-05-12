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
public class matriz {
    public static void main(String[] args) 
    {
        int[][] mat=new int [10][10];
        int n=1;
       /* for(int i=0;i<10;i++)
        {
            for(int j=0;j<=9-i;j++)
            {
                mat[i][j]=n;
                n++;
            }
            for(int k=i+1;k<=9-i;k++)
            {
                mat[k][9-i]=n;
                n++;
            }
            for(int x=8-i;x>=i;x--)
            {
                mat[9-i][x]=n;
                n++;
            }
            for(int y=8-i;y>=i+1;y--)
            {
                mat[y][i]=n;
                n++;
            }
        }
        for(int i=0;i<10;i++)
        {
            for(int m=0;m<10;m++)
            {
                System.out.print("\t"+mat[i][m]);
            }
            System.out.println("");
        } */  

       for(int x=0;x<=5;x++)
       {
           for(int y=x;y<=9-x;y++)
           {
               mat[x][y]=n;
               n++;
           }
       }
       
       for(int x=1;x<=5;x++)
       {
           for(int y=x;y<=9-x;y++)
           {
               mat[y][10-x]=n;
               n++;
           }
       }
       
       for(int i=0;i<10;i++)
       {
           for(int j=0;j<10;j++)
           {
               System.out.print("\t"+mat[i][j]);
           }
           System.out.println("");
       }
    } 
}
