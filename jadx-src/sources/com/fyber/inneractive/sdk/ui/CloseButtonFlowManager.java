package com.fyber.inneractive.sdk.ui;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.util.o;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class CloseButtonFlowManager implements com.fyber.inneractive.sdk.flow.storepromo.observer.a, CloseButtonConfigurationChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f56931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f56932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f56933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f56934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout f56935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f56936f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CloseButtonConfiguration f56937g = new CloseButtonConfiguration(this);

    @Override // com.fyber.inneractive.sdk.ui.CloseButtonConfigurationChangeListener
    public final void a(CloseButtonConfiguration closeButtonConfiguration) {
        int i2;
        int i3;
        if (closeButtonConfiguration.f56929f) {
            this.f56931a.setVisibility(8);
            this.f56932b.setVisibility(8);
            this.f56934d.setVisibility(8);
            this.f56933c.setVisibility(8);
            return;
        }
        CloseButtonConfiguration closeButtonConfiguration2 = this.f56937g;
        if (closeButtonConfiguration2.f56925b) {
            if (!closeButtonConfiguration2.f56926c || this.f56936f) {
                this.f56931a.setAlpha(1.0f);
                this.f56934d.setAlpha(1.0f);
            } else {
                this.f56931a.setAlpha(0.0f);
                this.f56934d.setAlpha(0.0f);
            }
            this.f56932b.setText("");
            this.f56932b.setVisibility(8);
            int i5 = closeButtonConfiguration2.f56927d;
            if (i5 >= 5) {
                int iA = o.a(i5);
                this.f56934d.getLayoutParams().width = iA;
                this.f56934d.getLayoutParams().height = iA;
            }
            int i7 = closeButtonConfiguration2.f56928e;
            if (i7 >= 5) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f56934d.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f56931a.getLayoutParams();
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f56933c.getLayoutParams();
                int iA2 = o.a(i7);
                int i8 = layoutParams.width;
                int i9 = iA2 - i8;
                if (iA2 <= i8 || i9 <= (i3 = layoutParams2.rightMargin)) {
                    layoutParams3.width = iA2;
                    layoutParams3.height = iA2;
                    i2 = layoutParams2.rightMargin;
                    if (i9 < i2) {
                        i2 -= i9 / 2;
                    }
                } else {
                    int i10 = (i8 / 2) + (iA2 / 2) + i3;
                    layoutParams3.width = i10;
                    layoutParams3.height = i10;
                    layoutParams2.gravity = 53;
                    i2 = 0;
                }
                layoutParams3.setMargins(i2, i2, i2, i2);
                layoutParams3.gravity = 17;
            }
        }
        this.f56931a.setVisibility((closeButtonConfiguration.f56924a || closeButtonConfiguration.f56925b) ? 0 : 8);
        this.f56932b.setVisibility(closeButtonConfiguration.f56924a ? 0 : 8);
        int i11 = closeButtonConfiguration.f56925b ? 0 : 8;
        this.f56934d.setVisibility(i11);
        this.f56933c.setVisibility(i11);
        this.f56933c.setEnabled(closeButtonConfiguration.f56925b);
    }

    public CloseButtonFlowManager(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity, com.fyber.inneractive.sdk.activities.d dVar) {
        View viewFindViewById = inneractiveFullscreenAdActivity.findViewById(R.id.ia_fl_close_button);
        this.f56931a = viewFindViewById;
        this.f56932b = (TextView) inneractiveFullscreenAdActivity.findViewById(R.id.ia_tv_close_button);
        View viewFindViewById2 = inneractiveFullscreenAdActivity.findViewById(R.id.ia_clickable_close_button);
        this.f56933c = viewFindViewById2;
        this.f56934d = (ImageView) inneractiveFullscreenAdActivity.findViewById(R.id.ia_iv_close_button);
        this.f56935e = (FrameLayout) inneractiveFullscreenAdActivity.findViewById(R.id.close_button_container);
        viewFindViewById.setVisibility(8);
        viewFindViewById2.setOnClickListener(dVar);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.observer.a
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar) {
        CloseButtonConfiguration closeButtonConfiguration = this.f56937g;
        closeButtonConfiguration.f56929f = bVar.f53911a;
        closeButtonConfiguration.f56930g.a(closeButtonConfiguration);
    }
}
