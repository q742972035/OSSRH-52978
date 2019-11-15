package zy.opensource.mysql.binlog.incr.expose.event;

import zy.opensource.mysql.binlog.incr.expose.build.BinLogInfo;

/**
 * @program: mysql-binlog-incr-expose
 * @description
 * @author: zy
 * @create: 2019-08-12 11:27
 **/
public interface ConnectionEventListener {
    /**
     *
     * @param connected true 表示连接时，false表示失去连接
     */
    void onConnect(boolean connected,BinLogInfo binLogInfo);
}
