public class JUET{
    String Name;
    int Age;
    void setName(String Name){
        this.Name = Name;
    }
    void setAge(int Age){
        this.Age = Age;
    }
    String getName(){
        return this.Name;
    }
    int getAge(){
        return this.Age;
    }
    public static void main(String[] args){
        JUET obj = new JUET();
        obj.setName("Divyansh Namdev");
        obj.setAge(20);
        String name = obj.getName();
        int age = obj.getAge();
        System.out.println(name);
        System.out.println(age);
    }
}
      
    