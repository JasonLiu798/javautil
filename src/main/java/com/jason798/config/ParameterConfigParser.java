package com.jason798.config;

import com.jason798.character.StringUtil;
import com.jason798.collection.CollectionHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * parameter parser
 *
 * Created by JasonLiu798 on 16/5/31.
 */
public class ParameterConfigParser {

    /**
     * "1101"
     * => 13
     * @param binary
     * @return
     */
    public static int binaryString2Int(String binary){
        int res = 0;
        if(StringUtil.isEmpty(binary)){
            return res;
        }
        byte[] bytes = binary.getBytes();
        int mask = 1;
        for(byte binaryByte:bytes){
            if(binaryByte != '0'){
                res=res|mask;
            }
            mask = mask<<1;
        }
        return res;
    }

    /**
     * true,false,true
     * =>5
     * @param list
     * @return
     */
    public static int booleanList2Int(List<Boolean> list){
        if(CollectionHelper.isEmpty(list)){
            return 0;
        }
        int len = list.size();
        int res = 0;
        if(list.size()>32){
            len = 32;
        }
        int mask = 1;
        for(Boolean item:list){
            if(item){
                res=res|mask;
            }
            mask = mask<<1;
        }
        return res;
    }

    /**
     * 12,4
     * =>1100
     * =>true,true,false,false
     * @param input
     * @return
     */
    public static List<Boolean> int2boolean(int input,int size){
        List<Boolean> res = new ArrayList<>(size);
        if(size<0){
            return res;
        }
        int mask = 1;
        for(int i=0;i<size;i++){
            int bitVal = mask&input;
            if(bitVal==0 ){
                res.add(false);
            }else{
                res.add(true);
            }
            mask = mask<<1;
        }
        return res;
    }

    public Map<String,Integer> int2int(int input){
        return null;
    }
}
