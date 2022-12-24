public class Default extends AbstractHouse{

    @Override
    void description() {
        System.out.println("\nПо умолчанию");
    }

    @Override
    void basement() {
        System.out.println("\nУ дома нет подвала");
    }

    @Override
    void floors() {
        System.out.println("Строим 1 этаж из материала: дерево");
    }

    @Override
    void windows() {
        System.out.println("Вставляем окна");
    }

    @Override
    void doors() {
        System.out.println("Вставляем двери");
    }

    @Override
    void roof() {
        System.out.println("Делаем 1-скатную крышу из материала: черепица" );
    }

    @Override
    void decorateHouse() { }

}
