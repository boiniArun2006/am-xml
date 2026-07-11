package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.f1;
import com.fyber.inneractive.sdk.util.o0;
import com.fyber.inneractive.sdk.util.v;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import com.safedk.android.utils.Logger;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class FyberReportAdActivity extends InneractiveBaseActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static com.fyber.inneractive.sdk.flow.h f53061f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WebView f53062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f53063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f53064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f53065e;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.f63176p);
        p0.startActivity(p1);
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.h.f63176p, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getWindow().requestFeature(2);
        getWindow().setFeatureInt(2, -1);
        getWindow().addFlags(1024);
        super.onCreate(bundle);
        if (getActionBar() != null) {
            getActionBar().hide();
        }
        try {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                this.f53063c = extras.getString("advertiser_domain");
                this.f53064d = extras.getString("dsp_name");
                this.f53065e = extras.getString("dsp_id");
            }
            setContentView(a());
        } catch (Exception e2) {
            IAlog.a("failed creating fyber report ad activity", e2, new Object[0]);
            finish();
        }
    }

    public static Intent createIntent(Context context, String str, String str2, Long l2) {
        Intent intent = new Intent(context, (Class<?>) FyberReportAdActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        Bundle bundle = new Bundle();
        bundle.putString("advertiser_domain", str);
        bundle.putString("dsp_name", str2);
        bundle.putString("dsp_id", l2 != null ? Long.toString(l2.longValue()) : null);
        intent.putExtras(bundle);
        return intent;
    }

    public static com.fyber.inneractive.sdk.flow.h getAdReporter() {
        return f53061f;
    }

    public static void start(Context context, com.fyber.inneractive.sdk.flow.h hVar, String str, String str2, Long l2) {
        f53061f = hVar;
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, createIntent(context, str, str2, l2));
        } catch (Exception e2) {
            IAlog.a("failed starting fyber report ad activity", e2, new Object[0]);
        }
    }

    public final FrameLayout a() {
        WebView webView;
        FrameLayout frameLayout = new FrameLayout(this);
        try {
            webView = new WebView(IAConfigManager.f53260M.f53295u.a());
            webView.setWebViewClient(new a(this));
            webView.setId(R.id.ia_inneractive_webview_report_ad);
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            disableWebviewZoomControls(webView);
            HashMap map = new HashMap();
            if (!TextUtils.isEmpty(this.f53063c)) {
                map.put("advertiser_domain", this.f53063c);
            }
            if (!TextUtils.isEmpty(this.f53064d)) {
                map.put("dsp_name", this.f53064d);
            }
            if (!TextUtils.isEmpty(this.f53065e)) {
                map.put("dsp_id", this.f53065e);
            }
            DTExchangeNetworkBridge.webviewLoadUrl(webView, f1.a("https://cdn2.inner-active.mobi/client/fyber-i-icon/index.html", map));
        } catch (Exception unused) {
            IAlog.b("failed creating webivew for report ad", new Object[0]);
            finish();
            webView = null;
        }
        this.f53062b = webView;
        frameLayout.addView(webView, -1, -1);
        return frameLayout;
    }

    public String getAdDomain() {
        return this.f53063c;
    }

    public String getAdNetwork() {
        return this.f53064d;
    }

    public String getAdNetworkId() {
        return this.f53065e;
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        WebView webView = this.f53062b;
        if (webView != null) {
            webView.removeAllViews();
            v.a(this.f53062b);
            this.f53062b.destroy();
            this.f53062b = null;
        }
        f53061f = null;
        super.onDestroy();
    }

    public static void disableWebviewZoomControls(WebView webView) {
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        new o0(webView).run();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setVisible(false);
    }
}
