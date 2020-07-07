package InterfaceInjectionExample;

import org.springframework.stereotype.Component;

@Component
public class Principal {

    public void getPrincipalName(){
        System.out.println("Principal Name--is Sachin Tendulkar");
    }
}
