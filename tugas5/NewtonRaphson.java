/*
* Perhitungan akar metode newton raphson
* Cut Nurhidayanti nim 2008107010027
* link you tube : https://youtu.be/mUqzUEXf83o
* link git hub  : https://github.com/cutnurhidayanti/Lab-KomNum/tree/main/tugas5
**/

import java.lang.Math;

public class NewtonRaphson {

    public static double fungsiFx(double x){//fungsi untuk mencari nilai f(x)
        double fx;
        fx = (4*Math.pow(x, 3))-(15*Math.pow(x, 2))+(17*x)-6;//soal 1
        // fx = Math.pow(x, 3)-(2*Math.pow(x, 2))+(3*x)-6;//soal nomor 2
        // fx = Math.pow(x, 5)+(2*Math.pow(x, 2))-4;//soal nomor 3
        return fx;
    }
    
    public static double fungsiFax(double x){//fungsi untuk mencari nilai f'(x)
        double fax;
        fax = (12*Math.pow(x, 2))-(30*x)+17;//soal 1
        // fax = (3*Math.pow(x, 2))-(4*x)+3;//untuk soal nomor 2
        // fax = (5*Math.pow(x, 4))+(4*x);//soal no 3
        return fax;
    }
    
    public static double fungsiXi(double fx, double fax, double x){//fungsi untuk mencari nilai xi
        double xi;
        xi = x-(fx/fax);
        return xi;
    }

    public static void DeskripsiSoal(){
        //definisikan fungsi f(x)
        System.out.println("f(x) = 4x^3-15x^2+17x-6 ");//soal no 1
        // System.out.println("f(x) = x^3-2x^2+3x-6 ");//soal no 2
        // System.out.println("f(x) = x^5+2x^2-4 ");//soal no 3

        //definisikan fungsi f'(x)
        System.out.println("f'(x) = 12x^2-30x+17");//soal no 1
        // System.out.println("f'(x) = 3x^2-4x+3");//soal no 2
        // System.out.println("f'(x) = 5x^4+4x");//soal no 3

        //tentukan toleransi e dan iterasi maksimun N
        System.out.println("nilai toleransi error = 0,001 \niterasi maksimum(N) = 10 \nx0 = 3");
    }

    public static void main(String[] args) {
        
        System.out.println("====Program perhitungan persamaan non linear metode Newton Raphson====");
        DeskripsiSoal();

        double fx, fax, akar, xi;
        double x = 3, e=0.001;//untuk soal no 1 & 2
        // double x = 1, e=0.001;//untuk soal no 3


        System.out.println("+---------------------------------------------------------------+");
        System.out.println("|\ti\tx\t\tfx\t\tfax\t\t|");
        System.out.println("+---------------------------------------------------------------+");

        for(int i = 0; i<10; i++){
            fx = fungsiFx(x);
            fax = fungsiFax(x);

            akar = x;
            
            //mencari nilai absolute f(x)
            if(fx<0){
                fx = -fx;
            }
            
            System.out.printf("|\t%d\t%f\t%f\t%f\t|", i, x, fx, fax);//print table

            xi = fungsiXi(fx, fax, x);
            x = xi;//menjadi nilai x untuk iterasi selanjutnya

            if(fx == 0){
                System.out.println("\n+---------------------------------------------------------------+");
                System.out.printf("Akar persamaan adalah %f pada iterasi %d\n",akar, i);
                break;
            }if(fx<=e || i>=10){
                System.out.println("\n+---------------------------------------------------------------+");
                System.out.printf("Akar persamaan adalah %f pada iterasi %d\n",akar, i);
                break;
            }
            System.out.println();
        }
        System.out.println();
        System.out.printf("============Terimakasih telah menggunakan program kami===========");

    }
}
