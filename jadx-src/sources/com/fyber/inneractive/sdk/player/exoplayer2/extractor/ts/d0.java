package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f55492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f55493c;

    public d0(int i2, String str, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f55491a = str;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f55492b = listUnmodifiableList;
        this.f55493c = bArr;
    }
}
