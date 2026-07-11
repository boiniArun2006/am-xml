package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.exoplayer2.video.spherical.OrientationListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class TouchTracker extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, OrientationListener.Listener {
    private final float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Listener f58576O;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final GestureDetector f58579r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PointF f58577n = new PointF();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final PointF f58580t = new PointF();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile float f58578o = 3.1415927f;

    public interface Listener {
        void onScrollChange(PointF pointF);

        default boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    @Override // com.google.android.exoplayer2.video.spherical.OrientationListener.Listener
    public void onOrientationChange(float[] fArr, float f3) {
        this.f58578o = -f3;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f58577n.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f58576O.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f58579r.onTouchEvent(motionEvent);
    }

    public TouchTracker(Context context, Listener listener, float f3) {
        this.f58576O = listener;
        this.J2 = f3;
        this.f58579r = new GestureDetector(context, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f4) {
        float x2 = (motionEvent2.getX() - this.f58577n.x) / this.J2;
        float y2 = motionEvent2.getY();
        PointF pointF = this.f58577n;
        float f5 = (y2 - pointF.y) / this.J2;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d2 = this.f58578o;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        PointF pointF2 = this.f58580t;
        pointF2.x -= (fCos * x2) - (fSin * f5);
        float f6 = pointF2.y + (fSin * x2) + (fCos * f5);
        pointF2.y = f6;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f6));
        this.f58576O.onScrollChange(this.f58580t);
        return true;
    }
}
