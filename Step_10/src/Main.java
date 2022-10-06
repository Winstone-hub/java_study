public class Main {
    public static void main(String[] args) {

        // ** 10 개의 배열을 생성한다.
        int numbers[] = new int[10];

        // ** 현재 생성된 배열의 첫번째 원소부터 값을 초기화 하기 위함.
        int index = 0;

        while(true)
        {
            // ** 정수의 난수값을 생성한다.
            int num = (int)(Math.random() * 100) + 1;

            // ** numbers 배열에 동일한 값이 있는지 확인하기 위한 변수
            boolean check = true;

            /*
            for(int i = 0 ; i < numbers.length ; ++i)
            {
                if(num == numbers[i])
                {

                }
            }
            */

            // ** 현재 numbers 배열에 존재하는 값을과 생성된 난숙밧을 비교.
            // ** 만약 같은 값이 존재한다면 재생성.
            for (int element : numbers)
            {
                if(num == element)
                {
                    // ** 만약 동인항 값이 존재한다면....
                    check = false; // 재성성 하기 위해 false 로 설정.
                    break; // 같은 값이 있다면 반복문이 완료될 때까지 돌 필요가 없음.
                }
            }

            // ** 만약 중복값이 없다면....
            if(check == true)
            {
                // ** 현재위치에 난수값을 셋팅
                numbers[index] = num;

                // ** 다음 위치를 가르키게 한다.
                ++index;
            }

            // ** 모든 배열이 초기화가 종료되었다면 while() 문을 탈출한다.
            if(index == 10) break;
        }

        // ** 선택 정렬
        for(int i = 0 ; i < numbers.length - 1; ++i)
        {
            // ** i 는 첫번째 원소의 위치를 가르킨다.
            // ** index 에 첫번째 원소의 위치를 가르키는 i 로 초기화 해준다.
            index = i; // * index 값은 계속 변경될 수 있다.

            for(int j = i + 1 ; j < numbers.length ; ++j)
            {
                // ** 특정 조건이 만족 되었다면......
                if(numbers[index] > numbers[j])
                    index = j; // ** 해당 위치를 index 값으로 변경해준다.
            }

            // ** 값을 스왑.swap
            int temp = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = temp;
        }

        // ** 출력 한다.
        for (int element : numbers) {
            System.out.println(element);
        }
    }
}