// https://discord.gg/4z3xdqC3


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // ** 변수 이름를 지을때 주의사항
        int i = 10;

        // ** 이름을 봤을때 어떤값을 나타내는지 확인이 가능해야함.
        // ** 변수명 사이에 공백 사용불가.
2
        // ** 대/소 문자 구분해서 사용.
        // * (Apple != apple) 같지 않음.

        // ** 예약어 사용 불가.

        // ** 숫자로 시작할 수 없음.

        // ** 특수문자 사용이 가능. (_, $)
        int user_id;
        int user_email;

        System.out.println(i);


        // ==================================================================
        //  [자 료 형]
        // ==================================================================

        /*
        * [정수형 datatype]

        문자를 표현할 때 사용
        * char : 2 byte

        숫자
        * byte : 1 byte
        * short : 2 byte
        * int : 4 byte
        * long : 8 byte

        * [실수형 datatype]
        * float : 4 byte
        * double : 8 byte

        * [논리형 datatype]
        * boolean : 1 byte
        */




        // ==================================================================
        //  [비트 연산]
        // ==================================================================

        // 부호    값
        // [0] [0000000]

        // [1]0000000 = (-128)
        //      .
        //      .
        //      .
        // [1]1111101 = -3
        // [1]1111110 = -2
        // [1]1111111 = -1
        // [0]0000000 = 0
        // [0]0000001 = 1
        // [0]0000010 = 2
        // [0]0000011 = 3
        //      .
        //      .
        //      .
        // [0]1111111 = 127




        //===================================
        // ** 2의 보수

        // [0]0000001 = 1

        // ▽ ▽ ▽ ▽ ▽ ▽
        // 1단계 : 반전
        // [1]1111110

        // ▽ ▽ ▽ ▽ ▽ ▽
        // 2단계 : +1
        // [1]1111111 = -1
        //===================================


        //===================================
        // ** 127의 값에 대한 2의 보수

        // [0]1111111 = 127

        // ▽ ▽ ▽ ▽ ▽ ▽

        // 1단계 : 반전
        // [1]0000000

        // ▽ ▽ ▽ ▽ ▽ ▽
        // 2단계 : +1
        // [1]0000001 = (-127)
        //===================================



        // 부호        값
        // [0] [1111111 11111111] = 32767

        // 1단계 : 반전
        // [1] [0000000 00000000] = -32768

        // 2단계 : + 1
        // [1] [0000000 00000001] = -32767

        // ** 마지막 값
        // [1] [0000000 00000000] = -32768




        //===================================
        // 고정 소수점
        //===================================
        //      [정수부]           [실수부]
        // [0] 0000000 00000000.00000000 00000000



        //===================================
        // 부동 소수점
        //===================================
        // 부호  [지수부] = 8개    [가수부] = 23개
        // [0] [00000000].[00000000000000000000000]
    }
}