package Management;

public class Member extends Parent {
    int age;
    String userName;

    Group group;

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public int getAge() { return this.age; }
    public void setAge(int age) { this.age = age; }
}