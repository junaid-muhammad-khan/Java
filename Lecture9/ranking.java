class ranking
{
   public static void main(String[] args)
   {
	    int a[]={35,25,56,78,43,66,71,73,80,90,0,73,35,65,100,78,80,85,35,50};
		int i,rank, Num = 20;
		int [] histo = new int[11];
		
		for (i=0;i<=10;i++)
		histo[i]=0;
		
		for (i=0;i<Num;i++){
		rank=a[i]/10;     
		
		if (0<=rank && rank<=10)
		   histo[rank]++;
		}
		
		for (i=0;i<=10;i++){
			System.out.println(i*10 + ":" + histo[i]);
		}
			   
	   
   }
   
}