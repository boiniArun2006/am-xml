package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class s extends k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IAmraidWebViewController f53812m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q f53813n = new q(this);

    @Override // com.fyber.inneractive.sdk.flow.k
    public final InneractiveInfrastructureError d() {
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.f53702j;
        if (aVar != null) {
            int i2 = this.f53701i;
            if (aVar.f54336g) {
                i2 = aVar.f54330a - i2;
            }
            i = (i2 == aVar.f54330a ? aVar.f54337h : 0) + (aVar.f54331b * i2) + aVar.f54333d;
        }
        return new InneractiveInfrastructureError(InneractiveErrorCode.LOAD_TIMEOUT, i.WEBVIEW_LOAD_TIMEOUT, new Exception("LoadTimeout after " + i + " ms"));
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final String e() {
        return "send_failed_display_creatives";
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final void g() {
        com.fyber.inneractive.sdk.web.z zVar;
        String str;
        String str2;
        InneractiveAdRequest inneractiveAdRequest = this.f53693a;
        q0 q0Var = new q0(inneractiveAdRequest == null ? this.f53698f : inneractiveAdRequest.getSelectedUnitConfig(), this.f53699g);
        this.f53695c = q0Var;
        com.fyber.inneractive.sdk.response.e eVar = this.f53694b;
        q0Var.f53978b = (com.fyber.inneractive.sdk.response.f) eVar;
        q0Var.f53982f = this.f53700h;
        UnitDisplayType unitDisplayType = eVar != null ? ((com.fyber.inneractive.sdk.response.f) eVar).f56862n : null;
        com.fyber.inneractive.sdk.web.c0 c0Var = com.fyber.inneractive.sdk.web.c0.INLINE;
        if (unitDisplayType == null) {
            this.f53813n.a(null, new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.EMPTY_UNIT_DISPLAY_TYPE, new Exception("Unit display type was not found")));
            return;
        }
        int i2 = r.f53811a[unitDisplayType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            zVar = com.fyber.inneractive.sdk.web.z.ENABLED;
            InneractiveAdRequest inneractiveAdRequest2 = this.f53693a;
            if (inneractiveAdRequest2 == null || inneractiveAdRequest2.getAllowFullscreen()) {
                c0Var = com.fyber.inneractive.sdk.web.c0.INTERSTITIAL;
            }
        } else {
            zVar = com.fyber.inneractive.sdk.web.z.ENABLED;
        }
        com.fyber.inneractive.sdk.web.c0 c0Var2 = c0Var;
        com.fyber.inneractive.sdk.web.z zVar2 = zVar;
        com.fyber.inneractive.sdk.response.e eVar2 = this.f53694b;
        boolean z2 = (eVar2 == null || (str2 = ((com.fyber.inneractive.sdk.response.f) eVar2).f56875K) == null || str2.contains("iaNotifyLoadFinished")) ? false : true;
        IAConfigManager iAConfigManager = IAConfigManager.f53260M;
        boolean z3 = !unitDisplayType.isFullscreenUnit() || iAConfigManager.f53294t.f53466b.a(true, "use_fraud_detection_fullscreen");
        try {
            com.fyber.inneractive.sdk.web.d0 d0Var = com.fyber.inneractive.sdk.web.d0.AD_CONTROLLED;
            Boolean boolC = ((com.fyber.inneractive.sdk.config.global.features.m) iAConfigManager.f53273K.a(com.fyber.inneractive.sdk.config.global.features.m.class)).c("enable");
            boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
            IAlog.a("OMSDK AB %s", String.valueOf(zBooleanValue));
            IAmraidWebViewController iAmraidWebViewController = new IAmraidWebViewController(z3, c0Var2, zVar2, d0Var, z2, zBooleanValue ? iAConfigManager.f53271I : null, this.f53699g);
            this.f53812m = iAmraidWebViewController;
            iAmraidWebViewController.setAdContent(this.f53695c);
            this.f53812m.setAdRequest(this.f53693a);
            IAmraidWebViewController iAmraidWebViewController2 = this.f53812m;
            q0 q0Var2 = (q0) this.f53695c;
            q0Var2.getClass();
            iAmraidWebViewController2.setMuteMraidVideo(iAConfigManager.f53285k || q0Var2.f53982f);
            ((q0) this.f53695c).f53810i = this.f53812m;
            com.fyber.inneractive.sdk.response.e eVar3 = this.f53694b;
            if (eVar3 != null) {
                UnitDisplayType unitDisplayType2 = ((com.fyber.inneractive.sdk.response.f) eVar3).f56862n;
                InneractiveAdRequest inneractiveAdRequest3 = this.f53693a;
                boolean z4 = inneractiveAdRequest3 == null || inneractiveAdRequest3.getAllowFullscreen();
                StringBuilder sb = new StringBuilder();
                if (unitDisplayType2 != null && unitDisplayType2.isFullscreenUnit() && !z4) {
                    sb.append("<script type=\"text/javascript\">  var IaCloseBtnHelper = (function initIaCloseBtnHelper(){    var styleContent = '.celtra-close-button {display:none !important;} .close-button {display:none !important;}';    function getStyle(doc){      var style = doc.createElement('style');      style.type = 'text/css';      if (style.styleSheet){        style.styleSheet.cssText = styleContent;      } else {        style.appendChild(doc.createTextNode(styleContent));      }      return style;    }    function onDomReady(){      var iframes = window.document.getElementsByTagName('iframe'),          i = 0,          len = iframes && iframes.length || 0;      for(; i < len; ++i){        if(!iframes[i].src){          try {            iframes[i].contentDocument.body.appendChild(getStyle(iframes[i].contentDocument));          }catch(e){          }}}}    function registerWindowEvents(){      window.addEventListener('load', function onWindowLoad(){        window.removeEventListener('load', onWindowLoad);        onDomReady();      });    }    return {      init: function init(){        if(window.document.readyState != 'complete'){          registerWindowEvents();        }else{          onDomReady();        }}}})();  IaCloseBtnHelper.init();</script>");
                }
                String string = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                if (unitDisplayType2 != null && !unitDisplayType2.isFullscreenUnit()) {
                    if (unitDisplayType2 == UnitDisplayType.BANNER) {
                        sb2.append(" body {display: flex;} #iawrapper { position:unset !important; display: unset !important; } ");
                    } else {
                        sb2.append(" #iawrapper { position:unset !important; display: unset !important; }");
                    }
                }
                String string2 = sb2.toString();
                this.f53812m.setAutoplayMRAIDVideos(unitDisplayType.isFullscreenUnit() || UnitDisplayType.MRECT.equals(unitDisplayType));
                IAmraidWebViewController iAmraidWebViewController3 = this.f53812m;
                int i3 = com.fyber.inneractive.sdk.config.k.f53392a;
                String property = System.getProperty("ia.testEnvironmentConfiguration.name");
                if (TextUtils.isEmpty(property)) {
                    str = "wv.inner-active.mobi/simpleM2M/";
                } else {
                    str = property + ".inner-active.mobi/simpleM2M/";
                }
                String str3 = str;
                String str4 = "" + ((com.fyber.inneractive.sdk.response.f) this.f53694b).f56875K;
                iAmraidWebViewController3.f57117f = this.f53813n;
                try {
                    iAmraidWebViewController3.h();
                    com.fyber.inneractive.sdk.web.e eVar4 = new com.fyber.inneractive.sdk.web.e(iAmraidWebViewController3, str4, true, string, string2, str3);
                    iAmraidWebViewController3.f57126o = eVar4;
                    eVar4.a().post(new com.fyber.inneractive.sdk.util.c(eVar4));
                } catch (Throwable th) {
                    InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.COULD_NOT_CONFIGURE_WEBVIEW, th);
                    com.fyber.inneractive.sdk.web.g gVar = iAmraidWebViewController3.f57117f;
                    if (gVar != null) {
                        gVar.a(iAmraidWebViewController3, inneractiveInfrastructureError);
                    }
                    iAmraidWebViewController3.b(true);
                }
            }
        } catch (Throwable th2) {
            b(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.COULD_NOT_CREATE_WEBVIEW_CONTROLLER, th2));
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.b
    public final void a() {
        IAmraidWebViewController iAmraidWebViewController;
        a88.n nVar;
        IAlog.a("%s : IAMraidContentLoader : destroyController", IAlog.a(this));
        if (this.f53695c != null && (iAmraidWebViewController = this.f53812m) != null) {
            com.fyber.inneractive.sdk.measurement.tracker.e eVar = iAmraidWebViewController.f57156I;
            if (eVar != null && (nVar = eVar.f54062a) != null) {
                try {
                    nVar.t();
                } catch (Throwable unused) {
                }
                com.fyber.inneractive.sdk.util.r.f57026b.postDelayed(new com.fyber.inneractive.sdk.measurement.tracker.c(eVar), 1000);
                eVar.f54062a = null;
                eVar.f54063b = null;
            }
            this.f53812m.e();
            this.f53812m = null;
        }
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.c
    public final void cancel() {
        IAmraidWebViewController iAmraidWebViewController;
        a88.n nVar;
        IAlog.a("%s : IAMraidContentLoader : destroyController", IAlog.a(this));
        if (this.f53695c != null && (iAmraidWebViewController = this.f53812m) != null) {
            com.fyber.inneractive.sdk.measurement.tracker.e eVar = iAmraidWebViewController.f57156I;
            if (eVar != null && (nVar = eVar.f54062a) != null) {
                try {
                    nVar.t();
                } catch (Throwable unused) {
                }
                com.fyber.inneractive.sdk.util.r.f57026b.postDelayed(new com.fyber.inneractive.sdk.measurement.tracker.c(eVar), 1000);
                eVar.f54062a = null;
                eVar.f54063b = null;
            }
            this.f53812m.e();
            this.f53812m = null;
        }
        this.f53703k.a();
        IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(this));
        com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(this.f53704l);
        this.f53693a = null;
        this.f53694b = null;
        this.f53695c = null;
        this.f53696d = null;
        this.f53697e = null;
        this.f53698f = null;
    }
}
