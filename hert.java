// Задача 1768
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int index = 0;
        StringBuilder str = new StringBuilder();
        while (index < word1.length() || index < word2.length()) {
            if (index < word1.length()) {
                str.append(word1.charAt(index));
            }

            if (index < word2.length()) {
                str.append(word2.charAt(index));
            }
            index += 1;
        }
        return str.toString();
    }
}

// // Задача 27
// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int copyInd = 0;
//        for(int i = 0; i < nums.length; i++) {
//            if(nums[i] != val) {
//                nums[copyInd] = nums[i];
//                copyInd += 1;
//            }
//        }
//        return copyInd;
//     }
// }

// // Задача 88
// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         n -= 1;
//         m -= 1;
//         int copyInd = nums1.length - 1;
//         while(n >= 0) {
//             if(m >= 0 && nums1[m] > nums2[n]) {
//                 nums1[copyInd] = nums1[m--];
//             }
//             else {
//                 nums1[copyInd] = nums2[n--];
//             }
//             copyInd -= 1;
//         }
//     }
// }