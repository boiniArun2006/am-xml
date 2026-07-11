package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f54921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f54922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f54923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f54924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f54925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f54926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f54927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f54928j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f54929k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f54930l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f54931m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f54932n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f54933o;

    public d(int i2, String str, long j2, long j3, boolean z2, int i3, int i5, int i7, long j4, boolean z3, boolean z4, c cVar, List list, List list2) {
        super(str);
        this.f54920b = i2;
        this.f54922d = j3;
        this.f54923e = z2;
        this.f54924f = i3;
        this.f54925g = i5;
        this.f54926h = i7;
        this.f54927i = j4;
        this.f54928j = z3;
        this.f54929k = z4;
        this.f54930l = cVar;
        this.f54931m = Collections.unmodifiableList(list);
        if (!list.isEmpty()) {
            c cVar2 = (c) list.get(list.size() - 1);
            this.f54933o = cVar2.f54914d + cVar2.f54912b;
        } else {
            this.f54933o = 0L;
        }
        if (j2 == -9223372036854775807L) {
            j2 = -9223372036854775807L;
        } else if (j2 < 0) {
            j2 += this.f54933o;
        }
        this.f54921c = j2;
        this.f54932n = Collections.unmodifiableList(list2);
    }
}
