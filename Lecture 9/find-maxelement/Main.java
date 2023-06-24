/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
   public static int findMaximum(int []arr, int index) {
          if(index < 0) {
          return Integer.MIN_VALUE;
         }
         int temp = findMaximum(arr,index - 1);
         int max = Math.max (temp, arr[index]);
         return max;
}


public static void main(String[] args) 
{
    int arr [] = {5,2,17, 13, 12, 15};
    System.out.println(findMaximum(arr,arr.length - 1));
	
		
	}
}
