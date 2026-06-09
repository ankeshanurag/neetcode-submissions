class Solution {
    public boolean isAnagram(String s, String t) {
		char[] ch1 = s.toLowerCase().toCharArray();
        char[] ch2 = t.toLowerCase().toCharArray();
        HashMap<Character,Integer> mp = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(char c:ch1){
            mp.put(c,mp.getOrDefault(c,0)+1);

        }
        for(char c2:ch2){
                mp.put(c2,mp.getOrDefault(c2,0)-1);
            
            if(mp.get(c2)==0){
                mp.remove(c2);
            }
        }
        return mp.isEmpty();
	}
}