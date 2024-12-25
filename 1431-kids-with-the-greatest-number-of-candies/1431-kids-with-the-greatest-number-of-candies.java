class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        int maxcandy=0;
       List<Boolean> result = new ArrayList<>(n);
        for (int i=0;i<n;i++){
           if(candies[i]>maxcandy){
            maxcandy=candies[i];
           }

            }
             for(int j=0;j<n;j++){
                if((candies[j]+extraCandies)>=maxcandy){
                    result.add(true);
                }else{result.add(false);}
            }
       return result; }
    }
