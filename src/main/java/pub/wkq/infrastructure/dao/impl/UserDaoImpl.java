package pub.wkq.infrastructure.dao.impl;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pub.wkq.infrastructure.dao.UserDao;
import pub.wkq.infrastructure.po.UserEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 虫洞栈：https://bugstack.cn
 * 公众号：bugstack虫洞栈 | 欢迎关注并获取更多专题案例源码
 * Create by fuzhengwei on @2019
 */
@Service
public class UserDaoImpl implements UserDao {
    private static final List<UserEntity> LIST = new ArrayList<>();
    @Override
    public void save(UserEntity userEntity) {
        LIST.add(userEntity);
    }

    @Override
    public UserEntity query(Long id) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1L);
        userEntity.setName("wkq");
        return LIST.stream().filter(item-> Objects.equals(id, item.getId())).findFirst().orElse(userEntity);
    }

}
