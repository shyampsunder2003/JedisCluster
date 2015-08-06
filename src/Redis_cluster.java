import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by shyam on 8/5/15.
 */
public class Redis_cluster {
    public static void main(String args[])
    {
        Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
        //Jedis Cluster will attempt to discover cluster nodes automatically
        jedisClusterNodes.add(new HostAndPort("104.199.145.2", 6379));
        jedisClusterNodes.add(new HostAndPort("130.211.116.57", 6379));
        jedisClusterNodes.add(new HostAndPort("146.148.72.218", 6379));
        jedisClusterNodes.add(new HostAndPort("108.59.81.8", 6379));
        jedisClusterNodes.add(new HostAndPort("130.211.171.101", 6379));
        jedisClusterNodes.add(new HostAndPort("104.154.48.118", 6379));
        JedisCluster jc = new JedisCluster(jedisClusterNodes);
        jc.set("Sachin", "Tendulkar");
        String value = jc.get("foo");
        System.out.println(value);
    }
}
