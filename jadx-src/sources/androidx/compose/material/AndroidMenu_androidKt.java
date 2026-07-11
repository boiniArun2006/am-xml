package androidx.compose.material;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ad\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001an\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\n\u001a\u00020\t2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001ae\u0010\u001d\u001a\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\"\u001a\u0010\"\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"", "expanded", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/DpOffset;", "offset", "Landroidx/compose/ui/window/PopupProperties;", "properties", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, "rl", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/ScrollState;", "scrollState", c.f62177j, "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/ScrollState;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "onClick", "enabled", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/RowScope;", "t", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/window/PopupProperties;", "getDefaultMenuProperties", "()Landroidx/compose/ui/window/PopupProperties;", "DefaultMenuProperties", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material/AndroidMenu_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,123:1\n149#2:124\n149#2:125\n1247#3,6:126\n1247#3,6:132\n1247#3,6:139\n75#4:138\n*S KotlinDebug\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material/AndroidMenu_androidKt\n*L\n53#1:124\n123#1:125\n77#1:126,6\n81#1:132,6\n84#1:139,6\n82#1:138\n*E\n"})
public final class AndroidMenu_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final PopupProperties f21154n = new PopupProperties(true, false, false, false, 14, (DefaultConstructorMarker) null);

    /* JADX WARN: Removed duplicated region for block: B:107:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(boolean z2, final Function0 function0, Modifier modifier, long j2, ScrollState scrollState, PopupProperties popupProperties, final Function3 function3, Composer composer, final int i2, final int i3) {
        boolean z3;
        int i5;
        int i7;
        Modifier modifier2;
        int i8;
        long jN;
        ScrollState scrollStateT;
        int i9;
        PopupProperties popupProperties2;
        Function3 function32;
        int i10;
        Composer composer2;
        final Modifier modifier3;
        final long j3;
        final ScrollState scrollState2;
        final PopupProperties popupProperties3;
        ScopeUpdateScope scopeUpdateScopeGh;
        PopupProperties popupProperties4;
        final Modifier modifier4;
        long j4;
        final ScrollState scrollState3;
        int i11;
        Object objIF;
        Composer.Companion companion;
        final MutableTransitionState mutableTransitionState;
        Object objIF2;
        Object objIF3;
        Composer composerKN = composer.KN(-2135362555);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            z3 = z2;
        } else {
            z3 = z2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.n(z3) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function0) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    modifier2 = modifier;
                    i5 |= composerKN.p5(modifier2) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        jN = j2;
                        i5 |= composerKN.nr(jN) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16) == 0) {
                            scrollStateT = scrollState;
                            int i12 = composerKN.p5(scrollStateT) ? 16384 : 8192;
                            i5 |= i12;
                        } else {
                            scrollStateT = scrollState;
                        }
                        i5 |= i12;
                    } else {
                        scrollStateT = scrollState;
                    }
                    i9 = i3 & 32;
                    if (i9 == 0) {
                        i5 |= 196608;
                    } else {
                        if ((196608 & i2) == 0) {
                            popupProperties2 = popupProperties;
                            i5 |= composerKN.p5(popupProperties2) ? 131072 : 65536;
                        }
                        if ((i3 & 64) == 0) {
                            if ((i2 & 1572864) == 0) {
                                function32 = function3;
                                i5 |= composerKN.E2(function32) ? 1048576 : 524288;
                            }
                            i10 = i5;
                            if (composerKN.HI((i5 & 599187) == 599186, i10 & 1)) {
                                composerKN.wTp();
                                composer2 = composerKN;
                                modifier3 = modifier2;
                                j3 = jN;
                                scrollState2 = scrollStateT;
                                popupProperties3 = popupProperties2;
                            } else {
                                composerKN.e();
                                if ((i2 & 1) == 0 || composerKN.rV9()) {
                                    if (i7 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i8 != 0) {
                                        float f3 = 0;
                                        jN = DpKt.n(Dp.KN(f3), Dp.KN(f3));
                                    }
                                    if ((i3 & 16) != 0) {
                                        scrollStateT = ScrollKt.t(0, composerKN, 0, 1);
                                        i10 &= -57345;
                                    }
                                    if (i9 != 0) {
                                        popupProperties4 = f21154n;
                                        modifier4 = modifier2;
                                        j4 = jN;
                                        scrollState3 = scrollStateT;
                                    }
                                    i11 = i10;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-2135362555, i11, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:75)");
                                    }
                                    objIF = composerKN.iF();
                                    companion = Composer.INSTANCE;
                                    if (objIF == companion.n()) {
                                        objIF = new MutableTransitionState(Boolean.FALSE);
                                        composerKN.o(objIF);
                                    }
                                    mutableTransitionState = (MutableTransitionState) objIF;
                                    mutableTransitionState.KN(Boolean.valueOf(z3));
                                    if (((Boolean) mutableTransitionState.n()).booleanValue() || ((Boolean) mutableTransitionState.rl()).booleanValue()) {
                                        composerKN.eF(1377962068);
                                        objIF2 = composerKN.iF();
                                        if (objIF2 == companion.n()) {
                                            objIF2 = SnapshotStateKt__SnapshotStateKt.O(TransformOrigin.rl(TransformOrigin.INSTANCE.n()), null, 2, null);
                                            composerKN.o(objIF2);
                                        }
                                        final MutableState mutableState = (MutableState) objIF2;
                                        Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                                        objIF3 = composerKN.iF();
                                        if (objIF3 == companion.n()) {
                                            objIF3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                                    n(intRect, intRect2);
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(IntRect intRect, IntRect intRect2) {
                                                    mutableState.setValue(TransformOrigin.rl(MenuKt.KN(intRect, intRect2)));
                                                }
                                            };
                                            composerKN.o(objIF3);
                                        }
                                        final Function3 function33 = function32;
                                        AndroidPopup_androidKt.n(new DropdownMenuPositionProvider(j4, density, (Function2) objIF3, null), function0, popupProperties4, ComposableLambdaKt.nr(-47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                n(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer3, int i13) {
                                                if (!composer3.HI((i13 & 3) != 2, i13 & 1)) {
                                                    composer3.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-47803778, i13, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:92)");
                                                }
                                                MenuKt.n(mutableTransitionState, mutableState, scrollState3, modifier4, function33, composer3, MutableTransitionState.nr | 48, 0);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54), composerKN, (i11 & 112) | 3072 | ((i11 >> 9) & 896), 0);
                                        composerKN.Xw();
                                    } else {
                                        composerKN.eF(1378753932);
                                        composerKN.Xw();
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    popupProperties3 = popupProperties4;
                                    composer2 = composerKN;
                                    scrollState2 = scrollState3;
                                    modifier3 = modifier4;
                                    j3 = j4;
                                } else {
                                    composerKN.wTp();
                                    if ((i3 & 16) != 0) {
                                        i11 = i10 & (-57345);
                                        modifier4 = modifier2;
                                        j4 = jN;
                                        scrollState3 = scrollStateT;
                                        popupProperties4 = popupProperties2;
                                        composerKN.S();
                                        if (ComposerKt.v()) {
                                        }
                                        objIF = composerKN.iF();
                                        companion = Composer.INSTANCE;
                                        if (objIF == companion.n()) {
                                        }
                                        mutableTransitionState = (MutableTransitionState) objIF;
                                        mutableTransitionState.KN(Boolean.valueOf(z3));
                                        if (((Boolean) mutableTransitionState.n()).booleanValue()) {
                                            composerKN.eF(1377962068);
                                            objIF2 = composerKN.iF();
                                            if (objIF2 == companion.n()) {
                                            }
                                            final MutableState mutableState2 = (MutableState) objIF2;
                                            Density density2 = (Density) composerKN.ty(CompositionLocalsKt.J2());
                                            objIF3 = composerKN.iF();
                                            if (objIF3 == companion.n()) {
                                            }
                                            final Function3 function332 = function32;
                                            AndroidPopup_androidKt.n(new DropdownMenuPositionProvider(j4, density2, (Function2) objIF3, null), function0, popupProperties4, ComposableLambdaKt.nr(-47803778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    n(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Composer composer3, int i13) {
                                                    if (!composer3.HI((i13 & 3) != 2, i13 & 1)) {
                                                        composer3.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(-47803778, i13, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:92)");
                                                    }
                                                    MenuKt.n(mutableTransitionState, mutableState2, scrollState3, modifier4, function332, composer3, MutableTransitionState.nr | 48, 0);
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                }
                                            }, composerKN, 54), composerKN, (i11 & 112) | 3072 | ((i11 >> 9) & 896), 0);
                                            composerKN.Xw();
                                            if (ComposerKt.v()) {
                                            }
                                            popupProperties3 = popupProperties4;
                                            composer2 = composerKN;
                                            scrollState2 = scrollState3;
                                            modifier3 = modifier4;
                                            j3 = j4;
                                        }
                                    }
                                }
                                modifier4 = modifier2;
                                j4 = jN;
                                scrollState3 = scrollStateT;
                                popupProperties4 = popupProperties2;
                                i11 = i10;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                objIF = composerKN.iF();
                                companion = Composer.INSTANCE;
                                if (objIF == companion.n()) {
                                }
                                mutableTransitionState = (MutableTransitionState) objIF;
                                mutableTransitionState.KN(Boolean.valueOf(z3));
                                if (((Boolean) mutableTransitionState.n()).booleanValue()) {
                                }
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                final boolean z4 = z3;
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i13) {
                                        AndroidMenu_androidKt.n(z4, function0, modifier3, j3, scrollState2, popupProperties3, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= 1572864;
                        function32 = function3;
                        i10 = i5;
                        if (composerKN.HI((i5 & 599187) == 599186, i10 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    popupProperties2 = popupProperties;
                    if ((i3 & 64) == 0) {
                    }
                    function32 = function3;
                    i10 = i5;
                    if (composerKN.HI((i5 & 599187) == 599186, i10 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                jN = j2;
                if ((i2 & 24576) != 0) {
                }
                i9 = i3 & 32;
                if (i9 == 0) {
                }
                popupProperties2 = popupProperties;
                if ((i3 & 64) == 0) {
                }
                function32 = function3;
                i10 = i5;
                if (composerKN.HI((i5 & 599187) == 599186, i10 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            modifier2 = modifier;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            jN = j2;
            if ((i2 & 24576) != 0) {
            }
            i9 = i3 & 32;
            if (i9 == 0) {
            }
            popupProperties2 = popupProperties;
            if ((i3 & 64) == 0) {
            }
            function32 = function3;
            i10 = i5;
            if (composerKN.HI((i5 & 599187) == 599186, i10 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        jN = j2;
        if ((i2 & 24576) != 0) {
        }
        i9 = i3 & 32;
        if (i9 == 0) {
        }
        popupProperties2 = popupProperties;
        if ((i3 & 64) == 0) {
        }
        function32 = function3;
        i10 = i5;
        if (composerKN.HI((i5 & 599187) == 599186, i10 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void rl(final boolean z2, final Function0 function0, Modifier modifier, long j2, PopupProperties popupProperties, final Function3 function3, Composer composer, final int i2, final int i3) {
        boolean z3;
        int i5;
        Function0 function02;
        Modifier modifier2;
        int i7;
        long j3;
        int i8;
        Composer composer2;
        final Modifier modifier3;
        final long j4;
        final PopupProperties popupProperties2;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i9;
        Modifier modifier4;
        long jN;
        Composer composerKN = composer.KN(-840283139);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            z3 = z2;
        } else {
            z3 = z2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.n(z3) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function02) ? 32 : 16;
            }
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    j3 = j2;
                    i5 |= composerKN.nr(j3) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        i5 |= composerKN.p5(popupProperties) ? 16384 : 8192;
                    }
                    if ((i3 & 32) != 0) {
                        if ((i2 & 196608) == 0) {
                            i5 |= composerKN.E2(function3) ? 131072 : 65536;
                        }
                        if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
                            if (i10 != 0) {
                                modifier4 = Modifier.INSTANCE;
                                i9 = i8;
                            } else {
                                i9 = i8;
                                modifier4 = modifier2;
                            }
                            if (i7 != 0) {
                                float f3 = 0;
                                jN = DpKt.n(Dp.KN(f3), Dp.KN(f3));
                            } else {
                                jN = j3;
                            }
                            PopupProperties popupProperties3 = i9 != 0 ? new PopupProperties(true, false, false, false, 14, (DefaultConstructorMarker) null) : popupProperties;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-840283139, i5, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:56)");
                            }
                            int i11 = i5 & 8190;
                            int i12 = i5 << 3;
                            composer2 = composerKN;
                            n(z3, function02, modifier4, jN, ScrollKt.t(0, composerKN, 0, 1), popupProperties3, function3, composer2, i11 | (458752 & i12) | (i12 & 3670016), 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier3 = modifier4;
                            j4 = jN;
                            popupProperties2 = popupProperties3;
                        } else {
                            composer2 = composerKN;
                            composer2.wTp();
                            modifier3 = modifier2;
                            j4 = j3;
                            popupProperties2 = popupProperties;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i13) {
                                    AndroidMenu_androidKt.rl(z2, function0, modifier3, j4, popupProperties2, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 196608;
                    if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                if ((i3 & 32) != 0) {
                }
                if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            j3 = j2;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        j3 = j2;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final Function0 function0, Modifier modifier, boolean z2, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3 function3, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Modifier modifier2;
        int i7;
        boolean z3;
        int i8;
        int i9;
        Function3 function32;
        final PaddingValues paddingValues2;
        final Modifier modifier3;
        final boolean z4;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1988562892);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function02) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        i5 |= composerKN.p5(paddingValues) ? 2048 : 1024;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((i2 & 24576) == 0) {
                            i5 |= composerKN.p5(mutableInteractionSource) ? 16384 : 8192;
                        }
                        if ((i3 & 32) != 0) {
                            i5 |= 196608;
                            function32 = function3;
                        } else {
                            function32 = function3;
                            if ((i2 & 196608) == 0) {
                                i5 |= composerKN.E2(function32) ? 131072 : 65536;
                            }
                        }
                        if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
                            Modifier modifier4 = i10 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z5 = i7 != 0 ? true : z3;
                            PaddingValues paddingValuesN = i8 != 0 ? MenuDefaults.f22180n.n() : paddingValues;
                            MutableInteractionSource mutableInteractionSource3 = i9 != 0 ? null : mutableInteractionSource;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1988562892, i5, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:112)");
                            }
                            MenuKt.nr(function02, modifier4, z5, paddingValuesN, mutableInteractionSource3, function32, composerKN, i5 & 524286, 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier3 = modifier4;
                            z4 = z5;
                            paddingValues2 = paddingValuesN;
                            mutableInteractionSource2 = mutableInteractionSource3;
                        } else {
                            composerKN.wTp();
                            paddingValues2 = paddingValues;
                            modifier3 = modifier2;
                            z4 = z3;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenuItem$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    n(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer2, int i11) {
                                    AndroidMenu_androidKt.t(function0, modifier3, z4, paddingValues2, mutableInteractionSource2, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 24576;
                    if ((i3 & 32) != 0) {
                    }
                    if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            z3 = z2;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            i9 = i3 & 16;
            if (i9 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        z3 = z2;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        i9 = i3 & 16;
        if (i9 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }
}
