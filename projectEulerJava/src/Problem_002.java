public class Problem_002 {
    public static void main(){
        int variable_1=0,variable_2=1,summ=0,buff;
        while (variable_2<4000000){
            if ((variable_1+variable_2)%2==0)
                summ+=variable_1+variable_2;
            buff=variable_2;
            variable_2+=variable_1;
            variable_1=buff;
            }
            System.out.println(summ);
        }
    }