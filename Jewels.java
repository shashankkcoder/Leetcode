class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet <Character>  Jewels = new HashSet<Character>();
        int count =0 ;
        for( int  current = 0 ; current < J.length() ; current ++ ) {
            Jewels.add(J.charAt(current));
        } 
        for(int current = 0; current < S.length() ; current ++) {
            if(Jewels.contains(S.charAt(current))){count++;}
        }
        return count;
    }
}