package androidx.compose.foundation.lazy;

import GJW.vd;
import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¤\u0001\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¢\u0006\u0002\b\u001bH\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u009e\u0001\u0010,\u001a\u0019\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0(¢\u0006\u0002\b\u001b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0003¢\u0006\u0004\b,\u0010-¨\u0006."}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "isVertical", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "", "beyondBoundsItemCount", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;ILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProviderLambda", "LGJW/vd;", "coroutineScope", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "stickyItemsPlacement", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "rl", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;LGJW/vd;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,391:1\n557#2:392\n554#2,6:393\n1247#3,3:399\n1250#3,3:403\n1247#3,6:408\n555#4:402\n75#5:406\n75#5:407\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n*L\n89#1:392\n89#1:393,6\n89#1:399,3\n89#1:403,3\n188#1:408,6\n89#1:402\n90#1:406\n91#1:407\n*E\n"})
public final class LazyListKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Modifier modifier, final LazyListState lazyListState, final PaddingValues paddingValues, final boolean z2, final boolean z3, final FlingBehavior flingBehavior, final boolean z4, final OverscrollEffect overscrollEffect, int i2, Alignment.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, Arrangement.Horizontal horizontal2, final Function1 function1, Composer composer, final int i3, final int i5, final int i7) {
        int i8;
        PaddingValues paddingValues2;
        int i9;
        final int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        final Alignment.Horizontal horizontal3;
        final Arrangement.Vertical vertical3;
        final Alignment.Vertical vertical4;
        final Arrangement.Horizontal horizontal4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Modifier modifierRl;
        Composer composerKN = composer.KN(924924659);
        if ((i7 & 1) != 0) {
            i8 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i8 = (composerKN.p5(modifier) ? 4 : 2) | i3;
        } else {
            i8 = i3;
        }
        if ((i7 & 2) != 0) {
            i8 |= 48;
        } else if ((i3 & 48) == 0) {
            i8 |= composerKN.p5(lazyListState) ? 32 : 16;
        }
        if ((i7 & 4) != 0) {
            i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                paddingValues2 = paddingValues;
                i8 |= composerKN.p5(paddingValues2) ? 256 : 128;
            }
            if ((i7 & 8) == 0) {
                i8 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i8 |= composerKN.n(z2) ? 2048 : 1024;
            }
            if ((i7 & 16) == 0) {
                i8 |= 24576;
            } else if ((i3 & 24576) == 0) {
                i8 |= composerKN.n(z3) ? 16384 : 8192;
            }
            if ((i7 & 32) == 0) {
                i8 |= 196608;
            } else {
                if ((i3 & 196608) == 0) {
                    i8 |= composerKN.p5(flingBehavior) ? 131072 : 65536;
                }
                if ((i7 & 64) != 0) {
                    i8 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i8 |= composerKN.n(z4) ? 1048576 : 524288;
                }
                if ((i7 & 128) != 0) {
                    i8 |= 12582912;
                } else {
                    if ((i3 & 12582912) == 0) {
                        i8 |= composerKN.p5(overscrollEffect) ? 8388608 : 4194304;
                    }
                    i9 = i7 & 256;
                    if (i9 == 0) {
                        i8 |= 100663296;
                        i10 = i2;
                    } else {
                        i10 = i2;
                        if ((i3 & 100663296) == 0) {
                            i8 |= composerKN.t(i10) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                    }
                    i11 = i7 & 512;
                    if (i11 != 0) {
                        if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i12 = i11;
                            i8 |= composerKN.p5(horizontal) ? 536870912 : 268435456;
                        }
                        i13 = i7 & 1024;
                        if (i13 != 0) {
                            i15 = i5 | 6;
                            i14 = i13;
                        } else if ((i5 & 6) == 0) {
                            i14 = i13;
                            i15 = i5 | (composerKN.p5(vertical) ? 4 : 2);
                        } else {
                            i14 = i13;
                            i15 = i5;
                        }
                        i16 = i7 & 2048;
                        if (i16 != 0) {
                            i15 |= 48;
                            i17 = i16;
                        } else if ((i5 & 48) == 0) {
                            i17 = i16;
                            i15 |= composerKN.p5(vertical2) ? 32 : 16;
                        } else {
                            i17 = i16;
                        }
                        int i20 = i15;
                        i18 = i7 & 4096;
                        if (i18 != 0) {
                            i19 = i20 | RendererCapabilities.DECODER_SUPPORT_MASK;
                        } else {
                            int i21 = i20;
                            if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                i21 |= composerKN.p5(horizontal2) ? 256 : 128;
                            }
                            i19 = i21;
                        }
                        if ((i7 & 8192) != 0) {
                            i19 |= 3072;
                        } else if ((i5 & 3072) == 0) {
                            i19 |= composerKN.E2(function1) ? 2048 : 1024;
                        }
                        if (composerKN.HI(((306783379 & i8) == 306783378 && (i19 & 1171) == 1170) ? false : true, i8 & 1)) {
                            int i22 = i9 != 0 ? 0 : i10;
                            Alignment.Horizontal horizontal5 = i12 != 0 ? null : horizontal;
                            Arrangement.Vertical vertical5 = i14 != 0 ? null : vertical;
                            Alignment.Vertical vertical6 = i17 != 0 ? null : vertical2;
                            Arrangement.Horizontal horizontal6 = i18 != 0 ? null : horizontal2;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(924924659, i8, i19, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:84)");
                            }
                            int i23 = (i8 >> 3) & 14;
                            Function0 function0N = LazyListItemProviderKt.n(lazyListState, function1, composerKN, i23 | ((i19 >> 6) & 112));
                            int i24 = i8 >> 9;
                            int i25 = i19;
                            LazyLayoutSemanticState lazyLayoutSemanticStateN = LazyListSemanticsKt.n(lazyListState, z3, composerKN, i23 | (i24 & 112));
                            Object objIF = composerKN.iF();
                            if (objIF == Composer.INSTANCE.n()) {
                                objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                                composerKN.o(objIF);
                            }
                            vd vdVar = (vd) objIF;
                            GraphicsContext graphicsContext = (GraphicsContext) composerKN.ty(CompositionLocalsKt.mUb());
                            int i26 = i25 << 18;
                            int i27 = (i8 & 65520) | (i24 & 458752) | (i24 & 3670016) | (i26 & 29360128) | (i26 & 234881024) | ((i25 << 27) & 1879048192);
                            int i28 = i8;
                            Arrangement.Horizontal horizontal7 = horizontal6;
                            Function2 function2Rl = rl(function0N, lazyListState, paddingValues2, z2, z3, i22, horizontal5, vertical6, horizontal7, vertical5, vdVar, graphicsContext, !((Boolean) composerKN.ty(CompositionLocalsKt.ck())).booleanValue() ? StickyItemsPlacement.INSTANCE.n() : null, composerKN, i27, 0);
                            Alignment.Horizontal horizontal8 = horizontal5;
                            Alignment.Vertical vertical7 = vertical6;
                            Arrangement.Vertical vertical8 = vertical5;
                            int i29 = i22;
                            Orientation orientation = z3 ? Orientation.f16969n : Orientation.f16970t;
                            if (z4) {
                                composerKN.eF(-1513147781);
                                modifierRl = LazyLayoutBeyondBoundsModifierLocalKt.rl(Modifier.INSTANCE, LazyListBeyondBoundsModifierKt.n(lazyListState, i29, composerKN, i23 | ((i28 >> 21) & 112)), lazyListState.getBeyondBoundsInfo(), z2, orientation);
                                composerKN.Xw();
                            } else {
                                composerKN.eF(-1512720880);
                                composerKN.Xw();
                                modifierRl = Modifier.INSTANCE;
                            }
                            LazyLayoutKt.n(function0N, ScrollingContainerKt.n(LazyLayoutSemanticsKt.t(modifier.Zmq(lazyListState.getRemeasurementModifier()).Zmq(lazyListState.getAwaitLayoutModifier()), function0N, lazyLayoutSemanticStateN, orientation, z4, z2, composerKN, ((i28 >> 6) & 57344) | ((i28 << 6) & 458752)).Zmq(modifierRl).Zmq(lazyListState.getItemAnimator().getModifier()), lazyListState, orientation, z4, z2, flingBehavior, lazyListState.getInternalInteractionSource(), false, overscrollEffect, (256 & 256) != 0 ? null : null), lazyListState.getPrefetchState(), function2Rl, composerKN, 0, 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            i10 = i29;
                            horizontal3 = horizontal8;
                            vertical3 = vertical8;
                            vertical4 = vertical7;
                            horizontal4 = horizontal7;
                        } else {
                            composerKN.wTp();
                            horizontal3 = horizontal;
                            vertical3 = vertical;
                            vertical4 = vertical2;
                            horizontal4 = horizontal2;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    n(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer2, int i30) {
                                    LazyListKt.n(modifier, lazyListState, paddingValues, z2, z3, flingBehavior, z4, overscrollEffect, i10, horizontal3, vertical3, vertical4, horizontal4, function1, composer2, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5), i7);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i8 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    i12 = i11;
                    i13 = i7 & 1024;
                    if (i13 != 0) {
                    }
                    i16 = i7 & 2048;
                    if (i16 != 0) {
                    }
                    int i202 = i15;
                    i18 = i7 & 4096;
                    if (i18 != 0) {
                    }
                    if ((i7 & 8192) != 0) {
                    }
                    if (composerKN.HI(((306783379 & i8) == 306783378 && (i19 & 1171) == 1170) ? false : true, i8 & 1)) {
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i9 = i7 & 256;
                if (i9 == 0) {
                }
                i11 = i7 & 512;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i7 & 1024;
                if (i13 != 0) {
                }
                i16 = i7 & 2048;
                if (i16 != 0) {
                }
                int i2022 = i15;
                i18 = i7 & 4096;
                if (i18 != 0) {
                }
                if ((i7 & 8192) != 0) {
                }
                if (composerKN.HI(((306783379 & i8) == 306783378 && (i19 & 1171) == 1170) ? false : true, i8 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            if ((i7 & 64) != 0) {
            }
            if ((i7 & 128) != 0) {
            }
            i9 = i7 & 256;
            if (i9 == 0) {
            }
            i11 = i7 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i7 & 1024;
            if (i13 != 0) {
            }
            i16 = i7 & 2048;
            if (i16 != 0) {
            }
            int i20222 = i15;
            i18 = i7 & 4096;
            if (i18 != 0) {
            }
            if ((i7 & 8192) != 0) {
            }
            if (composerKN.HI(((306783379 & i8) == 306783378 && (i19 & 1171) == 1170) ? false : true, i8 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        paddingValues2 = paddingValues;
        if ((i7 & 8) == 0) {
        }
        if ((i7 & 16) == 0) {
        }
        if ((i7 & 32) == 0) {
        }
        if ((i7 & 64) != 0) {
        }
        if ((i7 & 128) != 0) {
        }
        i9 = i7 & 256;
        if (i9 == 0) {
        }
        i11 = i7 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i7 & 1024;
        if (i13 != 0) {
        }
        i16 = i7 & 2048;
        if (i16 != 0) {
        }
        int i202222 = i15;
        i18 = i7 & 4096;
        if (i18 != 0) {
        }
        if ((i7 & 8192) != 0) {
        }
        if (composerKN.HI(((306783379 & i8) == 306783378 && (i19 & 1171) == 1170) ? false : true, i8 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0075 A[PHI: r4
      0x0075: PHI (r4v17 boolean) = (r4v15 boolean), (r4v18 boolean) binds: [B:36:0x0073, B:32:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091 A[PHI: r9
      0x0091: PHI (r9v11 androidx.compose.ui.Alignment$Horizontal) = (r9v8 androidx.compose.ui.Alignment$Horizontal), (r9v12 androidx.compose.ui.Alignment$Horizontal) binds: [B:46:0x008f, B:42:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad A[PHI: r12
      0x00ad: PHI (r12v12 androidx.compose.ui.Alignment$Vertical) = (r12v9 androidx.compose.ui.Alignment$Vertical), (r12v13 androidx.compose.ui.Alignment$Vertical) binds: [B:56:0x00ab, B:52:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9 A[PHI: r13
      0x00c9: PHI (r13v12 androidx.compose.foundation.layout.Arrangement$Horizontal) = 
      (r13v9 androidx.compose.foundation.layout.Arrangement$Horizontal)
      (r13v13 androidx.compose.foundation.layout.Arrangement$Horizontal)
     binds: [B:66:0x00c7, B:62:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5 A[PHI: r14
      0x00e5: PHI (r14v12 androidx.compose.foundation.layout.Arrangement$Vertical) = 
      (r14v9 androidx.compose.foundation.layout.Arrangement$Vertical)
      (r14v13 androidx.compose.foundation.layout.Arrangement$Vertical)
     binds: [B:76:0x00e3, B:72:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0105 A[PHI: r5
      0x0105: PHI (r5v7 androidx.compose.foundation.lazy.layout.StickyItemsPlacement) = 
      (r5v5 androidx.compose.foundation.lazy.layout.StickyItemsPlacement)
      (r5v8 androidx.compose.foundation.lazy.layout.StickyItemsPlacement)
     binds: [B:86:0x0103, B:82:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Function2 rl(final Function0 function0, final LazyListState lazyListState, final PaddingValues paddingValues, final boolean z2, boolean z3, final int i2, Alignment.Horizontal horizontal, Alignment.Vertical vertical, Arrangement.Horizontal horizontal2, Arrangement.Vertical vertical2, final vd vdVar, final GraphicsContext graphicsContext, StickyItemsPlacement stickyItemsPlacement, Composer composer, int i3, int i5) {
        boolean z4;
        boolean z5;
        Alignment.Horizontal horizontal3;
        boolean z6;
        Alignment.Vertical vertical3;
        boolean z7;
        Arrangement.Horizontal horizontal4;
        boolean z9;
        Arrangement.Vertical vertical4;
        boolean z10;
        StickyItemsPlacement stickyItemsPlacement2;
        boolean z11;
        boolean z12;
        Object objIF;
        if (ComposerKt.v()) {
            ComposerKt.p5(-739270660, i3, i5, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:187)");
        }
        boolean z13 = ((((i3 & 112) ^ 48) > 32 && composer.p5(lazyListState)) || (i3 & 48) == 32) | ((((i3 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(paddingValues)) || (i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | ((((i3 & 7168) ^ 3072) > 2048 && composer.n(z2)) || (i3 & 3072) == 2048);
        if (((57344 & i3) ^ 24576) > 16384) {
            z4 = z3;
            if (composer.n(z4)) {
                z5 = true;
            }
            boolean z14 = z13 | z5;
            if (((3670016 & i3) ^ 1572864) <= 1048576) {
                horizontal3 = horizontal;
                if (composer.p5(horizontal3)) {
                    z6 = true;
                }
                boolean z15 = z14 | z6;
                if (((29360128 & i3) ^ 12582912) > 8388608) {
                    vertical3 = vertical;
                    if (composer.p5(vertical3)) {
                        z7 = true;
                    }
                    boolean z16 = z15 | z7;
                    if (((234881024 & i3) ^ 100663296) <= 67108864) {
                        horizontal4 = horizontal2;
                        if (composer.p5(horizontal4)) {
                            z9 = true;
                        }
                        boolean z17 = z16 | z9;
                        if (((1879048192 & i3) ^ com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) > 536870912) {
                            vertical4 = vertical2;
                            if (composer.p5(vertical4)) {
                                z10 = true;
                            }
                            boolean zP5 = z10 | z17 | composer.p5(graphicsContext);
                            if (((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) <= 256) {
                                stickyItemsPlacement2 = stickyItemsPlacement;
                                if (composer.p5(stickyItemsPlacement2)) {
                                    z11 = true;
                                }
                                z12 = zP5 | z11;
                                objIF = composer.iF();
                                if (z12 || objIF == Composer.INSTANCE.n()) {
                                    final Arrangement.Vertical vertical5 = vertical4;
                                    final Arrangement.Horizontal horizontal5 = horizontal4;
                                    final StickyItemsPlacement stickyItemsPlacement3 = stickyItemsPlacement2;
                                    final Alignment.Horizontal horizontal6 = horizontal3;
                                    final Alignment.Vertical vertical6 = vertical3;
                                    final boolean z18 = z4;
                                    Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult> function2 = new Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                                            return n(lazyLayoutMeasureScope, constraints.getValue());
                                        }

                                        public final LazyListMeasureResult n(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j2) {
                                            float spacing;
                                            LazyListItemProvider lazyListItemProvider;
                                            long jJ2;
                                            ObservableScopeInvalidator.n(lazyListState.getMeasurementScopeInvalidator());
                                            boolean z19 = lazyListState.getHasLookaheadOccurred() || lazyLayoutMeasureScope.Org();
                                            CheckScrollableContainerConstraintsKt.n(j2, z18 ? Orientation.f16969n : Orientation.f16970t);
                                            int iHow = z18 ? lazyLayoutMeasureScope.How(paddingValues.rl(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.How(PaddingKt.Uo(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                            int iHow2 = z18 ? lazyLayoutMeasureScope.How(paddingValues.t(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.How(PaddingKt.J2(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                            int iHow3 = lazyLayoutMeasureScope.How(paddingValues.getTop());
                                            int iHow4 = lazyLayoutMeasureScope.How(paddingValues.getBottom());
                                            final int i7 = iHow3 + iHow4;
                                            final int i8 = iHow + iHow2;
                                            boolean z20 = z18;
                                            int i9 = z20 ? i7 : i8;
                                            final int i10 = (!z20 || z2) ? (z20 && z2) ? iHow4 : (z20 || z2) ? iHow2 : iHow : iHow3;
                                            final int i11 = i9 - i10;
                                            final long jXMQ = ConstraintsKt.xMQ(j2, -i8, -i7);
                                            LazyListItemProvider lazyListItemProvider2 = (LazyListItemProvider) function0.invoke();
                                            lazyListItemProvider2.getItemScope().t(Constraints.qie(jXMQ), Constraints.gh(jXMQ));
                                            if (z18) {
                                                Arrangement.Vertical vertical7 = vertical5;
                                                if (vertical7 == null) {
                                                    InlineClassHelperKt.rl("null verticalArrangement when isVertical == true");
                                                    throw new KotlinNothingValueException();
                                                }
                                                spacing = vertical7.getSpacing();
                                            } else {
                                                Arrangement.Horizontal horizontal7 = horizontal5;
                                                if (horizontal7 == null) {
                                                    InlineClassHelperKt.rl("null horizontalAlignment when isVertical == false");
                                                    throw new KotlinNothingValueException();
                                                }
                                                spacing = horizontal7.getSpacing();
                                            }
                                            final int iHow5 = lazyLayoutMeasureScope.How(spacing);
                                            final int iN = lazyListItemProvider2.n();
                                            int iGh = z18 ? Constraints.gh(j2) - i7 : Constraints.qie(j2) - i8;
                                            if (!z2 || iGh > 0) {
                                                lazyListItemProvider = lazyListItemProvider2;
                                                jJ2 = IntOffset.J2((((long) iHow) << 32) | (((long) iHow3) & 4294967295L));
                                            } else {
                                                boolean z21 = z18;
                                                if (!z21) {
                                                    iHow += iGh;
                                                }
                                                if (z21) {
                                                    iHow3 += iGh;
                                                }
                                                lazyListItemProvider = lazyListItemProvider2;
                                                jJ2 = IntOffset.J2((((long) iHow) << 32) | (((long) iHow3) & 4294967295L));
                                            }
                                            final boolean z22 = z18;
                                            final Alignment.Horizontal horizontal8 = horizontal6;
                                            final long j3 = jJ2;
                                            final LazyListItemProvider lazyListItemProvider3 = lazyListItemProvider;
                                            final Alignment.Vertical vertical8 = vertical6;
                                            final boolean z23 = z2;
                                            final LazyListState lazyListState2 = lazyListState;
                                            LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(jXMQ, z22, lazyListItemProvider3, lazyLayoutMeasureScope, iN, iHow5, horizontal8, vertical8, z23, i10, i11, j3, lazyListState2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
                                                final /* synthetic */ int J2;
                                                final /* synthetic */ Alignment.Horizontal KN;

                                                /* JADX INFO: renamed from: O, reason: collision with root package name */
                                                final /* synthetic */ LazyLayoutMeasureScope f18074O;
                                                final /* synthetic */ int Uo;
                                                final /* synthetic */ long az;
                                                final /* synthetic */ int gh;
                                                final /* synthetic */ boolean mUb;
                                                final /* synthetic */ boolean nr;
                                                final /* synthetic */ int qie;
                                                final /* synthetic */ LazyListState ty;
                                                final /* synthetic */ Alignment.Vertical xMQ;

                                                {
                                                    this.nr = z22;
                                                    this.f18074O = lazyLayoutMeasureScope;
                                                    this.J2 = iN;
                                                    this.Uo = iHow5;
                                                    this.KN = horizontal8;
                                                    this.xMQ = vertical8;
                                                    this.mUb = z23;
                                                    this.gh = i10;
                                                    this.qie = i11;
                                                    this.az = j3;
                                                    this.ty = lazyListState2;
                                                }

                                                @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
                                                public LazyListMeasuredItem rl(int index, Object key, Object contentType, List placeables, long constraints) {
                                                    return new LazyListMeasuredItem(index, placeables, this.nr, this.KN, this.xMQ, this.f18074O.getLayoutDirection(), this.mUb, this.gh, this.qie, index == this.J2 + (-1) ? 0 : this.Uo, this.az, key, contentType, this.ty.getItemAnimator(), constraints, null);
                                                }
                                            };
                                            Snapshot.Companion companion = Snapshot.INSTANCE;
                                            LazyListState lazyListState3 = lazyListState;
                                            Snapshot snapshotNr = companion.nr();
                                            Function1 readObserver = snapshotNr != null ? snapshotNr.getReadObserver() : null;
                                            Snapshot snapshotO = companion.O(snapshotNr);
                                            try {
                                                int iRV9 = lazyListState3.rV9(lazyListItemProvider3, lazyListState3.o());
                                                int iZ = lazyListState3.Z();
                                                Unit unit = Unit.INSTANCE;
                                                companion.az(snapshotNr, snapshotO, readObserver);
                                                LazyListMeasureResult lazyListMeasureResultO = LazyListMeasureKt.O(iN, lazyListMeasuredItemProvider, iGh, i10, i11, iHow5, iRV9, iZ, (lazyLayoutMeasureScope.Org() || !z19) ? lazyListState.getScrollToBeConsumed() : lazyListState.E2(), jXMQ, z18, vertical5, horizontal5, z2, lazyLayoutMeasureScope, lazyListState.getItemAnimator(), i2, LazyLayoutBeyondBoundsStateKt.n(lazyListItemProvider3, lazyListState.getPinnedItems(), lazyListState.getBeyondBoundsInfo()), z19, lazyLayoutMeasureScope.Org(), lazyListState.getApproachLayoutInfo(), vdVar, lazyListState.getPlacementScopeInvalidator(), graphicsContext, stickyItemsPlacement3, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                                        return n(num.intValue(), num2.intValue(), function1);
                                                    }

                                                    public final MeasureResult n(int i12, int i13, Function1 function1) {
                                                        return lazyLayoutMeasureScope.Zn(ConstraintsKt.Uo(j2, i12 + i8), ConstraintsKt.J2(j2, i13 + i7), MapsKt.emptyMap(), function1);
                                                    }
                                                });
                                                LazyListState.ty(lazyListState, lazyListMeasureResultO, lazyLayoutMeasureScope.Org(), false, 4, null);
                                                return lazyListMeasureResultO;
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
                            stickyItemsPlacement2 = stickyItemsPlacement;
                            if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) {
                                z11 = false;
                            }
                            z12 = zP5 | z11;
                            objIF = composer.iF();
                            if (z12) {
                                final Arrangement.Vertical vertical52 = vertical4;
                                final Arrangement.Horizontal horizontal52 = horizontal4;
                                final StickyItemsPlacement stickyItemsPlacement32 = stickyItemsPlacement2;
                                final Alignment.Horizontal horizontal62 = horizontal3;
                                final Alignment.Vertical vertical62 = vertical3;
                                final boolean z182 = z4;
                                Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult> function23 = new Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                                        return n(lazyLayoutMeasureScope, constraints.getValue());
                                    }

                                    public final LazyListMeasureResult n(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j2) {
                                        float spacing;
                                        LazyListItemProvider lazyListItemProvider;
                                        long jJ2;
                                        ObservableScopeInvalidator.n(lazyListState.getMeasurementScopeInvalidator());
                                        boolean z19 = lazyListState.getHasLookaheadOccurred() || lazyLayoutMeasureScope.Org();
                                        CheckScrollableContainerConstraintsKt.n(j2, z182 ? Orientation.f16969n : Orientation.f16970t);
                                        int iHow = z182 ? lazyLayoutMeasureScope.How(paddingValues.rl(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.How(PaddingKt.Uo(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                        int iHow2 = z182 ? lazyLayoutMeasureScope.How(paddingValues.t(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.How(PaddingKt.J2(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                        int iHow3 = lazyLayoutMeasureScope.How(paddingValues.getTop());
                                        int iHow4 = lazyLayoutMeasureScope.How(paddingValues.getBottom());
                                        final int i7 = iHow3 + iHow4;
                                        final int i8 = iHow + iHow2;
                                        boolean z20 = z182;
                                        int i9 = z20 ? i7 : i8;
                                        final int i10 = (!z20 || z2) ? (z20 && z2) ? iHow4 : (z20 || z2) ? iHow2 : iHow : iHow3;
                                        final int i11 = i9 - i10;
                                        final long jXMQ = ConstraintsKt.xMQ(j2, -i8, -i7);
                                        LazyListItemProvider lazyListItemProvider2 = (LazyListItemProvider) function0.invoke();
                                        lazyListItemProvider2.getItemScope().t(Constraints.qie(jXMQ), Constraints.gh(jXMQ));
                                        if (z182) {
                                            Arrangement.Vertical vertical7 = vertical52;
                                            if (vertical7 == null) {
                                                InlineClassHelperKt.rl("null verticalArrangement when isVertical == true");
                                                throw new KotlinNothingValueException();
                                            }
                                            spacing = vertical7.getSpacing();
                                        } else {
                                            Arrangement.Horizontal horizontal7 = horizontal52;
                                            if (horizontal7 == null) {
                                                InlineClassHelperKt.rl("null horizontalAlignment when isVertical == false");
                                                throw new KotlinNothingValueException();
                                            }
                                            spacing = horizontal7.getSpacing();
                                        }
                                        final int iHow5 = lazyLayoutMeasureScope.How(spacing);
                                        final int iN = lazyListItemProvider2.n();
                                        int iGh = z182 ? Constraints.gh(j2) - i7 : Constraints.qie(j2) - i8;
                                        if (!z2 || iGh > 0) {
                                            lazyListItemProvider = lazyListItemProvider2;
                                            jJ2 = IntOffset.J2((((long) iHow) << 32) | (((long) iHow3) & 4294967295L));
                                        } else {
                                            boolean z21 = z182;
                                            if (!z21) {
                                                iHow += iGh;
                                            }
                                            if (z21) {
                                                iHow3 += iGh;
                                            }
                                            lazyListItemProvider = lazyListItemProvider2;
                                            jJ2 = IntOffset.J2((((long) iHow) << 32) | (((long) iHow3) & 4294967295L));
                                        }
                                        final boolean z22 = z182;
                                        final Alignment.Horizontal horizontal8 = horizontal62;
                                        final long j3 = jJ2;
                                        final LazyListItemProvider lazyListItemProvider3 = lazyListItemProvider;
                                        final Alignment.Vertical vertical8 = vertical62;
                                        final boolean z23 = z2;
                                        final LazyListState lazyListState2 = lazyListState;
                                        LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(jXMQ, z22, lazyListItemProvider3, lazyLayoutMeasureScope, iN, iHow5, horizontal8, vertical8, z23, i10, i11, j3, lazyListState2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
                                            final /* synthetic */ int J2;
                                            final /* synthetic */ Alignment.Horizontal KN;

                                            /* JADX INFO: renamed from: O, reason: collision with root package name */
                                            final /* synthetic */ LazyLayoutMeasureScope f18074O;
                                            final /* synthetic */ int Uo;
                                            final /* synthetic */ long az;
                                            final /* synthetic */ int gh;
                                            final /* synthetic */ boolean mUb;
                                            final /* synthetic */ boolean nr;
                                            final /* synthetic */ int qie;
                                            final /* synthetic */ LazyListState ty;
                                            final /* synthetic */ Alignment.Vertical xMQ;

                                            {
                                                this.nr = z22;
                                                this.f18074O = lazyLayoutMeasureScope;
                                                this.J2 = iN;
                                                this.Uo = iHow5;
                                                this.KN = horizontal8;
                                                this.xMQ = vertical8;
                                                this.mUb = z23;
                                                this.gh = i10;
                                                this.qie = i11;
                                                this.az = j3;
                                                this.ty = lazyListState2;
                                            }

                                            @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
                                            public LazyListMeasuredItem rl(int index, Object key, Object contentType, List placeables, long constraints) {
                                                return new LazyListMeasuredItem(index, placeables, this.nr, this.KN, this.xMQ, this.f18074O.getLayoutDirection(), this.mUb, this.gh, this.qie, index == this.J2 + (-1) ? 0 : this.Uo, this.az, key, contentType, this.ty.getItemAnimator(), constraints, null);
                                            }
                                        };
                                        Snapshot.Companion companion = Snapshot.INSTANCE;
                                        LazyListState lazyListState3 = lazyListState;
                                        Snapshot snapshotNr = companion.nr();
                                        Function1 readObserver = snapshotNr != null ? snapshotNr.getReadObserver() : null;
                                        Snapshot snapshotO = companion.O(snapshotNr);
                                        try {
                                            int iRV9 = lazyListState3.rV9(lazyListItemProvider3, lazyListState3.o());
                                            int iZ = lazyListState3.Z();
                                            Unit unit = Unit.INSTANCE;
                                            companion.az(snapshotNr, snapshotO, readObserver);
                                            LazyListMeasureResult lazyListMeasureResultO = LazyListMeasureKt.O(iN, lazyListMeasuredItemProvider, iGh, i10, i11, iHow5, iRV9, iZ, (lazyLayoutMeasureScope.Org() || !z19) ? lazyListState.getScrollToBeConsumed() : lazyListState.E2(), jXMQ, z182, vertical52, horizontal52, z2, lazyLayoutMeasureScope, lazyListState.getItemAnimator(), i2, LazyLayoutBeyondBoundsStateKt.n(lazyListItemProvider3, lazyListState.getPinnedItems(), lazyListState.getBeyondBoundsInfo()), z19, lazyLayoutMeasureScope.Org(), lazyListState.getApproachLayoutInfo(), vdVar, lazyListState.getPlacementScopeInvalidator(), graphicsContext, stickyItemsPlacement32, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                                    return n(num.intValue(), num2.intValue(), function1);
                                                }

                                                public final MeasureResult n(int i12, int i13, Function1 function1) {
                                                    return lazyLayoutMeasureScope.Zn(ConstraintsKt.Uo(j2, i12 + i8), ConstraintsKt.J2(j2, i13 + i7), MapsKt.emptyMap(), function1);
                                                }
                                            });
                                            LazyListState.ty(lazyListState, lazyListMeasureResultO, lazyLayoutMeasureScope.Org(), false, 4, null);
                                            return lazyListMeasureResultO;
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
                        vertical4 = vertical2;
                        if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) != 536870912) {
                            z10 = false;
                        }
                        boolean zP52 = z10 | z17 | composer.p5(graphicsContext);
                        if (((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) <= 256) {
                        }
                        if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) {
                        }
                        z12 = zP52 | z11;
                        objIF = composer.iF();
                        if (z12) {
                        }
                        Function2 function2222 = (Function2) objIF;
                        if (ComposerKt.v()) {
                        }
                        return function2222;
                    }
                    horizontal4 = horizontal2;
                    if ((100663296 & i3) == 67108864) {
                        z9 = false;
                    }
                    boolean z172 = z16 | z9;
                    if (((1879048192 & i3) ^ com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) > 536870912) {
                    }
                    if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) != 536870912) {
                    }
                    boolean zP522 = z10 | z172 | composer.p5(graphicsContext);
                    if (((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) <= 256) {
                    }
                    if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) {
                    }
                    z12 = zP522 | z11;
                    objIF = composer.iF();
                    if (z12) {
                    }
                    Function2 function22222 = (Function2) objIF;
                    if (ComposerKt.v()) {
                    }
                    return function22222;
                }
                vertical3 = vertical;
                if ((12582912 & i3) != 8388608) {
                    z7 = false;
                }
                boolean z162 = z15 | z7;
                if (((234881024 & i3) ^ 100663296) <= 67108864) {
                }
                if ((100663296 & i3) == 67108864) {
                }
                boolean z1722 = z162 | z9;
                if (((1879048192 & i3) ^ com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) > 536870912) {
                }
                if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) != 536870912) {
                }
                boolean zP5222 = z10 | z1722 | composer.p5(graphicsContext);
                if (((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) <= 256) {
                }
                if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) {
                }
                z12 = zP5222 | z11;
                objIF = composer.iF();
                if (z12) {
                }
                Function2 function222222 = (Function2) objIF;
                if (ComposerKt.v()) {
                }
                return function222222;
            }
            horizontal3 = horizontal;
            if ((1572864 & i3) == 1048576) {
                z6 = false;
            }
            boolean z152 = z14 | z6;
            if (((29360128 & i3) ^ 12582912) > 8388608) {
            }
            if ((12582912 & i3) != 8388608) {
            }
            boolean z1622 = z152 | z7;
            if (((234881024 & i3) ^ 100663296) <= 67108864) {
            }
            if ((100663296 & i3) == 67108864) {
            }
            boolean z17222 = z1622 | z9;
            if (((1879048192 & i3) ^ com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) > 536870912) {
            }
            if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) != 536870912) {
            }
            boolean zP52222 = z10 | z17222 | composer.p5(graphicsContext);
            if (((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) <= 256) {
            }
            if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) {
            }
            z12 = zP52222 | z11;
            objIF = composer.iF();
            if (z12) {
            }
            Function2 function2222222 = (Function2) objIF;
            if (ComposerKt.v()) {
            }
            return function2222222;
        }
        z4 = z3;
        if ((i3 & 24576) != 16384) {
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
        if (((234881024 & i3) ^ 100663296) <= 67108864) {
        }
        if ((100663296 & i3) == 67108864) {
        }
        boolean z172222 = z16222 | z9;
        if (((1879048192 & i3) ^ com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) > 536870912) {
        }
        if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) != 536870912) {
        }
        boolean zP522222 = z10 | z172222 | composer.p5(graphicsContext);
        if (((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) <= 256) {
        }
        if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) {
        }
        z12 = zP522222 | z11;
        objIF = composer.iF();
        if (z12) {
        }
        Function2 function22222222 = (Function2) objIF;
        if (ComposerKt.v()) {
        }
        return function22222222;
    }
}
