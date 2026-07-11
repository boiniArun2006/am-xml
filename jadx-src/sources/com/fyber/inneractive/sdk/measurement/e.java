package com.fyber.inneractive.sdk.measurement;

import a88.o;
import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.network.v0;
import com.fyber.inneractive.sdk.util.IAlog;
import ixS.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f54038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f54039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f54040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f54041e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f54037a = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.measurement.tracker.f f54042f = new com.fyber.inneractive.sdk.measurement.tracker.f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f54043g = new a(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f54044h = new b(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f54045i = new c(this);

    public static void a(e eVar, Context context) {
        eVar.getClass();
        a(context, "https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/" + j.rl() + ".js", "omid-latest.js", eVar.f54043g);
        a(context, "https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/omid-session-client-" + j.rl() + ".js", "omid-session-client-latest.js", eVar.f54044h);
        a(context, "https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/dt-omsdk-mraid-video-tracker.js", "dt-omsdk-mraid-video-tracker.js", eVar.f54045i);
    }

    public static void a(Context context, String str, String str2, f0 f0Var) {
        IAlog.d("%s- Loading URL: %s", IAlog.a(e.class), str);
        IAConfigManager.f53260M.f53292r.a(new v0(f0Var, context, new com.fyber.inneractive.sdk.cache.f(str, str2)));
    }
}
