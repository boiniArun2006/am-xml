package androidx.compose.foundation.lazy.staggeredgrid;

import GJW.vd;
import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u007f\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0014¢\u0006\u0002\b\u00182\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a#\u0010\u001d\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010\u001f\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a+\u0010!\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProviderLambda", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacing", "crossAxisSpacing", "LGJW/vd;", "coroutineScope", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "slots", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Lkotlin/ExtensionFunctionType;", "J2", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;FFLGJW/vd;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Uo", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/unit/LayoutDirection;)F", "O", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/LayoutDirection;)F", "nr", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,177:1\n1247#2,6:178\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n*L\n52#1:178,6\n*E\n"})
public final class LazyStaggeredGridMeasurePolicyKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.f16969n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.f16970t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00d9 A[PHI: r3
      0x00d9: PHI (r3v40 androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider) = 
      (r3v38 androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider)
      (r3v41 androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider)
     binds: [B:68:0x00d7, B:64:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Function2 J2(final LazyStaggeredGridState lazyStaggeredGridState, final Function0 function0, final PaddingValues paddingValues, final boolean z2, final Orientation orientation, final float f3, float f4, final vd vdVar, LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, final GraphicsContext graphicsContext, Composer composer, int i2) {
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider2;
        boolean zP5;
        Object objIF;
        if (ComposerKt.v()) {
            ComposerKt.p5(1630140849, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:51)");
        }
        boolean z3 = false;
        boolean z4 = ((((i2 & 14) ^ 6) > 4 && composer.p5(lazyStaggeredGridState)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.p5(function0)) || (i2 & 48) == 32) | ((((i2 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(paddingValues)) || (i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && composer.n(z2)) || (i2 & 3072) == 2048) | ((((57344 & i2) ^ 24576) > 16384 && composer.p5(orientation)) || (i2 & 24576) == 16384) | ((((458752 & i2) ^ 196608) > 131072 && composer.rl(f3)) || (i2 & 196608) == 131072) | ((((3670016 & i2) ^ 1572864) > 1048576 && composer.rl(f4)) || (i2 & 1572864) == 1048576);
        if (((234881024 & i2) ^ 100663296) > 67108864) {
            lazyGridStaggeredGridSlotsProvider2 = lazyGridStaggeredGridSlotsProvider;
            if (composer.p5(lazyGridStaggeredGridSlotsProvider2)) {
                z3 = true;
            }
            zP5 = z4 | z3 | composer.p5(graphicsContext);
            objIF = composer.iF();
            if (!zP5 || objIF == Composer.INSTANCE.n()) {
                final LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider3 = lazyGridStaggeredGridSlotsProvider2;
                Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function2 = new Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ LazyStaggeredGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                        return n(lazyLayoutMeasureScope, constraints.getValue());
                    }

                    public final LazyStaggeredGridMeasureResult n(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j2) {
                        ObservableScopeInvalidator.n(lazyStaggeredGridState.getMeasurementScopeInvalidator());
                        boolean z5 = lazyStaggeredGridState.getHasLookaheadOccurred() || lazyLayoutMeasureScope.Org();
                        CheckScrollableContainerConstraintsKt.n(j2, orientation);
                        LazyStaggeredGridSlots lazyStaggeredGridSlotsN = lazyGridStaggeredGridSlotsProvider3.n(lazyLayoutMeasureScope, j2);
                        boolean z6 = orientation == Orientation.f16969n;
                        LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider = (LazyStaggeredGridItemProvider) function0.invoke();
                        int iHow = lazyLayoutMeasureScope.How(LazyStaggeredGridMeasurePolicyKt.O(paddingValues, orientation, z2, lazyLayoutMeasureScope.getLayoutDirection()));
                        int iHow2 = lazyLayoutMeasureScope.How(LazyStaggeredGridMeasurePolicyKt.nr(paddingValues, orientation, z2, lazyLayoutMeasureScope.getLayoutDirection()));
                        int iHow3 = lazyLayoutMeasureScope.How(LazyStaggeredGridMeasurePolicyKt.Uo(paddingValues, orientation, lazyLayoutMeasureScope.getLayoutDirection()));
                        int iGh = ((z6 ? Constraints.gh(j2) : Constraints.qie(j2)) - iHow) - iHow2;
                        long jJ2 = z6 ? IntOffset.J2((((long) iHow) & 4294967295L) | (((long) iHow3) << 32)) : IntOffset.J2((((long) iHow) << 32) | (((long) iHow3) & 4294967295L));
                        PaddingValues paddingValues2 = paddingValues;
                        int iHow4 = lazyLayoutMeasureScope.How(Dp.KN(PaddingKt.Uo(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()) + PaddingKt.J2(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection())));
                        PaddingValues paddingValues3 = paddingValues;
                        LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResultGh = LazyStaggeredGridMeasureKt.gh(lazyLayoutMeasureScope, lazyStaggeredGridState, LazyLayoutBeyondBoundsStateKt.n(lazyStaggeredGridItemProvider, lazyStaggeredGridState.getPinnedItems(), lazyStaggeredGridState.getBeyondBoundsInfo()), lazyStaggeredGridItemProvider, lazyStaggeredGridSlotsN, Constraints.nr(j2, ConstraintsKt.Uo(j2, iHow4), 0, ConstraintsKt.J2(j2, lazyLayoutMeasureScope.How(Dp.KN(paddingValues3.getTop() + paddingValues3.getBottom()))), 0, 10, null), z6, z2, jJ2, iGh, lazyLayoutMeasureScope.How(f3), iHow, iHow2, vdVar, z5, lazyLayoutMeasureScope.Org(), lazyStaggeredGridState.getApproachLayoutInfo(), graphicsContext);
                        LazyStaggeredGridState.qie(lazyStaggeredGridState, lazyStaggeredGridMeasureResultGh, lazyLayoutMeasureScope.Org(), false, 4, null);
                        return lazyStaggeredGridMeasureResultGh;
                    }
                };
                composer.o(function2);
                objIF = function2;
            }
            Function2 function22 = (Function2) objIF;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            return function22;
        }
        lazyGridStaggeredGridSlotsProvider2 = lazyGridStaggeredGridSlotsProvider;
        if ((i2 & 100663296) == 67108864) {
        }
        zP5 = z4 | z3 | composer.p5(graphicsContext);
        objIF = composer.iF();
        if (!zP5) {
            final LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider32 = lazyGridStaggeredGridSlotsProvider2;
            Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> function23 = new Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyStaggeredGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return n(lazyLayoutMeasureScope, constraints.getValue());
                }

                public final LazyStaggeredGridMeasureResult n(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j2) {
                    ObservableScopeInvalidator.n(lazyStaggeredGridState.getMeasurementScopeInvalidator());
                    boolean z5 = lazyStaggeredGridState.getHasLookaheadOccurred() || lazyLayoutMeasureScope.Org();
                    CheckScrollableContainerConstraintsKt.n(j2, orientation);
                    LazyStaggeredGridSlots lazyStaggeredGridSlotsN = lazyGridStaggeredGridSlotsProvider32.n(lazyLayoutMeasureScope, j2);
                    boolean z6 = orientation == Orientation.f16969n;
                    LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider = (LazyStaggeredGridItemProvider) function0.invoke();
                    int iHow = lazyLayoutMeasureScope.How(LazyStaggeredGridMeasurePolicyKt.O(paddingValues, orientation, z2, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iHow2 = lazyLayoutMeasureScope.How(LazyStaggeredGridMeasurePolicyKt.nr(paddingValues, orientation, z2, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iHow3 = lazyLayoutMeasureScope.How(LazyStaggeredGridMeasurePolicyKt.Uo(paddingValues, orientation, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iGh = ((z6 ? Constraints.gh(j2) : Constraints.qie(j2)) - iHow) - iHow2;
                    long jJ2 = z6 ? IntOffset.J2((((long) iHow) & 4294967295L) | (((long) iHow3) << 32)) : IntOffset.J2((((long) iHow) << 32) | (((long) iHow3) & 4294967295L));
                    PaddingValues paddingValues2 = paddingValues;
                    int iHow4 = lazyLayoutMeasureScope.How(Dp.KN(PaddingKt.Uo(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()) + PaddingKt.J2(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection())));
                    PaddingValues paddingValues3 = paddingValues;
                    LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResultGh = LazyStaggeredGridMeasureKt.gh(lazyLayoutMeasureScope, lazyStaggeredGridState, LazyLayoutBeyondBoundsStateKt.n(lazyStaggeredGridItemProvider, lazyStaggeredGridState.getPinnedItems(), lazyStaggeredGridState.getBeyondBoundsInfo()), lazyStaggeredGridItemProvider, lazyStaggeredGridSlotsN, Constraints.nr(j2, ConstraintsKt.Uo(j2, iHow4), 0, ConstraintsKt.J2(j2, lazyLayoutMeasureScope.How(Dp.KN(paddingValues3.getTop() + paddingValues3.getBottom()))), 0, 10, null), z6, z2, jJ2, iGh, lazyLayoutMeasureScope.How(f3), iHow, iHow2, vdVar, z5, lazyLayoutMeasureScope.Org(), lazyStaggeredGridState.getApproachLayoutInfo(), graphicsContext);
                    LazyStaggeredGridState.qie(lazyStaggeredGridState, lazyStaggeredGridMeasureResultGh, lazyLayoutMeasureScope.Org(), false, 4, null);
                    return lazyStaggeredGridMeasureResultGh;
                }
            };
            composer.o(function23);
            objIF = function23;
        }
        Function2 function222 = (Function2) objIF;
        if (ComposerKt.v()) {
        }
        return function222;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float O(PaddingValues paddingValues, Orientation orientation, boolean z2, LayoutDirection layoutDirection) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i2 == 1) {
            return z2 ? paddingValues.getBottom() : paddingValues.getTop();
        }
        if (i2 == 2) {
            return z2 ? PaddingKt.J2(paddingValues, layoutDirection) : PaddingKt.Uo(paddingValues, layoutDirection);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Uo(PaddingValues paddingValues, Orientation orientation, LayoutDirection layoutDirection) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i2 == 1) {
            return PaddingKt.Uo(paddingValues, layoutDirection);
        }
        if (i2 == 2) {
            return paddingValues.getTop();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float nr(PaddingValues paddingValues, Orientation orientation, boolean z2, LayoutDirection layoutDirection) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i2 == 1) {
            return z2 ? paddingValues.getTop() : paddingValues.getBottom();
        }
        if (i2 == 2) {
            return z2 ? PaddingKt.Uo(paddingValues, layoutDirection) : PaddingKt.J2(paddingValues, layoutDirection);
        }
        throw new NoWhenBranchMatchedException();
    }
}
