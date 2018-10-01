package exercices;

public class Person {

    // TODO 1. Add the following private attributes :
    private String name;
    private int age;
    private boolean wilder;

    // TODO 2. Add a Constructor with name and age arguments (in this order)
    public Person(String name, int age) {
        // This constructor must initialize name and age attributes
        name = "jacky";
        age = 14;
    }

        // TODO 3. Add getter method for name attribute
        public String getName(){
            return this.name;
        }
        // TODO 4. Add setter method for name attribute
        public void setName(String name){
            this.name = name;
        }

        // TODO 5. Add getter method for age attribute
        public int getAge(){
            return this.age;
        }

        // TODO 6. Add setter method for age attribute
        public void setAge(int age){
            this.age = age;
        }

        // TODO 7. Add getter method for wilder attribute
        public boolean isWilder(){
            return this.wilder;
        }

        // TODO 8. Add setter method for wilder attribute
        public void setWilder(boolean wilder){
            this.wilder = wilder;
        }
        public String whoAmI(){
            return "My name is" + " " + this.getName() + " " + "and I'm" + " " + this.getAge();
        }



    // TODO 9. Create a method 'whoAmI' that returns "My name is {name} and I'm {age}"
    // where you replace {name} and {age} with attributes values

    public Person(){

    }

}
