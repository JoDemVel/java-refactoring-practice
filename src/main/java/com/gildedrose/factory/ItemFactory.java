package com.gildedrose.factory;

import com.gildedrose.model.Item;
import com.gildedrose.model.*;
import com.gildedrose.utils.ItemTypes;

public class ItemFactory {
    public static ItemUpdater createItem(Item item) {
        switch (item.name) {
            case ItemTypes.AGED_BRIE:
                return new AgedBrie(item);
            case ItemTypes.BACKSTAGE_PASSES:
                return new BackstagePass(item);
            case ItemTypes.SULFURAS:
                return new Sulfuras(item);
            default:
                return new NormalItem(item);
        }
    }
}