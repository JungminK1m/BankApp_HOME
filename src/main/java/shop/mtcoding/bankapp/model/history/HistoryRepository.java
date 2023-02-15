package shop.mtcoding.bankapp.model.history;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HistoryRepository {
    public List<History> findAll();

    public int insert(History history);

    public int updateById(History history);

    public int deleteById(Integer id);

    public History findId(Integer id);
}
