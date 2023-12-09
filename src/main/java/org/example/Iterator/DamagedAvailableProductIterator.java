package org.example.Iterator;

import java.util.List;

public class DamagedAvailableProductIterator implements Iterator{
    private inventory;
    private int index;

    public DamagedAvailableProductIterator(Inventory inventory) {
        this.inventory = inventory;
        this.index = 0;
    }

    @Override
    public Iterator getNext() {
        return inventory.getDamagedAvailableProducts().get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < inventory.getDamagedAvailableProducts().size();
    }
}
