package idv.swtang.leetcode.greedy;

import java.util.Arrays;

public class StrWithout3a3b {

	public String strWithout3a3b(int A, int B) {
		
		 System.out.println("Your test case: A: "+ A +", B"+ B);
        StringBuilder ans = new StringBuilder();

        while (A > 0 || B > 0) {
            boolean writeA = false;
            int L = ans.length();
            if (L >= 2 && ans.charAt(L-1) == ans.charAt(L-2)) {
                if (ans.charAt(L-1) == 'b')
                    writeA = true;
            } else {
                if (A >= B)
                    writeA = true;
            }

            if (writeA) {
                A--;
                ans.append('a');
            } else {
                B--;
                ans.append('b');
            }
        }
        System.out.println("Returned value::"+ ans.toString());
        return ans.toString();
    }
}
