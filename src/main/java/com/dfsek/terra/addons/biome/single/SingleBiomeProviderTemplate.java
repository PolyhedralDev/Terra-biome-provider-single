/*
 * Copyright (c) 2020-2021 Polyhedral Development
 *
 * The Terra Core Addons are licensed under the terms of the MIT License. For more details,
 * reference the LICENSE file in this module's root directory.
 */

package com.dfsek.terra.addons.biome.single;

import com.dfsek.tectonic.annotations.Value;
import com.dfsek.tectonic.loading.object.ObjectTemplate;

import com.dfsek.terra.api.config.meta.Meta;
import com.dfsek.terra.api.world.biome.TerraBiome;
import com.dfsek.terra.api.world.biome.generation.BiomeProvider;


public class SingleBiomeProviderTemplate implements ObjectTemplate<BiomeProvider> {
    @Value("biome")
    private @Meta TerraBiome biome;
    
    @Override
    public BiomeProvider get() {
        return new SingleBiomeProvider(biome);
    }
}
