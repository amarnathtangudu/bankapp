class PrimeNumbers{
	public static void main(String args[]){
		int count=1,num=2;
		while(count<=25){
			int flag=0;
			for(int i=2;i<=num/2;i++){
				if(num%i==0)
					flag=1;
			}
			if(flag==0){
				System.out.println(num);
				count++;
			}
		num++;	
		}
	}
}