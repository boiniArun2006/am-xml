package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.Calendar;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Calendar f58921n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f58922t;

    class j extends AccessibilityDelegateCompat {
        j() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void Uo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.Uo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.Mx(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f58921n = Xo.xMQ();
        if (CN3.N(getContext())) {
            setNextFocusLeftId(Rxk.Wre.f8770n);
            setNextFocusRightId(Rxk.Wre.nr);
        }
        this.f58922t = CN3.s7N(getContext());
        ViewCompat.eTf(this, new j());
    }

    private void n(int i2, Rect rect) {
        if (i2 == 33) {
            setSelection(getAdapter().gh());
        } else if (i2 == 130) {
            setSelection(getAdapter().rl());
        } else {
            super.onFocusChanged(true, i2, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z2, int i2, Rect rect) {
        if (z2) {
            n(i2, rect);
        } else {
            super.onFocusChanged(false, i2, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i2, int i3) {
        if (!this.f58922t) {
            super.onMeasure(i2, i3);
            return;
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof Dsr)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), Dsr.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Dsr adapter = getAdapter();
        adapter.getClass();
        int iMax = Math.max(adapter.rl(), getFirstVisiblePosition());
        int iMin = Math.min(adapter.gh(), getLastVisiblePosition());
        adapter.getItem(iMax);
        adapter.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!super.onKeyDown(i2, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().rl()) {
            return true;
        }
        if (19 != i2) {
            return false;
        }
        setSelection(getAdapter().rl());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Dsr getAdapter() {
        return (Dsr) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i2) {
        if (i2 < getAdapter().rl()) {
            super.setSelection(getAdapter().rl());
        } else {
            super.setSelection(i2);
        }
    }
}
