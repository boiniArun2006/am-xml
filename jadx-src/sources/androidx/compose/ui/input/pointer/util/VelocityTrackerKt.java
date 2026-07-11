package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.events.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0018\u001a3\u0010\t\u001a\u00020\b*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000e\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u001b\u0010\u0011\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000f\u001a9\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a/\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010 \u001a\u00020\u0006*\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010!\"0\u0010+\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b8G@GX\u0087\u000e¢\u0006\u0018\n\u0004\b#\u0010$\u0012\u0004\b)\u0010*\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(\"0\u00100\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b8G@GX\u0087\u000e¢\u0006\u0018\n\u0004\b,\u0010$\u0012\u0004\b/\u0010*\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(*\u0018\b\u0002\u00101\"\b\u0012\u0004\u0012\u00020\u00120\u00002\b\u0012\u0004\u0012\u00020\u00120\u0000*\f\b\u0002\u00102\"\u00020\u00122\u00020\u0012¨\u00063"}, d2 = {"", "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "", "index", "", "time", "", "dataPoint", "", "mUb", "([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", a.f62811a, "t", "(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "nr", "O", "", "x", "y", "sampleCount", "degree", "coefficients", "xMQ", "([F[FII[F)[F", "dataPoints", "", "isDataDifferential", "J2", "([F[FIZ)F", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "Uo", "([F[F)F", "<set-?>", c.f62177j, "Z", "getVelocityTrackerAddPointsFix", "()Z", "setVelocityTrackerAddPointsFix", "(Z)V", "getVelocityTrackerAddPointsFix$annotations", "()V", "VelocityTrackerAddPointsFix", "rl", "KN", "setVelocityTrackerStrategyUseImpulse", "getVelocityTrackerStrategyUseImpulse$annotations", "VelocityTrackerStrategyUseImpulse", "Matrix", "Vector", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,706:1\n662#1:719\n669#1,2:720\n665#1,6:722\n662#1:728\n662#1:729\n657#1:730\n644#1:732\n644#1:733\n34#2,6:707\n34#2,6:713\n69#3:731\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n*L\n481#1:719\n483#1:720,2\n485#1:722,6\n492#1:728\n494#1:729\n507#1:730\n629#1:732\n635#1:733\n383#1:707,6\n418#1:713,6\n507#1:731\n*E\n"})
public final class VelocityTrackerKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f32181n = true;
    private static boolean rl;

    private static final float Uo(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f3 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            f3 += fArr[i2] * fArr2[i2];
        }
        return f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float J2(float[] fArr, float[] fArr2, int i2, boolean z2) {
        int i3 = i2 - 1;
        float f3 = fArr2[i3];
        float fSignum = 0.0f;
        int i5 = i3;
        while (i5 > 0) {
            int i7 = i5 - 1;
            float f4 = fArr2[i7];
            if (f3 != f4) {
                float f5 = (z2 ? -fArr[i7] : fArr[i5] - fArr[i7]) / (f3 - f4);
                fSignum += (f5 - (Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum))))) * Math.abs(f5);
                if (i5 == i3) {
                    fSignum *= 0.5f;
                }
            }
            i5--;
            f3 = f4;
        }
        return Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum)));
    }

    public static final boolean KN() {
        return rl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(DataPointAtTime[] dataPointAtTimeArr, int i2, long j2, float f3) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i2];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i2] = new DataPointAtTime(j2, f3);
        } else {
            dataPointAtTime.nr(j2);
            dataPointAtTime.t(f3);
        }
    }

    public static final void t(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (f32181n) {
            O(velocityTracker, pointerInputChange);
        } else {
            nr(velocityTracker, pointerInputChange);
        }
    }

    public static final float[] xMQ(float[] fArr, float[] fArr2, int i2, int i3, float[] fArr3) {
        int i5 = i3;
        if (i5 < 1) {
            InlineClassHelperKt.n("The degree must be at positive integer");
        }
        if (i2 == 0) {
            InlineClassHelperKt.n("At least one point must be provided");
        }
        if (i5 >= i2) {
            i5 = i2 - 1;
        }
        int i7 = i5 + 1;
        float[][] fArr4 = new float[i7][];
        for (int i8 = 0; i8 < i7; i8++) {
            fArr4[i8] = new float[i2];
        }
        for (int i9 = 0; i9 < i2; i9++) {
            fArr4[0][i9] = 1.0f;
            for (int i10 = 1; i10 < i7; i10++) {
                fArr4[i10][i9] = fArr4[i10 - 1][i9] * fArr[i9];
            }
        }
        float[][] fArr5 = new float[i7][];
        for (int i11 = 0; i11 < i7; i11++) {
            fArr5[i11] = new float[i2];
        }
        float[][] fArr6 = new float[i7][];
        for (int i12 = 0; i12 < i7; i12++) {
            fArr6[i12] = new float[i7];
        }
        int i13 = 0;
        while (i13 < i7) {
            float[] fArr7 = fArr5[i13];
            ArraysKt.copyInto(fArr4[i13], fArr7, 0, 0, i2);
            for (int i14 = 0; i14 < i13; i14++) {
                float[] fArr8 = fArr5[i14];
                float fUo = Uo(fArr7, fArr8);
                for (int i15 = 0; i15 < i2; i15++) {
                    fArr7[i15] = fArr7[i15] - (fArr8[i15] * fUo);
                }
            }
            float fSqrt = (float) Math.sqrt(Uo(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f3 = 1.0f / fSqrt;
            for (int i16 = 0; i16 < i2; i16++) {
                fArr7[i16] = fArr7[i16] * f3;
            }
            float[] fArr9 = fArr6[i13];
            int i17 = 0;
            while (i17 < i7) {
                fArr9[i17] = i17 < i13 ? 0.0f : Uo(fArr7, fArr4[i17]);
                i17++;
            }
            i13++;
        }
        for (int i18 = i5; -1 < i18; i18--) {
            float fUo2 = Uo(fArr5[i18], fArr2);
            float[] fArr10 = fArr6[i18];
            int i19 = i18 + 1;
            if (i19 <= i5) {
                int i20 = i5;
                while (true) {
                    fUo2 -= fArr10[i20] * fArr3[i20];
                    if (i20 != i19) {
                        i20--;
                    }
                }
            }
            fArr3[i18] = fUo2 / fArr10[i18];
        }
        return fArr3;
    }

    private static final void O(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (PointerEventKt.rl(pointerInputChange)) {
            velocityTracker.J2();
        }
        if (!PointerEventKt.nr(pointerInputChange)) {
            List listO = pointerInputChange.O();
            int size = listO.size();
            for (int i2 = 0; i2 < size; i2++) {
                HistoricalChange historicalChange = (HistoricalChange) listO.get(i2);
                velocityTracker.n(historicalChange.getUptimeMillis(), historicalChange.getOriginalEventPosition());
            }
            velocityTracker.n(pointerInputChange.getUptimeMillis(), pointerInputChange.getOriginalEventPosition());
        }
        if (PointerEventKt.nr(pointerInputChange) && pointerInputChange.getUptimeMillis() - velocityTracker.getLastMoveEventTimeStamp() > 40) {
            velocityTracker.J2();
        }
        velocityTracker.KN(pointerInputChange.getUptimeMillis());
    }

    private static final void nr(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (PointerEventKt.rl(pointerInputChange)) {
            velocityTracker.Uo(pointerInputChange.getPosition());
            velocityTracker.J2();
        }
        long previousPosition = pointerInputChange.getPreviousPosition();
        List listO = pointerInputChange.O();
        int size = listO.size();
        int i2 = 0;
        while (i2 < size) {
            HistoricalChange historicalChange = (HistoricalChange) listO.get(i2);
            long jCk = Offset.ck(historicalChange.getPosition(), previousPosition);
            long position = historicalChange.getPosition();
            velocityTracker.Uo(Offset.Ik(velocityTracker.getCurrentPointerPositionAccumulator(), jCk));
            velocityTracker.n(historicalChange.getUptimeMillis(), velocityTracker.getCurrentPointerPositionAccumulator());
            i2++;
            previousPosition = position;
        }
        velocityTracker.Uo(Offset.Ik(velocityTracker.getCurrentPointerPositionAccumulator(), Offset.ck(pointerInputChange.getPosition(), previousPosition)));
        velocityTracker.n(pointerInputChange.getUptimeMillis(), velocityTracker.getCurrentPointerPositionAccumulator());
    }
}
