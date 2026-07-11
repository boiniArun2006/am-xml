package com.fyber.inneractive.sdk.flow.storepromo.ui;

import android.content.Context;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.o;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f53915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f53916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Animation f53917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Animation f53918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f53919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.b f53920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f53921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f53922h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f53923i = new a(this);

    public c(Context context, View view, com.fyber.inneractive.sdk.flow.storepromo.b bVar) {
        float f3;
        this.f53915a = view;
        this.f53917c = AnimationUtils.loadAnimation(context, R.anim.store_promo_appear_anim);
        this.f53918d = AnimationUtils.loadAnimation(context, R.anim.store_promo_disappear_anim);
        o oVar = IAConfigManager.f53260M.f53294t.f53466b;
        oVar.getClass();
        try {
            f3 = Float.parseFloat(oVar.a("dtx_store_promo_height", Float.toString(0.7f)));
        } catch (Throwable unused) {
            f3 = 0.7f;
        }
        this.f53921g = Math.max(f3, 0.7f);
        this.f53920f = bVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.dt_store_promo_layout, (ViewGroup) null);
        this.f53916b = viewGroup;
        viewGroup.setOnClickListener(null);
        this.f53916b.setBackgroundColor(context.getResources().getColor(R.color.dtx_store_promo_bg_fade));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        this.f53915a.setLayoutParams(layoutParams2);
        this.f53916b.setVisibility(8);
        ViewGroup viewGroup2 = this.f53916b;
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(layoutParams);
            this.f53916b.addView(this.f53915a);
        }
        if (this.f53919e == null) {
            b bVar2 = new b(this);
            this.f53919e = bVar2;
            com.fyber.inneractive.sdk.util.o.f57018a.registerReceiver(bVar2, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
        }
    }

    public final void a() {
        View view;
        int iD;
        int iC = com.fyber.inneractive.sdk.util.o.c();
        if (iC != this.f53922h && (view = this.f53915a) != null && view.getLayoutParams() != null) {
            this.f53922h = iC;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f53915a.getLayoutParams();
            if (iC == 2) {
                iD = com.fyber.inneractive.sdk.util.o.e();
            } else {
                iD = (int) (com.fyber.inneractive.sdk.util.o.d() * this.f53921g);
            }
            layoutParams.height = iD;
            this.f53915a.setLayoutParams(layoutParams);
        }
    }
}
