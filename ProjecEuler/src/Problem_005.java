public class Problem_005 {
    public static boolean funct(int num){
    for (int i = 1; i <=20 ; i++) {
        if (num%i==0)
            continue;
        else
            return false;
    }

    return true;
}
    public static void main(){
        int num=0;
        boolean x=false;
        while (x==false){
            num++;
        x=funct(num);
        }
        System.out.println(num);
    }
}

