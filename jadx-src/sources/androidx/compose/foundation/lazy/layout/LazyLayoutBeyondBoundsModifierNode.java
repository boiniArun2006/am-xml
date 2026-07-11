package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00018B'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\u00020\t*\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\t*\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0011J&\u0010 \u001a\u00020\u001f*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J=\u0010'\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\"2\u0006\u0010\u0014\u001a\u00020\u000f2\u0019\u0010&\u001a\u0015\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00018\u00000#¢\u0006\u0002\b%H\u0016ø\u0001\u0000¢\u0006\u0004\b'\u0010(J-\u0010*\u001a\u00020)2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b*\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "state", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;ZLandroidx/compose/foundation/gestures/Orientation;)V", "Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "ex", "(I)Z", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "currentInterval", "direction", "W5k", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "NC9", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;I)Z", "poH", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "nr", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "block", "G7", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "W1c", "v", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "Xw", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "jB", "Z", "U", "Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "Rl", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "providedValues", "P5", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyLayoutBeyondBoundsModifierNode extends Modifier.Node implements ModifierLocalModifierNode, BeyondBoundsLayout, LayoutModifierNode {

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private Orientation orientation;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private boolean reverseLayout;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private LazyLayoutBeyondBoundsState state;
    public static final int M7 = 8;
    private static final LazyLayoutBeyondBoundsModifierNode$Companion$emptyBeyondBoundsScope$1 p5 = new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierNode$Companion$emptyBeyondBoundsScope$1

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final boolean hasMoreContent;

        @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
        /* JADX INFO: renamed from: n, reason: from getter */
        public boolean getHasMoreContent() {
            return this.hasMoreContent;
        }
    };

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.f34160n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.f34161t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean ex(int i2) {
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.INSTANCE;
        if (BeyondBoundsLayout.LayoutDirection.xMQ(i2, companion.t())) {
            return false;
        }
        if (BeyondBoundsLayout.LayoutDirection.xMQ(i2, companion.rl())) {
            return true;
        }
        if (BeyondBoundsLayout.LayoutDirection.xMQ(i2, companion.n())) {
            return this.reverseLayout;
        }
        if (BeyondBoundsLayout.LayoutDirection.xMQ(i2, companion.nr())) {
            return !this.reverseLayout;
        }
        if (BeyondBoundsLayout.LayoutDirection.xMQ(i2, companion.O())) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[DelegatableNodeKt.ty(this).ordinal()];
            if (i3 == 1) {
                return this.reverseLayout;
            }
            if (i3 == 2) {
                return !this.reverseLayout;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!BeyondBoundsLayout.LayoutDirection.xMQ(i2, companion.J2())) {
            LazyLayoutBeyondBoundsModifierLocalKt.t();
            throw new KotlinNothingValueException();
        }
        int i5 = WhenMappings.$EnumSwitchMapping$0[DelegatableNodeKt.ty(this).ordinal()];
        if (i5 == 1) {
            return !this.reverseLayout;
        }
        if (i5 == 2) {
            return this.reverseLayout;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean poH(int i2) {
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.INSTANCE;
        if (BeyondBoundsLayout.LayoutDirection.xMQ(i2, companion.n()) ? true : BeyondBoundsLayout.LayoutDirection.xMQ(i2, companion.nr())) {
            return this.orientation == Orientation.f16970t;
        }
        if (BeyondBoundsLayout.LayoutDirection.xMQ(i2, companion.O()) ? true : BeyondBoundsLayout.LayoutDirection.xMQ(i2, companion.J2())) {
            return this.orientation == Orientation.f16969n;
        }
        if (BeyondBoundsLayout.LayoutDirection.xMQ(i2, companion.t()) ? true : BeyondBoundsLayout.LayoutDirection.xMQ(i2, companion.rl())) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierLocalKt.t();
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo$Interval] */
    /* JADX WARN: Type inference failed for: r2v7, types: [T, androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo$Interval] */
    @Override // androidx.compose.ui.layout.BeyondBoundsLayout
    public Object G7(final int direction, Function1 block) {
        if (this.state.n() <= 0 || !this.state.t() || !getIsAttached()) {
            return block.invoke(p5);
        }
        int iO = ex(direction) ? this.state.O() : this.state.nr();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = this.beyondBoundsInfo.n(iO, iO);
        int iCoerceAtMost = RangesKt.coerceAtMost(this.state.rl() * 2, this.state.n());
        Object objInvoke = null;
        int i2 = 0;
        while (objInvoke == null && NC9((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element, direction) && i2 < iCoerceAtMost) {
            ?? W5k = W5k((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element, direction);
            this.beyondBoundsInfo.O((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element);
            objectRef.element = W5k;
            i2++;
            LayoutModifierNodeKt.nr(this);
            objInvoke = block.invoke(new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierNode$layout$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
                /* JADX INFO: renamed from: n */
                public boolean getHasMoreContent() {
                    return this.f18409n.NC9((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element, direction);
                }
            });
        }
        this.beyondBoundsInfo.O((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element);
        LayoutModifierNodeKt.nr(this);
        return objInvoke;
    }

    public final void W1c(LazyLayoutBeyondBoundsState state, LazyLayoutBeyondBoundsInfo beyondBoundsInfo, boolean reverseLayout, Orientation orientation) {
        this.state = state;
        this.beyondBoundsInfo = beyondBoundsInfo;
        this.reverseLayout = reverseLayout;
        this.orientation = orientation;
    }

    public LazyLayoutBeyondBoundsModifierNode(LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z2, Orientation orientation) {
        this.state = lazyLayoutBeyondBoundsState;
        this.beyondBoundsInfo = lazyLayoutBeyondBoundsInfo;
        this.reverseLayout = z2;
        this.orientation = orientation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean NC9(LazyLayoutBeyondBoundsInfo.Interval interval, int i2) {
        if (poH(i2)) {
            return false;
        }
        if (ex(i2)) {
            if (interval.getEnd() >= this.state.n() - 1) {
                return false;
            }
            return true;
        }
        if (interval.getStart() <= 0) {
            return false;
        }
        return true;
    }

    private final LazyLayoutBeyondBoundsInfo.Interval W5k(LazyLayoutBeyondBoundsInfo.Interval currentInterval, int direction) {
        int start = currentInterval.getStart();
        int end = currentInterval.getEnd();
        if (ex(direction)) {
            end++;
        } else {
            start--;
        }
        return this.beyondBoundsInfo.n(start, end);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    /* JADX INFO: renamed from: Rl */
    public ModifierLocalMap getProvidedValues() {
        return ModifierLocalModifierNodeKt.rl(TuplesKt.to(BeyondBoundsLayoutKt.n(), this));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableDR0 = measurable.dR0(j2);
        return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                n(placementScope);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.xMQ(placementScope, placeableDR0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
