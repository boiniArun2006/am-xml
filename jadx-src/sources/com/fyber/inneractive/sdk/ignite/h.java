package com.fyber.inneractive.sdk.ignite;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.network.a1;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class h implements Nge.n, Nge.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f54011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IIgniteServiceAPI f54012b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f54021k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f54022l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f54023m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public gm.j f54024n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.r f54025o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l f54026p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f54013c = new Bundle();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f54015e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f54016f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f54017g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArrayList f54018h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f54019i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f54020j = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f54014d = new i(new e(this));

    public final void a(com.fyber.inneractive.sdk.config.global.r rVar) {
        boolean z2;
        h hVar;
        this.f54025o = rVar;
        if (!TextUtils.isEmpty(this.f54022l)) {
            IAlog.a("%s : Ignite installed will init IgniteManager", "IgniteAdapter");
            com.fyber.inneractive.sdk.config.global.features.j jVar = (com.fyber.inneractive.sdk.config.global.features.j) rVar.a(com.fyber.inneractive.sdk.config.global.features.j.class);
            IAlog.a("%s : initializing ignite features", "IgniteAdapter");
            Boolean boolC = jVar.c("odt");
            this.f54015e = boolC != null ? boolC.booleanValue() : false;
            Boolean boolC2 = jVar.c("flow");
            this.f54016f = boolC2 != null ? boolC2.booleanValue() : false;
            Boolean boolC3 = jVar.c("updates");
            this.f54017g = boolC3 != null ? boolC3.booleanValue() : false;
            Context context = this.f54011a;
            if (context != null && ((z2 = this.f54015e) || this.f54016f)) {
                if (this.f54026p == null) {
                    this.f54020j = false;
                    hVar = this;
                    l lVar = new l(context, new k(), new com.fyber.inneractive.sdk.ignite.events.wrappers.a(), z2, this.f54016f, this.f54017g, hVar);
                    hVar.f54026p = lVar;
                    lVar.authenticate();
                } else {
                    hVar = this;
                }
                hVar.f54021k = TimeUnit.SECONDS.toMillis(IAConfigManager.f53260M.f53296v.f53470a.f53466b.a("igniteInstallTimeOutInSeconds", 15, 1));
            }
        }
    }

    @Override // Nge.j
    public final void onIgniteServiceAuthenticationFailed(String str) {
        this.f54012b = null;
        a(j.FAILED_TO_AUTHENTICATE, str);
        IAlog.a("IgniteAdapter: onIgniteServiceAuthenticationFailed : error : %s", str);
        gm.j jVar = this.f54024n;
        if (jVar != null) {
            jVar.a(str);
            this.f54024n = null;
        }
    }

    @Override // Nge.j
    public final void onIgniteServiceConnected(ComponentName componentName, IBinder iBinder) {
        String str;
        Context context;
        IAlog.a("IgniteAdapter: onIgniteServiceConnected", new Object[0]);
        this.f54022l = componentName.getPackageName();
        this.f54012b = IIgniteServiceAPI.Stub.asInterface(iBinder);
        if (this.f54020j) {
            l lVar = this.f54026p;
            if (lVar != null) {
                lVar.authenticate();
                return;
            }
            return;
        }
        this.f54020j = true;
        byte[] byteArray = null;
        try {
            o oVarNewBuilder = IgniteRequestOuterClass$IgniteRequest.newBuilder();
            String str2 = IAConfigManager.f53260M.f53277c;
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f56666b).setAppId(str2);
            String packageName = com.fyber.inneractive.sdk.util.o.f57018a.getPackageName();
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f56666b).setBundle(packageName);
            String version = InneractiveAdManager.getVersion();
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f56666b).setSdkVersion(version);
            String str3 = this.f54022l;
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f56666b).setIgnitePackageName(str3);
            if (TextUtils.isEmpty(this.f54022l) || (context = this.f54011a) == null) {
                str = null;
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f56666b).setIgniteVersionName(str);
                String strA = com.fyber.inneractive.sdk.util.o.a(this.f54011a);
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f56666b).setAppSignature(strA);
                byteArray = ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.a()).toByteArray();
            } else {
                try {
                    str = context.getPackageManager().getPackageInfo(this.f54022l, 0).versionName;
                } catch (Exception unused) {
                    IAlog.a("Failed to resolve ignite version", new Object[0]);
                    str = null;
                }
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f56666b).setIgniteVersionName(str);
                String strA2 = com.fyber.inneractive.sdk.util.o.a(this.f54011a);
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f56666b).setAppSignature(strA2);
                byteArray = ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.a()).toByteArray();
            }
        } catch (Throwable unused2) {
            IAlog.a("Failed to build ignite request", new Object[0]);
        }
        if (byteArray != null) {
            IAConfigManager.f53260M.f53292r.a(new a1(new b(this), byteArray, this.f54025o));
        }
    }

    public final void m() {
        d dVar = this.f54023m;
        if (dVar != null) {
            com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(dVar);
            this.f54023m = null;
        }
    }

    public final boolean n() {
        l lVar = this.f54026p;
        return lVar != null && lVar.isConnected() && this.f54026p.isAuthenticated();
    }

    public final boolean o() {
        l lVar = this.f54026p;
        return lVar == null || lVar.f74139a.f();
    }

    @Override // Nge.n
    public final void onCredentialsRequestFailed(String str) {
        l lVar = this.f54026p;
        if (lVar != null) {
            lVar.onCredentialsRequestFailed(str);
        }
    }

    @Override // Nge.n
    public final void onCredentialsRequestSuccess(String str, String str2) {
        l lVar = this.f54026p;
        if (lVar != null) {
            lVar.onCredentialsRequestSuccess(str, str2);
        }
    }

    @Override // Nge.j
    public final void onIgniteServiceAuthenticated(String str) {
        this.f54013c.putString("clientToken", str);
        IAlog.a("IgniteAdapter: onIgniteServiceAuthenticated", new Object[0]);
        gm.j jVar = this.f54024n;
        if (jVar != null) {
            jVar.a();
            this.f54024n = null;
        }
    }

    @Override // Nge.j
    public final void onOdtUnsupported() {
        l lVar;
        IAlog.f("%s: onOdtUnsupported : unsupported ignite version", "IgniteAdapter");
        if (this.f54016f || (lVar = this.f54026p) == null) {
            return;
        }
        lVar.destroy();
        this.f54026p = null;
    }

    @Override // Nge.j
    public final void onIgniteServiceConnectionFailed(String str) {
        IAlog.a("IgniteAdapter: onIgniteServiceConnectionFailed : error : %s", str);
        a(j.FAILED_TO_BIND_SERVICE, str);
    }

    public final void a(j jVar, String str) {
        if (this.f54019i) {
            return;
        }
        this.f54019i = true;
        t tVar = t.IGNITE_FLOW_FAILED_TO_START;
        w wVar = new w((com.fyber.inneractive.sdk.response.e) null);
        wVar.f54358b = tVar;
        wVar.f54357a = null;
        wVar.f54360d = null;
        JSONObject jSONObject = new JSONObject();
        String strA = jVar.a();
        try {
            jSONObject.put("error_code", strA);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "error_code", strA);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put("message", str);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "message", str);
            }
        }
        wVar.f54362f.put(jSONObject);
        wVar.a((String) null);
    }

    public final void a(gm.j jVar) {
        IAlog.a("IgniteAdapter : reconnectIgnite : with callback : " + jVar, new Object[0]);
        this.f54024n = jVar;
        l lVar = this.f54026p;
        if (lVar != null) {
            lVar.authenticate();
        }
    }

    public final void a(String str, g gVar) {
        String strA;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IAlog.a("Starting install timeout with %d", Long.valueOf(this.f54021k));
        d dVar = new d(this);
        this.f54023m = dVar;
        com.fyber.inneractive.sdk.util.r.f57026b.postDelayed(dVar, this.f54021k);
        if (n() && !o() && this.f54012b != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("packageName", str);
                jSONObject.put("data", jSONObject2);
                IIgniteServiceAPI iIgniteServiceAPI = this.f54012b;
                String string = jSONObject.toString();
                Bundle bundle = this.f54013c;
                Bundle bundle2 = new Bundle();
                i iVar = this.f54014d;
                c cVar = new c(this, gVar);
                iVar.getClass();
                iIgniteServiceAPI.install(string, bundle, bundle2, new s((e) iVar.f54027a, cVar));
                return;
            } catch (Exception unused) {
                IAlog.a("Failed to install app", new Object[0]);
                return;
            }
        }
        for (r rVar : this.f54018h) {
            if (rVar != null) {
                if (o()) {
                    strA = j.SESSION_EXPIRED.a();
                } else {
                    strA = j.NOT_CONNECTED.a();
                }
                rVar.a((String) null, strA, (String) null);
            }
        }
    }
}
