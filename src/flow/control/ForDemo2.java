package flow.control;

public class ForDemo2 {
    public static void main(String [] args){
        int year1 = 4;
        int year2 = 100;
        int year3 = 400;
        for (int i = 2000;i <= 2022;i++){
            if(i % year1 == 0 && i % year2 != 0){
                System.out.println(i + "年是闰年");
            }else if (i % year3 == 0){
                System.out.println(i + "年是闰年");
            }
        }
    }
}
