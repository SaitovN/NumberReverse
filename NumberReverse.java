package academy.devonline.java.basic.section01_setup.section05_setup;

public class NumberReverse {
    public static void main(String[] args) {
        var number = 123456789;
        var result = 0;
        var temp = number;

        while (temp!=0){
            var dr = temp %10;
            result= result*10+dr;
            temp/=10;


        }
        System.out.println(result);
    }
}
