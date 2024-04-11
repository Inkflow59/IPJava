package fr.inkflow.ip;
import java.util.Objects;
import java.util.Scanner;

public class IP {
    private int oct1, oct2, oct3, oct4;

    public IP(int oct1, int oct2, int oct3, int oct4) {
        this.oct1 = oct1;
        this.oct2 = oct2;
        this.oct3 = oct3;
        this.oct4 = oct4;
    }

    public IP() {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your IP address (without the mask), separated by 'Enter'");
        this.oct1=input.nextInt();
        this.oct2=input.nextInt();
        this.oct3=input.nextInt();
        this.oct4=input.nextInt();
    }

    public int getOct1() {
        return oct1;
    }

    public void setOct1(int oct1) {
        this.oct1 = oct1;
    }

    public int getOct2() {
        return oct2;
    }

    public void setOct2(int oct2) {
        this.oct2 = oct2;
    }

    public int getOct3() {
        return oct3;
    }

    public void setOct3(int oct3) {
        this.oct3 = oct3;
    }

    public int getOct4() {
        return oct4;
    }

    public void setOct4(int oct4) {
        this.oct4 = oct4;
    }

    public String decimPointee() {
        String ipString=this.oct1+"."+this.oct2+"."+this.oct3+"."+this.oct4;
        return ipString;
    }

    public char getIPClass() {
        if(this.oct1<=126) {
            return 'A';
        } else if(this.oct1>126 && this.oct1<=191) {
            return 'B';
        } else if(this.oct1>191 && this.oct1<=223) {
            return 'C';
        }   else {
            return 'X';
        }
    }

    public boolean IPEquals(IP autreAdresse) {
        boolean equalFlag=false;
        if(this.oct1==autreAdresse.getOct1() &&
        this.oct2==autreAdresse.getOct2() &&
        this.oct3==autreAdresse.getOct3() &&
        this.oct4==autreAdresse.getOct4()) {
            equalFlag=true;
        }   else {
            equalFlag=false;
        }
        return equalFlag;
    }

    public IP getNetworkAdress() {
        IP networkIP = new IP(this.oct1, this.oct2,0,0);
        return networkIP;
    }
}