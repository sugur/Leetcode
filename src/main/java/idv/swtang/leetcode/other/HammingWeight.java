package idv.swtang.leetcode.other;

public class HammingWeight {

	 public int hammingWeight(int n) {
		 System.out.println("Your test case: A: "+ n);
		    int bits = 0;
		    int mask = 1;
		    for (int i = 0; i < 32; i++) {
		        if ((n & mask) != 0) {
		            bits++;
		        }
		        mask <<= 1;
		    }
		    System.out.println("Returned value::"+ bits);
		    return bits;
	 }
}
