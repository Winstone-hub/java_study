package Management;

public class ManagementMain  {
    public static void main(String[] args) {

        // ** 맴버 객체를 생성한다.
        Member member = new Member();

        // ** 생성한 맴버 개체에 필드값을 셋팅한다.
        member.setAge(32);
        member.setUserName("홍길동");

        {
            // ** 맴버 객체와 has-a 관계인 Group class 를 생성한다.
            Group group = new Group("K", "Java");

            // ** 생성된 클래스의 필드값을 셋팅한다.
            group.set_class("K");
            group.setSubject("Java");

            // ** 값이 셋팅된 클레스를 맴버 클레스에 맵핑한다.
            member.setGroup(group);

            //member.setGroup( new Group("K", "Java"));
        }

        // ** 맴버의 필드값을 받아온다.
        String name = member.getUserName();
        int age = member.getAge();

        String _class = member.getGroup().get_class();
        String subject = member.getGroup().getSubject();

        // ** 출력한다.
        System.out.println(name + " : " + age + " [" + _class + "] : " + subject);
    }
}
