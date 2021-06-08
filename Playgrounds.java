public class Playgrounds {
    private String name;
    private int[] time;
    private static int id =0;
    private int price;

    public void setname(String Name){
        this.name =Name;
    }
    public void settime(int[] Time ){
        this.time=Time;
    }
    public void setid(int ID){
        this.id=ID;
    }
    public void setprice(int Price){
        this.price =Price;
    }
    public int getprice(){
        return price;
    }
    public String getname(){
        return name;
    }
    public int[] gettime(){
        return time;
    }
    public int getid(){
        return id;
    }
    

    public String ToString(){
        return name + " " + time + " " + price ;
    }
}
