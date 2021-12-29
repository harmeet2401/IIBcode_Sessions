package bean;


class Exercise {

    public static void main(String[] args) {

        System.out.println(printResult());
    }

    public static String printResult(){
        // Write your logic here to return expected patter as string
        Animal a1 = new Animal("Tiger");
        Animal a2 = new Animal("Unknown Animal");
        return "animal_1 name : "+a1.name+" | "+"animal_2 name : "+a2.name;
        // Expected Result : animal_1 name : Tiger | animal_2 name : Unknown Animal
    }
}