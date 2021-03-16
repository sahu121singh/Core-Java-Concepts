package day7;

class Bank{
	double RateOfInterest(){
		return 0;
	}
}

class SBI extends Bank{
	double RateOfInterest(){       // override Bank
		return 1.5;
	}
}

class Axis extends Bank{
	double RateOfInterest(){           // override Bank
		return 2.5;
	}
}

class ICICI extends SBI{
	double RateOfInterest(){        // override SBI
		return 4.5;
	}
}

public class Method_Overriding {
	public static void main(String args[]) {
		
		Bank b = new Bank();
		System.out.println(b.RateOfInterest());
		
		Axis a = new Axis();
		System.out.println(a.RateOfInterest());
		
		SBI s = new SBI();
		System.out.println(s.RateOfInterest());
		
		ICICI i = new ICICI();
		System.out.println(i.RateOfInterest());
	}

}
