package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class v0 implements com.fyber.inneractive.sdk.ignite.r {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f57207B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebView f57211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.ignite.h f57212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f57213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.ignite.m f57214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f57215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f57216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f57217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.v f57218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t0 f57219i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f57221k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f57223m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f57225o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public n0 f57226p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WeakReference f57227q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f57220j = "invalid_task_id";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f57222l = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f57224n = 10;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f57228r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f57229s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicInteger f57230t = new AtomicInteger(0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f57231u = new AtomicBoolean(false);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f57232v = new AtomicBoolean(false);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f57233w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f57234x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f57235y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f57236z = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f57206A = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f57208C = false;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f57209D = false;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final m0 f57210E = new m0(this);

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, String str2) {
        if (str == null || str2 == null || !str2.equals(this.f57213c)) {
            return;
        }
        this.f57220j = str;
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void b(String str) {
        this.f57236z = false;
        this.f57206A = true;
        if (this.f57220j.equals(str)) {
            this.f57212b.m();
            d("onInstallationSuccess();");
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void c(String str) {
        com.fyber.inneractive.sdk.flow.v vVar;
        IIgniteServiceAPI iIgniteServiceAPI;
        if (this.f57232v.get() && str != null) {
            if (str.equals(com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED.a()) || str.equals(com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED.a())) {
                if (this.f57230t.getAndIncrement() < 2) {
                    this.f57212b.a(new q0(this));
                    return;
                }
                com.fyber.inneractive.sdk.ignite.h hVar = this.f57212b;
                com.fyber.inneractive.sdk.ignite.l lVar = hVar.f54026p;
                if (lVar == null || !lVar.isConnected() || (iIgniteServiceAPI = hVar.f54012b) == null || !iIgniteServiceAPI.asBinder().isBinderAlive()) {
                    com.fyber.inneractive.sdk.ignite.j jVar = com.fyber.inneractive.sdk.ignite.j.FAILED_TO_BIND_SERVICE;
                    com.fyber.inneractive.sdk.ignite.h hVar2 = this.f57212b;
                    if (hVar2.f54019i || (vVar = this.f57218h) == null) {
                        return;
                    }
                    hVar2.f54019i = true;
                    vVar.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_START, null, jVar.a(), null);
                }
            }
        }
    }

    public final void d(String str) {
        com.fyber.inneractive.sdk.util.r.f57026b.post(new o0(this, str));
    }

    public v0(w0 w0Var) {
        this.f57213c = w0Var.f57238a;
        this.f57214d = w0Var.f57239b;
        this.f57215e = w0Var.f57240c;
        this.f57223m = w0Var.f57241d;
        this.f57216f = w0Var.f57242e;
        this.f57217g = w0Var.f57243f;
        this.f57218h = w0Var.f57244g;
        com.fyber.inneractive.sdk.ignite.h hVar = IAConfigManager.f53260M.f53266D;
        this.f57212b = hVar;
        hVar.f54018h.add(this);
        this.f57211a = new WebView(com.fyber.inneractive.sdk.util.o.f57018a);
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str) {
        this.f57236z = true;
        if (this.f57220j.equals(str)) {
            this.f57212b.m();
            d("onInstallStart();");
        }
    }

    public final void e(String str) {
        int iIntValue;
        if (!TextUtils.isEmpty(str)) {
            this.f57221k = str;
            WebSettings settings = this.f57211a.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setUseWideViewPort(true);
            this.f57211a.setInitialScale(1);
            this.f57211a.setBackgroundColor(-1);
            this.f57211a.setWebViewClient(this.f57210E);
            WebView webView = this.f57211a;
            webView.setLongClickable(false);
            webView.setOnLongClickListener(new com.fyber.inneractive.sdk.util.p0());
            DTExchangeNetworkBridge.webviewAddJavascriptInterface(this.f57211a, new u0(this), "nativeInterface");
            DTExchangeNetworkBridge.webviewLoadUrl(this.f57211a, str);
            com.fyber.inneractive.sdk.config.global.r rVar = this.f57223m;
            if (rVar != null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Integer numA = ((com.fyber.inneractive.sdk.config.global.features.r) rVar.a(com.fyber.inneractive.sdk.config.global.features.r.class)).a("load_timeout");
                int i2 = 10;
                if (numA != null) {
                    iIntValue = numA.intValue();
                } else {
                    iIntValue = 10;
                }
                if (iIntValue < 30 && iIntValue > 2) {
                    i2 = iIntValue;
                }
                long millis = timeUnit.toMillis(i2);
                this.f57224n = millis;
                IAlog.a("InternalStoreWebpageController: Starting load timeout with %d", Long.valueOf(millis));
            }
            this.f57225o = System.currentTimeMillis();
            n0 n0Var = new n0(this);
            this.f57226p = n0Var;
            com.fyber.inneractive.sdk.util.r.f57026b.postDelayed(n0Var, this.f57224n);
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, int i2, double d2) {
        if (this.f57220j.equals(str)) {
            if (i2 == 0) {
                d(String.format("onDownloadProgress(%f);", Double.valueOf(d2)));
            } else {
                if (i2 != 1) {
                    return;
                }
                d("onInstallationProgress();");
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, String str2, String str3) {
        com.fyber.inneractive.sdk.flow.v vVar;
        IIgniteServiceAPI iIgniteServiceAPI;
        if (this.f57209D) {
            this.f57236z = false;
            if (this.f57220j.equals(str)) {
                this.f57212b.m();
                if (!this.f57232v.get() && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str2) && str2.equals("App already installed")) {
                    d("onInstallationSuccess();");
                    this.f57206A = true;
                    return;
                }
            }
            if ((str2 != null && (str2.equals(com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED.a()) || str2.equals(com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED.a()))) || !this.f57212b.n()) {
                if (this.f57230t.getAndIncrement() < 2) {
                    this.f57212b.a(new p0(this, str2, str3));
                    return;
                }
                this.f57212b.m();
                d("onInstallationFailed();");
                com.fyber.inneractive.sdk.ignite.h hVar = this.f57212b;
                com.fyber.inneractive.sdk.ignite.l lVar = hVar.f54026p;
                if (lVar == null || !lVar.isConnected() || (iIgniteServiceAPI = hVar.f54012b) == null || !iIgniteServiceAPI.asBinder().isBinderAlive()) {
                    com.fyber.inneractive.sdk.ignite.j jVar = com.fyber.inneractive.sdk.ignite.j.FAILED_TO_BIND_SERVICE;
                    com.fyber.inneractive.sdk.ignite.h hVar2 = this.f57212b;
                    if (!hVar2.f54019i && (vVar = this.f57218h) != null) {
                        hVar2.f54019i = true;
                        vVar.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_START, null, jVar.a(), null);
                    }
                }
            } else if (!TextUtils.equals(str2, com.fyber.inneractive.sdk.ignite.j.DOWNLOAD_IS_CANCELLED.a())) {
                this.f57212b.m();
                d("onInstallationFailed();");
            }
            com.fyber.inneractive.sdk.ignite.m mVar = this.f57214d;
            if (mVar != null) {
                this.f57218h.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_INSTALL_APP, str2, str3, mVar);
            }
        }
    }
}
