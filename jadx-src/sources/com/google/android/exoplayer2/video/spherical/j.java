package com.google.android.exoplayer2.video.spherical;

import android.opengl.Matrix;
import com.google.android.exoplayer2.util.TimedValueQueue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class j {
    private boolean nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float[] f58583n = new float[16];
    private final float[] rl = new float[16];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TimedValueQueue f58584t = new TimedValueQueue();

    public static void n(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f3 = fArr2[10];
        float f4 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f3 * f3) + (f4 * f4));
        float f5 = fArr2[10];
        fArr[0] = f5 / fSqrt;
        float f6 = fArr2[8];
        fArr[2] = f6 / fSqrt;
        fArr[8] = (-f6) / fSqrt;
        fArr[10] = f5 / fSqrt;
    }

    private static void rl(float[] fArr, float[] fArr2) {
        float f3 = fArr2[0];
        float f4 = -fArr2[1];
        float f5 = -fArr2[2];
        float length = Matrix.length(f3, f4, f5);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f3 / length, f4 / length, f5 / length);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
    }

    public void O(long j2, float[] fArr) {
        this.f58584t.add(j2, fArr);
    }

    public void nr() {
        this.f58584t.clear();
        this.nr = false;
    }

    public boolean t(float[] fArr, long j2) {
        float[] fArr2 = (float[]) this.f58584t.pollFloor(j2);
        if (fArr2 == null) {
            return false;
        }
        rl(this.rl, fArr2);
        if (!this.nr) {
            n(this.f58583n, this.rl);
            this.nr = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f58583n, 0, this.rl, 0);
        return true;
    }
}
