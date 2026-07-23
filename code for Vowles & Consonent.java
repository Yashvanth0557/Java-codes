public class VowCon{
    public static void main(String[]args){
        int Vow=0;
        int Con=0;
        String str="apple";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch == 'a' || ch =='e' || ch =='i'|| ch =='o')
            {
                Vow=Vow+1;
        }
        else
        {
            Con=Con=1;
    }
}
System.out.println(Vow);
System.out.println(Con);
}
}
