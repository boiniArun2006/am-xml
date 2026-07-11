package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C;
import com.google.android.play.integrity.internal.DAz;
import com.google.android.play.integrity.internal.Pl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class al implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pl f59458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pl f59459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Pl f59460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Pl f59461d;

    public al(Pl pl, Pl pl3, Pl pl4, Pl pl5) {
        this.f59458a = pl;
        this.f59459b = pl3;
        this.f59460c = pl4;
        this.f59461d = pl5;
    }

    @Override // com.google.android.play.integrity.internal.Pl
    public final /* bridge */ /* synthetic */ Object a() {
        return new aj((Context) this.f59458a.a(), (DAz) this.f59459b.a(), ((au) this.f59460c).a(), new i());
    }
}
