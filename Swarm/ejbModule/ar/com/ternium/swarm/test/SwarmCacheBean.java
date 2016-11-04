package ar.com.ternium.swarm.test;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import net.sf.swarmcache.CacheConfiguration;
import net.sf.swarmcache.CacheFactory;
import net.sf.swarmcache.ObjectCache;

/**
 * Session Bean implementation class SwarmCacheBean
 */
@Stateless(name="swarmCacheBean", mappedName="swarmCacheBeanName")
@Remote
public class SwarmCacheBean implements SwarmCache {
	
	CacheFactory cacheFactory;
    /**
     * Default constructor. 
     */
	ObjectCache cache;
    public SwarmCacheBean() {
    	
        // TODO Auto-generated constructor stub
    	CacheConfiguration conf = new CacheConfiguration();
    	conf.setCacheType(CacheConfiguration.TYPE_HYBRID);
    	cacheFactory = new CacheFactory(conf);

    	cache = cacheFactory.createCache("testCache");
    	// Create a new cache, using a name that describes
    	//  what kind of object we will store
    	

    	
    }
    
    /* (non-Javadoc)
	 * @see ar.com.ternium.swarm.test.SwarmCache#putValue(java.lang.String, java.lang.String)
	 */
    @Override
	public void putValue(String key, String value){

    	// Store something in the cache
    	
    	
    	cache.put(key, value);

    	
    }
    
    
    /* (non-Javadoc)
	 * @see ar.com.ternium.swarm.test.SwarmCache#getValue(java.lang.String)
	 */
    @Override
	public String getValue(String key){
    	return(String)cache.get(key);
    }
    
    /* (non-Javadoc)
	 * @see ar.com.ternium.swarm.test.SwarmCache#clearValue(java.lang.String)
	 */
    @Override
	public void clearValue(String key){
    	cache.clear(key);
    }

}
