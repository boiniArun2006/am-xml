package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeSet f56067a = new TreeSet(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f56068b;

    public final void a(l lVar, long j2) {
        while (this.f56068b + j2 > 10485760) {
            try {
                g gVar = (g) this.f56067a.first();
                synchronized (lVar) {
                    lVar.a(gVar, true);
                }
            } catch (a unused) {
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        g gVar = (g) obj;
        g gVar2 = (g) obj2;
        long j2 = gVar.f56055f;
        long j3 = gVar2.f56055f;
        if (j2 - j3 != 0) {
            return j2 < j3 ? -1 : 1;
        }
        if (!gVar.f56050a.equals(gVar2.f56050a)) {
            return gVar.f56050a.compareTo(gVar2.f56050a);
        }
        long j4 = gVar.f56051b - gVar2.f56051b;
        if (j4 == 0) {
            return 0;
        }
        return j4 < 0 ? -1 : 1;
    }
}
