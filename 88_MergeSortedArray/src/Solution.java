public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=0; i<n; i++){
            if (m == 0){
                for (int k=0; k<n; k++){
                    nums1[k]=nums2[k];
                }
            }
            else{
                int count = 0;
                for (int j=0; j<m+i; j++){
                    if (nums2[i]>nums1[j]){
                        count ++;
                    }
                }
                for (int k=m+n-1; k>=count; k--){
                    nums1[k] = nums1[k-1];
                }
                nums1[count] = nums2[i];
            }
        }
    }
}

//一位一位比，比完后，比多少个数大，就放在哪，index就是多少