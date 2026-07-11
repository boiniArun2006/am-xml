package com.safedk.android;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class SafeDKApplication extends Application {
    private static Context context;
    private static final Handler mHandler = new Handler();

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        Logger.d("SafeDKApplication", "onCreate");
        context = getApplicationContext();
        SafeDK.a(getApplicationContext(), this);
    }

    public static Context getAppContext() {
        return context;
    }

    public static void runOnUiThread(Runnable runnable) {
        Logger.d("SafeDKApplication", "runOnUiThread started");
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            mHandler.post(runnable);
        }
    }
}
