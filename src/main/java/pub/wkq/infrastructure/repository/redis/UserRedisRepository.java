package pub.wkq.infrastructure.repository.redis;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Repository;
import pub.wkq.domain.repository.IUserRepository;
import pub.wkq.infrastructure.po.UserEntity;
import pub.wkq.infrastructure.util.RedisUtil;

import javax.annotation.Resource;

/**
 * 虫洞栈：https://bugstack.cn
 * 公众号：bugstack虫洞栈 | 欢迎关注并获取更多专题案例源码
 * Create by fuzhengwei on @2019
 */
@Repository("userRedisRepository")
public class UserRedisRepository implements IUserRepository {

    @Resource(name = "redisUtil")
    private RedisUtil redisUtil;

    @Override
    public void save(UserEntity userEntity) {
        redisUtil.set("itstack-demo-ddd-userinfo", JSON.toJSONString(userEntity));
    }

    @Override
    public UserEntity query(Long id) {
        String objJson = redisUtil.get("itstack-demo-ddd-userinfo");
        return JSON.parseObject(objJson, UserEntity.class);
    }

}
