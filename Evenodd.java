package practiceset1;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {1,2,3,4,5,6};
    System.out.println("odd number:");
    
    for(int i=0;i<arr.length;i++)
    {
    	if(arr[i]%2!=0)
    		System.out.println(arr[i] );
    }
    System.out.println("even number:");
    for(int i=0;i<arr.length;i++)
    {
    	if(arr[i]%2==0)
    	System.out.println(arr[i] );
    }
	}

}
