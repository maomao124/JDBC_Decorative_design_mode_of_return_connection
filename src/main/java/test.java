import java.sql.SQLException;

/**
 * Project name(项目名称)：JDBC归还连接之装饰设计模式
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/20
 * Time(创建时间)： 13:47
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        ConnectionPool connectionPool = new ConnectionPool();
        System.out.println("最大数量：" + ConnectionPool.getConnectionPoolSize());
        System.out.println("当前：" + connectionPool.getPoolSize());
        try
        {
            for (int i = 0; i < 112; i++)
            {
                Connection connection = connectionPool.getConnection();
                connection.close();
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        System.out.println("当前：" + connectionPool.getPoolSize());
    }
}
