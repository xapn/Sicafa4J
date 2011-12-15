/**
 * 
 */
package org.sicafa4j.nop;

import javax.cache.Cache;
import javax.cache.CacheBuilder;
import javax.cache.CacheManager;
import javax.cache.OptionalFeature;
import javax.cache.Status;
import javax.transaction.UserTransaction;

/**
 * The NOP implementation for JSR107/JCache.
 * 
 * @author Xavier Pigeon
 */
public class NopCacheManager implements CacheManager {
    
    /**
     * Constructor
     * 
     * @param name the name
     * @param classLoader the classLoader
     */
    public NopCacheManager(String name, ClassLoader classLoader) {
        // TODO Auto-generated constructor stub
        throw new RuntimeException("Not yet implemented");
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public <K, V> CacheBuilder<K, V> createCacheBuilder(String cacheName) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public <K, V> Cache<K, V> getCache(String cacheName) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Iterable<Cache<?, ?>> getCaches() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Status getStatus() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public UserTransaction getUserTransaction() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSupported(OptionalFeature optionalFeature) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return false;
    }
    
    @Override
    public void registerImmutableClass(Class<?> immutableClass) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); //
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean removeCache(String cacheName) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return false;
    }
    
    @Override
    public void shutdown() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); //
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public <T> T unwrap(Class<T> cls) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
}
