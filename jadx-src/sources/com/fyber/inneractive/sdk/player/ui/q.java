package com.fyber.inneractive.sdk.player.ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.fyber.inneractive.sdk.player.controller.z;
import com.fyber.inneractive.sdk.util.g1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class q extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f56466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f56467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f56468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f56469d;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    public q(s sVar, View view, int[] iArr, int i2) {
        this.f56469d = sVar;
        this.f56466a = view;
        this.f56467b = iArr;
        this.f56468c = i2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        onSingleTapConfirmed(motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f56466a.getRootView().getLocationOnScreen(this.f56467b);
            float rawX = motionEvent.getRawX() - this.f56467b[0];
            float rawY = motionEvent.getRawY() - this.f56467b[1];
            g1 g1Var = this.f56469d.f56425a;
            g1Var.f56998a = rawX;
            g1Var.f56999b = rawY;
        }
        s sVar = this.f56469d;
        n nVar = sVar.f56431g;
        if (nVar != null) {
            ((z) nVar).a(this.f56468c, sVar.f56425a);
        }
        return true;
    }
}
