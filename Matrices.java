package practiceset1;

public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2},{4,6}};
		int b[][]= {{3,2},{6,8}};
	    int c[][]=new int [2][2];
	    for(int i=0;i<2;i++)
	    {
	    	for(int j=0;j<2;j++)
	    	{
	    		c[i][j]=a[i][j]+b[i][j];
	    		System.out.println(c[i][j]+"");
	    	}
	    	System.out.println();
	    	}
	    }
	}


