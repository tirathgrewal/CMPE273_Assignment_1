import java.util.*;
public class BinSearch {
    public static <T extends Comparable<T>> boolean binarySearch(T[] array, T key){
    int low=0,mid;
    int high=array.length-1;
    while(low<=high)
    {
    	mid=(low+high)/2;
    	if((array[mid].compareTo(key))==0)
    	{
    		return true;
    	}
    	if(array[mid].compareTo(key)<0)
    	 {
                 low=mid + 1;
         }
         if(array[mid].compareTo(key)>0)
         {
            high=mid- 1;
         }
        }  
              return false;
  }
public static void main(String args[]){
		Integer[] array1={5,12,20,22,29,38,40,51,76};
		String[] array2={"a","bat","cat","dog", "elephant", "fish"};
		boolean ans1= binarySearch(array1,40);
		boolean ans2= binarySearch(array2,"dog");
		if(ans1)
		System.out.println("Element found in Integer array.");
		else
		System.out.println("Element not found in Integer array.");
		if(ans2)
		System.out.println("Element found in String array.");
		else
		System.out.println("Element not found in String array.");

	}

}