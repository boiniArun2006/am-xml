package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class r implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float f3 = ((s) obj).f56216c;
        float f4 = ((s) obj2).f56216c;
        if (f3 < f4) {
            return -1;
        }
        return f4 < f3 ? 1 : 0;
    }
}
