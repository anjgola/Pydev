/*
 * Created on 24/09/2005
 */
package org.python.pydev.core;

/**
 * Defines a tuple of some object, adding equals and hashCode operations
 * 
 * @author Fabio
 */
public class Tuple<X> {

    public X o1;
    public X o2;

    public Tuple(X o1, X o2) {
        this.o1 = o1;
        this.o2 = o2;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Tuple)){
            return false;
        }
        
        Tuple t2 = (Tuple) obj;
        if(!o1.equals(t2.o1)){
            return false;
        }
        if(!o2.equals(t2.o2)){
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return o1.hashCode() * o2.hashCode();
    }
}
