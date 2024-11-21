package org.aks.algo;
/**
 * 
 * 
You are given a string s consisting of the characters 'a', 'b', and 'c' and a non-negative integer k. Each minute, you may take either the leftmost character of s, or the rightmost character of s.

Return the minimum number of minutes needed for you to take at least k of each character, or return -1 if it is not possible to take k of each character.

 

Example 1:

Input: s = "aabaaaacaabc", k = 2
Output: 8
Explanation: 
Take three characters from the left of s. You now have two 'a' characters, and one 'b' character.
Take five characters from the right of s. You now have four 'a' characters, two 'b' characters, and two 'c' characters.
A total of 3 + 5 = 8 minutes is needed.
It can be proven that 8 is the minimum number of minutes needed.
Example 2:

Input: s = "a", k = 1
Output: -1
Explanation: It is not possible to take one 'b' or 'c' so return -1.
 

Constraints:

1 <= s.length <= 105
s consists of only the letters 'a', 'b', and 'c'.
0 <= k <= s.length
 * 
 */
public class KEachFrmLR {

    public static void main(String[] args) {
        KEachFrmLR ins = new KEachFrmLR();
        int k=2; String s = "aabaaaacaabc";
        System.out.println("input :"+s+":"+k);
        System.out.println("expected ans 8");
        System.out.println("actual ans "+ins.takeCharacters(s,k));
        System.out.println("========================================================");
        
        s="a";
        k=1;
        System.out.println("input :"+s+":"+k);
        System.out.println("expected ans -1");
        System.out.println("actual ans "+ins.takeCharacters(s,k));
        System.out.println("========================================================");
        
        s="a";
        k=0;
        System.out.println("input :"+s+":"+k);
        System.out.println("expected ans 0");
        System.out.println("actual ans "+ins.takeCharacters(s,k));
        System.out.println("========================================================");
        
    }

    public int takeCharacters(String s, int k) {
        int arr[] = {0,0,0};
        for(char ch : s.toCharArray()){
            arr[(int)(ch-'a')]++;
        }

        if(!isValid(arr,k) )  {
            return -1;
        }

        int l=0,r=0;
        int res = Integer.MAX_VALUE;

        for(;r<s.length();r++){
            arr[(int)(s.charAt(r)-'a')]-=1;

            while(isValid(arr,k)==false){
                arr[(int)(s.charAt(l)-'a')]+=1;
                l++;
            }
            res = Math.min(res,s.length()-(r-l+1));
        }
        return res;
    }

    private boolean isValid(int arr[], int k){
        if(k==0) return true;
        return (arr[0]>=k && arr[1]>=k && arr[2]>=k);
    }
}
