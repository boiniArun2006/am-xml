package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u008f\u0001\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0083\u0001\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u008f\u0001\u0010#\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u0083\u0001\u0010%\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a'\u0010'\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "columns", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/ui/unit/Dp;", "verticalItemSpacing", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, "t", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "nr", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "O", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "rows", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "horizontalItemSpacing", c.f62177j, "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "rl", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "J2", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,520:1\n113#2:521\n113#2:522\n113#2:523\n113#2:524\n113#2:525\n113#2:526\n113#2:533\n113#2:534\n113#2:535\n113#2:536\n113#2:537\n113#2:538\n1247#3,6:527\n1247#3,6:539\n1#4:545\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt\n*L\n74#1:521\n76#1:522\n77#1:523\n105#1:524\n107#1:525\n108#1:526\n199#1:533\n201#1:534\n202#1:535\n230#1:536\n232#1:537\n233#1:538\n135#1:527,6\n260#1:539,6\n*E\n"})
public final class LazyStaggeredGridDslKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z2, Arrangement.Vertical vertical, float f3, FlingBehavior flingBehavior, boolean z3, OverscrollEffect overscrollEffect, final Function1 function1, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        LazyStaggeredGridState lazyStaggeredGridState2;
        int i8;
        PaddingValues paddingValues2;
        int i9;
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer composer2;
        final Arrangement.Vertical vertical2;
        final boolean z5;
        final Modifier modifier3;
        final LazyStaggeredGridState lazyStaggeredGridState3;
        final PaddingValues paddingValues3;
        final boolean z6;
        final float f4;
        final FlingBehavior flingBehavior2;
        final OverscrollEffect overscrollEffect2;
        ScopeUpdateScope scopeUpdateScopeGh;
        LazyStaggeredGridState lazyStaggeredGridStateN;
        PaddingValues paddingValuesN;
        Arrangement.Vertical verticalTy;
        FlingBehavior flingBehaviorN;
        OverscrollEffect overscrollEffectRl;
        Modifier modifier4;
        LazyStaggeredGridState lazyStaggeredGridState4;
        float f5;
        FlingBehavior flingBehavior3;
        boolean z7;
        Composer composerKN = composer.KN(-670735644);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.p5(staggeredGridCells) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        int i15 = i5 & 2;
        if (i15 != 0) {
            i7 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i5 & 4) == 0) {
                    lazyStaggeredGridState2 = lazyStaggeredGridState;
                    int i16 = composerKN.p5(lazyStaggeredGridState2) ? 256 : 128;
                    i7 |= i16;
                } else {
                    lazyStaggeredGridState2 = lazyStaggeredGridState;
                }
                i7 |= i16;
            } else {
                lazyStaggeredGridState2 = lazyStaggeredGridState;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    paddingValues2 = paddingValues;
                    i7 |= composerKN.p5(paddingValues2) ? 2048 : 1024;
                }
                i9 = i5 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        z4 = z2;
                        i7 |= composerKN.n(z4) ? 16384 : 8192;
                    }
                    i10 = i5 & 32;
                    if (i10 == 0) {
                        i7 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        i7 |= composerKN.p5(vertical) ? 131072 : 65536;
                    }
                    i11 = i5 & 64;
                    if (i11 == 0) {
                        i7 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i7 |= composerKN.rl(f3) ? 1048576 : 524288;
                    }
                    if ((i2 & 12582912) == 0) {
                        i7 |= ((i5 & 128) == 0 && composerKN.p5(flingBehavior)) ? 8388608 : 4194304;
                    }
                    i12 = i5 & 256;
                    if (i12 != 0) {
                        if ((i2 & 100663296) == 0) {
                            i13 = i12;
                            i7 |= composerKN.n(z3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i7 |= ((i5 & 512) == 0 && composerKN.p5(overscrollEffect)) ? 536870912 : 268435456;
                        }
                        if ((i5 & 1024) != 0) {
                            i14 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i14 = i3 | (composerKN.E2(function1) ? 4 : 2);
                        } else {
                            i14 = i3;
                        }
                        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i14 & 3) == 2) ? false : true, i7 & 1)) {
                            composerKN.e();
                            if ((i2 & 1) == 0 || composerKN.rV9()) {
                                Modifier modifier5 = i15 != 0 ? Modifier.INSTANCE : modifier2;
                                if ((i5 & 4) != 0) {
                                    lazyStaggeredGridStateN = LazyStaggeredGridStateKt.n(0, 0, composerKN, 0, 3);
                                    i7 &= -897;
                                } else {
                                    lazyStaggeredGridStateN = lazyStaggeredGridState2;
                                }
                                paddingValuesN = i8 != 0 ? PaddingKt.n(Dp.KN(0)) : paddingValues2;
                                if (i9 != 0) {
                                    z4 = false;
                                }
                                verticalTy = i10 != 0 ? Arrangement.f17400n.ty(Dp.KN(0)) : vertical;
                                float fKN = i11 != 0 ? Dp.KN(0) : f3;
                                if ((i5 & 128) != 0) {
                                    flingBehaviorN = ScrollableDefaults.f17001n.n(composerKN, 6);
                                    i7 &= -29360129;
                                } else {
                                    flingBehaviorN = flingBehavior;
                                }
                                boolean z9 = i13 == 0 ? z3 : true;
                                if ((i5 & 512) != 0) {
                                    i7 &= -1879048193;
                                    modifier4 = modifier5;
                                    overscrollEffectRl = OverscrollKt.rl(composerKN, 0);
                                } else {
                                    overscrollEffectRl = overscrollEffect;
                                    modifier4 = modifier5;
                                }
                                lazyStaggeredGridState4 = lazyStaggeredGridStateN;
                                f5 = fKN;
                                flingBehavior3 = flingBehaviorN;
                                z7 = z9;
                            } else {
                                composerKN.wTp();
                                if ((i5 & 4) != 0) {
                                    i7 &= -897;
                                }
                                if ((i5 & 128) != 0) {
                                    i7 &= -29360129;
                                }
                                if ((i5 & 512) != 0) {
                                    i7 &= -1879048193;
                                }
                                verticalTy = vertical;
                                f5 = f3;
                                flingBehavior3 = flingBehavior;
                                z7 = z3;
                                overscrollEffectRl = overscrollEffect;
                                modifier4 = modifier2;
                                lazyStaggeredGridState4 = lazyStaggeredGridState2;
                                paddingValuesN = paddingValues2;
                            }
                            boolean z10 = z4;
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-670735644, i7, i14, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:206)");
                            }
                            int i17 = i7 >> 3;
                            int i18 = i7 << 3;
                            composer2 = composerKN;
                            PaddingValues paddingValues4 = paddingValuesN;
                            LazyStaggeredGridKt.n(lazyStaggeredGridState4, Orientation.f16970t, J2(staggeredGridCells, verticalTy, paddingValuesN, composerKN, (i7 & 14) | ((i7 >> 12) & 112) | (i17 & 896)), modifier4, paddingValues4, z10, flingBehavior3, z7, overscrollEffectRl, f5, verticalTy.getSpacing(), function1, composer2, ((i7 >> 6) & 14) | 48 | ((i7 << 6) & 7168) | (57344 & i18) | (i18 & 458752) | (3670016 & i17) | (29360128 & i17) | (i17 & 234881024) | ((i7 << 9) & 1879048192), (i14 << 3) & 112, 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            vertical2 = verticalTy;
                            lazyStaggeredGridState3 = lazyStaggeredGridState4;
                            modifier3 = modifier4;
                            paddingValues3 = paddingValues4;
                            z6 = z10;
                            flingBehavior2 = flingBehavior3;
                            z5 = z7;
                            overscrollEffect2 = overscrollEffectRl;
                            f4 = f5;
                        } else {
                            composer2 = composerKN;
                            composer2.wTp();
                            vertical2 = vertical;
                            z5 = z3;
                            modifier3 = modifier2;
                            lazyStaggeredGridState3 = lazyStaggeredGridState2;
                            paddingValues3 = paddingValues2;
                            z6 = z4;
                            f4 = f3;
                            flingBehavior2 = flingBehavior;
                            overscrollEffect2 = overscrollEffect;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i19) {
                                    LazyStaggeredGridDslKt.n(staggeredGridCells, modifier3, lazyStaggeredGridState3, paddingValues3, z6, vertical2, f4, flingBehavior2, z5, overscrollEffect2, function1, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= 100663296;
                    i13 = i12;
                    if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    }
                    if ((i5 & 1024) != 0) {
                    }
                    if (composerKN.HI(((i7 & 306783379) == 306783378 && (i14 & 3) == 2) ? false : true, i7 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z4 = z2;
                i10 = i5 & 32;
                if (i10 == 0) {
                }
                i11 = i5 & 64;
                if (i11 == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i12 = i5 & 256;
                if (i12 != 0) {
                }
                i13 = i12;
                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                }
                if ((i5 & 1024) != 0) {
                }
                if (composerKN.HI(((i7 & 306783379) == 306783378 && (i14 & 3) == 2) ? false : true, i7 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            paddingValues2 = paddingValues;
            i9 = i5 & 16;
            if (i9 != 0) {
            }
            z4 = z2;
            i10 = i5 & 32;
            if (i10 == 0) {
            }
            i11 = i5 & 64;
            if (i11 == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i12 = i5 & 256;
            if (i12 != 0) {
            }
            i13 = i12;
            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            if ((i5 & 1024) != 0) {
            }
            if (composerKN.HI(((i7 & 306783379) == 306783378 && (i14 & 3) == 2) ? false : true, i7 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        paddingValues2 = paddingValues;
        i9 = i5 & 16;
        if (i9 != 0) {
        }
        z4 = z2;
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i12 = i5 & 256;
        if (i12 != 0) {
        }
        i13 = i12;
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        if ((i5 & 1024) != 0) {
        }
        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i14 & 3) == 2) ? false : true, i7 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void nr(final StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z2, float f3, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z3, final Function1 function1, Composer composer, final int i2, final int i3) {
        StaggeredGridCells staggeredGridCells2;
        int i5;
        LazyStaggeredGridState lazyStaggeredGridStateN;
        int i7;
        PaddingValues paddingValues2;
        int i8;
        boolean z4;
        int i9;
        float f4;
        int i10;
        int i11;
        int i12;
        Composer composer2;
        final Modifier modifier2;
        final FlingBehavior flingBehavior2;
        final LazyStaggeredGridState lazyStaggeredGridState2;
        final PaddingValues paddingValues3;
        final boolean z5;
        final float f5;
        final Arrangement.Horizontal horizontal2;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeGh;
        FlingBehavior flingBehaviorN;
        boolean z7;
        Modifier modifier3;
        LazyStaggeredGridState lazyStaggeredGridState3;
        PaddingValues paddingValues4;
        float f6;
        Arrangement.Horizontal horizontal3;
        boolean z9;
        FlingBehavior flingBehavior3;
        int i13;
        Composer composerKN = composer.KN(1695323794);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            staggeredGridCells2 = staggeredGridCells;
        } else {
            staggeredGridCells2 = staggeredGridCells;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.p5(staggeredGridCells2) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.p5(modifier) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    lazyStaggeredGridStateN = lazyStaggeredGridState;
                    int i15 = composerKN.p5(lazyStaggeredGridStateN) ? 256 : 128;
                    i5 |= i15;
                } else {
                    lazyStaggeredGridStateN = lazyStaggeredGridState;
                }
                i5 |= i15;
            } else {
                lazyStaggeredGridStateN = lazyStaggeredGridState;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    paddingValues2 = paddingValues;
                    i5 |= composerKN.p5(paddingValues2) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        z4 = z2;
                        i5 |= composerKN.n(z4) ? 16384 : 8192;
                    }
                    i9 = i3 & 32;
                    if (i9 == 0) {
                        i5 |= 196608;
                    } else {
                        if ((196608 & i2) == 0) {
                            f4 = f3;
                            i5 |= composerKN.rl(f4) ? 131072 : 65536;
                        }
                        i10 = i3 & 64;
                        if (i10 != 0) {
                            i5 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i5 |= composerKN.p5(horizontal) ? 1048576 : 524288;
                        }
                        if ((i2 & 12582912) == 0) {
                            i5 |= ((i3 & 128) == 0 && composerKN.p5(flingBehavior)) ? 8388608 : 4194304;
                        }
                        i11 = i3 & 256;
                        if (i11 != 0) {
                            i5 |= 100663296;
                        } else {
                            if ((i2 & 100663296) == 0) {
                                i12 = i11;
                                i5 |= composerKN.n(z3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            if ((i3 & 512) != 0) {
                                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                    i5 |= composerKN.E2(function1) ? 536870912 : 268435456;
                                }
                                if (composerKN.HI((i5 & 306783379) != 306783378, i5 & 1)) {
                                    composerKN.e();
                                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                                        Modifier modifier4 = i14 != 0 ? Modifier.INSTANCE : modifier;
                                        if ((i3 & 4) != 0) {
                                            lazyStaggeredGridStateN = LazyStaggeredGridStateKt.n(0, 0, composerKN, 0, 3);
                                            i5 &= -897;
                                        }
                                        PaddingValues paddingValuesN = i7 != 0 ? PaddingKt.n(Dp.KN(0)) : paddingValues2;
                                        if (i8 != 0) {
                                            z4 = false;
                                        }
                                        float fKN = i9 != 0 ? Dp.KN(0) : f4;
                                        Arrangement.Horizontal horizontalTy = i10 != 0 ? Arrangement.f17400n.ty(Dp.KN(0)) : horizontal;
                                        if ((i3 & 128) != 0) {
                                            flingBehaviorN = ScrollableDefaults.f17001n.n(composerKN, 6);
                                            i5 &= -29360129;
                                        } else {
                                            flingBehaviorN = flingBehavior;
                                        }
                                        if (i12 != 0) {
                                            modifier3 = modifier4;
                                            lazyStaggeredGridState3 = lazyStaggeredGridStateN;
                                            paddingValues4 = paddingValuesN;
                                            horizontal3 = horizontalTy;
                                            z9 = z4;
                                            flingBehavior3 = flingBehaviorN;
                                            z7 = true;
                                            i13 = 1695323794;
                                            f6 = fKN;
                                        } else {
                                            z7 = z3;
                                            modifier3 = modifier4;
                                            lazyStaggeredGridState3 = lazyStaggeredGridStateN;
                                            paddingValues4 = paddingValuesN;
                                            f6 = fKN;
                                            horizontal3 = horizontalTy;
                                            z9 = z4;
                                            flingBehavior3 = flingBehaviorN;
                                            i13 = 1695323794;
                                        }
                                    } else {
                                        composerKN.wTp();
                                        if ((i3 & 4) != 0) {
                                            i5 &= -897;
                                        }
                                        if ((i3 & 128) != 0) {
                                            i5 &= -29360129;
                                        }
                                        horizontal3 = horizontal;
                                        flingBehavior3 = flingBehavior;
                                        z7 = z3;
                                        lazyStaggeredGridState3 = lazyStaggeredGridStateN;
                                        paddingValues4 = paddingValues2;
                                        z9 = z4;
                                        f6 = f4;
                                        i13 = 1695323794;
                                        modifier3 = modifier;
                                    }
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(i13, i5, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:111)");
                                    }
                                    composer2 = composerKN;
                                    t(staggeredGridCells2, modifier3, lazyStaggeredGridState3, paddingValues4, z9, f6, horizontal3, flingBehavior3, z7, OverscrollKt.rl(composerKN, 0), function1, composer2, i5 & 268435454, (i5 >> 27) & 14, 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    modifier2 = modifier3;
                                    lazyStaggeredGridState2 = lazyStaggeredGridState3;
                                    paddingValues3 = paddingValues4;
                                    z5 = z9;
                                    f5 = f6;
                                    horizontal2 = horizontal3;
                                    flingBehavior2 = flingBehavior3;
                                    z6 = z7;
                                } else {
                                    composer2 = composerKN;
                                    composer2.wTp();
                                    modifier2 = modifier;
                                    flingBehavior2 = flingBehavior;
                                    lazyStaggeredGridState2 = lazyStaggeredGridStateN;
                                    paddingValues3 = paddingValues2;
                                    z5 = z4;
                                    f5 = f4;
                                    horizontal2 = horizontal;
                                    z6 = z3;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i16) {
                                            LazyStaggeredGridDslKt.nr(staggeredGridCells, modifier2, lazyStaggeredGridState2, paddingValues3, z5, f5, horizontal2, flingBehavior2, z6, function1, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                            if (composerKN.HI((i5 & 306783379) != 306783378, i5 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i12 = i11;
                        if ((i3 & 512) != 0) {
                        }
                        if (composerKN.HI((i5 & 306783379) != 306783378, i5 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    f4 = f3;
                    i10 = i3 & 64;
                    if (i10 != 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i11 = i3 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    if ((i3 & 512) != 0) {
                    }
                    if (composerKN.HI((i5 & 306783379) != 306783378, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z4 = z2;
                i9 = i3 & 32;
                if (i9 == 0) {
                }
                f4 = f3;
                i10 = i3 & 64;
                if (i10 != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                if ((i3 & 512) != 0) {
                }
                if (composerKN.HI((i5 & 306783379) != 306783378, i5 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            paddingValues2 = paddingValues;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            z4 = z2;
            i9 = i3 & 32;
            if (i9 == 0) {
            }
            f4 = f3;
            i10 = i3 & 64;
            if (i10 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            if ((i3 & 512) != 0) {
            }
            if (composerKN.HI((i5 & 306783379) != 306783378, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        paddingValues2 = paddingValues;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        z4 = z2;
        i9 = i3 & 32;
        if (i9 == 0) {
        }
        f4 = f3;
        i10 = i3 & 64;
        if (i10 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        if ((i3 & 512) != 0) {
        }
        if (composerKN.HI((i5 & 306783379) != 306783378, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void rl(final StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z2, Arrangement.Vertical vertical, float f3, FlingBehavior flingBehavior, boolean z3, final Function1 function1, Composer composer, final int i2, final int i3) {
        StaggeredGridCells staggeredGridCells2;
        int i5;
        LazyStaggeredGridState lazyStaggeredGridStateN;
        int i7;
        PaddingValues paddingValues2;
        int i8;
        boolean z4;
        int i9;
        Arrangement.Vertical vertical2;
        int i10;
        int i11;
        int i12;
        Composer composer2;
        final Modifier modifier2;
        final FlingBehavior flingBehavior2;
        final LazyStaggeredGridState lazyStaggeredGridState2;
        final PaddingValues paddingValues3;
        final boolean z5;
        final Arrangement.Vertical vertical3;
        final float f4;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeGh;
        FlingBehavior flingBehaviorN;
        boolean z7;
        Modifier modifier3;
        LazyStaggeredGridState lazyStaggeredGridState3;
        PaddingValues paddingValues4;
        Arrangement.Vertical vertical4;
        float f5;
        boolean z9;
        FlingBehavior flingBehavior3;
        int i13;
        Composer composerKN = composer.KN(-8666074);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            staggeredGridCells2 = staggeredGridCells;
        } else {
            staggeredGridCells2 = staggeredGridCells;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.p5(staggeredGridCells2) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.p5(modifier) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    lazyStaggeredGridStateN = lazyStaggeredGridState;
                    int i15 = composerKN.p5(lazyStaggeredGridStateN) ? 256 : 128;
                    i5 |= i15;
                } else {
                    lazyStaggeredGridStateN = lazyStaggeredGridState;
                }
                i5 |= i15;
            } else {
                lazyStaggeredGridStateN = lazyStaggeredGridState;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    paddingValues2 = paddingValues;
                    i5 |= composerKN.p5(paddingValues2) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        z4 = z2;
                        i5 |= composerKN.n(z4) ? 16384 : 8192;
                    }
                    i9 = i3 & 32;
                    if (i9 == 0) {
                        i5 |= 196608;
                    } else {
                        if ((196608 & i2) == 0) {
                            vertical2 = vertical;
                            i5 |= composerKN.p5(vertical2) ? 131072 : 65536;
                        }
                        i10 = i3 & 64;
                        if (i10 != 0) {
                            i5 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i5 |= composerKN.rl(f3) ? 1048576 : 524288;
                        }
                        if ((i2 & 12582912) == 0) {
                            i5 |= ((i3 & 128) == 0 && composerKN.p5(flingBehavior)) ? 8388608 : 4194304;
                        }
                        i11 = i3 & 256;
                        if (i11 != 0) {
                            i5 |= 100663296;
                        } else {
                            if ((i2 & 100663296) == 0) {
                                i12 = i11;
                                i5 |= composerKN.n(z3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            if ((i3 & 512) != 0) {
                                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                    i5 |= composerKN.E2(function1) ? 536870912 : 268435456;
                                }
                                if (composerKN.HI((i5 & 306783379) != 306783378, i5 & 1)) {
                                    composerKN.e();
                                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                                        Modifier modifier4 = i14 != 0 ? Modifier.INSTANCE : modifier;
                                        if ((i3 & 4) != 0) {
                                            lazyStaggeredGridStateN = LazyStaggeredGridStateKt.n(0, 0, composerKN, 0, 3);
                                            i5 &= -897;
                                        }
                                        PaddingValues paddingValuesN = i7 != 0 ? PaddingKt.n(Dp.KN(0)) : paddingValues2;
                                        if (i8 != 0) {
                                            z4 = false;
                                        }
                                        Arrangement.Vertical verticalTy = i9 != 0 ? Arrangement.f17400n.ty(Dp.KN(0)) : vertical2;
                                        float fKN = i10 != 0 ? Dp.KN(0) : f3;
                                        if ((i3 & 128) != 0) {
                                            flingBehaviorN = ScrollableDefaults.f17001n.n(composerKN, 6);
                                            i5 &= -29360129;
                                        } else {
                                            flingBehaviorN = flingBehavior;
                                        }
                                        if (i12 != 0) {
                                            modifier3 = modifier4;
                                            lazyStaggeredGridState3 = lazyStaggeredGridStateN;
                                            paddingValues4 = paddingValuesN;
                                            f5 = fKN;
                                            z9 = z4;
                                            flingBehavior3 = flingBehaviorN;
                                            z7 = true;
                                            i13 = -8666074;
                                            vertical4 = verticalTy;
                                        } else {
                                            z7 = z3;
                                            modifier3 = modifier4;
                                            lazyStaggeredGridState3 = lazyStaggeredGridStateN;
                                            paddingValues4 = paddingValuesN;
                                            vertical4 = verticalTy;
                                            f5 = fKN;
                                            z9 = z4;
                                            flingBehavior3 = flingBehaviorN;
                                            i13 = -8666074;
                                        }
                                    } else {
                                        composerKN.wTp();
                                        if ((i3 & 4) != 0) {
                                            i5 &= -897;
                                        }
                                        if ((i3 & 128) != 0) {
                                            i5 &= -29360129;
                                        }
                                        f5 = f3;
                                        flingBehavior3 = flingBehavior;
                                        z7 = z3;
                                        lazyStaggeredGridState3 = lazyStaggeredGridStateN;
                                        paddingValues4 = paddingValues2;
                                        z9 = z4;
                                        vertical4 = vertical2;
                                        i13 = -8666074;
                                        modifier3 = modifier;
                                    }
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(i13, i5, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:236)");
                                    }
                                    composer2 = composerKN;
                                    n(staggeredGridCells2, modifier3, lazyStaggeredGridState3, paddingValues4, z9, vertical4, f5, flingBehavior3, z7, OverscrollKt.rl(composerKN, 0), function1, composer2, i5 & 268435454, (i5 >> 27) & 14, 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    modifier2 = modifier3;
                                    lazyStaggeredGridState2 = lazyStaggeredGridState3;
                                    paddingValues3 = paddingValues4;
                                    z5 = z9;
                                    vertical3 = vertical4;
                                    f4 = f5;
                                    flingBehavior2 = flingBehavior3;
                                    z6 = z7;
                                } else {
                                    composer2 = composerKN;
                                    composer2.wTp();
                                    modifier2 = modifier;
                                    flingBehavior2 = flingBehavior;
                                    lazyStaggeredGridState2 = lazyStaggeredGridStateN;
                                    paddingValues3 = paddingValues2;
                                    z5 = z4;
                                    vertical3 = vertical2;
                                    f4 = f3;
                                    z6 = z3;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i16) {
                                            LazyStaggeredGridDslKt.rl(staggeredGridCells, modifier2, lazyStaggeredGridState2, paddingValues3, z5, vertical3, f4, flingBehavior2, z6, function1, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                            if (composerKN.HI((i5 & 306783379) != 306783378, i5 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i12 = i11;
                        if ((i3 & 512) != 0) {
                        }
                        if (composerKN.HI((i5 & 306783379) != 306783378, i5 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    vertical2 = vertical;
                    i10 = i3 & 64;
                    if (i10 != 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i11 = i3 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    if ((i3 & 512) != 0) {
                    }
                    if (composerKN.HI((i5 & 306783379) != 306783378, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z4 = z2;
                i9 = i3 & 32;
                if (i9 == 0) {
                }
                vertical2 = vertical;
                i10 = i3 & 64;
                if (i10 != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                if ((i3 & 512) != 0) {
                }
                if (composerKN.HI((i5 & 306783379) != 306783378, i5 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            paddingValues2 = paddingValues;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            z4 = z2;
            i9 = i3 & 32;
            if (i9 == 0) {
            }
            vertical2 = vertical;
            i10 = i3 & 64;
            if (i10 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            if ((i3 & 512) != 0) {
            }
            if (composerKN.HI((i5 & 306783379) != 306783378, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        paddingValues2 = paddingValues;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        z4 = z2;
        i9 = i3 & 32;
        if (i9 == 0) {
        }
        vertical2 = vertical;
        i10 = i3 & 64;
        if (i10 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        if ((i3 & 512) != 0) {
        }
        if (composerKN.HI((i5 & 306783379) != 306783378, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z2, float f3, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z3, OverscrollEffect overscrollEffect, final Function1 function1, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        LazyStaggeredGridState lazyStaggeredGridState2;
        int i8;
        PaddingValues paddingValues2;
        int i9;
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer composer2;
        final float f4;
        final boolean z5;
        final Modifier modifier3;
        final LazyStaggeredGridState lazyStaggeredGridState3;
        final PaddingValues paddingValues3;
        final boolean z6;
        final Arrangement.Horizontal horizontal2;
        final FlingBehavior flingBehavior2;
        final OverscrollEffect overscrollEffect2;
        ScopeUpdateScope scopeUpdateScopeGh;
        LazyStaggeredGridState lazyStaggeredGridStateN;
        PaddingValues paddingValuesN;
        Arrangement.Horizontal horizontalTy;
        FlingBehavior flingBehaviorN;
        OverscrollEffect overscrollEffectRl;
        Modifier modifier4;
        LazyStaggeredGridState lazyStaggeredGridState4;
        float f5;
        FlingBehavior flingBehavior3;
        boolean z7;
        boolean z9;
        Composer composerKN = composer.KN(-578931208);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.p5(staggeredGridCells) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        int i15 = i5 & 2;
        if (i15 != 0) {
            i7 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i5 & 4) == 0) {
                    lazyStaggeredGridState2 = lazyStaggeredGridState;
                    int i16 = composerKN.p5(lazyStaggeredGridState2) ? 256 : 128;
                    i7 |= i16;
                } else {
                    lazyStaggeredGridState2 = lazyStaggeredGridState;
                }
                i7 |= i16;
            } else {
                lazyStaggeredGridState2 = lazyStaggeredGridState;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    paddingValues2 = paddingValues;
                    i7 |= composerKN.p5(paddingValues2) ? 2048 : 1024;
                }
                i9 = i5 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        z4 = z2;
                        i7 |= composerKN.n(z4) ? 16384 : 8192;
                    }
                    i10 = i5 & 32;
                    if (i10 == 0) {
                        i7 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        i7 |= composerKN.rl(f3) ? 131072 : 65536;
                    }
                    i11 = i5 & 64;
                    if (i11 == 0) {
                        i7 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i7 |= composerKN.p5(horizontal) ? 1048576 : 524288;
                    }
                    if ((i2 & 12582912) == 0) {
                        i7 |= ((i5 & 128) == 0 && composerKN.p5(flingBehavior)) ? 8388608 : 4194304;
                    }
                    i12 = i5 & 256;
                    if (i12 != 0) {
                        if ((i2 & 100663296) == 0) {
                            i13 = i12;
                            i7 |= composerKN.n(z3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i7 |= ((i5 & 512) == 0 && composerKN.p5(overscrollEffect)) ? 536870912 : 268435456;
                        }
                        if ((i5 & 1024) != 0) {
                            i14 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i14 = i3 | (composerKN.E2(function1) ? 4 : 2);
                        } else {
                            i14 = i3;
                        }
                        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i14 & 3) == 2) ? false : true, i7 & 1)) {
                            composerKN.e();
                            if ((i2 & 1) == 0 || composerKN.rV9()) {
                                Modifier modifier5 = i15 != 0 ? Modifier.INSTANCE : modifier2;
                                if ((i5 & 4) != 0) {
                                    lazyStaggeredGridStateN = LazyStaggeredGridStateKt.n(0, 0, composerKN, 0, 3);
                                    i7 &= -897;
                                } else {
                                    lazyStaggeredGridStateN = lazyStaggeredGridState2;
                                }
                                paddingValuesN = i8 != 0 ? PaddingKt.n(Dp.KN(0)) : paddingValues2;
                                if (i9 != 0) {
                                    z4 = false;
                                }
                                float fKN = i10 != 0 ? Dp.KN(0) : f3;
                                horizontalTy = i11 != 0 ? Arrangement.f17400n.ty(Dp.KN(0)) : horizontal;
                                if ((i5 & 128) != 0) {
                                    flingBehaviorN = ScrollableDefaults.f17001n.n(composerKN, 6);
                                    i7 &= -29360129;
                                } else {
                                    flingBehaviorN = flingBehavior;
                                }
                                boolean z10 = i13 == 0 ? z3 : true;
                                if ((i5 & 512) != 0) {
                                    i7 &= -1879048193;
                                    modifier4 = modifier5;
                                    overscrollEffectRl = OverscrollKt.rl(composerKN, 0);
                                } else {
                                    overscrollEffectRl = overscrollEffect;
                                    modifier4 = modifier5;
                                }
                                lazyStaggeredGridState4 = lazyStaggeredGridStateN;
                                f5 = fKN;
                                flingBehavior3 = flingBehaviorN;
                                z7 = z10;
                                z9 = z4;
                            } else {
                                composerKN.wTp();
                                if ((i5 & 4) != 0) {
                                    i7 &= -897;
                                }
                                if ((i5 & 128) != 0) {
                                    i7 &= -29360129;
                                }
                                if ((i5 & 512) != 0) {
                                    i7 &= -1879048193;
                                }
                                f5 = f3;
                                flingBehavior3 = flingBehavior;
                                z7 = z3;
                                overscrollEffectRl = overscrollEffect;
                                modifier4 = modifier2;
                                lazyStaggeredGridState4 = lazyStaggeredGridState2;
                                paddingValuesN = paddingValues2;
                                z9 = z4;
                                horizontalTy = horizontal;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-578931208, i7, i14, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:81)");
                            }
                            int i17 = i7 >> 3;
                            int i18 = i7 << 3;
                            composer2 = composerKN;
                            PaddingValues paddingValues4 = paddingValuesN;
                            LazyStaggeredGridKt.n(lazyStaggeredGridState4, Orientation.f16969n, O(staggeredGridCells, horizontalTy, paddingValuesN, composerKN, (i7 & 14) | ((i7 >> 15) & 112) | (i17 & 896)), modifier4, paddingValues4, z9, flingBehavior3, z7, overscrollEffectRl, f5, horizontalTy.getSpacing(), function1, composer2, ((i7 >> 6) & 14) | 48 | ((i7 << 6) & 7168) | (57344 & i18) | (i18 & 458752) | (3670016 & i17) | (29360128 & i17) | (i17 & 234881024) | ((i7 << 12) & 1879048192), (i14 << 3) & 112, 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            horizontal2 = horizontalTy;
                            lazyStaggeredGridState3 = lazyStaggeredGridState4;
                            modifier3 = modifier4;
                            paddingValues3 = paddingValues4;
                            z6 = z9;
                            flingBehavior2 = flingBehavior3;
                            z5 = z7;
                            overscrollEffect2 = overscrollEffectRl;
                            f4 = f5;
                        } else {
                            composer2 = composerKN;
                            composer2.wTp();
                            f4 = f3;
                            z5 = z3;
                            modifier3 = modifier2;
                            lazyStaggeredGridState3 = lazyStaggeredGridState2;
                            paddingValues3 = paddingValues2;
                            z6 = z4;
                            horizontal2 = horizontal;
                            flingBehavior2 = flingBehavior;
                            overscrollEffect2 = overscrollEffect;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i19) {
                                    LazyStaggeredGridDslKt.t(staggeredGridCells, modifier3, lazyStaggeredGridState3, paddingValues3, z6, f4, horizontal2, flingBehavior2, z5, overscrollEffect2, function1, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= 100663296;
                    i13 = i12;
                    if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    }
                    if ((i5 & 1024) != 0) {
                    }
                    if (composerKN.HI(((i7 & 306783379) == 306783378 && (i14 & 3) == 2) ? false : true, i7 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z4 = z2;
                i10 = i5 & 32;
                if (i10 == 0) {
                }
                i11 = i5 & 64;
                if (i11 == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i12 = i5 & 256;
                if (i12 != 0) {
                }
                i13 = i12;
                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                }
                if ((i5 & 1024) != 0) {
                }
                if (composerKN.HI(((i7 & 306783379) == 306783378 && (i14 & 3) == 2) ? false : true, i7 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            paddingValues2 = paddingValues;
            i9 = i5 & 16;
            if (i9 != 0) {
            }
            z4 = z2;
            i10 = i5 & 32;
            if (i10 == 0) {
            }
            i11 = i5 & 64;
            if (i11 == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i12 = i5 & 256;
            if (i12 != 0) {
            }
            i13 = i12;
            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            if ((i5 & 1024) != 0) {
            }
            if (composerKN.HI(((i7 & 306783379) == 306783378 && (i14 & 3) == 2) ? false : true, i7 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        paddingValues2 = paddingValues;
        i9 = i5 & 16;
        if (i9 != 0) {
        }
        z4 = z2;
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i12 = i5 & 256;
        if (i12 != 0) {
        }
        i13 = i12;
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        if ((i5 & 1024) != 0) {
        }
        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i14 & 3) == 2) ? false : true, i7 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    private static final LazyGridStaggeredGridSlotsProvider J2(final StaggeredGridCells staggeredGridCells, final Arrangement.Vertical vertical, final PaddingValues paddingValues, Composer composer, int i2) {
        boolean z2;
        boolean z3;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1532383053, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:259)");
        }
        boolean z4 = false;
        if ((((i2 & 14) ^ 6) > 4 && composer.p5(staggeredGridCells)) || (i2 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((((i2 & 112) ^ 48) > 32 && composer.p5(vertical)) || (i2 & 48) == 32) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z5 = z2 | z3;
        if ((((i2 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(paddingValues)) || (i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) {
            z4 = true;
        }
        boolean z6 = z5 | z4;
        Object objIF = composer.iF();
        if (z6 || objIF == Composer.INSTANCE.n()) {
            objIF = new LazyStaggeredGridSlotCache(new Function2<Density, Constraints, LazyStaggeredGridSlots>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberRowSlots$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyStaggeredGridSlots invoke(Density density, Constraints constraints) {
                    return n(density, constraints.getValue());
                }

                public final LazyStaggeredGridSlots n(Density density, long j2) {
                    boolean z7;
                    if (Constraints.gh(j2) != Integer.MAX_VALUE) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (!z7) {
                        InlineClassHelperKt.n("LazyHorizontalStaggeredGrid's height should be bound by parent.");
                    }
                    int iGh = Constraints.gh(j2) - density.How(Dp.KN(paddingValues.getTop() + paddingValues.getBottom()));
                    StaggeredGridCells staggeredGridCells2 = staggeredGridCells;
                    Arrangement.Vertical vertical2 = vertical;
                    int[] iArrN = staggeredGridCells2.n(density, iGh, density.How(vertical2.getSpacing()));
                    int[] iArr = new int[iArrN.length];
                    vertical2.rl(density, iGh, iArrN, iArr);
                    return new LazyStaggeredGridSlots(iArr, iArrN);
                }
            });
            composer.o(objIF);
        }
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (LazyGridStaggeredGridSlotsProvider) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return lazyGridStaggeredGridSlotsProvider;
    }

    private static final LazyGridStaggeredGridSlotsProvider O(final StaggeredGridCells staggeredGridCells, final Arrangement.Horizontal horizontal, final PaddingValues paddingValues, Composer composer, int i2) {
        boolean z2;
        boolean z3;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1267076841, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:134)");
        }
        boolean z4 = false;
        if ((((i2 & 14) ^ 6) > 4 && composer.p5(staggeredGridCells)) || (i2 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((((i2 & 112) ^ 48) > 32 && composer.p5(horizontal)) || (i2 & 48) == 32) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z5 = z2 | z3;
        if ((((i2 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(paddingValues)) || (i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) {
            z4 = true;
        }
        boolean z6 = z5 | z4;
        Object objIF = composer.iF();
        if (z6 || objIF == Composer.INSTANCE.n()) {
            objIF = new LazyStaggeredGridSlotCache(new Function2<Density, Constraints, LazyStaggeredGridSlots>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberColumnSlots$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyStaggeredGridSlots invoke(Density density, Constraints constraints) {
                    return n(density, constraints.getValue());
                }

                public final LazyStaggeredGridSlots n(Density density, long j2) {
                    boolean z7;
                    if (Constraints.qie(j2) != Integer.MAX_VALUE) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (!z7) {
                        InlineClassHelperKt.n("LazyVerticalStaggeredGrid's width should be bound by parent.");
                    }
                    PaddingValues paddingValues2 = paddingValues;
                    LayoutDirection layoutDirection = LayoutDirection.f34160n;
                    int iQie = Constraints.qie(j2) - density.How(Dp.KN(PaddingKt.Uo(paddingValues2, layoutDirection) + PaddingKt.J2(paddingValues, layoutDirection)));
                    StaggeredGridCells staggeredGridCells2 = staggeredGridCells;
                    Arrangement.Horizontal horizontal2 = horizontal;
                    int[] iArrN = staggeredGridCells2.n(density, iQie, density.How(horizontal2.getSpacing()));
                    int[] iArr = new int[iArrN.length];
                    horizontal2.t(density, iQie, iArrN, layoutDirection, iArr);
                    return new LazyStaggeredGridSlots(iArr, iArrN);
                }
            });
            composer.o(objIF);
        }
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (LazyGridStaggeredGridSlotsProvider) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return lazyGridStaggeredGridSlotsProvider;
    }
}
