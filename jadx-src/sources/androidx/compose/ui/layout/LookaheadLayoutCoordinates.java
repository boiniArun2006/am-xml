package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u001a\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\tJ\u001a\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\tJ\u001a\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\tJ\"\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010)\u001a\u00020\u00068BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010-\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001a\u0010/\u001a\u00020.8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b#\u0010(R\u0016\u00102\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u00104\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00101R\u0014\u00107\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00106\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, d2 = {"Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadDelegate", "<init>", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "Landroidx/compose/ui/geometry/Offset;", "relativeToScreen", "r", "(J)J", "relativeToLocal", "aYN", "relativeToWindow", "jB", "B", "xg", "sourceCoordinates", "relativeToSource", "nHg", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "", "includeMotionFrameOfReference", "e", "(Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "clipBounds", "Landroidx/compose/ui/geometry/Rect;", "I", "(Landroidx/compose/ui/layout/LayoutCoordinates;Z)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "", "U", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "([F)V", c.f62177j, "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "t", "()J", "lookaheadOffset", "Landroidx/compose/ui/node/NodeCoordinator;", "rl", "()Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Landroidx/compose/ui/unit/IntSize;", "size", "piY", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "v", "parentCoordinates", "nr", "()Z", "isAttached", "fD", "introducesMotionFrameOfReference", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLookaheadLayoutCoordinates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinates\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,201:1\n1#2:202\n30#3:203\n80#4:204\n53#4,3:217\n53#4,3:222\n53#4,3:227\n56#5,5:205\n56#5,5:210\n159#6:215\n159#6:220\n159#6:225\n30#7:216\n30#7:221\n30#7:226\n*S KotlinDebug\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinates\n*L\n35#1:203\n35#1:204\n116#1:217,3\n135#1:222,3\n155#1:227,3\n42#1:205,5\n50#1:210,5\n116#1:215\n135#1:220\n155#1:225\n116#1:216\n135#1:221\n155#1:226\n*E\n"})
public final class LookaheadLayoutCoordinates implements LayoutCoordinates {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LookaheadDelegate lookaheadDelegate;

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long nHg(LayoutCoordinates sourceCoordinates, long relativeToSource) {
        return e(sourceCoordinates, relativeToSource, true);
    }

    private final long t() {
        LookaheadDelegate lookaheadDelegateN = LookaheadLayoutCoordinatesKt.n(this.lookaheadDelegate);
        LayoutCoordinates layoutCoordinatesZmq = lookaheadDelegateN.Zmq();
        Offset.Companion companion = Offset.INSTANCE;
        return Offset.ck(nHg(layoutCoordinatesZmq, companion.t()), rl().nHg(lookaheadDelegateN.getCoordinator(), companion.t()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long e(LayoutCoordinates sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        if (!(sourceCoordinates instanceof LookaheadLayoutCoordinates)) {
            LookaheadDelegate lookaheadDelegateN = LookaheadLayoutCoordinatesKt.n(this.lookaheadDelegate);
            long jE = e(lookaheadDelegateN.getLookaheadLayoutCoordinates(), relativeToSource, includeMotionFrameOfReference);
            long position = lookaheadDelegateN.getPosition();
            float fGh = IntOffset.gh(position);
            long jCk = Offset.ck(jE, Offset.O((4294967295L & ((long) Float.floatToRawIntBits(IntOffset.qie(position)))) | (Float.floatToRawIntBits(fGh) << 32)));
            LayoutCoordinates layoutCoordinatesV = lookaheadDelegateN.getCoordinator().v();
            if (layoutCoordinatesV == null) {
                layoutCoordinatesV = lookaheadDelegateN.getCoordinator().Zmq();
            }
            return Offset.Ik(jCk, layoutCoordinatesV.e(sourceCoordinates, Offset.INSTANCE.t(), includeMotionFrameOfReference));
        }
        LookaheadDelegate lookaheadDelegate = ((LookaheadLayoutCoordinates) sourceCoordinates).lookaheadDelegate;
        lookaheadDelegate.getCoordinator().Vd();
        LookaheadDelegate lookaheadDelegateRR = rl().lRt(lookaheadDelegate.getCoordinator()).getLookaheadDelegate();
        if (lookaheadDelegateRR != null) {
            long jTy = IntOffset.ty(IntOffset.HI(lookaheadDelegate.t1J(lookaheadDelegateRR, !includeMotionFrameOfReference), IntOffsetKt.nr(relativeToSource)), this.lookaheadDelegate.t1J(lookaheadDelegateRR, !includeMotionFrameOfReference));
            return Offset.O((((long) Float.floatToRawIntBits(IntOffset.gh(jTy))) << 32) | (((long) Float.floatToRawIntBits(IntOffset.qie(jTy))) & 4294967295L));
        }
        LookaheadDelegate lookaheadDelegateN2 = LookaheadLayoutCoordinatesKt.n(lookaheadDelegate);
        long jHI = IntOffset.HI(IntOffset.HI(lookaheadDelegate.t1J(lookaheadDelegateN2, !includeMotionFrameOfReference), lookaheadDelegateN2.getPosition()), IntOffsetKt.nr(relativeToSource));
        LookaheadDelegate lookaheadDelegateN3 = LookaheadLayoutCoordinatesKt.n(this.lookaheadDelegate);
        long jTy2 = IntOffset.ty(jHI, IntOffset.HI(this.lookaheadDelegate.t1J(lookaheadDelegateN3, !includeMotionFrameOfReference), lookaheadDelegateN3.getPosition()));
        float fGh2 = IntOffset.gh(jTy2);
        long jO = Offset.O((((long) Float.floatToRawIntBits(IntOffset.qie(jTy2))) & 4294967295L) | (Float.floatToRawIntBits(fGh2) << 32));
        NodeCoordinator wrappedBy = lookaheadDelegateN3.getCoordinator().getWrappedBy();
        Intrinsics.checkNotNull(wrappedBy);
        NodeCoordinator wrappedBy2 = lookaheadDelegateN2.getCoordinator().getWrappedBy();
        Intrinsics.checkNotNull(wrappedBy2);
        return wrappedBy.e(wrappedBy2, jO, includeMotionFrameOfReference);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean fD() {
        return this.lookaheadDelegate.getIsPlacedUnderMotionFrameOfReference();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long n() {
        LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        return IntSize.t((((long) lookaheadDelegate.getWidth()) << 32) | (((long) lookaheadDelegate.getHeight()) & 4294967295L));
    }

    public final NodeCoordinator rl() {
        return this.lookaheadDelegate.getCoordinator();
    }

    public LookaheadLayoutCoordinates(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long B(long relativeToLocal) {
        return rl().B(Offset.Ik(relativeToLocal, t()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Rect I(LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        return rl().I(sourceCoordinates, clipBounds);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public void U(LayoutCoordinates sourceCoordinates, float[] matrix) {
        rl().U(sourceCoordinates, matrix);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public void a(float[] matrix) {
        rl().a(matrix);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long aYN(long relativeToLocal) {
        return rl().aYN(Offset.Ik(relativeToLocal, t()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long jB(long relativeToWindow) {
        return Offset.Ik(rl().jB(relativeToWindow), t());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean nr() {
        return rl().nr();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public LayoutCoordinates piY() {
        LookaheadDelegate lookaheadDelegateRR;
        if (!nr()) {
            InlineClassHelperKt.t("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator wrappedBy = rl().getLayoutNode().n1().getWrappedBy();
        if (wrappedBy == null || (lookaheadDelegateRR = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegateRR.Zmq();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long r(long relativeToScreen) {
        return Offset.Ik(rl().r(relativeToScreen), t());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public LayoutCoordinates v() {
        LookaheadDelegate lookaheadDelegateRR;
        if (!nr()) {
            InlineClassHelperKt.t("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator wrappedBy = rl().getWrappedBy();
        if (wrappedBy != null && (lookaheadDelegateRR = wrappedBy.getLookaheadDelegate()) != null) {
            return lookaheadDelegateRR.Zmq();
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long xg(long relativeToLocal) {
        return rl().xg(Offset.Ik(relativeToLocal, t()));
    }
}
