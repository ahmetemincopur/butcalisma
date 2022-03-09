package butcalisma;

public class Kalitimuygulama2 {
	Kalitimuygulama2() {
		System.out.println(" kalitimuygulama2 kurucu");
	}
	public void islevsellik() {
		System.out.println("kalem turu secilmemis");
	}
}

class kursunkalem extends Kalitimuygulama2{
	kursunkalem(){
		System.out.println(" kursunkalem kurucu");
	}
	public void islevsellik() {
		System.out.println("yer cekimine ihtiyac yoktur");
	}
}

class dolmakalem extends Kalitimuygulama2{
	dolmakalem(){
		System.out.println(" dolmakalem kurucu");
	}
	@Override
	public void islevsellik(){
		System.out.println("yer cekimine ihtiyac vardir");
	}
}

class tukenmezkalem extends Kalitimuygulama2{
	tukenmezkalem(){
		System.out.println(" tukenmezkalem kurucu");
	}
	@Override
	public void islevsellik(){
		System.out.println("yer cekimine ihtiyac vardir*****");
	}
}