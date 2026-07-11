package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class n extends w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final SideSheetBehavior f59159n;

    @Override // com.google.android.material.sidesheet.w6
    boolean gh(float f3) {
        return f3 < 0.0f;
    }

    @Override // com.google.android.material.sidesheet.w6
    int mUb() {
        return 0;
    }

    @Override // com.google.android.material.sidesheet.w6
    void HI(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        marginLayoutParams.rightMargin = i2;
    }

    @Override // com.google.android.material.sidesheet.w6
    int J2() {
        return this.f59159n.eTf();
    }

    @Override // com.google.android.material.sidesheet.w6
    int O() {
        return this.f59159n.eTf();
    }

    @Override // com.google.android.material.sidesheet.w6
    void ck(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3) {
        int iETf = this.f59159n.eTf();
        if (i2 <= iETf) {
            marginLayoutParams.rightMargin = iETf - i2;
        }
    }

    @Override // com.google.android.material.sidesheet.w6
    int n(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.w6
    int t(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    n(SideSheetBehavior sideSheetBehavior) {
        this.f59159n = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.w6
    int KN(View view) {
        return view.getLeft() - this.f59159n.piY();
    }

    @Override // com.google.android.material.sidesheet.w6
    int Uo() {
        return nr();
    }

    @Override // com.google.android.material.sidesheet.w6
    boolean az(float f3, float f4) {
        if (Ml.n(f3, f4) && Math.abs(f3) > this.f59159n.xg()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.sidesheet.w6
    int nr() {
        return Math.max(0, (O() - this.f59159n.I()) - this.f59159n.piY());
    }

    @Override // com.google.android.material.sidesheet.w6
    boolean qie(View view) {
        if (view.getLeft() > (O() + nr()) / 2) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.sidesheet.w6
    float rl(int i2) {
        float fO = O();
        return (fO - i2) / (fO - nr());
    }

    @Override // com.google.android.material.sidesheet.w6
    boolean ty(View view, float f3) {
        if (Math.abs(view.getRight() + (f3 * this.f59159n.dR0())) > this.f59159n.z()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.sidesheet.w6
    public int xMQ(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }
}
