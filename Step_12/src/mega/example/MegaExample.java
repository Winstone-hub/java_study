package mega.example;


// ** 패키지 내부에 있는 클래스를 1개씩 불러올 경우
//import mega.example.test.MagaExampleTest;

// ** 해당 패키지 내부에이쓴ㄴ 모든 클래스를 불러온다.
//import mega.example.test.*;

public class MegaExample {
    //MagaExampleTest test;

    /*
    Singleton s1 = new Singleton();
    Singleton s2 = new Singleton();
    Singleton s3 = new Singleton();
    */

    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    Singleton s3 = Singleton.getInstance();
}

