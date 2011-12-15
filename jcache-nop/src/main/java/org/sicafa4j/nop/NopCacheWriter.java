/**
 * 
 */
package org.sicafa4j.nop;

import java.util.Collection;

import javax.cache.Cache.Entry;
import javax.cache.CacheWriter;

/**
 * The NOP implementation for JSR107/JCache.
 * 
 * @author Xavier Pigeon
 */
public class NopCacheWriter<K, V> implements CacheWriter<K, V> {
    
    @Override
    public void delete(Object key) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); //
    }
    
    @Override
    public void deleteAll(Collection<?> entries) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); //
    }
    
    @Override
    public void write(Entry<K, V> entry) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); //
    }
    
    @Override
    public void writeAll(Collection<Entry<? extends K, ? extends V>> entries) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); //
    }
    
}
