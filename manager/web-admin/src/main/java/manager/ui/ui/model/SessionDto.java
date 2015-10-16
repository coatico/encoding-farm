/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager.ui.ui.model;

/**
 *
 * @author Arne
 */
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author lucs
 */
@Named
@SessionScoped
public class SessionDto implements Serializable {

    private UserDto userDto;
   long Start=0;
    long stop=0;
    
    public void startime(){
       Start= System.currentTimeMillis();
    }
       
    public void stoptime(){
        stop=System.currentTimeMillis();
        calworktime();
    }
    
    public String calworktime(){
        String a="";
    if(stop==0){
        a="";
        }
        if(stop!=0){
       a= ((stop - Start) / 1000 +" seconden");
        }
        System.out.println(a);
        System.out.println(Start);
        System.out.println(stop);
       return a;
    } 
    
    @PostConstruct
    public void init() {
        System.out.println("SessionDto - init");
        userDto = new UserDto();
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto UserDto) {
        this.userDto = UserDto;
    }

}
