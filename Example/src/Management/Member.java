package Management;

public class Member extends Parent {
    int age;
    String userName;
    Group group;

    public Group getGroup() { return group; }
    public Member setGroup(Group group) {
        this.group = group;
        return this;
    }

    public String getUserName() { return userName; }
    public Member setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public int getAge() { return this.age; }
    public Member setAge(int age) {
        this.age = age;
        return this;
    }
}
