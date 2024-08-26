class Solution {
    public String addBinary(String a, String b) {
      int l1=a.length()-1;
      int l2=b.length()-1;
      int c=0;
      String s="";
      while(l1>=0||l2>=0){
        int sum=0;
            sum+=(l1>=0&&l2>=0 ? ((a.charAt(l1)-'0')+(b.charAt(l2)-'0')):(l2>=0 ? b.charAt(l2)-'0':a.charAt(l1)-'0'));
            sum+=c;
            s=(sum%2)+s; 
            c=sum/2;
            l1--;l2--;
            }
        s=c>0 ?c+s:s;
            return s;
    }
}
