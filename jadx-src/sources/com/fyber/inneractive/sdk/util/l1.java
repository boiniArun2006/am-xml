package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class l1 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f57010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f57011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f57012c;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f57010a.mPriority.compareTo(((l1) obj).f57010a.mPriority);
    }

    public l1(k1 k1Var, Uri uri, List list) {
        this.f57010a = k1Var;
        this.f57011b = uri;
        this.f57012c = list;
    }
}
