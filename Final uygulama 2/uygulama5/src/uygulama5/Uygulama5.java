Parametresiz Metotlar / Uygulama 5

package uygulama5;
import java.util.Scanner; 
public class Uygulama5 {
    public static void main(String[] args) {

String[] gunler={ "Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar" };
Scanner giris=new Scanner(System.in);  
System.out.println("Hafta'nın gününü öğrenmek için bir sayı giriniz.. 1 ile 7 arasında"); 
int sayiGir=giris.nextInt();

for (int i = 1; i < gunler.length+1; i++)  
{
  if(sayiGir==i) //
  {
    System.out.println(gunler[i-1]);
  }
          
}
}
