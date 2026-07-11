package com.fyber.inneractive.sdk.player.ui.remote;

import com.fyber.inneractive.sdk.ignite.m;
import com.fyber.inneractive.sdk.player.ui.o;
import com.fyber.inneractive.sdk.player.ui.s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class f implements com.fyber.inneractive.sdk.web.remoteui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f56490a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f56497h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f56491b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f56492c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f56493d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f56494e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f56495f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f56496g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f56498i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f56499j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m f56500k = m.NONE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f56501l = "";

    @Override // com.fyber.inneractive.sdk.web.remoteui.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, boolean z2, HashMap map) {
        s sVar = this.f56490a;
        if (sVar == null) {
            IAlog.a("%s: showFallback: fallback won't be displayed because it is null", "RemoteUiFallbackHandler");
            return;
        }
        sVar.g(this.f56491b);
        this.f56490a.d(this.f56498i);
        this.f56490a.f(this.f56495f);
        this.f56490a.a(this.f56494e, this.f56500k);
        this.f56490a.c(this.f56497h);
        this.f56490a.a(this.f56499j, this.f56501l);
        this.f56490a.b(this.f56496g);
        this.f56490a.e(this.f56492c);
        this.f56490a.a(this.f56493d);
    }

    public f(o oVar) {
        this.f56490a = null;
        this.f56497h = false;
        this.f56490a = oVar;
        this.f56497h = oVar.f56450I;
    }
}
