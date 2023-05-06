class subtract{
	private int x,y,z;
	subtract(int a,int b){
		x=a;
		y=b;
	}
	subtract(int a, int b, int c){
		x=a;
		y=b;
		z=c;
	}
	void print(){
		int res = x-y-z;
		System.out.println("The difference is "+ res);
	}
}

class Main_02{
	public static void main(String[] args) {
		subtract s1 = new subtract(5,2);
		subtract s2 = new subtract(7,1,2);
		s1.print();
		s2.print();
	}
}
