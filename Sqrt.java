// class Sqrt {
//     public int mySqrt(int x) {
//             if( x <= 1) {
//                 return x;
//             }
//            int i = 2;
//         while( i <= x/i) {
//             i++;
//         }
//         return i -1 ;
//     }
// }

// Better Sol.

// class Soluton {
//     public int Sqrt (int x) {

    // 
    // if (x <= 1 ) return x;
    // int left = 1, right = x ;
    // while (true) {
    //     int mid = left+(right - left)/2;
    //     if(mid >x/mid) {
    //         right = mid -1;
    //     } 
    //     else {
    //         if (mid + 1  >  x / (mid + 1)) return mid;
    //         left = mid +1;

    //     }
    // }
//     }
// }

