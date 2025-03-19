package com.gildedrose.model;

public class NormalItem extends ItemUpdater {

    public NormalItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        decreaseQuality();
        decreaseSellIn();
        if (isExpired()) {
            decreaseQuality();
        }
    }
}
