package com.facebook.appevents;

import android.preference.PreferenceManager;
import android.util.Log;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class w6 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static volatile boolean f52337O;
    private static String nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w6 f52338n = new w6();
    private static final String rl = w6.class.getSimpleName();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final ReentrantReadWriteLock f52339t = new ReentrantReadWriteLock();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O() {
        f52338n.t();
    }

    public static final void nr() {
        if (f52337O) {
            return;
        }
        rv6.rl.rl().execute(new Runnable() { // from class: com.facebook.appevents.n
            @Override // java.lang.Runnable
            public final void run() {
                w6.O();
            }
        });
    }

    public static final String rl() {
        if (!f52337O) {
            Log.w(rl, "initStore should have been called before calling setUserID");
            f52338n.t();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f52339t;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str = nr;
            reentrantReadWriteLock.readLock().unlock();
            return str;
        } catch (Throwable th) {
            f52339t.readLock().unlock();
            throw th;
        }
    }

    private final void t() {
        if (f52337O) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f52339t;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!f52337O) {
                nr = PreferenceManager.getDefaultSharedPreferences(com.facebook.s4.qie()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                f52337O = true;
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            f52339t.writeLock().unlock();
            throw th;
        }
    }

    private w6() {
    }
}
