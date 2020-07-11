package setCollections;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;
import java.util.Set;

public class Flipcart implements InitializingBean, DisposableBean {

    private String user;
    private Set<String> items;

    public void setUser(String user) {
        this.user = user;
    }

    public void setItems(Set<String> items) {
        this.items = items;
    }

    public String getUser() {
        System.out.println("Get User Name------>"+user);
        for (String item:items)
        {
            System.out.println("Items Added----->"+item);
        }
        return user;
    }

    @Override
    public String toString()
    {
        return "Flipcart [user=" + user + ", items=" + items + "]";
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring After Bean Value is Destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring After Bean Value is set");

    }
}
