class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap <Character,Integer> map =new HashMap<>();
        if (s.length()!=t.length()){
            return false;
        }
        for (char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (char string:t.toCharArray()){
           if (!map.containsKey(string))
               return false;
            map.put(string,map.get(string)-1);
            if (map.get(string)==0){
                map.remove(string);
            }
          
    }
      return map.isEmpty();
}
}