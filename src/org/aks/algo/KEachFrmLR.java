package org.aks.algo;

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
