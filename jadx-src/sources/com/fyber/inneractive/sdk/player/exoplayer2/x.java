package com.fyber.inneractive.sdk.player.exoplayer2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f56320a = new u();

    public abstract int a();

    public abstract int a(Object obj);

    public abstract v a(int i2, v vVar, boolean z2);

    public final w a(int i2, w wVar) {
        return a(i2, wVar, 0L);
    }

    public abstract w a(int i2, w wVar, long j2);

    public abstract int b();

    public final boolean c() {
        if (b() == 0) {
            return true;
        }
        return false;
    }
}
