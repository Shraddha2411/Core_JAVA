package Known;

public class ArrayRoatationLeft {
	
		
		public static void main(String[] args)
		{
			int[] arr=new int[] {10,20,30,40,50};
			int n=1;
			System.out.println("Array elements before right rotation......");
			for(int a:arr)
			{
				System.out.print(a+" ");
			}
			System.out.println("rotating array 1 time");
			
			for(int i=0;i<n;i++)
			{
				int j,first;
				first=arr[0];
				first=arr[arr.length-1];
				for(j=0;j<arr.length-1;j++)
				{
					arr[j]=arr[j+1];
				}
				
			}
			
			System.out.println("-----------------");
			System.out.println("Array elements after left rotation......");
			for(int a:arr)
			{
				System.out.print(a+" ");
			}

		}
}




	
