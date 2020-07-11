package listInheritanceExample;

import java.util.List;

public class Flipcart {

    private String user;
    private List<String> items;

    public void setUser(String user) {
        this.user = user;
    }

    public void setItems(List<String> items) {
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
}
