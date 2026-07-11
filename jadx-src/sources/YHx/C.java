package YHx;

import java.nio.ByteBuffer;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class C {
    private int J2;
    private int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f12044n;
    private final Dsr rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final I28 f12045t = new I28(null, 0, null, 0, 0, 0, 0, 0, 0, 0.0d, 1023, null);
    private float[] nr = new float[0];

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float[] f12043O = new float[0];

    private final void Uo(boolean z2, int i2, int i3) {
        double d2 = ((double) i3) / ((double) i2);
        int iCeil = (int) Math.ceil(((double) this.J2) * d2);
        if (this.nr.length < iCeil) {
            this.nr = new float[iCeil];
        }
        this.f12045t.mUb(this.f12043O);
        this.f12045t.az(this.J2);
        this.f12045t.gh(this.nr);
        this.f12045t.HI(this.nr.length / this.f12044n);
        this.f12045t.Ik(d2);
        this.f12045t.qie(z2 ? 1 : 0);
        this.f12045t.ck(0L);
        this.f12045t.ty(0L);
        o.t(this.rl, this.f12045t);
        int iJ2 = (int) this.f12045t.J2();
        int i5 = this.J2;
        if (iJ2 >= i5) {
            this.J2 = 0;
        } else if (iJ2 > 0) {
            float[] fArr = this.f12043O;
            int i7 = this.f12044n;
            ArraysKt.copyInto(fArr, fArr, 0, iJ2 * i7, i5 * i7);
            this.J2 -= iJ2;
        }
        this.Uo = (int) this.f12045t.KN();
    }

    public C(int i2) {
        this.f12044n = i2;
        this.rl = o.rl(i2);
    }

    private final void J2(ByteBuffer byteBuffer, int i2, int i3, boolean z2, int i5, int i7) {
        int i8 = (this.J2 + i2) * this.f12044n;
        float[] fArr = this.f12043O;
        if (fArr.length < i8) {
            this.f12043O = ArraysKt.copyInto$default(fArr, new float[i8], 0, 0, 0, 14, (Object) null);
        }
        n(byteBuffer, i2, i3);
        float[] fArr2 = this.nr;
        float[] fArr3 = this.f12043O;
        int i9 = this.J2;
        int i10 = this.f12044n;
        ArraysKt.copyInto(fArr2, fArr3, i9 * i10, 0, i10 * i2);
        this.J2 += i2;
        Uo(z2, i5, i7);
    }

    private final void rl(int i2) {
        int i3 = i2 * this.f12044n;
        if (this.nr.length < i3) {
            this.nr = new float[i3];
        }
    }

    public final void KN() {
        o.nr(this.rl);
        this.Uo = 0;
        this.J2 = 0;
    }

    public final void O(ByteBuffer inputBuffer, int i2, int i3, boolean z2, int i5, int i7) {
        Intrinsics.checkNotNullParameter(inputBuffer, "inputBuffer");
        if (i5 == i7) {
            n(inputBuffer, i2, i3);
        } else {
            J2(inputBuffer, i2, i3, z2, i5, i7);
        }
    }

    public final int nr() {
        return this.Uo;
    }

    public final float[] t() {
        return this.nr;
    }

    private final void n(ByteBuffer byteBuffer, int i2, int i3) {
        rl(i2);
        this.Uo = i2;
        int i5 = this.f12044n;
        if (i3 == i5) {
            int i7 = i2 * i5;
            for (int i8 = 0; i8 < i7; i8++) {
                this.nr[i8] = byteBuffer.getShort(i8 * 2) / 32767.0f;
            }
            return;
        }
        for (int i9 = 0; i9 < i2; i9++) {
            int i10 = this.f12044n;
            for (int i11 = 0; i11 < i10; i11++) {
                this.nr[(this.f12044n * i9) + i11] = byteBuffer.getShort(((i9 * i3) + (i11 % i3)) * 2) / 32767.0f;
            }
        }
    }
}
