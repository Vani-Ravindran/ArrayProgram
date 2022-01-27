package Array;

public class ArrayMergerAndSort {

	public static void main(String[] args) {
		int arrOne[]= {1,3,5,7,8};
		int arrTwo[]= {2,4,6,9,10};
		int resultArray[]=merge(arrOne,arrTwo);
		for (int element: resultArray) {
            System.out.println(element);
        }
		
	}

	private static int[] merge(int[] arrOne, int[] arrTwo) {
		  int[] answer = new int[arrOne.length + arrTwo.length];
		    int i = arrOne.length - 1, j = arrTwo.length - 1, k = answer.length;

		    while (k > 0)
		        answer[--k] =
		                (j < 0 || (i >= 0 && arrOne[i] >= arrTwo[j])) ? arrOne[i--] : arrTwo[j--];
		    return answer;
		}
	}


