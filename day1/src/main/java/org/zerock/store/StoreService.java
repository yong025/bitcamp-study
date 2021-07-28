package org.zerock.store;

//로직위주의 클래스
//메소드 우선 설계
//파라미터와 리턴 타입으로 데이터 위주의 클래스를 활용한다.
//생성자 의미 - ready
//멤버 변수 - 누적/상태/조력자

public class StoreService {

    private StoreDTO[] storeDTOS; //storeDTOS는 배열 복수이기때문에 S가 표기됨.

    public StoreService(StoreDTO[] storeDTOS) {
        //StoreService의 생성자는 무조건 입력데이터를 받아야 함.
        //그렇기에 StoreDTO에 있는 정보배열을 받아 실행.
        //this는 storeDTO의 멤버변수 정보를 찍어오기 위해 사용
        this.storeDTOS = storeDTOS;
    }


    public StoreDTO /*리턴타입*/ findByMenu(String menuName){

        return null;

    }
}
