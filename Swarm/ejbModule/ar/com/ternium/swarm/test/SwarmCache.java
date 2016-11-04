package ar.com.ternium.swarm.test;

public interface SwarmCache {

	public void putValue(String key, String value);

	public String getValue(String key);

	public void clearValue(String key);

}