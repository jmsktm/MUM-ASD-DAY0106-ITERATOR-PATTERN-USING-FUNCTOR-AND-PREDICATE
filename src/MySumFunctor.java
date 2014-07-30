/**
 *
 * @author jsingh
 */
public class MySumFunctor implements MyFunctorInterface<Number>{
    
    private Number sum;
    
    public MySumFunctor() {
        this.sum = 0;
    }

    @Override
    public void compute(Number t) {
        sum = sum.doubleValue() + t.doubleValue();
    }

    @Override
    public Number getValue() {
        return sum;
    }
}
