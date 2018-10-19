package com.company;

import java.util.Scanner;

class Location{
    public int row,column;
    public double maxValue;
    public static Location locateLargest(double[][] a){
        Location location = new Location();
        location.maxValue = a[0][0];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j] > location.maxValue) {
                    location.maxValue = a[i][j];
                    location.row = i + 1;
                    location.column = j + 1;
                }
            }
        }
        return location;
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and column in the array:");
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        double[][] a;
        a = new double[row][column];
        System.out.println("Enter the array:");
        for(int i = 0; i < row;i++){
            for(int j = 0; j < column; j++){
                a[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Print array:");
        for(int i = 0; i<row;i++){
            for(int j = 0; j< column; j++){
                System.out.print("\t"+a[i][j]+"\t");
            }
            System.out.println();
        }
        Location location = Location.locateLargest(a);
        System.out.println("The location of the largest element is "+location.maxValue+"at("+location.row+","+location.column+")");
    }
}
