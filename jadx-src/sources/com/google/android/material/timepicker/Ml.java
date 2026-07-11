package com.google.android.material.timepicker;

import Rxk.Wre;
import Rxk.fuX;
import Rxk.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mfo.CN3;
import mfo.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
abstract class Ml extends ConstraintLayout {

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private CN3 f59403GR;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f59404I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f59405a;

    int e(int i2) {
        return i2 == 2 ? Math.round(this.f59404I * 0.66f) : this.f59404I;
    }

    private Drawable E2() {
        CN3 cn3 = new CN3();
        this.f59403GR = cn3;
        cn3.P5(new Dsr(0.5f));
        this.f59403GR.p5(ColorStateList.valueOf(-1));
        return this.f59403GR;
    }

    private static boolean N(View view) {
        return "skip".equals(view.getTag());
    }

    public void T(int i2) {
        this.f59404I = i2;
        nHg();
    }

    public int X() {
        return this.f59404I;
    }

    protected void nHg() {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.ty(this);
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getId() != Wre.f8773t && !N(childAt)) {
                int i3 = (Integer) childAt.getTag(Wre.gh);
                if (i3 == null) {
                    i3 = 1;
                }
                if (!map.containsKey(i3)) {
                    map.put(i3, new ArrayList());
                }
                ((List) map.get(i3)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            fD((List) entry.getValue(), constraintSet, e(((Integer) entry.getKey()).intValue()));
        }
        constraintSet.xMQ(this);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        this.f59403GR.p5(ColorStateList.valueOf(i2));
    }

    public Ml(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        LayoutInflater.from(context).inflate(fuX.HI, this);
        ViewCompat.C(this, E2());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.RP, i2, 0);
        this.f59404I = typedArrayObtainStyledAttributes.getDimensionPixelSize(o.IV, 0);
        this.f59405a = new Runnable() { // from class: com.google.android.material.timepicker.w6
            @Override // java.lang.Runnable
            public final void run() {
                this.f59422n.nHg();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    private void fD(List list, ConstraintSet constraintSet, int i2) {
        Iterator it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            constraintSet.Ik(((View) it.next()).getId(), Wre.f8773t, i2, size);
            size += 360.0f / list.size();
        }
    }

    private void s7N() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f59405a);
            handler.post(this.f59405a);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (view.getId() == -1) {
            view.setId(ViewCompat.gh());
        }
        s7N();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        nHg();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        s7N();
    }
}
