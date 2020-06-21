/*
      * Main
      *
      * @author Serhii Tronevych
      *
      * @version 2020-06-21
      *
      * JavaCollectionsFramework. List.
      *
      *Task:
      * 1.  Create ArrayList and LinkedList containing  10 000 Integer elements. Compare time intervals.
        2. Insert  new 100 elements  on the  beginning, on  the middle  and on the end of ones. Compare time intervals.
        3. Update 100 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.
        4. Delete 100 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.
 */
package com.company;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;




public class Main {

    public static void main(String[] args) {
        // --------------------------Initialization of Lists-------------------------
        System.out.println("   ---------- Initialization of Lists -----------");
         /*
              //------------ ArrayList Initialization -------------------//
         */
        LocalDateTime arrayListStartInitial = LocalDateTime.now();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        LocalDateTime arrayListFinishInitial = LocalDateTime.now();
        System.out.println("  Array List needs for initialization: "
                +ChronoUnit.MILLIS.between(arrayListStartInitial, arrayListFinishInitial)
                +"ms.");
         /*
             //---------------------- LinkedList Initialization -------------------//
         */
        LocalDateTime linkedListInitStart = LocalDateTime.now();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        LocalDateTime linkedListFinInit = LocalDateTime.now();
        System.out.println("  Linked List needs for initialization: "
                +ChronoUnit.MILLIS.between(linkedListInitStart, linkedListFinInit)
                +"ms.");
        /*
         *       ----------------  Insert new 1000 elements at the  beginning ------------//
         */
        System.out.println(System.lineSeparator() +
                "--------- Insert adding new 1000 elements beginning at start  needs --------");
        LocalDateTime arrayListBeginStartInit = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i,i);
        }
        LocalDateTime arrayListBeginFinInit = LocalDateTime.now();
        System.out.println("  Array List adding 1000 elements on start needs: "
                +ChronoUnit.MILLIS.between(arrayListBeginStartInit, arrayListBeginFinInit)
                +"ms.");

        LocalDateTime linkedListBeginStartInit = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(i,i);
        }
        LocalDateTime linkedListBeginFinishInit = LocalDateTime.now();
        System.out.println("  Linked List adding 1000 elements on start needs: "
                +ChronoUnit.MILLIS.between(linkedListBeginStartInit, linkedListBeginFinishInit)
                +"ms.");

        //------------ Insert new 1000 elements beginning  on the  middle --------------//
        System.out.println(System.lineSeparator() +
                "--------- Insert  new 1000 elements  on the  middle ----------");
        LocalDateTime arrayListMiddleStartInit = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(50000+ i,i);
        }
        LocalDateTime arrayListMiddleFinishInit = LocalDateTime.now();
        System.out.println("  Array List adding 1000 elements  to middle needs: "
                +ChronoUnit.MILLIS.between(arrayListMiddleStartInit, arrayListMiddleFinishInit)
                +"ms.");

        LocalDateTime linkedListMiddleStartInit = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(50000 + i,i);
        }
        LocalDateTime linkedListMiddleFinishInit = LocalDateTime.now();
        System.out.println("  Linked List adding 1000 elements  to middle needs : "
                +ChronoUnit.MILLIS.between(linkedListMiddleStartInit, linkedListMiddleFinishInit)
                +"ms.");

        //------------ Insert  new 1000 elements   on the  end --------------//
        System.out.println(System.lineSeparator() +
                "---------- Insert  new 1000 elements  on the  end -----------");
        LocalDateTime arrayListEndStartInit = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        LocalDateTime arrayListEndFinishInit = LocalDateTime.now();
        System.out.println("  Array List adding 1000 elements  to end needs : "
                +ChronoUnit.MILLIS.between(arrayListEndStartInit, arrayListEndFinishInit)
                +"ms.");

        LocalDateTime linkedListEndStartInit = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(i);
        }
        LocalDateTime linkedListEndFinishInit = LocalDateTime.now();
        System.out.println("  Linked List adding 1000 elements to end needs: "
                +ChronoUnit.MILLIS.between(linkedListEndStartInit, linkedListEndFinishInit)
                +"ms.");

        /*
         *       --------- Update  1000 elements  on the  beginning -----------//
         */

        System.out.println(System.lineSeparator()+
                "---------- Update  1000 elements  on the  beginning ---------");
        LocalDateTime arrayListBeginStartUpdt = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(i,i + 10);
        }
        LocalDateTime arrayListBeginFinishUpdt = LocalDateTime.now();
        System.out.println("  Array List updating 1000 elements need to start : "
                +ChronoUnit.MILLIS.between(arrayListBeginStartUpdt, arrayListBeginFinishUpdt)
                +"ms.");

        LocalDateTime linkedListBeginStartUpdt = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(i,i);
        }
        LocalDateTime linkedListBeginFinishUpdt = LocalDateTime.now();
        System.out.println("  LinkedList updating 1000 elements on start needs: "
                +ChronoUnit.MILLIS.between(linkedListBeginStartUpdt, linkedListBeginFinishUpdt)
                +"ms.");

        //------------ Update 1000 elements  on the  middle --------------//
        System.out.println(System.lineSeparator() +
                "------------ Update 1000 elements  on the  middle --------------");
        LocalDateTime arrayListMiddleStartUpdt = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(50000+ i,i + 10);
        }
        LocalDateTime arrayListMiddleFinishUpdt = LocalDateTime.now();
        System.out.println("  Array List updating 1000 elements on middle needs: "
                +ChronoUnit.MILLIS.between(arrayListMiddleStartUpdt, arrayListMiddleFinishUpdt)
                +"ms.");

        LocalDateTime linkedListMiddleStartUpdt = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(5000 + i,i + 10);
        }
        LocalDateTime linkedListMiddleFinishUpdt = LocalDateTime.now();
        System.out.println("  Linked List updating 1000 elements on middle needs: "
                +ChronoUnit.MILLIS.between(linkedListMiddleStartUpdt, linkedListMiddleFinishUpdt)
                +"ms.");

        //------------ Update 1000 elements  on the  end --------------//
        System.out.println(System.lineSeparator() +
                "------------ Update 1000 elements  on the  end --------------");
        LocalDateTime arrayListEndStartUpdt = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(arrayList.size()-1000+i,i + 10);
        }
        LocalDateTime arrayListEndFinishUpdt = LocalDateTime.now();
        System.out.println("  Array List updating 1000 elements on end needs: "
                +ChronoUnit.MILLIS.between(arrayListEndStartUpdt, arrayListEndFinishUpdt)
                +"ms.");

        LocalDateTime linkedListEndStartUpdt = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(linkedList.size()-1000+i,i + 10);
        }
        LocalDateTime linkedListEndFinishUpdt = LocalDateTime.now();
        System.out.println("  Linked List updating 1000 elements on end needs: "
                +ChronoUnit.MILLIS.between(linkedListEndStartUpdt, linkedListEndFinishUpdt)
                +"ms.");

        /*
         *         ------------ Remove  1000 elements  on the  beginning --------------//
         */

        System.out.println(System.lineSeparator() +
                "------------ Remove  1000 elements  on the  beginning --------------");
        LocalDateTime arrayListBeginStartRemove = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(i);
        }
        LocalDateTime arrayListBeginFinishRemove = LocalDateTime.now();
        System.out.println("  ArrayList removing 1000 elements on start needs: "
                +ChronoUnit.MILLIS.between(arrayListBeginStartRemove, arrayListBeginFinishRemove)
                +"ms.");

        LocalDateTime linkedListBeginStartRemove = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(i);
        }
        LocalDateTime linkedListBeginFinishRemove = LocalDateTime.now();
        System.out.println("  LinkedList removing 1000 elements on start needs: "
                +ChronoUnit.MILLIS.between(linkedListBeginStartRemove, linkedListBeginFinishRemove)
                +"ms.");

        //------------ Remove 1000 elements  on the  middle --------------//

        System.out.println(System.lineSeparator() +
                "-------- Remove 1000 elements  on the  middle --------------");

        LocalDateTime arrayListMiddleStartRemove = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(50000+ i);
        }
        LocalDateTime arrayListMiddleFinishRemove = LocalDateTime.now();
        System.out.println("  ArrayList removing 1000 elements on middle needs: "
                +ChronoUnit.MILLIS.between(arrayListMiddleStartRemove, arrayListMiddleFinishRemove)
                +"ms.");

        LocalDateTime linkedListMiddleStartRemove = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(50000 + i);
        }
        LocalDateTime linkedListMiddleFinishRemove = LocalDateTime.now();
        System.out.println("  LinkedList removing 1000 elements on middle needs: "
                +ChronoUnit.MILLIS.between(linkedListMiddleStartRemove, linkedListMiddleFinishRemove)
                +"ms.");

        //------------ Remove 1000 elements  on the  end --------------//
        System.out.println(System.lineSeparator() +
                "------------ Remove 1000 elements  on the  end --------------");
        LocalDateTime arrayListEndStartRemove = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(arrayList.size()-1000+i);
        }
        LocalDateTime arrayListEndFinishRemove = LocalDateTime.now();
        System.out.println("  ArrayList removing 1000 elements on end needs: "
                +ChronoUnit.MILLIS.between(arrayListEndStartRemove, arrayListEndFinishRemove)
                +"ms.");

        LocalDateTime linkedListEndStartRemove = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(linkedList.size()-1000+i);
        }
        LocalDateTime linkedListEndFinishRemove = LocalDateTime.now();
        System.out.println("  LinkedList removing 1000 elements on end needs: "
                +ChronoUnit.MILLIS.between(linkedListEndStartRemove, linkedListEndFinishRemove)
                +"ms.");


        /*
        *--------------------------------------INTERVALS---------------------------------------
  ---------- Initialization of Lists -----------
  Array List needs for initialization: 21ms.
  Linked List needs for initialization: 47ms.

--------- Insert adding new 1000 elements beginning at start  needs --------
  Array List adding 1000 elements on start needs: 38ms.
  Linked List adding 1000 elements on start needs: 16ms.

--------- Insert  new 1000 elements  on the  middle ----------
  Array List adding 1000 elements  to middle needs: 16ms.
  Linked List adding 1000 elements  to middle needs : 319ms.

---------- Insert  new 1000 elements  on the  end -----------
  Array List adding 1000 elements  to end needs : 0ms.
  Linked List adding 1000 elements to end needs: 0ms.

---------- Update  1000 elements  on the  beginning ---------
  Array List updating 1000 elements need to start : 0ms.
  LinkedList updating 1000 elements on start needs: 1ms.

------------ Update 1000 elements  on the  middle --------------
  Array List updating 1000 elements on middle needs: 0ms.
  Linked List updating 1000 elements on middle needs: 20ms.

------------ Update 1000 elements  on the  end --------------
  Array List updating 1000 elements on end needs: 0ms.
  Linked List updating 1000 elements on end needs: 0ms.

------------ Remove  1000 elements  on the  beginning --------------
  ArrayList removing 1000 elements on start needs: 95ms.
  LinkedList removing 1000 elements on start needs: 1ms.

-------- Remove 1000 elements  on the  middle --------------
  ArrayList removing 1000 elements on middle needs: 23ms.
  LinkedList removing 1000 elements on middle needs: 211ms.

------------ Remove 1000 elements  on the  end --------------
  ArrayList removing 1000 elements on end needs: 1ms.
  LinkedList removing 1000 elements on end needs: 1ms.
        *
        */
    }
}