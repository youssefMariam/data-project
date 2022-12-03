package javaapplication130;
public class infoScout {
    private String name;
    private String adresse;
    private int age;
    private int phoneNb;

 
    
    
    public infoScout(String name, String adresse, int age, int phoneNb) {
        this.name = name;
        this.adresse = adresse;
        this.age = age;
        this.phoneNb = phoneNb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNb() {
        return phoneNb;
    }

    public void setPhoneNb(int phoneNb) {
        this.phoneNb = phoneNb;
    }

    @Override
    public String toString() {
        return "infoScout{" + "name=" + name + ", adresse=" + adresse + ", age=" + age + ", phoneNb=" + phoneNb + '}';
    }
    
}
