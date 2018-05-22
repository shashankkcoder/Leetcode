// class Solution {
//     public boolean isPalindrome(String s) {
//         s = s.replaceAll("[^a-zA-Z0-9]", "");
//         String str = s.toLowerCase();
//        for(int current =0 ; current < str.length()/2 ; current ++ ) {
//             if( str.charAt(current) != str.charAt(str.length()-current -1 )) {return false;}
//        }
//         return true;
//     }
// }