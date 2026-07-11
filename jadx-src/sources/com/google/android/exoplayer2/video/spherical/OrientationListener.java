package com.google.android.exoplayer2.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class OrientationListener implements SensorEventListener {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f58560Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Listener[] f58562o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Display f58563r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float[] f58561n = new float[16];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float[] f58564t = new float[16];

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final float[] f58559O = new float[16];
    private final float[] J2 = new float[3];

    public interface Listener {
        void onOrientationChange(float[] fArr, float f3);
    }

    private static void O(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    private float n(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, this.f58564t);
        SensorManager.getOrientation(this.f58564t, this.J2);
        return this.J2[2];
    }

    private void nr(float[] fArr, int i2) {
        if (i2 != 0) {
            int i3 = 129;
            int i5 = 1;
            if (i2 == 1) {
                i5 = 129;
                i3 = 2;
            } else if (i2 == 2) {
                i5 = 130;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException();
                }
                i3 = 130;
            }
            float[] fArr2 = this.f58564t;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f58564t, i3, i5, fArr);
        }
    }

    private void rl(float[] fArr, float f3) {
        for (Listener listener : this.f58562o) {
            listener.onOrientationChange(fArr, f3);
        }
    }

    private void t(float[] fArr) {
        if (!this.f58560Z) {
            j.n(this.f58559O, fArr);
            this.f58560Z = true;
        }
        float[] fArr2 = this.f58564t;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f58564t, 0, this.f58559O, 0);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f58561n, sensorEvent.values);
        nr(this.f58561n, this.f58563r.getRotation());
        float fN = n(this.f58561n);
        O(this.f58561n);
        t(this.f58561n);
        rl(this.f58561n, fN);
    }

    public OrientationListener(Display display, Listener... listenerArr) {
        this.f58563r = display;
        this.f58562o = listenerArr;
    }
}
