package com.google.android.material.timepicker;

import Rxk.Wre;
import Rxk.fuX;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private final ClockHandView f59412GR;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Chip f59413I;
    private final ClockFaceView Nxk;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Chip f59414a;
    private final View.OnClickListener dR0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final MaterialButtonToggleGroup f59415k;

    interface I28 {
    }

    interface Ml {
    }

    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.E2(TimePickerView.this);
        }
    }

    class n extends GestureDetector.SimpleOnGestureListener {
        n() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.e(TimePickerView.this);
            return false;
        }
    }

    class w6 implements View.OnTouchListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ GestureDetector f59418n;

        w6(GestureDetector gestureDetector) {
            this.f59418n = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f59418n.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.dR0 = new j();
        LayoutInflater.from(context).inflate(fuX.f8789r, this);
        this.Nxk = (ClockFaceView) findViewById(Wre.xMQ);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(Wre.qie);
        this.f59415k = materialButtonToggleGroup;
        materialButtonToggleGroup.rl(new MaterialButtonToggleGroup.Ml() { // from class: com.google.android.material.timepicker.I28
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.Ml
            public final void n(MaterialButtonToggleGroup materialButtonToggleGroup2, int i3, boolean z2) {
                this.f59402n.getClass();
            }
        });
        this.f59414a = (Chip) findViewById(Wre.HI);
        this.f59413I = (Chip) findViewById(Wre.az);
        this.f59412GR = (ClockHandView) findViewById(Wre.mUb);
        T();
        X();
    }

    private void T() {
        w6 w6Var = new w6(new GestureDetector(getContext(), new n()));
        this.f59414a.setOnTouchListener(w6Var);
        this.f59413I.setOnTouchListener(w6Var);
    }

    private void X() {
        Chip chip = this.f59414a;
        int i2 = Wre.f8768e;
        chip.setTag(i2, 12);
        this.f59413I.setTag(i2, 10);
        this.f59414a.setOnClickListener(this.dR0);
        this.f59413I.setOnClickListener(this.dR0);
        this.f59414a.setAccessibilityClassName("android.view.View");
        this.f59413I.setAccessibilityClassName("android.view.View");
    }

    static /* synthetic */ I28 E2(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ Ml e(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (view == this && i2 == 0) {
            this.f59413I.sendAccessibilityEvent(8);
        }
    }
}
