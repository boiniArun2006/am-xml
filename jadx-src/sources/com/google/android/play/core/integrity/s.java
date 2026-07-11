package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C;
import com.google.android.play.integrity.internal.Pl;
import com.google.android.play.integrity.internal.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f59545a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pl f59546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Pl f59547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Pl f59548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Pl f59549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Pl f59550f;

    public final IntegrityManager a() {
        return (IntegrityManager) this.f59550f.a();
    }

    /* synthetic */ s(Context context, r rVar) {
        C cN = com.google.android.play.integrity.internal.o.n(context);
        this.f59546b = cN;
        Pl plN = aC.n(ac.f59436a);
        this.f59547c = plN;
        au auVar = new au(cN, l.f59538a);
        this.f59548d = auVar;
        Pl plN2 = aC.n(new al(cN, plN, auVar, l.f59538a));
        this.f59549e = plN2;
        this.f59550f = aC.n(new ab(plN2));
    }
}
