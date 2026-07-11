package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.activities.InternalStoreWebpageActivity;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f57204a;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.f63176p);
        p0.startActivity(p1);
    }

    public u0(v0 v0Var) {
        this.f57204a = v0Var;
    }

    @JavascriptInterface
    public void onBackButtonPressed() {
        WeakReference weakReference = this.f57204a.f57227q;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((InternalStoreWebpageActivity) this.f57204a.f57227q.get()).finish();
    }

    @JavascriptInterface
    public void onCancelButtonPressed() {
        com.fyber.inneractive.sdk.ignite.m mVar;
        com.fyber.inneractive.sdk.ignite.m mVar2;
        v0 v0Var = this.f57204a;
        v0Var.f57214d = v0Var.f57207B ? com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
        String str = v0Var.f57220j;
        if (str != null) {
            v0Var.f57232v.set(true);
            v0Var.f57231u.set(false);
            com.fyber.inneractive.sdk.ignite.h hVar = v0Var.f57212b;
            r0 r0Var = new r0(v0Var);
            if (!hVar.n() || hVar.o()) {
                for (com.fyber.inneractive.sdk.ignite.r rVar : hVar.f54018h) {
                    if (rVar != null) {
                        rVar.c((hVar.o() ? com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED : com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED).a());
                    }
                }
            } else {
                try {
                    IIgniteServiceAPI iIgniteServiceAPI = hVar.f54012b;
                    Bundle bundle = hVar.f54013c;
                    hVar.f54014d.getClass();
                    iIgniteServiceAPI.cancel(str, bundle, new com.fyber.inneractive.sdk.ignite.a(r0Var));
                } catch (Exception unused) {
                    IAlog.a("Failed to cancel task", new Object[0]);
                    r0Var.a(false);
                }
            }
            com.fyber.inneractive.sdk.util.r.f57026b.postDelayed(new s0(v0Var), 2500L);
            com.fyber.inneractive.sdk.flow.v vVar = v0Var.f57218h;
            if (vVar != null && !v0Var.f57228r && (mVar2 = v0Var.f57214d) != null) {
                v0Var.f57228r = true;
                vVar.a(com.fyber.inneractive.sdk.network.u.IGNITE_FLOW_CANCEL_INSTALL_CLICKED, mVar2);
            }
        }
        v0 v0Var2 = this.f57204a;
        com.fyber.inneractive.sdk.flow.v vVar2 = v0Var2.f57218h;
        if (vVar2 == null || v0Var2.f57228r || (mVar = v0Var2.f57214d) == null) {
            return;
        }
        v0Var2.f57228r = true;
        vVar2.a(com.fyber.inneractive.sdk.network.u.IGNITE_FLOW_CANCEL_INSTALL_CLICKED, mVar);
    }

    @JavascriptInterface
    public void onInstallButtonPressed() {
        com.fyber.inneractive.sdk.ignite.m mVar;
        v0 v0Var = this.f57204a;
        com.fyber.inneractive.sdk.ignite.m mVar2 = v0Var.f57207B ? com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
        v0Var.f57214d = mVar2;
        v0Var.f57212b.a(v0Var.f57213c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f57216f, mVar2, v0Var.f57218h.f53930a));
        v0 v0Var2 = this.f57204a;
        com.fyber.inneractive.sdk.flow.v vVar = v0Var2.f57218h;
        if (vVar == null || v0Var2.f57229s || (mVar = v0Var2.f57214d) == null) {
            return;
        }
        v0Var2.f57229s = true;
        vVar.a(com.fyber.inneractive.sdk.network.u.IGNITE_FLOW_INSTALL_CLICKED, mVar);
    }

    @JavascriptInterface
    public void onNavigatedInsideStorePage() {
        this.f57204a.f57233w = true;
    }

    @JavascriptInterface
    public void onNavigatedToMainPage() {
        this.f57204a.f57233w = false;
    }

    @JavascriptInterface
    public void onOpenButtonPressed() {
        Intent launchIntentForPackage;
        if (TextUtils.isEmpty(this.f57204a.f57213c)) {
            v0 v0Var = this.f57204a;
            v0Var.getClass();
            IAlog.f("%smPackageName is null", IAlog.a(v0Var));
            return;
        }
        if (TextUtils.isEmpty(this.f57204a.f57217g)) {
            launchIntentForPackage = com.fyber.inneractive.sdk.util.o.f57018a.getPackageManager().getLaunchIntentForPackage(this.f57204a.f57213c);
        } else {
            launchIntentForPackage = new Intent("android.intent.action.MAIN");
            v0 v0Var2 = this.f57204a;
            launchIntentForPackage.setClassName(v0Var2.f57213c, v0Var2.f57217g);
        }
        if (launchIntentForPackage == null) {
            v0 v0Var3 = this.f57204a;
            v0Var3.getClass();
            IAlog.f("%sPackage %s not found", IAlog.a(v0Var3), this.f57204a.f57213c);
            return;
        }
        launchIntentForPackage.setFlags(268435456);
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(com.fyber.inneractive.sdk.util.o.f57018a, launchIntentForPackage);
        } catch (Throwable th) {
            com.fyber.inneractive.sdk.flow.v vVar = this.f57204a.f57218h;
            if (vVar != null) {
                String simpleName = th.getClass().getSimpleName();
                String message = th.getMessage();
                com.fyber.inneractive.sdk.flow.w wVar = vVar.f53930a;
                com.fyber.inneractive.sdk.network.z.a(simpleName, message, wVar.f53977a, wVar.f53978b);
            }
        }
    }

    @JavascriptInterface
    public void onTransitionEnded() {
        this.f57204a.f57234x = false;
    }

    @JavascriptInterface
    public void onTransitionStarting() {
        this.f57204a.f57234x = true;
    }
}
