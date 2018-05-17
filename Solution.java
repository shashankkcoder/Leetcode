class Solution {
    public String addBinary(String first, String second) {
        String result = "";
        int sum = 0;
        int LengthOfFirst = first.length() -1;
        int LengthOfSecond = second.length() -1;
            while ( LengthOfFirst >=0 || LengthOfSecond >=0 || sum ==1 ) {
                if(LengthOfFirst >=0 ) {
                    sum +=first.charAt(LengthOfFirst)-'0';
                     LengthOfFirst--;
                }
                 if(LengthOfSecond >=0 ) {
                    sum +=second.charAt(LengthOfSecond)-'0';
                      LengthOfSecond--;
                }
               
                
                result = (char)( sum % 2 +'0') + result;
                sum = sum/2;
            }
                    return result;
        }
}
