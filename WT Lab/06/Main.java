class First{
	First(){System.out.println("c");}
}

class Second extends First{
	Second(){System.out.println("b");}
}

class Third extends Second{
	Third(){System.out.println("a");}
}

public class Main{
	public static void main(String[] args){
		Third c = new Third();
	}
}
