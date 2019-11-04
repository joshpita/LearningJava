public class Constructor {
    int id;
    String name;

//    default constructor
//    Constructor(){
//        System.out.println("Constructor called");
//    }

    Constructor(String name, int id){
        this.name = name;
        this.id = id;
    }

        public static void main(String[] args) {
            Constructor josh1 = new Constructor("adam", 1);
            System.out.println("Name : " + josh1.name + " and ID : " + josh1.id);
        }
    }

