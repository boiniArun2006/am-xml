package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class r extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewGroup f49822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AppLovinSdkUtils.Size f49823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f49824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RelativeLayout f49825d;

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f49825d.removeView(this.f49822a);
        super.dismiss();
    }

    public r(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        this.f49822a = viewGroup;
        this.f49823b = size;
        this.f49824c = activity;
        requestWindowFeature(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f49824c, this.f49823b.getWidth()), AppLovinSdkUtils.dpToPx(this.f49824c, this.f49823b.getHeight()));
        layoutParams.addRule(13);
        this.f49822a.setLayoutParams(layoutParams);
        int iDpToPx = AppLovinSdkUtils.dpToPx(this.f49824c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f49824c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f49824c.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.QhI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47817n.a(view);
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f49824c);
        this.f49825d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f49825d.setBackgroundColor(Integer.MIN_VALUE);
        this.f49825d.addView(imageButton);
        this.f49825d.addView(this.f49822a);
        this.f49825d.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.H
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47731n.b(view);
            }
        });
        setContentView(this.f49825d);
    }
}
