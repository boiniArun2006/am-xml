package com.fyber.inneractive.sdk.player.ui.remote;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.player.ui.n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.r;
import com.fyber.inneractive.sdk.util.v;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class d implements com.fyber.inneractive.sdk.web.remoteui.a, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.web.remoteui.a f56473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.web.remoteui.b f56474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f56475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f56476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f56477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f56478f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f56481i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.g f56482j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f56479g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f56480h = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f56483k = new b(this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f56484l = new c(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f56485m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f56486n = false;

    @Override // com.fyber.inneractive.sdk.web.remoteui.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, boolean z2, HashMap map) {
        HashMap map2;
        IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
        r.f57026b.removeCallbacks(this.f56483k);
        String str2 = (map == null || !map.containsKey("failedURL")) ? this.f56478f : (String) map.get("failedURL");
        if (z2) {
            if (b() != null) {
                b().f56847I = false;
            }
            a();
            t tVar = t.VAST_ERROR_DVC_FAILURE;
            t0 t0Var = this.f56475c;
            com.fyber.inneractive.sdk.network.events.a.a(tVar, bVar, t0Var != null ? t0Var.f53977a : null, b(), str, str2, Boolean.valueOf(this.f56481i));
            map2 = map;
        } else {
            t tVar2 = t.VAST_ERROR_DVC_FAILURE;
            String strName = bVar.name();
            t0 t0Var2 = this.f56475c;
            map2 = map;
            com.fyber.inneractive.sdk.network.events.a.a(tVar2, strName, str2, t0Var2 != null ? t0Var2.f53977a : null, b(), map2, Boolean.valueOf(this.f56481i));
        }
        com.fyber.inneractive.sdk.web.remoteui.a aVar = this.f56473a;
        if (aVar != null) {
            aVar.a(bVar, str, z2, map2);
        }
    }

    public final com.fyber.inneractive.sdk.response.e b() {
        t0 t0Var = this.f56475c;
        if (t0Var != null) {
            return t0Var.f53978b;
        }
        return null;
    }

    public d(Context context, t0 t0Var, String str) {
        InneractiveAdRequest inneractiveAdRequest;
        this.f56475c = t0Var;
        this.f56478f = str;
        com.fyber.inneractive.sdk.web.remoteui.b bVar = new com.fyber.inneractive.sdk.web.remoteui.b();
        this.f56474b = bVar;
        this.f56476d = new e(this);
        bVar.setCommandHandler(this);
        bVar.setResultFailureListener(this);
        bVar.setCommandHandler(this);
        if (t0Var != null) {
            inneractiveAdRequest = t0Var.f53977a;
        } else {
            inneractiveAdRequest = null;
        }
        this.f56482j = new com.fyber.inneractive.sdk.flow.g(context, true, inneractiveAdRequest, b(), null);
    }

    public final void a() {
        this.f56480h = true;
        this.f56477e = null;
        e eVar = this.f56476d;
        eVar.f56488b.clear();
        eVar.f56487a = null;
        IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
        r.f57026b.removeCallbacks(this.f56483k);
        this.f56474b.setVisibility(8);
        this.f56474b.setUiReady(false);
        v.a(this.f56474b);
        this.f56474b.destroy();
        this.f56482j = null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.remote.a
    public final void a(String str, HashMap map) {
        g1 lastClickedLocation;
        e eVar;
        d dVar;
        com.fyber.inneractive.sdk.flow.g gVar;
        lastClickedLocation = this.f56474b.getLastClickedLocation();
        eVar = this.f56476d;
        eVar.getClass();
        str.getClass();
        switch (str) {
            case "clickSkip":
                eVar.a(6, lastClickedLocation);
                break;
            case "expandCollapseClick":
                eVar.a(5, lastClickedLocation);
                break;
            case "appInfoClick":
                eVar.a(10, lastClickedLocation);
                break;
            case "shouldSkipUpdateUi.true":
                d dVar2 = eVar.f56487a;
                if (dVar2 != null) {
                    dVar2.f56485m = true;
                    break;
                }
                break;
            case "onGeneralError":
                d dVar3 = eVar.f56487a;
                if (dVar3 != null) {
                    dVar3.a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_GENERAL_ERROR, (String) map.get(MRAIDPresenter.ERROR), "true".equalsIgnoreCase((String) map.get("shouldFailUi")), map);
                    break;
                }
                break;
            case "ctaClick":
                eVar.a(3, lastClickedLocation);
                break;
            case "isSkipEnabled.false":
                d dVar4 = eVar.f56487a;
                if (dVar4 != null) {
                    dVar4.f56486n = false;
                    break;
                }
                break;
            case "clickMuteUnmute":
                eVar.a(1, lastClickedLocation);
                break;
            case "DOMLoaded":
                String str2 = eVar.f56489c ? "FyberRemoteUiBridge.setMute()" : "FyberRemoteUiBridge.setUnmute()";
                d dVar5 = eVar.f56487a;
                if (dVar5 != null) {
                    dVar5.f56474b.a(str2);
                }
                Iterator it = eVar.f56488b.keySet().iterator();
                while (it.hasNext()) {
                    String str3 = (String) eVar.f56488b.get((String) it.next());
                    if (!TextUtils.isEmpty(str3) && (dVar = eVar.f56487a) != null) {
                        dVar.f56474b.a(str3);
                    }
                }
                eVar.f56488b.clear();
                d dVar6 = eVar.f56487a;
                if (dVar6 != null) {
                    IAlog.a("%s : remote UI loaded successfully", "RemoteUIWebviewController");
                    IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
                    r.f57026b.removeCallbacks(dVar6.f56483k);
                    dVar6.f56479g = false;
                    dVar6.f56474b.setUiReady(true);
                    if (dVar6.b() != null) {
                        dVar6.b().f56847I = true;
                    }
                    dVar6.f56474b.setVisibility(0);
                    break;
                }
                break;
            case "adIdentifierClick":
                d dVar7 = eVar.f56487a;
                if (dVar7 != null && (gVar = dVar7.f56482j) != null) {
                    gVar.a();
                    break;
                }
                break;
            case "shouldSkipUpdateUi.false":
                d dVar8 = eVar.f56487a;
                if (dVar8 != null) {
                    dVar8.f56485m = false;
                    break;
                }
                break;
            case "isSkipEnabled.true":
                d dVar9 = eVar.f56487a;
                if (dVar9 != null) {
                    dVar9.f56486n = true;
                    break;
                }
                break;
            case "onVideoClick":
                eVar.a(7, lastClickedLocation);
                break;
            case "onResourceError":
                d dVar10 = eVar.f56487a;
                if (dVar10 != null) {
                    dVar10.a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_RESOURCE_ERROR, (String) map.get(MRAIDPresenter.ERROR), true, map);
                    break;
                }
                break;
            default:
                IAlog.a("%s: unknown command: %s", "RemoteUiCommandHandler", str);
                break;
        }
        d dVar11 = eVar.f56487a;
        if (dVar11 != null) {
            dVar11.f56474b.a("FyberRemoteUiBridge.nativeCallComplete()");
        }
    }
}
