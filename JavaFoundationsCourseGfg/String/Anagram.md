# Problem 
## Anagram: 
https://practice.geeksforgeeks.org/batch/Java-Foundation/track/Java-Foundation-String/problem/anagram-1587115620 

## My solution: 
```
class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        int count = 0;
        
        // Your code here
        if(a.length() != b.length()) {
            return false;
        }
        
        for(char j='a'; j<='z'; j++) {
            for(int i=0; i<a.length(); i++) {
                if(a.charAt(i) == j) {
                    count++;
                }
                if(b.charAt(i) == j) {
                    count--;
                }
            }
            if(count != 0) {
                return false;
            }
        }
        return true;
    }
}
```
