package butcalisma;
import java.util.Iterator;
public class Staticuygulama {
	public static void main (String[]args) {
		Static1 a=new Static1();
		Static1 b=new Static1(5);
		Static1 b1=new Static1(6,7);
		Static1 b2=new Static1(5.0);
		Static1 b3=new Static1("basney");
		Static1 b4=new Static1("basney",3);
		Static1 b5=new Static1(4,"basney");

	}
	public Staticuygulama(){
	int x=49;
	System.out.println(x);
}
	public void finalize() {
	System.gc();
}
  
}


class Static1{
	int a=0;
	int b=0;
	String ad;
	public Static1(){
	int x=55;
	System.out.println("normal kurucu");
	System.out.println(x);
	System.out.println("----------------");
}
	Static1(int a){
		this();
		this.a=a;
		System.out.println("int kurucu");
		System.out.println(this.a=a);
		System.out.println("----------------");
	}
	Static1(int a,int b){
		this(5);
		System.out.println("int int kurucu");
		System.out.println(this.a=a);
		System.out.println(this.b=b);
		System.out.println("----------------");
	}
	Static1(double a){
		this(6,7);
		System.out.println("double kurucu");
		System.out.println(this.a=(int)a);
		System.out.println("----------------");
	}
	Static1(String ad){
		this(4.0);
		this.ad="Ney";
		System.out.println("string kurucu");
		System.out.println(this.a=a);
		System.out.println(this.ad=ad);
		System.out.println(ad);
		System.out.println("----------------");
	}
	Static1(String ad,int a){
		this("aa1");
		this.ad="Ney2";
		this.a=a;
		this.ad=ad;
		System.out.println("string int kurucu");
		System.out.println(this.a=a);
		System.out.println(this.ad=ad);
		System.out.println(ad);
		System.out.println("----------------");
	}
	Static1(int a,String ad){
		this("aa2",9);
		this.a=a;
		this.ad="ney3";
		this.ad=ad;
		System.out.println("int string kurucu");
		System.out.println(this.a=a);
		System.out.println(this.ad=ad);
		System.out.println(ad);
		System.out.println("----------------");
	}
	public void finalize() {
	System.gc();
	System.out.println("Yikici tetiklendi...");
}
}