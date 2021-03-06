package com.carrotcreative.cream_example.app.cache.loaders;

import android.content.Context;

import com.carrotcreative.cream.loaders.single.SingleLoader;
import com.carrotcreative.cream.params.LoaderParams;
import com.carrotcreative.cream.strategies.generic.CacheStrategy;

import java.io.Serializable;

/**
 * A loader with our default settings,
 * feel free to implement more or less methods here.
 */
public abstract class DefaultLoader<Params extends LoaderParams, Content extends Serializable> extends SingleLoader<Params, Content> {

    public DefaultLoader(Context context, CacheStrategy<Params, Content> cacheStrategy) {
        super(context, cacheStrategy);
    }

    @Override
    protected String getDirectory() {
        return "/github";
    }

    @Override
    protected long getExpirationMinutes() {
        return 10;
    }

    @Override
    protected long getTrashMinutes() {
        return 10;
    }

    @Override
    public boolean shouldCache(LoaderParams loaderParams) {
        return true;
    }

}