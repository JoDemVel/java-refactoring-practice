package com.gildedrose.model;

public class AgedBrie extends ItemUpdater {

    public AgedBrie(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        increaseQuality();
        decreaseSellIn();
        if (isExpired()) {
            increaseQuality();
        }
    }
}
