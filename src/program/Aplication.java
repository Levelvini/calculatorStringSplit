package program;

import java.util.*;

public class Aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("entre com os valores da operação: ");
        String line = sc.nextLine();
        String[] expression = line.split(" ");
        List<String> value = Arrays.asList(expression);
        int a = Integer.parseInt(value.get(0));
        char b = value.get(1).charAt(0);
        int c = Integer.parseInt(value.get(2));

        switch (b){
            case '+' :
                System.out.println(a+c);
                break;
            case '-' :
                System.out.println(a-c);
                break;
            case '*' :
                System.out.println(a * c);
                break;
            case '/' :
                if (c == 0){
                    System.out.println("não é possivel dividir por 0!");
                }
                else if (c == '/'){
                    System.out.println(a / c);
                }
            default:
                System.out.println("operação indisponivel!!");
                break;
        }

            sc.close();
    }
}
