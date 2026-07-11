package com.applovin.impl;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f49788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f49789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f49790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f49791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r2 f49792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f49793f;

    public void a(int i2) {
        this.f49793f = i2;
    }

    public int a() {
        return this.f49793f;
    }

    public r2 b() {
        return this.f49792e;
    }

    public void a(r2 r2Var) {
        this.f49792e = r2Var;
        this.f49788a.setText(r2Var.k());
        this.f49788a.setTextColor(r2Var.l());
        if (this.f49789b != null) {
            if (!TextUtils.isEmpty(r2Var.f())) {
                this.f49789b.setTypeface(null, 0);
                this.f49789b.setVisibility(0);
                this.f49789b.setText(r2Var.f());
                this.f49789b.setTextColor(r2Var.g());
                if (r2Var.p()) {
                    this.f49789b.setTypeface(null, 1);
                }
            } else {
                this.f49789b.setVisibility(8);
            }
        }
        if (this.f49790c != null) {
            if (r2Var.h() > 0) {
                this.f49790c.setImageResource(r2Var.h());
                this.f49790c.setColorFilter(r2Var.i());
                this.f49790c.setVisibility(0);
            } else {
                this.f49790c.setVisibility(8);
            }
        }
        if (this.f49791d != null) {
            if (r2Var.d() > 0) {
                this.f49791d.setImageResource(r2Var.d());
                this.f49791d.setColorFilter(r2Var.e());
                this.f49791d.setVisibility(0);
                return;
            }
            this.f49791d.setVisibility(8);
        }
    }
}
