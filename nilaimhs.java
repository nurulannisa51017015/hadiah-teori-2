/**
 * @(#)nilaimhs.java
 *
 *
 * @author 
 * @version 1.00 2019/10/2
 */


import java.util.Scanner;
public class nilaimhs
{
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		char nilaihuruf;
		String nama;
		double nilaitgs1,nilaitgs2,nilaitgs3,nilaimid,nilaifinal;
		double nilairata2tgs;
		double nilaiakhir;
		
		System.out.print("masukkan nama         : ");
		nama=in.nextLine();
		System.out.print("masukkan nilai tugas 1: ");
		nilaitgs1=in.nextInt();
		System.out.print("masukkan nilai tugas 2: ");
		nilaitgs2=in.nextInt();
		System.out.print("masukkan nilai tugas 3: ");
		nilaitgs3=in.nextInt();
		System.out.print("masukkan nilai mid    : ");
		nilaimid=in.nextInt();
		System.out.print("masukkan nilai final  : ");
		nilaifinal=in.nextInt();
		System.out.println();
		
		nilairata2tgs=(nilaitgs1+nilaitgs2+nilaitgs3)/3;
		nilaiakhir=(nilairata2tgs*0.3)+(nilaimid*0.3)+(nilaifinal*0.4);
		
		if(nilaiakhir>=80)
		{
			nilaihuruf='A';
		}
		else if(nilaiakhir>=60 && nilaiakhir<=79.9)
		{
			nilaihuruf='B';
		}
		else if(nilaiakhir>=50 && nilaiakhir<=59.9)
		{
			nilaihuruf='C';	
		}
		else if(nilaiakhir>=40 && nilaiakhir<=49.9)
		{
			nilaihuruf='D';
		}
		else
		{
			nilaihuruf='E' ;
		}
		
		System.out.println("nama       : "+nama);
		System.out.println("nilai akhir: "+nilaiakhir);
		System.out.println("nilai huruf: "+nilaihuruf);
	
	
		
		
		
	}
}