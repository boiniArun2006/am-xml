package androidx.compose.foundation.lazy;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u0084\u0001\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0084\u0001\u0010\u001c\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001ax\u0010\u001e\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001an\u0010 \u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\r\u001a\u00020\f2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b \u0010!\u001ax\u0010\"\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\"\u0010#\u001an\u0010$\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, "O", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "rl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "t", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "J2", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "nr", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,523:1\n168#1,13:524\n204#1,13:537\n240#1,13:550\n276#1,13:563\n113#2:576\n113#2:577\n113#2:578\n113#2:579\n113#2:580\n113#2:581\n*S KotlinDebug\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n187#1:524,13\n223#1:537,13\n259#1:550,13\n295#1:563,13\n331#1:576\n391#1:577\n421#1:578\n449#1:579\n475#1:580\n503#1:581\n*E\n"})
public final class LazyDslKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void J2(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z2, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, boolean z3, final Function1 function1, Composer composer, final int i2, final int i3) {
        int i5;
        LazyListState lazyListStateRl;
        PaddingValues paddingValues2;
        int i7;
        boolean z4;
        Arrangement.Horizontal horizontal2;
        int i8;
        Alignment.Vertical vertical2;
        FlingBehavior flingBehavior2;
        int i9;
        int i10;
        Composer composer2;
        final Modifier modifier2;
        final boolean z5;
        final LazyListState lazyListState2;
        final PaddingValues paddingValues3;
        final boolean z6;
        final Arrangement.Horizontal horizontal3;
        final Alignment.Vertical vertical3;
        final FlingBehavior flingBehavior3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Arrangement.Horizontal horizontalJ2;
        FlingBehavior flingBehaviorN;
        boolean z7;
        LazyListState lazyListState3;
        PaddingValues paddingValues4;
        Arrangement.Horizontal horizontal4;
        Alignment.Vertical vertical4;
        boolean z9;
        FlingBehavior flingBehavior4;
        Modifier modifier3;
        int i11;
        Composer composerKN = composer.KN(-1724297413);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                lazyListStateRl = lazyListState;
                int i13 = composerKN.p5(lazyListStateRl) ? 32 : 16;
                i5 |= i13;
            } else {
                lazyListStateRl = lazyListState;
            }
            i5 |= i13;
        } else {
            lazyListStateRl = lazyListState;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                paddingValues2 = paddingValues;
                i5 |= composerKN.p5(paddingValues2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    z4 = z2;
                    i5 |= composerKN.n(z4) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        horizontal2 = horizontal;
                        int i15 = composerKN.p5(horizontal2) ? 16384 : 8192;
                        i5 |= i15;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i5 |= i15;
                } else {
                    horizontal2 = horizontal;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else {
                    if ((196608 & i2) == 0) {
                        vertical2 = vertical;
                        i5 |= composerKN.p5(vertical2) ? 131072 : 65536;
                    }
                    if ((1572864 & i2) != 0) {
                        if ((i3 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            int i16 = composerKN.p5(flingBehavior2) ? 1048576 : 524288;
                            i5 |= i16;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i5 |= i16;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i5 |= 12582912;
                    } else {
                        if ((i2 & 12582912) == 0) {
                            i10 = i9;
                            i5 |= composerKN.n(z3) ? 8388608 : 4194304;
                        }
                        if ((i3 & 256) == 0) {
                            if ((i2 & 100663296) == 0) {
                                i5 |= composerKN.E2(function1) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            if (composerKN.HI((i5 & 38347923) == 38347922, i5 & 1)) {
                                composer2 = composerKN;
                                composer2.wTp();
                                modifier2 = modifier;
                                z5 = z3;
                                lazyListState2 = lazyListStateRl;
                                paddingValues3 = paddingValues2;
                                z6 = z4;
                                horizontal3 = horizontal2;
                                vertical3 = vertical2;
                                flingBehavior3 = flingBehavior2;
                            } else {
                                composerKN.e();
                                if ((i2 & 1) == 0 || composerKN.rV9()) {
                                    Modifier modifier4 = i12 != 0 ? Modifier.INSTANCE : modifier;
                                    if ((i3 & 2) != 0) {
                                        lazyListStateRl = LazyListStateKt.rl(0, 0, composerKN, 0, 3);
                                        i5 &= -113;
                                    }
                                    PaddingValues paddingValuesN = i14 != 0 ? PaddingKt.n(Dp.KN(0)) : paddingValues2;
                                    if (i7 != 0) {
                                        z4 = false;
                                    }
                                    if ((i3 & 16) != 0) {
                                        Arrangement arrangement = Arrangement.f17400n;
                                        horizontalJ2 = !z4 ? arrangement.J2() : arrangement.t();
                                        i5 &= -57345;
                                    } else {
                                        horizontalJ2 = horizontal2;
                                    }
                                    Alignment.Vertical verticalQie = i8 != 0 ? Alignment.INSTANCE.qie() : vertical2;
                                    if ((i3 & 64) != 0) {
                                        flingBehaviorN = ScrollableDefaults.f17001n.n(composerKN, 6);
                                        i5 &= -3670017;
                                    } else {
                                        flingBehaviorN = flingBehavior2;
                                    }
                                    if (i10 != 0) {
                                        lazyListState3 = lazyListStateRl;
                                        paddingValues4 = paddingValuesN;
                                        horizontal4 = horizontalJ2;
                                        vertical4 = verticalQie;
                                        z9 = z4;
                                        z7 = true;
                                    } else {
                                        z7 = z3;
                                        lazyListState3 = lazyListStateRl;
                                        paddingValues4 = paddingValuesN;
                                        horizontal4 = horizontalJ2;
                                        vertical4 = verticalQie;
                                        z9 = z4;
                                    }
                                    flingBehavior4 = flingBehaviorN;
                                    modifier3 = modifier4;
                                    i11 = -1724297413;
                                } else {
                                    composerKN.wTp();
                                    if ((i3 & 2) != 0) {
                                        i5 &= -113;
                                    }
                                    if ((i3 & 16) != 0) {
                                        i5 &= -57345;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i5 &= -3670017;
                                    }
                                    z7 = z3;
                                    lazyListState3 = lazyListStateRl;
                                    horizontal4 = horizontal2;
                                    vertical4 = vertical2;
                                    flingBehavior4 = flingBehavior2;
                                    i11 = -1724297413;
                                    modifier3 = modifier;
                                    paddingValues4 = paddingValues2;
                                    z9 = z4;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(i11, i5, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:482)");
                                }
                                composer2 = composerKN;
                                O(modifier3, lazyListState3, paddingValues4, z9, horizontal4, vertical4, flingBehavior4, z7, OverscrollKt.rl(composerKN, 0), function1, composer2, (33554430 & i5) | ((i5 << 3) & 1879048192), 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                modifier2 = modifier3;
                                lazyListState2 = lazyListState3;
                                paddingValues3 = paddingValues4;
                                z6 = z9;
                                horizontal3 = horizontal4;
                                vertical3 = vertical4;
                                flingBehavior3 = flingBehavior4;
                                z5 = z7;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i17) {
                                        LazyDslKt.J2(modifier2, lazyListState2, paddingValues3, z6, horizontal3, vertical3, flingBehavior3, z5, function1, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= 100663296;
                        if (composerKN.HI((i5 & 38347923) == 38347922, i5 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i10 = i9;
                    if ((i3 & 256) == 0) {
                    }
                    if (composerKN.HI((i5 & 38347923) == 38347922, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                vertical2 = vertical;
                if ((1572864 & i2) != 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i3 & 256) == 0) {
                }
                if (composerKN.HI((i5 & 38347923) == 38347922, i5 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z4 = z2;
            if ((i2 & 24576) == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            vertical2 = vertical;
            if ((1572864 & i2) != 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i3 & 256) == 0) {
            }
            if (composerKN.HI((i5 & 38347923) == 38347922, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        paddingValues2 = paddingValues;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        z4 = z2;
        if ((i2 & 24576) == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        vertical2 = vertical;
        if ((1572864 & i2) != 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i3 & 256) == 0) {
        }
        if (composerKN.HI((i5 & 38347923) == 38347922, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z2, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, boolean z3, OverscrollEffect overscrollEffect, final Function1 function1, Composer composer, final int i2, final int i3) {
        int i5;
        LazyListState lazyListStateRl;
        PaddingValues paddingValues2;
        int i7;
        boolean z4;
        Arrangement.Horizontal horizontal2;
        int i8;
        Alignment.Vertical vertical2;
        FlingBehavior flingBehavior2;
        int i9;
        int i10;
        Composer composer2;
        final Modifier modifier2;
        final boolean z5;
        final LazyListState lazyListState2;
        final PaddingValues paddingValues3;
        final boolean z6;
        final Arrangement.Horizontal horizontal3;
        final Alignment.Vertical vertical3;
        final FlingBehavior flingBehavior3;
        final OverscrollEffect overscrollEffect2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Arrangement.Horizontal horizontalJ2;
        FlingBehavior flingBehaviorN;
        OverscrollEffect overscrollEffectRl;
        Modifier modifier3;
        LazyListState lazyListState3;
        PaddingValues paddingValues4;
        Arrangement.Horizontal horizontal4;
        Alignment.Vertical vertical4;
        boolean z7;
        boolean z9;
        int i11;
        FlingBehavior flingBehavior4;
        Composer composerKN = composer.KN(-1884325601);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                lazyListStateRl = lazyListState;
                int i13 = composerKN.p5(lazyListStateRl) ? 32 : 16;
                i5 |= i13;
            } else {
                lazyListStateRl = lazyListState;
            }
            i5 |= i13;
        } else {
            lazyListStateRl = lazyListState;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                paddingValues2 = paddingValues;
                i5 |= composerKN.p5(paddingValues2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    z4 = z2;
                    i5 |= composerKN.n(z4) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        horizontal2 = horizontal;
                        int i15 = composerKN.p5(horizontal2) ? 16384 : 8192;
                        i5 |= i15;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i5 |= i15;
                } else {
                    horizontal2 = horizontal;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else {
                    if ((196608 & i2) == 0) {
                        vertical2 = vertical;
                        i5 |= composerKN.p5(vertical2) ? 131072 : 65536;
                    }
                    if ((1572864 & i2) != 0) {
                        if ((i3 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            int i16 = composerKN.p5(flingBehavior2) ? 1048576 : 524288;
                            i5 |= i16;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i5 |= i16;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i5 |= 12582912;
                    } else {
                        if ((i2 & 12582912) == 0) {
                            i10 = i9;
                            i5 |= composerKN.n(z3) ? 8388608 : 4194304;
                        }
                        if ((i2 & 100663296) == 0) {
                            i5 |= ((i3 & 256) == 0 && composerKN.p5(overscrollEffect)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        if ((i3 & 512) == 0) {
                            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i5 |= composerKN.E2(function1) ? 536870912 : 268435456;
                            }
                            if (composerKN.HI((i5 & 306783379) == 306783378, i5 & 1)) {
                                composer2 = composerKN;
                                composer2.wTp();
                                modifier2 = modifier;
                                z5 = z3;
                                lazyListState2 = lazyListStateRl;
                                paddingValues3 = paddingValues2;
                                z6 = z4;
                                horizontal3 = horizontal2;
                                vertical3 = vertical2;
                                flingBehavior3 = flingBehavior2;
                                overscrollEffect2 = overscrollEffect;
                            } else {
                                composerKN.e();
                                if ((i2 & 1) == 0 || composerKN.rV9()) {
                                    Modifier modifier4 = i12 != 0 ? Modifier.INSTANCE : modifier;
                                    if ((i3 & 2) != 0) {
                                        lazyListStateRl = LazyListStateKt.rl(0, 0, composerKN, 0, 3);
                                        i5 &= -113;
                                    }
                                    PaddingValues paddingValuesN = i14 != 0 ? PaddingKt.n(Dp.KN(0)) : paddingValues2;
                                    if (i7 != 0) {
                                        z4 = false;
                                    }
                                    if ((i3 & 16) != 0) {
                                        Arrangement arrangement = Arrangement.f17400n;
                                        horizontalJ2 = !z4 ? arrangement.J2() : arrangement.t();
                                        i5 &= -57345;
                                    } else {
                                        horizontalJ2 = horizontal2;
                                    }
                                    Alignment.Vertical verticalQie = i8 != 0 ? Alignment.INSTANCE.qie() : vertical2;
                                    if ((i3 & 64) != 0) {
                                        flingBehaviorN = ScrollableDefaults.f17001n.n(composerKN, 6);
                                        i5 &= -3670017;
                                    } else {
                                        flingBehaviorN = flingBehavior2;
                                    }
                                    boolean z10 = i10 == 0 ? z3 : true;
                                    if ((i3 & 256) != 0) {
                                        i5 &= -234881025;
                                        modifier3 = modifier4;
                                        overscrollEffectRl = OverscrollKt.rl(composerKN, 0);
                                    } else {
                                        overscrollEffectRl = overscrollEffect;
                                        modifier3 = modifier4;
                                    }
                                    lazyListState3 = lazyListStateRl;
                                    paddingValues4 = paddingValuesN;
                                    horizontal4 = horizontalJ2;
                                    vertical4 = verticalQie;
                                    z7 = z4;
                                    z9 = z10;
                                    i11 = -1884325601;
                                    flingBehavior4 = flingBehaviorN;
                                } else {
                                    composerKN.wTp();
                                    if ((i3 & 2) != 0) {
                                        i5 &= -113;
                                    }
                                    if ((i3 & 16) != 0) {
                                        i5 &= -57345;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i5 &= -3670017;
                                    }
                                    if ((i3 & 256) != 0) {
                                        i5 &= -234881025;
                                    }
                                    modifier3 = modifier;
                                    z9 = z3;
                                    overscrollEffectRl = overscrollEffect;
                                    z7 = z4;
                                    horizontal4 = horizontal2;
                                    vertical4 = vertical2;
                                    flingBehavior4 = flingBehavior2;
                                    i11 = -1884325601;
                                    lazyListState3 = lazyListStateRl;
                                    paddingValues4 = paddingValues2;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(i11, i5, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:339)");
                                }
                                int i17 = i5 >> 3;
                                composer2 = composerKN;
                                LazyListKt.n(modifier3, lazyListState3, paddingValues4, z7, false, flingBehavior4, z9, overscrollEffectRl, 0, null, null, vertical4, horizontal4, function1, composer2, (i5 & 14) | 24576 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (458752 & i17) | (3670016 & i17) | (i17 & 29360128), ((i5 >> 12) & 112) | ((i5 >> 6) & 896) | ((i5 >> 18) & 7168), 1792);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                modifier2 = modifier3;
                                lazyListState2 = lazyListState3;
                                paddingValues3 = paddingValues4;
                                z6 = z7;
                                flingBehavior3 = flingBehavior4;
                                z5 = z9;
                                overscrollEffect2 = overscrollEffectRl;
                                vertical3 = vertical4;
                                horizontal3 = horizontal4;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
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
                                        LazyDslKt.O(modifier2, lazyListState2, paddingValues3, z6, horizontal3, vertical3, flingBehavior3, z5, overscrollEffect2, function1, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        if (composerKN.HI((i5 & 306783379) == 306783378, i5 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i10 = i9;
                    if ((i2 & 100663296) == 0) {
                    }
                    if ((i3 & 512) == 0) {
                    }
                    if (composerKN.HI((i5 & 306783379) == 306783378, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                vertical2 = vertical;
                if ((1572864 & i2) != 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i2 & 100663296) == 0) {
                }
                if ((i3 & 512) == 0) {
                }
                if (composerKN.HI((i5 & 306783379) == 306783378, i5 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z4 = z2;
            if ((i2 & 24576) == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            vertical2 = vertical;
            if ((1572864 & i2) != 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i2 & 100663296) == 0) {
            }
            if ((i3 & 512) == 0) {
            }
            if (composerKN.HI((i5 & 306783379) == 306783378, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        paddingValues2 = paddingValues;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        z4 = z2;
        if ((i2 & 24576) == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        vertical2 = vertical;
        if ((1572864 & i2) != 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i2 & 100663296) == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        if (composerKN.HI((i5 & 306783379) == 306783378, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void n(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z2, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, final Function1 function1, Composer composer, final int i2, final int i3) {
        int i5;
        LazyListState lazyListStateRl;
        PaddingValues paddingValues2;
        int i7;
        boolean z3;
        Arrangement.Vertical verticalUo;
        int i8;
        Alignment.Horizontal horizontalGh;
        FlingBehavior flingBehavior2;
        Composer composer2;
        final Modifier modifier2;
        final LazyListState lazyListState2;
        final PaddingValues paddingValues3;
        final boolean z4;
        final Arrangement.Vertical vertical2;
        final Alignment.Horizontal horizontal2;
        final FlingBehavior flingBehavior3;
        ScopeUpdateScope scopeUpdateScopeGh;
        PaddingValues paddingValues4;
        Alignment.Horizontal horizontal3;
        int i9;
        boolean z5;
        FlingBehavior flingBehaviorN;
        Modifier modifier3;
        Arrangement.Vertical vertical3;
        int i10;
        LazyListState lazyListState3;
        Composer composerKN = composer.KN(-563353797);
        int i11 = i3 & 1;
        if (i11 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                lazyListStateRl = lazyListState;
                int i12 = composerKN.p5(lazyListStateRl) ? 32 : 16;
                i5 |= i12;
            } else {
                lazyListStateRl = lazyListState;
            }
            i5 |= i12;
        } else {
            lazyListStateRl = lazyListState;
        }
        int i13 = i3 & 4;
        if (i13 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                paddingValues2 = paddingValues;
                i5 |= composerKN.p5(paddingValues2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        verticalUo = vertical;
                        int i14 = composerKN.p5(verticalUo) ? 16384 : 8192;
                        i5 |= i14;
                    } else {
                        verticalUo = vertical;
                    }
                    i5 |= i14;
                } else {
                    verticalUo = vertical;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else {
                    if ((196608 & i2) == 0) {
                        horizontalGh = horizontal;
                        i5 |= composerKN.p5(horizontalGh) ? 131072 : 65536;
                    }
                    if ((1572864 & i2) != 0) {
                        if ((i3 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            int i15 = composerKN.p5(flingBehavior2) ? 1048576 : 524288;
                            i5 |= i15;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i5 |= i15;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if ((i3 & 128) != 0) {
                        if ((i2 & 12582912) == 0) {
                            i5 |= composerKN.E2(function1) ? 8388608 : 4194304;
                        }
                        if (composerKN.HI((i5 & 4793491) != 4793490, i5 & 1)) {
                            composerKN.e();
                            if ((i2 & 1) == 0 || composerKN.rV9()) {
                                Modifier modifier4 = i11 != 0 ? Modifier.INSTANCE : modifier;
                                if ((i3 & 2) != 0) {
                                    lazyListStateRl = LazyListStateKt.rl(0, 0, composerKN, 0, 3);
                                    i5 &= -113;
                                }
                                PaddingValues paddingValuesN = i13 != 0 ? PaddingKt.n(Dp.KN(0)) : paddingValues2;
                                if (i7 != 0) {
                                    z3 = false;
                                }
                                if ((i3 & 16) != 0) {
                                    Arrangement arrangement = Arrangement.f17400n;
                                    i5 &= -57345;
                                    verticalUo = !z3 ? arrangement.Uo() : arrangement.n();
                                }
                                if (i8 != 0) {
                                    horizontalGh = Alignment.INSTANCE.gh();
                                }
                                if ((i3 & 64) != 0) {
                                    i5 &= -3670017;
                                    flingBehaviorN = ScrollableDefaults.f17001n.n(composerKN, 6);
                                    i9 = 12582912;
                                    paddingValues4 = paddingValuesN;
                                    vertical3 = verticalUo;
                                    horizontal3 = horizontalGh;
                                    lazyListState3 = lazyListStateRl;
                                    z5 = z3;
                                    modifier3 = modifier4;
                                    i10 = -563353797;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(i10, i5, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:455)");
                                    }
                                    composer2 = composerKN;
                                    rl(modifier3, lazyListState3, paddingValues4, z5, vertical3, horizontal3, flingBehaviorN, true, null, function1, composer2, (i5 & 14) | i9 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | ((i5 << 6) & 1879048192), 256);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    modifier2 = modifier3;
                                    lazyListState2 = lazyListState3;
                                    paddingValues3 = paddingValues4;
                                    z4 = z5;
                                    vertical2 = vertical3;
                                    horizontal2 = horizontal3;
                                    flingBehavior3 = flingBehaviorN;
                                } else {
                                    paddingValues4 = paddingValuesN;
                                    horizontal3 = horizontalGh;
                                    i9 = 12582912;
                                    z5 = z3;
                                    flingBehaviorN = flingBehavior2;
                                    modifier3 = modifier4;
                                    vertical3 = verticalUo;
                                    i10 = -563353797;
                                }
                            } else {
                                composerKN.wTp();
                                if ((i3 & 2) != 0) {
                                    i5 &= -113;
                                }
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                }
                                if ((i3 & 64) != 0) {
                                    i5 &= -3670017;
                                }
                                paddingValues4 = paddingValues2;
                                horizontal3 = horizontalGh;
                                i9 = 12582912;
                                i10 = -563353797;
                                z5 = z3;
                                flingBehaviorN = flingBehavior2;
                                modifier3 = modifier;
                                vertical3 = verticalUo;
                            }
                            lazyListState3 = lazyListStateRl;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            composer2 = composerKN;
                            rl(modifier3, lazyListState3, paddingValues4, z5, vertical3, horizontal3, flingBehaviorN, true, null, function1, composer2, (i5 & 14) | i9 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | ((i5 << 6) & 1879048192), 256);
                            if (ComposerKt.v()) {
                            }
                            modifier2 = modifier3;
                            lazyListState2 = lazyListState3;
                            paddingValues3 = paddingValues4;
                            z4 = z5;
                            vertical2 = vertical3;
                            horizontal2 = horizontal3;
                            flingBehavior3 = flingBehaviorN;
                        } else {
                            composer2 = composerKN;
                            composer2.wTp();
                            modifier2 = modifier;
                            lazyListState2 = lazyListStateRl;
                            paddingValues3 = paddingValues2;
                            z4 = z3;
                            vertical2 = verticalUo;
                            horizontal2 = horizontalGh;
                            flingBehavior3 = flingBehavior2;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$3
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
                                    LazyDslKt.n(modifier2, lazyListState2, paddingValues3, z4, vertical2, horizontal2, flingBehavior3, function1, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 12582912;
                    if (composerKN.HI((i5 & 4793491) != 4793490, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                horizontalGh = horizontal;
                if ((1572864 & i2) != 0) {
                }
                if ((i3 & 128) != 0) {
                }
                if (composerKN.HI((i5 & 4793491) != 4793490, i5 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            z3 = z2;
            if ((i2 & 24576) == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            horizontalGh = horizontal;
            if ((1572864 & i2) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if (composerKN.HI((i5 & 4793491) != 4793490, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        paddingValues2 = paddingValues;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        z3 = z2;
        if ((i2 & 24576) == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        horizontalGh = horizontal;
        if ((1572864 & i2) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if (composerKN.HI((i5 & 4793491) != 4793490, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void nr(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z2, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, final Function1 function1, Composer composer, final int i2, final int i3) {
        int i5;
        LazyListState lazyListStateRl;
        PaddingValues paddingValues2;
        int i7;
        boolean z3;
        Arrangement.Horizontal horizontalJ2;
        int i8;
        Alignment.Vertical verticalQie;
        FlingBehavior flingBehavior2;
        Composer composer2;
        final Modifier modifier2;
        final LazyListState lazyListState2;
        final PaddingValues paddingValues3;
        final boolean z4;
        final Arrangement.Horizontal horizontal2;
        final Alignment.Vertical vertical2;
        final FlingBehavior flingBehavior3;
        ScopeUpdateScope scopeUpdateScopeGh;
        PaddingValues paddingValues4;
        Alignment.Vertical vertical3;
        int i9;
        boolean z5;
        FlingBehavior flingBehaviorN;
        Modifier modifier3;
        Arrangement.Horizontal horizontal3;
        int i10;
        LazyListState lazyListState3;
        Composer composerKN = composer.KN(407929823);
        int i11 = i3 & 1;
        if (i11 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                lazyListStateRl = lazyListState;
                int i12 = composerKN.p5(lazyListStateRl) ? 32 : 16;
                i5 |= i12;
            } else {
                lazyListStateRl = lazyListState;
            }
            i5 |= i12;
        } else {
            lazyListStateRl = lazyListState;
        }
        int i13 = i3 & 4;
        if (i13 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                paddingValues2 = paddingValues;
                i5 |= composerKN.p5(paddingValues2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        horizontalJ2 = horizontal;
                        int i14 = composerKN.p5(horizontalJ2) ? 16384 : 8192;
                        i5 |= i14;
                    } else {
                        horizontalJ2 = horizontal;
                    }
                    i5 |= i14;
                } else {
                    horizontalJ2 = horizontal;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else {
                    if ((196608 & i2) == 0) {
                        verticalQie = vertical;
                        i5 |= composerKN.p5(verticalQie) ? 131072 : 65536;
                    }
                    if ((1572864 & i2) != 0) {
                        if ((i3 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            int i15 = composerKN.p5(flingBehavior2) ? 1048576 : 524288;
                            i5 |= i15;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i5 |= i15;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if ((i3 & 128) != 0) {
                        if ((i2 & 12582912) == 0) {
                            i5 |= composerKN.E2(function1) ? 8388608 : 4194304;
                        }
                        if (composerKN.HI((i5 & 4793491) != 4793490, i5 & 1)) {
                            composerKN.e();
                            if ((i2 & 1) == 0 || composerKN.rV9()) {
                                Modifier modifier4 = i11 != 0 ? Modifier.INSTANCE : modifier;
                                if ((i3 & 2) != 0) {
                                    lazyListStateRl = LazyListStateKt.rl(0, 0, composerKN, 0, 3);
                                    i5 &= -113;
                                }
                                PaddingValues paddingValuesN = i13 != 0 ? PaddingKt.n(Dp.KN(0)) : paddingValues2;
                                if (i7 != 0) {
                                    z3 = false;
                                }
                                if ((i3 & 16) != 0) {
                                    Arrangement arrangement = Arrangement.f17400n;
                                    i5 &= -57345;
                                    horizontalJ2 = !z3 ? arrangement.J2() : arrangement.t();
                                }
                                if (i8 != 0) {
                                    verticalQie = Alignment.INSTANCE.qie();
                                }
                                if ((i3 & 64) != 0) {
                                    i5 &= -3670017;
                                    flingBehaviorN = ScrollableDefaults.f17001n.n(composerKN, 6);
                                    i9 = 12582912;
                                    paddingValues4 = paddingValuesN;
                                    horizontal3 = horizontalJ2;
                                    vertical3 = verticalQie;
                                    lazyListState3 = lazyListStateRl;
                                    z5 = z3;
                                    modifier3 = modifier4;
                                    i10 = 407929823;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(i10, i5, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:509)");
                                    }
                                    composer2 = composerKN;
                                    O(modifier3, lazyListState3, paddingValues4, z5, horizontal3, vertical3, flingBehaviorN, true, null, function1, composer2, (i5 & 14) | i9 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | ((i5 << 6) & 1879048192), 256);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    modifier2 = modifier3;
                                    lazyListState2 = lazyListState3;
                                    paddingValues3 = paddingValues4;
                                    z4 = z5;
                                    horizontal2 = horizontal3;
                                    vertical2 = vertical3;
                                    flingBehavior3 = flingBehaviorN;
                                } else {
                                    paddingValues4 = paddingValuesN;
                                    vertical3 = verticalQie;
                                    i9 = 12582912;
                                    z5 = z3;
                                    flingBehaviorN = flingBehavior2;
                                    modifier3 = modifier4;
                                    horizontal3 = horizontalJ2;
                                    i10 = 407929823;
                                }
                            } else {
                                composerKN.wTp();
                                if ((i3 & 2) != 0) {
                                    i5 &= -113;
                                }
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                }
                                if ((i3 & 64) != 0) {
                                    i5 &= -3670017;
                                }
                                paddingValues4 = paddingValues2;
                                vertical3 = verticalQie;
                                i9 = 12582912;
                                i10 = 407929823;
                                z5 = z3;
                                flingBehaviorN = flingBehavior2;
                                modifier3 = modifier;
                                horizontal3 = horizontalJ2;
                            }
                            lazyListState3 = lazyListStateRl;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            composer2 = composerKN;
                            O(modifier3, lazyListState3, paddingValues4, z5, horizontal3, vertical3, flingBehaviorN, true, null, function1, composer2, (i5 & 14) | i9 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | ((i5 << 6) & 1879048192), 256);
                            if (ComposerKt.v()) {
                            }
                            modifier2 = modifier3;
                            lazyListState2 = lazyListState3;
                            paddingValues3 = paddingValues4;
                            z4 = z5;
                            horizontal2 = horizontal3;
                            vertical2 = vertical3;
                            flingBehavior3 = flingBehaviorN;
                        } else {
                            composer2 = composerKN;
                            composer2.wTp();
                            modifier2 = modifier;
                            lazyListState2 = lazyListStateRl;
                            paddingValues3 = paddingValues2;
                            z4 = z3;
                            horizontal2 = horizontalJ2;
                            vertical2 = verticalQie;
                            flingBehavior3 = flingBehavior2;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$3
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
                                    LazyDslKt.nr(modifier2, lazyListState2, paddingValues3, z4, horizontal2, vertical2, flingBehavior3, function1, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 12582912;
                    if (composerKN.HI((i5 & 4793491) != 4793490, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                verticalQie = vertical;
                if ((1572864 & i2) != 0) {
                }
                if ((i3 & 128) != 0) {
                }
                if (composerKN.HI((i5 & 4793491) != 4793490, i5 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            z3 = z2;
            if ((i2 & 24576) == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            verticalQie = vertical;
            if ((1572864 & i2) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if (composerKN.HI((i5 & 4793491) != 4793490, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        paddingValues2 = paddingValues;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        z3 = z2;
        if ((i2 & 24576) == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        verticalQie = vertical;
        if ((1572864 & i2) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if (composerKN.HI((i5 & 4793491) != 4793490, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z2, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z3, OverscrollEffect overscrollEffect, final Function1 function1, Composer composer, final int i2, final int i3) {
        int i5;
        LazyListState lazyListStateRl;
        PaddingValues paddingValues2;
        int i7;
        boolean z4;
        Arrangement.Vertical vertical2;
        int i8;
        Alignment.Horizontal horizontal2;
        FlingBehavior flingBehavior2;
        int i9;
        int i10;
        Composer composer2;
        final Modifier modifier2;
        final boolean z5;
        final LazyListState lazyListState2;
        final PaddingValues paddingValues3;
        final boolean z6;
        final Arrangement.Vertical vertical3;
        final Alignment.Horizontal horizontal3;
        final FlingBehavior flingBehavior3;
        final OverscrollEffect overscrollEffect2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Arrangement.Vertical verticalUo;
        FlingBehavior flingBehaviorN;
        OverscrollEffect overscrollEffectRl;
        Modifier modifier3;
        LazyListState lazyListState3;
        PaddingValues paddingValues4;
        Arrangement.Vertical vertical4;
        Alignment.Horizontal horizontal4;
        boolean z7;
        boolean z9;
        int i11;
        FlingBehavior flingBehavior4;
        Composer composerKN = composer.KN(53695811);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                lazyListStateRl = lazyListState;
                int i13 = composerKN.p5(lazyListStateRl) ? 32 : 16;
                i5 |= i13;
            } else {
                lazyListStateRl = lazyListState;
            }
            i5 |= i13;
        } else {
            lazyListStateRl = lazyListState;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                paddingValues2 = paddingValues;
                i5 |= composerKN.p5(paddingValues2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    z4 = z2;
                    i5 |= composerKN.n(z4) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        vertical2 = vertical;
                        int i15 = composerKN.p5(vertical2) ? 16384 : 8192;
                        i5 |= i15;
                    } else {
                        vertical2 = vertical;
                    }
                    i5 |= i15;
                } else {
                    vertical2 = vertical;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else {
                    if ((196608 & i2) == 0) {
                        horizontal2 = horizontal;
                        i5 |= composerKN.p5(horizontal2) ? 131072 : 65536;
                    }
                    if ((1572864 & i2) != 0) {
                        if ((i3 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            int i16 = composerKN.p5(flingBehavior2) ? 1048576 : 524288;
                            i5 |= i16;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i5 |= i16;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i5 |= 12582912;
                    } else {
                        if ((i2 & 12582912) == 0) {
                            i10 = i9;
                            i5 |= composerKN.n(z3) ? 8388608 : 4194304;
                        }
                        if ((i2 & 100663296) == 0) {
                            i5 |= ((i3 & 256) == 0 && composerKN.p5(overscrollEffect)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        if ((i3 & 512) == 0) {
                            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i5 |= composerKN.E2(function1) ? 536870912 : 268435456;
                            }
                            if (composerKN.HI((i5 & 306783379) == 306783378, i5 & 1)) {
                                composer2 = composerKN;
                                composer2.wTp();
                                modifier2 = modifier;
                                z5 = z3;
                                lazyListState2 = lazyListStateRl;
                                paddingValues3 = paddingValues2;
                                z6 = z4;
                                vertical3 = vertical2;
                                horizontal3 = horizontal2;
                                flingBehavior3 = flingBehavior2;
                                overscrollEffect2 = overscrollEffect;
                            } else {
                                composerKN.e();
                                if ((i2 & 1) == 0 || composerKN.rV9()) {
                                    Modifier modifier4 = i12 != 0 ? Modifier.INSTANCE : modifier;
                                    if ((i3 & 2) != 0) {
                                        lazyListStateRl = LazyListStateKt.rl(0, 0, composerKN, 0, 3);
                                        i5 &= -113;
                                    }
                                    PaddingValues paddingValuesN = i14 != 0 ? PaddingKt.n(Dp.KN(0)) : paddingValues2;
                                    if (i7 != 0) {
                                        z4 = false;
                                    }
                                    if ((i3 & 16) != 0) {
                                        Arrangement arrangement = Arrangement.f17400n;
                                        verticalUo = !z4 ? arrangement.Uo() : arrangement.n();
                                        i5 &= -57345;
                                    } else {
                                        verticalUo = vertical2;
                                    }
                                    Alignment.Horizontal horizontalGh = i8 != 0 ? Alignment.INSTANCE.gh() : horizontal2;
                                    if ((i3 & 64) != 0) {
                                        flingBehaviorN = ScrollableDefaults.f17001n.n(composerKN, 6);
                                        i5 &= -3670017;
                                    } else {
                                        flingBehaviorN = flingBehavior2;
                                    }
                                    boolean z10 = i10 == 0 ? z3 : true;
                                    if ((i3 & 256) != 0) {
                                        i5 &= -234881025;
                                        modifier3 = modifier4;
                                        overscrollEffectRl = OverscrollKt.rl(composerKN, 0);
                                    } else {
                                        overscrollEffectRl = overscrollEffect;
                                        modifier3 = modifier4;
                                    }
                                    lazyListState3 = lazyListStateRl;
                                    paddingValues4 = paddingValuesN;
                                    vertical4 = verticalUo;
                                    horizontal4 = horizontalGh;
                                    z7 = z4;
                                    z9 = z10;
                                    i11 = 53695811;
                                    flingBehavior4 = flingBehaviorN;
                                } else {
                                    composerKN.wTp();
                                    if ((i3 & 2) != 0) {
                                        i5 &= -113;
                                    }
                                    if ((i3 & 16) != 0) {
                                        i5 &= -57345;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i5 &= -3670017;
                                    }
                                    if ((i3 & 256) != 0) {
                                        i5 &= -234881025;
                                    }
                                    modifier3 = modifier;
                                    z9 = z3;
                                    overscrollEffectRl = overscrollEffect;
                                    z7 = z4;
                                    vertical4 = vertical2;
                                    horizontal4 = horizontal2;
                                    flingBehavior4 = flingBehavior2;
                                    i11 = 53695811;
                                    lazyListState3 = lazyListStateRl;
                                    paddingValues4 = paddingValues2;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(i11, i5, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:399)");
                                }
                                int i17 = i5 >> 3;
                                composer2 = composerKN;
                                LazyListKt.n(modifier3, lazyListState3, paddingValues4, z7, true, flingBehavior4, z9, overscrollEffectRl, 0, horizontal4, vertical4, null, null, function1, composer2, (i5 & 14) | 24576 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (458752 & i17) | (3670016 & i17) | (i17 & 29360128) | ((i5 << 12) & 1879048192), ((i5 >> 12) & 14) | ((i5 >> 18) & 7168), 6400);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                modifier2 = modifier3;
                                lazyListState2 = lazyListState3;
                                paddingValues3 = paddingValues4;
                                z6 = z7;
                                flingBehavior3 = flingBehavior4;
                                z5 = z9;
                                overscrollEffect2 = overscrollEffectRl;
                                horizontal3 = horizontal4;
                                vertical3 = vertical4;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
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
                                        LazyDslKt.rl(modifier2, lazyListState2, paddingValues3, z6, vertical3, horizontal3, flingBehavior3, z5, overscrollEffect2, function1, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        if (composerKN.HI((i5 & 306783379) == 306783378, i5 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i10 = i9;
                    if ((i2 & 100663296) == 0) {
                    }
                    if ((i3 & 512) == 0) {
                    }
                    if (composerKN.HI((i5 & 306783379) == 306783378, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                horizontal2 = horizontal;
                if ((1572864 & i2) != 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i2 & 100663296) == 0) {
                }
                if ((i3 & 512) == 0) {
                }
                if (composerKN.HI((i5 & 306783379) == 306783378, i5 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z4 = z2;
            if ((i2 & 24576) == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            horizontal2 = horizontal;
            if ((1572864 & i2) != 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i2 & 100663296) == 0) {
            }
            if ((i3 & 512) == 0) {
            }
            if (composerKN.HI((i5 & 306783379) == 306783378, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        paddingValues2 = paddingValues;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        z4 = z2;
        if ((i2 & 24576) == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        horizontal2 = horizontal;
        if ((1572864 & i2) != 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i2 & 100663296) == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        if (composerKN.HI((i5 & 306783379) == 306783378, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void t(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z2, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z3, final Function1 function1, Composer composer, final int i2, final int i3) {
        int i5;
        LazyListState lazyListStateRl;
        PaddingValues paddingValues2;
        int i7;
        boolean z4;
        Arrangement.Vertical vertical2;
        int i8;
        Alignment.Horizontal horizontal2;
        FlingBehavior flingBehavior2;
        int i9;
        int i10;
        Composer composer2;
        final Modifier modifier2;
        final boolean z5;
        final LazyListState lazyListState2;
        final PaddingValues paddingValues3;
        final boolean z6;
        final Arrangement.Vertical vertical3;
        final Alignment.Horizontal horizontal3;
        final FlingBehavior flingBehavior3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Arrangement.Vertical verticalUo;
        FlingBehavior flingBehaviorN;
        boolean z7;
        LazyListState lazyListState3;
        PaddingValues paddingValues4;
        Arrangement.Vertical vertical4;
        Alignment.Horizontal horizontal4;
        boolean z9;
        FlingBehavior flingBehavior4;
        Modifier modifier3;
        int i11;
        Composer composerKN = composer.KN(-740714857);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                lazyListStateRl = lazyListState;
                int i13 = composerKN.p5(lazyListStateRl) ? 32 : 16;
                i5 |= i13;
            } else {
                lazyListStateRl = lazyListState;
            }
            i5 |= i13;
        } else {
            lazyListStateRl = lazyListState;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                paddingValues2 = paddingValues;
                i5 |= composerKN.p5(paddingValues2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    z4 = z2;
                    i5 |= composerKN.n(z4) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        vertical2 = vertical;
                        int i15 = composerKN.p5(vertical2) ? 16384 : 8192;
                        i5 |= i15;
                    } else {
                        vertical2 = vertical;
                    }
                    i5 |= i15;
                } else {
                    vertical2 = vertical;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else {
                    if ((196608 & i2) == 0) {
                        horizontal2 = horizontal;
                        i5 |= composerKN.p5(horizontal2) ? 131072 : 65536;
                    }
                    if ((1572864 & i2) != 0) {
                        if ((i3 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            int i16 = composerKN.p5(flingBehavior2) ? 1048576 : 524288;
                            i5 |= i16;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i5 |= i16;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i5 |= 12582912;
                    } else {
                        if ((i2 & 12582912) == 0) {
                            i10 = i9;
                            i5 |= composerKN.n(z3) ? 8388608 : 4194304;
                        }
                        if ((i3 & 256) == 0) {
                            if ((i2 & 100663296) == 0) {
                                i5 |= composerKN.E2(function1) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            if (composerKN.HI((i5 & 38347923) == 38347922, i5 & 1)) {
                                composer2 = composerKN;
                                composer2.wTp();
                                modifier2 = modifier;
                                z5 = z3;
                                lazyListState2 = lazyListStateRl;
                                paddingValues3 = paddingValues2;
                                z6 = z4;
                                vertical3 = vertical2;
                                horizontal3 = horizontal2;
                                flingBehavior3 = flingBehavior2;
                            } else {
                                composerKN.e();
                                if ((i2 & 1) == 0 || composerKN.rV9()) {
                                    Modifier modifier4 = i12 != 0 ? Modifier.INSTANCE : modifier;
                                    if ((i3 & 2) != 0) {
                                        lazyListStateRl = LazyListStateKt.rl(0, 0, composerKN, 0, 3);
                                        i5 &= -113;
                                    }
                                    PaddingValues paddingValuesN = i14 != 0 ? PaddingKt.n(Dp.KN(0)) : paddingValues2;
                                    if (i7 != 0) {
                                        z4 = false;
                                    }
                                    if ((i3 & 16) != 0) {
                                        Arrangement arrangement = Arrangement.f17400n;
                                        verticalUo = !z4 ? arrangement.Uo() : arrangement.n();
                                        i5 &= -57345;
                                    } else {
                                        verticalUo = vertical2;
                                    }
                                    Alignment.Horizontal horizontalGh = i8 != 0 ? Alignment.INSTANCE.gh() : horizontal2;
                                    if ((i3 & 64) != 0) {
                                        flingBehaviorN = ScrollableDefaults.f17001n.n(composerKN, 6);
                                        i5 &= -3670017;
                                    } else {
                                        flingBehaviorN = flingBehavior2;
                                    }
                                    if (i10 != 0) {
                                        lazyListState3 = lazyListStateRl;
                                        paddingValues4 = paddingValuesN;
                                        vertical4 = verticalUo;
                                        horizontal4 = horizontalGh;
                                        z9 = z4;
                                        z7 = true;
                                    } else {
                                        z7 = z3;
                                        lazyListState3 = lazyListStateRl;
                                        paddingValues4 = paddingValuesN;
                                        vertical4 = verticalUo;
                                        horizontal4 = horizontalGh;
                                        z9 = z4;
                                    }
                                    flingBehavior4 = flingBehaviorN;
                                    modifier3 = modifier4;
                                    i11 = -740714857;
                                } else {
                                    composerKN.wTp();
                                    if ((i3 & 2) != 0) {
                                        i5 &= -113;
                                    }
                                    if ((i3 & 16) != 0) {
                                        i5 &= -57345;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i5 &= -3670017;
                                    }
                                    z7 = z3;
                                    lazyListState3 = lazyListStateRl;
                                    vertical4 = vertical2;
                                    horizontal4 = horizontal2;
                                    flingBehavior4 = flingBehavior2;
                                    i11 = -740714857;
                                    modifier3 = modifier;
                                    paddingValues4 = paddingValues2;
                                    z9 = z4;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(i11, i5, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:428)");
                                }
                                composer2 = composerKN;
                                rl(modifier3, lazyListState3, paddingValues4, z9, vertical4, horizontal4, flingBehavior4, z7, OverscrollKt.rl(composerKN, 0), function1, composer2, (33554430 & i5) | ((i5 << 3) & 1879048192), 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                modifier2 = modifier3;
                                lazyListState2 = lazyListState3;
                                paddingValues3 = paddingValues4;
                                z6 = z9;
                                vertical3 = vertical4;
                                horizontal3 = horizontal4;
                                flingBehavior3 = flingBehavior4;
                                z5 = z7;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i17) {
                                        LazyDslKt.t(modifier2, lazyListState2, paddingValues3, z6, vertical3, horizontal3, flingBehavior3, z5, function1, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= 100663296;
                        if (composerKN.HI((i5 & 38347923) == 38347922, i5 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i10 = i9;
                    if ((i3 & 256) == 0) {
                    }
                    if (composerKN.HI((i5 & 38347923) == 38347922, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                horizontal2 = horizontal;
                if ((1572864 & i2) != 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i3 & 256) == 0) {
                }
                if (composerKN.HI((i5 & 38347923) == 38347922, i5 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z4 = z2;
            if ((i2 & 24576) == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            horizontal2 = horizontal;
            if ((1572864 & i2) != 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i3 & 256) == 0) {
            }
            if (composerKN.HI((i5 & 38347923) == 38347922, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        paddingValues2 = paddingValues;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        z4 = z2;
        if ((i2 & 24576) == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        horizontal2 = horizontal;
        if ((1572864 & i2) != 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i3 & 256) == 0) {
        }
        if (composerKN.HI((i5 & 38347923) == 38347922, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
