/**
 *
 * @author jsingh
 */
public class MyAverageFunctor implements MyFunctorInterface<Number>{
    
    private Number sum;
    int count;
    
    public MyAverageFunctor() {
        this.sum = 0;
    }

    @Override
    public void compute(Number t) {
        sum = sum.doubleValue() + t.doubleValue();
        count++;
    }

    @Override
    public Number getValue() {
        return sum.doubleValue()/count;
    }
}
