package day2;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		double d = 39.909;
		String s = "Hello";
		boolean b = true;
		float f = (float) 0.3;
		
		char c = 'h';
		
		System.out.println(a);
		System.out.println(d);
		System.out.println(s);
		System.out.println(f);
		System.out.println(b);
		
		System.out.println("sum :" +(a+d));
		System.out.println("dif :" +(a-d));
		System.out.println("div :" +(a/d));
		System.out.println("mul :" +(a*d));
		System.out.println("rem :" +(a%d));
		
		System.out.println("== :" +(a==d));
		System.out.println(" < :" +(a<d));
		System.out.println(" > :" +(a>d));
		System.out.println("<= :" +(a<=d));
		System.out.println(">= :" +(a>=d));
		System.out.println("!= :" +(a!=d));
		
		boolean aa = true;
		boolean dd = false;
		
		System.out.println("&& :" +(aa && dd));
		System.out.println("|| :" +(aa || dd));
		System.out.println(" ! :" +(!aa));
		
		a = 20;
		System.out.println("sum :" +(a++));
		System.out.println("sum :" +(a));
		System.out.println("sum :" +(++a));
		System.out.println("sum :" +(a));
		
		a = 40;
		System.out.println("sum :" +(a--));
		System.out.println("sum :" +(a));
		System.out.println("sum :" +(--a));
		System.out.println("sum :" +(a));
		
		System.out.println(s+c);
		System.out.println(s+s);
		System.out.println(c+c);
		System.out.println(c);
		
	}

}
