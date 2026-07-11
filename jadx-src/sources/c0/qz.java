package c0;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class qz extends Modifier.Node implements DrawModifierNode, LayoutModifierNode {
    private ColorFilter P5;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private float f43522U;
    private Alignment Xw;
    private ContentScale jB;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Painter f43523v;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ex(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.az(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: lRt */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void GT(Painter painter) {
        this.f43523v = painter;
    }

    public final Painter NC9() {
        return this.f43523v;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int U(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (this.f43523v.getIntrinsicSize() == Size.INSTANCE.n()) {
            return intrinsicMeasurable.Nxk(i2);
        }
        int iNxk = intrinsicMeasurable.Nxk(Constraints.gh(poH(ConstraintsKt.rl(0, 0, 0, i2, 7, null))));
        return Math.max(MathKt.roundToInt(Size.gh(W5k(SizeKt.n(iNxk, i2)))), iNxk);
    }

    public final void W1c(Alignment alignment) {
        this.Xw = alignment;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int nHg(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (this.f43523v.getIntrinsicSize() == Size.INSTANCE.n()) {
            return intrinsicMeasurable.FX(i2);
        }
        int iFX = intrinsicMeasurable.FX(Constraints.qie(poH(ConstraintsKt.rl(0, i2, 0, 0, 13, null))));
        return Math.max(MathKt.roundToInt(Size.xMQ(W5k(SizeKt.n(i2, iFX)))), iFX);
    }

    public final void ni(ContentScale contentScale) {
        this.jB = contentScale;
    }

    public final void pr(ColorFilter colorFilter) {
        this.P5 = colorFilter;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int r(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (this.f43523v.getIntrinsicSize() == Size.INSTANCE.n()) {
            return intrinsicMeasurable.g(i2);
        }
        int iG = intrinsicMeasurable.g(Constraints.qie(poH(ConstraintsKt.rl(0, i2, 0, 0, 13, null))));
        return Math.max(MathKt.roundToInt(Size.xMQ(W5k(SizeKt.n(i2, iG)))), iG);
    }

    public final void rl(float f3) {
        this.f43522U = f3;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int v(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (this.f43523v.getIntrinsicSize() == Size.INSTANCE.n()) {
            return intrinsicMeasurable.GR(i2);
        }
        int iGR = intrinsicMeasurable.GR(Constraints.gh(poH(ConstraintsKt.rl(0, 0, 0, i2, 7, null))));
        return Math.max(MathKt.roundToInt(Size.gh(W5k(SizeKt.n(iGR, i2)))), iGR);
    }

    public qz(Painter painter, Alignment alignment, ContentScale contentScale, float f3, ColorFilter colorFilter) {
        this.f43523v = painter;
        this.Xw = alignment;
        this.jB = contentScale;
        this.f43522U = f3;
        this.P5 = colorFilter;
    }

    private final long W5k(long j2) {
        if (Size.az(j2)) {
            return Size.INSTANCE.rl();
        }
        long intrinsicSize = this.f43523v.getIntrinsicSize();
        if (intrinsicSize == Size.INSTANCE.n()) {
            return j2;
        }
        float fGh = Size.gh(intrinsicSize);
        if (Float.isInfinite(fGh) || Float.isNaN(fGh)) {
            fGh = Size.gh(j2);
        }
        float fXMQ = Size.xMQ(intrinsicSize);
        if (Float.isInfinite(fXMQ) || Float.isNaN(fXMQ)) {
            fXMQ = Size.xMQ(j2);
        }
        long jN = SizeKt.n(fGh, fXMQ);
        long jN2 = this.jB.n(jN, j2);
        float fT = ScaleFactor.t(jN2);
        if (!Float.isInfinite(fT) && !Float.isNaN(fT)) {
            float fNr = ScaleFactor.nr(jN2);
            if (!Float.isInfinite(fNr) && !Float.isNaN(fNr)) {
                return ScaleFactorKt.rl(jN2, jN);
            }
            return j2;
        }
        return j2;
    }

    private final long poH(long j2) {
        boolean z2;
        float fTy;
        int iAz;
        float fNr;
        boolean zMUb = Constraints.mUb(j2);
        boolean zXMQ = Constraints.xMQ(j2);
        if (!zMUb || !zXMQ) {
            if (Constraints.KN(j2) && Constraints.Uo(j2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            long intrinsicSize = this.f43523v.getIntrinsicSize();
            if (intrinsicSize == Size.INSTANCE.n()) {
                if (z2) {
                    return Constraints.nr(j2, Constraints.qie(j2), 0, Constraints.gh(j2), 0, 10, null);
                }
            } else {
                if (z2 && (zMUb || zXMQ)) {
                    fTy = Constraints.qie(j2);
                    iAz = Constraints.gh(j2);
                } else {
                    float fGh = Size.gh(intrinsicSize);
                    float fXMQ = Size.xMQ(intrinsicSize);
                    if (!Float.isInfinite(fGh) && !Float.isNaN(fGh)) {
                        fTy = AbstractC1676c.O(j2, fGh);
                    } else {
                        fTy = Constraints.ty(j2);
                    }
                    if (!Float.isInfinite(fXMQ) && !Float.isNaN(fXMQ)) {
                        fNr = AbstractC1676c.nr(j2, fXMQ);
                        long jW5k = W5k(SizeKt.n(fTy, fNr));
                        return Constraints.nr(j2, ConstraintsKt.Uo(j2, MathKt.roundToInt(Size.gh(jW5k))), 0, ConstraintsKt.J2(j2, MathKt.roundToInt(Size.xMQ(jW5k))), 0, 10, null);
                    }
                    iAz = Constraints.az(j2);
                }
                fNr = iAz;
                long jW5k2 = W5k(SizeKt.n(fTy, fNr));
                return Constraints.nr(j2, ConstraintsKt.Uo(j2, MathKt.roundToInt(Size.gh(jW5k2))), 0, ConstraintsKt.J2(j2, MathKt.roundToInt(Size.xMQ(jW5k2))), 0, 10, null);
            }
        }
        return j2;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void N(ContentDrawScope contentDrawScope) {
        long jW5k = W5k(contentDrawScope.t());
        long jN = this.Xw.n(AbstractC1676c.ty(jW5k), AbstractC1676c.ty(contentDrawScope.t()), contentDrawScope.getLayoutDirection());
        float fNr = IntOffset.nr(jN);
        float fO = IntOffset.O(jN);
        contentDrawScope.getDrawContext().getTransform().nr(fNr, fO);
        this.f43523v.mUb(contentDrawScope, jW5k, this.f43522U, this.P5);
        contentDrawScope.getDrawContext().getTransform().nr(-fNr, -fO);
        contentDrawScope.l2();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableDR0 = measurable.dR0(poH(j2));
        return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1() { // from class: c0.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qz.ex(placeableDR0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }
}
