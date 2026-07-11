package com.applovin.impl.adview.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.C1809u;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.d2;
import com.applovin.impl.e6;
import com.applovin.impl.f2;
import com.applovin.impl.n2;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.w1;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f48008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1804o f48009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f48010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f48011d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Messenger f48012e;

    /* JADX INFO: renamed from: com.applovin.impl.adview.activity.a$a, reason: collision with other inner class name */
    class C0696a implements AppLovinAdLoadListener {

        /* JADX INFO: renamed from: com.applovin.impl.adview.activity.a$a$a, reason: collision with other inner class name */
        class C0697a implements w1.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppLovinFullscreenActivity f48014a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppLovinAd f48015b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f48016c;

            @Override // com.applovin.impl.w1.g
            public void a(w1 w1Var) {
                this.f48014a.setPresenter(w1Var);
                w1Var.w();
            }

            C0697a(AppLovinFullscreenActivity appLovinFullscreenActivity, AppLovinAd appLovinAd, b bVar) {
                this.f48014a = appLovinFullscreenActivity;
                this.f48015b = appLovinAd;
                this.f48016c = bVar;
            }

            @Override // com.applovin.impl.w1.g
            public void a(String str, Throwable th) {
                n2.a((com.applovin.impl.sdk.ad.b) this.f48015b, this.f48016c, str, th, this.f48014a);
                Map mapA = f2.a((AppLovinAdImpl) this.f48015b);
                CollectionUtils.putStringIfValid("source", "processAdResponse", mapA);
                CollectionUtils.putStringIfValid("error_message", str, mapA);
                CollectionUtils.putStringIfValid("top_main_method", th.toString(), mapA);
                a.this.f48008a.g().d(d2.f48251F, mapA);
            }
        }

        C0696a() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) a.this.f48010c.get();
            if (appLovinFullscreenActivity != null) {
                C1804o unused = a.this.f48009b;
                if (C1804o.a()) {
                    a.this.f48009b.a("AppLovinFullscreenActivity", "Presenting ad...");
                }
                b bVar = new b(a.this, null);
                w1.a((com.applovin.impl.sdk.ad.b) appLovinAd, bVar, bVar, bVar, null, a.this.f48008a, appLovinFullscreenActivity, new C0697a(appLovinFullscreenActivity, appLovinAd, bVar));
                return;
            }
            C1804o unused2 = a.this.f48009b;
            if (C1804o.a()) {
                a.this.f48009b.b("AppLovinFullscreenActivity", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i2) {
            a.this.a("failed_to_receive_ad");
        }
    }

    private class b implements AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
        private b() {
        }

        private void a(FullscreenAdService.c cVar) {
            a(null, cVar);
        }

        /* synthetic */ b(a aVar, C0696a c0696a) {
            this();
        }

        private void a(Bundle bundle, FullscreenAdService.c cVar) {
            Message messageObtain = Message.obtain((Handler) null, cVar.b());
            if (bundle != null) {
                messageObtain.setData(bundle);
            }
            try {
                a.this.f48012e.send(messageObtain);
            } catch (RemoteException e2) {
                C1804o unused = a.this.f48009b;
                if (C1804o.a()) {
                    a.this.f48009b.a("AppLovinFullscreenActivity", "Failed to forward callback (" + cVar.b() + ")", e2);
                }
            }
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_CLICKED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_DISPLAYED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_HIDDEN);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_VIDEO_STARTED);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d2, boolean z2) {
            Bundle bundle = new Bundle();
            bundle.putDouble("percent_viewed", d2);
            bundle.putBoolean("fully_watched", z2);
            a(bundle, FullscreenAdService.c.AD_VIDEO_ENDED);
        }
    }

    private static class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f48019a;

        /* synthetic */ c(a aVar, C0696a c0696a) {
            this(aVar);
        }

        private c(a aVar) {
            this.f48019a = new WeakReference(aVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar;
            if (message.what != FullscreenAdService.c.AD.b() || (aVar = (a) this.f48019a.get()) == null) {
                super.handleMessage(message);
            } else {
                aVar.b(message.getData().getString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f48011d.compareAndSet(false, true)) {
            if (C1804o.a()) {
                this.f48009b.a("AppLovinFullscreenActivity", "Fullscreen ad service connected to " + componentName);
            }
            this.f48012e = new Messenger(iBinder);
            Message messageObtain = Message.obtain((Handler) null, FullscreenAdService.c.AD.b());
            messageObtain.replyTo = new Messenger(new c(this, null));
            try {
                if (C1804o.a()) {
                    this.f48009b.a("AppLovinFullscreenActivity", "Requesting ad from FullscreenAdService...");
                }
                this.f48012e.send(messageObtain);
            } catch (RemoteException e2) {
                if (C1804o.a()) {
                    this.f48009b.a("AppLovinFullscreenActivity", "Failed to send ad request message to FullscreenAdService", e2);
                }
                a("failed_to_send_ad_request");
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f48011d.compareAndSet(true, false) && C1804o.a()) {
            this.f48009b.a("AppLovinFullscreenActivity", "FullscreenAdService disconnected from " + componentName);
        }
    }

    public a(AppLovinFullscreenActivity appLovinFullscreenActivity, C1802k c1802k) {
        this.f48008a = c1802k;
        this.f48009b = c1802k.O();
        this.f48010c = new WeakReference(appLovinFullscreenActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) this.f48010c.get();
        if (appLovinFullscreenActivity != null) {
            if (C1804o.a()) {
                this.f48009b.a("AppLovinFullscreenActivity", "Dismissing...");
            }
            appLovinFullscreenActivity.dismiss(str);
        } else if (C1804o.a()) {
            this.f48009b.b("AppLovinFullscreenActivity", "Unable to dismiss parent Activity");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = JsonUtils.getString(jSONObject, "zone_id", "");
            if (!TextUtils.isEmpty(string)) {
                this.f48008a.q0().a(new e6(jSONObject, C1809u.a(string), true, new C0696a(), this.f48008a));
                return;
            }
            throw new IllegalStateException("No zone identifier found in ad response: " + jSONObject);
        } catch (JSONException e2) {
            if (C1804o.a()) {
                this.f48009b.a("AppLovinFullscreenActivity", "Unable to process ad: " + str, e2);
            }
            a("failed_to_process_ad");
        }
    }
}
