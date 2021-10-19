package labKomNum.tugas1;

public class Biseksi {
    public static void main(String[] args) {
        System.out.println("===Program perhitungan persamaan non linear metode biseksi===");

        //definisikan fungsi f(x)
        System.out.println("f(x) = x^3-8x+3");

        //tentukan nilai a dan b
        System.out.println("batas bawah(a) = 2.4 \nbatas atas(b) = 2.7");

        //tentukan toleransi e dan iterasi maksimun N
        System.out.println("nilai toleransi error = 0,02 \niterasi maksimum(N) = 5");
        
        double a = -2, b = 3, c, fa, fat, fb, fbt, xr, fxr, at,bt, akar, e=0.05;
        
        System.out.println("i\t a\t\t  b\t\t  f(a)\t\t f(b)\t\t f(a).F(b)>0\t xr\t\t f(xr)\t\t f(xr).f(a) <0\t |b-a|<e||i>N");

        for(int i =0; i<=5; i++){
            fa = a*a*a-8*a+3;
            fb = b*b*b-8*b+3;

            at=a;
            bt=b;
            fat =fa;
            fbt = fb;

            System.out.printf("%d\t %f\t %f\t %f\t %f\t " , i+1, at, bt, fa, fb);
            
            if(fa*fb>0){
                System.out.println("\npersaamaan tidak memiliki akar");
                break;
            }else{//kerika persamaan memiliki akar
                xr = (a+b)/2;
                fxr = xr*xr*xr-10*xr+8;

                if(fxr*fa<0){//ketika nilai f(xr)*fa<0
                    b=xr;
                    fb=fxr;
                }else{//ketika nilai f(xr)*fa>0
                    a=xr;
                    fa=fxr;
                }
                
                //program untuk mencari |b-a|
                if((bt-at)>0){
                    c = bt-at;
                }else{
                    c= at-bt;
                }
                
                System.out.printf("%f\t %f\t %f\t %f\t %f", fat*fbt, xr, fxr, fxr*fat, c);
                
                //ketika nilai dari |b-a|<e atau iterasi > 5
                if(c<e ||i>5){
                    akar = xr;
                    System.out.println();
                    System.out.println("akarnya adalah = " +akar);
                    break;
                }
            }

            System.out.println();
        }

    }
}
