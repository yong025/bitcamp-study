package org.zerock.store;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World");

        StoreDTO storeDTO = StoreDTO.builder()
                .name("한글식당")
                .lat(37.444)
                .lng(127.11)
                .menu("한글식당")
                .build();

        System.out.println(storeDTO);
    }
}
