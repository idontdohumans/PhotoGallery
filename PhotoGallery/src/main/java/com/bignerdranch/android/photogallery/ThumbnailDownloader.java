package com.bignerdranch.android.photogallery;

import android.os.HandlerThread;
import android.util.Log;

/**
 * Created by panda on 7/9/13.
 */
public class ThumbnailDownloader<Token> extends HandlerThread {
    private static final String TAG = "ThumbnailDownloader";

    public ThumbnailDownloader() {
        super(TAG);
    }

    public void queueThumbnail(Token token, String url) {
        Log.i(TAG, "Got an URL: " + url);
    }
}
