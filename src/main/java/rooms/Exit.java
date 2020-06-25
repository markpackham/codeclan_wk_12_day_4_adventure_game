package rooms;

public enum Exit {
            NORTH("North"),
            SOUTH("South"),
            EAST("East"),
            WEST("West");

    private String direction;

    Exit(String direction){
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
