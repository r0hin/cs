package in.r0h;
import java.util.ArrayList;

public class CQueue<T> {
  
  private ArrayList<T> list = new ArrayList<T>();
  
  public CQueue() {
    
  }
  
  public void enqueue(T x) {
    
    list.add(0,x);
    
  }
  
  public T dequeue() {
    
    T t = list.remove(0);
    
    return t;
    
  }
  
  public void print() {
    
    for (int i = 0; i < list.size(); i = i + 1) {
      
      System.out.print(list.get(i)+" ");
      
    }
    
    System.out.println();
    
  }
  
  public static void main(String[] args) {
    
    CQueue<Integer> q1 = new CQueue<Integer>();
    
    q1.enqueue(9);
    
    q1.enqueue(10);
    
    System.out.println(q1);
    
    q1.print();
    
    q1.dequeue();
    
    q1.print();
    
  }
  
}