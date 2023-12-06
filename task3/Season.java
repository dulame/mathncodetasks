package task3;

public enum Season {
    WINTER(-5) {
        @Override
        public void getDescription() {
            System.out.println("A.T. of Winter: -5");
        }
    },
    SUMMER(25) {
        @Override
        public void getDescription() {
            System.out.println("A.T. of Summer: 25");
        }
    },
    AUTUMN(10) {
        @Override
        public void getDescription() {
            System.out.println("A.T. of Autumn: 10");
        }
    },
    SPRING(18) {
        @Override
        public void getDescription() {
            System.out.println("A.T. of Spring: 18");
        }
    };

    private int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public abstract void getDescription();

    @Override
    public String toString() {
        return "Season{" +
                "averageTemperature=" + averageTemperature +
                '}';
    }
}
