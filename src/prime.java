public class prime {
    public static void main(String[] args) {
        int ct=0;
        for (int i = 2; i<=100;i++){
            for(int j=1; j<=i;j++){
                if(i%j==0){
                    ct++;
                }
            }
            if (ct==2){
                System.out.print(i + " ");
            }
            ct=0;
        }
    }
}