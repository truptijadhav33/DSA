public class binarystring {
    public static void BinaryStringPair(int n ,int lastPos,String str)
    {
        //base case
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        //for first 000 by below statement
        BinaryStringPair(n-1,0,str+'0');
        if(lastPos==0)
        {
            BinaryStringPair(n-1,1,str+'1');
        }
    }

/* BinaryStringPair(3, 0, "")
  ├─ BinaryStringPair(2, 0, "0")
  │    ├─ BinaryStringPair(1, 0, "00")
  │    │    ├─ BinaryStringPair(0, 0, "000") → Print "000"
  │    │    └─ BinaryStringPair(0, 1, "001") → Print "001"
  │    └─ BinaryStringPair(1, 1, "01")
  │         └─ BinaryStringPair(0, 0, "010") → Print "010"
  └─ BinaryStringPair(2, 1, "1")
       └─ BinaryStringPair(1, 0, "10")
            ├─ BinaryStringPair(0, 0, "100") → Print "100"
            └─ BinaryStringPair(0, 1, "101") → Print "101" */

    public static void main(String[] args) {
        BinaryStringPair(3, 0, new String());
    }
}
