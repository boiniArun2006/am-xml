package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J#\u0010\u001c\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J#\u0010\u001d\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0019R(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R(\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00104\u001a\u00020\u000f*\u0002018BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b2\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Landroidx/compose/foundation/layout/SizeNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/unit/Dp;", "minWidth", "minHeight", "maxWidth", "maxHeight", "", "enforceIncoming", "<init>", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "nr", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "v", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "width", "nHg", "U", "r", "F", "getMinWidth-D9Ej5fM", "()F", "W1c", "(F)V", "Xw", "getMinHeight-D9Ej5fM", "poH", "jB", "getMaxWidth-D9Ej5fM", "ex", "getMaxHeight-D9Ej5fM", "NC9", "P5", "Z", "getEnforceIncoming", "()Z", "W5k", "(Z)V", "Landroidx/compose/ui/unit/Density;", "UR", "(Landroidx/compose/ui/unit/Density;)J", "targetConstraints", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1134:1\n97#2:1135\n97#2:1137\n97#2:1139\n97#2:1150\n97#2:1161\n97#2:1163\n97#2:1165\n97#2:1167\n105#3:1136\n105#3:1138\n101#3,10:1140\n101#3,10:1151\n110#3:1162\n105#3:1164\n110#3:1166\n105#3:1168\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeNode\n*L\n789#1:1135\n795#1:1137\n801#1:1139\n809#1:1150\n834#1:1161\n840#1:1163\n846#1:1165\n852#1:1167\n790#1:1136\n796#1:1138\n802#1:1140,10\n810#1:1151,10\n837#1:1162\n843#1:1164\n849#1:1166\n855#1:1168\n*E\n"})
final class SizeNode extends Modifier.Node implements LayoutModifierNode {

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private boolean enforceIncoming;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private float maxHeight;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private float minHeight;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private float maxWidth;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float minWidth;

    public /* synthetic */ SizeNode(float f3, float f4, float f5, float f6, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f3, f4, f5, f6, z2);
    }

    private SizeNode(float f3, float f4, float f5, float f6, boolean z2) {
        this.minWidth = f3;
        this.minHeight = f4;
        this.maxWidth = f5;
        this.maxHeight = f6;
        this.enforceIncoming = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long UR(Density density) {
        int iHow;
        int iHow2;
        int iHow3;
        int i2 = 0;
        if (Float.isNaN(this.maxWidth)) {
            iHow = Integer.MAX_VALUE;
        } else {
            iHow = density.How(this.maxWidth);
            if (iHow < 0) {
                iHow = 0;
            }
        }
        if (Float.isNaN(this.maxHeight)) {
            iHow2 = Integer.MAX_VALUE;
        } else {
            iHow2 = density.How(this.maxHeight);
            if (iHow2 < 0) {
                iHow2 = 0;
            }
        }
        if (Float.isNaN(this.minWidth)) {
            iHow3 = 0;
        } else {
            iHow3 = density.How(this.minWidth);
            if (iHow3 < 0) {
                iHow3 = 0;
            }
            if (iHow3 > iHow) {
                iHow3 = iHow;
            }
            if (iHow3 == Integer.MAX_VALUE) {
            }
        }
        if (!Float.isNaN(this.minHeight)) {
            int iHow4 = density.How(this.minHeight);
            if (iHow4 < 0) {
                iHow4 = 0;
            }
            if (iHow4 > iHow2) {
                iHow4 = iHow2;
            }
            if (iHow4 != Integer.MAX_VALUE) {
                i2 = iHow4;
            }
        }
        return ConstraintsKt.n(iHow3, iHow, i2, iHow2);
    }

    public final void NC9(float f3) {
        this.maxHeight = f3;
    }

    public final void W1c(float f3) {
        this.minWidth = f3;
    }

    public final void W5k(boolean z2) {
        this.enforceIncoming = z2;
    }

    public final void ex(float f3) {
        this.maxWidth = f3;
    }

    public final void poH(float f3) {
        this.minHeight = f3;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int U(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        long jUR = UR(intrinsicMeasureScope);
        if (Constraints.mUb(jUR)) {
            return Constraints.qie(jUR);
        }
        if (!this.enforceIncoming) {
            i2 = ConstraintsKt.J2(jUR, i2);
        }
        return ConstraintsKt.Uo(jUR, intrinsicMeasurable.Nxk(i2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int nHg(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        long jUR = UR(intrinsicMeasureScope);
        if (Constraints.xMQ(jUR)) {
            return Constraints.gh(jUR);
        }
        if (!this.enforceIncoming) {
            i2 = ConstraintsKt.Uo(jUR, i2);
        }
        return ConstraintsKt.J2(jUR, intrinsicMeasurable.FX(i2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(MeasureScope measureScope, Measurable measurable, long j2) {
        int iTy;
        int iQie;
        int iAz;
        int iGh;
        long jN;
        long jUR = UR(measureScope);
        if (this.enforceIncoming) {
            jN = ConstraintsKt.O(j2, jUR);
        } else {
            if (!Float.isNaN(this.minWidth)) {
                iTy = Constraints.ty(jUR);
            } else {
                iTy = Constraints.ty(j2);
                int iQie2 = Constraints.qie(jUR);
                if (iTy > iQie2) {
                    iTy = iQie2;
                }
            }
            if (!Float.isNaN(this.maxWidth)) {
                iQie = Constraints.qie(jUR);
            } else {
                iQie = Constraints.qie(j2);
                int iTy2 = Constraints.ty(jUR);
                if (iQie < iTy2) {
                    iQie = iTy2;
                }
            }
            if (!Float.isNaN(this.minHeight)) {
                iAz = Constraints.az(jUR);
            } else {
                iAz = Constraints.az(j2);
                int iGh2 = Constraints.gh(jUR);
                if (iAz > iGh2) {
                    iAz = iGh2;
                }
            }
            if (!Float.isNaN(this.maxHeight)) {
                iGh = Constraints.gh(jUR);
            } else {
                iGh = Constraints.gh(j2);
                int iAz2 = Constraints.az(jUR);
                if (iGh < iAz2) {
                    iGh = iAz2;
                }
            }
            jN = ConstraintsKt.n(iTy, iQie, iAz, iGh);
        }
        final Placeable placeableDR0 = measurable.dR0(jN);
        return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.SizeNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                n(placementScope);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.az(placementScope, placeableDR0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int r(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        long jUR = UR(intrinsicMeasureScope);
        if (Constraints.xMQ(jUR)) {
            return Constraints.gh(jUR);
        }
        if (!this.enforceIncoming) {
            i2 = ConstraintsKt.Uo(jUR, i2);
        }
        return ConstraintsKt.J2(jUR, intrinsicMeasurable.g(i2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int v(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        long jUR = UR(intrinsicMeasureScope);
        if (Constraints.mUb(jUR)) {
            return Constraints.qie(jUR);
        }
        if (!this.enforceIncoming) {
            i2 = ConstraintsKt.J2(jUR, i2);
        }
        return ConstraintsKt.Uo(jUR, intrinsicMeasurable.GR(i2));
    }
}
