package com.gildedrose.model;

import com.gildedrose.strategy.UpdatableItem;
import com.gildedrose.utils.ItemParameters;

public abstract class ItemUpdater implements UpdatableItem {
    protected Item item;

    public ItemUpdater(Item item) {
        this.item = item;
    }

    protected void decreaseSellIn() {
        this.item.sellIn--;
    }

    protected void increaseQuality() {
        if (canIncreaseQuality()) {
            this.item.quality++;
        }
    }

    protected void decreaseQuality() {
        if (canDecreaseQuality()) {
            this.item.quality--;
        }
    }

    protected boolean isExpired() {
        return this.item.sellIn < ItemParameters.MIN_SELL_IN;
    }

    private boolean canIncreaseQuality(){
        return this.item.quality < ItemParameters.MAX_QUALITY;
    }

    private boolean canDecreaseQuality(){
        return this.item.quality > ItemParameters.MIN_QUALITY;
    }

    @Override
    public abstract void updateQuality();
}