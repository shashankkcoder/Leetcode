// class Solution {
//     public int strStr(String haystack, String needle) {
//         if( needle.isEmpty()) {return  0 ;}
//         if(haystack.isEmpty()){ return -1;}
//         int currentIndeOfNeedle=0;
//         int currentIndexOfHaystack=0;
//         while(currentIndeOfNeedle < needle.length() && currentIndexOfHaystack < haystack.length()) {
//             if(needle.charAt(currentIndeOfNeedle) == haystack.charAt(currentIndexOfHaystack)) {
//                 currentIndeOfNeedle++;
//                 currentIndexOfHaystack++;
//             }
//             else {
//                 currentIndexOfHaystack = currentIndexOfHaystack - currentIndeOfNeedle +1;
//                 currentIndeOfNeedle =0;
//             }
//         }
//         if(currentIndeOfNeedle == needle.length()){return currentIndexOfHaystack-currentIndeOfNeedle;}
//         return -1;
//     }
// }