/**
 * 
 */
package org.sicafa4j.nop;

import java.util.Date;

import javax.cache.CacheStatistics;
import javax.cache.Status;

/**
 * The NOP implementation for JSR107/JCache.
 * 
 * @author Xavier Pigeon
 */
public class NopCacheStatistics implements CacheStatistics {
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void clearStatistics() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); //
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public float getAverageGetMillis() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return 0;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public float getAveragePutMillis() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return 0;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public float getAverageRemoveMillis() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return 0;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public long getCacheEvictions() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return 0;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public long getCacheGets() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return 0;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public float getCacheHitPercentage() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return 0;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public long getCacheHits() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return 0;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public long getCacheMisses() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return 0;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public float getCacheMissPercentage() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return 0;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public long getCachePuts() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return 0;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public long getCacheRemovals() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return 0;
    }
    
    /**
     * {@inheritDoc}
     */
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
    public Date statsAccumulatingFrom() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
}
