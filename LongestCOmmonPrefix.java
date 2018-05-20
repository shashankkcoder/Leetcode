// class Solution {
//     public String longestCommonPrefix(String[] str) {
        
//         if(str != null && str.length==0) { return "";} 
//         for (int current =0 ; current < str[0].length() ; current ++ ) {
//                 char currentCharecter = str[0].charAt(current);
//             for(int nextString = 1 ; nextString < str.length ; nextString++ ) {
//                 if(current ==  str[nextString].length() || str[nextString].charAt(current) != currentCharecter ) {
//                     return str[0].substring(0,current);
//                 }
//             }
//             }
//                 return str[0];
//     }
// }