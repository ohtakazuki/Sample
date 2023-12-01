package company;

public class ObjectSample {

    public static void main(String[] args) {
        // インスタンスの作成
        var department = new Department("営業部", "xx", 1000000);
        var employee = new Employee("鈴木", department, "課長", 100);

        // インスタンスメソッドの呼び出し
        employee.report();
        employee.report(2);
        employee.joinMeeting();

        // 1行空ける
        System.out.println("");

        // エンジニアインスタンスの作成
        var engineerDepartment = new Department("開発部", "yy", 0);
        Employee engineer = new Engineer("佐藤", engineerDepartment, "一般社員", 88, "Java");
        
        // インスタンスメソッドの呼び出し
        engineer.report();
        engineer.joinMeeting();
        if (engineer instanceof Engineer) {
            // developSoftwareメソッドを呼び出す
            ((Engineer) engineer).developSoftware();
        }
        
        // ----- 追記（ここから） -----
        // 1行空ける
        System.out.println("");

        // アルバイトインスタンスの作成
        var parttimeWorker = new ParttimeWorker("太田", department);
        
        // 実装したメソッドの呼び出し
        ((Workable) employee).work();
        ((Workable) engineer).work();
        ((Workable) parttimeWorker).work();
        // ----- 追記（ここまで） -----
    }

}