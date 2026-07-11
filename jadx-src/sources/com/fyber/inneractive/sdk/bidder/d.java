package com.fyber.inneractive.sdk.bidder;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.a1;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f53133A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Boolean f53134B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f53135C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f53136D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public InneractiveUserConfig.Gender f53137E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f53138F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public String f53139G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f53140H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f53141I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f53142J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f53143K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Boolean f53144L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.serverapi.c f53145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f53146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f53147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f53148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f53149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f53150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f53151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f53152h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f53153i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f53154j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f53155k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Long f53156l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f53157m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f53158n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q f53159o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f53160p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f53161q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f0 f53162r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Boolean f53163s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Boolean f53164t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Boolean f53165u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f53166v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Boolean f53167w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Boolean f53168x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f53169y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f53170z;

    public d(com.fyber.inneractive.sdk.serverapi.c cVar) {
        String str;
        this.f53145a = cVar;
        if (TextUtils.isEmpty(this.f53146b)) {
            com.fyber.inneractive.sdk.util.r.f57025a.execute(new c(this));
        }
        StringBuilder sb = new StringBuilder("2.2.0-Android-8.4.3");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb.append('-');
            sb.append(InneractiveAdManager.getDevPlatform());
        }
        this.f53147c = sb.toString();
        this.f53148d = com.fyber.inneractive.sdk.util.o.f57018a.getPackageName();
        this.f53149e = com.fyber.inneractive.sdk.util.k.j();
        this.f53150f = com.fyber.inneractive.sdk.util.k.l();
        this.f53157m = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.e());
        this.f53158n = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
        com.fyber.inneractive.sdk.serverapi.a aVar = com.fyber.inneractive.sdk.serverapi.b.f56911a;
        try {
            Class.forName("com.unity3d.player.UnityPlayer");
            str = "unity3d";
        } catch (Throwable unused) {
            str = "native";
        }
        this.f53159o = !str.equals("native") ? !str.equals("unity3d") ? q.UNRECOGNIZED : q.UNITY3D : q.NATIVE;
        this.f53162r = (!com.fyber.inneractive.sdk.util.s.a() || IAConfigManager.f53260M.f53291q) ? f0.SECURE : f0.UNSECURE;
        IAConfigManager iAConfigManager = IAConfigManager.f53260M;
        if (TextUtils.isEmpty(iAConfigManager.f53288n)) {
            this.f53140H = iAConfigManager.f53286l;
        } else {
            this.f53140H = iAConfigManager.f53286l + "_" + iAConfigManager.f53288n;
        }
        this.f53143K = InneractiveAdManager.isCurrentUserAChild();
        a();
        this.f53164t = com.fyber.inneractive.sdk.serverapi.b.g();
        this.f53134B = com.fyber.inneractive.sdk.serverapi.b.i();
        this.f53167w = com.fyber.inneractive.sdk.serverapi.b.f();
        this.f53168x = com.fyber.inneractive.sdk.serverapi.b.l();
        this.f53169y = com.fyber.inneractive.sdk.serverapi.b.k();
    }

    public final void a() {
        this.f53145a.getClass();
        IAConfigManager iAConfigManager = IAConfigManager.f53260M;
        this.f53151g = iAConfigManager.f53289o;
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            this.f53145a.getClass();
            this.f53152h = com.fyber.inneractive.sdk.util.k.i();
            this.f53153i = this.f53145a.a();
            String str = this.f53145a.f56916b;
            this.f53154j = str == null ? "" : str.substring(0, Math.min(3, str.length()));
            String str2 = this.f53145a.f56916b;
            this.f53155k = str2 != null ? str2.substring(Math.min(3, str2.length())) : "";
            this.f53145a.getClass();
            a1 a1VarA = a1.a();
            IAlog.a("ExchangeRequestParamsProvider: getNetwork : type: %s value: %s", a1VarA, a1VarA.b());
            this.f53161q = a1VarA.b();
            int i2 = com.fyber.inneractive.sdk.config.k.f53392a;
            String property = System.getProperty("ia.testEnvironmentConfiguration.device");
            if (TextUtils.isEmpty(property)) {
                com.fyber.inneractive.sdk.config.v vVar = com.fyber.inneractive.sdk.config.u.f53482a.f53490b;
                property = vVar != null ? vVar.f53486a : null;
            }
            this.f53133A = property;
            this.f53139G = iAConfigManager.f53284j.getZipCode();
        }
        this.f53137E = iAConfigManager.f53284j.getGender();
        this.f53136D = iAConfigManager.f53284j.getAge();
        this.f53156l = com.fyber.inneractive.sdk.serverapi.b.e();
        this.f53145a.getClass();
        ArrayList arrayList = iAConfigManager.f53290p;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f53160p = com.fyber.inneractive.sdk.util.o.a(arrayList);
        }
        this.f53135C = com.fyber.inneractive.sdk.serverapi.b.b();
        this.f53166v = com.fyber.inneractive.sdk.serverapi.b.h().booleanValue();
        this.f53170z = com.fyber.inneractive.sdk.serverapi.b.c().intValue();
        this.f53138F = iAConfigManager.f53285k;
        this.f53163s = com.fyber.inneractive.sdk.serverapi.b.m();
        if (TextUtils.isEmpty(iAConfigManager.f53288n)) {
            this.f53140H = iAConfigManager.f53286l;
        } else {
            this.f53140H = iAConfigManager.f53286l + "_" + iAConfigManager.f53288n;
        }
        this.f53165u = com.fyber.inneractive.sdk.serverapi.b.n();
        iAConfigManager.f53266D.n();
        com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.f53266D.f54026p;
        this.f53141I = lVar != null ? lVar.f74139a.i() : null;
        com.fyber.inneractive.sdk.ignite.l lVar2 = iAConfigManager.f53266D.f54026p;
        this.f53142J = lVar2 != null ? lVar2.f74139a.d() : null;
        this.f53145a.getClass();
        this.f53157m = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.e());
        this.f53145a.getClass();
        this.f53158n = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
        this.f53144L = com.fyber.inneractive.sdk.serverapi.b.j();
    }
}
