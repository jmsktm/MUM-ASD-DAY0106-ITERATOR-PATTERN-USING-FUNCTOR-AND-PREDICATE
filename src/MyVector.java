
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jsingh
 */
public class MyVector<T> extends Vector<T>{
    
    public void doAll(MyFunctorInterface f) {
        for(T t: this) {
            f.compute(t);
        }
    }
    
    public void doAll(MyFunctorInterface f, MyPredicateInterface p) {
        for(T t: this) {
            if(p.check(t)) {
                f.compute(t);
            }
        }
    }
}
