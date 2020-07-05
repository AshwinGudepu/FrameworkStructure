package AutoWiredSetter;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {


    private Heart heartObject;

    @Autowired
    public void setHeart(Heart heartObject) {
        this.heartObject = heartObject;
    }

    public void startPumping(){
        if(heartObject!=null){
            heartObject.pump();
        }else{
            System.out.println("You are dead");
        }
    }

}
