package object.driver;

import object.company.SalesEmployee;

/**
 * 実行用クラス
 */

public class Driver {
    /**
     * メインメソッド
     * 
     * @param args 未使用
     */
    public static void main(String[] args) {
        // インスタンス化
        SalesEmployee natori = new SalesEmployee(1234, "名取", 100000);
        // 情報表示
        System.out.println();
        natori.displayInfo();
        natori.displaySalesAmt();

        System.out.println();
        natori.refund(500);
        natori.displaySalesAmt();

        // インスタンス化
        SalesEmployee aaa = new SalesEmployee(1235, "aaa");
        // 情報表示
        System.out.println();
        aaa.displayInfo();
        aaa.displaySalesAmt();

    }
}
