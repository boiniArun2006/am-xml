package com.applovin.impl.sdk;

import com.applovin.impl.g7;
import com.applovin.impl.sdk.a;
import com.applovin.impl.t1;
import com.applovin.impl.x4;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.applovin.impl.sdk.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class C1800b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f50123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f50124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f50125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g7 f50126d;

    public static C1800b a(t1 t1Var, a.InterfaceC0708a interfaceC0708a, C1802k c1802k) {
        C1800b c1800b = new C1800b(t1Var, interfaceC0708a, c1802k);
        c1800b.a(t1Var.getTimeToLiveMillis());
        return c1800b;
    }

    public t1 b() {
        return (t1) this.f50124b.get();
    }

    private C1800b(t1 t1Var, a.InterfaceC0708a interfaceC0708a, C1802k c1802k) {
        this.f50124b = new WeakReference(t1Var);
        this.f50125c = new WeakReference(interfaceC0708a);
        this.f50123a = c1802k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        d();
        this.f50123a.f().a(this);
    }

    public void a(long j2) {
        a();
        if (((Boolean) this.f50123a.a(x4.b1)).booleanValue() || !this.f50123a.m0().isApplicationPaused()) {
            this.f50126d = g7.a(j2, this.f50123a, new Runnable() { // from class: com.applovin.impl.sdk.C
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49999n.c();
                }
            });
        }
    }

    public void d() {
        a();
        t1 t1VarB = b();
        if (t1VarB != null) {
            t1VarB.setExpired();
            a.InterfaceC0708a interfaceC0708a = (a.InterfaceC0708a) this.f50125c.get();
            if (interfaceC0708a == null) {
                return;
            }
            interfaceC0708a.onAdExpired(t1VarB);
        }
    }

    public void a() {
        g7 g7Var = this.f50126d;
        if (g7Var != null) {
            g7Var.a();
            this.f50126d = null;
        }
    }
}
