package zeroes;
/*
 * 8. Write a method named binaryZeros that accepts an integer n as a parameter and returns the number of
zeros that occur in the binary representation of n. For example, the call of binaryZeros(44) returns 3 because
the binary representation of 44 is 101100, which contains three zeros. You may assume that n is non-
negative.
 */

public class Zeroes {

public int	tobinaryZeroes(int n)
{
	int i=2;
	int rem,div;
	int count=0;
	while(n!=0)
	{
	rem=n%i;
	if(rem==0)
	{
		count++;
	}
	div=n/i;
	n=div;
	}
	return count;
}
}
