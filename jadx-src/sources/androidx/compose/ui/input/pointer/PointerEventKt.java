package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\t*\u00020\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u001d\u0010\u000e\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001e\u0010\u0012\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a$\u0010\u0016\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", c.f62177j, "(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z", "rl", "t", "nr", "mUb", "gh", "Landroidx/compose/ui/geometry/Offset;", "Uo", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)J", "KN", "ignoreConsumed", "xMQ", "(Landroidx/compose/ui/input/pointer/PointerInputChange;Z)J", "Landroidx/compose/ui/unit/IntSize;", "size", "O", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)Z", "Landroidx/compose/ui/geometry/Size;", "extendedTouchPadding", "J2", "(Landroidx/compose/ui/input/pointer/PointerInputChange;JJ)Z", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPointerEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerEvent.kt\nandroidx/compose/ui/input/pointer/PointerEventKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,1054:1\n1053#1:1065\n65#2:1055\n69#2:1058\n65#2:1066\n69#2:1069\n60#3:1056\n70#3:1059\n85#3:1062\n90#3:1064\n60#3:1067\n70#3:1070\n60#3:1073\n85#3:1076\n70#3:1078\n90#3:1081\n22#4:1057\n22#4:1060\n22#4:1068\n22#4:1071\n22#4:1074\n22#4:1079\n54#5:1061\n59#5:1063\n54#5:1075\n59#5:1080\n57#6:1072\n61#6:1077\n*S KotlinDebug\n*F\n+ 1 PointerEvent.kt\nandroidx/compose/ui/input/pointer/PointerEventKt\n*L\n1035#1:1065\n1017#1:1055\n1018#1:1058\n1038#1:1066\n1039#1:1069\n1017#1:1056\n1018#1:1059\n1019#1:1062\n1020#1:1064\n1038#1:1067\n1039#1:1070\n1042#1:1073\n1043#1:1076\n1046#1:1078\n1047#1:1081\n1017#1:1057\n1018#1:1060\n1038#1:1068\n1039#1:1071\n1042#1:1074\n1046#1:1079\n1019#1:1061\n1020#1:1063\n1043#1:1075\n1047#1:1080\n1042#1:1072\n1046#1:1077\n*E\n"})
public final class PointerEventKt {
    public static final long KN(PointerInputChange pointerInputChange) {
        return xMQ(pointerInputChange, true);
    }

    public static final long Uo(PointerInputChange pointerInputChange) {
        return xMQ(pointerInputChange, false);
    }

    public static final boolean gh(PointerInputChange pointerInputChange) {
        return !Offset.mUb(xMQ(pointerInputChange, true), Offset.INSTANCE.t());
    }

    public static final boolean mUb(PointerInputChange pointerInputChange) {
        return !Offset.mUb(xMQ(pointerInputChange, false), Offset.INSTANCE.t());
    }

    public static final boolean J2(PointerInputChange pointerInputChange, long j2, long j3) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean zKN = PointerType.KN(pointerInputChange.getType(), PointerType.INSTANCE.nr());
        long jKN = pointerInputChange.getPosition();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jKN >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jKN & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32));
        float f3 = zKN ? 1.0f : 0.0f;
        float f4 = fIntBitsToFloat3 * f3;
        float f5 = ((int) (j2 >> 32)) + f4;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * f3;
        float f6 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat4;
        boolean z5 = false;
        if (fIntBitsToFloat < (-f4)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (fIntBitsToFloat > f5) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z3 | z2;
        if (fIntBitsToFloat2 < (-fIntBitsToFloat4)) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z7 = z6 | z4;
        if (fIntBitsToFloat2 > f6) {
            z5 = true;
        }
        return z7 | z5;
    }

    public static final boolean O(PointerInputChange pointerInputChange, long j2) {
        boolean z2;
        boolean z3;
        boolean z4;
        long jKN = pointerInputChange.getPosition();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jKN >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jKN & 4294967295L));
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        boolean z5 = false;
        if (fIntBitsToFloat < 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (fIntBitsToFloat > i2) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z3 | z2;
        if (fIntBitsToFloat2 < 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z7 = z6 | z4;
        if (fIntBitsToFloat2 > i3) {
            z5 = true;
        }
        return z7 | z5;
    }

    public static final boolean n(PointerInputChange pointerInputChange) {
        if (!pointerInputChange.ck() && !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed()) {
            return true;
        }
        return false;
    }

    public static final boolean nr(PointerInputChange pointerInputChange) {
        if (pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed()) {
            return true;
        }
        return false;
    }

    public static final boolean rl(PointerInputChange pointerInputChange) {
        if (!pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed()) {
            return true;
        }
        return false;
    }

    public static final boolean t(PointerInputChange pointerInputChange) {
        if (!pointerInputChange.ck() && pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed()) {
            return true;
        }
        return false;
    }

    private static final long xMQ(PointerInputChange pointerInputChange, boolean z2) {
        long jCk = Offset.ck(pointerInputChange.getPosition(), pointerInputChange.getPreviousPosition());
        if (!z2 && pointerInputChange.ck()) {
            return Offset.INSTANCE.t();
        }
        return jCk;
    }
}
