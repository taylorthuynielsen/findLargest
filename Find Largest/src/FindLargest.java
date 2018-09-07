
public class FindLargest
	{

		public static void main(String[] args)
			{
				int [] myArray = {4, 2, 5, 8, 7, 10};
				int largest = myArray[0];
				for(int i=0; i<myArray.length; i++)
					{
						if(myArray[i]>largest)
							{
								largest = myArray[i];
							}
					}
				
				System.out.println(largest);

			}

	}
