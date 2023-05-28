import order.menu;
import order.sangPoom;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();

        sangPoom sp = new sangPoom();
        menu menu = new menu();

        menu.mainmenu();
        System.out.print("숫자입력");
        int choiceNumber = scan.nextInt();
        if (choiceNumber == 1) {
            //버거메뉴
            sp.burgerMenu1();
        } else if (choiceNumber == 2) {
            //아이스크림메뉴
            sp.iceMenu1();
            System.out.println("2");
        } else if (choiceNumber == 3) {
            //음료메뉴
            sp.drinkMenu1();
        } else if (choiceNumber == 4) {
            //맥주메뉴
            sp.beerMenu1();
        } else if (choiceNumber == 5) {
            //장바구니로
            menu.selectMenu1();
        } //else if (choiceNumber == 6) {
//            System.out.print("진행하던 주문을 취소 하시겠습니까? 1. 확인 2. 취소 >> ");
//            int cancelNumber = scan.nextInt();
//            if (cancelNumber == 2) {
//                //처음화면
//            }
//        }


    }
}