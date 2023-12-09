package org.example.Iterator;

public class Inventory implements AvailableIterableCollections, ShopAvailableIterableCollections, IterableCollections {
    @Override
    public AvailableProductIterator createIterator() {
        return new AvailableProductIterator(this);
    }

    public ShopAvailableProductIterator createIterator2() {
        return new ShopAvailableProductIterator(this);
    }

    public DamagedAvailableProductIterator createIterator3() {
        return new DamagedAvailableProductIterator(this);
    }

}
