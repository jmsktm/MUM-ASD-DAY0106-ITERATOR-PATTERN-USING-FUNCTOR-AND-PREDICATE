/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jsingh
 */
public interface MyFunctorInterface<T> {
    public void compute(T t);
    public T getValue();
}
