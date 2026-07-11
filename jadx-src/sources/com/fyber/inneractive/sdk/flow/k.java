package com.fyber.inneractive.sdk.flow;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class k implements com.fyber.inneractive.sdk.interfaces.c, com.fyber.inneractive.sdk.interfaces.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InneractiveAdRequest f53693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.e f53694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f53695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.a f53696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.b f53697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.r0 f53698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.r f53699g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.network.timeouts.content.a f53702j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f53700h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f53701i = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f53704l = new j(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f53703k = new d(this);

    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.interfaces.a aVar, com.fyber.inneractive.sdk.interfaces.b bVar) {
        this.f53693a = inneractiveAdRequest;
        this.f53694b = eVar;
        this.f53696d = aVar;
        this.f53697e = bVar;
        this.f53703k = new d(this);
        this.f53699g = rVar;
        UnitDisplayType unitDisplayType = eVar.f56862n;
        this.f53702j = new com.fyber.inneractive.sdk.network.timeouts.content.a((unitDisplayType == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.REWARDED || unitDisplayType == UnitDisplayType.NATIVE) ? unitDisplayType.name().toLowerCase(Locale.US) : UnitDisplayType.BANNER.name().toLowerCase(Locale.US), com.fyber.inneractive.sdk.response.a.a(eVar.f56855g) == com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_VAST ? "video" : "display", (int) eVar.f56846H, eVar.f56839A, IAConfigManager.f53260M.f53286l, this.f53699g);
        if (this.f53693a == null) {
            this.f53698f = com.fyber.inneractive.sdk.config.a.a(eVar.f56861m);
        }
        try {
            h();
        } catch (Throwable th) {
            IAlog.f("Failed to start ContentLoader", IAlog.a(this));
            com.fyber.inneractive.sdk.network.z.a(th, inneractiveAdRequest, eVar);
            this.f53703k.a();
            b(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.CONTENT_LOADER_START_FAILED));
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public final void b() {
        String strA = IAlog.a(this);
        Integer numValueOf = Integer.valueOf(this.f53701i - 1);
        int i2 = this.f53701i - 1;
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.f53702j;
        if (aVar != null) {
            if (aVar.f54336g) {
                i2 = aVar.f54330a - i2;
            }
            i = (i2 == aVar.f54330a ? aVar.f54337h : 0) + (aVar.f54331b * i2) + aVar.f54333d;
        }
        IAlog.a("%s : IAAdContentLoaderImpl : onRetry() attempt: %d timeout: %d", strA, numValueOf, Integer.valueOf(i));
        com.fyber.inneractive.sdk.interfaces.b bVar = this.f53697e;
        if (bVar != null) {
            bVar.b();
        }
        h();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public abstract void cancel();

    public abstract String e();

    public abstract void g();

    public InneractiveInfrastructureError d() {
        i iVar = i.WEBVIEW_LOAD_TIMEOUT;
        com.fyber.inneractive.sdk.response.e eVar = this.f53694b;
        if ("video".equalsIgnoreCase((eVar == null || com.fyber.inneractive.sdk.response.a.a(eVar.f56855g) != com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_VAST) ? "display" : "video")) {
            iVar = i.VIDEO_AD_LOAD_TIMEOUT;
        }
        return new InneractiveInfrastructureError(InneractiveErrorCode.LOAD_TIMEOUT, iVar);
    }

    public final void f() {
        String str;
        this.f53703k.a();
        InneractiveAdRequest inneractiveAdRequest = this.f53693a;
        if (inneractiveAdRequest != null) {
            str = inneractiveAdRequest.f53932b;
        } else {
            com.fyber.inneractive.sdk.response.e eVar = this.f53694b;
            if (eVar == null || (str = eVar.f56873y) == null) {
                str = null;
            }
        }
        com.fyber.inneractive.sdk.metrics.d.f54080d.a(str).i();
        x xVar = this.f53695c;
        if (xVar != null) {
            xVar.a(str);
        }
        com.fyber.inneractive.sdk.interfaces.a aVar = this.f53696d;
        if (aVar != null) {
            aVar.a(this.f53693a);
        }
    }

    public final void h() {
        int i2 = this.f53701i;
        this.f53701i = i2 + 1;
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.f53702j;
        if (aVar != null) {
            if (aVar.f54336g) {
                i2 = aVar.f54330a - i2;
            }
            i = (i2 == aVar.f54330a ? aVar.f54337h : 0) + (aVar.f54331b * i2) + aVar.f54333d;
        }
        IAlog.a("%s : IAAdContentLoaderImpl : Start timeout: %d, attempt number: %d", IAlog.a(this), Integer.valueOf(i), Integer.valueOf(this.f53701i - 1));
        d dVar = this.f53703k;
        if (dVar.f53576a == null) {
            HandlerThread handlerThread = new HandlerThread("TimeoutHandlerThread");
            handlerThread.start();
            dVar.f53576a = new Handler(handlerThread.getLooper());
        }
        dVar.f53576a.postDelayed(dVar.f53579d, i);
        g();
    }

    public void c() {
        f();
    }

    public final void b(InneractiveInfrastructureError inneractiveInfrastructureError) {
        String string;
        IAlog.a("%s : IAAdContentLoaderImpl : Handle Retry for error: %s", IAlog.a(this), inneractiveInfrastructureError.getErrorCode().toString());
        d dVar = this.f53703k;
        dVar.getClass();
        IAlog.a("%s : ContentLoadTimeoutHandler stopping timeout handler", IAlog.a(dVar));
        Handler handler = dVar.f53576a;
        if (handler != null) {
            handler.removeCallbacks(dVar.f53579d);
        }
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.f53702j;
        boolean z2 = this.f53701i <= (aVar != null ? aVar.f54330a : 0);
        IAlog.a("%s : IAAdContentLoaderImpl : should retry: %s", IAlog.a(this), Boolean.valueOf(z2));
        if (z2) {
            x xVar = this.f53695c;
            if (xVar != null) {
                xVar.destroy();
                this.f53695c = null;
            }
            com.fyber.inneractive.sdk.network.timeouts.content.a aVar2 = this.f53702j;
            int i2 = aVar2 != null ? aVar2.f54334e : 0;
            IAlog.a("%s : IAAdContentLoaderImpl : retryLoad : post load ad content retry task with delay: %d", IAlog.a(this), Integer.valueOf(i2));
            com.fyber.inneractive.sdk.util.r.f57026b.postDelayed(this.f53704l, i2);
            return;
        }
        com.fyber.inneractive.sdk.interfaces.a aVar3 = this.f53696d;
        if (aVar3 != null) {
            aVar3.a(inneractiveInfrastructureError);
        }
        InneractiveAdRequest inneractiveAdRequest = this.f53693a;
        com.fyber.inneractive.sdk.response.e eVar = this.f53694b;
        com.fyber.inneractive.sdk.config.global.r rVar = this.f53699g;
        JSONArray jSONArrayB = rVar == null ? null : rVar.b();
        if (inneractiveInfrastructureError.getErrorCode() == InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD) {
            com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.NATIVE_ERROR_FAILED_TO_LOAD_AD;
            if (!inneractiveInfrastructureError.isErrorAlreadyReported(tVar)) {
                IAlog.a("Firing Event 402 - NativeAdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
                JSONObject jSONObject = new JSONObject();
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
                wVar.f54358b = tVar;
                wVar.f54357a = inneractiveAdRequest;
                wVar.f54360d = jSONArrayB;
                if (inneractiveInfrastructureError.getCause() != null) {
                    string = Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace());
                } else {
                    StringBuilder sb = new StringBuilder();
                    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                    for (int i3 = 7; i3 >= 0 && i3 < 13 && i3 < stackTrace.length; i3++) {
                        sb.append(stackTrace[i3].toString());
                        sb.append(",");
                    }
                    Log.d("stack trace:", sb.toString());
                    string = sb.toString();
                }
                String string2 = inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason().toString();
                try {
                    jSONObject.put("message", string2);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "message", string2);
                }
                try {
                    jSONObject.put("description", string);
                } catch (Exception unused2) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "description", string);
                }
                String strDescription = inneractiveInfrastructureError.description();
                try {
                    jSONObject.put("extra_description", strDescription);
                } catch (Exception unused3) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "extra_description", strDescription);
                }
                wVar.f54362f.put(jSONObject);
                wVar.a((String) null);
                inneractiveInfrastructureError.addReportedError(tVar);
            }
        } else {
            a.a(inneractiveAdRequest, inneractiveInfrastructureError, this.f53695c, eVar, jSONArrayB);
        }
        cancel();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void a() {
        int i2;
        InneractiveInfrastructureError inneractiveInfrastructureError;
        String strA = IAlog.a(this);
        Integer numValueOf = Integer.valueOf(this.f53701i - 1);
        int i3 = this.f53701i - 1;
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.f53702j;
        if (aVar != null) {
            if (aVar.f54336g) {
                i3 = aVar.f54330a - i3;
            }
            i2 = (aVar.f54331b * i3) + aVar.f54333d + (i3 == aVar.f54330a ? aVar.f54337h : 0);
        } else {
            i2 = 0;
        }
        IAlog.a("%s : IAAdContentLoaderImpl : onTimeout() attempt: %d timeout: %d", strA, numValueOf, Integer.valueOf(i2));
        com.fyber.inneractive.sdk.interfaces.b bVar = this.f53697e;
        if (bVar != null) {
            bVar.a();
        }
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar2 = this.f53702j;
        if (this.f53701i <= (aVar2 != null ? aVar2.f54330a : 0)) {
            inneractiveInfrastructureError = d();
        } else {
            inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.IN_FLIGHT_TIMEOUT, i.NO_TIME_TO_LOAD_AD_CONTENT);
        }
        com.fyber.inneractive.sdk.util.r.f57025a.execute(new e(new f(this.f53694b, this.f53693a, e(), this.f53699g.b()), inneractiveInfrastructureError));
        b(inneractiveInfrastructureError);
    }
}
