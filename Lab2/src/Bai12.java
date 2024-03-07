
    import java.util.Scanner;
public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap số dòng cho arr :");
        int m = sc.nextInt();
        System.out.print("Nhap số cột cho arr :");
        int n = sc.nextInt();
        int [][] A  = new int [m][n];
        for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
            System.out.print("Nhap phần tử thứ : "+"A["+i+"]["+j+"] = ");
            A[i][j] = sc.nextInt();
           }
        }
        int max =A[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(max < A[i][j]){
                    max = A[i][j];
                }
    }
}
System.out.print("max = " +max);
    }
}

