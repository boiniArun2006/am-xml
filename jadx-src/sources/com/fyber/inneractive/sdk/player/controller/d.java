package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.h1;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.web.i1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i1 f54431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.web.c0 f54432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UnitDisplayType f54433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.web.z f54434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f54435e;

    public final void a(String str, com.fyber.inneractive.sdk.web.g gVar, boolean z2) {
        String str2;
        com.fyber.inneractive.sdk.flow.x xVar;
        if (this.f54431a == null || TextUtils.isEmpty(str)) {
            gVar.a(null, new InneractiveInfrastructureError(InneractiveErrorCode.UNSPECIFIED, com.fyber.inneractive.sdk.flow.i.NO_WEBVIEW_CONTROLLER_AVAILABLE));
            return;
        }
        i1 i1Var = this.f54431a;
        UnitDisplayType unitDisplayType = this.f54433c;
        boolean z3 = true;
        i1Var.setAutoplayMRAIDVideos(unitDisplayType != null && unitDisplayType.isFullscreenUnit());
        this.f54431a.setCenteringTagsRequired(false);
        i1 i1Var2 = this.f54431a;
        if (i1Var2 == null || (xVar = i1Var2.f57130s) == null || (!IAConfigManager.f53260M.f53285k && !xVar.f53982f)) {
            z3 = false;
        }
        i1Var2.setMuteMraidVideo(z3);
        i1 i1Var3 = this.f54431a;
        int i2 = com.fyber.inneractive.sdk.config.k.f53392a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        if (TextUtils.isEmpty(property)) {
            str2 = "wv.inner-active.mobi/simpleM2M/";
        } else {
            str2 = property + ".inner-active.mobi/simpleM2M/";
        }
        String str3 = str2;
        UnitDisplayType unitDisplayType2 = this.f54433c;
        boolean z4 = this.f54435e;
        StringBuilder sb = new StringBuilder();
        if (unitDisplayType2 != null && unitDisplayType2.isFullscreenUnit() && !z4) {
            sb.append("<script type=\"text/javascript\">  var IaCloseBtnHelper = (function initIaCloseBtnHelper(){    var styleContent = '.celtra-close-button {display:none !important;} .close-button {display:none !important;}';    function getStyle(doc){      var style = doc.createElement('style');      style.type = 'text/css';      if (style.styleSheet){        style.styleSheet.cssText = styleContent;      } else {        style.appendChild(doc.createTextNode(styleContent));      }      return style;    }    function onDomReady(){      var iframes = window.document.getElementsByTagName('iframe'),          i = 0,          len = iframes && iframes.length || 0;      for(; i < len; ++i){        if(!iframes[i].src){          try {            iframes[i].contentDocument.body.appendChild(getStyle(iframes[i].contentDocument));          }catch(e){          }}}}    function registerWindowEvents(){      window.addEventListener('load', function onWindowLoad(){        window.removeEventListener('load', onWindowLoad);        onDomReady();      });    }    return {      init: function init(){        if(window.document.readyState != 'complete'){          registerWindowEvents();        }else{          onDomReady();        }}}})();  IaCloseBtnHelper.init();</script>");
        }
        String string = sb.toString();
        UnitDisplayType unitDisplayType3 = this.f54433c;
        StringBuilder sb2 = new StringBuilder();
        if (unitDisplayType3 != null && !unitDisplayType3.isFullscreenUnit()) {
            if (unitDisplayType3 == UnitDisplayType.BANNER) {
                sb2.append(" body {display: flex;} #iawrapper { position:unset !important; display: unset !important; } ");
            } else {
                sb2.append(" #iawrapper { position:unset !important; display: unset !important; }");
            }
        }
        String string2 = sb2.toString();
        i1Var3.f57117f = gVar;
        try {
            i1Var3.h();
            com.fyber.inneractive.sdk.web.e eVar = new com.fyber.inneractive.sdk.web.e(i1Var3, str, z2, string, string2, str3);
            i1Var3.f57126o = eVar;
            eVar.a().post(new com.fyber.inneractive.sdk.util.c(eVar));
        } catch (Throwable th) {
            i1Var3.a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_CONFIGURE_WEBVIEW, th));
        }
    }

    public d(Context context, com.fyber.inneractive.sdk.flow.vast.a aVar, com.fyber.inneractive.sdk.model.vast.i iVar, com.fyber.inneractive.sdk.flow.endcard.q qVar) {
        this.f54432b = com.fyber.inneractive.sdk.web.c0.INLINE;
        com.fyber.inneractive.sdk.web.z zVar = com.fyber.inneractive.sdk.web.z.ENABLED;
        this.f54434d = zVar;
        UnitDisplayType unitDisplayType = aVar.f53933a;
        boolean z2 = aVar.f53934b;
        this.f54433c = unitDisplayType;
        this.f54435e = z2;
        int i2 = c.f54428a[unitDisplayType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            this.f54434d = zVar;
            if (z2) {
                this.f54432b = com.fyber.inneractive.sdk.web.c0.INTERSTITIAL;
            }
        } else {
            this.f54434d = zVar;
        }
        try {
            UnitDisplayType unitDisplayType2 = aVar.f53933a;
            boolean z3 = !(unitDisplayType2 == null || unitDisplayType2.isFullscreenUnit()) || IAConfigManager.f53260M.f53294t.f53466b.a(true, "use_fraud_detection_fullscreen");
            i1 bVar = iVar == com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card ? new com.fyber.inneractive.sdk.web.b(qVar, z3) : new IAmraidWebViewController(z3, this.f54432b, this.f54434d, com.fyber.inneractive.sdk.web.d0.AD_CONTROLLED, true, null, null);
            this.f54431a = bVar;
            com.fyber.inneractive.sdk.web.m mVar = bVar.f57113b;
            if (mVar != null) {
                int i3 = c.f54429b[iVar.ordinal()];
                if (i3 == 1) {
                    mVar.setId(R.id.ia_inneractive_vast_endcard_static);
                } else if (i3 == 2 || i3 == 3) {
                    mVar.setId(R.id.ia_inneractive_vast_endcard_html);
                } else if (i3 == 4) {
                    mVar.setId(R.id.ia_inneractive_vast_endcard_iframe);
                }
            }
            i1 i1Var = this.f54431a;
            com.fyber.inneractive.sdk.web.m mVar2 = i1Var.f57113b;
            if (mVar2 != null) {
                l0.f57009a.a(context, mVar2, i1Var);
            }
            i1 i1Var2 = this.f54431a;
            com.fyber.inneractive.sdk.web.m mVar3 = i1Var2.f57113b;
            if (mVar3 != null) {
                mVar3.setTapListener(i1Var2);
            }
            h1 h1VarA = com.fyber.inneractive.sdk.renderers.n.a(aVar.f53935c, aVar.f53936d, aVar.f53937e);
            this.f54431a.setAdDefaultSize(h1VarA.f57002a, h1VarA.f57003b);
        } catch (Throwable unused) {
            this.f54431a = null;
        }
    }

    public final void a() {
        com.fyber.inneractive.sdk.web.m mVar;
        i1 i1Var = this.f54431a;
        if (i1Var == null || (mVar = i1Var.f57113b) == null) {
            return;
        }
        WebSettings settings = mVar.getSettings();
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
    }
}
