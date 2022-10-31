package Management;

public class Page {
    public void setData()
    {
        // ** 맴버 객체를 생성한다.
        Member member = new Member();

        // ** 생성한 맴버 개체에 필드값을 셋팅한다.
        //member.setAge(32);
        //member.setUserName("홍길동");

        {
            // ** 맴버 객체와 has-a 관계인 Group class 를 생성한다.
            Group group = new Group("K", "Java");

            // ** 생성된 클래스의 필드값을 셋팅한다.
            group.set_class("K");
            group.setSubject("Java");

            // ** 값이 셋팅된 클레스를 맴버 클레스에 맵핑한다.
            member.setGroup(group).setAge(32).setUserName("홍길동").setAge(40).setUserName("임꺽정");

            //member.setGroup( new Group("K", "Java"));
        }
        Singleton.getInstace().setMember(member);
    }
/*
    public Member createMember()
    {
        Member member = findName("홍길동");

        if(member == null)
        {
            member = new Member();

            member.setGroup();
        }

        return member;
    }
*/
}
