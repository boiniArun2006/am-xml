package Vil;

import KA9.Lu;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import e.C1960j;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class iwV {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KN(final C1960j preset, final float f3, final boolean z2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        final Function0 function06;
        int i8;
        Function0 function07;
        int i9;
        Function0 function08;
        int i10;
        Function0 function09;
        int i11;
        Function0 function010;
        Function0 function011;
        Function0 function012;
        Object objIF;
        Composer.Companion companion;
        boolean z3;
        Object objIF2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Composer composer2;
        final Function0 function013;
        final Function0 function014;
        final Function0 function015;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(preset, "preset");
        Composer composerKN = composer.KN(101917413);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(preset) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.rl(f3) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.n(z2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    function06 = function0;
                    i5 |= composerKN.E2(function06) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 == 0) {
                    if ((i2 & 24576) == 0) {
                        function07 = function02;
                        i5 |= composerKN.E2(function07) ? 16384 : 8192;
                    }
                    i9 = i3 & 32;
                    if (i9 == 0) {
                        i5 |= 196608;
                        function08 = function03;
                    } else {
                        function08 = function03;
                        if ((i2 & 196608) == 0) {
                            i5 |= composerKN.E2(function08) ? 131072 : 65536;
                        }
                    }
                    i10 = i3 & 64;
                    if (i10 == 0) {
                        i5 |= 1572864;
                        function09 = function04;
                    } else {
                        function09 = function04;
                        if ((i2 & 1572864) == 0) {
                            i5 |= composerKN.E2(function09) ? 1048576 : 524288;
                        }
                    }
                    i11 = 128 & i3;
                    if (i11 == 0) {
                        i5 |= 12582912;
                        function010 = function05;
                    } else {
                        function010 = function05;
                        if ((i2 & 12582912) == 0) {
                            i5 |= composerKN.E2(function010) ? 8388608 : 4194304;
                        }
                    }
                    if ((i5 & 4793491) == 4793490 || !composerKN.xMQ()) {
                        if (i7 != 0) {
                            composerKN.eF(1453858781);
                            Object objIF3 = composerKN.iF();
                            if (objIF3 == Composer.INSTANCE.n()) {
                                objIF3 = new Function0() { // from class: Vil.Ew
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return iwV.xMQ();
                                    }
                                };
                                composerKN.o(objIF3);
                            }
                            function06 = (Function0) objIF3;
                            composerKN.Xw();
                        }
                        if (i8 == 0) {
                            composerKN.eF(1453859773);
                            Object objIF4 = composerKN.iF();
                            if (objIF4 == Composer.INSTANCE.n()) {
                                objIF4 = new Function0() { // from class: Vil.nKK
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return iwV.qie();
                                    }
                                };
                                composerKN.o(objIF4);
                            }
                            function011 = (Function0) objIF4;
                            composerKN.Xw();
                        } else {
                            function011 = function07;
                        }
                        if (i9 != 0) {
                            composerKN.eF(1453860765);
                            Object objIF5 = composerKN.iF();
                            if (objIF5 == Composer.INSTANCE.n()) {
                                objIF5 = new Function0() { // from class: Vil.DAz
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return iwV.az();
                                    }
                                };
                                composerKN.o(objIF5);
                            }
                            function08 = (Function0) objIF5;
                            composerKN.Xw();
                        }
                        Function0 function016 = function08;
                        if (i10 != 0) {
                            composerKN.eF(1453861757);
                            Object objIF6 = composerKN.iF();
                            if (objIF6 == Composer.INSTANCE.n()) {
                                objIF6 = new Function0() { // from class: Vil.u
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return iwV.ty();
                                    }
                                };
                                composerKN.o(objIF6);
                            }
                            composerKN.Xw();
                            function09 = (Function0) objIF6;
                        }
                        if (i11 == 0) {
                            composerKN.eF(1453862749);
                            Object objIF7 = composerKN.iF();
                            if (objIF7 == Composer.INSTANCE.n()) {
                                objIF7 = new Function0() { // from class: Vil.qf
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return iwV.HI();
                                    }
                                };
                                composerKN.o(objIF7);
                            }
                            function012 = (Function0) objIF7;
                            composerKN.Xw();
                        } else {
                            function012 = function010;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(101917413, i5, -1, "com.alightcreative.maineditor.presetpreview.ui.components.PresetItemSelected (PresetItemSelected.kt:31)");
                        }
                        composerKN.eF(1453863938);
                        objIF = composerKN.iF();
                        companion = Composer.INSTANCE;
                        if (objIF == companion.n()) {
                            objIF = InteractionSourceKt.n();
                            composerKN.o(objIF);
                        }
                        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objIF;
                        composerKN.Xw();
                        float fKN = Dp.KN(-Dp.KN(255));
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Function0 function017 = function012;
                        Modifier modifierGh = PaddingKt.gh(SizeKt.J2(BackgroundKt.nr(companion2, aD.w6.eWT(), null, 2, null), 0.0f, 1, null), Dp.KN(16), 0.0f, 2, null);
                        composerKN.eF(1453877038);
                        z3 = (i5 & 7168) != 2048;
                        objIF2 = composerKN.iF();
                        if (!z3 || objIF2 == companion.n()) {
                            objIF2 = new Function0() { // from class: Vil.Ln
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return iwV.mUb(function06);
                                }
                            };
                            composerKN.o(objIF2);
                        }
                        composerKN.Xw();
                        Modifier modifierT = OffsetKt.t(ClickableKt.nr(modifierGh, mutableInteractionSource, null, false, null, null, (Function0) objIF2, 28, null), 0.0f, f3, 1, null);
                        Arrangement.Vertical verticalUo = Arrangement.f17400n.Uo();
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion3.gh(), composerKN, 0);
                        iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                        Modifier modifierO = ComposedModifierKt.O(composerKN, modifierT);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0 function0N = companion4.n();
                        if (composerKN.getApplier() == null) {
                            ComposablesKt.t();
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                            composerKN.r();
                        } else {
                            composerKN.s7N(function0N);
                        }
                        composerN = Updater.n(composerKN);
                        Updater.O(composerN, measurePolicyN, companion4.t());
                        Updater.O(composerN, compositionLocalMapIk, companion4.O());
                        function2Rl = companion4.rl();
                        if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion4.nr());
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                        int i12 = i5 << 3;
                        Function0 function018 = function09;
                        Function0 function019 = function011;
                        Z.J2(preset, false, false, z2, function06, function06, null, false, function019, composerKN, (i5 & 14) | 12583344 | (i12 & 7168) | (i12 & 57344) | (458752 & (i5 << 6)) | ((i5 << 12) & 234881024), 64);
                        Function0 function020 = function06;
                        composer2 = composerKN;
                        Modifier modifierT2 = OffsetKt.t(BackgroundKt.nr(columnScopeInstance.t(companion2, companion3.mUb()), Color.INSTANCE.J2(), null, 2, null), 0.0f, fKN, 1, null);
                        function08 = function016;
                        KA9.vd.xMQ(modifierT2, true, function020, CollectionsKt.listOf((Object[]) new KA9.Lu[]{new Lu.fuX(function019), new Lu.Wre(function08), new Lu.CN3(function018), new Lu.j(function017)}), composer2, ((i5 >> 3) & 896) | 48, 0);
                        composer2.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        function013 = function019;
                        function014 = function017;
                        function015 = function018;
                        function06 = function020;
                    } else {
                        composerKN.wTp();
                        function015 = function09;
                        composer2 = composerKN;
                        function013 = function07;
                        function014 = function010;
                    }
                    final Function0 function021 = function08;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2() { // from class: Vil.lej
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return iwV.gh(preset, f3, z2, function06, function013, function021, function015, function014, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 24576;
                function07 = function02;
                i9 = i3 & 32;
                if (i9 == 0) {
                }
                i10 = i3 & 64;
                if (i10 == 0) {
                }
                i11 = 128 & i3;
                if (i11 == 0) {
                }
                if ((i5 & 4793491) == 4793490) {
                    if (i7 != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 != 0) {
                    }
                    Function0 function0162 = function08;
                    if (i10 != 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (ComposerKt.v()) {
                    }
                    composerKN.eF(1453863938);
                    objIF = composerKN.iF();
                    companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                    }
                    MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objIF;
                    composerKN.Xw();
                    float fKN2 = Dp.KN(-Dp.KN(255));
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    Function0 function0172 = function012;
                    Modifier modifierGh2 = PaddingKt.gh(SizeKt.J2(BackgroundKt.nr(companion22, aD.w6.eWT(), null, 2, null), 0.0f, 1, null), Dp.KN(16), 0.0f, 2, null);
                    composerKN.eF(1453877038);
                    if ((i5 & 7168) != 2048) {
                    }
                    objIF2 = composerKN.iF();
                    if (!z3) {
                        objIF2 = new Function0() { // from class: Vil.Ln
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return iwV.mUb(function06);
                            }
                        };
                        composerKN.o(objIF2);
                        composerKN.Xw();
                        Modifier modifierT3 = OffsetKt.t(ClickableKt.nr(modifierGh2, mutableInteractionSource2, null, false, null, null, (Function0) objIF2, 28, null), 0.0f, f3, 1, null);
                        Arrangement.Vertical verticalUo2 = Arrangement.f17400n.Uo();
                        Alignment.Companion companion32 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyN2 = ColumnKt.n(verticalUo2, companion32.gh(), composerKN, 0);
                        iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                        Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierT3);
                        ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                        Function0 function0N2 = companion42.n();
                        if (composerKN.getApplier() == null) {
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                        }
                        composerN = Updater.n(composerKN);
                        Updater.O(composerN, measurePolicyN2, companion42.t());
                        Updater.O(composerN, compositionLocalMapIk2, companion42.O());
                        function2Rl = companion42.rl();
                        if (!composerN.getInserting()) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                            Updater.O(composerN, modifierO2, companion42.nr());
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                            int i122 = i5 << 3;
                            Function0 function0182 = function09;
                            Function0 function0192 = function011;
                            Z.J2(preset, false, false, z2, function06, function06, null, false, function0192, composerKN, (i5 & 14) | 12583344 | (i122 & 7168) | (i122 & 57344) | (458752 & (i5 << 6)) | ((i5 << 12) & 234881024), 64);
                            Function0 function0202 = function06;
                            composer2 = composerKN;
                            Modifier modifierT22 = OffsetKt.t(BackgroundKt.nr(columnScopeInstance2.t(companion22, companion32.mUb()), Color.INSTANCE.J2(), null, 2, null), 0.0f, fKN2, 1, null);
                            function08 = function0162;
                            KA9.vd.xMQ(modifierT22, true, function0202, CollectionsKt.listOf((Object[]) new KA9.Lu[]{new Lu.fuX(function0192), new Lu.Wre(function08), new Lu.CN3(function0182), new Lu.j(function0172)}), composer2, ((i5 >> 3) & 896) | 48, 0);
                            composer2.XQ();
                            if (ComposerKt.v()) {
                            }
                            function013 = function0192;
                            function014 = function0172;
                            function015 = function0182;
                            function06 = function0202;
                        }
                    }
                }
                final Function0 function0212 = function08;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            function06 = function0;
            i8 = i3 & 16;
            if (i8 == 0) {
            }
            function07 = function02;
            i9 = i3 & 32;
            if (i9 == 0) {
            }
            i10 = i3 & 64;
            if (i10 == 0) {
            }
            i11 = 128 & i3;
            if (i11 == 0) {
            }
            if ((i5 & 4793491) == 4793490) {
            }
            final Function0 function02122 = function08;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        function06 = function0;
        i8 = i3 & 16;
        if (i8 == 0) {
        }
        function07 = function02;
        i9 = i3 & 32;
        if (i9 == 0) {
        }
        i10 = i3 & 64;
        if (i10 == 0) {
        }
        i11 = 128 & i3;
        if (i11 == 0) {
        }
        if ((i5 & 4793491) == 4793490) {
        }
        final Function0 function021222 = function08;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(C1960j c1960j, float f3, boolean z2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i2, int i3, Composer composer, int i5) {
        KN(c1960j, f3, z2, function0, function02, function03, function04, function05, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ty() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
