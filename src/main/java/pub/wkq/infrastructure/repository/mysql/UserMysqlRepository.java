package pub.wkq.infrastructure.repository.mysql;

import org.springframework.stereotype.Repository;
import pub.wkq.domain.repository.IUserRepository;
import pub.wkq.infrastructure.dao.UserDao;
import pub.wkq.infrastructure.po.UserEntity;

import javax.annotation.Resource;

/**
 * 虫洞栈：https://bugstack.cn
 * 公众号：bugstack虫洞栈 | 欢迎关注并获取更多专题案例源码
 * Create by fuzhengwei on @2019
 */
@Repository("userMysqlRepository")
public class UserMysqlRepository implements IUserRepository {

    @Resource
    private UserDao userDao;

    @Override
    public void save(UserEntity userEntity) {
        userDao.save(userEntity);
    }

    @Override
    public UserEntity query(Long id) {
        return userDao.query(id);
    }
}
