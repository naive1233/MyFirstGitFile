class Diaoyong{
	public static void main(String[] args ){//main方法
		A1.addb( 10,2);
		add( 121,2);
	}
	public static void add(int x ,int  y ){
		System.out.println(x+y);
	}
} 

class A1{
public static void main(String[] args ){//main方法
		addb( 121,2);
		Diaoyong.add( 1,2);
	}
	public static void addb(int x ,int  y ){
		System.out.println(x+y);
	}
}
