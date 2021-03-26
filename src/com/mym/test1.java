package com.mym;

public class test1 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        y+=z--%++x;  //y = y + z-- % ++x;   y = y + 3 % 2
        y+=1;  //y = y + 1;
        y+=4;  //y = y + 4
        System.out.println(y);


    }

   /* public static void main(String args[])
    {
            byte b=100;
            int i=b;
            int a=2000;
            b=(byte)a;
            System.out.println(b);
}*/
 }


