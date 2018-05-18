// class Solution {
//     public int climbStairs(int n) {
//          if(n <= 3) { return n;}
           
//         int [] arr = new int[n+1];
//         arr[2] = 2;
//         arr[3] =3;
//         for(int steps=4; steps<=n ; steps++) {
//             arr[steps] = arr[steps-1] + arr[steps-2];
//         }
//         return arr[n];
//     }
// }