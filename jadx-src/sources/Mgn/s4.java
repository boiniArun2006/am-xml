package Mgn;

import com.libsamplerate_kotlin.SRC_ERR_BAD_DATA_PTR;
import com.libsamplerate_kotlin.SRC_ERR_BAD_MODE;
import com.libsamplerate_kotlin.SRC_ERR_BAD_PROC_PTR;
import com.libsamplerate_kotlin.SRC_ERR_BAD_SRC_RATIO;
import com.libsamplerate_kotlin.SRC_ERR_BAD_STATE;
import java.nio.ByteBuffer;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class s4 {
    private float[] J2;
    private int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final eO f6675O;
    private float[] Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f6676n;
    private final l3D nr;
    private final Mgn.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final o f6677t;
    private int xMQ;

    private final void az(ByteBuffer byteBuffer, int i2, int i3, int i5, int i7) {
        int i8 = (i7 * i2) / i5;
        nr(i8);
        this.xMQ = i8;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.f6676n;
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = ((i9 * i2) / i8) * i3;
                int i13 = i12 * 3;
                this.J2[i12 + (i11 % i3)] = ((byteBuffer.get(i13 + 2) << 16) | ((byteBuffer.get(i13) & UByte.MAX_VALUE) | ((byteBuffer.get(i13 + 1) & UByte.MAX_VALUE) << 8))) / 8388607.0f;
            }
        }
    }

    private final void gh(boolean z2, int i2, int i3) throws SRC_ERR_BAD_SRC_RATIO, SRC_ERR_BAD_PROC_PTR, SRC_ERR_BAD_STATE, SRC_ERR_BAD_MODE, SRC_ERR_BAD_DATA_PTR {
        double d2 = ((double) i3) / ((double) i2);
        int iCeil = (int) Math.ceil(((double) this.KN) * d2);
        if (this.J2.length < iCeil) {
            this.J2 = new float[iCeil];
        }
        this.f6675O.gh(this.Uo);
        this.f6675O.ty(this.KN);
        this.f6675O.qie(this.J2);
        this.f6675O.ck(this.J2.length / this.f6676n);
        this.f6675O.r(d2);
        this.f6675O.az(z2 ? 1 : 0);
        this.f6675O.Ik(0L);
        this.f6675O.HI(0L);
        Q.t(this.nr, this.f6675O);
        int iUo = (int) this.f6675O.Uo();
        int i5 = this.KN;
        if (iUo >= i5) {
            this.KN = 0;
        } else if (iUo > 0) {
            float[] fArr = this.Uo;
            int i7 = this.f6676n;
            ArraysKt.copyInto(fArr, fArr, 0, iUo * i7, i5 * i7);
            this.KN -= iUo;
        }
        this.xMQ = (int) this.f6675O.xMQ();
    }

    private final void qie(ByteBuffer byteBuffer, int i2, int i3, int i5, int i7) {
        int i8 = (i7 * i2) / i5;
        nr(i8);
        this.xMQ = i8;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.f6676n;
            for (int i11 = 0; i11 < i10; i11++) {
                this.J2[(this.f6676n * i9) + i11] = byteBuffer.getShort(((((i9 * i2) / i8) * i3) + (i11 % i3)) * 2) / 32767.0f;
            }
        }
    }

    private final void ty(ByteBuffer byteBuffer, int i2, int i3, int i5, int i7) {
        int i8 = (i7 * i2) / i5;
        nr(i8);
        this.xMQ = i8;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.f6676n;
            for (int i11 = 0; i11 < i10; i11++) {
                this.J2[(this.f6676n * i9) + i11] = byteBuffer.get((((i9 * i2) / i8) * i3) + (i11 % i3)) / 255.0f;
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Hr.qz.values().length];
            try {
                iArr[Hr.qz.J2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Hr.qz.f3978t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Hr.qz.f3977r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public s4(int i2, Mgn.j conversionType) {
        Intrinsics.checkNotNullParameter(conversionType, "conversionType");
        this.f6676n = i2;
        this.rl = conversionType;
        o oVarRl = UGc.rl(conversionType);
        oVarRl = oVarRl == null ? o.f6656o : oVarRl;
        this.f6677t = oVarRl;
        this.nr = Q.rl(oVarRl, i2);
        this.f6675O = new eO(null, 0, null, 0, 0L, 0L, 0L, 0L, 0, 0.0d, 1023, null);
        this.J2 = new float[0];
        this.Uo = new float[0];
    }

    private final void nr(int i2) {
        int i3 = i2 * this.f6676n;
        if (this.J2.length < i3) {
            this.J2 = new float[i3];
        }
    }

    public final void HI() throws SRC_ERR_BAD_STATE {
        Q.nr(this.nr);
        this.xMQ = 0;
        this.KN = 0;
    }

    public final int J2() {
        return this.xMQ;
    }

    public final void KN(ByteBuffer byteBuffer, int i2, int i3, boolean z2, int i5, int i7) throws SRC_ERR_BAD_SRC_RATIO, SRC_ERR_BAD_PROC_PTR, SRC_ERR_BAD_STATE, SRC_ERR_BAD_MODE, SRC_ERR_BAD_DATA_PTR {
        Intrinsics.checkNotNullParameter(byteBuffer, dpcnwfoVOnrtRA.fjecUGqHA);
        int i8 = (this.KN + i2) * this.f6676n;
        float[] fArr = this.Uo;
        if (fArr.length < i8) {
            this.Uo = ArraysKt.copyInto$default(fArr, new float[i8], 0, 0, 0, 14, (Object) null);
        }
        n(byteBuffer, i2, i3);
        float[] fArr2 = this.J2;
        float[] fArr3 = this.Uo;
        int i9 = this.KN;
        int i10 = this.f6676n;
        ArraysKt.copyInto(fArr2, fArr3, i9 * i10, 0, i10 * i2);
        this.KN += i2;
        gh(z2, i5, i7);
    }

    public final float[] O() {
        return this.J2;
    }

    public final void Uo(ByteBuffer inputBuffer, Hr.qz inputFormat, int i2, int i3, boolean z2, int i5, int i7) throws SRC_ERR_BAD_SRC_RATIO, SRC_ERR_BAD_PROC_PTR, SRC_ERR_BAD_STATE, SRC_ERR_BAD_MODE, SRC_ERR_BAD_DATA_PTR {
        Intrinsics.checkNotNullParameter(inputBuffer, "inputBuffer");
        Intrinsics.checkNotNullParameter(inputFormat, "inputFormat");
        if (i5 == i7) {
            int i8 = j.$EnumSwitchMapping$0[inputFormat.ordinal()];
            if (i8 == 1) {
                t(inputBuffer, i2, i3);
                return;
            }
            if (i8 == 2) {
                n(inputBuffer, i2, i3);
                return;
            } else {
                if (i8 == 3) {
                    rl(inputBuffer, i2, i3);
                    return;
                }
                throw new UnsupportedOperationException("Sample Format: " + inputFormat);
            }
        }
        if (this.rl == Mgn.j.f6648n) {
            int i9 = j.$EnumSwitchMapping$0[inputFormat.ordinal()];
            if (i9 == 1) {
                ty(inputBuffer, i2, i3, i5, i7);
                return;
            }
            if (i9 == 2) {
                qie(inputBuffer, i2, i3, i5, i7);
                return;
            } else {
                if (i9 == 3) {
                    az(inputBuffer, i2, i3, i5, i7);
                    return;
                }
                throw new UnsupportedOperationException("Sample Format: " + inputFormat);
            }
        }
        int i10 = j.$EnumSwitchMapping$0[inputFormat.ordinal()];
        if (i10 == 1) {
            mUb(inputBuffer, i2, i3, z2, i5, i7);
            return;
        }
        if (i10 == 2) {
            KN(inputBuffer, i2, i3, z2, i5, i7);
        } else {
            if (i10 == 3) {
                xMQ(inputBuffer, i2, i3, z2, i5, i7);
                return;
            }
            throw new UnsupportedOperationException("Sample Format: " + inputFormat);
        }
    }

    public final void mUb(ByteBuffer inputBuffer, int i2, int i3, boolean z2, int i5, int i7) throws SRC_ERR_BAD_SRC_RATIO, SRC_ERR_BAD_PROC_PTR, SRC_ERR_BAD_STATE, SRC_ERR_BAD_MODE, SRC_ERR_BAD_DATA_PTR {
        Intrinsics.checkNotNullParameter(inputBuffer, "inputBuffer");
        int i8 = (this.KN + i2) * this.f6676n;
        float[] fArr = this.Uo;
        if (fArr.length < i8) {
            this.Uo = ArraysKt.copyInto$default(fArr, new float[i8], 0, 0, 0, 14, (Object) null);
        }
        t(inputBuffer, i2, i3);
        float[] fArr2 = this.J2;
        float[] fArr3 = this.Uo;
        int i9 = this.KN;
        int i10 = this.f6676n;
        ArraysKt.copyInto(fArr2, fArr3, i9 * i10, 0, i10 * i2);
        this.KN += i2;
        gh(z2, i5, i7);
    }

    public final void xMQ(ByteBuffer inputBuffer, int i2, int i3, boolean z2, int i5, int i7) throws SRC_ERR_BAD_SRC_RATIO, SRC_ERR_BAD_PROC_PTR, SRC_ERR_BAD_STATE, SRC_ERR_BAD_MODE, SRC_ERR_BAD_DATA_PTR {
        Intrinsics.checkNotNullParameter(inputBuffer, "inputBuffer");
        int i8 = (this.KN + i2) * this.f6676n;
        float[] fArr = this.Uo;
        if (fArr.length < i8) {
            this.Uo = ArraysKt.copyInto$default(fArr, new float[i8], 0, 0, 0, 14, (Object) null);
        }
        rl(inputBuffer, i2, i3);
        float[] fArr2 = this.J2;
        float[] fArr3 = this.Uo;
        int i9 = this.KN;
        int i10 = this.f6676n;
        ArraysKt.copyInto(fArr2, fArr3, i9 * i10, 0, i10 * i2);
        this.KN += i2;
        gh(z2, i5, i7);
    }

    private final void n(ByteBuffer byteBuffer, int i2, int i3) {
        nr(i2);
        this.xMQ = i2;
        int i5 = this.f6676n;
        if (i3 == i5) {
            int i7 = i2 * i5;
            for (int i8 = 0; i8 < i7; i8++) {
                this.J2[i8] = byteBuffer.getShort(i8 * 2) / 32767.0f;
            }
            return;
        }
        for (int i9 = 0; i9 < i2; i9++) {
            int i10 = this.f6676n;
            for (int i11 = 0; i11 < i10; i11++) {
                this.J2[(this.f6676n * i9) + i11] = byteBuffer.getShort(((i9 * i3) + (i11 % i3)) * 2) / 32767.0f;
            }
        }
    }

    private final void rl(ByteBuffer byteBuffer, int i2, int i3) {
        nr(i2);
        this.xMQ = i2;
        int i5 = this.f6676n;
        if (i3 == i5) {
            int i7 = i2 * i5;
            for (int i8 = 0; i8 < i7; i8++) {
                int i9 = i8 * 3;
                this.J2[i8] = ((byteBuffer.get(i9 + 2) << 16) | ((byteBuffer.get(i9) & UByte.MAX_VALUE) | ((byteBuffer.get(i9 + 1) & UByte.MAX_VALUE) << 8))) / 8388607.0f;
            }
            return;
        }
        for (int i10 = 0; i10 < i2; i10++) {
            int i11 = this.f6676n;
            for (int i12 = 0; i12 < i11; i12++) {
                this.J2[(this.f6676n * i10) + i12] = ((byteBuffer.getInt(((i10 * i3) + (i12 % i3)) * 3) >> 8) & 16777215) / 32767.0f;
            }
        }
    }

    private final void t(ByteBuffer byteBuffer, int i2, int i3) {
        nr(i2);
        this.xMQ = i2;
        int i5 = this.f6676n;
        if (i3 == i5) {
            int i7 = i2 * i5;
            for (int i8 = 0; i8 < i7; i8++) {
                this.J2[i8] = byteBuffer.get(i8) / 255.0f;
            }
            return;
        }
        for (int i9 = 0; i9 < i2; i9++) {
            int i10 = this.f6676n;
            for (int i11 = 0; i11 < i10; i11++) {
                this.J2[(this.f6676n * i9) + i11] = byteBuffer.get((i9 * i3) + (i11 % i3)) / 255.0f;
            }
        }
    }
}
