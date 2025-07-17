/*
14. Longest Common Prefix
Solved
Easy
Topics
premium lock icon
Companies
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
 */

class Solution {
    public String common_string(String s1,String s2){
        int i=0;
        int min=Math.min(s1.length(),s2.length());
        while(i<min && s1.charAt(i)==s2.charAt(i)){
            i++;
        }
        if(i==0){
            return null;
        }
        else{
            return s1.substring(0,i);
        }
    }
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        String common=strs[0];
        for(int i=1;i<n;i++){
            common=common_string(common, strs[i]);
            if(common==null)return "";
        }
        return common;
    }
}