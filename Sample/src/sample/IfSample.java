package sample;

public class IfSample {

    public static void main(String[] args) {
        var score = 80; // 成績

        // if文
        if (score >= 60) {
            System.out.println("合格です！");
        }
        
        // if-else文
        if (score >= 60) {
            System.out.println("合格です！");
        } else {
            System.out.println("赤点です。。。");
        }
        
        // else if文
        if (score == 100) {
            System.out.println("満点です！");
        } else if (score >= 80) {
            System.out.println("よくできました！");
        } else if (score >= 60) {
            System.out.println("合格です！");
        } else {
            System.out.println("赤点です。。。");
        }
    }

}