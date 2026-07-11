package com.facebook.common.time;

import Hh.Ml;
import Jv.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Ml
public class AwakeTimeSinceBootClock implements w6 {

    @Ml
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    @Override // Jv.w6, Jv.n
    @Ml
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @Ml
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    private AwakeTimeSinceBootClock() {
    }

    @Override // Jv.w6, Jv.n
    @Ml
    public long nowNanos() {
        return System.nanoTime();
    }
}
