package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.network.h1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.y0;
import com.fyber.inneractive.sdk.util.z0;
import com.safedk.android.internal.special.SpecialsBridge;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class b0 implements InneractiveAdRenderer, InneractiveInternalBrowserActivity.InternalBrowserListener, com.fyber.inneractive.sdk.click.f, com.fyber.inneractive.sdk.web.t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InneractiveAdSpot f53561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f53562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InneractiveUnitController.EventsListener f53563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f53564d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f53565e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f53566f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f53567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.click.r f53568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z f53569i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f53570j;

    public boolean B() {
        return false;
    }

    public boolean D() {
        return this instanceof com.fyber.inneractive.sdk.renderers.c0;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.fyber.inneractive.sdk.util.d0 a(Context context, String str, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar, boolean z2, com.fyber.inneractive.sdk.click.o oVar) {
        String queryParameter;
        String strReplace;
        boolean z3;
        com.fyber.inneractive.sdk.click.r rVar;
        com.fyber.inneractive.sdk.web.v0 v0VarA;
        x xVar;
        com.fyber.inneractive.sdk.click.r rVar2;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.response.e eVar2;
        if (!z2 && (!this.f53566f || this.f53564d)) {
            String str2 = this.f53564d ? "external/browser is already open" : "click is in grace period";
            IAlog.a("InneractiveAdRendererImpl: openClickThroughUrl - %s", str2);
            return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new Exception(str2));
        }
        if (context != null) {
            IAlog.a("%sBlocking clicks until grace has ended", IAlog.a(this));
            this.f53566f = false;
            Runnable runnable = this.f53567g;
            if (runnable != null) {
                com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(runnable);
            }
            a0 a0Var = new a0(this);
            this.f53567g = a0Var;
            com.fyber.inneractive.sdk.util.r.f57026b.postDelayed(a0Var, 1000L);
        }
        float f3 = g1Var.f56998a;
        c(z2);
        if (TextUtils.isEmpty(str)) {
            IAlog.a("InneractiveAdRendererImpl: openClickThroughUrl - is empty", new Object[0]);
            return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new Exception("empty url"));
        }
        x xVar2 = this.f53562b;
        if (xVar2 != null && (eVar2 = xVar2.f53978b) != null && eVar2.a()) {
            com.fyber.inneractive.sdk.ignite.h hVar = IAConfigManager.f53260M.f53266D;
            if (hVar.f54016f) {
                hVar.a((gm.j) null);
            }
        }
        this.f53569i = new z(this, g1Var, gVar, oVar);
        if (!TextUtils.isEmpty(str)) {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            queryParameter = (scheme == null || !scheme.equals("fybernativebrowser") || host == null || !host.equals("navigate")) ? null : uri.getQueryParameter("url");
        }
        String scheme2 = !TextUtils.isEmpty(str) ? Uri.parse(str).getScheme() : null;
        if (TextUtils.isEmpty(queryParameter)) {
            strReplace = str;
            if (!strReplace.contains("FYBER_OPEN_BROWSER")) {
                z3 = true;
            }
            if (strReplace.contains("[IS_CTA_CLICK]")) {
                strReplace = strReplace.replace("[IS_CTA_CLICK]", String.valueOf(B() && gVar == com.fyber.inneractive.sdk.util.g.VIDEO_CTA));
            }
            String str3 = strReplace;
            if (x() != null) {
                v();
            }
            rVar = this.f53568h;
            if (rVar != null) {
                rVar.f53251f = true;
                Iterator it = rVar.f53255j.iterator();
                while (it.hasNext()) {
                    ((com.fyber.inneractive.sdk.click.a) it.next()).a();
                }
                rVar.f53255j.clear();
                h1 h1Var = rVar.f53254i;
                if (h1Var != null) {
                    h1Var.f54315a = true;
                }
                z0 z0Var = rVar.f53246a;
                z0Var.f57065c = false;
                com.fyber.inneractive.sdk.config.e eVar3 = IAConfigManager.f53260M.f53297w.f53493b;
                if (eVar3 != null) {
                    eVar3.f53322a.remove(z0Var);
                }
                rVar.f53250e = null;
                this.f53568h = null;
            }
            com.fyber.inneractive.sdk.click.r rVar3 = new com.fyber.inneractive.sdk.click.r(z3, this.f53562b);
            rVar3.f53255j.addAll(Arrays.asList(new com.fyber.inneractive.sdk.click.i(!z3, scheme2), new com.fyber.inneractive.sdk.click.g(this, g1Var, gVar), new com.fyber.inneractive.sdk.click.d(), new com.fyber.inneractive.sdk.click.h(), new com.fyber.inneractive.sdk.click.l()));
            this.f53568h = rVar3;
            x xVar3 = this.f53562b;
            v0VarA = xVar3 == null ? xVar3.a() : null;
            if (v0VarA != null) {
                v0VarA.f57219i = this;
            }
            x xVar4 = this.f53562b;
            boolean z4 = xVar4 == null && xVar4.a(g1Var.f57000c, gVar);
            xVar = this.f53562b;
            if (xVar != null && xVar.f53978b != null) {
                xVar.e();
            }
            rVar2 = this.f53568h;
            if (rVar2 != null) {
                z zVar = this.f53569i;
                x xVar5 = this.f53562b;
                com.fyber.inneractive.sdk.ignite.m mVar = (xVar5 == null || (eVar = xVar5.f53978b) == null) ? com.fyber.inneractive.sdk.ignite.m.NONE : eVar.f56843E;
                InneractiveAdSpot inneractiveAdSpot = this.f53561a;
                rVar2.a(context, str3, zVar, v0VarA, z4, mVar, inneractiveAdSpot != null ? inneractiveAdSpot.getLocalUniqueId() : null);
            }
            com.fyber.inneractive.sdk.util.g0 g0Var = com.fyber.inneractive.sdk.util.g0.OPEN_IN_EXTERNAL_APPLICATION;
            context.getClass();
            return new com.fyber.inneractive.sdk.util.d0(g0Var, null);
        }
        strReplace = queryParameter;
        z3 = false;
        if (strReplace.contains("[IS_CTA_CLICK]")) {
        }
        String str32 = strReplace;
        if (x() != null) {
        }
        rVar = this.f53568h;
        if (rVar != null) {
        }
        com.fyber.inneractive.sdk.click.r rVar32 = new com.fyber.inneractive.sdk.click.r(z3, this.f53562b);
        rVar32.f53255j.addAll(Arrays.asList(new com.fyber.inneractive.sdk.click.i(!z3, scheme2), new com.fyber.inneractive.sdk.click.g(this, g1Var, gVar), new com.fyber.inneractive.sdk.click.d(), new com.fyber.inneractive.sdk.click.h(), new com.fyber.inneractive.sdk.click.l()));
        this.f53568h = rVar32;
        x xVar32 = this.f53562b;
        if (xVar32 == null) {
        }
        if (v0VarA != null) {
        }
        x xVar42 = this.f53562b;
        if (xVar42 == null) {
        }
        xVar = this.f53562b;
        if (xVar != null) {
            xVar.e();
        }
        rVar2 = this.f53568h;
        if (rVar2 != null) {
        }
        com.fyber.inneractive.sdk.util.g0 g0Var2 = com.fyber.inneractive.sdk.util.g0.OPEN_IN_EXTERNAL_APPLICATION;
        context.getClass();
        return new com.fyber.inneractive.sdk.util.d0(g0Var2, null);
    }

    public final void c(boolean z2) {
        com.fyber.inneractive.sdk.response.e eVar;
        if (z2) {
            IAlog.a("%s : will not notify click on fallback", IAlog.a(this));
            return;
        }
        if (this.f53563c != null) {
            IAlog.a("%sCalling external interface onAdClicked", IAlog.a(this));
            this.f53563c.onAdClicked(this.f53561a);
        }
        x xVar = this.f53562b;
        if (xVar == null || (eVar = xVar.f53978b) == null) {
            return;
        }
        IAConfigManager.f53260M.f53297w.a(eVar.f56862n, "LAST_CLICKED", "1");
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public boolean canRefreshAd() {
        return true;
    }

    public void d(View view) {
    }

    public void e(View view) {
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public final void onInternalBrowserDismissed() {
        IAlog.a("onInternalBrowserDismissed callback called", new Object[0]);
        if (this.f53564d) {
            this.f53564d = false;
            InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
        }
        if (this.f53563c != null) {
            IAlog.a("%sCalling external interface onAdWillCloseInternalBrowser", IAlog.a(this));
            this.f53563c.onAdWillCloseInternalBrowser(this.f53561a);
        }
    }

    public abstract View x();

    public int y() {
        return -1;
    }

    public int z() {
        return -1;
    }

    public final boolean A() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        x xVar = this.f53562b;
        if (xVar == null || (rVar = xVar.f53979c) == null || rVar.a(com.fyber.inneractive.sdk.config.global.features.c.class) == null) {
            return false;
        }
        com.fyber.inneractive.sdk.config.global.features.c cVar = (com.fyber.inneractive.sdk.config.global.features.c) this.f53562b.f53979c.a(com.fyber.inneractive.sdk.config.global.features.c.class);
        cVar.getClass();
        return new ArrayList(cVar.f53362c.values()).size() > 0;
    }

    public boolean C() {
        x xVar = this.f53562b;
        if (xVar != null) {
            return xVar.b();
        }
        return true;
    }

    public final void F() {
        if (this.f53563c != null) {
            IAlog.a("%sCalling external interface onAdWillOpenExternalApp", IAlog.a(this));
            this.f53563c.onAdWillOpenExternalApp(this.f53561a);
        }
    }

    public final void H() {
        com.fyber.inneractive.sdk.response.e eVar;
        x xVar = this.f53562b;
        if (xVar == null || (eVar = xVar.f53978b) == null) {
            return;
        }
        String str = eVar.f56863o;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IAlog.e("%sfiring rewarded completion!", IAlog.a(this));
        IAlog.d("AD_REWARDED_COMPLETION", new Object[0]);
        com.fyber.inneractive.sdk.network.z0.b(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(com.fyber.inneractive.sdk.click.b bVar, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        boolean z2;
        boolean z3;
        com.fyber.inneractive.sdk.config.global.r rVar;
        com.fyber.inneractive.sdk.config.global.r rVar2;
        com.fyber.inneractive.sdk.config.global.r rVar3;
        x xVar = this.f53562b;
        InneractiveAdRequest inneractiveAdRequest = xVar != null ? xVar.f53977a : null;
        com.fyber.inneractive.sdk.response.e eVar = xVar != null ? xVar.f53978b : null;
        JSONArray jSONArrayB = (xVar == null || (rVar3 = xVar.f53979c) == null) ? null : rVar3.b();
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.FYBER_SUCCESS_CLICK;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.f54359c = uVar;
        wVar.f54357a = inneractiveAdRequest;
        wVar.f54360d = jSONArrayB;
        com.fyber.inneractive.sdk.network.x xVar2 = new com.fyber.inneractive.sdk.network.x();
        int iZ = z();
        int iY = y();
        long j2 = bVar.f53217e;
        if (j2 != 0) {
            xVar2.a(Long.valueOf(j2), "time_passed");
        }
        JSONArray jSONArray = new JSONArray();
        for (com.fyber.inneractive.sdk.click.j jVar : bVar.f53218f) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", jVar.f53235a);
                jSONObject.put("success", jVar.f53236b);
                jSONObject.put("opened_by", jVar.f53237c);
                jSONObject.put(JavetError.PARAMETER_REASON, jVar.f53238d);
            } catch (Exception unused) {
            }
            jSONArray.put(jSONObject);
        }
        xVar2.a(jSONArray, "urls");
        xVar2.a(gVar, "origin");
        if (gVar == com.fyber.inneractive.sdk.util.g.FMP_ENDCARD) {
            xVar2.a(gVar.a(), NodeModuleProcess.PROPERTY_VERSION);
        }
        if (g1Var != null && g1Var.f57000c) {
            xVar2.a(Boolean.TRUE, "is_auto_click");
        }
        if (g1Var != null) {
            if (g1Var.f56998a > 0.0f && g1Var.f56999b > 0.0f) {
                int iB = C() ? iZ : com.fyber.inneractive.sdk.util.o.b(iZ);
                float f3 = iB == 0 ? 0.0f : g1Var.f56998a / iB;
                int iB2 = C() ? iY : com.fyber.inneractive.sdk.util.o.b(iY);
                float f4 = iB2 != 0 ? g1Var.f56999b / iB2 : 0.0f;
                IAlog.a("Point location -  x - %.2f , y- %.2f", Float.valueOf(f3), Float.valueOf(f4));
                C();
                Locale locale = Locale.ENGLISH;
                com.fyber.inneractive.sdk.network.x xVarA = xVar2.a(String.format(locale, "%.2f", Float.valueOf(f3)), "td_x");
                C();
                xVarA.a(String.format(locale, "%.2f", Float.valueOf(f4)), "td_y");
            }
        }
        boolean z4 = true;
        if (C() || D()) {
            xVar2.a(com.fyber.inneractive.sdk.util.o.c() == 1 ? TtmlNode.TAG_P : CmcdData.STREAM_TYPE_LIVE, "o");
        } else if (iZ > 0 || iY > 0) {
            xVar2.a(Integer.valueOf(iZ), "b_w");
            xVar2.a(Integer.valueOf(iY), "b_h");
        }
        x xVar3 = this.f53562b;
        com.fyber.inneractive.sdk.config.global.features.d dVar = (xVar3 == null || (rVar2 = xVar3.f53979c) == null) ? null : (com.fyber.inneractive.sdk.config.global.features.d) rVar2.a(com.fyber.inneractive.sdk.config.global.features.d.class);
        if (dVar == null) {
            z2 = false;
        } else {
            com.fyber.inneractive.sdk.model.vast.a aVar = dVar.f53360e;
            if (aVar != null ? aVar.f54101d : false) {
                z2 = true;
            }
        }
        if (!z2) {
            z4 = false;
        } else if (!com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD.equals(gVar) && !com.fyber.inneractive.sdk.util.g.VIDEO_CTA.equals(gVar)) {
            if (com.fyber.inneractive.sdk.util.g.VIDEO_CLICK.equals(gVar)) {
                x xVar4 = this.f53562b;
                com.fyber.inneractive.sdk.config.global.features.v vVar = (xVar4 == null || (rVar = xVar4.f53979c) == null) ? null : (com.fyber.inneractive.sdk.config.global.features.v) rVar.a(com.fyber.inneractive.sdk.config.global.features.v.class);
                if (vVar == null) {
                    z3 = false;
                    if (!z3) {
                    }
                } else {
                    Boolean boolC = vVar.c("show_cta");
                    if (boolC != null ? boolC.booleanValue() : true) {
                        z3 = true;
                    }
                    if (!z3) {
                    }
                }
            }
        }
        if (z4) {
            xVar2.a(IAConfigManager.f53260M.f53289o, "cta_lng");
        }
        wVar.f54362f.put(xVar2.f54364a);
        wVar.a((String) null);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        if (this.f53564d) {
            InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
            this.f53564d = false;
        }
        Runnable runnable = this.f53567g;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(runnable);
            this.f53567g = null;
        }
        this.f53562b = null;
        this.f53563c = null;
        this.f53561a = null;
        if (this.f53568h != null) {
            G();
            com.fyber.inneractive.sdk.click.r rVar = this.f53568h;
            rVar.f53251f = true;
            Iterator it = rVar.f53255j.iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.click.a) it.next()).a();
            }
            rVar.f53255j.clear();
            h1 h1Var = rVar.f53254i;
            if (h1Var != null) {
                h1Var.f54315a = true;
            }
            z0 z0Var = rVar.f53246a;
            z0Var.f57065c = false;
            com.fyber.inneractive.sdk.config.e eVar = IAConfigManager.f53260M.f53297w.f53493b;
            if (eVar != null) {
                eVar.f53322a.remove(z0Var);
            }
            rVar.f53250e = null;
            this.f53568h = null;
            this.f53569i = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void initialize(InneractiveAdSpot inneractiveAdSpot) {
        this.f53561a = inneractiveAdSpot;
        this.f53562b = inneractiveAdSpot.getAdContent();
        this.f53563c = inneractiveAdSpot.getSelectedUnitController().getEventsListener();
    }

    public final com.fyber.inneractive.sdk.ignite.m o() {
        com.fyber.inneractive.sdk.response.e eVar;
        x xVar = this.f53562b;
        return (xVar == null || !xVar.c() || (eVar = this.f53562b.f53978b) == null) ? com.fyber.inneractive.sdk.ignite.m.NONE : eVar.f56843E;
    }

    public final void E() {
        com.fyber.inneractive.sdk.response.e eVar;
        String advertiserDomain;
        w();
        if (!this.f53565e && this.f53563c != null) {
            IAlog.a("%sCalling external interface onAdImpression", IAlog.a(this));
            this.f53563c.onAdImpression(this.f53561a);
            x xVar = this.f53562b;
            if (xVar != null && (eVar = xVar.f53978b) != null) {
                IAConfigManager iAConfigManager = IAConfigManager.f53260M;
                com.fyber.inneractive.sdk.config.x0 x0Var = iAConfigManager.f53297w;
                if (x0Var != null) {
                    UnitDisplayType unitDisplayType = eVar.f56862n;
                    ImpressionData impressionData = eVar.f56866r;
                    if (impressionData != null) {
                        advertiserDomain = impressionData.getAdvertiserDomain();
                    } else {
                        advertiserDomain = null;
                    }
                    x0Var.a(unitDisplayType, "LAST_DOMAIN_SHOWED", advertiserDomain);
                    x0Var.a(unitDisplayType, "LAST_APP_BUNDLE_ID", eVar.f56872x);
                    if (this.f53562b.isVideoAd()) {
                        x0Var.a(unitDisplayType, new String[]{"LAST_VAST_SKIPED"}[0], "0");
                        x0Var.a(unitDisplayType, new String[]{"LAST_VAST_CLICKED_TYPE"}[0], "0");
                    }
                    x0Var.a(unitDisplayType, new String[]{"LAST_CLICKED"}[0], "0");
                }
                y0 y0Var = iAConfigManager.f53300z;
                com.fyber.inneractive.sdk.config.s0 s0Var = this.f53562b.f53980d;
                ImpressionData impressionData2 = eVar.f56866r;
                if (s0Var != null) {
                    OnGlobalImpressionDataListener onGlobalImpressionDataListener = y0Var.f57061a;
                    if (onGlobalImpressionDataListener != null) {
                        com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) s0Var;
                        SpecialsBridge.fyberOnImpression(onGlobalImpressionDataListener, r0Var.f53416b, r0Var.f53415a, impressionData2);
                    }
                } else {
                    y0Var.getClass();
                }
                InneractiveUnitController.EventsListener eventsListener = this.f53563c;
                if (eventsListener instanceof InneractiveFullscreenAdEventsListenerWithImpressionData) {
                    ((InneractiveFullscreenAdEventsListenerWithImpressionData) eventsListener).onAdImpression(this.f53561a, eVar.f56866r);
                } else if (eventsListener instanceof InneractiveAdViewEventsListenerWithImpressionData) {
                    ((InneractiveAdViewEventsListenerWithImpressionData) eventsListener).onAdImpression(this.f53561a, eVar.f56866r);
                }
            }
            this.f53565e = true;
        }
    }

    public void G() {
        View viewX = x();
        if (viewX != null && this.f53570j != null && viewX.getParent() != null && (viewX.getParent() instanceof ViewGroup)) {
            viewX.getLayoutParams();
            ((ViewGroup) viewX.getParent()).removeView(this.f53570j);
            e(this.f53570j);
            this.f53570j = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public final void onApplicationInBackground() {
        F();
    }

    public void t() {
        E();
    }

    public void v() {
        View viewX = x();
        if (viewX != null && viewX.getParent() != null && (viewX.getParent() instanceof ViewGroup) && this.f53570j == null) {
            View viewInflate = View.inflate(viewX.getContext(), R.layout.ia_layout_click_overlay, null);
            this.f53570j = viewInflate;
            if (viewInflate != null) {
                ((ViewGroup) viewX.getParent()).addView(this.f53570j, viewX.getLayoutParams());
                d(this.f53570j);
            }
        }
    }

    public Context w() {
        return com.fyber.inneractive.sdk.util.o.a(x());
    }

    public final Context c(View view) {
        View view2;
        View[] viewArr = {view, x()};
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                view2 = null;
                break;
            }
            view2 = viewArr[i2];
            if (view2 != null) {
                break;
            }
            i2++;
        }
        return com.fyber.inneractive.sdk.util.o.a(view2);
    }

    @Override // com.fyber.inneractive.sdk.click.f
    public final void a(com.fyber.inneractive.sdk.click.b bVar, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        b(bVar, g1Var, gVar);
    }

    public final void a(String str, com.fyber.inneractive.sdk.click.q qVar) {
        JSONArray jSONArrayB;
        com.fyber.inneractive.sdk.response.e eVar;
        InneractiveAdRequest inneractiveAdRequest;
        x xVar = this.f53562b;
        if (xVar != null) {
            eVar = xVar.f53978b;
            inneractiveAdRequest = xVar.f53977a;
            com.fyber.inneractive.sdk.config.global.r rVar = xVar.f53979c;
            jSONArrayB = rVar != null ? rVar.b() : null;
        } else {
            jSONArrayB = null;
            eVar = null;
            inneractiveAdRequest = null;
        }
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.EXTERNAL_BROWSER_OPENED;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.f54359c = uVar;
        wVar.f54357a = inneractiveAdRequest;
        wVar.f54360d = jSONArrayB;
        wVar.a("url", str).a("fallback", (qVar == com.fyber.inneractive.sdk.click.q.OPENED_USING_CHROME_NAVIGATE || qVar == com.fyber.inneractive.sdk.click.q.OPENED_IN_EXTERNAL_BROWSER) ? "chrome" : "na").a((String) null);
    }

    public final void a(WebViewRendererProcessHasGoneError webViewRendererProcessHasGoneError) {
        String simpleName = webViewRendererProcessHasGoneError.getClass().getSimpleName();
        String message = webViewRendererProcessHasGoneError.getMessage();
        x xVar = this.f53562b;
        com.fyber.inneractive.sdk.network.z.a(simpleName, message, xVar != null ? xVar.f53977a : null, xVar != null ? xVar.f53978b : null);
        if (this.f53563c != null) {
            IAlog.a("%sCalling external interface onAdEnteredErrorState: %s", IAlog.a(this), webViewRendererProcessHasGoneError.getMessage());
            this.f53563c.onAdEnteredErrorState(this.f53561a, webViewRendererProcessHasGoneError);
        }
    }
}
