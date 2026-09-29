class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int l=0;
        int r=n-1;
        int [] ans={0,0};
        while(l<r){
          int s=numbers[l]+numbers[r];
                if(s==target){
                    ans[0]=l+1;
                    ans[1]=r+1;
                    return ans;
                }
                else if(s>target){
                    r--;
                }
                else{
                    l++;
                }
                
        }
            return ans;
        
    }
        
}
    
