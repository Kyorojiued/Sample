package Sample;

public class Test {
    //mainメソッド
    public static void main(String[] args) {
        /*コメントアウト
        System.out.println("Kiramex"); 
        System.out.println("Java"); 
        */
        System.out.println("学習を始めましょう!");
        
        Wowow wowow =new Wowow();
        wowow.name();
    }

}

class Wowow {
    public void name() {
        System.out.print("weeee");
    }
}