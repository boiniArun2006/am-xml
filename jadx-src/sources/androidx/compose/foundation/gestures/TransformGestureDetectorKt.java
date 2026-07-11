package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEvent;", "", "O", "(Landroidx/compose/ui/input/pointer/PointerEvent;)F", "Landroidx/compose/ui/geometry/Offset;", c.f62177j, "(J)F", "J2", "nr", "(Landroidx/compose/ui/input/pointer/PointerEvent;)J", "", "useCurrent", "t", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)F", "rl", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)J", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,255:1\n133#2,3:256\n34#2,6:259\n136#2:265\n34#2,6:266\n34#2,6:277\n34#2,6:283\n65#3:272\n69#3:275\n60#4:273\n70#4:276\n22#5:274\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n*L\n116#1:256,3\n116#1:259,6\n116#1:265\n131#1:266,6\n217#1:277,6\n242#1:283,6\n162#1:272\n162#1:275\n162#1:273\n162#1:276\n162#1:274\n*E\n"})
public final class TransformGestureDetectorKt {
    public static final float J2(PointerEvent pointerEvent) {
        float fT = t(pointerEvent, true);
        float fT2 = t(pointerEvent, false);
        if (fT == 0.0f || fT2 == 0.0f) {
            return 1.0f;
        }
        return fT / fT2;
    }

    public static final long nr(PointerEvent pointerEvent) {
        long jRl = rl(pointerEvent, true);
        Offset.Companion companion = Offset.INSTANCE;
        return Offset.mUb(jRl, companion.rl()) ? companion.t() : Offset.ck(jRl, rl(pointerEvent, false));
    }

    private static final float n(long j2) {
        if (Float.intBitsToFloat((int) (j2 >> 32)) == 0.0f && Float.intBitsToFloat((int) (j2 & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r0), Float.intBitsToFloat((int) (j2 & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    public static final long rl(PointerEvent pointerEvent, boolean z2) {
        long jT2 = Offset.INSTANCE.t();
        List changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            PointerInputChange pointerInputChange = (PointerInputChange) changes.get(i3);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                jT2 = Offset.Ik(jT2, z2 ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition());
                i2++;
            }
        }
        return i2 == 0 ? Offset.INSTANCE.rl() : Offset.KN(jT2, i2);
    }

    public static final float O(PointerEvent pointerEvent) {
        List changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i5 = 1;
            if (i2 >= size) {
                break;
            }
            PointerInputChange pointerInputChange = (PointerInputChange) changes.get(i2);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i5 = 0;
            }
            i3 += i5;
            i2++;
        }
        if (i3 < 2) {
            return 0.0f;
        }
        long jRl = rl(pointerEvent, true);
        long jRl2 = rl(pointerEvent, false);
        List changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        float f3 = 0.0f;
        float f4 = 0.0f;
        for (int i7 = 0; i7 < size2; i7++) {
            PointerInputChange pointerInputChange2 = (PointerInputChange) changes2.get(i7);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long position = pointerInputChange2.getPosition();
                long jCk = Offset.ck(pointerInputChange2.getPreviousPosition(), jRl2);
                long jCk2 = Offset.ck(position, jRl);
                float fN = n(jCk2) - n(jCk);
                float fGh = Offset.gh(Offset.Ik(jCk2, jCk)) / 2.0f;
                if (fN > 180.0f) {
                    fN -= 360.0f;
                } else if (fN < -180.0f) {
                    fN += 360.0f;
                }
                f4 += fN * fGh;
                f3 += fGh;
            }
        }
        if (f3 == 0.0f) {
            return 0.0f;
        }
        return f4 / f3;
    }

    public static final float t(PointerEvent pointerEvent, boolean z2) {
        long previousPosition;
        long jRl = rl(pointerEvent, z2);
        float fGh = 0.0f;
        if (Offset.mUb(jRl, Offset.INSTANCE.rl())) {
            return 0.0f;
        }
        List changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            PointerInputChange pointerInputChange = (PointerInputChange) changes.get(i3);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                if (z2) {
                    previousPosition = pointerInputChange.getPosition();
                } else {
                    previousPosition = pointerInputChange.getPreviousPosition();
                }
                fGh += Offset.gh(Offset.ck(previousPosition, jRl));
                i2++;
            }
        }
        return fGh / i2;
    }
}
