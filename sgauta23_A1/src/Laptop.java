public class Laptop extends Computer implements Comparable{
    public String companyName;
    public boolean isAvailable;

    public Laptop(){
        this.companyName = "";
        this.isAvailable = false;
    }
    public Laptop(int cost, int cpuCore, String companyName, boolean isAvailable){
    super(cost, cpuCore);
    this.companyName = companyName;
    this.isAvailable = isAvailable;
    }
    public void printMethod(){
        System.out.println("The computer details are:");
        System.out.println(super.cost);
        System.out.println(super.cpuCore);
        System.out.println(companyName);
        System.out.println(isAvailable);
    }
    @Override
    public void webSearch() {
        System.out.println("Searching the query in Google");
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

