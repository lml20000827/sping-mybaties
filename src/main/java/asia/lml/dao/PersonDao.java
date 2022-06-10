package asia.lml.dao;

import asia.lml.domain.person;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

public interface PersonDao {
    List<person> list();

}
