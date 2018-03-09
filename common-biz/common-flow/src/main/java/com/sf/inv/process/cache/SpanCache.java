package com.sf.inv.process.cache;

import com.sf.inv.process.core.Span;
import com.sf.inv.spi.ICache;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class SpanCache implements ICache<Span> {
    private static Map<String, Span> cache = new ConcurrentHashMap<>();

    @Override
    public void init() throws Exception {

    }

    @Override
    @PreDestroy
    public void destroy() {
        if(cache!=null){
            cache.clear();
        }
    }

    @Override
    public void put(String key, Span data) {
        cache.put(key, data);
    }

    @Override
    public Span get(String key) {
        return cache.get(key);
    }

    @Override
    public boolean exist(String key) {
        return cache.containsKey(key);
    }

    @Override
    public Span remove(String key) {
        return cache.remove(key);
    }

    @Override
    public String getStatus() {
        return null;
    }

    public Set<String> getKeys() {
        return cache.keySet();
    }
}
