package butcalisma;
import java.util.Scanner;
public class girdialma {
	public static void main(String[]args) {
		Scanner a=new Scanner(System.in);
		//Import edilen class için nesne oluşturulur.
		int b=a.nextInt();
		//Nesne ile Scanner classından fonksiyonlar çalıştırılır.
		System.out.println("Integer Girdi: "+b);
		double c=a.nextDouble();
		System.out.println("Double Girdi: "+c);
		float d=a.nextFloat();
		System.out.println("Float Girdi: "+d);
		String f=a.next();
		System.out.println("String Girdi: "+f);
		long g=a.nextLong();
		System.out.println("Long Girdi: "+g);
		short y=a.nextShort();
		System.out.println("Short Girdi: "+y);
		boolean u=a.nextBoolean();
		System.out.println("Boolean Girdi: "+u);
	}

}
