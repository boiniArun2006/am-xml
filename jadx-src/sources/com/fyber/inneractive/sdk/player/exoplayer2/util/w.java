package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.Trace;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class w {
    public static void a(String str) {
        if (z.f56234a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void a() {
        if (z.f56234a >= 18) {
            Trace.endSection();
        }
    }
}
