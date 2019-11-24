public class Problem_014 {

    public static void main(){
        long counter = 1, num=0, longest=0;

        while (num<1000000){
            num++;
            long usingNum = num;
            long max = 0;
            while (usingNum != 1){
                if(usingNum % 2 == 0)
                    usingNum = usingNum/2;
                else
                    usingNum = usingNum*3+1;
                max++;
            }
            if(max>counter){
                counter=max;
                longest = num;
            }
        }
        System.out.println(longest);
    }

}
