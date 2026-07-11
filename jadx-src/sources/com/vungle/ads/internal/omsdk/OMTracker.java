package com.vungle.ads.internal.omsdk;

import Vy.C;
import Vy.Ml;
import Vy.Wre;
import Vy.aC;
import Vy.fuX;
import Vy.n;
import Vy.w6;
import android.webkit.WebView;
import androidx.annotation.VisibleForTesting;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.vungle.ads.BuildConfig;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/vungle/ads/internal/omsdk/OMTracker;", "Lcom/vungle/ads/internal/omsdk/WebViewObserver;", "", "enabled", "<init>", "(Z)V", "", TtmlNode.START, "()V", "", "stop", "()J", "Landroid/webkit/WebView;", "webView", "onPageFinished", "(Landroid/webkit/WebView;)V", "Z", "started", "LVy/n;", "adSession", "LVy/n;", "Companion", "Factory", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class OMTracker implements WebViewObserver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long DESTROY_DELAY_MS = TimeUnit.SECONDS.toMillis(1);
    private n adSession;
    private final boolean enabled;
    private boolean started;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/vungle/ads/internal/omsdk/OMTracker$Companion;", "", "()V", "DESTROY_DELAY_MS", "", "getDESTROY_DELAY_MS$annotations", "getDESTROY_DELAY_MS", "()J", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getDESTROY_DELAY_MS$annotations() {
        }

        private Companion() {
        }

        public final long getDESTROY_DELAY_MS() {
            return OMTracker.DESTROY_DELAY_MS;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/omsdk/OMTracker$Factory;", "", "()V", "make", "Lcom/vungle/ads/internal/omsdk/OMTracker;", "enabled", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Factory {
        public final OMTracker make(boolean enabled) {
            return new OMTracker(enabled, null);
        }
    }

    public /* synthetic */ OMTracker(boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2);
    }

    private OMTracker(boolean z2) {
        this.enabled = z2;
    }

    @Override // com.vungle.ads.internal.omsdk.WebViewObserver
    public void onPageFinished(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        if (this.started && this.adSession == null) {
            Wre wre = Wre.DEFINED_BY_JAVASCRIPT;
            fuX fux = fuX.DEFINED_BY_JAVASCRIPT;
            aC aCVar = aC.JAVASCRIPT;
            n nVarN = n.n(w6.n(wre, fux, aCVar, aCVar, false), Ml.n(C.n("Vungle", BuildConfig.VERSION_NAME), webView, null, null));
            this.adSession = nVarN;
            if (nVarN != null) {
                nVarN.t(webView);
            }
            n nVar = this.adSession;
            if (nVar != null) {
                nVar.nr();
            }
        }
    }

    public final void start() {
        if (this.enabled && Z7k.j.rl()) {
            this.started = true;
        }
    }

    public final long stop() {
        long j2;
        n nVar;
        if (!this.started || (nVar = this.adSession) == null) {
            j2 = 0;
        } else {
            if (nVar != null) {
                nVar.rl();
            }
            j2 = DESTROY_DELAY_MS;
        }
        this.started = false;
        this.adSession = null;
        return j2;
    }
}
