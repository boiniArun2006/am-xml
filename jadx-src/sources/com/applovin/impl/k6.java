package com.applovin.impl;

import com.applovin.impl.d6;
import com.applovin.impl.o7;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
class k6 extends AbstractRunnableC1782i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s7 f48820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinAdLoadListener f48821h;

    k6(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, C1802k c1802k) {
        super("TaskRenderVastAd", c1802k);
        this.f48821h = appLovinAdLoadListener;
        this.f48820g = s7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Rendering VAST ad...");
        }
        int size = this.f48820g.a().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String strA = "";
        x7 x7VarA = null;
        b8 b8VarA = null;
        r7 r7VarA = null;
        q7 q7VarA = null;
        String strA2 = "";
        for (p8 p8Var : this.f48820g.a()) {
            if (a8.b(p8Var)) {
                str = "Wrapper";
            } else {
                str = "InLine";
            }
            p8 p8VarB = p8Var.b(str);
            if (p8VarB != null) {
                p8 p8VarB2 = p8VarB.b("AdSystem");
                if (p8VarB2 != null) {
                    x7VarA = x7.a(p8VarB2, x7VarA, this.f48733a);
                }
                strA = a8.a(p8VarB, "AdTitle", strA);
                strA2 = a8.a(p8VarB, "Description", strA2);
                a8.a(p8VarB.a("Impression"), hashSet, this.f48820g, this.f48733a);
                p8 p8VarC = p8VarB.c("ViewableImpression");
                if (p8VarC != null) {
                    a8.a(p8VarC.a("Viewable"), hashSet, this.f48820g, this.f48733a);
                }
                p8 p8VarB3 = p8VarB.b("AdVerifications");
                if (p8VarB3 != null) {
                    q7VarA = q7.a(p8VarB3, q7VarA, this.f48820g, this.f48733a);
                }
                a8.a(p8VarB.a("Error"), hashSet2, this.f48820g, this.f48733a);
                p8 p8VarC2 = p8VarB.c("Creatives");
                if (p8VarC2 != null) {
                    for (p8 p8Var2 : p8VarC2.b()) {
                        p8 p8VarC3 = p8Var2.c("Linear");
                        if (p8VarC3 != null) {
                            b8VarA = b8.a(p8VarC3, b8VarA, this.f48820g, this.f48733a);
                        } else {
                            p8 p8VarB4 = p8Var2.b("CompanionAds");
                            if (p8VarB4 != null) {
                                p8 p8VarB5 = p8VarB4.b("Companion");
                                if (p8VarB5 != null) {
                                    r7VarA = r7.a(p8VarB5, r7VarA, this.f48820g, this.f48733a);
                                }
                            } else if (C1804o.a()) {
                                this.f48735c.b(this.f48734b, "Received and will skip rendering for an unidentified creative: " + p8Var2);
                            }
                        }
                    }
                }
            } else if (C1804o.a()) {
                this.f48735c.b(this.f48734b, "Did not find wrapper or inline response for node: " + p8Var);
            }
        }
        o7 o7VarA = new o7.b().a(this.f48733a).a(this.f48820g.b()).b(this.f48820g.e()).a(this.f48820g.c()).b(strA).a(strA2).a(x7VarA).a(b8VarA).a(r7VarA).a(q7VarA).b(hashSet).a(q7VarA).a(hashSet2).a();
        t7 t7VarC = a8.c(o7VarA);
        if (t7VarC == null) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Finished rendering VAST ad: " + o7VarA);
            }
            o7VarA.getAdEventTracker().e();
            this.f48733a.q0().a((AbstractRunnableC1782i5) new n5(o7VarA, this.f48733a, this.f48821h), d6.b.CACHING);
            return;
        }
        a8.a(this.f48820g, this.f48821h, t7VarC, -6, this.f48733a);
    }
}
