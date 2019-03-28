public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("hello");

        int x = 5;
        double soma = 0;
        boolean flag = false;

        if (x % 2 == 0) {
            flag = true;
        }


        // x % w.s   --------- Abrevatura para escrever o switch
        switch (x % 2) {
            case 0:
                flag = true;
                break;
            default:
                flag = false;
        }

        //flag = x > 2 == 0;


        for (int i = 0; i < x; i++) {
            soma += x;
        }


        soma = 0;
        int i = 1;
        while (i <= x) {
            soma += i++;
        }


        soma = 0;
        i = 1;
        do {
            soma += i++;
        }
        while (i <= x);

        soma = 0;
        for (int j = 0; j < x; j++) {
            if (j == 3) {
                continue;
            }
            soma += j;
        }

        flag = (x = 0 (int) (soma -= 0.5))>10;

    }
}



