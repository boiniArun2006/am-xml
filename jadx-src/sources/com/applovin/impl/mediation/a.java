package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.AbstractC1772b;
import com.applovin.impl.C1773c;
import com.applovin.impl.c3;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class a extends AbstractC1772b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1773c f49073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1804o f49074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f49075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC0703a f49076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c3 f49077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f49078f;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.a$a, reason: collision with other inner class name */
    public interface InterfaceC0703a {
        void b(c3 c3Var);
    }

    public void a(c3 c3Var, InterfaceC0703a interfaceC0703a) {
        if (C1804o.a()) {
            this.f49074b.a("AdActivityObserver", "Starting for ad " + c3Var.getAdUnitId() + "...");
        }
        a();
        this.f49076d = interfaceC0703a;
        this.f49077e = c3Var;
        this.f49073a.a(this);
    }

    a(C1802k c1802k) {
        this.f49074b = c1802k.O();
        this.f49073a = c1802k.e();
        this.f49075c = n7.a(C1802k.o(), "AdActivityObserver", c1802k);
    }

    @Override // com.applovin.impl.AbstractC1772b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass().getName().equals(this.f49075c) && this.f49077e.y0()) {
            if (C1804o.a()) {
                this.f49074b.a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
            }
            if (this.f49076d != null) {
                if (C1804o.a()) {
                    this.f49074b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f49076d.b(this.f49077e);
            }
            a();
            return;
        }
        if (this.f49078f == null) {
            this.f49078f = activity.getClass().getName();
            if (C1804o.a()) {
                this.f49074b.a("AdActivityObserver", "Started tracking ad Activity: " + this.f49078f);
            }
        }
    }

    @Override // com.applovin.impl.AbstractC1772b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (activity.getClass().getName().equals(this.f49078f)) {
            if (C1804o.a()) {
                this.f49074b.a("AdActivityObserver", "Ad Activity destroyed: " + this.f49078f);
            }
            if (this.f49076d != null) {
                if (C1804o.a()) {
                    this.f49074b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f49076d.b(this.f49077e);
            }
            a();
        }
    }

    public void a() {
        if (C1804o.a()) {
            this.f49074b.a("AdActivityObserver", "Cancelling...");
        }
        this.f49073a.b(this);
        this.f49076d = null;
        this.f49077e = null;
        this.f49078f = null;
    }
}
