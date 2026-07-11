package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bJ\u001a\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\bJ\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\bJ\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\bJ\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\bJ\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\bJ\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\"\u0010,\u001a\u00020%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00100\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR\"\u00104\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001b\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u0010\u001fR\"\u00107\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u0010\u001b\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b6\u0010\u001fR\"\u0010>\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010A\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u00109\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=R*\u0010E\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010\u001b\u001a\u0004\b5\u0010\u001d\"\u0004\bD\u0010\u001fR*\u0010H\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010\u001b\u001a\u0004\b1\u0010\u001d\"\u0004\bG\u0010\u001fR*\u0010K\u001a\u0002082\u0006\u0010B\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bI\u00109\u001a\u0004\b&\u0010;\"\u0004\bJ\u0010=R*\u0010N\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001b\u001a\u0004\bL\u0010\u001d\"\u0004\bM\u0010\u001fR*\u0010R\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010\u001b\u001a\u0004\bP\u0010\u001d\"\u0004\bQ\u0010\u001fR*\u0010T\u001a\u0002082\u0006\u0010B\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u00109\u001a\u0004\b-\u0010;\"\u0004\bS\u0010=R\u001a\u0010Z\u001a\u00020U8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR(\u0010`\u001a\u0004\u0018\u00010[2\b\u0010\\\u001a\u0004\u0018\u00010[8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bP\u0010]\u001a\u0004\b^\u0010_R\u0011\u0010d\u001a\u00020a8F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0019\u0010f\u001a\u0004\u0018\u00010\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bF\u0010eR\u0019\u0010g\u001a\u0004\u0018\u00010\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bI\u0010eR\u0014\u0010h\u001a\u0002088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bC\u0010;R\u0014\u0010j\u001a\u0002088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bi\u0010;R\u0014\u0010l\u001a\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bk\u0010\u001dR\u0014\u0010m\u001a\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u001dR\u0014\u0010p\u001a\u00020n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010oR\u0016\u0010q\u001a\u0004\u0018\u00010n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bV\u0010o\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006r"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "E2", "()V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "e", "X", "N", "Landroidx/compose/ui/unit/Constraints;", "constraints", "nHg", "(J)V", "rl", "B", "iF", "s7N", "fD", c.f62177j, "Landroidx/compose/ui/node/LayoutNode;", "az", "()Landroidx/compose/ui/node/LayoutNode;", "", "Z", "KN", "()Z", "Xw", "(Z)V", "detachedFromParentLookaheadPass", "t", "xMQ", "jB", "detachedFromParentLookaheadPlacement", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "nr", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "HI", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "U", "(Landroidx/compose/ui/node/LayoutNode$LayoutState;)V", "layoutState", "O", "XQ", "E", "lookaheadMeasurePending", "J2", "o", "p5", "lookaheadLayoutPending", "Uo", "eF", "lookaheadLayoutPendingForAlignment", "", "I", "ViF", "()I", "M", "(I)V", "nextChildLookaheadPlaceOrder", "nY", "FX", "nextChildPlaceOrder", "value", "mUb", "bzg", "coordinatesAccessedDuringPlacement", "gh", "rV9", "coordinatesAccessedDuringModifierPlacement", "qie", "wTp", "childrenAccessingCoordinatesDuringPlacement", "r", "M7", "lookaheadCoordinatesAccessedDuringPlacement", "ty", "Ik", "P5", "lookaheadCoordinatesAccessedDuringModifierPlacement", "v", "childrenAccessingLookaheadCoordinatesDuringPlacement", "Landroidx/compose/ui/node/MeasurePassDelegate;", "ck", "Landroidx/compose/ui/node/MeasurePassDelegate;", "WPU", "()Landroidx/compose/ui/node/MeasurePassDelegate;", "measurePassDelegate", "Landroidx/compose/ui/node/LookaheadPassDelegate;", "<set-?>", "Landroidx/compose/ui/node/LookaheadPassDelegate;", "S", "()Landroidx/compose/ui/node/LookaheadPassDelegate;", "lookaheadPassDelegate", "Landroidx/compose/ui/node/NodeCoordinator;", "g", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "()Landroidx/compose/ui/unit/Constraints;", "lastConstraints", "lastLookaheadConstraints", "height", "te", "width", "aYN", "measurePending", "layoutPending", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "lookaheadAlignmentLinesOwner", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,497:1\n1#2:498\n*E\n"})
public final class LayoutNodeLayoutDelegate {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private int childrenAccessingLookaheadCoordinatesDuringPlacement;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private LookaheadPassDelegate lookaheadPassDelegate;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private boolean lookaheadLayoutPending;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private int nextChildLookaheadPlaceOrder;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadMeasurePending;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private boolean lookaheadLayoutPendingForAlignment;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private boolean lookaheadCoordinatesAccessedDuringPlacement;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private boolean coordinatesAccessedDuringModifierPlacement;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private boolean coordinatesAccessedDuringPlacement;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LayoutNode layoutNode;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private int childrenAccessingCoordinatesDuringPlacement;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private boolean detachedFromParentLookaheadPass;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean detachedFromParentLookaheadPlacement;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private boolean lookaheadCoordinatesAccessedDuringModifierPlacement;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private int nextChildPlaceOrder;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.f32462r;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final MeasurePassDelegate measurePassDelegate = new MeasurePassDelegate(this);

