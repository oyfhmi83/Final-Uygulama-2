﻿Parametresiz Metotlar / Uygulama 5

package uygulama5;
import java.util.Scanner; //Kullanıcının girdiği değerleri okuyabilmek için util dahil ediyorum
public class Uygulama5 {
    public static void main(String[] args) {

String[] gunler={ "Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar" };
Scanner giris=new Scanner(System.in);   //Kullanıcının girdiği değerleri okuyabilmek için util dahil ediyorum
System.out.println("Hafta'nın gününü öğrenmek için bir sayı giriniz.. 1 ile 7 arasında"); //Günler değişkenini ekrana yazdırdım.
int sayiGir=giris.nextInt();

for (int i = 1; i < gunler.length+1; i++)  
{
  if(sayiGir==i) //
  {
    System.out.println(gunler[i-1]);
  }
          
}
}
