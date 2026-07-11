package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\u0002\u001a\"\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0016\u0010\u0011\u001a\u00020\u0004*\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0015\u001a\u00020\u0004*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"", "O", "(F)F", "offset", "", "J2", "(F)I", "KN", "(I)F", "gh", "", "consumed", "Landroidx/compose/ui/geometry/Offset;", "available", "xMQ", "([IJ)J", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "mUb", "(I)I", "Uo", "(J)I", "scrollAxes", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "NestedScrollInteropConnectionKt")
@SourceDebugExtension({"SMAP\nNestedScrollInteropConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,233:1\n65#2:234\n65#2:237\n65#2:240\n69#2:243\n69#2:246\n69#2:249\n65#2:256\n69#2:259\n60#3:235\n60#3:238\n60#3:241\n70#3:244\n70#3:247\n70#3:250\n53#3,3:253\n60#3:257\n70#3:260\n22#4:236\n22#4:239\n22#4:242\n22#4:245\n22#4:248\n22#4:251\n22#4:258\n22#4:261\n30#5:252\n75#6:262\n1247#7,6:263\n*S KotlinDebug\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n*L\n171#1:234\n172#1:237\n174#1:240\n178#1:243\n179#1:246\n181#1:249\n203#1:256\n206#1:259\n171#1:235\n172#1:238\n174#1:241\n178#1:244\n179#1:247\n181#1:250\n184#1:253,3\n203#1:257\n206#1:260\n171#1:236\n172#1:239\n174#1:242\n178#1:245\n179#1:248\n181#1:251\n203#1:258\n206#1:261\n184#1:252\n231#1:262\n232#1:263,6\n*E\n"})
public final class NestedScrollInteropConnectionKt {
    private static final float KN(int i2) {
        return i2 * (-1.0f);
    }

    private static final float O(float f3) {
        return (float) (f3 >= 0.0f ? Math.ceil(f3) : Math.floor(f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float gh(float f3) {
        return f3 * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Uo(long j2) {
        int i2 = Math.abs(Float.intBitsToFloat((int) (j2 >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j2 & 4294967295L))) >= 0.5f ? i2 | 2 : i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mUb(int i2) {
        return !NestedScrollSource.O(i2, NestedScrollSource.INSTANCE.rl()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long xMQ(int[] iArr, long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return Offset.O((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2) >= 0.0f ? RangesKt.coerceAtMost(KN(iArr[0]), Float.intBitsToFloat(i2)) : RangesKt.coerceAtLeast(KN(iArr[0]), Float.intBitsToFloat(i2)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i3) >= 0.0f ? RangesKt.coerceAtMost(KN(iArr[1]), Float.intBitsToFloat(i3)) : RangesKt.coerceAtLeast(KN(iArr[1]), Float.intBitsToFloat(i3)))) & 4294967295L));
    }

    public static final int J2(float f3) {
        return ((int) O(f3)) * (-1);
    }
}
