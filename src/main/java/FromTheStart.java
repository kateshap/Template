public class FromTheStart extends AbstractHouse{
    public FromTheStart(boolean basement, int numFloors,String floorsMaterial,int numPitch, String roofMaterial,String decorMaterial){
        this.basement=basement;
        this.numFloors=numFloors;
        this.floorsMaterial=floorsMaterial;
        this.numPitch=numPitch;
        this.roofMaterial=roofMaterial;
        this.decorMaterial=decorMaterial;
    }
    @Override
    void description() {
        System.out.println("\nСтроим дом с нуля");
    }

    @Override
    void basement() {
        if(basement==true){
            System.out.println("\nУ дома есть подвал");
        }
        else {
            System.out.println("У дома нет подвала");
        }
    }

    @Override
    void floors() {
        if(numFloors<1 || numFloors>3){
            System.out.println("Количество этажей ограничено!");
        }
        else {
            if (floorsMaterial.equals("дерево") || floorsMaterial.equals("камень")) {
                System.out.println("Строим " + numFloors + " этажа из материала: " + floorsMaterial);
            } else {
                System.out.println("Данный материал отсутствует");
            }
        }
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
        if(numFloors==1 || numFloors==2 || numFloors==4 || numFloors==5){
            System.out.println("Делаем " + numPitch + "-скатную крышу из материала:" + roofMaterial);
        }
        else {
            System.out.println("Скатность крыши может быть только 1, 2 , 4 или 5!");
        }
    }

    @Override
    void decorateHouse() {
        System.out.println("Делаем отделку фасада при помощи следующего материала: " + decorMaterial);
    }
}
