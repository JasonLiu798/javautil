package com.atjl.util.thread;

/**
 * 线程池 常量
 */
public class ThreadConstant {

    /**
     * 用户自定义类型
     */
    public static final String BUFPOOL_TYPE_USERDEFINE = "UD";
    /**
     * 固定大小线程池
     */
    public static final String BUFPOOL_TYPE_FIX = "Fix";

    /**
     * 参数分隔符
     */
    public static final String PARAM_SEP = ",";

    /**
     *
     */
    public static final String DFT_POOLNAME = "Default";

    /**
     * io密集型业务
     * count=业务执行时间
     */
    public static final String IO_POOL_PARAM = ",UD,20,20,200000,30000";
    /**
     * CPU密集型业务，填充cpu核数
     */
    public static final String CPU_POOL_PARAM = ",UD,%s,%s,200000,30000";

    public static final String DFT_POOL_PARAM = IO_POOL_PARAM;


    public static final String DFT_POOL_INIT_PARAM = DFT_POOLNAME + DFT_POOL_PARAM;


    private ThreadConstant() {
        throw new UnsupportedOperationException();
    }
}
