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

public class UserDto {

    private String lastname;

    private String firstname;

    private String sex;

    private String pass;

    private String birthd;

    private String usname;

    private String email;
    
    private boolean isAdmin;
    
     private boolean loggedIn;
     
      private boolean isCleaning;
    
    private boolean isReparations;
    

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   

    public String getLname() {
        return lastname;
    }

    public void setLname(String lname) {
        this.lastname = lname;
    }

    public String getFname() {
        return firstname;
    }

    public void setFname(String fname) {
        this.firstname = fname;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getBirthd() {
        return birthd;
    }

    public void setBirthd(String birthd) {
        this.birthd = birthd;
    }

    public String getUsname() {
        return usname;
    }

    public void setUsname(String usname) {
        this.usname = usname;
    }

    public boolean isIsCleaning() {
        return isCleaning;
    }

    public void setIsCleaning(boolean isCleaning) {
        this.isCleaning = isCleaning;
    }

    public boolean isIsReparations() {
        return isReparations;
    }

    public void setIsReparations(boolean isReparations) {
        this.isReparations = isReparations;
    }
    
  public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    
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
     
}

