package org.practice.store;

import java.util.Scanner;

public class StoreUI {

    Scanner sc = new Scanner(System.in);
    StoreService storeService = new StoreService();

    public StoreDTO fnMenu(){

        System.out.println("메뉴 선택해라");
        String choice = sc.nextLine();

        return storeService.findByMene(choice);
    }
}
