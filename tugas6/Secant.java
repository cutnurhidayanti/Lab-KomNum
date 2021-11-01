package labKomNum.tugas6;

import java.util.Scanner;;

public class Secant {

    public static void Soal1(double xAtas, double xBawah, double er){
        System.out.println("definikan fungsi : f(x) = x*exp(-x)+sin(2*x) ");
        System.out.printf("batas bawah : %f \nbatas atas : %f \niterasi = 10\n", xBawah, xAtas);
        double h, x_atas = xAtas, x_bawah = xBawah, x=0, fx = 0, x0 = 0,xs = 0, x1 = 0, xt = 0, fxt = 0, fx1, fxt1, y0 = 0 , y1 = 0, e = er;
        int n = 10;

        //untuk mencari nilai h
        h = (x_atas-x_bawah)/n;
        System.out.println("i\tx\tfx");

        for(int i = 0; i<=n; i++){

            x = x_bawah + i*h;
            fx = x*Math.pow(Math.exp(1), (-x))+Math.sin(2*x);
            System.out.printf("%d\t%.2f\t%f ",i, x, fx);
            System.out.println();

            if(fx == 0){
                x1 = x;
            }else if(i >= 1 && fx*fxt<0 ){
                fx1 = Math.abs(fx);
                fxt1 = Math.abs(fxt);
                if(fxt1<fx1){
                    x1 = x;
                    x0 = xt;
                }else{
                    x1 = xt;
                    x0 = x;
                }
            }

            xt = x;
            fxt= fx;
        }

        System.out.printf("nilai x0 : %.2f nilai x1 : %.2f" , x0, x1);
        double ys = 0, akar = 0, error = 0;
        System.out.println("\n\ni\tx0\t\ty0\t\te");

        for(int i = 0; i<=n; i++){

            y0 =  x0*Math.pow(Math.exp(1), (-x0))+Math.sin(2*x0);
            y1 =  x1*Math.pow(Math.exp(1), (-x1))+Math.sin(2*x1);
            error = Math.abs(y0-y1);

            if(i == 0){
                System.out.printf("%d\t%f\t%f", i,x0,y0);
                System.out.println();
            }
            System.out.printf("%d\t%f\t%f\t%f", i+1,x1,y1,error);

            xs = x1 - y1*(x1-x0)/(y1-y0);
            ys =  xs*Math.pow(Math.exp(1), (-xs))+Math.sin(2*xs);

            if(error<e && i>= 1){
                akar = x1;
                break;
            }
            
            x0 = x1;
            x1 =  xs;
            y0 = y1;
            y1 = ys;

            System.out.println();
        }
        System.out.printf("\nakarnya adalah : %.6f ",akar);
        System.out.println();
    }

    public static void Soal2(double xAtas, double xBawah, double er){
        System.out.println("definikan fungsi : f(x) = cos(x+1)+exp(-x+2) ");
        System.out.printf("batas bawah : %f \nbatas atas : %f \niterasi = 10\n", xBawah, xAtas);
        double h, x_atas = xAtas, x_bawah = xBawah, x=0, fx = 0, x0 = 0,xs = 0, x1 = 0, xt = 0, fxt = 0, fx1, fxt1, y0 = 0 , y1 = 0, e = er;
        int n = 10;

        //untuk mencari nilai h
        h = (x_atas-x_bawah)/n;
        System.out.println("i\tx\tfx");

        for(int i = 0; i<=n; i++){

            x = x_bawah + i*h;
            fx = Math.cos(x+1)+Math.pow(Math.exp(1), (-x+2));
            System.out.printf("%d\t%.2f\t%f ",i, x, fx);
            System.out.println();

            if(fx == 0){
                x1 = x;
            }else if(i >= 1 && fx*fxt<0 ){
                fx1 = Math.abs(fx);
                fxt1 = Math.abs(fxt);
                if(fxt1<fx1){
                    x1 = x;
                    x0 = xt;
                }else{
                    x1 = xt;
                    x0 = x;
                }
            }

            xt = x;
            fxt= fx;
        }

        System.out.printf("nilai x0 : %.2f nilai x1 : %.2f" , x0, x1);
        double ys = 0, akar = 0, error = 0;
        System.out.println("\n\ni\tx0\t\ty0\t\te");

        for(int i = 0; i<=n; i++){

            y0 = Math.cos(x0+1)+Math.pow(Math.exp(1), (-x0+2));
            y1 = Math.cos(x1+1)+Math.pow(Math.exp(1), (-x1+2));
            error = Math.abs(y0-y1);

            if(i == 0){
                System.out.printf("%d\t%f\t%f", i,x0,y0);
                System.out.println();
            }
            System.out.printf("%d\t%f\t%f\t%f", i+1,x1,y1,error);

            xs = x1 - y1*(x1-x0)/(y1-y0);
            ys = Math.cos(xs+1)+Math.pow(Math.exp(1), (-xs+2));

            if(error<e && i>= 1){
                akar = x1;
                break;
            }
            
            x0 = x1;
            x1 =  xs;
            y0 = y1;
            y1 = ys;

            System.out.println();
        }
        System.out.printf("\nakarnya adalah : %.6f ",akar);
        System.out.println();
    }

