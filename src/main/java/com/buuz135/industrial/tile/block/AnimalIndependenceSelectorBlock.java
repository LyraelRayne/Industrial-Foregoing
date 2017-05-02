package com.buuz135.industrial.tile.block;

import com.buuz135.industrial.tile.animal.AnimalIndependenceSelectorTile;
import net.minecraft.block.material.Material;

public class AnimalIndependenceSelectorBlock extends CustomOrientedBlock<AnimalIndependenceSelectorTile> {

    public AnimalIndependenceSelectorBlock() {
        super("animal_independence_selector", AnimalIndependenceSelectorTile.class, Material.ROCK);
    }
}