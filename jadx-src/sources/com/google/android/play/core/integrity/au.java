package com.google.android.play.core.integrity;

import com.google.android.play.integrity.internal.C;
import com.google.android.play.integrity.internal.Pl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class au implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pl f59478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pl f59479b;

    public au(Pl pl, Pl pl3) {
        this.f59478a = pl;
        this.f59479b = pl3;
    }

    @Override // com.google.android.play.integrity.internal.Pl
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final at a() {
        return new at(this.f59478a, this.f59479b);
    }
}
