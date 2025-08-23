public class Constructor {
     int id;
     String name;

     Constructor() {
        
     }

    //  Constructor() {
    //     id= 100;
    //     name= "Ronak Goel";
    //  }

     void printInfo() {
        System.out.println("Details are: " + id + " " + name);
     }

     public static void main(String[] args) {
         Constructor c= new Constructor();
         c.printInfo();
     }
}