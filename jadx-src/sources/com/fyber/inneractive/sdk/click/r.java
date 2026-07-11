package com.fyber.inneractive.sdk.click;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.network.h1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.v;
import com.fyber.inneractive.sdk.util.z0;
import com.fyber.inneractive.sdk.web.v0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.net.URLDecoder;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f53246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f53247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f53248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f53249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f53250e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h1 f53254i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v0 f53256k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f53257l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.fyber.inneractive.sdk.ignite.m f53258m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f53251f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f53253h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f53255j = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f53252g = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f53259n = IAConfigManager.f53260M.f53294t.f53466b.a(false, "should_decode_url");

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.f63176p);
        p0.startActivity(p1);
    }

    public final void a(Context context, String str, o oVar, v0 v0Var, boolean z2, com.fyber.inneractive.sdk.ignite.m mVar, String str2) {
        Uri uri;
        this.f53247b = context;
        this.f53248c = str;
        this.f53250e = oVar;
        this.f53257l = z2;
        this.f53253h = System.currentTimeMillis();
        this.f53256k = v0Var;
        this.f53258m = mVar;
        b bVarA = a(this.f53248c);
        IAlog.d("%s EVENT_CLICK %s %s", "VAST_EVENT", bVarA, str);
        if (bVarA == null) {
            String str3 = this.f53248c;
            try {
                try {
                    uri = this.f53259n ? !h0.c(str3) ? Uri.parse(URLDecoder.decode(str3, "utf-8")) : Uri.parse(str3) : h0.c(str3) ? Uri.parse(URLDecoder.decode(str3, "utf-8")) : Uri.parse(str3);
                } catch (Exception unused) {
                    IAlog.a("%sgetDecodedUri: Failed parsing Uri!", "SuperClickHandler");
                    uri = null;
                }
                if (a(uri)) {
                    IAlog.a("%sfollowRedirects: Fetching uri: %s", IAlog.a(this), uri.toString());
                    String string = uri.toString();
                    h1 h1Var = new h1(new m(this, string, str2), string);
                    this.f53254i = h1Var;
                    IAConfigManager.f53260M.f53292r.a(h1Var);
                }
            } catch (Exception e2) {
                if (e2 instanceof InterruptedException) {
                    return;
                }
                IAlog.b("%sfailed followRedirects %s", IAlog.a(this), e2);
                this.f53252g.add(new j(str3, false, q.INTERNAL_REDIRECT, null));
                a(new b(str3, q.FAILED, "followRedirects", e2));
            }
        }
    }

    public r(boolean z2, x xVar) {
        this.f53249d = true;
        this.f53249d = z2;
        this.f53246a = new z0(xVar);
    }

    public final b a(String str) {
        Uri uri;
        z0 z0Var;
        boolean z2;
        try {
            uri = Uri.parse(str);
        } catch (Exception unused) {
            IAlog.a("IAJavaUtil: getValidUri: Invalid url %s", str);
            uri = null;
        }
        if (uri == null) {
            this.f53252g.add(new j(str, false, null, "illegal uri"));
            return a(a(str, null, "illegal uri"));
        }
        if (this.f53255j.isEmpty()) {
            this.f53252g.add(new j(str, false, null, "no click handlers found"));
            return a(a(str, null, "no click handlers found"));
        }
        for (a aVar : this.f53255j) {
            if (aVar.a(uri, this)) {
                Context context = this.f53247b;
                b bVarA = context != null ? aVar.a(context, uri, this.f53252g) : null;
                if (bVarA != null) {
                    if (bVarA.f53213a == q.OPEN_GOOGLE_STORE && !(z2 = (z0Var = this.f53246a).f57065c) && !z2) {
                        z0Var.f57065c = true;
                        z0Var.f57064b = System.currentTimeMillis();
                        com.fyber.inneractive.sdk.config.e eVar = IAConfigManager.f53260M.f53297w.f53493b;
                        if (eVar != null) {
                            eVar.f53322a.add(z0Var);
                        }
                    }
                    return a(bVarA);
                }
            }
        }
        return null;
    }

    public final boolean a(Uri uri) {
        if (uri == null) {
            IAlog.a("%s followRedirects: Got a url which is not valid: null", IAlog.a(this));
            this.f53252g.add(new j(null, false, null, "Invalid url"));
            a(a(uri.toString(), "followRedirects", "Invalid url"));
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme != null && (scheme.equalsIgnoreCase(com.safedk.android.analytics.brandsafety.creatives.g.f62375e) || scheme.equalsIgnoreCase("https"))) {
            return true;
        }
        IAlog.a("%scould not follow redirects for scheme: %s", IAlog.a(this), uri.getScheme());
        IAlog.a("%sfull url: %s", IAlog.a(this), uri.toString());
        this.f53252g.add(new j(uri.toString(), false, null, "Invalid scheme: " + uri.getScheme()));
        a(a(uri.toString(), "followRedirects", "Invalid scheme: " + uri.getScheme()));
        return false;
    }

    public static void a(r rVar, String str, String str2, String str3, Exception exc) {
        if (rVar.f53249d) {
            Intent intent = new Intent(rVar.f53247b, (Class<?>) InneractiveInternalBrowserActivity.class);
            if (!TextUtils.isEmpty(str)) {
                InneractiveInternalBrowserActivity.setHtmlExtra(str);
            }
            intent.putExtra("extra_url", str2);
            intent.putExtra("spotId", str3);
            if (!(rVar.f53247b instanceof Activity)) {
                intent.setFlags(268435456);
            }
            try {
                Context context = rVar.f53247b;
                if (context != null) {
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                }
                ArrayList arrayList = rVar.f53252g;
                boolean z2 = exc == null;
                q qVar = q.OPENED_IN_INTERNAL_BROWSER;
                arrayList.add(new j(str2, z2, qVar, v.a(exc)));
                rVar.a(new b(str2, qVar, "followRedirects", null));
                return;
            } catch (ActivityNotFoundException unused) {
                rVar.f53252g.add(new j(str2, false, q.OPENED_IN_INTERNAL_BROWSER, "internal browser not registered"));
                rVar.a(a(str2, "followRedirects", "internal browser not registered"));
                return;
            }
        }
        rVar.f53252g.add(new j(str2, false, q.OPENED_IN_INTERNAL_BROWSER, "internal browser not usable"));
        rVar.a(a(str2, "followRedirects", "internal browser not usable"));
    }

    public static b a(String str, String str2, String str3) {
        return new b(str, q.FAILED, str2, new p(str3));
    }

    public final b a(b bVar) {
        ArrayList arrayList = this.f53252g;
        bVar.f53218f.clear();
        bVar.f53218f.addAll(arrayList);
        bVar.f53217e = System.currentTimeMillis() - this.f53253h;
        IAlog.a("%s reporting result: %s", IAlog.a(this), bVar);
        com.fyber.inneractive.sdk.util.r.f57026b.post(new n(this, bVar));
        return bVar;
    }
}
