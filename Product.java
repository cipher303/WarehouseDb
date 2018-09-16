
package WarehouseDb;
public class Product {
    private int id;
    private String name;
    private float price;
    private String addDate;
    private byte[] img;
    public Product(int pid, String pname, float pprice, String paddDate, byte[] pimg){
this.id= pid;
this.name=pname;
this.price=pprice;
this.addDate = paddDate;
this.img=pimg;
}
    public int getId(){
    return id;
    }
    public String getname(){
    return name;
    }
    public float getprice(){
    return price;
    }
    public String getaddDate(){
    return addDate;
    
    }
    public byte[] getimg(){
    return img;
    }
}
