package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.model.vast.x;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class t implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f56397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InneractiveAdRequest f56398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.g f56399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f56400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.model.vast.r f56401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f56402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f56403g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f56404h;

    public final void a() {
        a aVar = this.f56402f;
        if (aVar == null) {
            this.f56400d.a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_LOAD_USING_FLOW_MANAGER, new Exception("loadNextMediaFile flowManager is null")));
            return;
        }
        com.fyber.inneractive.sdk.model.vast.r rVar = this.f56401e;
        n nVar = (n) aVar;
        nVar.f56332l = this;
        if (rVar != null) {
            String str = rVar.f54174g;
            nVar.f56334n = rVar;
            nVar.f56331k++;
            nVar.f56328h = false;
            nVar.f56330j = false;
            IAlog.a("IAMediaPlayerFlowManager: playNextMediaFile - loading video url: %s", str);
            IAlog.a("IAMediaPlayerFlowManager: start - start fetching video frame", new Object[0]);
            if (nVar.f56329i) {
                return;
            }
            nVar.f56321a.a(str, nVar.f56333m);
        }
    }

    public t(com.fyber.inneractive.sdk.response.g gVar, InneractiveAdRequest inneractiveAdRequest, t0 t0Var, s sVar) {
        this.f56398b = inneractiveAdRequest;
        this.f56399c = gVar;
        this.f56400d = sVar;
        this.f56404h = t0Var.f53979c;
        this.f56397a = new b(t0Var);
    }

    public final void a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject, boolean z2) {
        JSONObject jSONObject2;
        InneractiveErrorCode inneractiveErrorCode;
        com.fyber.inneractive.sdk.network.t tVar;
        com.fyber.inneractive.sdk.model.vast.b bVar;
        com.fyber.inneractive.sdk.network.t tVar2;
        if (jSONObject != null || inneractiveVideoError == null || this.f56402f == null) {
            jSONObject2 = jSONObject;
        } else {
            jSONObject2 = new JSONObject();
            ((n) this.f56402f).b(inneractiveVideoError, jSONObject2);
        }
        com.fyber.inneractive.sdk.flow.i iVar = com.fyber.inneractive.sdk.flow.i.UNSPECIFIED;
        if (inneractiveVideoError != null) {
            InneractiveVideoError.Error playerError = inneractiveVideoError.getPlayerError();
            int i2 = r.f56396a[playerError.ordinal()];
            if (i2 == 1) {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_NO_MEDIA_FILES;
            } else if (i2 == 2) {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
            } else if (i2 == 3) {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
            } else if (i2 == 4) {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_PRE_BUFFER_TIMEOUT;
            } else if (i2 != 5) {
                IAlog.a("IAReportError, Does not know player error " + playerError.getErrorString(), new Object[0]);
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_UNKNOWN_PLAYER_ERROR;
            } else {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_BUFFER_TIMEOUT;
            }
            InneractiveAdRequest inneractiveAdRequest = this.f56398b;
            com.fyber.inneractive.sdk.response.g gVar = this.f56399c;
            JSONArray jSONArrayB = this.f56404h.b();
            w wVar = new w(gVar);
            wVar.f54358b = tVar2;
            wVar.f54357a = inneractiveAdRequest;
            wVar.f54360d = jSONArrayB;
            if (jSONObject2 != null) {
                try {
                    wVar.f54362f.put(new JSONObject(jSONObject2.toString()));
                } catch (Exception unused) {
                }
            }
            wVar.a((String) null);
        }
        if (InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED == null) {
            com.fyber.inneractive.sdk.network.t tVar3 = com.fyber.inneractive.sdk.network.t.VPAID_ERROR_UNSECURE_CONTENT;
            InneractiveAdRequest inneractiveAdRequest2 = this.f56398b;
            com.fyber.inneractive.sdk.response.g gVar2 = this.f56399c;
            JSONArray jSONArrayB2 = this.f56404h.b();
            w wVar2 = new w(gVar2);
            wVar2.f54358b = tVar3;
            wVar2.f54357a = inneractiveAdRequest2;
            wVar2.f54360d = jSONArrayB2;
            wVar2.a((String) null);
        }
        if (inneractiveVideoError != null) {
            IAlog.a("got onMediaPlayerLoadError with: " + inneractiveVideoError.getPlayerError(), new Object[0]);
            if (z2) {
                inneractiveErrorCode = InneractiveErrorCode.LOAD_TIMEOUT;
                iVar = com.fyber.inneractive.sdk.flow.i.VIDEO_AD_LOAD_TIMEOUT;
            } else {
                inneractiveErrorCode = null;
            }
            IAlog.a("got onMediaPlayerLoadError with: " + inneractiveVideoError.description(), new Object[0]);
            if (inneractiveVideoError.getPlayerError().isFatal()) {
                inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                iVar = com.fyber.inneractive.sdk.flow.i.VIDEO_FATAL_ERROR;
            }
            if (inneractiveErrorCode == null) {
                inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                iVar = com.fyber.inneractive.sdk.flow.i.VIDEO_ERROR_UNSPECIFIED;
            }
        } else {
            inneractiveErrorCode = null;
        }
        if (z2) {
            return;
        }
        this.f56401e = null;
        com.fyber.inneractive.sdk.response.g gVar3 = this.f56399c;
        if (gVar3 != null && (bVar = gVar3.f56877L) != null) {
            this.f56401e = (com.fyber.inneractive.sdk.model.vast.r) bVar.f54106d.poll();
        }
        if (this.f56401e == null) {
            InneractiveVideoError.Error playerError2 = new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES).getPlayerError();
            int i3 = r.f56396a[playerError2.ordinal()];
            if (i3 == 1) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_NO_MEDIA_FILES;
            } else if (i3 == 2) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
            } else if (i3 == 3) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
            } else if (i3 == 4) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_PRE_BUFFER_TIMEOUT;
            } else if (i3 != 5) {
                IAlog.a("IAReportError, Does not know player error " + playerError2.getErrorString(), new Object[0]);
                tVar = com.fyber.inneractive.sdk.network.t.VAST_UNKNOWN_PLAYER_ERROR;
            } else {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_BUFFER_TIMEOUT;
            }
            InneractiveAdRequest inneractiveAdRequest3 = this.f56398b;
            com.fyber.inneractive.sdk.response.g gVar4 = this.f56399c;
            JSONArray jSONArrayB3 = this.f56404h.b();
            w wVar3 = new w(gVar4);
            wVar3.f54358b = tVar;
            wVar3.f54357a = inneractiveAdRequest3;
            wVar3.f54360d = jSONArrayB3;
            wVar3.a((String) null);
            s sVar = this.f56400d;
            if (sVar != null) {
                if (inneractiveVideoError != null) {
                    sVar.a(new InneractiveInfrastructureError(inneractiveErrorCode, iVar, inneractiveVideoError.getCause()));
                    return;
                } else {
                    sVar.a(new InneractiveInfrastructureError(inneractiveErrorCode, com.fyber.inneractive.sdk.flow.i.VIDEO_ERROR_NULL));
                    return;
                }
            }
            return;
        }
        if (this.f56403g) {
            return;
        }
        try {
            this.f56402f = this.f56397a.a();
        } catch (Throwable th) {
            this.f56400d.a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_CREATE_FLOW_MANAGER, th));
        }
        a();
    }

    public final void a(String str, String... strArr) {
        a aVar = this.f56402f;
        if (aVar != null) {
            n nVar = (n) aVar;
            if ("TRACKING_COMPLETED".equalsIgnoreCase(str)) {
                nVar.f56385r = true;
                return;
            }
            if ("EVENT_TRACKING".equalsIgnoreCase(str)) {
                for (String str2 : strArr) {
                    nVar.a(nVar.f56383p, VideoClickOrigin.InvalidOrigin, x.a(str2));
                }
            }
        }
    }
}
