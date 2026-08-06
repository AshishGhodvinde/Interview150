import java.util.*;
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while(true){
            int sum = 0;
            while(n>0){
                int r = n%10;
                sum+=r*r;
                n/=10;
            }
            if(sum==1){
                return true;
            }else if(set.contains(sum)){
                return false;
            }
            set.add(sum);
            n = sum;
        }
    }
}



// when we calculate the sum of the digits of number ,we add it in hashset and then check if sum == 1 of sum is present in hashset to ensure number is 
// not repeating .
// we use two while loops ,first one to run until any result is not received(true or false) and second one for complete segregation of number.
// we make sum = 0 after every successful iteration. 