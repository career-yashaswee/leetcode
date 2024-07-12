class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        Collections.reverse(Arrays.asList(words));
        String ans = "";
        for(int i=0;i<words.length;i++){
            if(!(words[i].length()<1)) {
                ans+=words[i]+" ";
            }
        }
        return ans.substring(0,ans.length()-1);
    }
}