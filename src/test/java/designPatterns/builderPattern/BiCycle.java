package designPatterns.builderPattern;

public class BiCycle {

    private String colour;
    private boolean gears;
    private int doubleStands;
    private int doubleSeats;
    private int carriers;

     private BiCycle(Builder builder)
    {
        this.colour= builder.colour;
        this.doubleSeats=builder.doubleSeats;
        this.doubleStands = builder.doubleStands;
        this.gears = builder.gears;
        this.carriers=builder.carriers;
    }

    @Override
    public String toString() {
        return "BiCycle{" +
                "colour='" + colour + '\'' +
                ", gears=" + gears +
                ", doubleStands=" + doubleStands +
                ", doubleSeats=" + doubleSeats +
                ", carriers=" + carriers +
                '}';
    }

    public String getColour() {
        return colour;
    }
    public int getDoubleStands() {
        return doubleStands;
    }
    public int getDoubleSeats() {
        return doubleSeats;
    }
    public int getCarriers() {
        return carriers;
    }
    public boolean isGears() {
        return gears;
    }

    public static class Builder {

        private String colour;
        private boolean gears;
        private int doubleStands;
        private int doubleSeats;
        private int carriers;

        public Builder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public Builder setGears(boolean gears) {
            this.gears = gears;
            return this;
        }

        public Builder setDoubleStands(int doubleStands) {
            this.doubleStands = doubleStands;
            return this;
        }

        public Builder setDoubleSeats(int doubleSeats) {
            this.doubleSeats = doubleSeats;
            return this;
        }

        public Builder setCarriers(int carriers) {
            this.carriers = carriers;
            return this;
        }

        public BiCycle build()
        {
            return new BiCycle(this);
        }
    }
}
