package com.facebook.common.time;

import Hh.Ml;
import Jv.n;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Ml
public class RealtimeSinceBootClock implements n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final RealtimeSinceBootClock f52364n = new RealtimeSinceBootClock();

    @Ml
    public static RealtimeSinceBootClock get() {
        return f52364n;
    }

    @Override // Jv.n
    public long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }

    private RealtimeSinceBootClock() {
    }

    @Override // Jv.n
    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
