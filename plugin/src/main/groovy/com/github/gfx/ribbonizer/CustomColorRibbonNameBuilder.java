package com.github.gfx.ribbonizer;

import com.android.build.gradle.api.ApplicationVariant;
import com.github.gfx.ribbonizer.filter.ColorRibbonFilter;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.function.Consumer;

public class CustomColorRibbonNameBuilder implements FilterBuilder {

    private String nm;
    private String name;

    public CustomColorRibbonNameBuilder(String name, String nm) {
        this.nm = nm;
        this.name = name;
    }

    @Override
    public Consumer<BufferedImage> apply(ApplicationVariant variant, File iconFile) {
        return new ColorRibbonFilter(name, Color.decode(nm));
    }
}
