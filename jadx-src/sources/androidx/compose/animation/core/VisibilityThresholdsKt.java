package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"4\u0010\r\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\"\u0015\u0010\u0012\u001a\u00020\u000f*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0015\u0010\u0012\u001a\u00020\u0014*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u0015\u0010\u0012\u001a\u00020\u0018*\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0019\"\u0015\u0010\u0012\u001a\u00020\u001b*\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u001c\"\u0015\u0010\u0012\u001a\u00020\u001e*\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u0015\u0010\u0012\u001a\u00020\"*\u00020!8F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u0015\u0010\u0012\u001a\u00020\u0000*\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Landroidx/compose/ui/geometry/Rect;", c.f62177j, "Landroidx/compose/ui/geometry/Rect;", "RectVisibilityThreshold", "", "Landroidx/compose/animation/core/TwoWayConverter;", "", "rl", "Ljava/util/Map;", "KN", "()Ljava/util/Map;", "getVisibilityThresholdMap$annotations", "()V", "VisibilityThresholdMap", "Landroidx/compose/ui/unit/IntOffset$Companion;", "Landroidx/compose/ui/unit/IntOffset;", "O", "(Landroidx/compose/ui/unit/IntOffset$Companion;)J", "VisibilityThreshold", "Landroidx/compose/ui/geometry/Offset$Companion;", "Landroidx/compose/ui/geometry/Offset;", "t", "(Landroidx/compose/ui/geometry/Offset$Companion;)J", "Lkotlin/Int$Companion;", "", "(Lkotlin/jvm/internal/IntCompanionObject;)I", "Landroidx/compose/ui/unit/Dp$Companion;", "Landroidx/compose/ui/unit/Dp;", "(Landroidx/compose/ui/unit/Dp$Companion;)F", "Landroidx/compose/ui/geometry/Size$Companion;", "Landroidx/compose/ui/geometry/Size;", "nr", "(Landroidx/compose/ui/geometry/Size$Companion;)J", "Landroidx/compose/ui/unit/IntSize$Companion;", "Landroidx/compose/ui/unit/IntSize;", "J2", "(Landroidx/compose/ui/unit/IntSize$Companion;)J", "Landroidx/compose/ui/geometry/Rect$Companion;", "Uo", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/ui/geometry/Rect;", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVisibilityThresholds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,115:1\n32#2:116\n80#3:117\n53#3,3:119\n53#3,3:124\n53#3,3:128\n80#3:132\n30#4:118\n123#5:122\n188#5:123\n33#6:127\n30#7:131\n*S KotlinDebug\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n*L\n40#1:116\n40#1:117\n48#1:119,3\n72#1:124,3\n80#1:128,3\n88#1:132\n48#1:118\n64#1:122\n72#1:123\n80#1:127\n88#1:131\n*E\n"})
public final class VisibilityThresholdsKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Rect f15776n;
    private static final Map rl;

    public static final long J2(IntSize.Companion companion) {
        long j2 = 1;
        return IntSize.t((j2 & 4294967295L) | (j2 << 32));
    }

    public static final long O(IntOffset.Companion companion) {
        long j2 = 1;
        return IntOffset.J2((j2 & 4294967295L) | (j2 << 32));
    }

    public static final int rl(IntCompanionObject intCompanionObject) {
        return 1;
    }

    static {
        Float fValueOf = Float.valueOf(0.5f);
        f15776n = new Rect(0.5f, 0.5f, 0.5f, 0.5f);
        TwoWayConverter twoWayConverterMUb = VectorConvertersKt.mUb(IntCompanionObject.INSTANCE);
        Float fValueOf2 = Float.valueOf(1.0f);
        Pair pair = TuplesKt.to(twoWayConverterMUb, fValueOf2);
        Pair pair2 = TuplesKt.to(VectorConvertersKt.KN(IntSize.INSTANCE), fValueOf2);
        Pair pair3 = TuplesKt.to(VectorConvertersKt.Uo(IntOffset.INSTANCE), fValueOf2);
        Pair pair4 = TuplesKt.to(VectorConvertersKt.xMQ(FloatCompanionObject.INSTANCE), Float.valueOf(0.01f));
        Pair pair5 = TuplesKt.to(VectorConvertersKt.t(Rect.INSTANCE), fValueOf);
        Pair pair6 = TuplesKt.to(VectorConvertersKt.nr(Size.INSTANCE), fValueOf);
        Pair pair7 = TuplesKt.to(VectorConvertersKt.rl(Offset.INSTANCE), fValueOf);
        TwoWayConverter twoWayConverterO = VectorConvertersKt.O(Dp.INSTANCE);
        Float fValueOf3 = Float.valueOf(0.1f);
        rl = MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, TuplesKt.to(twoWayConverterO, fValueOf3), TuplesKt.to(VectorConvertersKt.J2(DpOffset.INSTANCE), fValueOf3));
    }

    public static final Map KN() {
        return rl;
    }

    public static final Rect Uo(Rect.Companion companion) {
        return f15776n;
    }

    public static final long nr(Size.Companion companion) {
        return Size.nr((((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L));
    }

    public static final long t(Offset.Companion companion) {
        return Offset.O((((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L));
    }

    public static final float n(Dp.Companion companion) {
        return Dp.KN(0.1f);
    }
}
