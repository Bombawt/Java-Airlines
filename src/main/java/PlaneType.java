public enum PlaneType {
    BOEING747(500, 1000),
    BOEING777(700, 1500),
    BOEING787(1000, 2500);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }
}

