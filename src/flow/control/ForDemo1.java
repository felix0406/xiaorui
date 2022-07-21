package flow.control;

public class ForDemo1 {
    public static void main(String [] args){
        int tigerYear = 2022;
        int cycleYear = 12;
        for (int i = 1949; i <=2022; i++){
            if ((tigerYear - i)% cycleYear == 0){
                System.out.println(i + "年是虎年");
            }else if(i == tigerYear){
                System.out.println(i + "年是虎年");
            }
        }
    }
}
