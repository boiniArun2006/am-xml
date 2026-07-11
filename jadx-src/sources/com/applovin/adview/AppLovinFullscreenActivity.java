package com.applovin.adview;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.webkit.WebView;
import android.window.OnBackInvokedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.AbstractC1775d;
import com.applovin.impl.AbstractC1779g;
import com.applovin.impl.C1778e;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.d2;
import com.applovin.impl.e8;
import com.applovin.impl.f2;
import com.applovin.impl.g0;
import com.applovin.impl.n1;
import com.applovin.impl.n2;
import com.applovin.impl.n7;
import com.applovin.impl.o0;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w1;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class AppLovinFullscreenActivity extends Activity implements n1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Set f47667h = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f47668i = new Object();
    public static n2 parentInterstitialWrapper;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1802k f47669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w1 f47670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f47671c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.adview.activity.a f47672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f47673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g0 f47674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f47675g;

    class a implements View.OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Boolean f47676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f47677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.ad.b f47678c;

        a(Boolean bool, boolean z2, com.applovin.impl.sdk.ad.b bVar) {
            this.f47676a = bool;
            this.f47677b = z2;
            this.f47678c = bVar;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            if (this.f47676a.booleanValue()) {
                AppLovinFullscreenActivity.this.a(windowInsets);
            }
            if (!this.f47677b) {
                Insets insets = windowInsets.getInsets(((Integer) AppLovinFullscreenActivity.this.f47669a.a(x4.u2)).intValue());
                view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
                return windowInsets;
            }
            int iIntValue = ((Integer) AppLovinFullscreenActivity.this.f47669a.a(x4.u2)).intValue();
            Insets insets2 = windowInsets.getInsets(this.f47678c.F0() ? iIntValue & (~WindowInsets.Type.displayCutout()) : iIntValue | WindowInsets.Type.displayCutout());
            view.setPadding(insets2.left, insets2.top, insets2.right, insets2.bottom);
            return windowInsets;
        }
    }

    class b implements w1.g {
        @Override // com.applovin.impl.w1.g
        public void a(w1 w1Var) {
            AppLovinFullscreenActivity.this.f47670b = w1Var;
            w1Var.w();
        }

        b() {
        }

        @Override // com.applovin.impl.w1.g
        public void a(String str, Throwable th) {
            com.applovin.impl.sdk.ad.b bVarF = AppLovinFullscreenActivity.parentInterstitialWrapper.f();
            n2.a(bVarF, AppLovinFullscreenActivity.parentInterstitialWrapper.c(), str, th, AppLovinFullscreenActivity.this);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "createAppLovinFullscreenActivity");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), mapHashMap);
            AppLovinFullscreenActivity.this.f47669a.g().a(d2.f48251F, bVarF, mapHashMap);
        }
    }

    private static class c implements OnBackInvokedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f47681a;

        public void onBackInvoked() {
            this.f47681a.run();
        }

        protected c(Runnable runnable) {
            this.f47681a = runnable;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(h.f63161a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            C1804o.j("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
            dismiss("activity_destroyed_while_in_background");
            return;
        }
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            C1804o.c("AppLovinFullscreenActivity", "Failed to request window feature", th);
        }
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        View viewFindViewById = findViewById(R.id.content);
        viewFindViewById.setBackgroundColor(-16777216);
        if (TextUtils.isEmpty(getIntent().getStringExtra("com.applovin.interstitial.sdk_key"))) {
            n2 n2Var = parentInterstitialWrapper;
            if (n2Var != null && n2Var.f() != null) {
                n2.a(parentInterstitialWrapper.f(), parentInterstitialWrapper.c(), "Empty SDK key", (Throwable) null, this);
            }
            finish();
            return;
        }
        this.f47669a = AppLovinSdk.getInstance(this).a();
        n2 n2Var2 = parentInterstitialWrapper;
        com.applovin.impl.sdk.ad.b bVarF = n2Var2 != null ? n2Var2.f() : null;
        Boolean bool = (Boolean) this.f47669a.a(x4.E4);
        boolean z2 = bVarF != null && bVarF.L0();
        if (o0.b() && (bool.booleanValue() || z2)) {
            getWindow().setDecorFitsSystemWindows(false);
            viewFindViewById.setOnApplyWindowInsetsListener(new a(bool, z2, bVarF));
            a(bVarF);
        } else {
            viewFindViewById.setFitsSystemWindows(true);
            if (o0.b()) {
                e8.a(viewFindViewById, this.f47669a);
            }
            a(bVarF);
        }
        if (bVarF != null && bVarF.r0()) {
            AbstractC1779g.a(bVarF, this, this.f47669a);
        }
        if (o0.j() && ((Boolean) this.f47669a.a(x4.g6)).booleanValue()) {
            this.f47673e = new c(new Runnable() { // from class: com.applovin.adview.w6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47691n.c();
                }
            });
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f47673e);
        }
        a();
        b();
        Integer num = (Integer) this.f47669a.a(x4.H6);
        if (num.intValue() > 0) {
            synchronized (f47668i) {
                Set set = f47667h;
                set.add(this);
                n7.a("AppLovinFullscreenActivity", set.size(), num.intValue(), this.f47669a.D());
            }
        }
        n2 n2Var3 = parentInterstitialWrapper;
        if (n2Var3 != null) {
            w1.a(n2Var3.f(), parentInterstitialWrapper.b(), parentInterstitialWrapper.c(), parentInterstitialWrapper.d(), parentInterstitialWrapper.h(), this.f47669a, this, new b());
            return;
        }
        Intent intent = new Intent(this, (Class<?>) FullscreenAdService.class);
        com.applovin.impl.adview.activity.a aVar = new com.applovin.impl.adview.activity.a(this, this.f47669a);
        this.f47672d = aVar;
        bindService(intent, aVar, 1);
        if (o0.h()) {
            String str = this.f47669a.n0().getExtraParameters().get("disable_set_data_dir_suffix");
            if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
                return;
            }
            try {
                WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
            } catch (Throwable unused) {
            }
        }
    }

    private void b() {
        C1802k c1802k = this.f47669a;
        if (c1802k == null || !((Boolean) c1802k.a(x4.y2)).booleanValue()) {
            return;
        }
        final Long l2 = (Long) this.f47669a.a(x4.z2);
        this.f47674f = g0.a(l2.longValue(), true, this.f47669a, new Runnable() { // from class: com.applovin.adview.Ml
            @Override // java.lang.Runnable
            public final void run() {
                this.f47689n.a(l2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        w1 w1Var = this.f47670b;
        if (w1Var != null) {
            w1Var.q();
        }
        if (n7.g(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        C1802k c1802k = this.f47669a;
        if (c1802k != null && ((Boolean) c1802k.a(x4.x2)).booleanValue()) {
            this.f47669a.p0().b(z4.f50993N);
            this.f47669a.p0().b(z4.f50995P);
            this.f47669a.p0().b(z4.f50996Q);
        }
        if (this.f47674f != null) {
            this.f47669a.p0().b(z4.f50994O);
            this.f47674f.a();
            this.f47674f = null;
        }
        com.applovin.impl.adview.activity.a aVar = this.f47672d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        w1 w1Var = this.f47670b;
        if (w1Var != null) {
            if (w1Var.g()) {
                this.f47670b.r();
            } else {
                long jA = this.f47670b.a();
                if (jA >= 0) {
                    if (jA == 0) {
                        this.f47670b.d(true);
                    }
                    final n2 n2Var = parentInterstitialWrapper;
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.adview.I28
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f47687n.a(n2Var);
                        }
                    }, jA);
                } else {
                    a(this.f47670b, false, false);
                }
            }
        }
        parentInterstitialWrapper = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        w1 w1Var = this.f47670b;
        if (w1Var != null) {
            w1Var.a(i2, keyEvent);
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        if (this.f47670b != null) {
            if (!this.f47671c.getAndSet(false)) {
                this.f47670b.b(z2);
            }
            if (z2) {
                n2 n2Var = parentInterstitialWrapper;
                a(n2Var != null ? n2Var.f() : null);
            }
        }
        super.onWindowFocusChanged(z2);
    }

    public void setPresenter(@Nullable w1 w1Var) {
        this.f47670b = w1Var;
    }

    @Override // com.applovin.impl.n1
    public void dismiss(String str) {
        if (o0.j() && this.f47673e != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f47673e);
            this.f47673e = null;
        }
        w1 w1Var = this.f47670b;
        if (w1Var != null) {
            w1Var.a(str);
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w1 w1Var = this.f47670b;
        if (w1Var != null) {
            w1Var.a(configuration);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        w1 w1Var = this.f47670b;
        if (w1Var != null) {
            w1Var.s();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        w1 w1Var;
        try {
            super.onResume();
            if (!this.f47671c.get() && (w1Var = this.f47670b) != null) {
                w1Var.t();
            }
        } catch (IllegalArgumentException e2) {
            this.f47669a.O();
            if (C1804o.a()) {
                this.f47669a.O().a("AppLovinFullscreenActivity", "Error was encountered in onResume().", e2);
            }
            this.f47669a.D().a("AppLovinFullscreenActivity", "onResume", e2);
            dismiss("activity_on_resume_error");
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        w1 w1Var = this.f47670b;
        if (w1Var != null) {
            w1Var.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WindowInsets windowInsets) {
        o0.a aVarA = o0.a(windowInsets, this.f47669a);
        o0.a aVarC = o0.c(windowInsets, this.f47669a);
        o0.a aVarB = o0.b(windowInsets, this.f47669a);
        String strB = n7.b(this);
        o0.a(aVarA, strB);
        o0.c(aVarC, strB);
        o0.b(aVarB, strB);
        w1 w1Var = this.f47670b;
        if (w1Var != null) {
            w1Var.a(aVarA, aVarC, aVarB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(n2 n2Var) {
        boolean zY = this.f47670b.y();
        boolean zI = (n2Var == null || !zY) ? false : n2Var.i();
        if (!zI) {
            this.f47670b.d(false);
        }
        a(this.f47670b, zY, zI);
    }

    private void a(w1 w1Var, boolean z2, boolean z3) {
        w1Var.a("activity_destroyed_by_app_relaunch");
        if (this.f47669a != null) {
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "onDestroyAppLovinFullScreenActivity");
            n2 n2Var = parentInterstitialWrapper;
            com.applovin.impl.sdk.ad.b bVarF = n2Var != null ? n2Var.f() : null;
            mapHashMap.putAll(f2.a((AppLovinAdImpl) bVarF));
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putBoolean(jSONObject, "reshow_attempted", z2);
            JsonUtils.putBoolean(jSONObject, "reshow_success", z3);
            if (bVarF != null) {
                JsonUtils.putInt(jSONObject, "reshow_count", bVarF.R());
            }
            mapHashMap.put("details", jSONObject.toString());
            this.f47669a.D().d(d2.C0, mapHashMap);
        }
        w1Var.r();
    }

    private void a() {
        n2 n2Var;
        C1802k c1802k = this.f47669a;
        if (c1802k == null || !((Boolean) c1802k.a(x4.x2)).booleanValue() || (n2Var = parentInterstitialWrapper) == null || n2Var.f() == null) {
            return;
        }
        com.applovin.impl.sdk.ad.b bVarF = parentInterstitialWrapper.f();
        List listJ = bVarF.j();
        if (CollectionUtils.isEmpty(listJ)) {
            return;
        }
        C1778e c1778e = (C1778e) listJ.get(0);
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_url", c1778e.c());
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_backup_url", c1778e.a());
        this.f47669a.p0().b(z4.f50995P, jSONObject.toString());
        this.f47669a.p0().b(z4.f50993N, Long.valueOf(System.currentTimeMillis()));
        this.f47669a.p0().b(z4.f50996Q, CollectionUtils.toJsonString(f2.a((AppLovinAdImpl) bVarF), JsonUtils.EMPTY_JSON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l2) {
        this.f47675g += l2.longValue();
        this.f47669a.p0().b(z4.f50994O, Long.valueOf(this.f47675g));
    }

    private void a(com.applovin.impl.sdk.ad.b bVar) {
        if (o0.b() && bVar != null && bVar.L0()) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
            if (bVar.U0() && bVar.S0()) {
                AbstractC1775d.c(this);
                return;
            } else if (bVar.U0()) {
                AbstractC1775d.b((Activity) this);
                return;
            } else {
                if (bVar.S0()) {
                    AbstractC1775d.a((Activity) this);
                    return;
                }
                return;
            }
        }
        getWindow().setFlags(1024, 1024);
        AbstractC1775d.c(this);
    }
}
