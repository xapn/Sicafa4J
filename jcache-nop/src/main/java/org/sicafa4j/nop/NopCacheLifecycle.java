/**
 * 
 */
package org.sicafa4j.nop;

import javax.cache.CacheLifecycle;
import javax.cache.Status;

/**
 * The NOP implementation for JSR107/JCache.
 * 
 * @author Xavier Pigeon
 */
public class NopCacheLifecycle implements CacheLifecycle {
    
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
    public void start() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); //
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void stop() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); //
    }
    
}
