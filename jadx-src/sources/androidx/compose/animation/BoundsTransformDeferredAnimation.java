package androidx.compose.animation;

import GJW.C;
import GJW.h;
import GJW.vd;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\bJ \u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u001c\u0010%\u001a\u00020\u00108\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010*\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b+\u0010$R(\u00100\u001a\u00020\u00108\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b-\u0010$\u001a\u0004\b(\u0010.\"\u0004\b/\u0010\bR/\u00106\u001a\u0004\u0018\u00010\r2\b\u00101\u001a\u0004\u0018\u00010\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b#\u00104\"\u0004\b2\u00105R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00109R\u001c\u0010;\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0013\u0010<\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b&\u00104R\u0011\u0010>\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b-\u0010=R\u0013\u0010?\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b+\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"Landroidx/compose/animation/BoundsTransformDeferredAnimation;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Offset;", "offset", "", "xMQ", "(J)V", "LGJW/vd;", "coroutineScope", "Landroidx/compose/animation/BoundsTransform;", "boundsTransform", "Landroidx/compose/ui/geometry/Rect;", c.f62177j, "(LGJW/vd;Landroidx/compose/animation/BoundsTransform;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/Size;", "size", "gh", "position", "KN", "(JJ)V", "Landroidx/compose/ui/layout/LookaheadScope;", "lookaheadScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementScope", "", "directManipulationParentsDirty", "includeMotionFrameOfReference", "mUb", "(Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/ui/layout/Placeable$PlacementScope;LGJW/vd;ZZLandroidx/compose/animation/BoundsTransform;)V", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector4D;", "Landroidx/compose/animation/core/Animatable;", "animatable", "rl", "J", "targetSize", "t", "targetOffset", "nr", "Z", "isPending", "O", "currentPosition", "J2", "()J", "setCurrentSize-uvyYCjk", "currentSize", "<set-?>", "Uo", "Landroidx/compose/runtime/MutableState;", "()Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/geometry/Rect;)V", "animatedValue", "", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Ljava/util/List;", "directManipulationParents", "additionalOffset", "currentBounds", "()Z", "isIdle", "value", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimateBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/BoundsTransformDeferredAnimation\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,444:1\n148#2:445\n153#2:446\n148#2:450\n148#2:456\n273#3:447\n278#3:448\n273#3:449\n273#3:455\n85#4:451\n113#4,2:452\n150#5:454\n*S KotlinDebug\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/BoundsTransformDeferredAnimation\n*L\n295#1:445\n301#1:446\n329#1:450\n414#1:456\n311#1:447\n316#1:448\n329#1:449\n414#1:455\n344#1:451\n344#1:452,2\n405#1:454\n*E\n"})
public final class BoundsTransformDeferredAnimation {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private long currentSize;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private List directManipulationParents;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private long currentPosition;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final MutableState animatedValue;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Animatable animatable;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private boolean isPending;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private long targetSize;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long targetOffset;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private long additionalOffset;

    private final void Uo(Rect rect) {
        this.animatedValue.setValue(rect);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Rect n(vd coroutineScope, BoundsTransform boundsTransform) {
        BoundsTransformDeferredAnimation boundsTransformDeferredAnimation;
        Rect rect;
        long j2 = this.targetOffset;
        if ((9223372034707292159L & j2) != 9205357640488583168L) {
            long j3 = this.targetSize;
            if (j3 != 9205357640488583168L) {
                Rect rectT = RectKt.t(j2, j3);
                Animatable animatable = this.animatable;
                if (animatable == null) {
                    animatable = new Animatable(rectT, VectorConvertersKt.t(Rect.INSTANCE), null, null, 12, null);
                }
                this.animatable = animatable;
                if (this.isPending) {
                    this.isPending = false;
                    h hVar = h.J2;
                    BoundsTransformDeferredAnimation$animate$1 boundsTransformDeferredAnimation$animate$1 = new BoundsTransformDeferredAnimation$animate$1(animatable, rectT, boundsTransform, this, null);
                    boundsTransformDeferredAnimation = this;
                    C.nr(coroutineScope, null, hVar, boundsTransformDeferredAnimation$animate$1, 1, null);
                } else {
                    boundsTransformDeferredAnimation = this;
                }
            }
        }
        Animatable animatable2 = boundsTransformDeferredAnimation.animatable;
        return (animatable2 == null || (rect = (Rect) animatable2.ty()) == null) ? Rect.INSTANCE.n() : rect;
    }

    private final Rect rl() {
        return (Rect) this.animatedValue.getValue();
    }

    private final void xMQ(long offset) {
        if ((this.targetOffset & 9223372034707292159L) != 9205357640488583168L && !IntOffset.mUb(IntOffsetKt.nr(offset), IntOffsetKt.nr(this.targetOffset))) {
            this.isPending = true;
        }
        this.targetOffset = offset;
        if ((this.currentPosition & 9223372034707292159L) == 9205357640488583168L) {
            this.currentPosition = offset;
        }
    }

    public final boolean J2() {
        if (this.isPending) {
            return false;
        }
        Animatable animatable = this.animatable;
        return animatable == null || !animatable.Ik();
    }

    public final void KN(long position, long size) {
        this.currentPosition = position;
        this.currentSize = size;
    }

    public final void gh(long size) {
        if (this.targetSize != 9205357640488583168L && !IntSize.O(IntSizeKt.t(size), IntSizeKt.t(this.targetSize))) {
            this.isPending = true;
        }
        this.targetSize = size;
        if (this.currentSize == 9205357640488583168L) {
            this.currentSize = size;
        }
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final long getCurrentSize() {
        return this.currentSize;
    }

    public final Rect t() {
        long j2 = this.currentSize;
        long j3 = this.currentPosition;
        if ((9223372034707292159L & j3) == 9205357640488583168L || j2 == 9205357640488583168L) {
            return null;
        }
        return RectKt.t(j3, j2);
    }

    public BoundsTransformDeferredAnimation() {
        Size.Companion companion = Size.INSTANCE;
        this.targetSize = companion.n();
        Offset.Companion companion2 = Offset.INSTANCE;
        this.targetOffset = companion2.rl();
        this.currentPosition = companion2.rl();
        this.currentSize = companion.n();
        this.animatedValue = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
        this.additionalOffset = companion2.t();
    }

    public final Rect O() {
        if (J2()) {
            return null;
        }
        return rl();
    }

    public final void mUb(LookaheadScope lookaheadScope, Placeable.PlacementScope placementScope, vd coroutineScope, boolean directManipulationParentsDirty, boolean includeMotionFrameOfReference, BoundsTransform boundsTransform) {
        LayoutCoordinates layoutCoordinatesNr = placementScope.nr();
        if (layoutCoordinatesNr != null) {
            LayoutCoordinates layoutCoordinatesO = lookaheadScope.o(placementScope);
            long jT2 = Offset.INSTANCE.t();
            if (!includeMotionFrameOfReference && directManipulationParentsDirty) {
                List arrayList = this.directManipulationParents;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                int i2 = 0;
                LayoutCoordinates layoutCoordinatesV = layoutCoordinatesNr;
                while (!Intrinsics.areEqual(lookaheadScope.r(layoutCoordinatesV), layoutCoordinatesO)) {
                    if (layoutCoordinatesV.fD()) {
                        if (arrayList.size() == i2) {
                            arrayList.add(layoutCoordinatesV);
                            jT2 = Offset.Ik(jT2, LayoutCoordinatesKt.O(layoutCoordinatesV));
                        } else if (!Intrinsics.areEqual(arrayList.get(i2), layoutCoordinatesV)) {
                            long jCk = Offset.ck(jT2, LayoutCoordinatesKt.O((LayoutCoordinates) arrayList.get(i2)));
                            arrayList.set(i2, layoutCoordinatesV);
                            jT2 = Offset.Ik(jCk, LayoutCoordinatesKt.O(layoutCoordinatesV));
                        }
                        i2++;
                    }
                    layoutCoordinatesV = layoutCoordinatesV.v();
                    if (layoutCoordinatesV == null) {
                        break;
                    }
                }
                int size = arrayList.size() - 1;
                if (i2 <= size) {
                    while (true) {
                        jT2 = Offset.ck(jT2, LayoutCoordinatesKt.O((LayoutCoordinates) arrayList.get(size)));
                        arrayList.remove(arrayList.size() - 1);
                        if (size == i2) {
                            break;
                        } else {
                            size--;
                        }
                    }
                }
                this.directManipulationParents = arrayList;
            }
            this.additionalOffset = Offset.Ik(this.additionalOffset, jT2);
            xMQ(Offset.Ik(LookaheadScope.nr(lookaheadScope, layoutCoordinatesO, layoutCoordinatesNr, 0L, includeMotionFrameOfReference, 2, null), this.additionalOffset));
            Uo(n(coroutineScope, boundsTransform).te(Offset.O(this.additionalOffset ^ (-9223372034707292160L))));
        }
    }
}
