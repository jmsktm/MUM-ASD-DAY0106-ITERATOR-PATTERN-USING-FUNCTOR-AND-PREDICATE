
/**
 *
 * @author jsingh
 */
public class Lab6 {

    public static void main(String args[]) {
        
        MyVector<Integer> myVector = new MyVector<>();
        myVector.add(1);
        myVector.add(2);
        myVector.add(3);
        myVector.add(4);
        myVector.add(5);
        myVector.add(6);
        myVector.add(7);
        myVector.add(8);
        myVector.add(9);
        myVector.add(10);
        
        MyFunctorInterface f1 = new MySumFunctor();
        myVector.doAll(f1);
        System.out.println("Internal iterator, Complete for Integer collection w/ sum functor : "+f1.getValue());
        
        MyFunctorInterface f2 = new MyAverageFunctor();
        myVector.doAll(f2);
        System.out.println("Internal iterator, Complete for Integer collection w/ average functor: "+f2.getValue());
        
        MyVector<Double> myVector2 = new MyVector<>();
        myVector2.add(1.0);
        myVector2.add(2.0);
        myVector2.add(3.0);
        myVector2.add(4.0);
        myVector2.add(5.0);
        myVector2.add(6.0);
        myVector2.add(7.0);
        myVector2.add(8.0);
        myVector2.add(9.0);
        myVector2.add(10.0);
        
        MyFunctorInterface f3 = new MySumFunctor();
        MyPredicateGreaterThanTwo p3 = new MyPredicateGreaterThanTwo();
        myVector.doAll(f3, p3);
        System.out.println("Internal iterator, Selective (num>2) for Double collection w/ sum functor: "+f3.getValue());
    }
}
