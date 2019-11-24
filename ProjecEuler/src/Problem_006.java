public class Problem_006 {
    public static void main() {
        int summ_1=0,summ_2=0,result;
        for (int i = 0; i <=100 ; i++) {
            summ_1+=i;
        }
        for (int i = 0; i <=100 ; i++) {
            summ_2+=i*i;
        }
        result=summ_1*summ_1-summ_2;
        System.out.println(result);
    }
}
