package com.google.android.play.core.integrity;

import com.google.android.play.integrity.internal.C;
import com.google.android.play.integrity.internal.Pl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class ba implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pl f59487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pl f59488b;

    public ba(Pl pl, Pl pl3) {
        this.f59487a = pl;
        this.f59488b = pl3;
    }

    @Override // com.google.android.play.integrity.internal.Pl
    public final /* bridge */ /* synthetic */ Object a() {
        Pl pl = this.f59488b;
        return new az((bn) this.f59487a.a(), (bt) pl.a());
    }
}
