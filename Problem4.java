
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Problem4 {
	public static String problemFourA(String s) {
		char[] array = s.toCharArray();
		String reverse = "";
		for (int i = array.length-1; i >= 0; i--) {
			reverse += String.valueOf(array[i]);
		}
		return reverse;
	}

	public static Set<Set<Integer>> problemFourB(int[][] array, int value){
		Set<Set<Integer>> set=new HashSet();
		int[] arr=new int[array.length*array[0].length];
		for(int i=0;i<array.length;i++) {
		for(int j=0; j<array.length; j++) {
		arr[i]=array[i][j];
		}
		}
		for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
		if(arr[i]+arr[j]==value) {
		Set<Integer> intset=new HashSet();
		intset.add(arr[i]);
		intset.add(arr[j]);
		set.add(intset);
				}
			}
		}
		return set;
	}

	public static int problemFourC(int value) {
		int count = 0;
		int prev = Integer.MAX_VALUE;
		SortedSet<Integer> set = new TreeSet<Integer>();
		// generates all possible number of form in sorted form
		for (int j = 0; j <= value; j++) {
			for (int i = 0; i <= value; i++) {
				for (int k = 0; k <= value; k++) {
					int result = (int) (Math.pow(9, i) * Math.pow(15, j) * Math.pow(7, k));
					set.add(result);
				}
			}
		}
		// return nth smallest number of the form specified
		return set.toArray(new Integer[set.size()])[value];
	}
public static void main(String[] args) {
	String a = "What the?";
	System.out.println(problemFourA(a));
	int apple[][] = {{1,2},{3,4}};
	System.out.println(problemFourB(apple,5));
	System.out.println(problemFourC(1));
}
}

