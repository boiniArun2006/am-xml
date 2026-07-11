package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
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
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u001a\u008c\u0001\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0080\u0001\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u008c\u0001\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0080\u0001\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b$\u0010%\u001a-\u0010+\u001a\b\u0012\u0004\u0012\u00020&0*2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells;", "columns", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, "t", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "nr", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rows", c.f62177j, "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "rl", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "Uo", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "KN", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "", "gridSize", "slotCount", "spacing", "", "J2", "(III)Ljava/util/List;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,656:1\n113#2:657\n113#2:658\n113#2:659\n113#2:660\n1247#3,6:661\n1247#3,6:667\n1#4:673\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n*L\n71#1:657\n103#1:658\n160#1:659\n192#1:660\n222#1:661,6\n249#1:667,6\n*E\n"})
public final class LazyGridDslKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List J2(int i2, int i3, int i5) {
        int i7 = i2 - (i5 * (i3 - 1));
        int i8 = i7 / i3;
        int i9 = i7 % i3;
        ArrayList arrayList = new ArrayList(i3);
        int i10 = 0;
        while (i10 < i3) {
            arrayList.add(Integer.valueOf((i10 < i9 ? 1 : 0) + i8));
            i10++;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, FlingBehavior flingBehavior, boolean z3, OverscrollEffect overscrollEffect, final Function1 function1, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        LazyGridState lazyGridState2;
        int i8;
        PaddingValues paddingValues2;
        int i9;
        boolean z4;
        int i10;
        int i11;
        Arrangement.Vertical vertical2;
        int i12;
        int i13;
        Composer composer2;
        final Arrangement.Horizontal horizontal2;
        final boolean z5;
        final Modifier modifier3;
        final LazyGridState lazyGridState3;
        final PaddingValues paddingValues3;
        final boolean z6;
        final Arrangement.Vertical vertical3;
        final FlingBehavior flingBehavior2;
        final OverscrollEffect overscrollEffect2;
        ScopeUpdateScope scopeUpdateScopeGh;
        LazyGridState lazyGridStateRl;
        Arrangement.Horizontal horizontalJ2;
        Arrangement.Vertical verticalUo;
        FlingBehavior flingBehaviorN;
        OverscrollEffect overscrollEffectRl;
        Modifier modifier4;
        LazyGridState lazyGridState4;
        PaddingValues paddingValues4;
        Arrangement.Horizontal horizontal3;
        FlingBehavior flingBehavior3;
        boolean z7;
        boolean z9;
        int i14;
        Composer composerKN = composer.KN(635941664);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.p5(gridCells) ? 4 : 2) | i2;
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
                    lazyGridState2 = lazyGridState;
                    int i16 = composerKN.p5(lazyGridState2) ? 256 : 128;
                    i7 |= i16;
                } else {
                    lazyGridState2 = lazyGridState;
                }
                i7 |= i16;
            } else {
                lazyGridState2 = lazyGridState;
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
                    if ((i2 & 196608) == 0) {
                        i7 |= ((i5 & 32) == 0 && composerKN.p5(horizontal)) ? 131072 : 65536;
                    }
                    i10 = i5 & 64;
                    if (i10 != 0) {
                        if ((i2 & 1572864) == 0) {
                            i11 = 196608;
                            vertical2 = vertical;
                            i7 |= composerKN.p5(vertical2) ? 1048576 : 524288;
                        }
                        if ((i2 & 12582912) == 0) {
                            i7 |= ((i5 & 128) == 0 && composerKN.p5(flingBehavior)) ? 8388608 : 4194304;
                        }
                        i12 = i5 & 256;
                        if (i12 != 0) {
                            i7 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i7 |= composerKN.n(z3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i7 |= ((i5 & 512) == 0 && composerKN.p5(overscrollEffect)) ? 536870912 : 268435456;
                        }
                        if ((i5 & 1024) != 0) {
                            i13 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i13 = i3 | (composerKN.E2(function1) ? 4 : 2);
                        } else {
                            i13 = i3;
                        }
                        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true, i7 & 1)) {
                            composerKN.e();
                            if ((i2 & 1) == 0 || composerKN.rV9()) {
                                Modifier modifier5 = i15 != 0 ? Modifier.INSTANCE : modifier2;
                                if ((i5 & 4) != 0) {
                                    lazyGridStateRl = LazyGridStateKt.rl(0, 0, composerKN, 0, 3);
                                    i7 &= -897;
                                } else {
                                    lazyGridStateRl = lazyGridState2;
                                }
                                PaddingValues paddingValuesN = i8 != 0 ? PaddingKt.n(Dp.KN(0)) : paddingValues2;
                                if (i9 != 0) {
                                    z4 = false;
                                }
                                if ((i5 & 32) != 0) {
                                    Arrangement arrangement = Arrangement.f17400n;
                                    horizontalJ2 = !z4 ? arrangement.J2() : arrangement.t();
                                    i7 &= -458753;
                                } else {
                                    horizontalJ2 = horizontal;
                                }
                                verticalUo = i10 != 0 ? Arrangement.f17400n.Uo() : vertical2;
                                if ((i5 & 128) != 0) {
                                    flingBehaviorN = ScrollableDefaults.f17001n.n(composerKN, 6);
                                    i7 &= -29360129;
                                } else {
                                    flingBehaviorN = flingBehavior;
                                }
                                boolean z10 = i12 == 0 ? z3 : true;
                                if ((i5 & 512) != 0) {
                                    i7 &= -1879048193;
                                    modifier4 = modifier5;
                                    overscrollEffectRl = OverscrollKt.rl(composerKN, 0);
                                } else {
                                    overscrollEffectRl = overscrollEffect;
                                    modifier4 = modifier5;
                                }
                                lazyGridState4 = lazyGridStateRl;
                                paddingValues4 = paddingValuesN;
                                horizontal3 = horizontalJ2;
                                flingBehavior3 = flingBehaviorN;
                                z7 = z4;
                                z9 = z10;
                                i14 = 635941664;
                            } else {
                                composerKN.wTp();
                                if ((i5 & 4) != 0) {
                                    i7 &= -897;
                                }
                                if ((i5 & 32) != 0) {
                                    i7 &= -458753;
                                }
                                if ((i5 & 128) != 0) {
                                    i7 &= -29360129;
                                }
                                if ((i5 & 512) != 0) {
                                    i7 &= -1879048193;
                                }
                                horizontal3 = horizontal;
                                flingBehavior3 = flingBehavior;
                                z9 = z3;
                                overscrollEffectRl = overscrollEffect;
                                lazyGridState4 = lazyGridState2;
                                paddingValues4 = paddingValues2;
                                z7 = z4;
                                verticalUo = vertical2;
                                i14 = 635941664;
                                modifier4 = modifier2;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(i14, i7, i13, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:168)");
                            }
                            int i17 = i7 >> 15;
                            int i18 = i7 >> 3;
                            composer2 = composerKN;
                            Arrangement.Vertical vertical4 = verticalUo;
                            LazyGridKt.n(modifier4, lazyGridState4, KN(gridCells, verticalUo, composerKN, (i7 & 14) | (i17 & 112)), paddingValues4, z7, false, flingBehavior3, z9, overscrollEffectRl, vertical4, horizontal3, function1, composer2, (i18 & 234881024) | (i18 & 14) | i11 | (i18 & 112) | (i7 & 7168) | (57344 & i7) | (3670016 & i18) | (29360128 & i18) | ((i7 << 9) & 1879048192), (i17 & 14) | ((i13 << 3) & 112), 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier3 = modifier4;
                            lazyGridState3 = lazyGridState4;
                            paddingValues3 = paddingValues4;
                            z6 = z7;
                            flingBehavior2 = flingBehavior3;
                            z5 = z9;
                            overscrollEffect2 = overscrollEffectRl;
                            vertical3 = vertical4;
                            horizontal2 = horizontal3;
                        } else {
                            composer2 = composerKN;
                            composer2.wTp();
                            horizontal2 = horizontal;
                            z5 = z3;
                            modifier3 = modifier2;
                            lazyGridState3 = lazyGridState2;
                            paddingValues3 = paddingValues2;
                            z6 = z4;
                            vertical3 = vertical2;
                            flingBehavior2 = flingBehavior;
                            overscrollEffect2 = overscrollEffect;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1
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
                                    LazyGridDslKt.n(gridCells, modifier3, lazyGridState3, paddingValues3, z6, horizontal2, vertical3, flingBehavior2, z5, overscrollEffect2, function1, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= 1572864;
                    i11 = 196608;
                    vertical2 = vertical;
                    if ((i2 & 12582912) == 0) {
                    }
                    i12 = i5 & 256;
                    if (i12 != 0) {
                    }
                    if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    }
                    if ((i5 & 1024) != 0) {
                    }
                    if (composerKN.HI(((i7 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true, i7 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z4 = z2;
                if ((i2 & 196608) == 0) {
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                }
                i11 = 196608;
                vertical2 = vertical;
                if ((i2 & 12582912) == 0) {
                }
                i12 = i5 & 256;
                if (i12 != 0) {
                }
                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                }
                if ((i5 & 1024) != 0) {
                }
                if (composerKN.HI(((i7 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true, i7 & 1)) {
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
            if ((i2 & 196608) == 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = 196608;
            vertical2 = vertical;
            if ((i2 & 12582912) == 0) {
            }
            i12 = i5 & 256;
            if (i12 != 0) {
            }
            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            if ((i5 & 1024) != 0) {
            }
            if (composerKN.HI(((i7 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true, i7 & 1)) {
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
        if ((i2 & 196608) == 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = 196608;
        vertical2 = vertical;
        if ((i2 & 12582912) == 0) {
        }
        i12 = i5 & 256;
        if (i12 != 0) {
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        if ((i5 & 1024) != 0) {
        }
        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true, i7 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void nr(final GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z2, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z3, final Function1 function1, Composer composer, final int i2, final int i3) {
        GridCells gridCells2;
        int i5;
        LazyGridState lazyGridStateRl;
        int i7;
        PaddingValues paddingValues2;
        int i8;
        boolean z4;
        Arrangement.Vertical vertical2;
        int i9;
        Arrangement.Horizontal horizontal2;
        int i10;
        int i11;
        Composer composer2;
        final Modifier modifier2;
        final FlingBehavior flingBehavior2;
        final LazyGridState lazyGridState2;
        final PaddingValues paddingValues3;
        final boolean z5;
        final Arrangement.Vertical vertical3;
        final Arrangement.Horizontal horizontal3;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeGh;
        Arrangement.Vertical verticalUo;
        FlingBehavior flingBehaviorN;
        boolean z7;
        Modifier modifier3;
        LazyGridState lazyGridState3;
        PaddingValues paddingValues4;
        Arrangement.Vertical vertical4;
        Arrangement.Horizontal horizontal4;
        boolean z9;
        FlingBehavior flingBehavior3;
        int i12;
        Composer composerKN = composer.KN(1485410512);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            gridCells2 = gridCells;
        } else {
            gridCells2 = gridCells;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.p5(gridCells2) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i13 = i3 & 2;
        if (i13 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.p5(modifier) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    lazyGridStateRl = lazyGridState;
                    int i14 = composerKN.p5(lazyGridStateRl) ? 256 : 128;
                    i5 |= i14;
                } else {
                    lazyGridStateRl = lazyGridState;
                }
                i5 |= i14;
            } else {
                lazyGridStateRl = lazyGridState;
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
                    if ((196608 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            vertical2 = vertical;
                            int i15 = composerKN.p5(vertical2) ? 131072 : 65536;
                            i5 |= i15;
                        } else {
                            vertical2 = vertical;
                        }
                        i5 |= i15;
                    } else {
                        vertical2 = vertical;
                    }
                    i9 = i3 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                    } else {
                        if ((1572864 & i2) == 0) {
                            horizontal2 = horizontal;
                            i5 |= composerKN.p5(horizontal2) ? 1048576 : 524288;
                        }
                        if ((i2 & 12582912) == 0) {
                            i5 |= ((i3 & 128) == 0 && composerKN.p5(flingBehavior)) ? 8388608 : 4194304;
                        }
                        i10 = i3 & 256;
                        if (i10 != 0) {
                            i5 |= 100663296;
                        } else {
                            if ((i2 & 100663296) == 0) {
                                i11 = i10;
                                i5 |= composerKN.n(z3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            if ((i3 & 512) != 0) {
                                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                    i5 |= composerKN.E2(function1) ? 536870912 : 268435456;
                                }
                                if (composerKN.HI((i5 & 306783379) != 306783378, i5 & 1)) {
                                    composerKN.e();
                                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                                        Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier;
                                        if ((i3 & 4) != 0) {
                                            lazyGridStateRl = LazyGridStateKt.rl(0, 0, composerKN, 0, 3);
                                            i5 &= -897;
                                        }
                                        PaddingValues paddingValuesN = i7 != 0 ? PaddingKt.n(Dp.KN(0)) : paddingValues2;
                                        if (i8 != 0) {
                                            z4 = false;
                                        }
                                        if ((i3 & 32) != 0) {
                                            Arrangement arrangement = Arrangement.f17400n;
                                            verticalUo = !z4 ? arrangement.Uo() : arrangement.n();
                                            i5 &= -458753;
                                        } else {
                                            verticalUo = vertical2;
                                        }
                                        Arrangement.Horizontal horizontalJ2 = i9 != 0 ? Arrangement.f17400n.J2() : horizontal2;
                                        if ((i3 & 128) != 0) {
                                            flingBehaviorN = ScrollableDefaults.f17001n.n(composerKN, 6);
                                            i5 &= -29360129;
                                        } else {
                                            flingBehaviorN = flingBehavior;
                                        }
                                        if (i11 != 0) {
                                            modifier3 = modifier4;
                                            lazyGridState3 = lazyGridStateRl;
                                            paddingValues4 = paddingValuesN;
                                            horizontal4 = horizontalJ2;
                                            z9 = z4;
                                            flingBehavior3 = flingBehaviorN;
                                            z7 = true;
                                            i12 = 1485410512;
                                            vertical4 = verticalUo;
                                        } else {
                                            z7 = z3;
                                            modifier3 = modifier4;
                                            lazyGridState3 = lazyGridStateRl;
                                            paddingValues4 = paddingValuesN;
                                            vertical4 = verticalUo;
                                            horizontal4 = horizontalJ2;
                                            z9 = z4;
                                            flingBehavior3 = flingBehaviorN;
                                            i12 = 1485410512;
                                        }
                                    } else {
                                        composerKN.wTp();
                                        if ((i3 & 4) != 0) {
                                            i5 &= -897;
                                        }
                                        if ((i3 & 32) != 0) {
                                            i5 &= -458753;
                                        }
                                        if ((i3 & 128) != 0) {
                                            i5 &= -29360129;
                                        }
                                        modifier3 = modifier;
                                        flingBehavior3 = flingBehavior;
                                        z7 = z3;
                                        paddingValues4 = paddingValues2;
                                        z9 = z4;
                                        vertical4 = vertical2;
                                        horizontal4 = horizontal2;
                                        i12 = 1485410512;
                                        lazyGridState3 = lazyGridStateRl;
                                    }
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(i12, i5, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:110)");
                                    }
                                    composer2 = composerKN;
                                    t(gridCells2, modifier3, lazyGridState3, paddingValues4, z9, vertical4, horizontal4, flingBehavior3, z7, OverscrollKt.rl(composerKN, 0), function1, composer2, i5 & 268435454, (i5 >> 27) & 14, 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    modifier2 = modifier3;
                                    lazyGridState2 = lazyGridState3;
                                    paddingValues3 = paddingValues4;
                                    z5 = z9;
                                    vertical3 = vertical4;
                                    horizontal3 = horizontal4;
                                    flingBehavior2 = flingBehavior3;
                                    z6 = z7;
                                } else {
                                    composer2 = composerKN;
                                    composer2.wTp();
                                    modifier2 = modifier;
                                    flingBehavior2 = flingBehavior;
                                    lazyGridState2 = lazyGridStateRl;
                                    paddingValues3 = paddingValues2;
                                    z5 = z4;
                                    vertical3 = vertical2;
                                    horizontal3 = horizontal2;
                                    z6 = z3;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
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
                                            LazyGridDslKt.nr(gridCells, modifier2, lazyGridState2, paddingValues3, z5, vertical3, horizontal3, flingBehavior2, z6, function1, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
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
                        i11 = i10;
                        if ((i3 & 512) != 0) {
                        }
                        if (composerKN.HI((i5 & 306783379) != 306783378, i5 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    horizontal2 = horizontal;
                    if ((i2 & 12582912) == 0) {
                    }
                    i10 = i3 & 256;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    if ((i3 & 512) != 0) {
                    }
                    if (composerKN.HI((i5 & 306783379) != 306783378, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z4 = z2;
                if ((196608 & i2) != 0) {
                }
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                horizontal2 = horizontal;
                if ((i2 & 12582912) == 0) {
                }
                i10 = i3 & 256;
                if (i10 != 0) {
                }
                i11 = i10;
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
            if ((196608 & i2) != 0) {
            }
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            horizontal2 = horizontal;
            if ((i2 & 12582912) == 0) {
            }
            i10 = i3 & 256;
            if (i10 != 0) {
            }
            i11 = i10;
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
        if ((196608 & i2) != 0) {
        }
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        horizontal2 = horizontal;
        if ((i2 & 12582912) == 0) {
        }
        i10 = i3 & 256;
        if (i10 != 0) {
        }
        i11 = i10;
        if ((i3 & 512) != 0) {
        }
        if (composerKN.HI((i5 & 306783379) != 306783378, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void rl(final GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, FlingBehavior flingBehavior, boolean z3, final Function1 function1, Composer composer, final int i2, final int i3) {
        GridCells gridCells2;
        int i5;
        LazyGridState lazyGridStateRl;
        int i7;
        PaddingValues paddingValues2;
        int i8;
        boolean z4;
        Arrangement.Horizontal horizontal2;
        int i9;
        Arrangement.Vertical vertical2;
        int i10;
        int i11;
        Composer composer2;
        final Modifier modifier2;
        final FlingBehavior flingBehavior2;
        final LazyGridState lazyGridState2;
        final PaddingValues paddingValues3;
        final boolean z5;
        final Arrangement.Horizontal horizontal3;
        final Arrangement.Vertical vertical3;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeGh;
        Arrangement.Horizontal horizontalJ2;
        FlingBehavior flingBehaviorN;
        boolean z7;
        Modifier modifier3;
        LazyGridState lazyGridState3;
        PaddingValues paddingValues4;
        Arrangement.Horizontal horizontal4;
        Arrangement.Vertical vertical4;
        boolean z9;
        FlingBehavior flingBehavior3;
        int i12;
        Composer composerKN = composer.KN(2123608858);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            gridCells2 = gridCells;
        } else {
            gridCells2 = gridCells;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.p5(gridCells2) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i13 = i3 & 2;
        if (i13 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.p5(modifier) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    lazyGridStateRl = lazyGridState;
                    int i14 = composerKN.p5(lazyGridStateRl) ? 256 : 128;
                    i5 |= i14;
                } else {
                    lazyGridStateRl = lazyGridState;
                }
                i5 |= i14;
            } else {
                lazyGridStateRl = lazyGridState;
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
                    if ((196608 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            horizontal2 = horizontal;
                            int i15 = composerKN.p5(horizontal2) ? 131072 : 65536;
                            i5 |= i15;
                        } else {
                            horizontal2 = horizontal;
                        }
                        i5 |= i15;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i9 = i3 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                    } else {
                        if ((1572864 & i2) == 0) {
                            vertical2 = vertical;
                            i5 |= composerKN.p5(vertical2) ? 1048576 : 524288;
                        }
                        if ((i2 & 12582912) == 0) {
                            i5 |= ((i3 & 128) == 0 && composerKN.p5(flingBehavior)) ? 8388608 : 4194304;
                        }
                        i10 = i3 & 256;
                        if (i10 != 0) {
                            i5 |= 100663296;
                        } else {
                            if ((i2 & 100663296) == 0) {
                                i11 = i10;
                                i5 |= composerKN.n(z3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            if ((i3 & 512) != 0) {
                                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                    i5 |= composerKN.E2(function1) ? 536870912 : 268435456;
                                }
                                if (composerKN.HI((i5 & 306783379) != 306783378, i5 & 1)) {
                                    composerKN.e();
                                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                                        Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier;
                                        if ((i3 & 4) != 0) {
                                            lazyGridStateRl = LazyGridStateKt.rl(0, 0, composerKN, 0, 3);
                                            i5 &= -897;
                                        }
                                        PaddingValues paddingValuesN = i7 != 0 ? PaddingKt.n(Dp.KN(0)) : paddingValues2;
                                        if (i8 != 0) {
                                            z4 = false;
                                        }
                                        if ((i3 & 32) != 0) {
                                            Arrangement arrangement = Arrangement.f17400n;
                                            horizontalJ2 = !z4 ? arrangement.J2() : arrangement.t();
                                            i5 &= -458753;
                                        } else {
                                            horizontalJ2 = horizontal2;
                                        }
                                        Arrangement.Vertical verticalUo = i9 != 0 ? Arrangement.f17400n.Uo() : vertical2;
                                        if ((i3 & 128) != 0) {
                                            flingBehaviorN = ScrollableDefaults.f17001n.n(composerKN, 6);
                                            i5 &= -29360129;
                                        } else {
                                            flingBehaviorN = flingBehavior;
                                        }
                                        if (i11 != 0) {
                                            modifier3 = modifier4;
                                            lazyGridState3 = lazyGridStateRl;
                                            paddingValues4 = paddingValuesN;
                                            vertical4 = verticalUo;
                                            z9 = z4;
                                            flingBehavior3 = flingBehaviorN;
                                            z7 = true;
                                            i12 = 2123608858;
                                            horizontal4 = horizontalJ2;
                                        } else {
                                            z7 = z3;
                                            modifier3 = modifier4;
                                            lazyGridState3 = lazyGridStateRl;
                                            paddingValues4 = paddingValuesN;
                                            horizontal4 = horizontalJ2;
                                            vertical4 = verticalUo;
                                            z9 = z4;
                                            flingBehavior3 = flingBehaviorN;
                                            i12 = 2123608858;
                                        }
                                    } else {
                                        composerKN.wTp();
                                        if ((i3 & 4) != 0) {
                                            i5 &= -897;
                                        }
                                        if ((i3 & 32) != 0) {
                                            i5 &= -458753;
                                        }
                                        if ((i3 & 128) != 0) {
                                            i5 &= -29360129;
                                        }
                                        modifier3 = modifier;
                                        flingBehavior3 = flingBehavior;
                                        z7 = z3;
                                        paddingValues4 = paddingValues2;
                                        z9 = z4;
                                        horizontal4 = horizontal2;
                                        vertical4 = vertical2;
                                        i12 = 2123608858;
                                        lazyGridState3 = lazyGridStateRl;
                                    }
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(i12, i5, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:199)");
                                    }
                                    composer2 = composerKN;
                                    n(gridCells2, modifier3, lazyGridState3, paddingValues4, z9, horizontal4, vertical4, flingBehavior3, z7, OverscrollKt.rl(composerKN, 0), function1, composer2, i5 & 268435454, (i5 >> 27) & 14, 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    modifier2 = modifier3;
                                    lazyGridState2 = lazyGridState3;
                                    paddingValues3 = paddingValues4;
                                    z5 = z9;
                                    horizontal3 = horizontal4;
                                    vertical3 = vertical4;
                                    flingBehavior2 = flingBehavior3;
                                    z6 = z7;
                                } else {
                                    composer2 = composerKN;
                                    composer2.wTp();
                                    modifier2 = modifier;
                                    flingBehavior2 = flingBehavior;
                                    lazyGridState2 = lazyGridStateRl;
                                    paddingValues3 = paddingValues2;
                                    z5 = z4;
                                    horizontal3 = horizontal2;
                                    vertical3 = vertical2;
                                    z6 = z3;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$2
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
                                            LazyGridDslKt.rl(gridCells, modifier2, lazyGridState2, paddingValues3, z5, horizontal3, vertical3, flingBehavior2, z6, function1, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
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
                        i11 = i10;
                        if ((i3 & 512) != 0) {
                        }
                        if (composerKN.HI((i5 & 306783379) != 306783378, i5 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    vertical2 = vertical;
                    if ((i2 & 12582912) == 0) {
                    }
                    i10 = i3 & 256;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    if ((i3 & 512) != 0) {
                    }
                    if (composerKN.HI((i5 & 306783379) != 306783378, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z4 = z2;
                if ((196608 & i2) != 0) {
                }
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                vertical2 = vertical;
                if ((i2 & 12582912) == 0) {
                }
                i10 = i3 & 256;
                if (i10 != 0) {
                }
                i11 = i10;
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
            if ((196608 & i2) != 0) {
            }
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            vertical2 = vertical;
            if ((i2 & 12582912) == 0) {
            }
            i10 = i3 & 256;
            if (i10 != 0) {
            }
            i11 = i10;
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
        if ((196608 & i2) != 0) {
        }
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        vertical2 = vertical;
        if ((i2 & 12582912) == 0) {
        }
        i10 = i3 & 256;
        if (i10 != 0) {
        }
        i11 = i10;
        if ((i3 & 512) != 0) {
        }
        if (composerKN.HI((i5 & 306783379) != 306783378, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z2, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z3, OverscrollEffect overscrollEffect, final Function1 function1, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        LazyGridState lazyGridState2;
        int i8;
        PaddingValues paddingValues2;
        int i9;
        boolean z4;
        int i10;
        int i11;
        Arrangement.Horizontal horizontal2;
        int i12;
        int i13;
        Composer composer2;
        final Arrangement.Vertical vertical2;
        final boolean z5;
        final Modifier modifier3;
        final LazyGridState lazyGridState3;
        final PaddingValues paddingValues3;
        final boolean z6;
        final Arrangement.Horizontal horizontal3;
        final FlingBehavior flingBehavior2;
        final OverscrollEffect overscrollEffect2;
        ScopeUpdateScope scopeUpdateScopeGh;
        LazyGridState lazyGridStateRl;
        Arrangement.Vertical verticalUo;
        Arrangement.Horizontal horizontalJ2;
        FlingBehavior flingBehaviorN;
        OverscrollEffect overscrollEffectRl;
        Modifier modifier4;
        LazyGridState lazyGridState4;
        PaddingValues paddingValues4;
        Arrangement.Vertical vertical3;
        FlingBehavior flingBehavior3;
        boolean z7;
        boolean z9;
        int i14;
        Composer composerKN = composer.KN(-2072102870);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.p5(gridCells) ? 4 : 2) | i2;
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
                    lazyGridState2 = lazyGridState;
                    int i16 = composerKN.p5(lazyGridState2) ? 256 : 128;
                    i7 |= i16;
                } else {
                    lazyGridState2 = lazyGridState;
                }
                i7 |= i16;
            } else {
                lazyGridState2 = lazyGridState;
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
                    if ((i2 & 196608) == 0) {
                        i7 |= ((i5 & 32) == 0 && composerKN.p5(vertical)) ? 131072 : 65536;
                    }
                    i10 = i5 & 64;
                    if (i10 != 0) {
                        if ((i2 & 1572864) == 0) {
                            i11 = 196608;
                            horizontal2 = horizontal;
                            i7 |= composerKN.p5(horizontal2) ? 1048576 : 524288;
                        }
                        if ((i2 & 12582912) == 0) {
                            i7 |= ((i5 & 128) == 0 && composerKN.p5(flingBehavior)) ? 8388608 : 4194304;
                        }
                        i12 = i5 & 256;
                        if (i12 != 0) {
                            i7 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i7 |= composerKN.n(z3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i7 |= ((i5 & 512) == 0 && composerKN.p5(overscrollEffect)) ? 536870912 : 268435456;
                        }
                        if ((i5 & 1024) != 0) {
                            i13 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i13 = i3 | (composerKN.E2(function1) ? 4 : 2);
                        } else {
                            i13 = i3;
                        }
                        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true, i7 & 1)) {
                            composerKN.e();
                            if ((i2 & 1) == 0 || composerKN.rV9()) {
                                Modifier modifier5 = i15 != 0 ? Modifier.INSTANCE : modifier2;
                                if ((i5 & 4) != 0) {
                                    lazyGridStateRl = LazyGridStateKt.rl(0, 0, composerKN, 0, 3);
                                    i7 &= -897;
                                } else {
                                    lazyGridStateRl = lazyGridState2;
                                }
                                PaddingValues paddingValuesN = i8 != 0 ? PaddingKt.n(Dp.KN(0)) : paddingValues2;
                                if (i9 != 0) {
                                    z4 = false;
                                }
                                if ((i5 & 32) != 0) {
                                    Arrangement arrangement = Arrangement.f17400n;
                                    verticalUo = !z4 ? arrangement.Uo() : arrangement.n();
                                    i7 &= -458753;
                                } else {
                                    verticalUo = vertical;
                                }
                                horizontalJ2 = i10 != 0 ? Arrangement.f17400n.J2() : horizontal2;
                                if ((i5 & 128) != 0) {
                                    flingBehaviorN = ScrollableDefaults.f17001n.n(composerKN, 6);
                                    i7 &= -29360129;
                                } else {
                                    flingBehaviorN = flingBehavior;
                                }
                                boolean z10 = i12 == 0 ? z3 : true;
                                if ((i5 & 512) != 0) {
                                    i7 &= -1879048193;
                                    modifier4 = modifier5;
                                    overscrollEffectRl = OverscrollKt.rl(composerKN, 0);
                                } else {
                                    overscrollEffectRl = overscrollEffect;
                                    modifier4 = modifier5;
                                }
                                lazyGridState4 = lazyGridStateRl;
                                paddingValues4 = paddingValuesN;
                                vertical3 = verticalUo;
                                flingBehavior3 = flingBehaviorN;
                                z7 = z4;
                                z9 = z10;
                                i14 = -2072102870;
                            } else {
                                composerKN.wTp();
                                if ((i5 & 4) != 0) {
                                    i7 &= -897;
                                }
                                if ((i5 & 32) != 0) {
                                    i7 &= -458753;
                                }
                                if ((i5 & 128) != 0) {
                                    i7 &= -29360129;
                                }
                                if ((i5 & 512) != 0) {
                                    i7 &= -1879048193;
                                }
                                vertical3 = vertical;
                                flingBehavior3 = flingBehavior;
                                z9 = z3;
                                overscrollEffectRl = overscrollEffect;
                                lazyGridState4 = lazyGridState2;
                                paddingValues4 = paddingValues2;
                                z7 = z4;
                                horizontalJ2 = horizontal2;
                                i14 = -2072102870;
                                modifier4 = modifier2;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(i14, i7, i13, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                            }
                            int i17 = i7 >> 3;
                            composer2 = composerKN;
                            Arrangement.Horizontal horizontal4 = horizontalJ2;
                            LazyGridKt.n(modifier4, lazyGridState4, Uo(gridCells, horizontalJ2, composerKN, (i7 & 14) | ((i7 >> 15) & 112)), paddingValues4, z7, true, flingBehavior3, z9, overscrollEffectRl, vertical3, horizontal4, function1, composer2, (i17 & 234881024) | (i17 & 14) | i11 | (i17 & 112) | (i7 & 7168) | (57344 & i7) | (3670016 & i17) | (29360128 & i17) | ((i7 << 12) & 1879048192), ((i7 >> 18) & 14) | ((i13 << 3) & 112), 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier3 = modifier4;
                            lazyGridState3 = lazyGridState4;
                            paddingValues3 = paddingValues4;
                            z6 = z7;
                            flingBehavior2 = flingBehavior3;
                            z5 = z9;
                            overscrollEffect2 = overscrollEffectRl;
                            vertical2 = vertical3;
                            horizontal3 = horizontal4;
                        } else {
                            composer2 = composerKN;
                            composer2.wTp();
                            vertical2 = vertical;
                            z5 = z3;
                            modifier3 = modifier2;
                            lazyGridState3 = lazyGridState2;
                            paddingValues3 = paddingValues2;
                            z6 = z4;
                            horizontal3 = horizontal2;
                            flingBehavior2 = flingBehavior;
                            overscrollEffect2 = overscrollEffect;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i18) {
                                    LazyGridDslKt.t(gridCells, modifier3, lazyGridState3, paddingValues3, z6, vertical2, horizontal3, flingBehavior2, z5, overscrollEffect2, function1, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= 1572864;
                    i11 = 196608;
                    horizontal2 = horizontal;
                    if ((i2 & 12582912) == 0) {
                    }
                    i12 = i5 & 256;
                    if (i12 != 0) {
                    }
                    if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    }
                    if ((i5 & 1024) != 0) {
                    }
                    if (composerKN.HI(((i7 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true, i7 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z4 = z2;
                if ((i2 & 196608) == 0) {
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                }
                i11 = 196608;
                horizontal2 = horizontal;
                if ((i2 & 12582912) == 0) {
                }
                i12 = i5 & 256;
                if (i12 != 0) {
                }
                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                }
                if ((i5 & 1024) != 0) {
                }
                if (composerKN.HI(((i7 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true, i7 & 1)) {
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
            if ((i2 & 196608) == 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = 196608;
            horizontal2 = horizontal;
            if ((i2 & 12582912) == 0) {
            }
            i12 = i5 & 256;
            if (i12 != 0) {
            }
            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            if ((i5 & 1024) != 0) {
            }
            if (composerKN.HI(((i7 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true, i7 & 1)) {
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
        if ((i2 & 196608) == 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = 196608;
        horizontal2 = horizontal;
        if ((i2 & 12582912) == 0) {
        }
        i12 = i5 & 256;
        if (i12 != 0) {
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        if ((i5 & 1024) != 0) {
        }
        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true, i7 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    private static final LazyGridSlotsProvider KN(final GridCells gridCells, final Arrangement.Vertical vertical, Composer composer, int i2) {
        boolean z2;
        if (ComposerKt.v()) {
            ComposerKt.p5(-150818144, i2, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:248)");
        }
        boolean z3 = false;
        if ((((i2 & 14) ^ 6) > 4 && composer.p5(gridCells)) || (i2 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((((i2 & 112) ^ 48) > 32 && composer.p5(vertical)) || (i2 & 48) == 32) {
            z3 = true;
        }
        boolean z4 = z2 | z3;
        Object objIF = composer.iF();
        if (z4 || objIF == Composer.INSTANCE.n()) {
            objIF = new GridSlotCache(new Function2<Density, Constraints, LazyGridSlots>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberRowHeightSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyGridSlots invoke(Density density, Constraints constraints) {
                    return n(density, constraints.getValue());
                }

                public final LazyGridSlots n(Density density, long j2) {
                    boolean z5;
                    if (Constraints.gh(j2) != Integer.MAX_VALUE) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z5) {
                        InlineClassHelperKt.n("LazyHorizontalGrid's height should be bound by parent.");
                    }
                    int iGh = Constraints.gh(j2);
                    GridCells gridCells2 = gridCells;
                    Arrangement.Vertical vertical2 = vertical;
                    int[] intArray = CollectionsKt.toIntArray(gridCells2.n(density, iGh, density.How(vertical2.getSpacing())));
                    int[] iArr = new int[intArray.length];
                    vertical2.rl(density, iGh, intArray, iArr);
                    return new LazyGridSlots(intArray, iArr);
                }
            });
            composer.o(objIF);
        }
        LazyGridSlotsProvider lazyGridSlotsProvider = (LazyGridSlotsProvider) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return lazyGridSlotsProvider;
    }

    private static final LazyGridSlotsProvider Uo(final GridCells gridCells, final Arrangement.Horizontal horizontal, Composer composer, int i2) {
        boolean z2;
        if (ComposerKt.v()) {
            ComposerKt.p5(-76500289, i2, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:221)");
        }
        boolean z3 = false;
        if ((((i2 & 14) ^ 6) > 4 && composer.p5(gridCells)) || (i2 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((((i2 & 112) ^ 48) > 32 && composer.p5(horizontal)) || (i2 & 48) == 32) {
            z3 = true;
        }
        boolean z4 = z2 | z3;
        Object objIF = composer.iF();
        if (z4 || objIF == Composer.INSTANCE.n()) {
            objIF = new GridSlotCache(new Function2<Density, Constraints, LazyGridSlots>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberColumnWidthSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyGridSlots invoke(Density density, Constraints constraints) {
                    return n(density, constraints.getValue());
                }

                public final LazyGridSlots n(Density density, long j2) {
                    boolean z5;
                    if (Constraints.qie(j2) != Integer.MAX_VALUE) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z5) {
                        InlineClassHelperKt.n("LazyVerticalGrid's width should be bound by parent.");
                    }
                    int iQie = Constraints.qie(j2);
                    GridCells gridCells2 = gridCells;
                    Arrangement.Horizontal horizontal2 = horizontal;
                    int[] intArray = CollectionsKt.toIntArray(gridCells2.n(density, iQie, density.How(horizontal2.getSpacing())));
                    int[] iArr = new int[intArray.length];
                    horizontal2.t(density, iQie, intArray, LayoutDirection.f34160n, iArr);
                    return new LazyGridSlots(intArray, iArr);
                }
            });
            composer.o(objIF);
        }
        LazyGridSlotsProvider lazyGridSlotsProvider = (LazyGridSlotsProvider) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return lazyGridSlotsProvider;
    }
}
