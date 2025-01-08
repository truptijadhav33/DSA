public class permutations {
    public static void permutationsFind(String str , String ans)
    {
        //Base case
        if (str.length()==0) {
            System.out.println(ans);
            return;
        }
        //recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);//a=b=c||
            //abcde=>"ab"+"de"="abde"
            String newStr = str.substring(0, i) + str.substring(i+1);//bc==c==''||
            permutationsFind(newStr, ans+curr);//bc,a==c,ab=='',abc||
        }

    }
    public static void main(String[] args) {
        String str = "abc";
        permutationsFind(str , "");
    }
}
