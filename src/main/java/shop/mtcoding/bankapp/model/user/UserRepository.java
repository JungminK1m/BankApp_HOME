package shop.mtcoding.bankapp.model.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
    public List<User> findAll();

    public int insert(User user);

    public int updateById(User user);

    public int deleteById(Integer id);

    public User findId(Integer id);
}
