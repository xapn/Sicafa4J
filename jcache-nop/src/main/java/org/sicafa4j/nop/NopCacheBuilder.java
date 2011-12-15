/**
 * 
 */
package org.sicafa4j.nop;

import javax.cache.Cache;
import javax.cache.CacheBuilder;
import javax.cache.CacheConfiguration.Duration;
import javax.cache.CacheConfiguration.ExpiryType;
import javax.cache.CacheLoader;
import javax.cache.CacheWriter;
import javax.cache.event.CacheEntryListener;
import javax.cache.event.NotificationScope;
import javax.cache.transaction.IsolationLevel;
import javax.cache.transaction.Mode;

/**
 * The NOP implementation for JSR107/JCache.
 * 
 * @author Xavier Pigeon
 */
public class NopCacheBuilder<K, V> implements CacheBuilder<K, V> {
    
    @Override
    public Cache<K, V> build() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public CacheBuilder<K, V> registerCacheEntryListener(CacheEntryListener<K, V> cacheEntryListener,
            NotificationScope scope, boolean synchronous) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public CacheBuilder<K, V> setCacheLoader(CacheLoader<K, V> cacheLoader) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public CacheBuilder<K, V> setCacheWriter(CacheWriter<K, V> cacheWriter) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public CacheBuilder<K, V> setExpiry(ExpiryType type, Duration duration) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public CacheBuilder<K, V> setReadThrough(boolean readThrough) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public CacheBuilder<K, V> setStatisticsEnabled(boolean enableStatistics) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public CacheBuilder<K, V> setStoreByValue(boolean storeByValue) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public CacheBuilder<K, V> setTransactionEnabled(IsolationLevel isolationLevel, Mode mode) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public CacheBuilder<K, V> setWriteThrough(boolean writeThrough) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
}
