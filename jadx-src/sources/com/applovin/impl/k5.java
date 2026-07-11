package com.applovin.impl;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class k5 extends AbstractRunnableC1782i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f48818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Activity f48819h;

    public k5(List list, Activity activity, C1802k c1802k) {
        super("TaskAutoInitAdapters", c1802k, true);
        this.f48818g = list;
        this.f48819h = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f48818g.size() > 0) {
            if (C1804o.a()) {
                C1804o c1804o = this.f48735c;
                String str = this.f48734b;
                StringBuilder sb = new StringBuilder();
                sb.append("Auto-initing ");
                sb.append(this.f48818g.size());
                sb.append(" adapters");
                sb.append(this.f48733a.s0().c() ? " in test mode" : "");
                sb.append("...");
                c1804o.a(str, sb.toString());
            }
            if (TextUtils.isEmpty(this.f48733a.V())) {
                this.f48733a.O0();
            } else if (!this.f48733a.G0()) {
                C1804o.h("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f48733a.V());
            }
            if (this.f48819h == null) {
                C1804o.h("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
            }
            for (final k3 k3Var : this.f48818g) {
                if (k3Var.s()) {
                    this.f48733a.q0().a(new Runnable() { // from class: com.applovin.impl.Ogx
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f47800n.a(k3Var);
                        }
                    }, d6.b.MEDIATION);
                } else {
                    this.f48733a.O();
                    if (C1804o.a()) {
                        this.f48733a.O().a(this.f48734b, "Skipping eager auto-init for adapter " + k3Var);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(k3 k3Var) {
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Auto-initing adapter: " + k3Var);
        }
        this.f48733a.S().a(k3Var, this.f48819h);
    }
}
