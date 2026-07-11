package com.google.firebase;

import android.os.SystemClock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Pl {
    public abstract long nr();

    public abstract long rl();

    public abstract long t();

    public static Pl n(long j2, long j3, long j4) {
        return new j(j2, j3, j4);
    }

    public static Pl O() {
        return n(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }
}
