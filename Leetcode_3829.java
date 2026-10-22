class RideSharingSystem {
    Queue<Integer> rider = new LinkedList<>();
    Queue<Integer> driver = new LinkedList<>();

    public RideSharingSystem() {

    }

    public void addRider(int riderId) {
        rider.add(riderId);
    }

    public void addDriver(int driverId) {
        driver.add(driverId);
    }

    public int[] matchDriverWithRider() {
        if (rider.isEmpty() || driver.isEmpty()) {
            return new int[] { -1, -1 };
        }
        int n = rider.peek();
        int m = driver.peek();
        rider.remove();
        driver.remove();
        return new int[] { m, n };

    }

    public void cancelRider(int riderId) {
        rider.remove(riderId);
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */