public class DecorateHouse extends AbstractHouse{
    public DecorateHouse(String decorMaterial){
        this.decorMaterial=decorMaterial;
    }

    @Override
    void description() {
        System.out.println("\nОтделываем дом");
    }

    @Override
    void basement() { }

    @Override
    void floors() { }

    @Override
    void windows() { }

    @Override
    void doors() { }

    @Override
    void roof() { }

    @Override
    void decorateHouse() {
        System.out.println("\nДелаем отделку фасада при помощи следующего материала: " + decorMaterial);
    }
}
