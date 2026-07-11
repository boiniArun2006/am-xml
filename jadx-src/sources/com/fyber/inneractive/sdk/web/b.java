package com.fyber.inneractive.sdk.web;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class b extends i1 {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.endcard.q f57071N;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.fyber.inneractive.sdk.web.i
    public final boolean a(String str, com.fyber.inneractive.sdk.util.g1 g1Var) {
        String str2;
        if (str != null) {
            Locale locale = Locale.US;
            if (str.toLowerCase(locale).startsWith("fmpendcard://".toLowerCase(locale))) {
                com.fyber.inneractive.sdk.flow.endcard.q qVar = this.f57071N;
                if (qVar != null) {
                    g gVar = this.f57117f;
                    j1 j1Var = this.f57118g;
                    Uri uri = Uri.parse(str);
                    String authority = uri != null ? uri.getAuthority() : null;
                    if (!TextUtils.isEmpty(authority)) {
                        authority.getClass();
                        switch (authority) {
                            case "success":
                                String queryParameter = uri.getQueryParameter(NodeModuleProcess.PROPERTY_VERSION);
                                if (!TextUtils.isEmpty(queryParameter)) {
                                    qVar.f53651c = queryParameter;
                                }
                                g gVar2 = this.f57117f;
                                if (gVar2 != null) {
                                    gVar2.a(this);
                                    break;
                                }
                                break;
                            case "failure":
                                String queryParameter2 = uri.getQueryParameter(NodeModuleProcess.PROPERTY_VERSION);
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    qVar.f53651c = queryParameter2;
                                }
                                String queryParameter3 = uri.getQueryParameter(MRAIDPresenter.ERROR);
                                if (gVar != null) {
                                    InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_LOAD_FMP_ENDCARD_TO_WEBVIEW);
                                    if (!TextUtils.isEmpty(queryParameter3)) {
                                        inneractiveInfrastructureError.setCause(new Exception(queryParameter3));
                                    }
                                    gVar.a(this, inneractiveInfrastructureError);
                                    break;
                                }
                                break;
                            case "click":
                                if (j1Var != null) {
                                    com.fyber.inneractive.sdk.model.vast.b bVar = qVar.f53650b;
                                    com.fyber.inneractive.sdk.flow.endcard.k kVar = bVar.f54117o;
                                    if (kVar != null) {
                                        com.fyber.inneractive.sdk.flow.endcard.b bVarA = kVar.f53605b.a();
                                        str2 = kVar.f53604a.f53987e.f54104b;
                                        com.fyber.inneractive.sdk.flow.endcard.c cVar = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.f53605b.a(com.fyber.inneractive.sdk.model.vast.i.Other);
                                        if (cVar == null && (cVar = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.f53605b.a(com.fyber.inneractive.sdk.model.vast.i.Html)) == null && (cVar = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.f53605b.a(com.fyber.inneractive.sdk.model.vast.i.Iframe)) == null) {
                                            cVar = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.f53605b.a(com.fyber.inneractive.sdk.model.vast.i.Static);
                                        }
                                        if (bVarA != null && bVarA.j() && cVar != null) {
                                            String str3 = cVar.f53592g.f54125g;
                                            if (!TextUtils.isEmpty(str3)) {
                                                str2 = str3;
                                            }
                                        }
                                    } else {
                                        str2 = bVar.f54104b;
                                    }
                                    j1Var.a(str2, g1Var);
                                    break;
                                }
                                break;
                        }
                    } else if (gVar != null) {
                        InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_LOAD_FMP_ENDCARD_TO_WEBVIEW);
                        if (!TextUtils.isEmpty("empty type")) {
                            inneractiveInfrastructureError2.setCause(new Exception("empty type"));
                        }
                        gVar.a(this, inneractiveInfrastructureError2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.web.l
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.web.l
    public final void c() {
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final com.fyber.inneractive.sdk.measurement.tracker.e f() {
        return null;
    }

    public b(com.fyber.inneractive.sdk.flow.endcard.q qVar, boolean z2) {
        super(z2, c0.INTERSTITIAL, null);
        this.f57071N = qVar;
    }

    @Override // com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.j
    public final void d() {
        if (this.f57071N == null || this.f57117f == null) {
            return;
        }
        this.f57117f.a(this, new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.WEBVIEW_FMP_ENDCARD_ERROR));
    }

    @Override // com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.j
    public final void a(WebView webView) {
        String string;
        if (webView == null || this.f57071N == null) {
            return;
        }
        webView.setLongClickable(false);
        webView.setOnLongClickListener(new com.fyber.inneractive.sdk.util.p0());
        com.fyber.inneractive.sdk.flow.endcard.q qVar = this.f57071N;
        com.fyber.inneractive.sdk.flow.endcard.p pVar = (com.fyber.inneractive.sdk.flow.endcard.p) qVar.f53652d.f();
        pVar.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            com.fyber.inneractive.sdk.util.c1.a(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, pVar.f53646j);
            JSONArray jSONArray = new JSONArray();
            String str = pVar.f53647k;
            if (!TextUtils.isEmpty(str)) {
                jSONArray.put(str);
            }
            com.fyber.inneractive.sdk.util.c1.a(jSONObject, "icons", jSONArray);
            string = jSONObject.toString();
        } catch (Exception e2) {
            IAlog.a("%s FMP End-Card JSON error: %s", e2, pVar.f53584a, e2.getMessage());
            string = null;
        }
        if (TextUtils.isEmpty(string)) {
            IAlog.f("%s FMP End-Card JSON required", qVar.f53649a);
            return;
        }
        com.fyber.inneractive.sdk.util.q0.a(webView, "loadAssets(" + string + ");");
    }

    @Override // com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.j
    public final void a() {
        super.a();
        if (this.f57117f != null) {
            this.f57117f.a(this, new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.WEBVIEW_FMP_ENDCARD_ERROR, new WebViewRendererProcessHasGoneError()));
        }
    }
}
