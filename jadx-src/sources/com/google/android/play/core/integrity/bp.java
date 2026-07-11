package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C;
import com.google.android.play.integrity.internal.DAz;
import com.google.android.play.integrity.internal.Pl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class bp implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pl f59522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pl f59523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Pl f59524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Pl f59525d;

    public bp(Pl pl, Pl pl3, Pl pl4, Pl pl5) {
        this.f59522a = pl;
        this.f59523b = pl3;
        this.f59524c = pl4;
        this.f59525d = pl5;
    }

    @Override // com.google.android.play.integrity.internal.Pl
    public final /* bridge */ /* synthetic */ Object a() {
        return new bn((Context) this.f59522a.a(), (DAz) this.f59523b.a(), ((au) this.f59524c).a(), new j());
    }
}
