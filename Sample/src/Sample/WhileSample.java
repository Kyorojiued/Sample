package Sample;

public class WhileSample {

    public static void main(String[] args) {
        outerLoop: // これがラベル
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (j == 1) {
                        continue outerLoop; // outerLoopの次のイテレーションへ
                    }
                    System.out.println("i=" + i + ", j=" + j);
                }
            }

    }

}
