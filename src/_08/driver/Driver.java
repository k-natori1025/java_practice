package _08.driver;

import _08.company.AbsEmployee;
import _08.company.AccountingEmployee;
import _08.company.HrEmployee;
import _08.company.LogisticEmployee;
import _08.company.PlanningEmployee;
import _08.company.SalesEmployee;

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
        // 配列の作成（抽象クラス型）
        AbsEmployee[] emp = makeEmployeeList();

        // 各社員の情報表示
        displayEmployeeList(emp);
    }

    /**
     * 配列の作成（抽象クラス AbsEmployee 型）
     * 
     * @return 作成した配列
     */
    static AbsEmployee[] makeEmployeeList() {

        AbsEmployee[] emp = {
                new SalesEmployee(1234, "速水剛留", 1000000),
                new PlanningEmployee(3333, "佐藤三郎", 10, 2),
                new AccountingEmployee(5555, "山本誠", "賃金計算"),
                new LogisticEmployee(7777, "西田健一", 2800000, 3300000),
                new HrEmployee(9999, "安藤優人", "採用")
        };

        return emp;
    }

    /**
     * 各社員情報の表示
     * 
     * @param absEmployee
     */
    static void displayEmployeeList(AbsEmployee[] absEmployee) {
        for (int i = 0; i < absEmployee.length; i++) {
            System.out.println();
            absEmployee[i].displayInfo();
        }
    }
}
