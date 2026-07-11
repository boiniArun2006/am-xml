package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.applovin.creative.MaxCreativeDebuggerActivity;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.AbstractC1775d;
import com.applovin.impl.AbstractC1810u4;
import com.applovin.impl.m1;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class e1 implements m1.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static WeakReference f48396m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final AtomicBoolean f48397n = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f48398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f48399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f48400c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d1 f48402e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private m1 f48404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private g7 f48405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f48406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f48407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f48408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f48409l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f48401d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference f48403f = new WeakReference(null);

    class a extends LinkedHashMap {
        a(int i2) {
            super(i2);
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    }

    class b extends AbstractC1772b {
        b() {
        }

        @Override // com.applovin.impl.AbstractC1772b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                C1804o.g("AppLovinSdk", "Started Creative Debugger");
                if (!e1.this.h() || e1.f48396m.get() != activity) {
                    MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                    WeakReference unused = e1.f48396m = new WeakReference(maxCreativeDebuggerActivity);
                    maxCreativeDebuggerActivity.a(e1.this.f48402e, e1.this.f48398a.e());
                }
                e1.f48397n.set(false);
            }
        }

        @Override // com.applovin.impl.AbstractC1772b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                C1804o.g("AppLovinSdk", "Creative Debugger destroyed");
                WeakReference unused = e1.f48396m = null;
            }
        }
    }

    class c implements AbstractC1775d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f48412a;

        c(Object obj) {
            this.f48412a = obj;
        }

        @Override // com.applovin.impl.AbstractC1775d.b
        public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
            maxCreativeDebuggerDisplayedAdActivity.a(new q1(this.f48412a, e1.this.f48398a.H().b()), e1.this.f48398a);
            e1.f48397n.set(false);
        }
    }

    private void e(Object obj) {
        C1804o.g("AppLovinSdk", "Starting Creative Debugger for current fullscreen ad...");
        AbstractC1775d.a(this.f48399b, MaxCreativeDebuggerDisplayedAdActivity.class, this.f48398a.e(), new c(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.f48406i = 0;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.f63161a);
        p0.startActivity(p1);
    }

    private Drawable f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        WeakReference weakReference = f48396m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.f48408k);
        if (this.f48408k == 0 || seconds < 10) {
            return;
        }
        this.f48398a.D().a(d2.f48277d, "showingMediationDebuggerFromHoldingCreativeDebuggerButton");
        this.f48398a.W0();
    }

    private void m() {
        this.f48398a.e().a(new b());
    }

    @Override // com.applovin.impl.m1.a
    public void b() {
        if (this.f48406i == 0) {
            this.f48405h = g7.a(TimeUnit.SECONDS.toMillis(3L), this.f48398a, new Runnable() { // from class: com.applovin.impl.iwV
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48762n.j();
                }
            });
        }
        int i2 = this.f48406i;
        if (i2 % 2 == 0) {
            this.f48406i = i2 + 1;
        }
    }

    public void d(Object obj) {
        if (g() && obj != null) {
            if (!w3.a(obj) || c(obj)) {
                String strB = b(obj);
                synchronized (this.f48401d) {
                    try {
                        q1 q1Var = (q1) this.f48400c.get(strB);
                        if (q1Var != null) {
                            q1Var.a(obj);
                        } else {
                            this.f48400c.put(strB, new q1(obj, System.currentTimeMillis()));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public boolean g() {
        return ((Boolean) this.f48398a.a(x4.k1)).booleanValue() && this.f48398a.n0().isCreativeDebuggerEnabled();
    }

    public void k() {
        m1 m1Var = this.f48404g;
        if (m1Var != null) {
            m1Var.b();
        }
    }

    public void n() {
        ArrayList arrayList;
        if (h() || !f48397n.compareAndSet(false, true)) {
            C1804o.h("AppLovinSdk", "Creative Debugger is already showing");
            return;
        }
        Object objA = this.f48398a.H().a();
        if (objA != null) {
            e(objA);
            return;
        }
        synchronized (this.f48401d) {
            arrayList = new ArrayList(this.f48400c.values());
        }
        Collections.reverse(arrayList);
        this.f48402e.a(arrayList, this.f48398a);
        if (!this.f48409l) {
            m();
            this.f48409l = true;
        }
        C1804o.g("AppLovinSdk", "Starting Creative Debugger...");
        AbstractC1775d.a(this.f48399b, MaxCreativeDebuggerActivity.class);
    }

    public e1(C1802k c1802k) {
        this.f48398a = c1802k;
        Context contextO = C1802k.o();
        this.f48399b = contextO;
        this.f48400c = new a(10);
        this.f48402e = new d1(contextO);
    }

    private boolean c(Object obj) {
        MaxAdFormat format;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            format = ((com.applovin.impl.sdk.ad.b) obj).getAdZone().d();
        } else {
            format = obj instanceof y2 ? ((y2) obj).getFormat() : null;
        }
        return format != null && format.isFullscreenAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (g() && this.f48403f.get() == null && !h()) {
            Activity activityB = this.f48398a.e().b();
            if (activityB == null) {
                this.f48398a.O();
                if (C1804o.a()) {
                    this.f48398a.O().b("AppLovinSdk", "Failed to display Creative Debugger button");
                }
            } else {
                View viewFindViewById = activityB.findViewById(R.id.content);
                if (viewFindViewById instanceof FrameLayout) {
                    final FrameLayout frameLayout = (FrameLayout) viewFindViewById;
                    final View viewA = a(frameLayout, activityB);
                    frameLayout.addView(viewA);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(150L);
                    viewA.startAnimation(alphaAnimation);
                    final ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
                    final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.M
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            this.f47773n.a(viewA, frameLayout);
                        }
                    };
                    viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.rv6
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f49896n.a(viewA, frameLayout, viewTreeObserver, onGlobalLayoutListener);
                        }
                    }, TimeUnit.SECONDS.toMillis(5L));
                    this.f48403f = new WeakReference(viewA);
                }
            }
        }
    }

    @Override // com.applovin.impl.m1.a
    public void a() {
        int i2 = this.f48406i;
        if (i2 % 2 == 1) {
            this.f48406i = i2 + 1;
        }
        if (this.f48406i / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.vd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50634n.e();
                }
            });
            this.f48406i = 0;
            this.f48405h.a();
        }
    }

    public void l() {
        if (!g()) {
            return;
        }
        this.f48407j = ((Boolean) this.f48398a.a(x4.l1)).booleanValue();
        if (this.f48404g == null) {
            this.f48404g = new m1(this.f48398a, this);
        }
        this.f48404g.a();
    }

    private void b(View view, FrameLayout frameLayout) {
        if (this.f48407j) {
            view.setOnTouchListener(null);
            this.f48408k = 0L;
        }
        frameLayout.removeView(view);
        this.f48403f = new WeakReference(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout) {
        if (view.getParent() != null || this.f48403f.get() == null) {
            return;
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (this.f48408k > 0 && this.f48407j) {
            view.setVisibility(4);
        } else {
            b(view, frameLayout);
        }
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public String b(q1 q1Var) {
        com.applovin.impl.sdk.ad.b bVarC = q1Var.c();
        y2 y2VarE = q1Var.e();
        if (bVarC == null) {
            if (y2VarE != null) {
                return y2VarE.D();
            }
            return null;
        }
        return "json_v3!" + Base64.encodeToString(bVarC.getOriginalFullResponse().toString().getBytes(), 2);
    }

    private View a(final FrameLayout frameLayout, Activity activity) {
        View view;
        int iDpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i2 = iDpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx, iDpToPx, 8388629);
        layoutParams.setMargins(i2, i2, i2, i2);
        try {
            ImageButton imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i2, i2, i2, i2 * 2);
            view = imageButton;
        } catch (Throwable unused) {
            Button button = new Button(activity);
            button.setText("ⓘ");
            button.setTextColor(-1);
            button.setAllCaps(false);
            button.setTextSize(2, 20.0f);
            button.setPadding(0, 0, 0, 0);
            view = button;
        }
        view.setLayoutParams(layoutParams);
        view.setBackground(f());
        if (this.f48407j) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.Lu
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return this.f47770n.a(frameLayout, view2, motionEvent);
                }
            });
        } else {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.K
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f47756n.a(view2);
                }
            });
        }
        if (o0.d()) {
            view.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        }
        return view;
    }

    private String b(Object obj) {
        String strQ;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            strQ = ((com.applovin.impl.sdk.ad.b) obj).getMediationServeId();
        } else {
            strQ = obj instanceof y2 ? ((y2) obj).Q() : null;
        }
        return StringUtils.isValidString(strQ) ? strQ : UUID.randomUUID().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(FrameLayout frameLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f48408k = SystemClock.elapsedRealtime();
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.psW
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49757n.i();
                }
            }, TimeUnit.SECONDS.toMillis(10L));
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (view.getVisibility() == 0) {
                this.f48408k = 0L;
                n();
            } else {
                b(view, frameLayout);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.Serializable, java.lang.Object[]] */
    public void a(q1 q1Var, Context context, boolean z2) {
        String strA = a(q1Var);
        v2 v2Var = new v2();
        if (z2) {
            v2Var.b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        v2Var.b(strA);
        String strB = b(q1Var);
        if (strB != null) {
            v2Var.a("\nBid Response:\n");
            v2Var.a(strB);
        }
        String str = q1Var.c() != null ? "AppLovin Ad Report" : "MAX Ad Report";
        Intent intentCreateChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", v2Var.toString()).setPackage(null), "Share Ad Report");
        if (z2) {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:")).putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", v2Var.toString()).setPackage("com.google.android.gm");
                String str2 = this.f48398a.n0().getExtraParameters().get("creative_debugger_email_recipients");
                if (StringUtils.isValidString(str2)) {
                    intent.putExtra("android.intent.extra.EMAIL", (Serializable) CollectionUtils.explode(str2).toArray());
                }
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                return;
            } catch (ActivityNotFoundException unused) {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentCreateChooser);
                return;
            }
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentCreateChooser);
    }

    public String a(q1 q1Var) {
        v2 v2Var = new v2();
        v2Var.b("Ad Info:\n");
        y2 y2VarE = q1Var.e();
        com.applovin.impl.sdk.ad.b bVarC = q1Var.c();
        if (y2VarE != null) {
            v2Var.a(y2VarE);
        } else if (bVarC != null) {
            v2Var.a("Network", "APPLOVIN").a(bVarC).b(bVarC);
        }
        v2Var.a(this.f48398a);
        v2Var.a("Epoch Timestamp (ms)", Long.valueOf(q1Var.b()));
        v2 v2Var2 = new v2();
        v2Var2.a("Platform", "fireos".equals(this.f48398a.A().A()) ? "Fire OS" : "Android").a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.f48398a.a(x4.f50772L3)).a("App Package Name", this.f48399b.getPackageName()).a("Device", String.format("%s %s (%s)", Build.BRAND, Build.MODEL, Build.DEVICE)).a("OS Version", Build.VERSION.RELEASE).a("AppLovin Random Token", this.f48398a.h0()).a("Ad Review Version", C1784j.b()).a(a(q1Var.a())).a("User ID", this.f48398a.w0().e() != null ? this.f48398a.w0().e() : "None").a("MD", this.f48398a.a(x4.f50843t));
        v2Var.a("\nDebug Info:\n").a(AbstractC1810u4.b(v2Var2.toString(), n7.a(this.f48398a), AbstractC1810u4.a.V2, this.f48398a.i0(), this.f48398a));
        return v2Var.toString();
    }

    private Bundle a(Object obj) {
        this.f48398a.O();
        if (C1804o.a()) {
            this.f48398a.O().a("CreativeDebuggerService", "Retrieving Ad Review info for ad: " + obj);
        }
        String strA = n7.a(obj);
        Bundle bundleA = this.f48398a.j().a(strA);
        this.f48398a.O();
        if (C1804o.a()) {
            this.f48398a.O().a("CreativeDebuggerService", "Serve id: " + strA);
        }
        this.f48398a.O();
        if (C1804o.a()) {
            this.f48398a.O().a("CreativeDebuggerService", "Public data: " + bundleA);
        }
        if (bundleA == null) {
            return null;
        }
        for (String str : bundleA.keySet()) {
            Object obj2 = bundleA.get(str);
            bundleA.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj2, bundleA);
        }
        return bundleA;
    }
}
