class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mp =new HashMap<>();
		char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        if(ch1.length!=ch2.length){
            return false;
        }
        for(char c1:ch1){
            mp.put(c1,mp.getOrDefault(c1,0)+1);
        }
        
        
        for(char c2:ch2){
            if(!mp.containsKey(c2)||mp.get(c2)==0){
                return false;
            }
            mp.put(c2,mp.get(c2)-1);
        }
        return true;

	}
}