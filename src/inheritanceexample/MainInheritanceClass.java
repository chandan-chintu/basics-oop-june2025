package inheritanceexample;

public class MainInheritanceClass {
    public static void main(String[] args) {
        System.out.println("-----------Parent Vehicle class------------");
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.stop();
        vehicle.fuel();
        System.out.println("--------------Child WaterVehicle class--------------");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.travelOnWater();
        waterVehicle.start();
        waterVehicle.stop();
        waterVehicle.fuel();
        System.out.println("--------------Child AirVehicle class--------------");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.travelOnAir();
        airVehicle.start();
        airVehicle.stop();
        airVehicle.fuel();
        System.out.println("--------------Child RoadVehicle class--------------");
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.travelOnRoad();
        roadVehicle.start();
        roadVehicle.stop();
        roadVehicle.fuel();
    }
}
