public class removeDuplicates {
    public static void remove(String str , int i ,StringBuilder sb , boolean[] map)
    {
        if(i==str.length())
        {
            System.out.println(sb);
            return;
        }
        char currChar=str.charAt(i);
        if(map[currChar-'a']==true)
        {
            remove(str , i+1 , sb ,  map);
        }
        else{
            map[currChar-'a']=true;
            remove(str , i+1 , sb.append(currChar) ,  map);
        }
    }
    public static void main(String[] args) {
        String str="apnacollege";
        boolean[] map = new boolean[26];
        remove(str , 0 , new StringBuilder(), map);
    }
}
