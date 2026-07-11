package com.fyber.inneractive.sdk.click;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InternalStoreWebpageActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.h1;
import com.fyber.inneractive.sdk.util.d0;
import com.fyber.inneractive.sdk.util.g0;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.v0;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class g extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v0 f53225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f53226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f53227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f53228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.g f53229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f53230f = false;

    @Override // com.fyber.inneractive.sdk.click.a
    public final boolean a(Uri uri, r rVar) {
        com.fyber.inneractive.sdk.ignite.m mVar;
        v0 v0Var;
        com.fyber.inneractive.sdk.ignite.m mVar2 = com.fyber.inneractive.sdk.ignite.m.NONE;
        if (rVar != null) {
            mVar = rVar.f53258m;
            this.f53226b = rVar.f53257l;
            this.f53225a = rVar.f53256k;
        } else {
            mVar = mVar2;
        }
        return mVar != mVar2 && IAConfigManager.f53260M.f53266D.n() && (v0Var = this.f53225a) != null && v0Var.f57222l;
    }

    public g(f fVar, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        this.f53227c = fVar;
        this.f53228d = g1Var;
        this.f53229e = gVar;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final b a(Context context, Uri uri, List list) {
        d0 d0Var;
        v0 v0Var = this.f53225a;
        if (v0Var != null) {
            boolean z2 = this.f53226b;
            if (v0Var.f57208C) {
                g0 g0Var = g0.FAILED;
                IllegalStateException illegalStateException = new IllegalStateException("Store controller is already open");
                context.getClass();
                d0Var = new d0(g0Var, illegalStateException);
            } else {
                v0Var.f57208C = true;
                try {
                    context.getClass();
                } catch (Throwable unused) {
                }
                v0Var.f57209D = true;
                if (v0Var.f57220j.equals("invalid_task_id") && !v0Var.f57236z) {
                    v0Var.f57214d = z2 ? com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
                }
                v0Var.f57207B = z2;
                if (v0Var.f57206A) {
                    v0Var.d("onInstallationSuccess();");
                } else if (!v0Var.f57236z) {
                    String str = v0Var.f57213c;
                    PackageInfo packageInfo = !TextUtils.isEmpty(str) ? com.fyber.inneractive.sdk.util.o.f57018a.getPackageManager().getPackageInfo(str, 0) : null;
                    if (packageInfo != null) {
                        v0Var.d("onInstallationSuccess();");
                    } else if (z2) {
                        v0Var.f57212b.a(v0Var.f57213c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f57216f, v0Var.f57214d, v0Var.f57218h.f53930a));
                        v0Var.d("onShowInstallStarted();");
                    }
                }
                try {
                    InternalStoreWebpageActivity.startActivity(context, v0Var.f57215e);
                    d0Var = new d0(g0.OPENED_INTERNAL_STORE, null);
                } catch (ActivityNotFoundException e2) {
                    d0Var = new d0(g0.FAILED, e2);
                }
            }
            Throwable th = d0Var.f56992b;
            if (th == null) {
                IAConfigManager.f53260M.f53292r.a(new h1(new e(this, list, uri), uri.toString()));
                return new b(uri.toString(), q.OPEN_INTERNAL_STORE, "IgniteGooglePlay", null);
            }
            if (list != null) {
                list.add(new j(this.f53225a.f57221k, false, q.OPEN_INTERNAL_STORE, th.toString()));
            }
            return r.a(uri.toString(), "IgniteGooglePlay", "mInternalStoreWebpageController.show has failed");
        }
        return r.a(uri.toString(), "IgniteGooglePlay", "mInternalStoreWebpageController is null");
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final void a() {
        this.f53230f = true;
        this.f53227c = null;
    }
}
