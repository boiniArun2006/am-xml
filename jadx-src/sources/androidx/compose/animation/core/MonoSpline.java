package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u001e"}, d2 = {"Landroidx/compose/animation/core/MonoSpline;", "", "", "time", "", "y", "", "periodicBias", "<init>", "([F[[FF)V", "", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "nr", "(II)[[F", "v", "", "t", "(F[F)V", "Landroidx/compose/animation/core/AnimationVector;", "index", c.f62177j, "(FLandroidx/compose/animation/core/AnimationVector;I)V", "rl", "[F", "timePoints", "[[F", IV8ValueMap.FUNCTION_VALUES, "tangents", "slopeTemp", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMonoSpline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonoSpline.kt\nandroidx/compose/animation/core/MonoSpline\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,303:1\n65#2,10:304\n65#2,10:314\n*S KotlinDebug\n*F\n+ 1 MonoSpline.kt\nandroidx/compose/animation/core/MonoSpline\n*L\n176#1:304,10\n244#1:314,10\n*E\n"})
public final class MonoSpline {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final float[] timePoints;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final float[] slopeTemp;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final float[][] values;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final float[][] tangents;

    public MonoSpline(float[] fArr, float[][] fArr2, float f3) {
        int i2;
        int length = fArr.length;
        int i3 = 0;
        int length2 = fArr2[0].length;
        this.slopeTemp = new float[length2];
        int i5 = length - 1;
        float[][] fArrNr = nr(i5, length2);
        float[][] fArrNr2 = nr(length, length2);
        for (int i7 = 0; i7 < length2; i7++) {
            int i8 = 0;
            while (i8 < i5) {
                int i9 = i8 + 1;
                float f4 = fArr[i9] - fArr[i8];
                float[] fArr3 = fArrNr[i8];
                float f5 = (fArr2[i9][i7] - fArr2[i8][i7]) / f4;
                fArr3[i7] = f5;
                if (i8 == 0) {
                    fArrNr2[i8][i7] = f5;
                } else {
                    fArrNr2[i8][i7] = (fArrNr[i8 - 1][i7] + f5) * 0.5f;
                }
                i8 = i9;
            }
            fArrNr2[i5][i7] = fArrNr[length - 2][i7];
        }
        if (!Float.isNaN(f3)) {
            for (int i10 = 0; i10 < length2; i10++) {
                float[] fArr4 = fArrNr[length - 2];
                float f6 = fArr4[i10] * (1 - f3);
                float[] fArr5 = fArrNr[0];
                float f7 = f6 + (fArr5[i10] * f3);
                fArr5[i10] = f7;
                fArr4[i10] = f7;
                fArrNr2[i5][i10] = f7;
                fArrNr2[0][i10] = f7;
            }
        }
        int i11 = 0;
        while (i11 < i5) {
            int i12 = i3;
            while (i12 < length2) {
                float f8 = fArrNr[i11][i12];
                if (f8 == 0.0f) {
                    fArrNr2[i11][i12] = 0.0f;
                    fArrNr2[i11 + 1][i12] = 0.0f;
                    i2 = length2;
                } else {
                    float f9 = fArrNr2[i11][i12] / f8;
                    int i13 = i11 + 1;
                    float f10 = fArrNr2[i13][i12] / f8;
                    i2 = length2;
                    float fHypot = (float) Math.hypot(f9, f10);
                    if (fHypot > 9.0d) {
                        float f11 = 3.0f / fHypot;
                        float[] fArr6 = fArrNr2[i11];
                        float[] fArr7 = fArrNr[i11];
                        fArr6[i12] = f9 * f11 * fArr7[i12];
                        fArrNr2[i13][i12] = f11 * f10 * fArr7[i12];
                    }
                }
                i12++;
                length2 = i2;
            }
            i11++;
            i3 = 0;
        }
        this.timePoints = fArr;
        this.values = fArr2;
        this.tangents = fArrNr2;
    }

    private final float[][] nr(int a2, int b2) {
        float[][] fArr = new float[a2][];
        for (int i2 = 0; i2 < a2; i2++) {
            fArr[i2] = new float[b2];
        }
        return fArr;
    }

    private final void t(float time, float[] v2) {
        int length = this.values[0].length;
        float[] fArr = this.timePoints;
        int length2 = fArr.length;
        float f3 = fArr[0];
        int i2 = length2 - 1;
        float f4 = fArr[i2];
        if (time < f3) {
            time = f3;
        }
        if (time <= f4) {
            f4 = time;
        }
        if (v2.length < length) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            float[] fArr2 = this.timePoints;
            int i5 = i3 + 1;
            float f5 = fArr2[i5];
            if (f4 <= f5) {
                float f6 = fArr2[i3];
                float f7 = f5 - f6;
                float f8 = (f4 - f6) / f7;
                for (int i7 = 0; i7 < length; i7++) {
                    float[][] fArr3 = this.values;
                    float f9 = fArr3[i3][i7];
                    float f10 = fArr3[i5][i7];
                    float[][] fArr4 = this.tangents;
                    v2[i7] = MonoSplineKt.n(f7, f8, f9, f10, fArr4[i3][i7], fArr4[i5][i7]) / f7;
                }
                return;
            }
            i3 = i5;
        }
    }

    public final void n(float time, AnimationVector v2, int index) {
        int i2;
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int i3 = 0;
        int length2 = this.values[0].length;
        if (time <= fArr[0]) {
            i2 = 0;
        } else {
            i2 = length - 1;
            if (time < fArr[i2]) {
                i2 = -1;
            }
        }
        if (i2 != -1) {
            t(fArr[i2], this.slopeTemp);
            while (i3 < length2) {
                v2.O(i3, this.values[i2][i3] + ((time - this.timePoints[i2]) * this.slopeTemp[i3]));
                i3++;
            }
            return;
        }
        int i5 = length - 1;
        int i7 = index;
        while (i7 < i5) {
            float[] fArr2 = this.timePoints;
            float f3 = fArr2[i7];
            if (time == f3) {
                while (i3 < length2) {
                    v2.O(i3, this.values[i7][i3]);
                    i3++;
                }
                return;
            }
            int i8 = i7 + 1;
            float f4 = fArr2[i8];
            if (time < f4) {
                float f5 = f4 - f3;
                float f6 = (time - f3) / f5;
                while (i3 < length2) {
                    float[][] fArr3 = this.values;
                    float f7 = fArr3[i7][i3];
                    float f8 = fArr3[i8][i3];
                    float[][] fArr4 = this.tangents;
                    v2.O(i3, MonoSplineKt.rl(f5, f6, f7, f8, fArr4[i7][i3], fArr4[i8][i3]));
                    i3++;
                }
                return;
            }
            i7 = i8;
        }
    }

    public final void rl(float time, AnimationVector v2, int index) {
        int i2;
        float[] fArr = this.timePoints;
        float[][] fArr2 = this.values;
        float[][] fArr3 = this.tangents;
        int length = fArr.length;
        int i3 = 0;
        int length2 = fArr2[0].length;
        if (time <= fArr[0]) {
            i2 = 0;
        } else {
            i2 = length - 1;
            if (time < fArr[i2]) {
                i2 = -1;
            }
        }
        if (i2 != -1) {
            float[] fArr4 = fArr3[i2];
            if (fArr4.length < length2) {
                return;
            }
            while (i3 < length2) {
                v2.O(i3, fArr4[i3]);
                i3++;
            }
            return;
        }
        int i5 = length - 1;
        int i7 = index;
        while (i7 < i5) {
            int i8 = i7 + 1;
            float f3 = fArr[i8];
            if (time <= f3) {
                float f4 = fArr[i7];
                float f5 = f3 - f4;
                float f6 = (time - f4) / f5;
                while (i3 < length2) {
                    v2.O(i3, MonoSplineKt.n(f5, f6, fArr2[i7][i3], fArr2[i8][i3], fArr3[i7][i3], fArr3[i8][i3]) / f5);
                    i3++;
                }
                return;
            }
            i7 = i8;
        }
    }
}
