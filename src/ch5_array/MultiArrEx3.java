package ch5_array;
//5-22
public class MultiArrEx3 {
    public static void main(String[] args) {
        int[][] m1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] m2 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        final int row = m1.length; // m1의 행길이 2
        final int col = m2[0].length; // m2의 열길이 2
        final int m2_row = m2.length; // m2의 행길이 3

        int[][] m3 = new int[row][col];

        // 행렬곱 m1 x m2의 결과를 m3에 저장
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < m2_row; k++) {
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        // 행렬 m3를 출력
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%3d", m3[i][j]);
            }
            System.out.println();
        }

    } //main의 끝
}
