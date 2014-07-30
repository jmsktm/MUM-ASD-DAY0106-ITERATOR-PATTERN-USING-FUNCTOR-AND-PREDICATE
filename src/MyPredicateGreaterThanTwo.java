/**
 *
 * @author jsingh
 */
public class MyPredicateGreaterThanTwo implements MyPredicateInterface<Integer> {

    @Override
    public boolean check(Integer t) {
        return t>2;
    }    
}
