/**
 * 
 */
package org.sicafa4j.nop;

import java.util.Map;

import javax.cache.Cache.Entry;
import javax.cache.CacheLoader;

/**
 * The NOP implementation for JSR107/JCache.
 * 
 * @author Xavier Pigeon
 */
public class NopCacheLoader<K, V> implements CacheLoader<K, V> {
    
    @Override
    public Entry<K, V> load(K key) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    @Override
    public Map<K, V> loadAll(Iterable<? extends K> keys) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
}
