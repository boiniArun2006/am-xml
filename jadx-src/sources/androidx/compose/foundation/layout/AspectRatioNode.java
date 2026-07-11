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
import androidx.compose.ui.unit.IntSize;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000e\u001a\u00020\n*\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\u00020\n*\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u001e\u0010\u0011\u001a\u00020\n*\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\n*\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000fJ&\u0010\u0018\u001a\u00020\u0017*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010 \u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ#\u0010\"\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010\u001fJ#\u0010#\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010\u001fR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "", "aspectRatio", "", "matchHeightConstraintsFirst", "<init>", "(FZ)V", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/IntSize;", "UR", "(J)J", "enforceConstraints", "poH", "(JZ)J", "ex", CmcdConfiguration.KEY_PLAYBACK_RATE, "W1c", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "nr", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "v", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "U", "width", "nHg", "r", "F", "getAspectRatio", "()F", "W5k", "(F)V", "Xw", "Z", "getMatchHeightConstraintsFirst", "()Z", "NC9", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,242:1\n54#2:243\n59#2:245\n85#3:244\n90#3:246\n80#3:254\n80#3:257\n80#3:260\n80#3:263\n26#4:247\n26#4:248\n26#4:249\n26#4:250\n26#4:252\n26#4:255\n26#4:258\n26#4:261\n1#5:251\n30#6:253\n30#6:256\n30#6:259\n30#6:262\n*S KotlinDebug\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioNode\n*L\n117#1:243\n117#1:245\n117#1:244\n117#1:246\n194#1:254\n207#1:257\n219#1:260\n230#1:263\n130#1:247\n140#1:248\n150#1:249\n160#1:250\n191#1:252\n204#1:255\n216#1:258\n227#1:261\n194#1:253\n207#1:256\n219#1:259\n230#1:262\n*E\n"})
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private boolean matchHeightConstraintsFirst;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float aspectRatio;

    private final long UR(long j2) {
        if (this.matchHeightConstraintsFirst) {
            long jEx = ex(j2, true);
            IntSize.Companion companion = IntSize.INSTANCE;
            if (!IntSize.O(jEx, companion.n())) {
                return jEx;
            }
            long jPoH = poH(j2, true);
            if (!IntSize.O(jPoH, companion.n())) {
                return jPoH;
            }
            long jW1c = W1c(j2, true);
            if (!IntSize.O(jW1c, companion.n())) {
                return jW1c;
            }
            long jPr = pr(j2, true);
            if (!IntSize.O(jPr, companion.n())) {
                return jPr;
            }
            long jEx2 = ex(j2, false);
            if (!IntSize.O(jEx2, companion.n())) {
                return jEx2;
            }
            long jPoH2 = poH(j2, false);
            if (!IntSize.O(jPoH2, companion.n())) {
                return jPoH2;
            }
            long jW1c2 = W1c(j2, false);
            if (!IntSize.O(jW1c2, companion.n())) {
                return jW1c2;
            }
            long jPr2 = pr(j2, false);
            if (!IntSize.O(jPr2, companion.n())) {
                return jPr2;
            }
        } else {
            long jPoH3 = poH(j2, true);
            IntSize.Companion companion2 = IntSize.INSTANCE;
            if (!IntSize.O(jPoH3, companion2.n())) {
                return jPoH3;
            }
            long jEx3 = ex(j2, true);
            if (!IntSize.O(jEx3, companion2.n())) {
                return jEx3;
            }
            long jPr3 = pr(j2, true);
            if (!IntSize.O(jPr3, companion2.n())) {
                return jPr3;
            }
            long jW1c3 = W1c(j2, true);
            if (!IntSize.O(jW1c3, companion2.n())) {
                return jW1c3;
            }
            long jPoH4 = poH(j2, false);
            if (!IntSize.O(jPoH4, companion2.n())) {
                return jPoH4;
            }
            long jEx4 = ex(j2, false);
            if (!IntSize.O(jEx4, companion2.n())) {
                return jEx4;
            }
            long jPr4 = pr(j2, false);
            if (!IntSize.O(jPr4, companion2.n())) {
                return jPr4;
            }
            long jW1c4 = W1c(j2, false);
            if (!IntSize.O(jW1c4, companion2.n())) {
                return jW1c4;
            }
        }
        return IntSize.INSTANCE.n();
    }

    public final void NC9(boolean z2) {
        this.matchHeightConstraintsFirst = z2;
    }

    public final void W5k(float f3) {
        this.aspectRatio = f3;
    }

    public AspectRatioNode(float f3, boolean z2) {
        this.aspectRatio = f3;
        this.matchHeightConstraintsFirst = z2;
    }

    private final long W1c(long j2, boolean z2) {
        int iAz = Constraints.az(j2);
        int iRound = Math.round(iAz * this.aspectRatio);
        if (iRound > 0 && (!z2 || AspectRatioKt.t(j2, iRound, iAz))) {
            return IntSize.t((((long) iRound) << 32) | (((long) iAz) & 4294967295L));
        }
        return IntSize.INSTANCE.n();
    }

    private final long ex(long j2, boolean z2) {
        int iRound;
        int iGh = Constraints.gh(j2);
        if (iGh != Integer.MAX_VALUE && (iRound = Math.round(iGh * this.aspectRatio)) > 0 && (!z2 || AspectRatioKt.t(j2, iRound, iGh))) {
            return IntSize.t((((long) iRound) << 32) | (((long) iGh) & 4294967295L));
        }
        return IntSize.INSTANCE.n();
    }

    private final long poH(long j2, boolean z2) {
        int iRound;
        int iQie = Constraints.qie(j2);
        if (iQie != Integer.MAX_VALUE && (iRound = Math.round(iQie / this.aspectRatio)) > 0 && (!z2 || AspectRatioKt.t(j2, iQie, iRound))) {
            return IntSize.t((((long) iQie) << 32) | (((long) iRound) & 4294967295L));
        }
        return IntSize.INSTANCE.n();
    }

    private final long pr(long j2, boolean z2) {
        int iTy = Constraints.ty(j2);
        int iRound = Math.round(iTy / this.aspectRatio);
        if (iRound > 0 && (!z2 || AspectRatioKt.t(j2, iTy, iRound))) {
            return IntSize.t((((long) iTy) << 32) | (((long) iRound) & 4294967295L));
        }
        return IntSize.INSTANCE.n();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int U(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (i2 != Integer.MAX_VALUE) {
            return Math.round(i2 * this.aspectRatio);
        }
        return intrinsicMeasurable.Nxk(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int nHg(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (i2 != Integer.MAX_VALUE) {
            return Math.round(i2 / this.aspectRatio);
        }
        return intrinsicMeasurable.FX(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(MeasureScope measureScope, Measurable measurable, long j2) {
        long jUR = UR(j2);
        if (!IntSize.O(jUR, IntSize.INSTANCE.n())) {
            j2 = Constraints.INSTANCE.t((int) (jUR >> 32), (int) (jUR & 4294967295L));
        }
        final Placeable placeableDR0 = measurable.dR0(j2);
        return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AspectRatioNode$measure$1
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
        if (i2 != Integer.MAX_VALUE) {
            return Math.round(i2 / this.aspectRatio);
        }
        return intrinsicMeasurable.g(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int v(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (i2 != Integer.MAX_VALUE) {
            return Math.round(i2 * this.aspectRatio);
        }
        return intrinsicMeasurable.GR(i2);
    }
}
