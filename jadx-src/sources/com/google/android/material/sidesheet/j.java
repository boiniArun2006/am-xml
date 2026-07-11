package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class j extends w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final SideSheetBehavior f59158n;

    @Override // com.google.android.material.sidesheet.w6
    boolean gh(float f3) {
        return f3 > 0.0f;
    }

    @Override // com.google.android.material.sidesheet.w6
    int mUb() {
        return 1;
    }

    @Override // com.google.android.material.sidesheet.w6
    void HI(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        marginLayoutParams.leftMargin = i2;
    }

    @Override // com.google.android.material.sidesheet.w6
    int J2() {
        return this.f59158n.piY();
    }

    @Override // com.google.android.material.sidesheet.w6
    int O() {
        return (-this.f59158n.I()) - this.f59158n.piY();
    }

    @Override // com.google.android.material.sidesheet.w6
    int Uo() {
        return -this.f59158n.I();
    }

    @Override // com.google.android.material.sidesheet.w6
    void ck(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3) {
        if (i2 <= this.f59158n.eTf()) {
            marginLayoutParams.leftMargin = i3;
        }
    }

    @Override // com.google.android.material.sidesheet.w6
    int n(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.w6
    int nr() {
        return Math.max(0, this.f59158n.m() + this.f59158n.piY());
    }

    @Override // com.google.android.material.sidesheet.w6
    int t(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    j(SideSheetBehavior sideSheetBehavior) {
        this.f59158n = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.w6
    int KN(View view) {
        return view.getRight() + this.f59158n.piY();
    }

    @Override // com.google.android.material.sidesheet.w6
    boolean az(float f3, float f4) {
        if (Ml.n(f3, f4) && Math.abs(f3) > this.f59158n.xg()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.sidesheet.w6
    boolean qie(View view) {
        if (view.getRight() < (nr() - O()) / 2) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.sidesheet.w6
    float rl(int i2) {
        float fO = O();
        return (i2 - fO) / (nr() - fO);
    }

    @Override // com.google.android.material.sidesheet.w6
    boolean ty(View view, float f3) {
        if (Math.abs(view.getLeft() + (f3 * this.f59158n.dR0())) > this.f59158n.z()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.sidesheet.w6
    public int xMQ(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }
}
