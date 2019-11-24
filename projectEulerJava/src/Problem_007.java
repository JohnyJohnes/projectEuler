public class Problem_007 {
    public static void main(){
        int num,i=0,counter_1=0;
        String primeNumbers="";
        while (counter_1!=10001)
        {
            i++;
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                counter_1++;
            }
        }
        System.out.println(i);
    }
}
