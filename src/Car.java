public class Car {

    private final String make;
    private final String model;
    private Engine engine;

    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        if (engine != null){
            this.engine = engine;
        }else{
            System.out.println("engine is null.");
            System.out.println("Engine not set.");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "make=" + make +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }

    public static class Engine {
        private final String name;
        private final double horsepower;


        public Engine(String name, double horsepower) {
            this.name = name;
            this.horsepower = horsepower;
        }

        public String getName() {
            return name;
        }

        public double getHorsepower() {
            return horsepower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsepower=" + horsepower +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}