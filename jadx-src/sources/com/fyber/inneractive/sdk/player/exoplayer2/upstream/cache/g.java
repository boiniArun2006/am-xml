package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.io.File;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class g implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f56051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f56052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f56053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f56054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f56055f;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (!this.f56050a.equals(gVar.f56050a)) {
            return this.f56050a.compareTo(gVar.f56050a);
        }
        long j2 = this.f56051b - gVar.f56051b;
        if (j2 == 0) {
            return 0;
        }
        return j2 < 0 ? -1 : 1;
    }

    public g(String str, long j2, long j3, long j4, File file) {
        boolean z2;
        this.f56050a = str;
        this.f56051b = j2;
        this.f56052c = j3;
        if (file != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f56053d = z2;
        this.f56054e = file;
        this.f56055f = j4;
    }
}
