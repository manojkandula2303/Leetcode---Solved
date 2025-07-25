class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>>res=new ArrayList<>();
       if(numRows==0)return res;
       List<Integer>firstrow=new ArrayList<>();
       firstrow.add(1);
       res.add(firstrow);
       for(int i=1;i<numRows;i++){
        List<Integer>prev=res.get(i-1);
        List <Integer>current=new ArrayList<>();
        current.add(1);
        for(int j=1;j<i;j++){
            current.add(prev.get(j)+prev.get(j-1));;
        }
        current.add(1);
        res.add(current);

       } return res;
    }
}