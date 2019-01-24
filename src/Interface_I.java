import java.util.Scanner;

public class Interface_I {
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }

    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

class MyCalculator implements AdvancedArithmetic{

    @Override
    public int divisor_sum(int n) {
        int sum = 0, i;

        for (i=1; i<=n; i++)
            if (n%i == 0) sum += i;

        return sum;
    }
}