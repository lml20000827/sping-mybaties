import asia.lml.dao.PersonDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {
    @Test
    public void list(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonDao person = ctx.getBean("personDao", PersonDao.class);
        List<asia.lml.domain.person> list = person.list();
        System.out.println(list);
    }
}
