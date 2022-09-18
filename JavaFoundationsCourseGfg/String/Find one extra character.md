# Problem:
## Find one extra character
https://practice.geeksforgeeks.org/batch/Java-Foundation/track/Java-Foundation-String/problem/find-one-extra-character 

## My solution: 
public static char extraChar(String s1, String s2){

    //write your code here
    int s1Length = s1.length();
    int s2Length = s2.length();
    
    if(s1Length>s2Length) {
        char temp[] = s1.toCharArray();
        Arrays.sort(temp);
        String s = new String(temp);
        return s.charAt(s1Length-1);
    } else {
        char temp[] = s2.toCharArray();
        Arrays.sort(temp);
        String s = new String(temp);
        return s.charAt(s2Length-1);
    }
    
}
