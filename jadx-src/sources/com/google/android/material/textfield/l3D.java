package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
abstract class l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final TextInputLayout f59358n;
    final CheckableImageButton nr;
    final QJ rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Context f59359t;

    void HI(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    void Ik(boolean z2) {
    }

    View.OnClickListener J2() {
        return null;
    }

    AccessibilityManagerCompat.TouchExplorationStateChangeListener KN() {
        return null;
    }

    View.OnFocusChangeListener O() {
        return null;
    }

    View.OnFocusChangeListener Uo() {
        return null;
    }

    void XQ() {
    }

    boolean Z() {
        return false;
    }

    boolean az() {
        return false;
    }

    void ck(View view, AccessibilityEvent accessibilityEvent) {
    }

    boolean gh() {
        return false;
    }

    boolean mUb() {
        return false;
    }

    void n(Editable editable) {
    }

    int nr() {
        return 0;
    }

    void o() {
    }

    boolean qie() {
        return false;
    }

    void rl(CharSequence charSequence, int i2, int i3, int i5) {
    }

    int t() {
        return 0;
    }

    void ty(EditText editText) {
    }

    boolean xMQ(int i2) {
        return true;
    }

    final void r() {
        this.rl.wTp(false);
    }

    l3D(QJ qj) {
        this.f59358n = qj.f59280n;
        this.rl = qj;
        this.f59359t = qj.getContext();
        this.nr = qj.r();
    }
}
