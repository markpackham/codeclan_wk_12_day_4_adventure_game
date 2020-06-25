package rooms;

public enum ExitType {
            NORTH(1,"North"),
            SOUTH(2,"South"),
            EAST(3,"East"),
            WEST(4,"West");

            private int value;
    private String direction;

    ExitType(int value, String direction){
        this.value = value;
        this.direction = direction;
    }

    public int getValue() {
        return value;
    }

    public String getDirection() {
        return direction;
    }
}
