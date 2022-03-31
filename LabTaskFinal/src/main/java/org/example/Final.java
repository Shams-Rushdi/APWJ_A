package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("final")
public class Final implements Exam {

    private Mid mid;

    /*public ClassB() {
    }*/

    @Autowired
    public Final(Mid mid) {
        this.mid = mid;
        /*System.out.println(cA1.methodA());*/
    }

    @Override
    public String methodA() {
        return "Final Exam is running";
    }

    public Mid getcA1() {
        return mid;
    }

    public void setcA1(Mid mid) {
        this.mid = mid;
    }
}
