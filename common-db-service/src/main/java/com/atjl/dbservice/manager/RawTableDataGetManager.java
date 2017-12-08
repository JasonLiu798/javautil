package com.atjl.dbservice.manager;

import com.atjl.dbservice.api.domain.DbTableTransferConfig;
import com.atjl.dbservice.api.domain.SearchCondBase;
import com.atjl.dbservice.mapper.biz.DataTransferMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Component
public class RawTableDataGetManager {
    @Resource
    private DataTransferMapper dataTransferMapper;

    /**
     * 如果所属字段 值为null，对应的key也为空
     */
    public List<Map> getData(DbTableTransferConfig config, SearchCondBase cond) {
        return dataTransferMapper.getRawTableData(config, cond);
    }

    public int getCount(DbTableTransferConfig config, SearchCondBase searchCondBase) {
        return dataTransferMapper.getRawTableDataCount(config, searchCondBase);
    }

}
