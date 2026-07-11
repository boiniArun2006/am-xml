package androidx.compose.foundation.pager;

import GJW.vd;
import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.exoplayer.RendererCapabilities;
import com.google.android.exoplayer2.C;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¡\u0001\u0010\u001f\u001a\u0019\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001a¢\u0006\u0002\b\u001e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Lkotlin/Function0;", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "itemProviderLambda", "Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "beyondViewportPageCount", "Landroidx/compose/ui/unit/Dp;", "pageSpacing", "Landroidx/compose/foundation/pager/PageSize;", "pageSize", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "snapPosition", "LGJW/vd;", "coroutineScope", "pageCount", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", c.f62177j, "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;LGJW/vd;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPagerMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,223:1\n1247#2,6:224\n*S KotlinDebug\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt\n*L\n58#1:224,6\n*E\n"})
public final class PagerMeasurePolicyKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0132 A[PHI: r3
      0x0132: PHI (r3v20 int) = (r3v18 int), (r3v21 int) binds: [B:104:0x0130, B:100:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074 A[PHI: r4
      0x0074: PHI (r4v17 androidx.compose.foundation.gestures.Orientation) = (r4v15 androidx.compose.foundation.gestures.Orientation), (r4v18 androidx.compose.foundation.gestures.Orientation) binds: [B:36:0x0072, B:32:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090 A[PHI: r9
      0x0090: PHI (r9v11 androidx.compose.ui.Alignment$Horizontal) = (r9v8 androidx.compose.ui.Alignment$Horizontal), (r9v12 androidx.compose.ui.Alignment$Horizontal) binds: [B:46:0x008e, B:42:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac A[PHI: r12
      0x00ac: PHI (r12v12 androidx.compose.ui.Alignment$Vertical) = (r12v9 androidx.compose.ui.Alignment$Vertical), (r12v13 androidx.compose.ui.Alignment$Vertical) binds: [B:56:0x00aa, B:52:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8 A[PHI: r13
      0x00c8: PHI (r13v12 float) = (r13v9 float), (r13v13 float) binds: [B:66:0x00c6, B:62:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4 A[PHI: r14
      0x00e4: PHI (r14v12 androidx.compose.foundation.pager.PageSize) = (r14v9 androidx.compose.foundation.pager.PageSize), (r14v13 androidx.compose.foundation.pager.PageSize) binds: [B:76:0x00e2, B:72:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe A[PHI: r5
      0x00fe: PHI (r5v8 androidx.compose.foundation.gestures.snapping.SnapPosition) = 
      (r5v6 androidx.compose.foundation.gestures.snapping.SnapPosition)
      (r5v9 androidx.compose.foundation.gestures.snapping.SnapPosition)
     binds: [B:86:0x00fc, B:82:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Function2 n(final Function0 function0, final PagerState pagerState, final PaddingValues paddingValues, final boolean z2, Orientation orientation, int i2, float f3, PageSize pageSize, Alignment.Horizontal horizontal, Alignment.Vertical vertical, SnapPosition snapPosition, final vd vdVar, final Function0 function02, Composer composer, int i3, int i5) {
        Orientation orientation2;
        boolean z3;
        Alignment.Horizontal horizontal2;
        boolean z4;
        Alignment.Vertical vertical2;
        boolean z5;
        float f4;
        boolean z6;
        PageSize pageSize2;
        boolean z7;
        SnapPosition snapPosition2;
        boolean z9;
        int i7;
        boolean z10;
        boolean zP5;
        Object objIF;
        if (ComposerKt.v()) {
            ComposerKt.p5(1391419623, i3, i5, "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:57)");
        }
        boolean z11 = ((((i3 & 112) ^ 48) > 32 && composer.p5(pagerState)) || (i3 & 48) == 32) | ((((i3 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(paddingValues)) || (i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | ((((i3 & 7168) ^ 3072) > 2048 && composer.n(z2)) || (i3 & 3072) == 2048);
        if (((57344 & i3) ^ 24576) > 16384) {
            orientation2 = orientation;
            if (composer.p5(orientation2)) {
                z3 = true;
            }
            boolean z12 = z11 | z3;
            if (((234881024 & i3) ^ 100663296) <= 67108864) {
                horizontal2 = horizontal;
                if (composer.p5(horizontal2)) {
                    z4 = true;
                }
                boolean z13 = z12 | z4;
                if (((1879048192 & i3) ^ C.ENCODING_PCM_32BIT) > 536870912) {
                    vertical2 = vertical;
                    if (composer.p5(vertical2)) {
                        z5 = true;
                    }
                    boolean z14 = z13 | z5;
                    if (((3670016 & i3) ^ 1572864) <= 1048576) {
                        f4 = f3;
                        if (composer.rl(f4)) {
                            z6 = true;
                        }
                        boolean z15 = z14 | z6;
                        if (((29360128 & i3) ^ 12582912) > 8388608) {
                            pageSize2 = pageSize;
                            if (composer.p5(pageSize2)) {
                                z7 = true;
                            }
                            boolean z16 = z15 | z7;
                            if (((i5 & 14) ^ 6) <= 4) {
                                snapPosition2 = snapPosition;
                                if (composer.p5(snapPosition2)) {
                                    z9 = true;
                                }
                                boolean z17 = ((((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(function02)) || (i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | z16 | z9;
                                if (((458752 & i3) ^ 196608) > 131072) {
                                    i7 = i2;
                                    if (composer.t(i7)) {
                                        z10 = true;
                                    }
                                    zP5 = z17 | z10 | composer.p5(vdVar);
                                    objIF = composer.iF();
                                    if (!zP5 || objIF == Composer.INSTANCE.n()) {
                                        final int i8 = i7;
                                        final SnapPosition snapPosition3 = snapPosition2;
                                        final Alignment.Horizontal horizontal3 = horizontal2;
                                        final Alignment.Vertical vertical3 = vertical2;
                                        final float f5 = f4;
                                        final PageSize pageSize3 = pageSize2;
                                        final Orientation orientation3 = orientation2;
                                        Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult> function2 = new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                                                return n(lazyLayoutMeasureScope, constraints.getValue());
                                            }

                                            public final PagerMeasureResult n(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j2) {
                                                long jJ2;
                                                ObservableScopeInvalidator.n(pagerState.getMeasurementScopeInvalidator());
                                                Orientation orientation4 = orientation3;
                                                Orientation orientation5 = Orientation.f16969n;
                                                boolean z18 = orientation4 == orientation5;
                                                CheckScrollableContainerConstraintsKt.n(j2, z18 ? orientation5 : Orientation.f16970t);
                                                int iHow = z18 ? lazyLayoutMeasureScope.How(paddingValues.rl(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.How(PaddingKt.Uo(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                                int iHow2 = z18 ? lazyLayoutMeasureScope.How(paddingValues.t(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.How(PaddingKt.J2(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                                int iHow3 = lazyLayoutMeasureScope.How(paddingValues.getTop());
                                                int iHow4 = lazyLayoutMeasureScope.How(paddingValues.getBottom());
                                                final int i9 = iHow3 + iHow4;
                                                final int i10 = iHow + iHow2;
                                                int i11 = z18 ? i9 : i10;
                                                int i12 = (!z18 || z2) ? (z18 && z2) ? iHow4 : (z18 || z2) ? iHow2 : iHow : iHow3;
                                                int i13 = i11 - i12;
                                                long jXMQ = ConstraintsKt.xMQ(j2, -i10, -i9);
                                                pagerState.k(lazyLayoutMeasureScope);
                                                int iHow5 = lazyLayoutMeasureScope.How(f5);
                                                int iGh = z18 ? Constraints.gh(j2) - i9 : Constraints.qie(j2) - i10;
                                                if (!z2 || iGh > 0) {
                                                    jJ2 = IntOffset.J2((((long) iHow) << 32) | (((long) iHow3) & 4294967295L));
                                                } else {
                                                    if (!z18) {
                                                        iHow += iGh;
                                                    }
                                                    if (z18) {
                                                        iHow3 += iGh;
                                                    }
                                                    jJ2 = IntOffset.J2((((long) iHow3) & 4294967295L) | (((long) iHow) << 32));
                                                }
                                                long j3 = jJ2;
                                                int iCoerceAtLeast = RangesKt.coerceAtLeast(pageSize3.n(lazyLayoutMeasureScope, iGh, iHow5), 0);
                                                pagerState.dR0(ConstraintsKt.rl(0, orientation3 == orientation5 ? Constraints.qie(jXMQ) : iCoerceAtLeast, 0, orientation3 != orientation5 ? Constraints.gh(jXMQ) : iCoerceAtLeast, 5, null));
                                                PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider = (PagerLazyLayoutItemProvider) function0.invoke();
                                                int i14 = iGh + i12 + i13;
                                                Snapshot.Companion companion = Snapshot.INSTANCE;
                                                PagerState pagerState2 = pagerState;
                                                SnapPosition snapPosition4 = snapPosition3;
                                                Snapshot snapshotNr = companion.nr();
                                                Function1 readObserver = snapshotNr != null ? snapshotNr.getReadObserver() : null;
                                                Snapshot snapshotO = companion.O(snapshotNr);
                                                try {
                                                    int iM = pagerState2.M(pagerLazyLayoutItemProvider, pagerState2.S());
                                                    int iUo = PagerKt.Uo(snapPosition4, i14, iCoerceAtLeast, iHow5, i12, i13, pagerState2.S(), pagerState2.WPU(), pagerState2.T());
                                                    Unit unit = Unit.INSTANCE;
                                                    companion.az(snapshotNr, snapshotO, readObserver);
                                                    PagerMeasureResult pagerMeasureResultKN = PagerMeasureKt.KN(lazyLayoutMeasureScope, ((Number) function02.invoke()).intValue(), pagerLazyLayoutItemProvider, iGh, i12, i13, iHow5, iM, iUo, jXMQ, orientation3, vertical3, horizontal3, z2, j3, iCoerceAtLeast, i8, LazyLayoutBeyondBoundsStateKt.n(pagerLazyLayoutItemProvider, pagerState.getPinnedPages(), pagerState.getBeyondBoundsInfo()), snapPosition3, pagerState.getPlacementScopeInvalidator(), vdVar, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                                            return n(num.intValue(), num2.intValue(), function1);
                                                        }

                                                        public final MeasureResult n(int i15, int i16, Function1 function1) {
                                                            return lazyLayoutMeasureScope.Zn(ConstraintsKt.Uo(j2, i15 + i10), ConstraintsKt.J2(j2, i16 + i9), MapsKt.emptyMap(), function1);
                                                        }
                                                    });
                                                    PagerState.ck(pagerState, pagerMeasureResultKN, lazyLayoutMeasureScope.Org(), false, 4, null);
                                                    return pagerMeasureResultKN;
                                                } catch (Throwable th) {
                                                    companion.az(snapshotNr, snapshotO, readObserver);
                                                    throw th;
                                                }
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
                                i7 = i2;
                                if ((i3 & 196608) != 131072) {
                                    z10 = false;
                                }
                                zP5 = z17 | z10 | composer.p5(vdVar);
                                objIF = composer.iF();
                                if (!zP5) {
                                    final int i82 = i7;
                                    final SnapPosition snapPosition32 = snapPosition2;
                                    final Alignment.Horizontal horizontal32 = horizontal2;
                                    final Alignment.Vertical vertical32 = vertical2;
                                    final float f53 = f4;
                                    final PageSize pageSize32 = pageSize2;
                                    final Orientation orientation32 = orientation2;
                                    Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult> function23 = new Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                                            return n(lazyLayoutMeasureScope, constraints.getValue());
                                        }

                                        public final PagerMeasureResult n(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j2) {
                                            long jJ2;
                                            ObservableScopeInvalidator.n(pagerState.getMeasurementScopeInvalidator());
                                            Orientation orientation4 = orientation32;
                                            Orientation orientation5 = Orientation.f16969n;
                                            boolean z18 = orientation4 == orientation5;
                                            CheckScrollableContainerConstraintsKt.n(j2, z18 ? orientation5 : Orientation.f16970t);
                                            int iHow = z18 ? lazyLayoutMeasureScope.How(paddingValues.rl(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.How(PaddingKt.Uo(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                            int iHow2 = z18 ? lazyLayoutMeasureScope.How(paddingValues.t(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.How(PaddingKt.J2(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                            int iHow3 = lazyLayoutMeasureScope.How(paddingValues.getTop());
                                            int iHow4 = lazyLayoutMeasureScope.How(paddingValues.getBottom());
                                            final int i9 = iHow3 + iHow4;
                                            final int i10 = iHow + iHow2;
                                            int i11 = z18 ? i9 : i10;
                                            int i12 = (!z18 || z2) ? (z18 && z2) ? iHow4 : (z18 || z2) ? iHow2 : iHow : iHow3;
                                            int i13 = i11 - i12;
                                            long jXMQ = ConstraintsKt.xMQ(j2, -i10, -i9);
                                            pagerState.k(lazyLayoutMeasureScope);
                                            int iHow5 = lazyLayoutMeasureScope.How(f53);
                                            int iGh = z18 ? Constraints.gh(j2) - i9 : Constraints.qie(j2) - i10;
                                            if (!z2 || iGh > 0) {
                                                jJ2 = IntOffset.J2((((long) iHow) << 32) | (((long) iHow3) & 4294967295L));
                                            } else {
                                                if (!z18) {
                                                    iHow += iGh;
                                                }
                                                if (z18) {
                                                    iHow3 += iGh;
                                                }
                                                jJ2 = IntOffset.J2((((long) iHow3) & 4294967295L) | (((long) iHow) << 32));
                                            }
                                            long j3 = jJ2;
                                            int iCoerceAtLeast = RangesKt.coerceAtLeast(pageSize32.n(lazyLayoutMeasureScope, iGh, iHow5), 0);
                                            pagerState.dR0(ConstraintsKt.rl(0, orientation32 == orientation5 ? Constraints.qie(jXMQ) : iCoerceAtLeast, 0, orientation32 != orientation5 ? Constraints.gh(jXMQ) : iCoerceAtLeast, 5, null));
                                            PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider = (PagerLazyLayoutItemProvider) function0.invoke();
                                            int i14 = iGh + i12 + i13;
                                            Snapshot.Companion companion = Snapshot.INSTANCE;
                                            PagerState pagerState2 = pagerState;
                                            SnapPosition snapPosition4 = snapPosition32;
                                            Snapshot snapshotNr = companion.nr();
                                            Function1 readObserver = snapshotNr != null ? snapshotNr.getReadObserver() : null;
                                            Snapshot snapshotO = companion.O(snapshotNr);
                                            try {
                                                int iM = pagerState2.M(pagerLazyLayoutItemProvider, pagerState2.S());
                                                int iUo = PagerKt.Uo(snapPosition4, i14, iCoerceAtLeast, iHow5, i12, i13, pagerState2.S(), pagerState2.WPU(), pagerState2.T());
                                                Unit unit = Unit.INSTANCE;
                                                companion.az(snapshotNr, snapshotO, readObserver);
                                                PagerMeasureResult pagerMeasureResultKN = PagerMeasureKt.KN(lazyLayoutMeasureScope, ((Number) function02.invoke()).intValue(), pagerLazyLayoutItemProvider, iGh, i12, i13, iHow5, iM, iUo, jXMQ, orientation32, vertical32, horizontal32, z2, j3, iCoerceAtLeast, i82, LazyLayoutBeyondBoundsStateKt.n(pagerLazyLayoutItemProvider, pagerState.getPinnedPages(), pagerState.getBeyondBoundsInfo()), snapPosition32, pagerState.getPlacementScopeInvalidator(), vdVar, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                                        return n(num.intValue(), num2.intValue(), function1);
                                                    }

                                                    public final MeasureResult n(int i15, int i16, Function1 function1) {
                                                        return lazyLayoutMeasureScope.Zn(ConstraintsKt.Uo(j2, i15 + i10), ConstraintsKt.J2(j2, i16 + i9), MapsKt.emptyMap(), function1);
                                                    }
                                                });
                                                PagerState.ck(pagerState, pagerMeasureResultKN, lazyLayoutMeasureScope.Org(), false, 4, null);
                                                return pagerMeasureResultKN;
                                            } catch (Throwable th) {
                                                companion.az(snapshotNr, snapshotO, readObserver);
                                                throw th;
                                            }
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
                            snapPosition2 = snapPosition;
                            if ((i5 & 6) == 4) {
                                z9 = false;
                            }
                            boolean z172 = ((((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(function02)) || (i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | z16 | z9;
                            if (((458752 & i3) ^ 196608) > 131072) {
                            }
                            if ((i3 & 196608) != 131072) {
                            }
                            zP5 = z172 | z10 | composer.p5(vdVar);
                            objIF = composer.iF();
                            if (!zP5) {
                            }
                            Function2 function2222 = (Function2) objIF;
                            if (ComposerKt.v()) {
                            }
                            return function2222;
                        }
                        pageSize2 = pageSize;
                        if ((12582912 & i3) != 8388608) {
                            z7 = false;
                        }
                        boolean z162 = z15 | z7;
                        if (((i5 & 14) ^ 6) <= 4) {
                        }
                        if ((i5 & 6) == 4) {
                        }
                        boolean z1722 = ((((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(function02)) || (i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | z162 | z9;
                        if (((458752 & i3) ^ 196608) > 131072) {
                        }
                        if ((i3 & 196608) != 131072) {
                        }
                        zP5 = z1722 | z10 | composer.p5(vdVar);
                        objIF = composer.iF();
                        if (!zP5) {
                        }
                        Function2 function22222 = (Function2) objIF;
                        if (ComposerKt.v()) {
                        }
                        return function22222;
                    }
                    f4 = f3;
                    if ((1572864 & i3) == 1048576) {
                        z6 = false;
                    }
                    boolean z152 = z14 | z6;
                    if (((29360128 & i3) ^ 12582912) > 8388608) {
                    }
                    if ((12582912 & i3) != 8388608) {
                    }
                    boolean z1622 = z152 | z7;
                    if (((i5 & 14) ^ 6) <= 4) {
                    }
                    if ((i5 & 6) == 4) {
                    }
                    boolean z17222 = ((((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(function02)) || (i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | z1622 | z9;
                    if (((458752 & i3) ^ 196608) > 131072) {
                    }
                    if ((i3 & 196608) != 131072) {
                    }
                    zP5 = z17222 | z10 | composer.p5(vdVar);
                    objIF = composer.iF();
                    if (!zP5) {
                    }
                    Function2 function222222 = (Function2) objIF;
                    if (ComposerKt.v()) {
                    }
                    return function222222;
                }
                vertical2 = vertical;
                if ((805306368 & i3) != 536870912) {
                    z5 = false;
                }
                boolean z142 = z13 | z5;
                if (((3670016 & i3) ^ 1572864) <= 1048576) {
                }
                if ((1572864 & i3) == 1048576) {
                }
                boolean z1522 = z142 | z6;
                if (((29360128 & i3) ^ 12582912) > 8388608) {
                }
                if ((12582912 & i3) != 8388608) {
                }
                boolean z16222 = z1522 | z7;
                if (((i5 & 14) ^ 6) <= 4) {
                }
                if ((i5 & 6) == 4) {
                }
                boolean z172222 = ((((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(function02)) || (i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | z16222 | z9;
                if (((458752 & i3) ^ 196608) > 131072) {
                }
                if ((i3 & 196608) != 131072) {
                }
                zP5 = z172222 | z10 | composer.p5(vdVar);
                objIF = composer.iF();
                if (!zP5) {
                }
                Function2 function2222222 = (Function2) objIF;
                if (ComposerKt.v()) {
                }
                return function2222222;
            }
            horizontal2 = horizontal;
            if ((100663296 & i3) == 67108864) {
                z4 = false;
            }
            boolean z132 = z12 | z4;
            if (((1879048192 & i3) ^ C.ENCODING_PCM_32BIT) > 536870912) {
            }
            if ((805306368 & i3) != 536870912) {
            }
            boolean z1422 = z132 | z5;
            if (((3670016 & i3) ^ 1572864) <= 1048576) {
            }
            if ((1572864 & i3) == 1048576) {
            }
            boolean z15222 = z1422 | z6;
            if (((29360128 & i3) ^ 12582912) > 8388608) {
            }
            if ((12582912 & i3) != 8388608) {
            }
            boolean z162222 = z15222 | z7;
            if (((i5 & 14) ^ 6) <= 4) {
            }
            if ((i5 & 6) == 4) {
            }
            boolean z1722222 = ((((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(function02)) || (i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | z162222 | z9;
            if (((458752 & i3) ^ 196608) > 131072) {
            }
            if ((i3 & 196608) != 131072) {
            }
            zP5 = z1722222 | z10 | composer.p5(vdVar);
            objIF = composer.iF();
            if (!zP5) {
            }
            Function2 function22222222 = (Function2) objIF;
            if (ComposerKt.v()) {
            }
            return function22222222;
        }
        orientation2 = orientation;
        if ((i3 & 24576) != 16384) {
            z3 = false;
        }
        boolean z122 = z11 | z3;
        if (((234881024 & i3) ^ 100663296) <= 67108864) {
        }
        if ((100663296 & i3) == 67108864) {
        }
        boolean z1322 = z122 | z4;
        if (((1879048192 & i3) ^ C.ENCODING_PCM_32BIT) > 536870912) {
        }
        if ((805306368 & i3) != 536870912) {
        }
        boolean z14222 = z1322 | z5;
        if (((3670016 & i3) ^ 1572864) <= 1048576) {
        }
        if ((1572864 & i3) == 1048576) {
        }
        boolean z152222 = z14222 | z6;
        if (((29360128 & i3) ^ 12582912) > 8388608) {
        }
        if ((12582912 & i3) != 8388608) {
        }
        boolean z1622222 = z152222 | z7;
        if (((i5 & 14) ^ 6) <= 4) {
        }
        if ((i5 & 6) == 4) {
        }
        boolean z17222222 = ((((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(function02)) || (i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | z1622222 | z9;
        if (((458752 & i3) ^ 196608) > 131072) {
        }
        if ((i3 & 196608) != 131072) {
        }
        zP5 = z17222222 | z10 | composer.p5(vdVar);
        objIF = composer.iF();
        if (!zP5) {
        }
        Function2 function222222222 = (Function2) objIF;
        if (ComposerKt.v()) {
        }
        return function222222222;
    }
}
