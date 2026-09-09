class Solution {
    public int calPoints(String[] s) {

        int n=s.length;
        ArrayList<Integer>list=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            String ch=s[i];
            if(ch.equals("C"))
            {
                list.remove(list.size()-1);
            }
            else if(ch.equals("D"))
            {
                int last=list.get(list.size()-1);
                list.add(last*2);
            }
            else if(ch.equals("+"))
            {
                int sum=list.get(list.size()-1)+list.get(list.size()-2);
                list.add(sum);
            }
            else
            {
                int num=Integer.parseInt(ch);
                list.add(num);
            }
        }

        int total=0;
        for(int i=0;i<list.size();i++)
        {
            total=total+list.get(i);
        }

        
        return total;
    }
}