import java.util.Scanner;

class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int floar[] = new int[4];

        int home_1[][] = new int[3][10];
        int home_2[][] = new int[3][10];
        int home_3[][] = new int[3][10];
        int home_4[][] = new int[3][10];

        for (int i = 0; i < num; i++){
            String data[] = (sc.nextLine()).split(" ");

            for (int j = 0; j < floar.length; j++){
                floar[j] = Integer.parseInt(data[j]);
            }

            switch (floar[0]) {
                case 1:
                    home_1[floar[1]-1][floar[2]-1] += floar[3];
                    break;

                case 2:
                    home_2[floar[1]-1][floar[2]-1] += floar[3];
                    break;
                case 3:
                    home_3[floar[1]-1][floar[2]-1] += floar[3];
                    break;
                case 4:
                    home_4[floar[1]-1][floar[2]-1] += floar[3];
                    break;
            }

        }

        for (int k = 0; k < 3; k++){
            for (int l = 0; l < 10; l++){
                System.out.print(" " + home_1[k][l]);
            }
            
            System.out.println();
        }

        System.out.println("####################");

        for (int k = 0; k < 3; k++){
            for (int l = 0; l < 10; l++){
                System.out.print(" " + home_2[k][l]);
            }
            
            System.out.println();

        }

        System.out.println("####################");
        
        for (int k = 0; k < 3; k++){
            for (int l = 0; l < 10; l++){
                System.out.print(" " + home_3[k][l]);
            }
            
            System.out.println();
        }

        System.out.println("####################");

        for (int k = 0; k < 3; k++){
            for (int l = 0; l < 10; l++){
                System.out.print(" " + home_4[k][l]);
            }
            
            System.out.println();
        }
    }
}
