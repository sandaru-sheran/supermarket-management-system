
package supermarcketsystem;


public class Item {
    String itemId;
    String itemName;
    String itemPrice;
    int itemQTY;
    
    public Item(String itemId,int qty){
        this.itemId=itemId;
        this.itemQTY=qty;
    }
    public Item(){
        
    }
    
    public Item(String itemId,String itemName,String itemPrice,int itemQTY){
        this.itemId=itemId;
        this.itemName=itemName;
        this.itemPrice=itemPrice;
        this.itemQTY=itemQTY;
    }
}
