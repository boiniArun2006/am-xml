package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RequiresApi
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bc\u0018\u0000 \f2\u00020\u0001:\u0001\u001aJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H&ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/SideCalculator;", "", "Landroid/graphics/Insets;", "insets", "", "O", "(Landroid/graphics/Insets;)I", "", "x", "y", "rl", "(FF)F", c.f62177j, "nr", "oldInsets", "newValue", "t", "(Landroid/graphics/Insets;I)Landroid/graphics/Insets;", "Landroidx/compose/ui/geometry/Offset;", "available", "J2", "(J)J", "Landroidx/compose/ui/unit/Velocity;", "remaining", "Uo", "(JF)J", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
interface SideCalculator {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f17785n;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005*\u0004\u000b\u000f\u0013\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/SideCalculator$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "side", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/foundation/layout/SideCalculator;", c.f62177j, "(ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/foundation/layout/SideCalculator;", "androidx/compose/foundation/layout/SideCalculator$Companion$LeftSideCalculator$1", "rl", "Landroidx/compose/foundation/layout/SideCalculator$Companion$LeftSideCalculator$1;", "LeftSideCalculator", "androidx/compose/foundation/layout/SideCalculator$Companion$TopSideCalculator$1", "t", "Landroidx/compose/foundation/layout/SideCalculator$Companion$TopSideCalculator$1;", "TopSideCalculator", "androidx/compose/foundation/layout/SideCalculator$Companion$RightSideCalculator$1", "nr", "Landroidx/compose/foundation/layout/SideCalculator$Companion$RightSideCalculator$1;", "RightSideCalculator", "androidx/compose/foundation/layout/SideCalculator$Companion$BottomSideCalculator$1", "O", "Landroidx/compose/foundation/layout/SideCalculator$Companion$BottomSideCalculator$1;", "BottomSideCalculator", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f17785n = new Companion();

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private static final SideCalculator$Companion$LeftSideCalculator$1 LeftSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$LeftSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public float rl(float x2, float y2) {
                return x2;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public long J2(long available) {
                return Offset.O((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (available >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int O(Insets insets) {
                return insets.left;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public long Uo(long available, float remaining) {
                return VelocityKt.n(Velocity.KN(available) - remaining, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets t(Insets oldInsets, int newValue) {
                return Insets.of(newValue, oldInsets.top, oldInsets.right, oldInsets.bottom);
            }
        };

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private static final SideCalculator$Companion$TopSideCalculator$1 TopSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$TopSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public float rl(float x2, float y2) {
                return y2;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int O(Insets insets) {
                return insets.top;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public long Uo(long available, float remaining) {
                return VelocityKt.n(0.0f, Velocity.xMQ(available) - remaining);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets t(Insets oldInsets, int newValue) {
                return Insets.of(oldInsets.left, newValue, oldInsets.right, oldInsets.bottom);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public long J2(long available) {
                return Offset.O((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (available & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
            }
        };

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private static final SideCalculator$Companion$RightSideCalculator$1 RightSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$RightSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public float rl(float x2, float y2) {
                return -x2;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public long J2(long available) {
                return Offset.O((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (available >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int O(Insets insets) {
                return insets.right;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public long Uo(long available, float remaining) {
                return VelocityKt.n(Velocity.KN(available) + remaining, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets t(Insets oldInsets, int newValue) {
                return Insets.of(oldInsets.left, oldInsets.top, newValue, oldInsets.bottom);
            }
        };

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private static final SideCalculator$Companion$BottomSideCalculator$1 BottomSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$BottomSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public float rl(float x2, float y2) {
                return -y2;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int O(Insets insets) {
                return insets.bottom;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public long Uo(long available, float remaining) {
                return VelocityKt.n(0.0f, Velocity.xMQ(available) + remaining);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets t(Insets oldInsets, int newValue) {
                return Insets.of(oldInsets.left, oldInsets.top, oldInsets.right, newValue);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public long J2(long available) {
                return Offset.O((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (available & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
            }
        };

        public final SideCalculator n(int side, LayoutDirection layoutDirection) {
            WindowInsetsSides.Companion companion = WindowInsetsSides.INSTANCE;
            if (WindowInsetsSides.HI(side, companion.KN())) {
                return LeftSideCalculator;
            }
            if (WindowInsetsSides.HI(side, companion.gh())) {
                return TopSideCalculator;
            }
            if (WindowInsetsSides.HI(side, companion.xMQ())) {
                return RightSideCalculator;
            }
            if (WindowInsetsSides.HI(side, companion.O())) {
                return BottomSideCalculator;
            }
            if (WindowInsetsSides.HI(side, companion.mUb())) {
                return layoutDirection == LayoutDirection.f34160n ? LeftSideCalculator : RightSideCalculator;
            }
            if (WindowInsetsSides.HI(side, companion.J2())) {
                return layoutDirection == LayoutDirection.f34160n ? RightSideCalculator : LeftSideCalculator;
            }
            throw new IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed");
        }

        private Companion() {
        }
    }

    long J2(long available);

    int O(Insets insets);

    long Uo(long available, float remaining);

    float rl(float x2, float y2);

    Insets t(Insets oldInsets, int newValue);

    default float n(float x2, float y2) {
        return RangesKt.coerceAtLeast(rl(x2, y2), 0.0f);
    }

    default float nr(float x2, float y2) {
        return RangesKt.coerceAtMost(rl(x2, y2), 0.0f);
    }
}
