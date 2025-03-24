
public class Parking {
    public static void main(String[] args) {
        int n=13;
        String s="XXXSSSXSSSSSX";
char[] a=s.toCharArray();
int maxa=0;
int seqc=0;
for(char c:a){
    if(c=='S'){
        seqc++;
        maxa=Integer.max(maxa, seqc);
    }
    else{
        seqc=0;
    }
}
System.out.println(maxa);
    }
}
