package com.fyber.inneractive.sdk.activities;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.media3.common.C;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.t0;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.b0;
import com.fyber.inneractive.sdk.flow.h0;
import com.fyber.inneractive.sdk.flow.p0;
import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.renderers.v;
import com.fyber.inneractive.sdk.ui.CloseButtonConfiguration;
import com.fyber.inneractive.sdk.ui.CloseButtonFlowManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.n0;
import com.fyber.inneractive.sdk.util.r;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class InneractiveFullscreenAdActivity extends InneractiveBaseActivity implements com.fyber.inneractive.sdk.interfaces.e {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f53067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InneractiveAdSpot f53068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.f f53069d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CloseButtonFlowManager f53074i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53070e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f53071f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f53072g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f53073h = false;
    protected final Runnable mHideNavigationBarTask = new c(this);

    public interface FullScreenRendererProvider {
        com.fyber.inneractive.sdk.interfaces.f getFullscreenRenderer();
    }

    public interface OnInneractiveFullscreenAdDestroyListener {
        void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity);
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.h.f63176p, me);
        return super.dispatchTouchEvent(me);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initWindowFeatures(com.fyber.inneractive.sdk.interfaces.f fVar) {
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().addFlags(2);
        }
        if (fVar != 0 && (((b0) fVar) instanceof v)) {
            setTheme(R.style.Theme.NoTitleBar.Fullscreen);
            requestWindowFeature(C.BUFFER_FLAG_NOT_DEPENDED_ON);
            requestWindowFeature(134217728);
            requestWindowFeature(Integer.MIN_VALUE);
        }
        hideNavigationBar();
        t0 t0Var = ((r0) this.f53068c.getAdContent().f53980d).f53420f;
        if (t0Var != null) {
            Orientation orientation = t0Var.f53475e;
            setActivityOrientation(orientation.allowOrientationChange, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("spotId");
        InneractiveAdSpot inneractiveAdSpot = null;
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.f("%sSpot id must be provided as an extra before calling createActivity with InneractiveInterstitialAdActivty", IAlog.a(this));
        } else {
            InneractiveAdSpot spot = InneractiveAdSpotManager.get().getSpot(stringExtra);
            if (spot == null) {
                IAlog.b("%sSpot id %s cannot be found in spot manager!", IAlog.a(this), stringExtra);
            }
            if (spot != null && spot.getAdContent() == null) {
                IAlog.a("%sSpot does not have a content. Cannot start activity", IAlog.a(this));
            }
            if (spot != null && spot.getAdContent() != null) {
                inneractiveAdSpot = spot;
            }
        }
        this.f53068c = inneractiveAdSpot;
        if (inneractiveAdSpot == null || inneractiveAdSpot.getAdContent() == null || this.f53068c.getAdContent().f53980d == null) {
            super.onCreate(bundle);
            finish();
            return;
        }
        InneractiveUnitController selectedUnitController = this.f53068c.getSelectedUnitController();
        if (selectedUnitController == null || !(selectedUnitController instanceof FullScreenRendererProvider)) {
            IAlog.f("%sno appropriate unit controller found for full screen ad. Aborting", IAlog.a(this));
            super.onCreate(bundle);
            finish();
            return;
        }
        com.fyber.inneractive.sdk.interfaces.f fullscreenRenderer = ((FullScreenRendererProvider) selectedUnitController).getFullscreenRenderer();
        this.f53069d = fullscreenRenderer;
        initWindowFeatures(fullscreenRenderer);
        super.onCreate(bundle);
        IAlog.a("%sInterstitial for spot id %s created", IAlog.a(this), this.f53068c.getLocalUniqueId());
        this.f53070e = getResources().getConfiguration().orientation;
        this.f53071f = getResources().getConfiguration().screenHeightDp;
        this.f53072g = getResources().getConfiguration().screenWidthDp;
        if (this.f53069d == null) {
            IAlog.f("Interstitial Activity: Could not find an appropriate full screen ad renderer for content!", new Object[0]);
            finish();
            return;
        }
        try {
            setContentView(com.fyber.inneractive.sdk.R.layout.ia_layout_fullscreen_activity);
            this.f53067b = (ViewGroup) findViewById(com.fyber.inneractive.sdk.R.id.ia_ad_content);
            this.f53074i = new CloseButtonFlowManager(this, new d(this));
            ((p0) this.f53069d).initialize(this.f53068c);
            try {
                this.f53069d.a(this, this);
                CloseButtonFlowManager closeButtonFlowManager = this.f53074i;
                if (closeButtonFlowManager != null) {
                    this.f53069d.b(closeButtonFlowManager);
                }
                this.f53068c.getAdContent().f53981e = true;
                InneractiveAdSpot inneractiveAdSpot2 = this.f53068c;
                if (inneractiveAdSpot2 != null && (inneractiveAdSpot2 instanceof h0) && (this.f53069d instanceof com.fyber.inneractive.sdk.rtb.watermark.a)) {
                    com.fyber.inneractive.sdk.rtb.watermark.b bVar = ((h0) inneractiveAdSpot2).f53689m;
                    if (bVar == null || bVar.f56910a == null || this.f53067b == null) {
                        IAlog.a("%sCouldn't add watermark. %s is null", IAlog.a(this), bVar == null ? "Watermark" : bVar.f56910a == null ? "Watermark ImageView" : "mContentLayout");
                        return;
                    }
                    FrameLayout frameLayout = new FrameLayout(this);
                    frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    frameLayout.setClickable(false);
                    frameLayout.addView(bVar.f56910a);
                    this.f53067b.addView(frameLayout);
                    ((com.fyber.inneractive.sdk.rtb.watermark.a) this.f53069d).a(frameLayout);
                }
            } catch (Resources.NotFoundException e2) {
                IAlog.f("Interstitial Activity: %s", e2.getMessage());
                finish();
            } catch (InneractiveUnitController.AdDisplayError e3) {
                IAlog.f("Interstitial Activity: %s", e3.getMessage());
                finish();
            }
        } catch (Throwable th) {
            z.a(th, this.f53068c.getAdContent().f53977a, this.f53068c.getAdContent().f53978b);
            finish();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void disableCloseButton() {
        CloseButtonFlowManager closeButtonFlowManager = this.f53074i;
        if (closeButtonFlowManager == null) {
            return;
        }
        closeButtonFlowManager.f56933c.setVisibility(8);
        closeButtonFlowManager.f56931a.setVisibility(8);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void dismissAd(boolean z2) {
        this.f53073h = z2;
        cancelHideNavigationBarTask();
        com.fyber.inneractive.sdk.interfaces.f fVar = this.f53069d;
        if (fVar != null) {
            fVar.b(z2);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public View getCloseButton() {
        CloseButtonFlowManager closeButtonFlowManager = this.f53074i;
        if (closeButtonFlowManager != null) {
            return closeButtonFlowManager.f56935e;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public ViewGroup getLayout() {
        return this.f53067b;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public boolean isCloseButtonDisplay() {
        CloseButtonFlowManager closeButtonFlowManager = this.f53074i;
        return closeButtonFlowManager != null && closeButtonFlowManager.f56934d.getVisibility() == 0;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.fyber.inneractive.sdk.interfaces.f fVar = this.f53069d;
        if (fVar == null || !fVar.u()) {
            super.onBackPressed();
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        com.fyber.inneractive.sdk.interfaces.f fVar;
        n0 n0Var = l0.f57009a;
        n0Var.getClass();
        IAlog.a("%scleanupForDestroyedActivity called for: %s", "IAVisibilityTracker: ", this);
        Context applicationContext = getApplicationContext();
        WeakHashMap weakHashMap = (WeakHashMap) n0Var.f57015b.remove(applicationContext);
        if (weakHashMap != null) {
            IAlog.a("%sRemoved tracking entries for destroyed activity", "IAVisibilityTracker: ");
            weakHashMap.clear();
        }
        n0Var.a(applicationContext);
        CloseButtonFlowManager closeButtonFlowManager = this.f53074i;
        if (closeButtonFlowManager != null) {
            closeButtonFlowManager.f56933c.setOnClickListener(null);
            this.f53074i = null;
        }
        ViewGroup viewGroup = this.f53067b;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f53067b = null;
        }
        InneractiveAdSpot inneractiveAdSpot = this.f53068c;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot == null ? null : inneractiveAdSpot.getSelectedUnitController();
        if (selectedUnitController != null && (selectedUnitController instanceof OnInneractiveFullscreenAdDestroyListener)) {
            ((OnInneractiveFullscreenAdDestroyListener) selectedUnitController).onActivityDestroyed(this);
        }
        if (!isFinishing() && (fVar = this.f53069d) != null) {
            CloseButtonFlowManager closeButtonFlowManager2 = this.f53074i;
            if (closeButtonFlowManager2 != null) {
                fVar.a(closeButtonFlowManager2);
            }
            this.f53069d.k();
            this.f53069d.destroy();
            this.f53069d = null;
        }
        super.onDestroy();
        InneractiveAdSpot inneractiveAdSpot2 = this.f53068c;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void secondEndCardWasDisplayed() {
        CloseButtonFlowManager closeButtonFlowManager = this.f53074i;
        if (closeButtonFlowManager == null) {
            return;
        }
        closeButtonFlowManager.f56936f = true;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void setActivityOrientation(boolean z2, Orientation orientation) {
        if (z2 && orientation.equals(Orientation.USER)) {
            setRequestedOrientation(13);
            return;
        }
        if (z2 && orientation.equals(Orientation.NONE)) {
            setRequestedOrientation(getRequestedOrientation());
            return;
        }
        if (orientation.equals(Orientation.LANDSCAPE)) {
            setRequestedOrientation(6);
            return;
        }
        if (orientation.equals(Orientation.PORTRAIT)) {
            setRequestedOrientation(7);
            return;
        }
        int i2 = getResources().getConfiguration().orientation;
        if (i2 == 1) {
            setRequestedOrientation(7);
        } else if (i2 == 2) {
            setRequestedOrientation(6);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void showCloseButton(boolean z2, int i2, int i3) {
        CloseButtonFlowManager closeButtonFlowManager = this.f53074i;
        if (closeButtonFlowManager == null) {
            return;
        }
        CloseButtonConfiguration closeButtonConfiguration = closeButtonFlowManager.f56937g;
        closeButtonConfiguration.f56926c = z2;
        closeButtonConfiguration.f56927d = i2;
        closeButtonConfiguration.f56928e = i3;
        closeButtonConfiguration.f56925b = true;
        closeButtonConfiguration.f56924a = false;
        closeButtonConfiguration.f56930g.a(closeButtonConfiguration);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void showCloseCountdown() {
        CloseButtonFlowManager closeButtonFlowManager = this.f53074i;
        if (closeButtonFlowManager == null) {
            return;
        }
        closeButtonFlowManager.f56932b.setBackgroundResource(com.fyber.inneractive.sdk.R.drawable.ia_round_overlay_bg);
        CloseButtonConfiguration closeButtonConfiguration = closeButtonFlowManager.f56937g;
        closeButtonConfiguration.f56924a = true;
        closeButtonConfiguration.f56925b = false;
        closeButtonConfiguration.f56930g.a(closeButtonConfiguration);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void updateCloseCountdown(int i2) {
        CloseButtonFlowManager closeButtonFlowManager = this.f53074i;
        if (closeButtonFlowManager != null && i2 > 0) {
            closeButtonFlowManager.f56932b.setText(Integer.toString(i2));
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public boolean wasDismissedByUser() {
        return this.f53073h;
    }

    public void cancelHideNavigationBarTask() {
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(null);
        r.f57026b.removeCallbacks(this.mHideNavigationBarTask);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public void destroy() {
        if (!isFinishing() && this.f53067b != null) {
            finish();
        }
    }

    public void hideNavigationBar() {
        View decorView = getWindow().getDecorView();
        if ((decorView.getSystemUiVisibility() & 2) == 0) {
            decorView.setSystemUiVisibility(2818);
        }
        decorView.setOnSystemUiVisibilityChangeListener(new e(this));
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.fyber.inneractive.sdk.interfaces.f fVar = this.f53069d;
        if (fVar != null) {
            int i2 = configuration.orientation;
            if (i2 != this.f53070e) {
                this.f53070e = i2;
                fVar.a();
                return;
            }
            int i3 = this.f53071f;
            int i5 = configuration.screenHeightDp;
            if (i3 != i5 || this.f53072g != configuration.screenWidthDp) {
                this.f53071f = i5;
                this.f53072g = configuration.screenWidthDp;
                fVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            com.fyber.inneractive.sdk.interfaces.f fVar = this.f53069d;
            if (fVar != null) {
                CloseButtonFlowManager closeButtonFlowManager = this.f53074i;
                if (closeButtonFlowManager != null) {
                    fVar.a(closeButtonFlowManager);
                }
                this.f53069d.k();
                this.f53069d.destroy();
                this.f53069d = null;
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.interfaces.f fVar2 = this.f53069d;
        if (fVar2 != null) {
            fVar2.r();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        com.fyber.inneractive.sdk.interfaces.f fVar = this.f53069d;
        if (fVar != null) {
            fVar.m();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            hideNavigationBar();
            com.fyber.inneractive.sdk.interfaces.f fVar = this.f53069d;
            if (fVar != null) {
                fVar.m();
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.interfaces.f fVar2 = this.f53069d;
        if (fVar2 != null) {
            fVar2.r();
        }
    }
}