    public final void X() {
        this.lookaheadMeasurePending = true;
    }

    public final void e() {
        this.lookaheadLayoutPending = true;
        this.lookaheadLayoutPendingForAlignment = true;
    }

    public final void n() {
        this.lookaheadPassDelegate = null;
    }

    public final void B() {
        LayoutNode layoutNodeMYa;
        if (this.measurePassDelegate.lRt() && (layoutNodeMYa = this.layoutNode.mYa()) != null) {
            LayoutNode.lNy(layoutNodeMYa, false, false, false, 7, null);
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate == null || !lookaheadPassDelegate.wYi()) {
            return;
        }
        if (LayoutNodeLayoutDelegateKt.n(this.layoutNode)) {
            LayoutNode layoutNodeMYa2 = this.layoutNode.mYa();
            if (layoutNodeMYa2 != null) {
                LayoutNode.lNy(layoutNodeMYa2, false, false, false, 7, null);
                return;
            }
            return;
        }
        LayoutNode layoutNodeMYa3 = this.layoutNode.mYa();
        if (layoutNodeMYa3 != null) {
            LayoutNode.wKp(layoutNodeMYa3, false, false, false, 7, null);
        }
    }

    public final void E(boolean z2) {
        this.lookaheadMeasurePending = z2;
    }

    public final void E2() {
        this.measurePassDelegate.LPV();
    }

