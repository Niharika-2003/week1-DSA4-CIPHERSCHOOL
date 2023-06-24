/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    public static int fact(int n) {
    if(n== 1 || n == 0) {
    return 1;
    } 
    int recursionAns = fact(n - 1); //1
    int biggerProblemAns = recursionAns * n; //1
    return biggerProblemAns;
  }

	public static void main(String[] args) {
		System.out.println(fact(5));
	}
}
