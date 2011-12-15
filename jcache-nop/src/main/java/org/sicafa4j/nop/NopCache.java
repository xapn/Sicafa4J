/**
 * 
 */
package org.sicafa4j.nop;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;

import javax.cache.Cache;
import javax.cache.CacheConfiguration;
import javax.cache.CacheManager;
import javax.cache.CacheStatistics;
import javax.cache.Status;
import javax.cache.event.CacheEntryListener;
import javax.cache.event.NotificationScope;

/**
 * The NOP implementation for JSR107/JCache.
 * 
 * @author Xavier Pigeon
 */
public class NopCache<K, V> implements Cache<K, V> {
    
    @Override
    public boolean containsKey(K key) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return false;
    }
    
    @Override
    public V get(K key) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public Map<K, V> getAll(Collection<? extends K> keys) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public V getAndPut(K key, V value) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public V getAndRemove(K key) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public V getAndReplace(K key, V value) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public CacheManager getCacheManager() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public CacheConfiguration getConfiguration() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public CacheStatistics getStatistics() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public Status getStatus() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public Iterator<javax.cache.Cache.Entry<K, V>> iterator() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public Future<V> load(K key) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public Future<Map<K, V>> loadAll(Collection<? extends K> keys) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public void put(K key, V value) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); //
    }
    
    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); //
    }
    
    @Override
    public boolean putIfAbsent(K key, V value) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return false;
    }
    
    @Override
    public boolean registerCacheEntryListener(CacheEntryListener<? super K, ? super V> cacheEntryListener,
            NotificationScope scope, boolean synchronous) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return false;
    }
    
    @Override
    public boolean remove(K key) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return false;
    }
    
    @Override
    public boolean remove(K key, V oldValue) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return false;
    }
    
    @Override
    public void removeAll() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); //
    }
    
    @Override
    public void removeAll(Collection<? extends K> keys) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); //
    }
    
    @Override
    public boolean replace(K key, V value) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return false;
    }
    
    @Override
    public boolean replace(K key, V oldValue, V newValue) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return false;
    }
    
    @Override
    public void start() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); //
    }
    
    @Override
    public void stop() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); //
    }
    
    @Override
    public boolean unregisterCacheEntryListener(CacheEntryListener<?, ?> cacheEntryListener) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return false;
    }
    
    @Override
    public <T> T unwrap(Class<T> cls) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
}
