package androidx.core.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.media3.common.C;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class PendingIntentCompat {

    @RequiresApi
    private static class Api23Impl {
    }

    @RequiresApi
    private static class Api26Impl {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Flags {
    }

    private static class GatedCallback implements Closeable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private boolean f36312O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final CountDownLatch f36313n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private PendingIntent.OnFinished f36314t;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f36312O) {
                this.f36314t = null;
            }
            this.f36313n.countDown();
        }
    }

    static int n(boolean z2, int i2) {
        int i3;
        if (!z2) {
            i3 = C.BUFFER_FLAG_NOT_DEPENDED_ON;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i2;
            }
            i3 = 33554432;
        }
        return i3 | i2;
    }

    public static PendingIntent rl(Context context, int i2, Intent intent, int i3, boolean z2) {
        return PendingIntent.getActivity(context, i2, intent, n(z2, i3));
    }
}
