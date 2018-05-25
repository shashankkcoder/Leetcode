// class Solution {
//     public char nextGreatestLetter(char[] letters, char target) {
//         int nextGreatest = 36;
//         int targetIntValue = Character.getNumericValue(target);
//         for(int CurrentChar =0; Currentchar < letters.length ; Currentchar++) {
//             int tempValue1 = Character.getNumericValue(ch1); 
//             if( tempValue1< targetIntValue) {
//                 int temp = 26 - targetIntValue  + tempValue1;
//                 if(temp < nextGreatest){nextGreatest=tempValue1;}
//             }else {
//                 int temp = tempValue1 - targetIntValue;
//                 if( temp < nextGreatest) {nextGreatest = tempValue1 ;}
//             }
//         }
//         return ((char)(nextGreatest-38+'0'));
//     }
// }
class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length<2) {return -1;}
       int secondLargest =-1 , int largest =nums[0] , largestIndex =-1;
       for (int current = 1 ; current < nums.length ; current ++ ) {
           if( nums[current] > largest) {
               secondLargest = largest ;
               largest = nums[current];
               largestIndex = current;
           }
           elseif (nums[current] < largest && nums[current] > secondLargest) {
               secondLargest = nums[current];
           }
       }
       if(largest > secondLargest *2) {return largestIndex;}
       return -1;
    }
}
