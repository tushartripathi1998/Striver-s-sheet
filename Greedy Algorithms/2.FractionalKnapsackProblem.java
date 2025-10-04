//Fractional Knapsack Problem

import java.util.*;

public class Main {
  public static void main(String[] args) {
    int[] val = {60, 100, 120};
    int[] wt = {10, 20, 30};
    int capacity = 50;
    int totalWt = 0;
    
    List<Knap> knapList = new ArrayList<>();
    knapList.add(new Knap(100,20));
    knapList.add(new Knap(60,10));
    knapList.add(new Knap(100,50));
    knapList.add(new Knap(200,50));
    Collections.sort(knapList);
        
    for (Knap knap : knapList) {
        if (knap.getWt() < capacity) {
            totalWt += knap.getVal();
            capacity -= knap.getWt();
        } else{
            totalWt += Integer.valueOf(knap.getVal()/knap.getWt()*capacity);
            capacity = 0;
        }
    }
    System.out.println("totalWt is --"+totalWt);
  }
}

class Knap implements Comparable<Knap>{
    private int val;
    private int wt;
    
    public Knap(int val, int wt) {
        this.val = val;
        this.wt = wt;
    }

    public int getVal() {
        return val;
    }public void setVal(int val) {
        this.val = val;
    }
    public int getWt() {
        return wt;
    }
    public void setWt(int wt) {
        this.wt = wt;
    }
    public int compareTo(Knap knp) {
        return Double.compare(knp.val/knp.wt, this.val/this.wt);
    }
}
