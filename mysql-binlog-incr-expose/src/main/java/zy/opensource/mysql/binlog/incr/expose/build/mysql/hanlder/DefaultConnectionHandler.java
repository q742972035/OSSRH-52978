package zy.opensource.mysql.binlog.incr.expose.build.mysql.hanlder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import zy.opensource.mysql.binlog.incr.expose.build.ExposeConfig;
import zy.opensource.mysql.binlog.incr.expose.build.mysql.table.Table;
import zy.opensource.mysql.binlog.incr.expose.utils.ObjectUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * @program: mysql-binlog-incr-expose
 * @description
 * @author: zy
 * @create: 2019-08-19 16:04
 **/
public class DefaultConnectionHandler {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private ExposeConfig exposeConfig;
    private StatementHandler statementHandler = new DefaultStatmentHandler();

    public DefaultConnectionHandler(ExposeConfig exposeConfig) {
        this.exposeConfig = exposeConfig;
    }

    public <T> List<T> excute(String sql, Class<T> type) {
        Connection connection = null;
        try {
            connection = exposeConfig.getDataSource().getConnection();
            return statementHandler.excute(connection, sql, type);
        } catch (SQLException e) {
            logger.error("创建connection异常,", e);
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                logger.error("关闭connection异常,", e);
            }
        }
        return null;
    }
}
