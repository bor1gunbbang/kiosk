package order;

public class sangPoom extends menu {
    public int burgerMenu1(){
        System.out.println("1.불고기버거");
        System.out.println("2.대리버거");
        System.out.println("3.크리스피버거");
        System.out.println("4.핫치킨버거");

        String result = menuScan.nextLine();
        return Integer.parseInt(result);

    }
public int iceMenu1(){
        System.out.println("1.옥동자 ");
        System.out.println("2.메가톤바");
        System.out.println("3.와일드바디");
        System.out.println("4.까마쿤");

        String result = menuScan.nextLine();
        return Integer.parseInt(result);

    }
public int drinkMenu1(){
        System.out.println("1.콜라");
        System.out.println("2.제로콜라");
        System.out.println("3.사이다");
        System.out.println("4.제로사이다");

        String result = menuScan.nextLine();
        return Integer.parseInt(result);

    }
public int beerMenu1(){
        System.out.println("1.기네스");
        System.out.println("2.아사히");
        System.out.println("3.칭따오");
        System.out.println("4.카스");

        String result = menuScan.nextLine();
        return Integer.parseInt(result);

    }



}
