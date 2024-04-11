package fr.inkflow.ip;

public class Test {
    public static void main(String[] args) {
        IP IP1=new IP(193,168,9,35);
        IP IP2=new IP(175,168,9,11);
        IP IP3=new IP(193,168,9,35);

        if(IP1.IPEquals(IP2)) {
            System.out.println("Elles sont égales (1)");
        }

        if(IP1.IPEquals(IP3)) {
            System.out.println("Elles sont égales (2)");
        }
    }
}
