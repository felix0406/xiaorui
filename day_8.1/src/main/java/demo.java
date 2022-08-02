import java.sql.Connection;
import java.sql.DriverManager;

public class demo {
    //加载数据库驱动
    private static String driveName="com.mysql.cj.jdbc.Driver";
    //数据库连接地址
    private static String url = "jdbc:mysql://localhost:3306/数据库名称?useUnicode=yes&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    //数据库名称
    private static String name="root";
    //数据库密码
    private static String password="root";
    //存储连接数据库
    private static Connection connection=null;
    public static void main(String[] args) {
        try {
            Class.forName(driveName);
            System.out.println("加载成功");
        }
        catch (Exception e){
            e.printStackTrace();
        }

        try {
            connection=DriverManager.getConnection(url,name,password);
            System.out.println("连接成功！！");
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}

