
package supermarcketsystem;


public class User {
    String name;
    String username;
    String password;
    String mobileNumber;
    boolean status;// trur==manager,false==employee
    
    public User(){
        
    }
    public User (String name,String username,String password,String mobileNumber,boolean status){
        this.name=name;
        this.username=username;
        this.password=password;
        this.mobileNumber=mobileNumber;
        this.status=status;
    }
    
}
