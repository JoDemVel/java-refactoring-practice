package com.gildedrose;

import com.gildedrose.factory.ItemFactory;
import com.gildedrose.model.ItemUpdater;
import com.gildedrose.model.Item;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class GildedRose {
    private List<ItemUpdater> items;

    public GildedRose(Item[] items) {
        this.items = Arrays.stream(items)
                .map(ItemFactory::createItem)
                .collect(Collectors.toList());
    }

    public void updateQuality() {
        for (ItemUpdater item : items) {
            item.updateQuality();
        }
    }
}