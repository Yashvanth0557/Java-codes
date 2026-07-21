public class main{
    public static void main(String[]args){
        String[] name={"anbu","abi","aadhi","arul"};
        int[][] mark={{66,78,98,89,88},{97,77,69,89,80},{90,80,70,60,99},{100,100,100,100,100}};
        for(int i=0;i<name.length;i++)
        {
            System.out.println("Name="+ name[i]);
            double total=0;
            for(int j=0;j<mark[i].length;j++)
            {
                System.out.print(mark[i][j]+" ");
                total +=mark[i][j];
    }
    System.out.println();
    System.out.println("Average:"+(total/5));
    System.out.println();
}
}
}
