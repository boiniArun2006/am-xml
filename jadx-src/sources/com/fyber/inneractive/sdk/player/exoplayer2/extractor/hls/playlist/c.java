package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class c implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f54912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f54914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f54915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f54916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f54917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f54918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f54919i;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l2 = (Long) obj;
        if (this.f54914d > l2.longValue()) {
            return 1;
        }
        return this.f54914d < l2.longValue() ? -1 : 0;
    }

    public c(String str, long j2, int i2, long j3, boolean z2, String str2, String str3, long j4, long j5) {
        this.f54911a = str;
        this.f54912b = j2;
        this.f54913c = i2;
        this.f54914d = j3;
        this.f54915e = z2;
        this.f54916f = str2;
        this.f54917g = str3;
        this.f54918h = j4;
        this.f54919i = j5;
    }
}
