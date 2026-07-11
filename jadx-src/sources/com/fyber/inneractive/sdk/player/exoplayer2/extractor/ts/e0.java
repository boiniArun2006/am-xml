package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f55500e;

    public final void a() {
        int i2 = this.f55499d;
        this.f55499d = i2 == Integer.MIN_VALUE ? this.f55497b : i2 + this.f55498c;
        this.f55500e = this.f55496a + this.f55499d;
    }

    public final void b() {
        if (this.f55499d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public e0(int i2, int i3, int i5) {
        String str;
        if (i2 != Integer.MIN_VALUE) {
            str = i2 + "/";
        } else {
            str = "";
        }
        this.f55496a = str;
        this.f55497b = i3;
        this.f55498c = i5;
        this.f55499d = Integer.MIN_VALUE;
    }
}
