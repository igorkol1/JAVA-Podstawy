package a_Zadania.a_Dzien_1.c_Tablice;


public class Main1 {

    public static void main(String[] args) {
        int n = 50;
        int[] mainTab = new int[n];
        for (int i  =0;i<n;i++){
            mainTab[i]=i;
        }
        for(int i =0;i<n;i++){
            if(i%10==0 & i!=0){
                System.out.println(" ");
            }
            System.out.print(String.format("%02d",mainTab[i])+" ");
        }
    }
}
