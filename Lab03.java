package Main;

public class Lab03 implements deviceType, company, osType {
    public static void main(String[] args) {
        final Lab03 obj = new Lab03();

        obj.category();
        obj.name();
        obj.typeOfOs();

    }

    public void name() {
        company.name();    
    }

        @Override
        public void typeOfOs() { 
                System.out.println("OS = Windows 11.");
        }
}


interface deviceType {
    default void category() { 
        System.out.println("Device type = Laptop.");
    }
}

interface company { // 

    public static void name() {
        System.out.println("Manufacture Company = Samsung.");
    }
}

interface osType { // Prototype Interface
    void typeOfOs();
    
}