public class BubbleSort
{

	public static void main(String[] args)
  {
    int[] myNums = {12, 15, 0, 44, 13, 1, 2};

		int passes;
		int comparisons;
		int tempNum;

		for(int i: myNums)
			System.out.print(i + " ");

		passes=myNums.length-1;
		comparisons=myNums.length-1;
		//Loop once for each pass, where passes is one less than the number of items.
		while(passes>0)
		{
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
			for(int i = 0; i<comparisons;i++){
				//If they are out of order, swap the values
				if(myNums[i]>myNums[i+1]){

					tempNum = myNums[i];
					myNums[i]=myNums[i+1];
					myNums[i+1]=tempNum;
				}
				//End Loop for comparisons
			}

			//The next pass will use one less comparison
			comparisons--;
			passes--;
		}
		//End Loop for passes

		System.out.print("\n");

		for(int i: myNums)
		{
			System.out.print(i + " ");
		}

  }
}
