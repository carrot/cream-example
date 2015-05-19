package com.carrotcreative.cream_example.app.cache.params;

import com.carrotcreative.cream.params.LoaderParams;

public class GithubUserLoaderParams implements LoaderParams
{
    private String mUserId;

    public GithubUserLoaderParams(String userId)
    {
        mUserId = userId;
    }

    public String getUserId()
    {
        return mUserId;
    }

    @Override
    public String getIdentifier()
    {
        return mUserId;
    }
}
