package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import com.fyber.inneractive.sdk.util.g1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f53990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f53991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f53992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g f53993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f53994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.click.o f53995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0 f53996g;

    public y(b0 b0Var, Context context, String str, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar, boolean z2, com.fyber.inneractive.sdk.click.o oVar) {
        this.f53996g = b0Var;
        this.f53990a = context;
        this.f53991b = str;
        this.f53992c = g1Var;
        this.f53993d = gVar;
        this.f53994e = z2;
        this.f53995f = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f53996g.a(this.f53990a, this.f53991b, this.f53992c, this.f53993d, this.f53994e, this.f53995f);
    }
}
