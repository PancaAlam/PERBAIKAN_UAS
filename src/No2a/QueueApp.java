/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2a;

/**
 *
 * @author Panca Alam Kusuma
 */
public class QueueApp {
      public static void main(String[] args){
        Queue antrian = new Queue(10);
        antrian.enqueue(20);
        antrian.display();
        antrian.enqueue(40);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        antrian.enqueue(60);
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        antrian.display();
        antrian.enqueue(80);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
    }
}
