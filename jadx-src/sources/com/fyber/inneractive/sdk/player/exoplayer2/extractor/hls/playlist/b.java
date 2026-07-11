package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import com.fyber.inneractive.sdk.player.exoplayer2.o;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class b extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f54906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f54907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f54908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f54909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f54910f;

    public b(String str, List list, List list2, List list3, o oVar, List list4) {
        List listUnmodifiableList;
        super(str);
        this.f54906b = Collections.unmodifiableList(list);
        this.f54907c = Collections.unmodifiableList(list2);
        this.f54908d = Collections.unmodifiableList(list3);
        this.f54909e = oVar;
        if (list4 != null) {
            listUnmodifiableList = Collections.unmodifiableList(list4);
        } else {
            listUnmodifiableList = null;
        }
        this.f54910f = listUnmodifiableList;
    }
}
