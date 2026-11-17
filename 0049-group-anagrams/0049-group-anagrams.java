class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i =0; i<strs.length;i++){
            char[] arr1 = strs[i].toCharArray();
            Arrays.sort(arr1);
            String key = new String(arr1);

            map.computeIfAbsent(key, k-> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}