    public final void FX(int i2) {
        this.nextChildPlaceOrder = i2;
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final LayoutNode.LayoutState getLayoutState() {
        return this.layoutState;
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final boolean getLookaheadCoordinatesAccessedDuringModifierPlacement() {
        return this.lookaheadCoordinatesAccessedDuringModifierPlacement;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final boolean getCoordinatesAccessedDuringModifierPlacement() {
        return this.coordinatesAccessedDuringModifierPlacement;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final boolean getDetachedFromParentLookaheadPass() {
        return this.detachedFromParentLookaheadPass;
    }

    public final void M(int i2) {
        this.nextChildLookaheadPlaceOrder = i2;
    }

    public final void M7(boolean z2) {
        if (this.lookaheadCoordinatesAccessedDuringPlacement != z2) {
            this.lookaheadCoordinatesAccessedDuringPlacement = z2;
            if (z2 && !this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                v(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
            } else {
                if (z2 || this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                v(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void N() {
        LayoutNode.LayoutState layoutStateK = this.layoutNode.k();
        if (layoutStateK == LayoutNode.LayoutState.f32458O || layoutStateK == LayoutNode.LayoutState.J2) {
            if (this.measurePassDelegate.getLayingOutChildren()) {
                bzg(true);
            } else {
                rV9(true);
            }
        }
        if (layoutStateK == LayoutNode.LayoutState.J2) {
            LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
            if (lookaheadPassDelegate == null || !lookaheadPassDelegate.getLayingOutChildren()) {
                P5(true);
            } else {
                M7(true);
            }
        }
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final int getChildrenAccessingLookaheadCoordinatesDuringPlacement() {
        return this.childrenAccessingLookaheadCoordinatesDuringPlacement;
    }

    public final void P5(boolean z2) {
        if (this.lookaheadCoordinatesAccessedDuringModifierPlacement != z2) {
            this.lookaheadCoordinatesAccessedDuringModifierPlacement = z2;
            if (z2 && !this.lookaheadCoordinatesAccessedDuringPlacement) {
                v(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
            } else {
                if (z2 || this.lookaheadCoordinatesAccessedDuringPlacement) {
                    return;
                }
                v(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
            }
        }
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final LookaheadPassDelegate getLookaheadPassDelegate() {
        return this.lookaheadPassDelegate;
    }

    public final void T() {
        this.measurePassDelegate.tEO();
    }

    public final void U(LayoutNode.LayoutState layoutState) {
        this.layoutState = layoutState;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.coordinatesAccessedDuringPlacement;
    }

    /* JADX INFO: renamed from: ViF, reason: from getter */
    public final int getNextChildLookaheadPlaceOrder() {
        return this.nextChildLookaheadPlaceOrder;
    }

    /* JADX INFO: renamed from: WPU, reason: from getter */
    public final MeasurePassDelegate getMeasurePassDelegate() {
        return this.measurePassDelegate;
    }

    /* JADX INFO: renamed from: XQ, reason: from getter */
    public final boolean getLookaheadMeasurePending() {
        return this.lookaheadMeasurePending;
    }

    public final void Xw(boolean z2) {
        this.detachedFromParentLookaheadPass = z2;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final boolean getLookaheadLayoutPendingForAlignment() {
        return this.lookaheadLayoutPendingForAlignment;
    }

    public final boolean aYN() {
        return this.measurePassDelegate.getMeasurePending();
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final void bzg(boolean z2) {
        if (this.coordinatesAccessedDuringPlacement != z2) {
            this.coordinatesAccessedDuringPlacement = z2;
            if (z2 && !this.coordinatesAccessedDuringModifierPlacement) {
                wTp(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z2 || this.coordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                wTp(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final AlignmentLinesOwner ck() {
        return this.lookaheadPassDelegate;
    }

    public final void eF(boolean z2) {
        this.lookaheadLayoutPendingForAlignment = z2;
    }

    public final void fD() {
        this.measurePassDelegate.eb(true);
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.Om(true);
        }
    }

    public final NodeCoordinator g() {
        return this.layoutNode.getNodes().getOuterCoordinator();
    }

    public final Constraints gh() {
        return this.measurePassDelegate.n7b();
    }

    public final void iF() {
        this.measurePassDelegate.j();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.D76();
        }
    }

    public final void jB(boolean z2) {
        this.detachedFromParentLookaheadPlacement = z2;
    }

    public final int mUb() {
        return this.measurePassDelegate.getHeight();
    }

    public final void nHg(long constraints) {
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.q9(constraints);
        }
    }

    /* JADX INFO: renamed from: nY, reason: from getter */
    public final int getNextChildPlaceOrder() {
        return this.nextChildPlaceOrder;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.childrenAccessingCoordinatesDuringPlacement;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getLookaheadLayoutPending() {
        return this.lookaheadLayoutPending;
    }

    public final void p5(boolean z2) {
        this.lookaheadLayoutPending = z2;
    }

    public final Constraints qie() {
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            return lookaheadPassDelegate.getLookaheadConstraints();
        }
        return null;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getLookaheadCoordinatesAccessedDuringPlacement() {
        return this.lookaheadCoordinatesAccessedDuringPlacement;
    }

    public final void rV9(boolean z2) {
        if (this.coordinatesAccessedDuringModifierPlacement != z2) {
            this.coordinatesAccessedDuringModifierPlacement = z2;
            if (z2 && !this.coordinatesAccessedDuringPlacement) {
                wTp(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z2 || this.coordinatesAccessedDuringPlacement) {
                    return;
                }
                wTp(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void rl() {
        if (this.lookaheadPassDelegate == null) {
            this.lookaheadPassDelegate = new LookaheadPassDelegate(this);
        }
    }

    public final void s7N() {
        AlignmentLines alignmentLines;
        this.measurePassDelegate.getAlignmentLines().ck();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate == null || (alignmentLines = lookaheadPassDelegate.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.ck();
    }

    public final AlignmentLinesOwner t() {
        return this.measurePassDelegate;
    }

    public final int te() {
        return this.measurePassDelegate.getWidth();
    }

    public final boolean ty() {
        return this.measurePassDelegate.getLayoutPending();
    }

    public final void v(int i2) {
        int i3 = this.childrenAccessingLookaheadCoordinatesDuringPlacement;
        this.childrenAccessingLookaheadCoordinatesDuringPlacement = i2;
        if ((i3 == 0) != (i2 == 0)) {
            LayoutNode layoutNodeMYa = this.layoutNode.mYa();
            LayoutNodeLayoutDelegate layoutDelegate = layoutNodeMYa != null ? layoutNodeMYa.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                if (i2 == 0) {
                    layoutDelegate.v(layoutDelegate.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate.v(layoutDelegate.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final void wTp(int i2) {
        int i3 = this.childrenAccessingCoordinatesDuringPlacement;
        this.childrenAccessingCoordinatesDuringPlacement = i2;
        if ((i3 == 0) != (i2 == 0)) {
            LayoutNode layoutNodeMYa = this.layoutNode.mYa();
            LayoutNodeLayoutDelegate layoutDelegate = layoutNodeMYa != null ? layoutNodeMYa.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                if (i2 == 0) {
                    layoutDelegate.wTp(layoutDelegate.childrenAccessingCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate.wTp(layoutDelegate.childrenAccessingCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final boolean getDetachedFromParentLookaheadPlacement() {
        return this.detachedFromParentLookaheadPlacement;
    }

    public LayoutNodeLayoutDelegate(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }
}
