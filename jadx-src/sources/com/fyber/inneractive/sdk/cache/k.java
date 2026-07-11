package com.fyber.inneractive.sdk.cache;

import android.app.Application;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.s;
import com.fyber.inneractive.sdk.network.v0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f53185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f53186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f53187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f53188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f53189e;

    public final void a() {
        if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - this.f53185a) >= 60) {
            IAConfigManager iAConfigManager = IAConfigManager.f53260M;
            if (iAConfigManager.f53294t.f53466b.a(false, "use_js_inline")) {
                Application application = o.f57018a;
                if (application == null) {
                    IAlog.f("fetchJS() failed context null", new Object[0]);
                    return;
                }
                this.f53185a = System.currentTimeMillis();
                v0 v0Var = new v0(new g(this), application, new f("https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js", "dt-mraid-video-controller.js"));
                IAlog.d("%s- Loading URL: %s", IAlog.a(this), "https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js");
                iAConfigManager.f53292r.a(v0Var);
                iAConfigManager.f53292r.a(new v0(new h(this), application, new f("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css", "centering_v1.css")));
                iAConfigManager.f53292r.a(new v0(new i(this), application, new f("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js", "centering_v1.js")));
                s sVar = iAConfigManager.f53294t;
                if (sVar == null || !sVar.f53466b.a(false, "dt_plbl")) {
                    return;
                }
                iAConfigManager.f53292r.a(new v0(new j(this), application, new f("https://cdn2.inner-active.mobi/client/ia-js-tags/playable_detect.js", "playable_detect.js")));
            }
        }
    }
}
