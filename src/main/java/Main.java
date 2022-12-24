public class Main {
    public static void main( String[] args ){
        FromTheStart houseFromTheStart = new FromTheStart(true,3,"дерево",2,"черепица","штукатурка");
        houseFromTheStart.build();

        DecorateHouse houseDecorateHouse = new DecorateHouse("керамический кирпич");
        houseDecorateHouse.build();

        Default houseDefault = new Default();
        houseDefault.build();
    }
}