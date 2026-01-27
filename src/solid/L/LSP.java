package solid.L;

import java.util.Arrays;
import java.util.List;

interface Vehicle{
    int getNoOfWheels();
}
interface EnginedVehicle extends Vehicle{
    String EngineCylinder();
}

class Car implements EnginedVehicle{

    @Override
    public int getNoOfWheels() {
       return 4;
    }

    @Override
    public String EngineCylinder() {
        return "4StockEngine";
    }
    
}
class Bike implements EnginedVehicle{

    @Override
    public int getNoOfWheels() {
       return 2;
    }

    @Override
    public String EngineCylinder() {
        return "DoubleStockEngine";
    }
    
}

class Bicycle implements Vehicle{

    @Override
    public int getNoOfWheels() {
        return 2;
    }
    
}

public class LSP {
    public static void main(String[] args) {
        List<EnginedVehicle> enginedVehicles = Arrays.asList(new Car(), new Bike(), new Car() );

        for(EnginedVehicle enginedVehicle : enginedVehicles){
            System.out.println(enginedVehicle.EngineCylinder());
            System.out.println(enginedVehicle.getNoOfWheels());
        }

        System.out.println("### for vehicle ####");

        List<Vehicle> vehicles = Arrays.asList(new Car(), new Bike(), new Car(), new Bicycle() );
        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle.getNoOfWheels());
        }

    }
}
