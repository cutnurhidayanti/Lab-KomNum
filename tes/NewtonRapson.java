package labKomNum;

import java.lang.Math;
import java.util.Scanner;

public class Yati {

    public static void Soal1(double x , double e){
        double fx, fax, akar, xi;
        System.out.println("f(x) = 4x^3-15x^2+17x-6 ");
        System.out.println("f'(x) = 12x^2-30x+17");
        System.out.println("x0 = "+x+ " dan error = "+e);

        System.out.println("\ti\tx\t\tf(x)\t\tf'(x)\t\t");

        for(int i = 0;i <10; i++ ){
            fx = (4*Math.pow(x, 3))-(15*Math.pow(x, 2))+(17*x)-6;
            fax = (12*Math.pow(x, 2))-(30*x)+17;

            akar = x;

            if(fx<0){
                fx = -fx;
            }
            
            xi = x - (fx/fax);

            System.out.printf("\t%d\t%f\t%f\t%f\t", i, x, fx, fax);//print table

            x = xi;//menjadi nilai x untuk iterasi selanjutnya

            if(fx == 0){
                System.out.printf("\nAkar persamaan adalah %f pada iterasi %d\n",akar, i);
                break;
            }if(fx<=e || i>= 10){
                System.out.printf("\nAkar persamaan adalah %f pada iterasi %d\n",akar, i);
                break;
            }
            System.out.println();

        }

    }
    
    public static void Soal2(double x , double e){
        double fx, fax, akar, xi;
        System.out.println("f(x) = x^3-2x^2+3x-6 ");
        System.out.println("f'(x) = 3x^2-4x+3");
        System.out.println("x0 = "+x+ " dan error = "+e);

        System.out.println("\ti\tx\t\tf(x)\t\tf'(x)\t\t");

        for(int i = 0;i <10; i++ ){
            fx = Math.pow(x, 3)-(2*Math.pow(x, 2))+(3*x)-6;
            fax = (3*Math.pow(x, 2))-(4*x)+3;

            akar = x;

            if(fx<0){
                fx = -fx;
            }
            
            xi = x - (fx/fax);

            System.out.printf("\t%d\t%f\t%f\t%f\t", i, x, fx, fax);//print table

            x = xi;//menjadi nilai x untuk iterasi selanjutnya

            if(fx == 0){
                System.out.printf("\nAkar persamaan adalah %f pada iterasi %d\n",akar, i);
                break;
            }if(fx<=e || i>= 10){
                System.out.printf("\nAkar persamaan adalah %f pada iterasi %d\n",akar, i);
                break;
            }
            System.out.println();

        }

    }
    
    public static void Soal3(double x , double e){
        double fx, fax, akar, xi;
        System.out.println("f(x) = x^5+2x^2-4 ");
        System.out.println("f'(x) = 5x^4+4x");
        System.out.println("x0 = "+x+ " dan error = "+e);

        System.out.println("\ti\tx\t\tf(x)\t\tf'(x)\t\t");

        for(int i = 0;i <10; i++ ){
            fx = Math.pow(x, 5)+(2*Math.pow(x, 2))-4;
            fax = (5*Math.pow(x, 4))+(4*x);

            akar = x;

            if(fx<0){
                fx = -fx;
            }
            
            xi = x - (fx/fax);

            System.out.printf("\t%d\t%f\t%f\t%f\t", i, x, fx, fax);//print table

            x = xi;//menjadi nilai x untuk iterasi selanjutnya

            if(fx == 0){
                System.out.printf("\nAkar persamaan adalah %f pada iterasi %d\n",akar, i);
                break;
            }if(fx<=e || i>= 10){
                System.out.printf("\nAkar persamaan adalah %f pada iterasi %d\n",akar, i);
                break;
            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        Scanner inputPilihan = new Scanner(System.in);
        Scanner Enter = new Scanner(System.in);
        int pilihan;

        do{
            System.out.println("menu : ");
            System.out.println("1. soal 1");
            System.out.println("2. soal 2");
            System.out.println("3. soal 3");
            System.out.println("4. exit");

            System.out.print("masukkan pilihan anda :");
            pilihan = inputPilihan.nextInt();            

            if(pilihan == 1){
                Soal1(3.0, 0.001);
                System.out.print("tekan enter untuk lanjut...");
                Enter.nextLine();
                continue;
            }if(pilihan == 2){
                Soal2(3.0, 0.001);
                System.out.print("tekan enter untuk lanjut...");
                Enter.nextLine();
                continue;
            }if(pilihan == 3){
                Soal3(1.0, 0.001);
                System.out.print("tekan enter untuk lanjut...");
                Enter.nextLine();
                continue;
            }if(pilihan == 4){
                break;
            }else{
                System.out.println("masukkan input yang benar berupa angka 1/2/3");
                System.out.print("tekan enter untuk lanjut...");
                Enter.nextLine();
                continue;
            }
        }while(true);

    }
}
