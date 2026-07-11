package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081@\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0002\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ;\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0007\u0010\u001e\u0088\u0001\u000f\u0092\u0001\u00020\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "", "", "mainAxisMin", "mainAxisMax", "crossAxisMin", "crossAxisMax", c.f62177j, "(IIII)J", "Landroidx/compose/ui/unit/Constraints;", "c", "Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "t", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)J", "value", "rl", "(J)J", "KN", "nr", "(JIIII)J", "", "xMQ", "(J)Ljava/lang/String;", "Uo", "(J)I", InneractiveMediationNameConsts.OTHER, "", "J2", "(JLjava/lang/Object;)Z", "J", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,707:1\n210#1:708\n213#1:709\n219#1:710\n216#1:711\n219#1:712\n210#1,10:713\n216#1,4:723\n210#1,4:727\n213#1:731\n219#1:732\n219#1:733\n213#1:734\n210#1:735\n213#1:736\n216#1:737\n219#1:738\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n248#1:708\n249#1:709\n250#1:710\n250#1:711\n251#1:712\n257#1:713,10\n259#1:723,4\n259#1:727,4\n265#1:731\n267#1:732\n273#1:733\n275#1:734\n279#1:735\n280#1:736\n281#1:737\n282#1:738\n*E\n"})
public final class OrientationIndependentConstraints {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long value;

    public static boolean J2(long j2, Object obj) {
        return (obj instanceof OrientationIndependentConstraints) && Constraints.J2(j2, ((OrientationIndependentConstraints) obj).getValue());
    }

    public static int Uo(long j2) {
        return Constraints.HI(j2);
    }

    private static long rl(long j2) {
        return j2;
    }

    public static String xMQ(long j2) {
        return "OrientationIndependentConstraints(value=" + ((Object) Constraints.Ik(j2)) + ')';
    }

    public boolean equals(Object obj) {
        return J2(this.value, obj);
    }

    public int hashCode() {
        return Uo(this.value);
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    public String toString() {
        return xMQ(this.value);
    }

    public static final long KN(long j2, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.f17704n ? ConstraintsKt.n(Constraints.ty(j2), Constraints.qie(j2), Constraints.az(j2), Constraints.gh(j2)) : ConstraintsKt.n(Constraints.az(j2), Constraints.gh(j2), Constraints.ty(j2), Constraints.qie(j2));
    }

    public static /* synthetic */ long O(long j2, int i2, int i3, int i5, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i2 = Constraints.ty(j2);
        }
        int i9 = i2;
        if ((i8 & 2) != 0) {
            i3 = Constraints.qie(j2);
        }
        int i10 = i3;
        if ((i8 & 4) != 0) {
            i5 = Constraints.az(j2);
        }
        int i11 = i5;
        if ((i8 & 8) != 0) {
            i7 = Constraints.gh(j2);
        }
        return nr(j2, i9, i10, i11, i7);
    }

    public static long t(long j2, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.f17704n;
        return n(layoutOrientation == layoutOrientation2 ? Constraints.ty(j2) : Constraints.az(j2), layoutOrientation == layoutOrientation2 ? Constraints.qie(j2) : Constraints.gh(j2), layoutOrientation == layoutOrientation2 ? Constraints.az(j2) : Constraints.ty(j2), layoutOrientation == layoutOrientation2 ? Constraints.gh(j2) : Constraints.qie(j2));
    }

    public static long n(int i2, int i3, int i5, int i7) {
        return rl(ConstraintsKt.n(i2, i3, i5, i7));
    }

    public static final long nr(long j2, int i2, int i3, int i5, int i7) {
        return n(i2, i3, i5, i7);
    }
}
