package com.projectEuler;
/* The prime factors of 13195 are 5, 7, 13 and 29.
   What is the largest prime factor of the number 600851475143?
*/
 public class LargestPrimeFactor{
 public static void main(String[] args) {
 long largestPrimeFactor=600851475143l;
 for(int i=2;i<=Math.sqrt(largestPrimeFactor);i++){
	 if(largestPrimeFactor%i==0){
		 largestPrimeFactor=largestPrimeFactor/i;
		 System.out.println(largestPrimeFactor);
		 i--;
	 }
 }
	 if(largestPrimeFactor>=2)
		 System.out.println("Largest prime factore "+largestPrimeFactor);
	 }
}
