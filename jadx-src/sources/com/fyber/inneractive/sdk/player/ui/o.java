package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.v;
import com.fyber.inneractive.sdk.ui.IAsmoothProgressBar;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class o extends l {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ViewGroup f56452K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public TextView f56453L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public TextView f56454M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ImageView f56455N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ImageView f56456O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public IAsmoothProgressBar f56457P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public View f56458Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public View f56459R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public View f56460S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TextView f56461T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public TextView f56462U;

    public o(Context context, com.fyber.inneractive.sdk.flow.g gVar, a aVar, com.fyber.inneractive.sdk.config.global.r rVar, boolean z2, String str) {
        super(context, gVar, aVar, rVar, str);
        this.f56458Q = null;
        this.f56442A.inflate(R.layout.ia_layout_video_view, (ViewGroup) this, true);
        q();
        com.fyber.inneractive.sdk.flow.g gVar2 = this.f56443B;
        if (gVar2 != null) {
            IFyberAdIdentifier.Corner corner = IFyberAdIdentifier.Corner.BOTTOM_LEFT;
            IFyberAdIdentifier iFyberAdIdentifier = gVar2.f53676d;
            iFyberAdIdentifier.f56960k = corner;
            iFyberAdIdentifier.a(this);
        }
        h(z2);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l, com.fyber.inneractive.sdk.player.ui.s
    public final void a(int i2, int i3) {
        IAsmoothProgressBar iAsmoothProgressBar = this.f56457P;
        if (iAsmoothProgressBar == null) {
            return;
        }
        iAsmoothProgressBar.setMax(i2);
        super.a(i2, i3);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public final void d() {
        this.f56432h = true;
        j();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l, com.fyber.inneractive.sdk.player.ui.s, com.fyber.inneractive.sdk.player.ui.e, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f63176p, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public final void e() {
        this.f56432h = false;
        k();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void i() {
        g(false);
        d(false);
        f(false);
        TextView textView = this.f56454M;
        if (textView != null) {
            textView.setVisibility(4);
        }
        ImageView imageView = this.f56456O;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        c(false);
        a(false, (String) null);
        b(false);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void b(boolean z2) {
        TextView textView = this.f56461T;
        if (textView != null) {
            textView.setVisibility(z2 ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void c(boolean z2) {
        ViewGroup viewGroup = this.f56452K;
        if (viewGroup != null) {
            viewGroup.setVisibility(z2 ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void f(boolean z2) {
        IAsmoothProgressBar iAsmoothProgressBar = this.f56457P;
        if (iAsmoothProgressBar != null) {
            iAsmoothProgressBar.setVisibility(z2 ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g(boolean z2) {
        TextView textView = this.f56462U;
        if (textView != null) {
            textView.setVisibility(z2 ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyView() {
        return new View[]{this.f56454M, this.f56461T, this.f56462U, this.f56455N, this.f56457P, this.f56458Q, this.f56515v};
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyViewObstructionPurposeOther() {
        return new View[]{this.f56453L, this.f56452K};
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void h() {
        TextView textView = this.f56462U;
        if (textView != null) {
            textView.setEnabled(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final boolean l() {
        return this.f56461T == null && this.f56457P == null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void m() {
        ImageView imageView = this.f56456O;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.f56456O.setSelected(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void n() {
        ImageView imageView = this.f56456O;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.f56456O.setSelected(false);
        }
    }

    public void q() {
        this.f56506m = (ViewGroup) findViewById(R.id.ia_texture_view_host);
        this.f56511r = (ViewGroup) findViewById(R.id.ia_default_endcard_video_overlay);
        this.f56512s = (ViewGroup) findViewById(R.id.ia_endcard_video_overlay);
        this.f56507n = (Button) findViewById(R.id.ia_b_end_card_call_to_action);
        TextView textView = (TextView) findViewById(R.id.ia_endcard_tv_app_info_button);
        this.f56515v = textView;
        a(textView, 10);
        a(this.f56507n, 8);
        a(this.f56506m, 7);
        a(this.f56511r, -1);
        this.f56456O = (ImageView) findViewById(R.id.ia_iv_expand_collapse_button);
        this.f56460S = findViewById(R.id.ia_paused_video_overlay);
        this.f56453L = (TextView) findViewById(R.id.ia_tv_app_info_button);
        this.f56454M = (TextView) findViewById(R.id.ia_tv_call_to_action);
        this.f56457P = (IAsmoothProgressBar) findViewById(R.id.ia_video_progressbar);
        this.f56452K = (ViewGroup) findViewById(R.id.ia_identifier_overlay);
        this.f56458Q = findViewById(R.id.ia_click_overlay);
        this.f56457P.setVisibility(0);
        ImageView imageView = (ImageView) findViewById(R.id.ia_iv_mute_button);
        this.f56455N = imageView;
        imageView.setVisibility(0);
        this.f56459R = findViewById(R.id.ia_buffering_overlay);
        this.f56461T = (TextView) findViewById(R.id.ia_tv_remaining_time);
        this.f56462U = (TextView) findViewById(R.id.ia_tv_skip);
        a(this, 7);
        a(this.f56454M, 3);
        a(this.f56455N, 1);
        a(this.f56453L, 10);
        a(this.f56456O, 5);
        a(this.f56460S, 9);
        a(this.f56462U, 6);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setAppInfoButtonRound(TextView textView) {
        if (textView == null) {
            return;
        }
        textView.setBackgroundResource(R.drawable.ia_bg_circle_overlay);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Resources resources = getContext().getResources();
        int i2 = R.dimen.ia_image_control_size;
        layoutParams.width = (int) resources.getDimension(i2);
        layoutParams.height = (int) getContext().getResources().getDimension(i2);
        textView.setLayoutParams(layoutParams);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setMuteButtonState(boolean z2) {
        ImageView imageView = this.f56455N;
        if (imageView != null) {
            imageView.setSelected(z2);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setRemainingTime(String str) {
        TextView textView = this.f56461T;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setSkipText(String str) {
        if (this.f56462U != null) {
            try {
                Integer.parseInt(str);
                int i2 = R.string.ia_video_before_skip_format;
                str = String.format(Locale.US, IAConfigManager.f53260M.f53295u.a().getString(i2), Integer.valueOf(Integer.parseInt(str)));
            } catch (Exception unused) {
            }
            this.f56462U.setText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void d(boolean z2) {
        ImageView imageView = this.f56455N;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s, com.fyber.inneractive.sdk.player.ui.m
    public final void destroy() {
        super.destroy();
        k kVar = this.f56446E;
        if (kVar != null) {
            removeCallbacks(kVar);
            this.f56446E = null;
        }
        p();
        ViewGroup viewGroup = this.f56506m;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void e(boolean z2) {
        View view = this.f56460S;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public final void a(int i2) {
        IAsmoothProgressBar iAsmoothProgressBar = this.f56457P;
        if (iAsmoothProgressBar != null) {
            iAsmoothProgressBar.setProgress(i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    @Override // com.fyber.inneractive.sdk.player.ui.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z2, com.fyber.inneractive.sdk.ignite.m mVar) {
        String localizedCtaButtonText;
        Boolean boolC;
        TextView textView = this.f56454M;
        if (textView != null) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.f56516w;
            textView.setAllCaps((rVar == null || rVar.a(v.class) == null || (boolC = ((v) this.f56516w.a(v.class)).c("cta_text_all_caps")) == null) ? false : boolC.booleanValue());
            TextView textView2 = this.f56454M;
            if (IAConfigManager.f53260M.f53266D.n()) {
                mVar.getClass();
                if (mVar == com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP) {
                    localizedCtaButtonText = getContext().getString(R.string.ia_video_instant_install_text);
                } else {
                    localizedCtaButtonText = getLocalizedCtaButtonText();
                    if (TextUtils.isEmpty(localizedCtaButtonText)) {
                        localizedCtaButtonText = getContext().getString(R.string.ia_video_install_now_text);
                    }
                }
            }
            if (!TextUtils.isEmpty(this.f56517x)) {
                localizedCtaButtonText = this.f56517x;
            }
            textView2.setText(localizedCtaButtonText);
            this.f56454M.setVisibility(z2 ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z2, String str) {
        TextView textView;
        TextView textView2 = this.f56453L;
        if (textView2 != null) {
            textView2.setText(str);
            if (str != null && str.length() == 1) {
                setAppInfoButtonRound(this.f56453L);
            }
            if (z2 && (textView = this.f56454M) != null) {
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                layoutParams.width = -2;
                this.f56454M.setLayoutParams(layoutParams);
                this.f56454M.setTextSize(0, getResources().getDimension(R.dimen.ia_video_overlay_text_large_for_cta));
            }
            this.f56453L.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z2) {
        View view = this.f56459R;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.m
    public boolean a() {
        TextView textView = this.f56462U;
        return textView != null && textView.getVisibility() == 0 && this.f56462U.isEnabled();
    }
}
