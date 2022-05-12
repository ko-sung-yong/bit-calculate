package math;

public class polynomial {

	public static void main(String[] args) {
	
		int Gfunction[]=new int[8];		 
		int Barray[]=new int[8];
		int sum[]=new int[8];	
		int i;
		for(i=7;i>=0;i--) {
			Gfunction[i]=(int)(Math.random()*2)+0;
			Barray[i]=(int)(Math.random()*2)+0;
			if(Gfunction[i]==1) {System.out.print("+"+"X^"+i+"\t");}			
			sum[i]=(Gfunction[i]^Barray[i]);
			
		}
		System.out.println();

		
		
		for(i=7;i>=0;i--) {
			if(Barray[i]==1) {System.out.print("+"+"X^"+i+"\t ");}		
			
		}		
		System.out.println();
		
		System.out.print("G(x):\t ");
		for(i=7;i>=0;i--) {
			System.out.print(Gfunction[i]);			
			
		}
		System.out.println();
		System.out.print("h(x): \t");
		for(i=7;i>=0;i--) {
			System.out.print(Barray[i]);			
			
		}
		System.out.println();
		
		System.out.print("덧셈 f(X)의 값은? ");		
		
		for(i=7;i>=0;i--) {
	 
		System.out.print(sum[i]);			
			
		}
		System.out.println();
		
		int a1[]=new int[8];
		int b1[]=new int[8];
		int c1[]=new int[8];
		int d1[]=new int[8];
		int e1[]=new int[8];
		int f1[]=new int[8];
		int g1[]=new int[8];
		
		int modular[]= {0,0,0,1,1,0,1,1};
		
		if(Gfunction[7]==0)
		{
			for(i=7;i>=1;i--) {
				a1[i]=Gfunction[i-1];
			}
			a1[0]=0;
		}
		else if(Gfunction[7]==1) {
			for(i=7;i>=1;i--) {
				a1[i]=Gfunction[i-1];
				
			}
			a1[0]=0;
			for(i=7;i>=0;i--) {
				a1[i]=(a1[i]^modular[i]);	
			}
			
		}
		if(Gfunction[7]==0)
		{
			for(i=7;i>=1;i--) {
				b1[i]=a1[i-1];
			}
			b1[0]=0;
		}
		else if(Gfunction[7]==1) {
			for(i=7;i>=1;i--) {
				b1[i]=a1[i-1];
				
			}
			b1[0]=0;
			for(i=7;i>=0;i--) {
				b1[i]=(b1[i]^modular[i]);	
			}
			
		}
			
		if(Gfunction[7]==0)
		{
			for(i=7;i>=1;i--) {
				c1[i]=b1[i-1];
			}
			c1[0]=0;
		}
		else if(Gfunction[7]==1) {
			for(i=7;i>=1;i--) {
				c1[i]=b1[i-1];
				
			}
			c1[0]=0;
			for(i=7;i>=0;i--) {
				c1[i]=(c1[i]^modular[i]);	
			}
			
		}
		if(Gfunction[7]==0)
		{
			for(i=7;i>=1;i--) {
				d1[i]=c1[i-1];
			}
			d1[0]=0;
		}
		else if(Gfunction[7]==1) {
			for(i=7;i>=1;i--) {
				d1[i]=c1[i-1];
				
			}
			d1[0]=0;
			for(i=7;i>=0;i--) {
				d1[i]=(d1[i]^modular[i]);	
			}
			
		}
		
		if(Gfunction[7]==0)
		{
			for(i=7;i>=1;i--) {
				e1[i]=d1[i-1];
			}
			e1[0]=0;
		}
		else if(Gfunction[7]==1) {
			for(i=7;i>=1;i--) {
				e1[i]=d1[i-1];
				
			}
			e1[0]=0;
			for(i=7;i>=0;i--) {
				e1[i]=(e1[i]^modular[i]);	
			}
			
		}
		
		if(Gfunction[7]==0)
		{
			for(i=7;i>=1;i--) {
				f1[i]=e1[i-1];
			}
			f1[0]=0;
		}
		else if(Gfunction[7]==1) {
			for(i=7;i>=1;i--) {
				f1[i]=e1[i-1];
				
			}
			f1[0]=0;
			for(i=7;i>=0;i--) {
				f1[i]=(f1[i]^modular[i]);	
			}
			
		}
		
		if(Gfunction[7]==0)
		{
			for(i=7;i>=1;i--) {
				g1[i]=f1[i-1];
			}
			g1[0]=0;
		}
		else if(Gfunction[7]==1) {
			for(i=7;i>=1;i--) {
				g1[i]=f1[i-1];
				
			}
			g1[0]=0;
			for(i=7;i>=0;i--) {
				g1[i]=(g1[i]^modular[i]);	
			}
			
		}		
		
		
		System.out.print("곱셈 F(x)의 결과는:");
	
		for(i=7;i>=0;i--) {
			
			
				if(Barray[7]==1) {
					g1[i]=Barray[7];
				}
				
				if(Barray[6]==1) {
					
					f1[i]=Barray[6];
				}
			
				
				if(Barray[5]==1) {
					e1[i]=Barray[5];
				}
				
				
				if(Barray[4]==1) {
					d1[i]=Barray[4];
				}
			
				if(Barray[3]==1) {
					c1[i]=Barray[3];				
				}
			
				if(Barray[2]==1) {					
					b1[i]=Barray[2];
				}
				
				if(Barray[1]==1) {
					a1[i]=Barray[1];			
				}
			
			
				System.out.print(a1[i]^b1[i]^c1[i]^d1[i]^e1[i]^f1[i]^g1[i]);
			
				
			
		}
	
			
	

			
			
			
			
		
		
		
		
		
		
		}
	
				

	}


