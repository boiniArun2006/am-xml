package com.fyber.inneractive.sdk.player;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.features.v;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.model.vast.x;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class f implements com.fyber.inneractive.sdk.player.controller.p, com.fyber.inneractive.sdk.player.controller.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.controller.q f56321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t0 f56322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InneractiveAdRequest f56323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.measurement.e f56324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.measurement.f f56325e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public q f56332l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f56333m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.fyber.inneractive.sdk.model.vast.r f56334n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p f56326f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f56327g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f56328h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f56329i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f56330j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f56331k = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f56335o = new c(this);

    public abstract void a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject);

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
        IAlog.a("IMediaPlayerFlowManager: onPlayerError called with: %s", oVar.getMessage());
        a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE, oVar), new JSONObject());
        if (this.f56328h) {
            IAlog.a("IMediaPlayerFlowManager: onPlayerError video was prepared. This is a critical error. Aborting!", new Object[0]);
            a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES, oVar), new JSONObject());
        }
    }

    public abstract void a(com.fyber.inneractive.sdk.response.i iVar, VideoClickOrigin videoClickOrigin, x... xVarArr);

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void c(boolean z2) {
        try {
            t0 t0Var = this.f56322b;
            com.fyber.inneractive.sdk.response.g gVar = t0Var != null ? (com.fyber.inneractive.sdk.response.g) t0Var.f53978b : null;
            u uVar = u.VAST_MEDIA_LOAD_RETRY_ATTEMPTED;
            InneractiveAdRequest inneractiveAdRequest = this.f56323c;
            t0 t0Var2 = this.f56322b;
            JSONArray jSONArrayB = t0Var2 == null ? null : t0Var2.f53979c.b();
            w wVar = new w(gVar);
            wVar.f54359c = uVar;
            wVar.f54357a = inneractiveAdRequest;
            wVar.f54360d = jSONArrayB;
            if (this.f56334n != null && gVar != null) {
                wVar.f54362f.put(new com.fyber.inneractive.sdk.network.x().a(String.valueOf(z2), "waudio").a(this.f56334n.f54174g, "url").a(this.f56334n.f54172e, "bitrate").a(TextUtils.isEmpty(this.f56334n.f54171d) ? "na" : this.f56334n.f54171d, "mime").a(this.f56334n.f54168a, "delivery").a(Integer.valueOf(this.f56331k), "media_file_index").a(this.f56321a.d(), "player").f54364a);
            }
            wVar.a((String) null);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(Context context, com.fyber.inneractive.sdk.config.global.r rVar) {
        boolean zBooleanValue;
        com.fyber.inneractive.sdk.player.controller.q aVar = null;
        if (rVar != null) {
            try {
                Boolean boolC = ((v) rVar.a(v.class)).c("use_fmp_cache_mechanism");
                if (boolC != null) {
                    zBooleanValue = boolC.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                aVar = new com.fyber.inneractive.sdk.player.controller.f(context, zBooleanValue, rVar);
            } catch (Throwable th) {
                if (IAlog.f56974a <= 3) {
                    IAlog.a("Failed creating exo player", new Object[0]);
                    th.printStackTrace();
                }
            }
        }
        aVar = aVar == null ? new com.fyber.inneractive.sdk.player.controller.a(context) : aVar;
        this.f56321a = aVar;
        if (!aVar.f54472b.contains(this)) {
            aVar.f54472b.add(this);
        }
        com.fyber.inneractive.sdk.player.controller.q qVar = this.f56321a;
        if (!qVar.f54473c.contains(this)) {
            qVar.f54473c.add(this);
        }
        this.f56321a.f54476f = this.f56335o;
    }

    public static boolean a(int i2, int i3, s0 s0Var) {
        UnitDisplayType unitDisplayType;
        if (s0Var != null && ((r0) s0Var).f53419e != null) {
            return false;
        }
        if (i3 == 1 || InneractiveAdManager.isCurrentUserAChild()) {
            return true;
        }
        if (i2 <= 15999) {
            return false;
        }
        com.fyber.inneractive.sdk.config.t0 t0Var = s0Var != null ? ((r0) s0Var).f53420f : null;
        return (t0Var == null || t0Var.f53478h == Skip.DEFAULT || (unitDisplayType = t0Var.f53480j) == UnitDisplayType.REWARDED || unitDisplayType == UnitDisplayType.NATIVE) ? false : true;
    }

    public static int a(f fVar) {
        com.fyber.inneractive.sdk.response.e eVar;
        t0 t0Var = fVar.f56322b;
        if (t0Var == null || (eVar = t0Var.f53978b) == null) {
            return -1;
        }
        return ((com.fyber.inneractive.sdk.response.g) eVar).f56870v;
    }

    public final void a() {
        com.fyber.inneractive.sdk.measurement.f fVar = this.f56325e;
        if (fVar != null) {
            if (fVar.f54046a != null) {
                IAlog.a("%s destroy", "OMVideo");
                try {
                    fVar.f54046a.t();
                } catch (Throwable th) {
                    fVar.a(th);
                }
            }
            fVar.f54047b = null;
            fVar.f54046a = null;
            fVar.f54048c = null;
        }
    }

    public static boolean a(com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.ignite.m mVar) {
        mVar.getClass();
        if (mVar != com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP || !IAConfigManager.f53260M.f53266D.n() || rVar == null || rVar.a(com.fyber.inneractive.sdk.config.global.features.o.class) == null) {
            return false;
        }
        Boolean boolC = ((com.fyber.inneractive.sdk.config.global.features.o) rVar.a(com.fyber.inneractive.sdk.config.global.features.o.class)).c("enable_app_info_button");
        return boolC != null ? boolC.booleanValue() : true;
    }
}
