package androidx.core.view;

import android.view.MotionEvent;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
class VelocityTrackerFallback {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float[] f36763n = new float[20];
    private final long[] rl = new long[20];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f36764t = 0.0f;
    private int nr = 0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f36762O = 0;

    private static float J2(float f3) {
        return (f3 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f3) * 2.0f));
    }

    private void rl() {
        this.nr = 0;
        this.f36764t = 0.0f;
    }

    private float O() {
        long[] jArr;
        long j2;
        int i2 = this.nr;
        if (i2 < 2) {
            return 0.0f;
        }
        int i3 = this.f36762O;
        int i5 = ((i3 + 20) - (i2 - 1)) % 20;
        long j3 = this.rl[i3];
        while (true) {
            jArr = this.rl;
            j2 = jArr[i5];
            if (j3 - j2 <= 100) {
                break;
            }
            this.nr--;
            i5 = (i5 + 1) % 20;
        }
        int i7 = this.nr;
        if (i7 < 2) {
            return 0.0f;
        }
        if (i7 == 2) {
            int i8 = (i5 + 1) % 20;
            if (j2 == jArr[i8]) {
                return 0.0f;
            }
            return this.f36763n[i8] / (r2 - j2);
        }
        float fAbs = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < this.nr - 1; i10++) {
            int i11 = i10 + i5;
            long[] jArr2 = this.rl;
            long j4 = jArr2[i11 % 20];
            int i12 = (i11 + 1) % 20;
            if (jArr2[i12] != j4) {
                i9++;
                float fJ2 = J2(fAbs);
                float f3 = this.f36763n[i12] / (this.rl[i12] - j4);
                fAbs += (f3 - fJ2) * Math.abs(f3);
                if (i9 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return J2(fAbs);
    }

    float nr(int i2) {
        if (i2 != 26) {
            return 0.0f;
        }
        return this.f36764t;
    }

    VelocityTrackerFallback() {
    }

    void n(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.nr != 0 && eventTime - this.rl[this.f36762O] > 40) {
            rl();
        }
        int i2 = (this.f36762O + 1) % 20;
        this.f36762O = i2;
        int i3 = this.nr;
        if (i3 != 20) {
            this.nr = i3 + 1;
        }
        this.f36763n[i2] = motionEvent.getAxisValue(26);
        this.rl[this.f36762O] = eventTime;
    }

    void t(int i2, float f3) {
        float fO = O() * i2;
        this.f36764t = fO;
        if (fO < (-Math.abs(f3))) {
            this.f36764t = -Math.abs(f3);
        } else if (this.f36764t > Math.abs(f3)) {
            this.f36764t = Math.abs(f3);
        }
    }
}
