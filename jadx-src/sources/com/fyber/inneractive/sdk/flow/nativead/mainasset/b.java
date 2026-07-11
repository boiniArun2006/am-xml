package com.fyber.inneractive.sdk.flow.nativead.mainasset;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.i;
import com.fyber.inneractive.sdk.flow.nativead.g;
import com.fyber.inneractive.sdk.flow.nativead.s;
import com.fyber.inneractive.sdk.flow.nativead.t;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.u0;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.response.nativead.j;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class b implements d, s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f53750h = IAlog.a(b.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.nativead.f f53751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f53752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u0 f53753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.b f53754d = com.fyber.inneractive.sdk.flow.nativead.b.UNINITIALIZED;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f53755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f53756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f53757g;

    @Override // com.fyber.inneractive.sdk.flow.nativead.s
    public final void a(g gVar, Exception exc, com.fyber.inneractive.sdk.response.nativead.f fVar) throws Throwable {
        String message;
        if (this.f53754d == com.fyber.inneractive.sdk.flow.nativead.b.LOADED) {
            return;
        }
        if (gVar == null) {
            this.f53754d = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
            i iVar = i.NATIVE_AD_IMAGE_LOAD_FAILED;
            if (exc != null) {
                message = exc.getMessage();
            } else {
                message = "Failed to download main media image: " + iVar.name();
            }
            IAlog.f("%s : %s", f53750h, message);
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, iVar);
            c cVar = this.f53752b;
            if (cVar != null) {
                ((com.fyber.inneractive.sdk.flow.nativead.f) cVar).a(inneractiveInfrastructureError, message);
                return;
            }
            return;
        }
        if (this.f53755e != null && this.f53756f != null) {
            u uVar = u.EVENT_READY_ON_CLIENT;
            j jVar = this.f53755e;
            JSONArray jSONArrayB = this.f53756f.b();
            w wVar = new w(jVar);
            wVar.f54359c = uVar;
            wVar.f54357a = null;
            wVar.f54360d = jSONArrayB;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f53757g;
            IAlog.a("%sMain image load took: " + jCurrentTimeMillis + " msec", IAlog.a(this));
            JSONObject jSONObject = new JSONObject();
            String str = this.f53751a.f56893d.f56887a;
            try {
                jSONObject.put("url", str);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "url", str);
            }
            String strB = com.fyber.inneractive.sdk.util.u.b(gVar.f53731b);
            try {
                jSONObject.put("mime", strB);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "mime", strB);
            }
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            try {
                jSONObject.put("load_time", lValueOf);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "load_time", lValueOf);
            }
            wVar.f54362f.put(jSONObject);
            wVar.a((String) null);
        }
        this.f53754d = com.fyber.inneractive.sdk.flow.nativead.b.LOADED;
        c cVar2 = this.f53752b;
        if (cVar2 != null) {
            com.fyber.inneractive.sdk.flow.nativead.f fVar2 = (com.fyber.inneractive.sdk.flow.nativead.f) cVar2;
            fVar2.f53721d.add(gVar);
            fVar2.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void b() {
        com.fyber.inneractive.sdk.response.nativead.c cVar;
        String str;
        com.fyber.inneractive.sdk.response.nativead.f fVar = this.f53751a;
        if (fVar != null && (cVar = fVar.f56893d) != null && (str = cVar.f56887a) != null && !str.trim().isEmpty()) {
            this.f53757g = System.currentTimeMillis();
            this.f53754d = com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
            t tVar = new t(this.f53751a, this);
            IAConfigManager iAConfigManager = IAConfigManager.f53260M;
            u0 u0Var = new u0(tVar, iAConfigManager.f53295u.f53389a, new com.fyber.inneractive.sdk.cache.d(this.f53751a.f56893d.f56887a));
            this.f53753c = u0Var;
            iAConfigManager.f53292r.a(u0Var);
            return;
        }
        a aVar = new a("Main media image is not loadable");
        this.f53754d = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
        i iVar = i.NATIVE_AD_IMAGE_LOAD_FAILED;
        String message = aVar.getMessage();
        IAlog.f("%s : %s", f53750h, message);
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, iVar);
        c cVar2 = this.f53752b;
        if (cVar2 != null) {
            ((com.fyber.inneractive.sdk.flow.nativead.f) cVar2).a(inneractiveInfrastructureError, message);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void destroy() {
        u0 u0Var = this.f53753c;
        if (u0Var != null) {
            u0Var.c();
            this.f53753c = null;
        }
        this.f53755e = null;
        this.f53756f = null;
        this.f53751a = null;
        this.f53752b = null;
        this.f53754d = com.fyber.inneractive.sdk.flow.nativead.b.DESTROYED;
    }

    public b(com.fyber.inneractive.sdk.response.nativead.f fVar, com.fyber.inneractive.sdk.flow.nativead.f fVar2, j jVar, r rVar) {
        this.f53751a = fVar;
        this.f53752b = fVar2;
        this.f53755e = jVar;
        this.f53756f = rVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final boolean a() {
        return this.f53754d == com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
    }
}
