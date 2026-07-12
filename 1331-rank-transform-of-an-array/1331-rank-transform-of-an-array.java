class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
    int ans [] =arr.clone ();
    Arrays.sort(ans);
    int rank=1;
    for (int i=0;i<arr.length;i++){
         if (map.containsKey(ans[i])){
            continue;
        }
        map.put(ans[i],rank);
        rank++;
        }
        for (int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }

      return arr;
    }
}