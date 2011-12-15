/**
 * 
 */
package org.sicafa4j.nop;

import javax.cache.CacheConfiguration;
import javax.cache.CacheLoader;
import javax.cache.CacheWriter;
import javax.cache.transaction.IsolationLevel;
import javax.cache.transaction.Mode;

/**
 * The NOP implementation for JSR107/JCache.
 * 
 * @author Xavier Pigeon
 */
public class NopCacheConfiguration implements CacheConfiguration {
    
    @Override
    public CacheLoader getCacheLoader() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public CacheWriter getCacheWriter() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public Duration getExpiry(ExpiryType type) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public IsolationLevel getTransactionIsolationLevel() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public Mode getTransactionMode() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public boolean isReadThrough() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return false;
    }
    
    @Override
    public boolean isStatisticsEnabled() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return false;
    }
    
    @Override
    public boolean isStoreByValue() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return false;
    }
    
    @Override
    public boolean isTransactionEnabled() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return false;
    }
    
    @Override
    public boolean isWriteThrough() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return false;
    }
    
    @Override
    public void setStatisticsEnabled(boolean enableStatistics) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); //
    }
    
}
