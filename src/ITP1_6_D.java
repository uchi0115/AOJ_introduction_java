import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String data[] = sc.nextLine().split(" ");

        int n = Integer.parseInt(data[0]);
        int m = Integer.parseInt(data[1]);

        int matrix[][] = new int[n][m]; //行列の定義
        int vec[] = new int[m]; //ベクトルの定義

        int ans[] = new int[n]; //出力するベクトルの定義

        //行列の格納
        for (int i = 0; i < n; i++) {
            
            String v[] = sc.nextLine().split(" ");
            
            for (int j = 0; j < m; j++) {

                matrix[i][j] = Integer.parseInt(v[j]);

            }
        }

        //ベクトルの格納
        for (int k = 0; k < m; k++) {

            vec[k] = sc.nextInt();

        }

        //行列積
        for (int p = 0; p < n; p++) {
          
            for (int q = 0; q < m; q++){
                ans[p] += (matrix[p][q] * vec[q]);
            }
            
        }
        
        
        for (int r = 0; r < ans.length; r++){
          
            System.out.println(ans[r]);
            
        }

    }
}
