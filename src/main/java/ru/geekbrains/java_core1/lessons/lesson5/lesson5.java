package ru.geekbrains.java_core1.lessons.lesson5;

public class lesson5 {



    public static void main(String[] args) {
        Worker worker1 = new Worker("ZotovEI","system administrator", "bla@mail.ru","1234435345",10,24);
        worker1.printWorker();


        Worker[] workersArray = new Worker[5];
        workersArray[0] = new Worker("PetrovAA", "director","petrovaa@gmail.com","123456789",250, 50);
        workersArray[1] = new Worker("IvanovAA","buch","ivanovaa@gmail.com","234567891",240,50);
        workersArray[2] = new Worker("SidorovAA","sekretar","sidorovaa","345678912",230,39);
        workersArray[3] = new Worker("PopovAA","driver","popovaa@gmail.com","456789123",210,35);
        workersArray[4] = new Worker("BlinovAA","security","blinovaa@gmaol.com","567891234",150,41);
        System.out.println(workersArray[0].toString());
        System.out.println(workersArray[1].toString());
        System.out.println(workersArray[2].toString());
        System.out.println(workersArray[3].toString());
        System.out.println(workersArray[4].toString());
        System.out.println();

        for (int i = 0; i < workersArray.length; i++) {
            if (workersArray[i].age >=40) {
                workersArray[i].printWorker();
            }
        }
    }
}
