package sec05.chap01.ex02;

public class YalcoChicken {

    // 인스턴스가 가지는 필드들
    int no;
    String name;

    // 인스턴스가 가지는 메소드 - static을 붙이지 않음
    String intro() {
        return "안녕하세요, %d호, %s점입니다."
                .formatted(no, name);
    }
}