    public static void Soal3(double xAtas, double xBawah, double er){
        System.out.println("definikan fungsi : f(x) = x* exp(-x)+cos(2*x) ");
        System.out.printf("batas bawah : %f \nbatas atas : %f \niterasi = 10\n", xBawah, xAtas);
        double h, x_atas = xAtas, x_bawah = xBawah, x=0, fx = 0, x0 = 0,xs = 0, x1 = 0, xt = 0, fxt = 0, fx1, fxt1, y0 = 0 , y1 = 0, e = er;
        int n = 10;

        //untuk mencari nilai h
        h = (x_atas-x_bawah)/n;
        System.out.println("i\tx\tfx");

        for(int i = 0; i<=n; i++){

            x = x_bawah + i*h;
            fx = Math.cos(x)-Math.sin(x);
            System.out.printf("%d\t%.2f\t%f ",i, x, fx);
            System.out.println();

            if(fx == 0){
                x1 = x;
            }else if(i >= 1 && fx*fxt<0 ){
                fx1 = Math.abs(fx);
                fxt1 = Math.abs(fxt);
                if(fxt1<fx1){
                    x1 = xt;
                    x0 = x;
                }else{
                    x1 = x;
                    x0 = xt;
                }
            }
            
            xt = x;
            fxt= fx;
        }

        System.out.printf("nilai x0 : %.2f nilai x1 : %.2f" , x0, x1);
        double ys = 0, akar = 0, error = 0;
        System.out.println("\n\ni\tx0\t\ty0\t\te");

        for(int i = 0; i<=n; i++){

            y0 = Math.cos(x0)-Math.sin(x0);
            y1 = Math.cos(x1)-Math.sin(x1);
            error = Math.abs(y0-y1);

            if(i == 0){
                System.out.printf("%d\t%f\t%f", i,x0,y0);
                System.out.println();
            }
            System.out.printf("%d\t%f\t%f\t%f", i+1,x1,y1,error);

            xs = x1 - y1*(x1-x0)/(y1-y0);
            ys = Math.cos(xs)-Math.sin(xs);

            if(error<e && i>= 1){
                akar = x1;
                break;
            }
            
            x0 = x1;
            x1 =  xs;
            y0 = y1;
            y1 = ys;

            System.out.println();
        }
        System.out.printf("\nakarnya adalah : %.6f ",akar);
        System.out.println();
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
                Soal1(2.4, 1, 0.002);
                System.out.print("tekan enter untuk lanjut...");
                Enter.nextLine();
                continue;
            }if(pilihan == 2){
                Soal2(3.0,1.0, 0.001);
                System.out.print("tekan enter untuk lanjut...");
                Enter.nextLine();
                continue;
            }if(pilihan == 3){
                Soal3(2.0, 0.0, 0.001);
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
