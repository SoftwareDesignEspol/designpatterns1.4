package org.example.Iterator;

public class Inventory implements AvailableIterableCollections, ShopAvailableIterableCollections, IterableCollections {
    @Override
    public AvailableProductIterator createIterator() {
        return new AvailableProductIterator(this);
    }

    public ShopAvailableProductIterator createIterator() {
        return new ShopAvailableProductIterator(this);
    }

    public DamagedAvailableProductIterator createIterator() {
        return new DamagedAvailableProductIterator(this);
    }

}
