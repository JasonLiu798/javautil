package com.atjl.retry.api;

/**
 * 重试服务
 */
public interface CustomGetCount {

    /**
     * 获取需要重试的数据数量
     *
     * @return
     */
    int getRetryDataCount();

}
