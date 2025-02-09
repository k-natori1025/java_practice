package _06;

public class Sample0601 {
    public static void main(String[] args) {
        int engScore = 78;
        int mathScore = 64;
        float value = 58.3F;
        char assess = 'B'; // 文字型はシングルクオテーション
        boolean pass = true;
        long takerCnt = 12345L;

        System.out.println("--------------------");
        System.out.println("【XXXさんの結果】");
        System.out.println("英語の得点=" + engScore);
        System.out.println("数学の得点=" + mathScore);
        System.out.println("偏差値=" + value);
        System.out.println("評価=" + assess);
        System.out.println("合格=" + pass);
        System.out.println("--------------------");
        System.out.println("受験者数=" + takerCnt);
    }
}
