
package org.example.Iterator;

/**
 *
 * @author user
 */
public class AvailableProductIterator implements Iterator{
    private Inventory inventory;
    private int iterationState;
    
    public AvailableProductIterator(Inventory i){inventory = i;}

    @Override
    public Iterator getNext() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
