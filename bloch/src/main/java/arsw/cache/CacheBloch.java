package arsw.cache;

import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

public class CacheBloch {
    
    
    private StringRedisTemplate template;
    private ValueOperations<String, String> ops;

    public CacheBloch(){
        RedisStandaloneConfiguration redisConfig = new RedisStandaloneConfiguration();
        redisConfig.setHostName("blochcache.redis.cache.windows.net");
        redisConfig.setPort(6379); //Puerto seguro SSL
        redisConfig.setPassword("JohanSebastian");

        LettuceConnectionFactory factory = new LettuceConnectionFactory(redisConfig);
        factory.afterPropertiesSet();

        template = new StringRedisTemplate(factory);
        template.afterPropertiesSet();
        ops = template.opsForValue();
    }

    public ValueOperations<String, String> getOps(){
        return ops;
    }

    public StringRedisTemplate getTemplate(){
        return template;
    }
}
