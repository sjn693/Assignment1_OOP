public abstract class Computer implements ElectronicDevice {
    public int cost;
    public int cpuCore;

    public Computer(){
    this.cost = 0;
    this.cpuCore = 0;
    }
    public Computer(int cost, int cpuCore){
        setCost(cost);
        this.cpuCore = cpuCore;
    }
    public abstract void webSearch();

    public void playMusic(){
        System.out.println("Music is being played.");
    }
    public int getCost(){
        return this.cost;
    }
    public void setCost(int cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Invalid cost");
        } else {
            this.cost = cost;
        }
    }
    @Override
    public <T> void turnOn(T status) {
    }
    @Override
    public <T> void sendEmail(T email) {
    };
}
