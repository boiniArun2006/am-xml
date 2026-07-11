package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class d extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f56003c = new AtomicReference(new c());

    public static boolean a(int i2, boolean z2) {
        int i3 = i2 & 3;
        if (i3 != 3) {
            return z2 && i3 == 2;
        }
        return true;
    }
}
