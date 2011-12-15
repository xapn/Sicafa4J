/**
 * 
 */
package org.sicafa4j.nop.spi;

import javax.cache.CacheManager;
import javax.cache.OptionalFeature;
import javax.cache.spi.CachingProvider;

/**
 * The NOP implementation for JSR107/JCache.
 * 
 * @author Xavier Pigeon
 */
public class NopCachingProvider implements CachingProvider {
    
    /**
     * {@inheritDoc}
     */
    @Override
    public CacheManager createCacheManager(ClassLoader classLoader, String name) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    /*
     * (non-Javadoc)
     * @see javax.cache.spi.CachingProvider#getDefaultClassLoader()
     */
    @Override
    public ClassLoader getDefaultClassLoader() {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return null;
    }
    
    /*
     * (non-Javadoc)
     * @see
     * javax.cache.spi.CachingProvider#isSupported(javax.cache.OptionalFeature)
     */
    @Override
    public boolean isSupported(OptionalFeature optionalFeature) {
        // TODO Auto-generated method stub
        throw new RuntimeException("Not yet implemented"); // return false;
    }
}
