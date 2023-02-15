package shop.mtcoding.bankapp.model.account;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountRepository {

    public List<Account> findAll();

    public int insert(Account account);

    public int updateById(Account account);

    public int deleteById(Integer id);

    public Account findId(Integer id);

}
