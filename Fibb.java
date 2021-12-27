class Fibb{
	public static void main(String[] args){
	
	int s1=0;
	int s2=1;
	int n=10;
	System.out.println("Fibonacci series upto"  + n +  "trems");
	for(int i=2;i<n;i++){
	System.out.println(s1);
	int sn = s1 + s2;
	s1 = s2;
	s2 = sn;
	
	}

	}
}

	