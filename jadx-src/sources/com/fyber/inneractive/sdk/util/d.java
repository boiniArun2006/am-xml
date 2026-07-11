package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object[] f56989a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.e f56990b;

    public d(com.fyber.inneractive.sdk.web.e eVar) {
        this.f56990b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0156  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean zA;
        String strB;
        com.fyber.inneractive.sdk.measurement.e eVar;
        com.fyber.inneractive.sdk.web.e eVar2 = this.f56990b;
        Object[] objArr = this.f56989a;
        eVar2.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = eVar2.f57094g;
        if (eVar2.f57095h) {
            com.fyber.inneractive.sdk.web.i iVar = eVar2.f57099l;
            String str = eVar2.f57096i;
            String str2 = eVar2.f57097j;
            com.fyber.inneractive.sdk.web.i1 i1Var = (com.fyber.inneractive.sdk.web.i1) iVar;
            i1Var.getClass();
            StringBuilder sb = new StringBuilder("<html><title>DigitalTurbine Ad</title><head><link rel=\"icon\" href=\"data:,\">");
            boolean z2 = false;
            if (TextUtils.isEmpty(string)) {
                IAlog.a("loadHtml called with an empty HTML!", new Object[0]);
            } else if (i1Var.f57153F) {
                String strB2 = o.b("ia_js_load_monitor.txt");
                if (!TextUtils.isEmpty(strB2)) {
                    sb.append(strB2);
                    sb.append("<script> window.iaPreCachedAd = true; </script>");
                    IAConfigManager iAConfigManager = IAConfigManager.f53260M;
                    zA = iAConfigManager.f53294t.f53466b.a(false, "use_js_inline");
                    if (zA || iAConfigManager.f53267E.f53186b == null) {
                        sb.append("<script src=\"https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js\"></script>");
                    } else {
                        sb.append("<script type=\"text/javascript\">");
                        sb.append(iAConfigManager.f53267E.f53186b);
                        sb.append("</script>");
                    }
                    if (!TextUtils.isEmpty(str)) {
                        sb.append(str);
                    }
                    sb.append("<script>var prevWindowOnError = window.onerror; window.onerror = function(err) {if (typeof prevWindowOnError === 'function') {prevWindowOnError.apply();} console.log('WINDOW.ONERROR Javascript Error: ' + err);};</script></head><style>body{text-align:center !important;margin:0;padding:0;}");
                    if (!TextUtils.isEmpty(str2)) {
                        sb.append(str2);
                    }
                    sb.append("</style><body id=\"iaBody\">");
                    if (i1Var.f57149B && i1Var.m()) {
                        if (zA || iAConfigManager.f53267E.f53187c == null) {
                            sb.append("<link rel=\"stylesheet\" href=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css\">");
                        } else {
                            sb.append("<style type=\"text/css\">");
                            sb.append(iAConfigManager.f53267E.f53187c);
                            sb.append("</style>");
                        }
                        if (zA || iAConfigManager.f53267E.f53188d == null) {
                            sb.append("<script src=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js\"></script>");
                        } else {
                            sb.append("<script type=\"text/javascript\">");
                            sb.append(iAConfigManager.f53267E.f53188d);
                            sb.append("</script>");
                        }
                    }
                    strB = o.b("ia_mraid_bridge.txt");
                    if (!TextUtils.isEmpty(strB)) {
                        sb.append("<div id='iaScriptBr' style='display:none;'>");
                        sb.append(strB);
                        sb.append("</div>");
                        if (IAlog.f56974a >= 2) {
                            sb.append("<script type=\"text/javascript\">window.mraidbridge.loggingEnabled = true;</script>");
                        }
                    }
                    sb.append(string);
                    sb.append("</body></html>");
                    eVar = i1Var.f57155H;
                    if (eVar == null) {
                        com.fyber.inneractive.sdk.flow.x xVar = i1Var.f57130s;
                        if (xVar != null) {
                            com.fyber.inneractive.sdk.response.e eVar3 = xVar.f53978b;
                            if (eVar3 != null && eVar3.f56845G) {
                                z2 = true;
                            }
                            String string2 = sb.toString();
                            if (z2) {
                                StringBuilder sb2 = new StringBuilder();
                                if (!TextUtils.isEmpty(eVar.f54039c)) {
                                    sb2.append(eVar.f54039c);
                                }
                                if (!TextUtils.isEmpty(eVar.f54040d)) {
                                    sb2.append(eVar.f54040d);
                                }
                                string2 = ixS.n.n(sb2.toString(), string2);
                            }
                            string = !TextUtils.isEmpty(eVar.f54038b) ? ixS.n.n(eVar.f54038b, string2) : string2;
                        }
                    } else {
                        string = sb.toString();
                    }
                }
            } else {
                sb.append("<script> window.iaPreCachedAd = true; </script>");
                IAConfigManager iAConfigManager2 = IAConfigManager.f53260M;
                zA = iAConfigManager2.f53294t.f53466b.a(false, "use_js_inline");
                if (zA) {
                    sb.append("<script src=\"https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js\"></script>");
                    if (!TextUtils.isEmpty(str)) {
                    }
                    sb.append("<script>var prevWindowOnError = window.onerror; window.onerror = function(err) {if (typeof prevWindowOnError === 'function') {prevWindowOnError.apply();} console.log('WINDOW.ONERROR Javascript Error: ' + err);};</script></head><style>body{text-align:center !important;margin:0;padding:0;}");
                    if (!TextUtils.isEmpty(str2)) {
                    }
                    sb.append("</style><body id=\"iaBody\">");
                    if (i1Var.f57149B) {
                        if (zA) {
                            sb.append("<link rel=\"stylesheet\" href=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css\">");
                            if (zA) {
                                sb.append("<script src=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js\"></script>");
                            }
                        }
                    }
                    strB = o.b("ia_mraid_bridge.txt");
                    if (!TextUtils.isEmpty(strB)) {
                    }
                    sb.append(string);
                    sb.append("</body></html>");
                    eVar = i1Var.f57155H;
                    if (eVar == null) {
                    }
                }
            }
            string = null;
        }
        com.fyber.inneractive.sdk.web.i iVar2 = eVar2.f57099l;
        iVar2.getClass();
        IAlog.a("%sbuild html string took %d msec", IAlog.a(iVar2), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        com.fyber.inneractive.sdk.web.e eVar4 = this.f56990b;
        if (eVar4.f57093f) {
            return;
        }
        eVar4.f57090c = new e(eVar4, string);
        eVar4.a().post(this.f56990b.f57090c);
    }
}
