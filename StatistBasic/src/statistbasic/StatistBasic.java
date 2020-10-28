
package statistbasic;

public class StatistBasic {
    private int head;
    private int[] list;

    public StatistBasic(int n) {
        list = new int[n];
        head = -1;
    }
    
    public void add(int e) {
        if(head<=list.length){
            head++;
            list[head] = e;
        }
    }
    
    public int find(int e) {
        int found = -1;
        for(int i=0;i<head;i++){
            if(list[i] == e){
                return i+1;
            }
        }
        return found;
    }
    
    public int min() {
        int min = list[0];
        for(int i=0;i<=head;i++){
            if(list[i]<min){
                min = list[i];
            }
        }
        return min;
    }
    
    public int max() {
        int max = list[0];
        for(int i=0;i<=head;i++){
            if(list[i] > max){
                max = list[i];
            }
        }
        return max;
    }
    
    public int sum() {
        int sum = 0;
        for(int i = 0;i<=head;i++){
            sum += list[i];
        }
        return sum;
    }
    
    public double avg() {
        return (double)sum()/(double)(head+1) ;
    }
    
    public double med() {
        if(head%2 == 1){
        int med = list[0];
        for(int i = 0;i<=head;i++){
            if(list[i]<list[i+1]){
                med=list[i];
            } else {
                med=list[i+1];
            }
        }
        return med;
        } else {
            if(head%2 == 1){
        int med = list[0];
        for(int i = 0;i<=head;i++){
            if(list[i]<list[i+1]){
                med=(list[i]+list[i+1])/2;
            } else {
                med=list[i+1];
            }
        }
        return med;
        }
        return -1;
    }
    }
    
    public double sd() {
        double varian = 0;
        for(int i=0;i<=head;i++){
            varian += (list[i] - avg())*(list[i] - avg()) ;
        }
        return Math.sqrt((double)varian/(double)(head));
    }
    
    public double varian() {
        double varian = 0;
        for(int i=0;i<=head;i++){
            varian += (list[i] - avg())*(list[i] - avg()) ;
        }
        return (double)varian/(double)(head);
    }
    
    public int range() {
        return max()-min();
    }
    
    public double cv() {
        return sd()/avg();
    }
    
    public double std(int e) {
        double standard = -1;
        for(int i=0;i<=head;i++){
            if(list[i] == e){
            standard = ((double)e-avg())/sd() ;
            }
        }
        return standard;
    }
    
    public void reset() {
       head=-1; 
    }

    @Override
    public String toString() {
        String s = "" ;
        for(int i=0;i<=head;i++){
            s = s + " " + list[i];
        }
        return "StatistBasic(" + s +" )";
    }
    
}
