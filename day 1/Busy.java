public class Busy {
    public static void main(String[] args) {
        int n=4;
        int a[]={5,1,3,4};
        int k=3;
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                res=(a[i]+a[j])/2;
                if(res>=k){
                    System.out.print("("+a[i]+","+a[j]+")");
                }
            }
        }
    }
}
