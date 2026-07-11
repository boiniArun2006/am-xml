package androidx.compose.material;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJW\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "", "matchTextFieldWidth", "rl", "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;", "expanded", "Lkotlin/Function0;", "", "onDismissRequest", "modifier", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuBoxScope\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,671:1\n1247#2,6:672\n1247#2,6:678\n1247#2,6:685\n75#3:684\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuBoxScope\n*L\n197#1:672,6\n201#1:678,6\n204#1:685,6\n202#1:684\n*E\n"})
public abstract class ExposedDropdownMenuBoxScope {
    public abstract Modifier rl(Modifier modifier, boolean z2);

    public static /* synthetic */ Modifier t(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
        }
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return exposedDropdownMenuBoxScope.rl(modifier, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(boolean z2, final Function0 function0, Modifier modifier, ScrollState scrollState, final Function3 function3, Composer composer, final int i2, final int i3) {
        boolean z3;
        int i5;
        Function0 function02;
        int i7;
        Modifier modifier2;
        ScrollState scrollState2;
        Function3 function32;
        final ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope;
        final Modifier modifier3;
        final ScrollState scrollState3;
        ScopeUpdateScope scopeUpdateScopeGh;
        boolean z4;
        final ScrollState scrollStateT;
        Object objIF;
        Composer.Companion companion;
        final MutableTransitionState mutableTransitionState;
        Object objIF2;
        Object objIF3;
        Composer composerKN = composer.KN(1081438217);
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
                function02 = function0;
                i5 |= composerKN.E2(function02) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    modifier2 = modifier;
                    i5 |= composerKN.p5(modifier2) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        scrollState2 = scrollState;
                        int i8 = composerKN.p5(scrollState2) ? 2048 : 1024;
                        i5 |= i8;
                    } else {
                        scrollState2 = scrollState;
                    }
                    i5 |= i8;
                } else {
                    scrollState2 = scrollState;
                }
                if ((i3 & 16) == 0) {
                    if ((i2 & 24576) == 0) {
                        function32 = function3;
                        i5 |= composerKN.E2(function32) ? 16384 : 8192;
                    }
                    if ((i3 & 32) == 0) {
                        i5 |= 196608;
                        exposedDropdownMenuBoxScope = this;
                    } else {
                        exposedDropdownMenuBoxScope = this;
                        if ((i2 & 196608) == 0) {
                            i5 |= composerKN.p5(exposedDropdownMenuBoxScope) ? 131072 : 65536;
                        }
                    }
                    if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
                        composerKN.wTp();
                        modifier3 = modifier2;
                        scrollState3 = scrollState2;
                    } else {
                        composerKN.e();
                        if ((i2 & 1) == 0 || composerKN.rV9()) {
                            Modifier modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            if ((i3 & 8) != 0) {
                                i5 &= -7169;
                                modifier3 = modifier4;
                                z4 = true;
                                scrollStateT = ScrollKt.t(0, composerKN, 0, 1);
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1081438217, i5, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:186)");
                                }
                                objIF = composerKN.iF();
                                companion = Composer.INSTANCE;
                                if (objIF == companion.n()) {
                                    objIF = new MutableTransitionState(Boolean.FALSE);
                                    composerKN.o(objIF);
                                }
                                mutableTransitionState = (MutableTransitionState) objIF;
                                mutableTransitionState.KN(Boolean.valueOf(z3));
                                if (!((Boolean) mutableTransitionState.n()).booleanValue() || ((Boolean) mutableTransitionState.rl()).booleanValue()) {
                                    composerKN.eF(-669021506);
                                    objIF2 = composerKN.iF();
                                    if (objIF2 == companion.n()) {
                                        objIF2 = SnapshotStateKt__SnapshotStateKt.O(TransformOrigin.rl(TransformOrigin.INSTANCE.n()), null, 2, null);
                                        composerKN.o(objIF2);
                                    }
                                    final MutableState mutableState = (MutableState) objIF2;
                                    Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                                    long jN = DpOffset.INSTANCE.n();
                                    objIF3 = composerKN.iF();
                                    if (objIF3 == companion.n()) {
                                        objIF3 = new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
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
                                    ExposedDropdownMenuPopup_androidKt.n(function02, new DropdownMenuPositionProvider(jN, density, (Function2) objIF3, null), ComposableLambdaKt.nr(-1167205969, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            n(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer2, int i9) {
                                            if (!composer2.HI((i9 & 3) != 2, i9 & 1)) {
                                                composer2.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-1167205969, i9, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.kt:211)");
                                            }
                                            MenuKt.n(mutableTransitionState, mutableState, scrollStateT, ExposedDropdownMenuBoxScope.t(exposedDropdownMenuBoxScope, modifier3, false, 1, null), function33, composer2, MutableTransitionState.nr | 48, 0);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54), composerKN, ((i5 >> 3) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                                    composerKN.Xw();
                                } else {
                                    composerKN.eF(-668146035);
                                    composerKN.Xw();
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                scrollState3 = scrollStateT;
                            } else {
                                modifier3 = modifier4;
                            }
                        } else {
                            composerKN.wTp();
                            if ((i3 & 8) != 0) {
                                i5 &= -7169;
                            }
                            modifier3 = modifier2;
                        }
                        z4 = true;
                        scrollStateT = scrollState2;
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
                            composerKN.eF(-669021506);
                            objIF2 = composerKN.iF();
                            if (objIF2 == companion.n()) {
                            }
                            final MutableState mutableState2 = (MutableState) objIF2;
                            Density density2 = (Density) composerKN.ty(CompositionLocalsKt.J2());
                            long jN2 = DpOffset.INSTANCE.n();
                            objIF3 = composerKN.iF();
                            if (objIF3 == companion.n()) {
                            }
                            final Function3 function332 = function32;
                            ExposedDropdownMenuPopup_androidKt.n(function02, new DropdownMenuPositionProvider(jN2, density2, (Function2) objIF3, null), ComposableLambdaKt.nr(-1167205969, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    n(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer2, int i9) {
                                    if (!composer2.HI((i9 & 3) != 2, i9 & 1)) {
                                        composer2.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-1167205969, i9, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.kt:211)");
                                    }
                                    MenuKt.n(mutableTransitionState, mutableState2, scrollStateT, ExposedDropdownMenuBoxScope.t(exposedDropdownMenuBoxScope, modifier3, false, 1, null), function332, composer2, MutableTransitionState.nr | 48, 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, ((i5 >> 3) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                            composerKN.Xw();
                            if (ComposerKt.v()) {
                            }
                            scrollState3 = scrollStateT;
                        }
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        final boolean z5 = z3;
                        final Modifier modifier5 = modifier3;
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                n(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer2, int i9) {
                                this.f21998n.n(z5, function0, modifier5, scrollState3, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 24576;
                function32 = function3;
                if ((i3 & 32) == 0) {
                }
                if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            modifier2 = modifier;
            if ((i2 & 3072) == 0) {
            }
            if ((i3 & 16) == 0) {
            }
            function32 = function3;
            if ((i3 & 32) == 0) {
            }
            if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        function02 = function0;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        if ((i2 & 3072) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        function32 = function3;
        if ((i3 & 32) == 0) {
        }
        if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
