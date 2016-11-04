package ar.com.ternium.swarm.test;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import weblogic.servlet.Env;

public class SwarmCacheClient {

	
	public static void main(String[] args) throws Exception {

		Hashtable env =  new Hashtable();

		env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
		env.put(Context.PROVIDER_URL, "t3://127.0.0.1:7003");
		
		InitialContext context = new InitialContext(env);
		
		  final SwarmCache scBean = (SwarmCache) context.lookup("swarmCacheBeanName#ar.com.ternium.swarm.test.SwarmCache");
	  //   scBean.putValue("key1", "value1");
	     
	     System.out.println(scBean.getValue("key1"));
	     
	     
	}
	
	
	
}
