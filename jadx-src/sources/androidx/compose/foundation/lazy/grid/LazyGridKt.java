package androidx.compose.foundation.lazy.grid;

import GJW.vd;
import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.StickyItemsPlacement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008a\u0001\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u008a\u0001\u0010(\u001a\u0019\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0$¢\u0006\u0002\b\u00172\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0003¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "slots", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "isVertical", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProviderLambda", "LGJW/vd;", "coroutineScope", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "stickyItemsScrollBehavior", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "rl", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;LGJW/vd;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,422:1\n113#2:423\n557#3:424\n554#3,6:425\n1247#4,3:431\n1250#4,3:435\n1247#4,6:440\n555#5:434\n75#6:438\n75#6:439\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n*L\n66#1:423\n88#1:424\n88#1:425,6\n88#1:431,3\n88#1:435,3\n180#1:440,6\n88#1:434\n89#1:438\n90#1:439\n*E\n"})
public final class LazyGridKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(Modifier modifier, final LazyGridState lazyGridState, final LazyGridSlotsProvider lazyGridSlotsProvider, PaddingValues paddingValues, boolean z2, final boolean z3, FlingBehavior flingBehavior, final boolean z4, final OverscrollEffect overscrollEffect, final Arrangement.Vertical vertical, final Arrangement.Horizontal horizontal, final Function1 function1, Composer composer, final int i2, final int i3, final int i5) {
        Modifier modifier2;
        int i7;
        PaddingValues paddingValues2;
        int i8;
        boolean z5;
        FlingBehavior flingBehavior2;
        int i9;
        int i10;
        final PaddingValues paddingValues3;
        final boolean z6;
        final Modifier modifier3;
        final FlingBehavior flingBehavior3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Modifier modifier4;
        PaddingValues paddingValuesN;
        boolean z7;
        FlingBehavior flingBehaviorN;
        int i11;
        Object objIF;
        Modifier modifierRl;
        Composer composerKN = composer.KN(708740370);
        int i12 = i5 & 1;
        if (i12 != 0) {
            i7 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i7 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= composerKN.p5(lazyGridState) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= (i2 & 512) == 0 ? composerKN.p5(lazyGridSlotsProvider) : composerKN.E2(lazyGridSlotsProvider) ? 256 : 128;
        }
        int i13 = i5 & 8;
        if (i13 != 0) {
            i7 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                paddingValues2 = paddingValues;
                i7 |= composerKN.p5(paddingValues2) ? 2048 : 1024;
            }
            i8 = i5 & 16;
            if (i8 == 0) {
                i7 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    z5 = z2;
                    i7 |= composerKN.n(z5) ? 16384 : 8192;
                }
                if ((i5 & 32) != 0) {
                    i7 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i7 |= composerKN.n(z3) ? 131072 : 65536;
                }
                if ((i2 & 1572864) == 0) {
                    flingBehavior2 = flingBehavior;
                    i7 |= ((i5 & 64) == 0 && composerKN.p5(flingBehavior2)) ? 1048576 : 524288;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if ((i5 & 128) != 0) {
                    i7 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i7 |= composerKN.n(z4) ? 8388608 : 4194304;
                }
                if ((i5 & 256) != 0) {
                    i7 |= 100663296;
                } else {
                    if ((i2 & 100663296) == 0) {
                        i7 |= composerKN.p5(overscrollEffect) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    if ((i5 & 512) != 0) {
                        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i7 |= composerKN.p5(vertical) ? 536870912 : 268435456;
                        }
                        if ((i5 & 1024) != 0) {
                            i9 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i9 = i3 | (composerKN.p5(horizontal) ? 4 : 2);
                        } else {
                            i9 = i3;
                        }
                        if ((i5 & 2048) != 0) {
                            i9 |= 48;
                        } else if ((i3 & 48) == 0) {
                            i9 |= composerKN.E2(function1) ? 32 : 16;
                        }
                        i10 = i9;
                        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i10 & 19) == 18) ? false : true, i7 & 1)) {
                            composerKN.e();
                            if ((i2 & 1) == 0 || composerKN.rV9()) {
                                modifier4 = i12 != 0 ? Modifier.INSTANCE : modifier2;
                                paddingValuesN = i13 != 0 ? PaddingKt.n(Dp.KN(0)) : paddingValues2;
                                z7 = i8 == 0 ? z5 : false;
                                if ((i5 & 64) != 0) {
                                    flingBehaviorN = ScrollableDefaults.f17001n.n(composerKN, 6);
                                    i11 = i7 & (-3670017);
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(708740370, i11, i10, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:82)");
                                }
                                int i14 = (i11 >> 3) & 14;
                                Function0 function0N = LazyGridItemProviderKt.n(lazyGridState, function1, composerKN, (i10 & 112) | i14);
                                int i15 = i11 >> 9;
                                LazyLayoutSemanticState lazyLayoutSemanticStateN = LazySemanticsKt.n(lazyGridState, z7, composerKN, (i15 & 112) | i14);
                                objIF = composerKN.iF();
                                if (objIF == Composer.INSTANCE.n()) {
                                    objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                                    composerKN.o(objIF);
                                }
                                Modifier modifier5 = modifier4;
                                int i16 = i11;
                                Function2 function2Rl = rl(function0N, lazyGridState, lazyGridSlotsProvider, paddingValuesN, z7, z3, horizontal, vertical, (vd) objIF, (GraphicsContext) composerKN.ty(CompositionLocalsKt.mUb()), ((Boolean) composerKN.ty(CompositionLocalsKt.ck())).booleanValue() ? StickyItemsPlacement.INSTANCE.n() : null, composerKN, ((i10 << 18) & 3670016) | (524272 & i11) | ((i11 >> 6) & 29360128), 0);
                                PaddingValues paddingValues4 = paddingValuesN;
                                Orientation orientation = !z3 ? Orientation.f16969n : Orientation.f16970t;
                                if (z4) {
                                    composerKN.eF(-1614595456);
                                    composerKN.Xw();
                                    modifierRl = Modifier.INSTANCE;
                                } else {
                                    composerKN.eF(-1614890700);
                                    modifierRl = LazyLayoutBeyondBoundsModifierLocalKt.rl(Modifier.INSTANCE, LazyGridBeyondBoundsModifierKt.n(lazyGridState, composerKN, i14), lazyGridState.getBeyondBoundsInfo(), z7, orientation);
                                    composerKN.Xw();
                                }
                                boolean z9 = z7;
                                FlingBehavior flingBehavior4 = flingBehaviorN;
                                LazyLayoutKt.n(function0N, ScrollingContainerKt.n(LazyLayoutSemanticsKt.t(modifier5.Zmq(lazyGridState.getRemeasurementModifier()).Zmq(lazyGridState.getAwaitLayoutModifier()), function0N, lazyLayoutSemanticStateN, orientation, z4, z9, composerKN, (i15 & 57344) | ((i16 << 3) & 458752)).Zmq(modifierRl).Zmq(lazyGridState.getItemAnimator().getModifier()), lazyGridState, orientation, z4, z9, flingBehavior4, lazyGridState.getInternalInteractionSource(), false, overscrollEffect, (256 & 256) != 0 ? null : null), lazyGridState.getPrefetchState(), function2Rl, composerKN, 0, 0);
                                composerKN = composerKN;
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                flingBehavior3 = flingBehavior4;
                                z6 = z9;
                                paddingValues3 = paddingValues4;
                                modifier3 = modifier5;
                            } else {
                                composerKN.wTp();
                                if ((i5 & 64) != 0) {
                                    i7 &= -3670017;
                                }
                                paddingValuesN = paddingValues2;
                                z7 = z5;
                                modifier4 = modifier2;
                            }
                            i11 = i7;
                            flingBehaviorN = flingBehavior2;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            int i142 = (i11 >> 3) & 14;
                            Function0 function0N2 = LazyGridItemProviderKt.n(lazyGridState, function1, composerKN, (i10 & 112) | i142);
                            int i152 = i11 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateN2 = LazySemanticsKt.n(lazyGridState, z7, composerKN, (i152 & 112) | i142);
                            objIF = composerKN.iF();
                            if (objIF == Composer.INSTANCE.n()) {
                            }
                            Modifier modifier52 = modifier4;
                            int i162 = i11;
                            Function2 function2Rl2 = rl(function0N2, lazyGridState, lazyGridSlotsProvider, paddingValuesN, z7, z3, horizontal, vertical, (vd) objIF, (GraphicsContext) composerKN.ty(CompositionLocalsKt.mUb()), ((Boolean) composerKN.ty(CompositionLocalsKt.ck())).booleanValue() ? StickyItemsPlacement.INSTANCE.n() : null, composerKN, ((i10 << 18) & 3670016) | (524272 & i11) | ((i11 >> 6) & 29360128), 0);
                            PaddingValues paddingValues42 = paddingValuesN;
                            Orientation orientation2 = !z3 ? Orientation.f16969n : Orientation.f16970t;
                            if (z4) {
                            }
                            boolean z92 = z7;
                            FlingBehavior flingBehavior42 = flingBehaviorN;
                            LazyLayoutKt.n(function0N2, ScrollingContainerKt.n(LazyLayoutSemanticsKt.t(modifier52.Zmq(lazyGridState.getRemeasurementModifier()).Zmq(lazyGridState.getAwaitLayoutModifier()), function0N2, lazyLayoutSemanticStateN2, orientation2, z4, z92, composerKN, (i152 & 57344) | ((i162 << 3) & 458752)).Zmq(modifierRl).Zmq(lazyGridState.getItemAnimator().getModifier()), lazyGridState, orientation2, z4, z92, flingBehavior42, lazyGridState.getInternalInteractionSource(), false, overscrollEffect, (256 & 256) != 0 ? null : null), lazyGridState.getPrefetchState(), function2Rl2, composerKN, 0, 0);
                            composerKN = composerKN;
                            if (ComposerKt.v()) {
                            }
                            flingBehavior3 = flingBehavior42;
                            z6 = z92;
                            paddingValues3 = paddingValues42;
                            modifier3 = modifier52;
                        } else {
                            composerKN.wTp();
                            paddingValues3 = paddingValues2;
                            z6 = z5;
                            modifier3 = modifier2;
                            flingBehavior3 = flingBehavior2;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    n(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer2, int i17) {
                                    LazyGridKt.n(modifier3, lazyGridState, lazyGridSlotsProvider, paddingValues3, z6, z3, flingBehavior3, z4, overscrollEffect, vertical, horizontal, function1, composer2, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    if ((i5 & 1024) != 0) {
                    }
                    if ((i5 & 2048) != 0) {
                    }
                    i10 = i9;
                    if (composerKN.HI(((i7 & 306783379) == 306783378 && (i10 & 19) == 18) ? false : true, i7 & 1)) {
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                if ((i5 & 512) != 0) {
                }
                if ((i5 & 1024) != 0) {
                }
                if ((i5 & 2048) != 0) {
                }
                i10 = i9;
                if (composerKN.HI(((i7 & 306783379) == 306783378 && (i10 & 19) == 18) ? false : true, i7 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            z5 = z2;
            if ((i5 & 32) != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((i5 & 128) != 0) {
            }
            if ((i5 & 256) != 0) {
            }
            if ((i5 & 512) != 0) {
            }
            if ((i5 & 1024) != 0) {
            }
            if ((i5 & 2048) != 0) {
            }
            i10 = i9;
            if (composerKN.HI(((i7 & 306783379) == 306783378 && (i10 & 19) == 18) ? false : true, i7 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        paddingValues2 = paddingValues;
        i8 = i5 & 16;
        if (i8 == 0) {
        }
        z5 = z2;
        if ((i5 & 32) != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i5 & 128) != 0) {
        }
        if ((i5 & 256) != 0) {
        }
        if ((i5 & 512) != 0) {
        }
        if ((i5 & 1024) != 0) {
        }
        if ((i5 & 2048) != 0) {
        }
        i10 = i9;
        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i10 & 19) == 18) ? false : true, i7 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008f A[PHI: r3
      0x008f: PHI (r3v23 boolean) = (r3v21 boolean), (r3v24 boolean) binds: [B:44:0x008d, B:40:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Function2 rl(final Function0 function0, final LazyGridState lazyGridState, final LazyGridSlotsProvider lazyGridSlotsProvider, final PaddingValues paddingValues, final boolean z2, boolean z3, final Arrangement.Horizontal horizontal, final Arrangement.Vertical vertical, final vd vdVar, final GraphicsContext graphicsContext, final StickyItemsPlacement stickyItemsPlacement, Composer composer, int i2, int i3) {
        boolean z4;
        boolean z5;
        boolean zP5;
        Object objIF;
        if (ComposerKt.v()) {
            ComposerKt.p5(-2025385037, i2, i3, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:179)");
        }
        boolean z6 = ((((i2 & 112) ^ 48) > 32 && composer.p5(lazyGridState)) || (i2 & 48) == 32) | ((((i2 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(lazyGridSlotsProvider)) || (i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && composer.p5(paddingValues)) || (i2 & 3072) == 2048) | ((((57344 & i2) ^ 24576) > 16384 && composer.n(z2)) || (i2 & 24576) == 16384);
        if (((458752 & i2) ^ 196608) > 131072) {
            z4 = z3;
            if (composer.n(z4)) {
                z5 = true;
            }
            zP5 = z6 | z5 | ((((3670016 & i2) ^ 1572864) <= 1048576 && composer.p5(horizontal)) || (i2 & 1572864) == 1048576) | ((((29360128 & i2) ^ 12582912) <= 8388608 && composer.p5(vertical)) || (i2 & 12582912) == 8388608) | composer.p5(graphicsContext);
            objIF = composer.iF();
            if (!zP5 || objIF == Composer.INSTANCE.n()) {
                final boolean z7 = z4;
                Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult> function2 = new Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ LazyGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                        return n(lazyLayoutMeasureScope, constraints.getValue());
                    }

                    /* JADX WARN: Type inference failed for: r23v1, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider] */
                    /* JADX WARN: Type inference failed for: r28v0, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider] */
                    public final LazyGridMeasureResult n(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j2) {
                        float spacing;
                        long jJ2;
                        int iNr;
                        int i5;
                        int iO;
                        ObservableScopeInvalidator.n(lazyGridState.getMeasurementScopeInvalidator());
                        boolean z9 = lazyGridState.getHasLookaheadOccurred() || lazyLayoutMeasureScope.Org();
                        CheckScrollableContainerConstraintsKt.n(j2, z7 ? Orientation.f16969n : Orientation.f16970t);
                        int iHow = z7 ? lazyLayoutMeasureScope.How(paddingValues.rl(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.How(PaddingKt.Uo(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                        int iHow2 = z7 ? lazyLayoutMeasureScope.How(paddingValues.t(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.How(PaddingKt.J2(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                        int iHow3 = lazyLayoutMeasureScope.How(paddingValues.getTop());
                        int iHow4 = lazyLayoutMeasureScope.How(paddingValues.getBottom());
                        final int i7 = iHow3 + iHow4;
                        final int i8 = iHow + iHow2;
                        boolean z10 = z7;
                        int i9 = z10 ? i7 : i8;
                        if (z10 && !z2) {
                            iHow4 = iHow3;
                        } else if (!z10 || !z2) {
                            iHow4 = (z10 || z2) ? iHow2 : iHow;
                        }
                        final int i10 = i9 - iHow4;
                        long jXMQ = ConstraintsKt.xMQ(j2, -i8, -i7);
                        final LazyGridItemProvider lazyGridItemProvider = (LazyGridItemProvider) function0.invoke();
                        final LazyGridSpanLayoutProvider lazyGridSpanLayoutProviderMUb = lazyGridItemProvider.mUb();
                        final LazyGridSlots lazyGridSlotsN = lazyGridSlotsProvider.n(lazyLayoutMeasureScope, jXMQ);
                        int length = lazyGridSlotsN.getSizes().length;
                        lazyGridSpanLayoutProviderMUb.KN(length);
                        if (z7) {
                            Arrangement.Vertical vertical2 = vertical;
                            if (vertical2 == null) {
                                InlineClassHelperKt.rl("null verticalArrangement when isVertical == true");
                                throw new KotlinNothingValueException();
                            }
                            spacing = vertical2.getSpacing();
                        } else {
                            Arrangement.Horizontal horizontal2 = horizontal;
                            if (horizontal2 == null) {
                                InlineClassHelperKt.rl("null horizontalArrangement when isVertical == false");
                                throw new KotlinNothingValueException();
                            }
                            spacing = horizontal2.getSpacing();
                        }
                        final int iHow5 = lazyLayoutMeasureScope.How(spacing);
                        final int iN = lazyGridItemProvider.n();
                        int iGh = z7 ? Constraints.gh(j2) - i7 : Constraints.qie(j2) - i8;
                        if (!z2 || iGh > 0) {
                            jJ2 = IntOffset.J2((((long) iHow) << 32) | (((long) iHow3) & 4294967295L));
                        } else {
                            boolean z11 = z7;
                            if (!z11) {
                                iHow += iGh;
                            }
                            if (z11) {
                                iHow3 += iGh;
                            }
                            jJ2 = IntOffset.J2((((long) iHow) << 32) | (((long) iHow3) & 4294967295L));
                        }
                        final int i11 = iHow4;
                        final LazyGridState lazyGridState2 = lazyGridState;
                        final boolean z12 = z7;
                        final boolean z13 = z2;
                        final long j3 = jJ2;
                        final ?? r28 = new LazyGridMeasuredItemProvider(lazyGridItemProvider, lazyLayoutMeasureScope, iHow5, lazyGridState2, z12, z13, i11, i10, j3) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
                            final /* synthetic */ boolean J2;
                            final /* synthetic */ int KN;

                            /* JADX INFO: renamed from: O, reason: collision with root package name */
                            final /* synthetic */ LazyGridState f18288O;
                            final /* synthetic */ boolean Uo;
                            final /* synthetic */ long mUb;
                            final /* synthetic */ LazyLayoutMeasureScope nr;
                            final /* synthetic */ int xMQ;

                            {
                                this.nr = lazyLayoutMeasureScope;
                                this.f18288O = lazyGridState2;
                                this.J2 = z12;
                                this.Uo = z13;
                                this.KN = i11;
                                this.xMQ = i10;
                                this.mUb = j3;
                            }

                            @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
                            public LazyGridMeasuredItem rl(int index, Object key, Object contentType, int crossAxisSize, int mainAxisSpacing, List placeables, long constraints, int lane, int span) {
                                return new LazyGridMeasuredItem(index, key, this.J2, crossAxisSize, mainAxisSpacing, this.Uo, this.nr.getLayoutDirection(), this.KN, this.xMQ, placeables, this.mUb, contentType, this.f18288O.getItemAnimator(), constraints, lane, span, null);
                            }
                        };
                        final boolean z14 = z7;
                        final ?? r23 = new LazyGridMeasuredLineProvider(z14, lazyGridSlotsN, iN, iHow5, r28, lazyGridSpanLayoutProviderMUb) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
                            final /* synthetic */ LazyGridSlots KN;
                            final /* synthetic */ boolean Uo;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(z14, lazyGridSlotsN, iN, iHow5, r28, lazyGridSpanLayoutProviderMUb);
                                this.Uo = z14;
                                this.KN = lazyGridSlotsN;
                            }

                            @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider
                            public LazyGridMeasuredLine rl(int index, LazyGridMeasuredItem[] items, List spans, int mainAxisSpacing) {
                                return new LazyGridMeasuredLine(index, items, this.KN, spans, this.Uo, mainAxisSpacing);
                            }
                        };
                        Function1<Integer, ArrayList<Pair<? extends Integer, ? extends Constraints>>> function1 = new Function1<Integer, ArrayList<Pair<? extends Integer, ? extends Constraints>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$prefetchInfoRetriever$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ ArrayList<Pair<? extends Integer, ? extends Constraints>> invoke(Integer num) {
                                return n(num.intValue());
                            }

                            public final ArrayList n(int i12) {
                                LazyGridSpanLayoutProvider.LineConfiguration lineConfigurationT = lazyGridSpanLayoutProviderMUb.t(i12);
                                int firstItemIndex = lineConfigurationT.getFirstItemIndex();
                                ArrayList arrayList = new ArrayList(lineConfigurationT.getSpans().size());
                                List spans = lineConfigurationT.getSpans();
                                LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 = r23;
                                int size = spans.size();
                                int i13 = 0;
                                for (int i14 = 0; i14 < size; i14++) {
                                    int iNr2 = GridItemSpan.nr(((GridItemSpan) spans.get(i14)).getPackedValue());
                                    arrayList.add(TuplesKt.to(Integer.valueOf(firstItemIndex), Constraints.n(lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.n(i13, iNr2))));
                                    firstItemIndex++;
                                    i13 += iNr2;
                                }
                                return arrayList;
                            }
                        };
                        Snapshot.Companion companion = Snapshot.INSTANCE;
                        LazyGridState lazyGridState3 = lazyGridState;
                        Snapshot snapshotNr = companion.nr();
                        Function1 readObserver = snapshotNr != null ? snapshotNr.getReadObserver() : null;
                        Snapshot snapshotO = companion.O(snapshotNr);
                        try {
                            int iBzg = lazyGridState3.bzg(lazyGridItemProvider, lazyGridState3.r());
                            if (iBzg < iN || iN <= 0) {
                                iNr = lazyGridSpanLayoutProviderMUb.nr(iBzg);
                                i5 = i10;
                                iO = lazyGridState3.o();
                            } else {
                                iNr = lazyGridSpanLayoutProviderMUb.nr(iN - 1);
                                i5 = i10;
                                iO = 0;
                            }
                            Unit unit = Unit.INSTANCE;
                            companion.az(snapshotNr, snapshotO, readObserver);
                            List listN = LazyLayoutBeyondBoundsStateKt.n(lazyGridItemProvider, lazyGridState.getPinnedItems(), lazyGridState.getBeyondBoundsInfo());
                            LazyGridMeasureResult lazyGridMeasureResultO = LazyGridMeasureKt.O(iN, r23, r28, iGh, i11, i5, iHow5, iNr, iO, (lazyLayoutMeasureScope.Org() || !z9) ? lazyGridState.getScrollToBeConsumed() : lazyGridState.E2(), jXMQ, z7, vertical, horizontal, z2, lazyLayoutMeasureScope, lazyGridState.getItemAnimator(), length, listN, z9, lazyLayoutMeasureScope.Org(), lazyGridState.getApproachLayoutInfo(), vdVar, lazyGridState.getPlacementScopeInvalidator(), graphicsContext, function1, stickyItemsPlacement, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function12) {
                                    return n(num.intValue(), num2.intValue(), function12);
                                }

                                public final MeasureResult n(int i12, int i13, Function1 function12) {
                                    return lazyLayoutMeasureScope.Zn(ConstraintsKt.Uo(j2, i12 + i8), ConstraintsKt.J2(j2, i13 + i7), MapsKt.emptyMap(), function12);
                                }
                            });
                            LazyGridState.az(lazyGridState, lazyGridMeasureResultO, lazyLayoutMeasureScope.Org(), false, 4, null);
                            return lazyGridMeasureResultO;
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
        z4 = z3;
        if ((196608 & i2) != 131072) {
            z5 = false;
        }
        zP5 = z6 | z5 | ((((3670016 & i2) ^ 1572864) <= 1048576 && composer.p5(horizontal)) || (i2 & 1572864) == 1048576) | ((((29360128 & i2) ^ 12582912) <= 8388608 && composer.p5(vertical)) || (i2 & 12582912) == 8388608) | composer.p5(graphicsContext);
        objIF = composer.iF();
        if (!zP5) {
            final boolean z72 = z4;
            Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult> function23 = new Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return n(lazyLayoutMeasureScope, constraints.getValue());
                }

                /* JADX WARN: Type inference failed for: r23v1, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider] */
                /* JADX WARN: Type inference failed for: r28v0, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider] */
                public final LazyGridMeasureResult n(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j2) {
                    float spacing;
                    long jJ2;
                    int iNr;
                    int i5;
                    int iO;
                    ObservableScopeInvalidator.n(lazyGridState.getMeasurementScopeInvalidator());
                    boolean z9 = lazyGridState.getHasLookaheadOccurred() || lazyLayoutMeasureScope.Org();
                    CheckScrollableContainerConstraintsKt.n(j2, z72 ? Orientation.f16969n : Orientation.f16970t);
                    int iHow = z72 ? lazyLayoutMeasureScope.How(paddingValues.rl(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.How(PaddingKt.Uo(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iHow2 = z72 ? lazyLayoutMeasureScope.How(paddingValues.t(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.How(PaddingKt.J2(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    int iHow3 = lazyLayoutMeasureScope.How(paddingValues.getTop());
                    int iHow4 = lazyLayoutMeasureScope.How(paddingValues.getBottom());
                    final int i7 = iHow3 + iHow4;
                    final int i8 = iHow + iHow2;
                    boolean z10 = z72;
                    int i9 = z10 ? i7 : i8;
                    if (z10 && !z2) {
                        iHow4 = iHow3;
                    } else if (!z10 || !z2) {
                        iHow4 = (z10 || z2) ? iHow2 : iHow;
                    }
                    final int i10 = i9 - iHow4;
                    long jXMQ = ConstraintsKt.xMQ(j2, -i8, -i7);
                    final LazyGridItemProvider lazyGridItemProvider = (LazyGridItemProvider) function0.invoke();
                    final LazyGridSpanLayoutProvider lazyGridSpanLayoutProviderMUb = lazyGridItemProvider.mUb();
                    final LazyGridSlots lazyGridSlotsN = lazyGridSlotsProvider.n(lazyLayoutMeasureScope, jXMQ);
                    int length = lazyGridSlotsN.getSizes().length;
                    lazyGridSpanLayoutProviderMUb.KN(length);
                    if (z72) {
                        Arrangement.Vertical vertical2 = vertical;
                        if (vertical2 == null) {
                            InlineClassHelperKt.rl("null verticalArrangement when isVertical == true");
                            throw new KotlinNothingValueException();
                        }
                        spacing = vertical2.getSpacing();
                    } else {
                        Arrangement.Horizontal horizontal2 = horizontal;
                        if (horizontal2 == null) {
                            InlineClassHelperKt.rl("null horizontalArrangement when isVertical == false");
                            throw new KotlinNothingValueException();
                        }
                        spacing = horizontal2.getSpacing();
                    }
                    final int iHow5 = lazyLayoutMeasureScope.How(spacing);
                    final int iN = lazyGridItemProvider.n();
                    int iGh = z72 ? Constraints.gh(j2) - i7 : Constraints.qie(j2) - i8;
                    if (!z2 || iGh > 0) {
                        jJ2 = IntOffset.J2((((long) iHow) << 32) | (((long) iHow3) & 4294967295L));
                    } else {
                        boolean z11 = z72;
                        if (!z11) {
                            iHow += iGh;
                        }
                        if (z11) {
                            iHow3 += iGh;
                        }
                        jJ2 = IntOffset.J2((((long) iHow) << 32) | (((long) iHow3) & 4294967295L));
                    }
                    final int i11 = iHow4;
                    final LazyGridState lazyGridState2 = lazyGridState;
                    final boolean z12 = z72;
                    final boolean z13 = z2;
                    final long j3 = jJ2;
                    final LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 r28 = new LazyGridMeasuredItemProvider(lazyGridItemProvider, lazyLayoutMeasureScope, iHow5, lazyGridState2, z12, z13, i11, i10, j3) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
                        final /* synthetic */ boolean J2;
                        final /* synthetic */ int KN;

                        /* JADX INFO: renamed from: O, reason: collision with root package name */
                        final /* synthetic */ LazyGridState f18288O;
                        final /* synthetic */ boolean Uo;
                        final /* synthetic */ long mUb;
                        final /* synthetic */ LazyLayoutMeasureScope nr;
                        final /* synthetic */ int xMQ;

                        {
                            this.nr = lazyLayoutMeasureScope;
                            this.f18288O = lazyGridState2;
                            this.J2 = z12;
                            this.Uo = z13;
                            this.KN = i11;
                            this.xMQ = i10;
                            this.mUb = j3;
                        }

                        @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
                        public LazyGridMeasuredItem rl(int index, Object key, Object contentType, int crossAxisSize, int mainAxisSpacing, List placeables, long constraints, int lane, int span) {
                            return new LazyGridMeasuredItem(index, key, this.J2, crossAxisSize, mainAxisSpacing, this.Uo, this.nr.getLayoutDirection(), this.KN, this.xMQ, placeables, this.mUb, contentType, this.f18288O.getItemAnimator(), constraints, lane, span, null);
                        }
                    };
                    final boolean z14 = z72;
                    final LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 r23 = new LazyGridMeasuredLineProvider(z14, lazyGridSlotsN, iN, iHow5, r28, lazyGridSpanLayoutProviderMUb) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
                        final /* synthetic */ LazyGridSlots KN;
                        final /* synthetic */ boolean Uo;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(z14, lazyGridSlotsN, iN, iHow5, r28, lazyGridSpanLayoutProviderMUb);
                            this.Uo = z14;
                            this.KN = lazyGridSlotsN;
                        }

                        @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider
                        public LazyGridMeasuredLine rl(int index, LazyGridMeasuredItem[] items, List spans, int mainAxisSpacing) {
                            return new LazyGridMeasuredLine(index, items, this.KN, spans, this.Uo, mainAxisSpacing);
                        }
                    };
                    Function1<Integer, ArrayList<Pair<? extends Integer, ? extends Constraints>>> function1 = new Function1<Integer, ArrayList<Pair<? extends Integer, ? extends Constraints>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$prefetchInfoRetriever$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ ArrayList<Pair<? extends Integer, ? extends Constraints>> invoke(Integer num) {
                            return n(num.intValue());
                        }

                        public final ArrayList n(int i12) {
                            LazyGridSpanLayoutProvider.LineConfiguration lineConfigurationT = lazyGridSpanLayoutProviderMUb.t(i12);
                            int firstItemIndex = lineConfigurationT.getFirstItemIndex();
                            ArrayList arrayList = new ArrayList(lineConfigurationT.getSpans().size());
                            List spans = lineConfigurationT.getSpans();
                            LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 = r23;
                            int size = spans.size();
                            int i13 = 0;
                            for (int i14 = 0; i14 < size; i14++) {
                                int iNr2 = GridItemSpan.nr(((GridItemSpan) spans.get(i14)).getPackedValue());
                                arrayList.add(TuplesKt.to(Integer.valueOf(firstItemIndex), Constraints.n(lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.n(i13, iNr2))));
                                firstItemIndex++;
                                i13 += iNr2;
                            }
                            return arrayList;
                        }
                    };
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    LazyGridState lazyGridState3 = lazyGridState;
                    Snapshot snapshotNr = companion.nr();
                    Function1 readObserver = snapshotNr != null ? snapshotNr.getReadObserver() : null;
                    Snapshot snapshotO = companion.O(snapshotNr);
                    try {
                        int iBzg = lazyGridState3.bzg(lazyGridItemProvider, lazyGridState3.r());
                        if (iBzg < iN || iN <= 0) {
                            iNr = lazyGridSpanLayoutProviderMUb.nr(iBzg);
                            i5 = i10;
                            iO = lazyGridState3.o();
                        } else {
                            iNr = lazyGridSpanLayoutProviderMUb.nr(iN - 1);
                            i5 = i10;
                            iO = 0;
                        }
                        Unit unit = Unit.INSTANCE;
                        companion.az(snapshotNr, snapshotO, readObserver);
                        List listN = LazyLayoutBeyondBoundsStateKt.n(lazyGridItemProvider, lazyGridState.getPinnedItems(), lazyGridState.getBeyondBoundsInfo());
                        LazyGridMeasureResult lazyGridMeasureResultO = LazyGridMeasureKt.O(iN, r23, r28, iGh, i11, i5, iHow5, iNr, iO, (lazyLayoutMeasureScope.Org() || !z9) ? lazyGridState.getScrollToBeConsumed() : lazyGridState.E2(), jXMQ, z72, vertical, horizontal, z2, lazyLayoutMeasureScope, lazyGridState.getItemAnimator(), length, listN, z9, lazyLayoutMeasureScope.Org(), lazyGridState.getApproachLayoutInfo(), vdVar, lazyGridState.getPlacementScopeInvalidator(), graphicsContext, function1, stickyItemsPlacement, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function12) {
                                return n(num.intValue(), num2.intValue(), function12);
                            }

                            public final MeasureResult n(int i12, int i13, Function1 function12) {
                                return lazyLayoutMeasureScope.Zn(ConstraintsKt.Uo(j2, i12 + i8), ConstraintsKt.J2(j2, i13 + i7), MapsKt.emptyMap(), function12);
                            }
                        });
                        LazyGridState.az(lazyGridState, lazyGridMeasureResultO, lazyLayoutMeasureScope.Org(), false, 4, null);
                        return lazyGridMeasureResultO;
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
}
