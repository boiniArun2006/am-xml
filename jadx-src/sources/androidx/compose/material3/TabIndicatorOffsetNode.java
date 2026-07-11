package androidx.compose.material3;

import GJW.C;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0013\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R.\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010,\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010.\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u001e\u00101\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b/\u00100R\u001e\u00103\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b2\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/material3/TabIndicatorOffsetNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/runtime/State;", "", "Landroidx/compose/material3/TabPosition;", "tabPositionsState", "", "selectedTabIndex", "", "followContentSize", "<init>", "(Landroidx/compose/runtime/State;IZ)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "nr", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "v", "Landroidx/compose/runtime/State;", "getTabPositionsState", "()Landroidx/compose/runtime/State;", "NC9", "(Landroidx/compose/runtime/State;)V", "Xw", "I", "getSelectedTabIndex", "()I", "W5k", "(I)V", "jB", "Z", "getFollowContentSize", "()Z", "UR", "(Z)V", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/animation/core/AnimationVector1D;", "U", "Landroidx/compose/animation/core/Animatable;", "offsetAnimatable", "P5", "widthAnimatable", "M7", "Landroidx/compose/ui/unit/Dp;", "initialOffset", "p5", "initialWidth", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabIndicatorOffsetNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1361:1\n1#2:1362\n62#3:1363\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabIndicatorOffsetNode\n*L\n927#1:1363\n*E\n"})
public final class TabIndicatorOffsetNode extends Modifier.Node implements LayoutModifierNode {

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private Dp initialOffset;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private Animatable widthAnimatable;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private Animatable offsetAnimatable;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private int selectedTabIndex;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private boolean followContentSize;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private Dp initialWidth;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private State tabPositionsState;

    public final void NC9(State state) {
        this.tabPositionsState = state;
    }

    public final void UR(boolean z2) {
        this.followContentSize = z2;
    }

    public final void W5k(int i2) {
        this.selectedTabIndex = i2;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(final MeasureScope measureScope, Measurable measurable, long j2) {
        if (((List) this.tabPositionsState.getValue()).isEmpty()) {
            return MeasureScope.ER(measureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabIndicatorOffsetNode$measure$1
                public final void n(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    n(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null);
        }
        float contentWidth = this.followContentSize ? ((TabPosition) ((List) this.tabPositionsState.getValue()).get(this.selectedTabIndex)).getContentWidth() : ((TabPosition) ((List) this.tabPositionsState.getValue()).get(this.selectedTabIndex)).getWidth();
        if (this.initialWidth != null) {
            Animatable animatable = this.widthAnimatable;
            if (animatable == null) {
                Dp dp = this.initialWidth;
                Intrinsics.checkNotNull(dp);
                Animatable animatable2 = new Animatable(dp, VectorConvertersKt.O(Dp.INSTANCE), null, null, 12, null);
                this.widthAnimatable = animatable2;
                animatable = animatable2;
            }
            if (!Dp.mUb(contentWidth, ((Dp) animatable.qie()).getValue())) {
                C.nr(Xli(), null, null, new TabIndicatorOffsetNode$measure$2(animatable, contentWidth, null), 3, null);
            }
        } else {
            this.initialWidth = Dp.nr(contentWidth);
        }
        float left = ((TabPosition) ((List) this.tabPositionsState.getValue()).get(this.selectedTabIndex)).getLeft();
        if (this.initialOffset != null) {
            Animatable animatable3 = this.offsetAnimatable;
            if (animatable3 == null) {
                Dp dp2 = this.initialOffset;
                Intrinsics.checkNotNull(dp2);
                Animatable animatable4 = new Animatable(dp2, VectorConvertersKt.O(Dp.INSTANCE), null, null, 12, null);
                this.offsetAnimatable = animatable4;
                animatable3 = animatable4;
            }
            if (!Dp.mUb(left, ((Dp) animatable3.qie()).getValue())) {
                C.nr(Xli(), null, null, new TabIndicatorOffsetNode$measure$3(animatable3, left, null), 3, null);
            }
        } else {
            this.initialOffset = Dp.nr(left);
        }
        if (measureScope.getLayoutDirection() == LayoutDirection.f34160n) {
            Animatable animatable5 = this.offsetAnimatable;
            if (animatable5 != null) {
                left = ((Dp) animatable5.ty()).getValue();
            }
        } else {
            Animatable animatable6 = this.offsetAnimatable;
            if (animatable6 != null) {
                left = ((Dp) animatable6.ty()).getValue();
            }
            left = Dp.KN(-left);
        }
        Animatable animatable7 = this.widthAnimatable;
        if (animatable7 != null) {
            contentWidth = ((Dp) animatable7.ty()).getValue();
        }
        final Placeable placeableDR0 = measurable.dR0(Constraints.nr(j2, measureScope.How(contentWidth), measureScope.How(contentWidth), 0, 0, 12, null));
        final float f3 = left;
        return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabIndicatorOffsetNode$measure$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                n(placementScope);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.xMQ(placementScope, placeableDR0, measureScope.How(f3), 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    public TabIndicatorOffsetNode(State state, int i2, boolean z2) {
        this.tabPositionsState = state;
        this.selectedTabIndex = i2;
        this.followContentSize = z2;
    }
}
