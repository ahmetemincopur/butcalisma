package butcalisma;
import java.util.Scanner;
public class fonksiyonislemleri 
{
	public static void main(String[]args) 
	{
		swcs(2,5);
	}
		
	public static void swcs(double y,double b) 
		{
			Scanner z=new Scanner(System.in);
			String i=z.next();
			int c=1;
			double sonuc = 0;
			
			switch(i)
			{
				case "Topla":
					sonuc=y+b;
					System.out.println("Toplama işlemi");
					break;
				case "Cikar":
					sonuc=y-b;
					System.out.println("Cikarma işlemi");
					break;
				case "Carp":
					sonuc=y*b;
					System.out.println("Carpma işlemi");
					break;
				case "Bolme":
					sonuc=y/b;
					System.out.println("Bolme işlemi");
					break;
				case "Us-alma":
					sonuc=Math.pow(y, b);
					System.out.println("Us alma işlemi");
					break;
				case "Ussun-ussu-alma":
					sonuc=Math.pow(y, Math.pow(b, 2));
					System.out.println("Ussun ussu alma işlemi");
					break;
				case "Mutlak-deger-alma":
					sonuc=Math.abs(sonuc);
					System.out.println("Mutlak değer alma işlemi");
					break;
				case "Radyana-cevir":
					sonuc=Math.toRadians(b);
					System.out.println("Radyana cevirme işlemi");
					break;
				case "Sinus-al":
					sonuc=Math.sin(Math.toRadians(b));
					System.out.println("Sinus alma işlemi");
					break;
				case "Cosinus-al":
					sonuc=Math.cos(Math.toRadians(b));
					System.out.println("Cosinus alma işlemi");
					break;
				case "Tanjant-al":
					sonuc=Math.tan(Math.toRadians(b));
					System.out.println("Tanjant alma işlemi");
					break;
				case "Cotanjant-al":
					sonuc=1/Math.tan(Math.toRadians(b));
					System.out.println("Cotanjant alma işlemi");
					break;
				case "Kok-al":
					sonuc=Math.sqrt(b);
					System.out.println("Kokunu alma işlemi");
					break;
				default:
					System.out.println("İşlem anlaşılamadı");
					break;
			
			}
			System.out.println(sonuc);
	}
}