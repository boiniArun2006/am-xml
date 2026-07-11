package androidx.compose.foundation.lazy.staggeredgrid;

import GJW.vd;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0093\u0001\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "slots", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacing", "crossAxisSpacing", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;FFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,126:1\n113#2:127\n113#2:128\n113#2:129\n557#3:130\n554#3,6:131\n1247#4,3:137\n1250#4,3:141\n555#5:140\n75#6:144\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n*L\n48#1:127\n58#1:128\n60#1:129\n65#1:130\n65#1:131,6\n65#1:137,3\n65#1:141,3\n65#1:140\n66#1:144\n*E\n"})
public final class LazyStaggeredGridKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final LazyStaggeredGridState lazyStaggeredGridState, final Orientation orientation, final LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, Modifier modifier, PaddingValues paddingValues, boolean z2, FlingBehavior flingBehavior, boolean z3, final OverscrollEffect overscrollEffect, float f3, float f4, final Function1 function1, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        int i8;
        PaddingValues paddingValues2;
        int i9;
        boolean z4;
        FlingBehavior flingBehavior2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        final boolean z5;
        final float f5;
        Composer composer2;
        final PaddingValues paddingValues3;
        final boolean z6;
        final Modifier modifier3;
        final float f6;
        ScopeUpdateScope scopeUpdateScopeGh;
        FlingBehavior flingBehaviorN;
        boolean z7;
        float fKN;
        Modifier modifier4;
        PaddingValues paddingValues4;
        FlingBehavior flingBehavior3;
        boolean z9;
        float fKN2;
        Object objIF;
        Modifier modifierRl;
        Composer composerKN = composer.KN(-1904835166);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.p5(lazyStaggeredGridState) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= composerKN.p5(orientation) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= (i2 & 512) == 0 ? composerKN.p5(lazyGridStaggeredGridSlotsProvider) : composerKN.E2(lazyGridStaggeredGridSlotsProvider) ? 256 : 128;
        }
        int i17 = i5 & 8;
        if (i17 != 0) {
            i7 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            i8 = i5 & 16;
            if (i8 == 0) {
                i7 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    paddingValues2 = paddingValues;
                    i7 |= composerKN.p5(paddingValues2) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i7 |= 196608;
                    z4 = z2;
                } else {
                    z4 = z2;
                    if ((i2 & 196608) == 0) {
                        i7 |= composerKN.n(z4) ? 131072 : 65536;
                    }
                }
                if ((i2 & 1572864) == 0) {
                    flingBehavior2 = flingBehavior;
                    i7 |= ((i5 & 64) == 0 && composerKN.p5(flingBehavior2)) ? 1048576 : 524288;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i10 = i5 & 128;
                if (i10 != 0) {
                    i7 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i7 |= composerKN.n(z3) ? 8388608 : 4194304;
                }
                if ((i5 & 256) != 0) {
                    i7 |= 100663296;
                } else {
                    if ((i2 & 100663296) == 0) {
                        i7 |= composerKN.p5(overscrollEffect) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    i11 = i5 & 512;
                    if (i11 != 0) {
                        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i12 = i11;
                            i7 |= composerKN.rl(f3) ? 536870912 : 268435456;
                        }
                        i13 = i5 & 1024;
                        if (i13 != 0) {
                            i15 = i3 | 6;
                            i14 = i13;
                        } else if ((i3 & 6) == 0) {
                            i14 = i13;
                            i15 = i3 | (composerKN.rl(f4) ? 4 : 2);
                        } else {
                            i14 = i13;
                            i15 = i3;
                        }
                        if ((i5 & 2048) != 0) {
                            i15 |= 48;
                        } else if ((i3 & 48) == 0) {
                            i15 |= composerKN.E2(function1) ? 32 : 16;
                        }
                        i16 = i15;
                        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i16 & 19) == 18) ? false : true, i7 & 1)) {
                            composerKN.e();
                            if ((i2 & 1) == 0 || composerKN.rV9()) {
                                Modifier modifier5 = i17 != 0 ? Modifier.INSTANCE : modifier2;
                                PaddingValues paddingValuesN = i8 != 0 ? PaddingKt.n(Dp.KN(0)) : paddingValues2;
                                if (i9 != 0) {
                                    z4 = false;
                                }
                                if ((i5 & 64) != 0) {
                                    flingBehaviorN = ScrollableDefaults.f17001n.n(composerKN, 6);
                                    i7 &= -3670017;
                                } else {
                                    flingBehaviorN = flingBehavior2;
                                }
                                z7 = i10 == 0 ? z3 : true;
                                fKN = i12 != 0 ? Dp.KN(0) : f3;
                                if (i14 != 0) {
                                    modifier4 = modifier5;
                                    paddingValues4 = paddingValuesN;
                                    flingBehavior3 = flingBehaviorN;
                                    z9 = z4;
                                    fKN2 = Dp.KN(0);
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-1904835166, i7, i16, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
                                    }
                                    int i18 = i7 & 14;
                                    Function0 function0N = LazyStaggeredGridItemProviderKt.n(lazyStaggeredGridState, function1, composerKN, (i16 & 112) | i18);
                                    objIF = composerKN.iF();
                                    if (objIF == Composer.INSTANCE.n()) {
                                        objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                                        composerKN.o(objIF);
                                    }
                                    int i19 = i7 >> 6;
                                    int i20 = i7 >> 12;
                                    int i21 = i7;
                                    float f7 = fKN;
                                    Function2 function2J2 = LazyStaggeredGridMeasurePolicyKt.J2(lazyStaggeredGridState, function0N, paddingValues4, z9, orientation, f7, fKN2, (vd) objIF, lazyGridStaggeredGridSlotsProvider, (GraphicsContext) composerKN.ty(CompositionLocalsKt.mUb()), composerKN, (i19 & 7168) | (i19 & 896) | i18 | ((i7 << 9) & 57344) | (i20 & 458752) | ((i16 << 18) & 3670016) | ((i7 << 18) & 234881024));
                                    PaddingValues paddingValues5 = paddingValues4;
                                    float f8 = fKN2;
                                    LazyLayoutSemanticState lazyLayoutSemanticStateN = LazyStaggeredGridSemanticsKt.n(lazyStaggeredGridState, z9, composerKN, (i20 & 112) | i18);
                                    if (z7) {
                                        composerKN.eF(1913691040);
                                        composerKN.Xw();
                                        modifierRl = Modifier.INSTANCE;
                                    } else {
                                        composerKN.eF(1913386186);
                                        modifierRl = LazyLayoutBeyondBoundsModifierLocalKt.rl(Modifier.INSTANCE, LazyStaggeredGridBeyondBoundsModifierKt.n(lazyStaggeredGridState, composerKN, i18), lazyStaggeredGridState.getBeyondBoundsInfo(), z9, orientation);
                                        composerKN.Xw();
                                    }
                                    Modifier modifier6 = modifierRl;
                                    boolean z10 = z9;
                                    boolean z11 = z7;
                                    FlingBehavior flingBehavior4 = flingBehavior3;
                                    Modifier modifierN = ScrollingContainerKt.n(LazyLayoutSemanticsKt.t(modifier4.Zmq(lazyStaggeredGridState.getRemeasurementModifier()).Zmq(lazyStaggeredGridState.getAwaitLayoutModifier()), function0N, lazyLayoutSemanticStateN, orientation, z11, z10, composerKN, (i21 & 458752) | ((i21 << 6) & 7168) | ((i21 >> 9) & 57344)).Zmq(modifier6).Zmq(lazyStaggeredGridState.getItemAnimator().getModifier()), lazyStaggeredGridState, orientation, z11, z10, flingBehavior4, lazyStaggeredGridState.getMutableInteractionSource(), false, overscrollEffect, (256 & 256) != 0 ? null : null);
                                    flingBehavior2 = flingBehavior4;
                                    LazyLayoutKt.n(function0N, modifierN, lazyStaggeredGridState.getPrefetchState(), function2J2, composerKN, 0, 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    composer2 = composerKN;
                                    z6 = z10;
                                    modifier3 = modifier4;
                                    z5 = z11;
                                    paddingValues3 = paddingValues5;
                                    f5 = f7;
                                    f6 = f8;
                                } else {
                                    modifier4 = modifier5;
                                    paddingValues4 = paddingValuesN;
                                    flingBehavior3 = flingBehaviorN;
                                    z9 = z4;
                                }
                            } else {
                                composerKN.wTp();
                                if ((i5 & 64) != 0) {
                                    i7 &= -3670017;
                                }
                                z7 = z3;
                                paddingValues4 = paddingValues2;
                                z9 = z4;
                                flingBehavior3 = flingBehavior2;
                                modifier4 = modifier2;
                                fKN = f3;
                            }
                            fKN2 = f4;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            int i182 = i7 & 14;
                            Function0 function0N2 = LazyStaggeredGridItemProviderKt.n(lazyStaggeredGridState, function1, composerKN, (i16 & 112) | i182);
                            objIF = composerKN.iF();
                            if (objIF == Composer.INSTANCE.n()) {
                            }
                            int i192 = i7 >> 6;
                            int i202 = i7 >> 12;
                            int i212 = i7;
                            float f72 = fKN;
                            Function2 function2J22 = LazyStaggeredGridMeasurePolicyKt.J2(lazyStaggeredGridState, function0N2, paddingValues4, z9, orientation, f72, fKN2, (vd) objIF, lazyGridStaggeredGridSlotsProvider, (GraphicsContext) composerKN.ty(CompositionLocalsKt.mUb()), composerKN, (i192 & 7168) | (i192 & 896) | i182 | ((i7 << 9) & 57344) | (i202 & 458752) | ((i16 << 18) & 3670016) | ((i7 << 18) & 234881024));
                            PaddingValues paddingValues52 = paddingValues4;
                            float f82 = fKN2;
                            LazyLayoutSemanticState lazyLayoutSemanticStateN2 = LazyStaggeredGridSemanticsKt.n(lazyStaggeredGridState, z9, composerKN, (i202 & 112) | i182);
                            if (z7) {
                            }
                            Modifier modifier62 = modifierRl;
                            boolean z102 = z9;
                            boolean z112 = z7;
                            FlingBehavior flingBehavior42 = flingBehavior3;
                            Modifier modifierN2 = ScrollingContainerKt.n(LazyLayoutSemanticsKt.t(modifier4.Zmq(lazyStaggeredGridState.getRemeasurementModifier()).Zmq(lazyStaggeredGridState.getAwaitLayoutModifier()), function0N2, lazyLayoutSemanticStateN2, orientation, z112, z102, composerKN, (i212 & 458752) | ((i212 << 6) & 7168) | ((i212 >> 9) & 57344)).Zmq(modifier62).Zmq(lazyStaggeredGridState.getItemAnimator().getModifier()), lazyStaggeredGridState, orientation, z112, z102, flingBehavior42, lazyStaggeredGridState.getMutableInteractionSource(), false, overscrollEffect, (256 & 256) != 0 ? null : null);
                            flingBehavior2 = flingBehavior42;
                            LazyLayoutKt.n(function0N2, modifierN2, lazyStaggeredGridState.getPrefetchState(), function2J22, composerKN, 0, 0);
                            if (ComposerKt.v()) {
                            }
                            composer2 = composerKN;
                            z6 = z102;
                            modifier3 = modifier4;
                            z5 = z112;
                            paddingValues3 = paddingValues52;
                            f5 = f72;
                            f6 = f82;
                        } else {
                            composerKN.wTp();
                            z5 = z3;
                            f5 = f3;
                            composer2 = composerKN;
                            paddingValues3 = paddingValues2;
                            z6 = z4;
                            modifier3 = modifier2;
                            f6 = f4;
                        }
                        final FlingBehavior flingBehavior5 = flingBehavior2;
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$LazyStaggeredGrid$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i22) {
                                    LazyStaggeredGridKt.n(lazyStaggeredGridState, orientation, lazyGridStaggeredGridSlotsProvider, modifier3, paddingValues3, z6, flingBehavior5, z5, overscrollEffect, f5, f6, function1, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    i12 = i11;
                    i13 = i5 & 1024;
                    if (i13 != 0) {
                    }
                    if ((i5 & 2048) != 0) {
                    }
                    i16 = i15;
                    if (composerKN.HI(((i7 & 306783379) == 306783378 && (i16 & 19) == 18) ? false : true, i7 & 1)) {
                    }
                    final FlingBehavior flingBehavior52 = flingBehavior2;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i11 = i5 & 512;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i5 & 1024;
                if (i13 != 0) {
                }
                if ((i5 & 2048) != 0) {
                }
                i16 = i15;
                if (composerKN.HI(((i7 & 306783379) == 306783378 && (i16 & 19) == 18) ? false : true, i7 & 1)) {
                }
                final FlingBehavior flingBehavior522 = flingBehavior2;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            paddingValues2 = paddingValues;
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i10 = i5 & 128;
            if (i10 != 0) {
            }
            if ((i5 & 256) != 0) {
            }
            i11 = i5 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i5 & 1024;
            if (i13 != 0) {
            }
            if ((i5 & 2048) != 0) {
            }
            i16 = i15;
            if (composerKN.HI(((i7 & 306783379) == 306783378 && (i16 & 19) == 18) ? false : true, i7 & 1)) {
            }
            final FlingBehavior flingBehavior5222 = flingBehavior2;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i8 = i5 & 16;
        if (i8 == 0) {
        }
        paddingValues2 = paddingValues;
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i10 = i5 & 128;
        if (i10 != 0) {
        }
        if ((i5 & 256) != 0) {
        }
        i11 = i5 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i5 & 1024;
        if (i13 != 0) {
        }
        if ((i5 & 2048) != 0) {
        }
        i16 = i15;
        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i16 & 19) == 18) ? false : true, i7 & 1)) {
        }
        final FlingBehavior flingBehavior52222 = flingBehavior2;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }
}
