package com.atjl.config.api;


public class ConfigDbConstant {
    private ConfigDbConstant() {
        super();
    }

    public static final String CONF_DB_TREE_SERVICE = "configDbTreeService";
    public static final String CONF_DB_PLAIN_SERVICE = "configDbPlainService";

    public static final String CONFIG_CACHE = "CONFIGCACHE";
    public static final String CONFIG_CACHE_M = "CONFIGCACHE_M";
    public static final String CONFIG_CACHE_MK = "CONFIGCACHE_MK";

    public static final String CONFIG_PROP_CACHE = "CONFIGPROP_CACHE";
    public static final String CONFIG_PROP_CACHE_MK = "CONFIGPROP_CACHE_MK";

    public static final String KEY = "key";
    public static final String VALUE = "value";

    public static final String METHOD_GET = "get";
    public static final String METHOD_GET_NOCACHE = "getNoCache";
    public static final String METHOD_GETS = "gets";
    public static final String METHOD_GET_BATCH = "getBatch";
    public static final String METHOD_GET_BATCH_NOCACHE = "getBatchNoCache";

}
