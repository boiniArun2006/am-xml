package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C;
import com.google.android.play.integrity.internal.Pl;
import com.google.android.play.integrity.internal.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class w implements aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f59552a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pl f59553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Pl f59554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Pl f59555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Pl f59556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Pl f59557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Pl f59558g;

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f59558g.a();
    }

    /* synthetic */ w(Context context, v vVar) {
        C cN = com.google.android.play.integrity.internal.o.n(context);
        this.f59553b = cN;
        Pl plN = aC.n(bb.f59489a);
        this.f59554c = plN;
        au auVar = new au(cN, n.f59543a);
        this.f59555d = auVar;
        Pl plN2 = aC.n(new bp(cN, plN, auVar, n.f59543a));
        this.f59556e = plN2;
        Pl plN3 = aC.n(new bu(plN2));
        this.f59557f = plN3;
        this.f59558g = aC.n(new ba(plN2, plN3));
    }
}
