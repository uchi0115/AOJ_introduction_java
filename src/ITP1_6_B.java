import java.util.Scanner;

class Main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        boolean[][] cards = new boolean[4][13];
        String kari;

        String[] answer;

        for (int i=0; i<=num; i++){
            kari = scan.nextLine();
            String[] card = kari.split(" ");

            //S:0 H:1 C:2 D:3
            switch (card[0]){
                case "S":
                    cards[0][(Integer.parseInt(card[1]) - 1)] = true;
                    break;
                case "H":
                    cards[1][(Integer.parseInt(card[1]) - 1)] = true;
                    break;
                case "C":
                    cards[2][(Integer.parseInt(card[1]) - 1)] = true;
                    break;
                case "D":
                    cards[3][(Integer.parseInt(card[1]) - 1)] = true;
            }
        }

        for (int j=0; j<4; j++){
            for (int k=0; k<13; k++){
                if (cards[j][k] == false){
                    switch (j) {
                        case 0:
                            System.out.println("S " + (k+1));
                            break;
                        case 1:
                            System.out.println("H " + (k+1));
                            break;
                        case 2:
                            System.out.println("C " + (k+1));
                            break;
                        case 3:
                            System.out.println("D " + (k+1));
                    }
                }
            }
        }


    }
}