public class Problem_012 {
    public static void main(){
        int counter=0;
        long number=0,adding=0;
        while (counter<=500){
            counter=0;
            adding++;
            number+=adding;
            for (long i = 1; i <=number ; i++) {
                if (number%i==0)
                    counter++;
            }
            System.out.println(counter);
        }
        System.out.println("Your number is:\t"+number);
    }
}