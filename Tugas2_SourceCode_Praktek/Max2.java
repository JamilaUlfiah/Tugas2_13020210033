/*Nama : Jamila Ulfiah*/
/*NIM  : 13020210033*/
/*Hari/Tanggal : Kamis/23-03-2023*/
/*Waktu : 20.59*/

import java.util.Scanner;
/* Maksimum dua bilangan yang dibaca */
public class Max2 {
/**
* @param args
*/
public static void main(String[] args) {
	// TODO Auto-generated method stub
	/* Kamus */
	int a, b;
	Scanner masukan=new Scanner(System.in);
	/* Program */
	System.out.print ("Maksimum dua bilangan : \n"); 
	System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN :\n");
	a=masukan.nextInt(); 
	b=masukan.nextInt();
	System.out.println ("Ke dua bilangan : a = "+ a+" b = "+b);
	if (a >= b){
		System.out.println ("Nilai a yang maksimum "+ a);
	}else /* a > b */{
		System.out.println ("Nilai b yang maksimum: "+ b);
		}
	}
}