import java.util.Scanner;

public class Main {
	public static void  main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		int row,column;
		System.out.println("May�n Tarlas� ");
		System.out.println(" Oynamak istedi�iniz boyutlar� giriniz!");
		System.out.print("Sat�r say�s�: ");
		row=scan.nextInt();
		System.out.print("S�t�n say�s�: ");
		column=scan.nextInt();
		
		MayinTarlasi mayin = new MayinTarlasi(row,column);
		mayin.run();//run metodu �al��t�r
	}

}
