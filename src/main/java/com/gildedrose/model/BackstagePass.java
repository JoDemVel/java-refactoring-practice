package com.gildedrose.model;

import com.gildedrose.utils.ItemParameters;

public class BackstagePass extends ItemUpdater {

    public BackstagePass(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        increaseQuality();
        if (isAvailableToMediumIncrement()) {
            increaseQuality();
        }
        if (isAvailableToHighIncrement()) {
            increaseQuality();
        }
        decreaseSellIn();
        if (isExpired()) {
            this.item.quality = 0;
        }
    }

    private boolean isAvailableToMediumIncrement() {
        return this.item.sellIn <= ItemParameters.DAYS_TO_MEDIUM_INCREMENT;
    }

    private boolean isAvailableToHighIncrement() {
        return this.item.sellIn <= ItemParameters.DAYS_TO_HIGH_INCREMENT;
    }
}
