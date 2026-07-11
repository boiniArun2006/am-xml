package com.fyber.inneractive.sdk.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.webkit.WebView;
import androidx.core.net.Toe.GDEJgAYrPQHfw;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.mraid.e0;
import com.fyber.inneractive.sdk.mraid.f0;
import com.fyber.inneractive.sdk.mraid.j;
import com.fyber.inneractive.sdk.mraid.k;
import com.fyber.inneractive.sdk.mraid.l;
import com.fyber.inneractive.sdk.mraid.n;
import com.fyber.inneractive.sdk.mraid.o;
import com.fyber.inneractive.sdk.mraid.p;
import com.fyber.inneractive.sdk.mraid.q;
import com.fyber.inneractive.sdk.mraid.s;
import com.fyber.inneractive.sdk.mraid.t;
import com.fyber.inneractive.sdk.mraid.u;
import com.fyber.inneractive.sdk.mraid.v;
import com.fyber.inneractive.sdk.mraid.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.b0;
import com.fyber.inneractive.sdk.web.c0;
import com.fyber.inneractive.sdk.web.d0;
import com.fyber.inneractive.sdk.web.g0;
import com.fyber.inneractive.sdk.web.i0;
import com.fyber.inneractive.sdk.web.j1;
import com.fyber.inneractive.sdk.web.m;
import com.fyber.inneractive.sdk.web.z;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class IAmraidWebViewController extends i0 {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final e f56946r0;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public static class MraidVideoFailedToDisplayError extends InneractiveUnitController.AdDisplayError {
        public MraidVideoFailedToDisplayError() {
            super("an MRAID video has not started playing in a timely fashion");
        }
    }

    public IAmraidWebViewController(boolean z2, c0 c0Var, z zVar, d0 d0Var, boolean z3, com.fyber.inneractive.sdk.measurement.e eVar, r rVar) {
        super(z2, c0Var, zVar, d0Var, eVar, rVar);
        this.f56946r0 = new e(this);
        this.f57153F = z3;
        this.f57113b.setId(R.id.ia_inneractive_webview_mraid);
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final boolean a(String str, g1 g1Var) {
        com.fyber.inneractive.sdk.mraid.f gVar;
        com.fyber.inneractive.sdk.mraid.f fVar;
        m mVar;
        Uri uri = Uri.parse(str);
        String string = uri.toString();
        uri.getScheme();
        if (string.startsWith("iaadfinishedloading")) {
            if (string.endsWith("success")) {
                IAlog.e("received iaadfinishedloading success", new Object[0]);
                if (!this.f57112a && this.f57117f != null && (mVar = this.f57113b) != null) {
                    mVar.a();
                    this.f57112a = true;
                    q();
                }
            }
            return true;
        }
        String scheme = Uri.parse(str).getScheme();
        m mVar2 = this.f57113b;
        if (mVar2 != null && mVar2.isShown() && this.f57132N != f0.HIDDEN) {
            if (!CreativeInfo.f62459w.equals(scheme)) {
                return false;
            }
            URI uriCreate = URI.create(str);
            String host = uriCreate.getHost();
            try {
                LinkedHashMap linkedHashMapA = i0.a(uriCreate);
                switch (j.f54209a[k.a(host).ordinal()]) {
                    case 1:
                        gVar = new com.fyber.inneractive.sdk.mraid.g(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 2:
                        gVar = new com.fyber.inneractive.sdk.mraid.i(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 3:
                        gVar = new w(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 4:
                        gVar = new q(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 5:
                        gVar = new s(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 6:
                        gVar = new o(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 7:
                        gVar = new u(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 8:
                        gVar = new t(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 9:
                        gVar = new com.fyber.inneractive.sdk.mraid.r(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 10:
                        gVar = new v(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 11:
                        gVar = new l(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 12:
                        gVar = new com.fyber.inneractive.sdk.mraid.m(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 13:
                        gVar = new n(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 14:
                        gVar = new p(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 15:
                        gVar = new com.fyber.inneractive.sdk.mraid.h(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    default:
                        fVar = null;
                        break;
                }
                if (fVar == null || ((fVar instanceof com.fyber.inneractive.sdk.mraid.i) && this.f57135Q == c0.INTERSTITIAL)) {
                    m mVar3 = this.f57113b;
                    if (mVar3 != null) {
                        mVar3.a("window.mraidbridge.nativeCallComplete('" + host + "');");
                    }
                } else {
                    fVar.f54204a = host;
                    IAlog.e("Processing MRaid command: %s", host);
                    if (fVar instanceof com.fyber.inneractive.sdk.mraid.e) {
                        a(new com.fyber.inneractive.sdk.web.f0(this, (com.fyber.inneractive.sdk.mraid.e) fVar));
                    } else {
                        if (fVar.b()) {
                            i();
                        }
                        fVar.a();
                    }
                    m mVar4 = this.f57113b;
                    if (mVar4 != null) {
                        mVar4.a("window.mraidbridge.nativeCallComplete('" + host + "');");
                    }
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final void e() {
        b(false);
        Handler handler = com.fyber.inneractive.sdk.util.r.f57026b;
        handler.removeCallbacks(this.f56946r0);
        handler.removeCallbacks(this.f57157J);
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final com.fyber.inneractive.sdk.measurement.tracker.e f() {
        return this.f57156I;
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public final void n() {
        m mVar;
        if (this.f57150C && this.f57151D && this.f57148A && (mVar = this.f57113b) != null) {
            mVar.a("FyberMraidVideoController.play()");
            e eVar = this.f56946r0;
            if (eVar != null) {
                com.fyber.inneractive.sdk.util.r.f57026b.postDelayed(eVar, 5000L);
            }
            if (this.f57152E) {
                this.f57113b.a("FyberMraidVideoController.mute(true)");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    @Override // com.fyber.inneractive.sdk.web.i0, com.fyber.inneractive.sdk.web.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        boolean z2;
        String externalStorageState;
        int size;
        super.k();
        m mVar = this.f57113b;
        boolean z3 = true;
        if (mVar != null && mVar.getContext() != null) {
            try {
                size = com.fyber.inneractive.sdk.util.o.f57018a.getPackageManager().queryIntentActivities(new Intent(this.f57113b.getContext(), (Class<?>) InneractiveRichMediaVideoPlayerActivityCore.class), 0).size();
            } catch (Throwable unused) {
                size = 0;
            }
            if (size > 0) {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        e0 e0Var = new e0();
        e0Var.f54200b = com.fyber.inneractive.sdk.util.k.n();
        e0Var.f54199a = com.fyber.inneractive.sdk.util.k.n();
        e0Var.f54201c = true;
        e0Var.f54203e = z2;
        try {
            externalStorageState = Environment.getExternalStorageState();
        } catch (Throwable unused2) {
            externalStorageState = "";
        }
        if (!GDEJgAYrPQHfw.xelPd.equals(externalStorageState) || com.fyber.inneractive.sdk.util.o.f57018a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            z3 = false;
        }
        e0Var.f54202d = z3;
        a(e0Var);
    }

    @Override // com.fyber.inneractive.sdk.web.i0, com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.j
    public final boolean a(WebView webView, String str) {
        r rVar;
        IAlog.a("IAmraidWebViewController: handleUrl = %s", str);
        if (this.f57113b == null) {
            IAlog.a("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
            return false;
        }
        String lowerCase = str != null ? str.toLowerCase(Locale.US) : null;
        if (lowerCase != null) {
            Locale locale = Locale.US;
            if (lowerCase.startsWith("FyMraidVideo".toLowerCase(locale))) {
                if (lowerCase.endsWith("fyMraidVideoAd".toLowerCase(locale))) {
                    com.fyber.inneractive.sdk.config.s sVar = IAConfigManager.f53260M.f53294t;
                    com.fyber.inneractive.sdk.config.o oVar = sVar != null ? sVar.f53466b : null;
                    if (!(oVar == null ? false : oVar.a(false, "e_61"))) {
                        IAlog.a("%sEvent 61 is disabled", IAlog.a(this));
                    } else {
                        IAlog.e("Dispatching MRAID Video detection event", new Object[0]);
                        com.fyber.inneractive.sdk.response.e eVar = this.f57131t;
                        if (eVar == null) {
                            x xVar = this.f57130s;
                            eVar = xVar == null ? null : xVar.f53978b;
                        }
                        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.MRAID_VIDEO_DETECTED;
                        InneractiveAdRequest inneractiveAdRequest = this.f57129r;
                        x xVar2 = this.f57130s;
                        JSONArray jSONArrayB = (xVar2 == null || (rVar = xVar2.f53979c) == null) ? null : rVar.b();
                        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
                        wVar.f54359c = uVar;
                        wVar.f54357a = inneractiveAdRequest;
                        wVar.f54360d = jSONArrayB;
                        wVar.a((String) null);
                    }
                    this.f57151D = true;
                    n();
                } else if (lowerCase.endsWith("fyMraidVideoAdPlaybackFailure".toLowerCase(locale))) {
                    IAlog.b("MRAID Video has not started in a timely fashion, showing close button", new Object[0]);
                    j1 j1Var = this.f57118g;
                    if (j1Var != null) {
                        this.f57142X = false;
                        ((b0) j1Var).b(false);
                        com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.MRAID_VIDEO_HAS_NOT_STARTED_PLAYING_IN_A_TIMELY_FASHION;
                        InneractiveAdRequest inneractiveAdRequest2 = this.f57129r;
                        x xVar3 = this.f57130s;
                        com.fyber.inneractive.sdk.response.e eVar2 = xVar3 == null ? null : xVar3.f53978b;
                        JSONArray jSONArrayB2 = xVar3 == null ? null : xVar3.f53979c.b();
                        com.fyber.inneractive.sdk.network.w wVar2 = new com.fyber.inneractive.sdk.network.w(eVar2);
                        wVar2.f54358b = tVar;
                        wVar2.f54357a = inneractiveAdRequest2;
                        wVar2.f54360d = jSONArrayB2;
                        wVar2.a("video_timeout_in_msecs", String.valueOf(5000)).a((String) null);
                    }
                    j1 j1Var2 = this.f57118g;
                    if (j1Var2 != null) {
                        ((b0) j1Var2).a(new MraidVideoFailedToDisplayError());
                    }
                } else if (str.toLowerCase(locale).endsWith("fyMraidVideoAdCompleted".toLowerCase(locale))) {
                    j1 j1Var3 = this.f57118g;
                    if (j1Var3 instanceof g0) {
                        ((g0) j1Var3).b();
                    }
                }
                return true;
            }
        }
        return super.a(webView, str);
    }

    @Override // com.fyber.inneractive.sdk.web.i0, com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.l
    public final void a(boolean z2) {
        m mVar;
        super.a(z2);
        if (this.f57151D && this.f57150C && this.f57148A && (mVar = this.f57113b) != null) {
            StringBuilder sb = new StringBuilder("FyberMraidVideoController.");
            sb.append(z2 ? "play" : "pause");
            sb.append("();");
            mVar.a(sb.toString());
        }
        if (this.f57113b == null || !z2) {
            return;
        }
        Handler handler = com.fyber.inneractive.sdk.util.r.f57026b;
        handler.postDelayed(new f(this), 1L);
        handler.postDelayed(new f(this), 100L);
        handler.postDelayed(new f(this), 250L);
        handler.postDelayed(new f(this), 1000L);
    }
}
