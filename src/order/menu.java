package order;

import java.util.Scanner;

public class menu {
Scanner menuScan = new Scanner(System.in);
    public void mainmenu(){
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1.Burgers       | 앵거스 비프 통살을 다져 만든 버거");
        System.out.println("2.Frozen Custard       | 매장에서 신선하게 만든 아이스크림");
        System.out.println("3.Drinks       | 매장에서 직접 만드는 음료");
        System.out.println("4.Beer       | 뉴욕 브루클린 브루어리에서 양조한 맥주");

        System.out.println("[ ORDER MENU ]");
        System.out.println("5. Order       | 장바구니를 확인 후 주문합니다.");
        System.out.println("6. Cancel      | 진행중인 주문을 취소합니다.");
    }

    public void selectMenu1(){
        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();

        System.out.println("[ Burgers MENU ]");
        System.out.println("ShackBurger   | W 6.9 | 2개 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("SmokeShack    | W 8.9 | 1개 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");

        System.out.println("[ Total ]");
        System.out.println();//여기에 가격 총합이 들어아함.

        System.out.println("1.주문           2. 메뉴판");

    }


}



