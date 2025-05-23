package _07.driver;

import _07.company.Employee;
import _07.company.SalesEmployee;

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
        // 配列宣言・初期化
        Employee[] emp = {
                new Employee(1000, "田中五郎"),
                new SalesEmployee(1234, "速水剛留", 1000000) // SalesEmployee型のインスタンスをEmployee型にアップキャスト
        };

        // 情報表示
        for (int i = 0; i < emp.length; i++) {
            System.out.println();
            emp[i].displayInfo(); // ダイナミックバインディング
        }
        // （ノート）
        // 継承・オーバーライド・
        // アップキャスト・ダイナミックバインディング
        // ↓
        // ポリモフィズム（多態性）
    }
}
