package com.github.woodyhi.context;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * This class provides application context.
 * 测试
 */
public class ContextProvider extends ContentProvider {

    private static Context appContext = null;

    /**
     * @return the application context.
     * <p>
     * Or return BaseApplication if declared at AndroidManifest.xml:
     * {@code
     * <application android:name=".BaseApplication">
     * }
     * </p>
     */
    public static Context get() {
        return appContext;
    }

    /**
     * @param <T> T is android.app.Application or its derived class.
     *            <p>
     *            Or T can be BaseApplication if declared at AndroidManifest.xml:
     *            {@code
     *            <application android:name=".BaseApplication">
     *            }
     *            </p>
     * @return T android.app.Application or its derived class.
     */
    @SuppressWarnings("unchecked")
    public static <T extends Application> T getApplication() {
        return appContext == null ? null : (T) appContext;
    }

    @Override
    public boolean onCreate() {
        appContext = getContext() == null ? null : getContext().getApplicationContext();
        return false;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }
}
