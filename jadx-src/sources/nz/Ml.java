package nz;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Ml {
    /* JADX WARN: Removed duplicated region for block: B:107:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0138 A[PHI: r18
      0x0138: PHI (r18v14 int) = (r18v0 int), (r18v3 int), (r18v4 int) binds: [B:96:0x0136, B:104:0x014c, B:103:0x0149] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final String title, final boolean z2, final boolean z3, final List tags, final Function0 onBackClicked, final Function0 onSaveClicked, final Function0 onUseTemplateClicked, final Function0 onSeeAllSavedClicked, Modifier modifier, aC aCVar, Function0 function0, Function0 function02, boolean z4, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        boolean z5;
        int i8;
        Modifier modifier2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Composer composer2;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        final boolean z6;
        final aC aCVar2;
        final Function0 function03;
        final Function0 function04;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i17 = com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(onSaveClicked, "onSaveClicked");
        Intrinsics.checkNotNullParameter(onUseTemplateClicked, "onUseTemplateClicked");
        Intrinsics.checkNotNullParameter(onSeeAllSavedClicked, "onSeeAllSavedClicked");
        Composer composerKN = composer.KN(-14211314);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = i2 | (composerKN.p5(title) ? 4 : 2);
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
            z5 = z2;
        } else {
            z5 = z2;
            if ((i2 & 48) == 0) {
                i7 |= composerKN.n(z5) ? 32 : 16;
            }
        }
        int i18 = i7;
        if ((i5 & 4) == 0) {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i18 |= composerKN.n(z3) ? 256 : 128;
            }
            if ((i5 & 8) == 0) {
                i18 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i18 |= composerKN.E2(tags) ? 2048 : 1024;
            }
            if ((i5 & 16) == 0) {
                i18 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i18 |= composerKN.E2(onBackClicked) ? 16384 : 8192;
            }
            if ((i5 & 32) == 0) {
                i18 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i18 |= composerKN.E2(onSaveClicked) ? 131072 : 65536;
            }
            if ((i5 & 64) == 0) {
                i18 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i18 |= composerKN.E2(onUseTemplateClicked) ? 1048576 : 524288;
            }
            if ((i5 & 128) == 0) {
                i18 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i18 |= composerKN.E2(onSeeAllSavedClicked) ? 8388608 : 4194304;
            }
            i8 = i5 & 256;
            if (i8 == 0) {
                i18 |= 100663296;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i2 & 100663296) == 0) {
                    i18 |= composerKN.p5(modifier2) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                }
            }
            i9 = i5 & 512;
            if (i9 != 0) {
                i18 |= i17;
            } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                i17 = composerKN.p5(aCVar) ? 536870912 : 268435456;
                i18 |= i17;
            }
            i10 = 1024 & i5;
            if (i10 == 0) {
                i12 = i3 | 6;
                i11 = i10;
            } else if ((i3 & 6) == 0) {
                i11 = i10;
                i12 = i3 | (composerKN.E2(function0) ? 4 : 2);
            } else {
                i11 = i10;
                i12 = i3;
            }
            i13 = 2048 & i5;
            if (i13 == 0) {
                i12 |= 48;
                i14 = i13;
            } else if ((i3 & 48) == 0) {
                i14 = i13;
                i12 |= composerKN.E2(function02) ? 32 : 16;
            } else {
                i14 = i13;
            }
            int i19 = i12;
            i15 = i5 & 4096;
            if (i15 == 0) {
                i16 = i19 | RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                int i20 = i19;
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i20 |= composerKN.n(z4) ? 256 : 128;
                }
                i16 = i20;
            }
            if ((i18 & 306783379) != 306783378 && (i16 & 147) == 146 && composerKN.xMQ()) {
                composerKN.wTp();
                aCVar2 = aCVar;
                function03 = function0;
                function04 = function02;
                z6 = z4;
                composer2 = composerKN;
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                aC aCVar3 = i9 == 0 ? null : aCVar;
                Function0 function05 = i11 == 0 ? null : function0;
                Function0 function06 = i14 == 0 ? null : function02;
                boolean z7 = i15 == 0 ? false : z4;
                if (ComposerKt.v()) {
                    ComposerKt.p5(-14211314, i18, i16, "com.alightcreative.app.motion.activities.main.templatepreview.composables.ControlsOverlay (ControlsOverlay.kt:30)");
                }
                int i21 = i18;
                Modifier modifierJ2 = SizeKt.J2(modifier4, 0.0f, 1, null);
                Arrangement arrangement = Arrangement.f17400n;
                Arrangement.Vertical verticalUo = arrangement.Uo();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion.gh(), composerKN, 0);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierJ2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Modifier modifier5 = modifier4;
                Function0 function0N = companion2.n();
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
                Updater.O(composerN, measurePolicyN, companion2.t());
                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                function2Rl = companion2.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion2.nr());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                int i22 = i21 >> 3;
                int i23 = (i21 & 14) | ((i21 >> 24) & 112) | ((i21 << 3) & 896) | (i22 & 7168) | (i22 & 57344) | ((i21 << 6) & 458752);
                int i24 = i16;
                aC aCVar4 = aCVar3;
                Dsr.rl(title, aCVar4, z5, onBackClicked, onSaveClicked, tags, null, composerKN, i23, 64);
                composer2 = composerKN;
                Modifier modifierKN = SizeKt.KN(ColumnScope.rl(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyRl = RowKt.rl(arrangement.J2(), companion.qie(), composer2, 0);
                iN2 = ComposablesKt.n(composer2, 0);
                CompositionLocalMap compositionLocalMapIk2 = composer2.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composer2, modifierKN);
                Function0 function0N2 = companion2.n();
                if (composer2.getApplier() == null) {
                    ComposablesKt.t();
                }
                composer2.T();
                if (composer2.getInserting()) {
                    composer2.r();
                } else {
                    composer2.s7N(function0N2);
                }
                composerN2 = Updater.n(composer2);
                Updater.O(composerN2, measurePolicyRl, companion2.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
                function2Rl2 = companion2.rl();
                if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion2.nr());
                RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                composer2.eF(1664868869);
                for (Function0 function07 : CollectionsKt.listOf((Object[]) new Function0[]{function05, function06})) {
                    Modifier modifierNr = Modifier.INSTANCE;
                    Modifier modifierNr2 = SizeKt.nr(RowScope.rl(rowScopeInstance, modifierNr, 1.0f, false, 2, null), 0.0f, 1, null);
                    if (function07 != null) {
                        modifierNr = ClickableKt.nr(modifierNr, null, null, false, null, null, function07, 28, null);
                    }
                    BoxKt.n(modifierNr2.Zmq(modifierNr), composer2, 0);
                }
                composer2.Xw();
                composer2.XQ();
                int i25 = i21 >> 12;
                int i26 = ((i21 >> 6) & 14) | 24576 | ((i24 >> 3) & 112) | (i25 & 896) | (i25 & 7168);
                boolean z9 = z7;
                CN3.t(z3, z9, onUseTemplateClicked, onSeeAllSavedClicked, PaddingKt.az(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.KN(20), 7, null), composer2, i26, 0);
                composer2.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                z6 = z9;
                aCVar2 = aCVar4;
                function03 = function05;
                function04 = function06;
                modifier3 = modifier5;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: nz.w6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Ml.t(title, z2, z3, tags, onBackClicked, onSaveClicked, onUseTemplateClicked, onSeeAllSavedClicked, modifier3, aCVar2, function03, function04, z6, i2, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i18 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        if ((i5 & 8) == 0) {
        }
        if ((i5 & 16) == 0) {
        }
        if ((i5 & 32) == 0) {
        }
        if ((i5 & 64) == 0) {
        }
        if ((i5 & 128) == 0) {
        }
        i8 = i5 & 256;
        if (i8 == 0) {
        }
        i9 = i5 & 512;
        if (i9 != 0) {
        }
        i10 = 1024 & i5;
        if (i10 == 0) {
        }
        i13 = 2048 & i5;
        if (i13 == 0) {
        }
        int i192 = i12;
        i15 = i5 & 4096;
        if (i15 == 0) {
        }
        if ((i18 & 306783379) != 306783378) {
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i11 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (ComposerKt.v()) {
            }
            int i212 = i18;
            Modifier modifierJ22 = SizeKt.J2(modifier4, 0.0f, 1, null);
            Arrangement arrangement2 = Arrangement.f17400n;
            Arrangement.Vertical verticalUo2 = arrangement2.Uo();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN2 = ColumnKt.n(verticalUo2, companion3.gh(), composerKN, 0);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierJ22);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Modifier modifier52 = modifier4;
            Function0 function0N3 = companion22.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyN2, companion22.t());
            Updater.O(composerN, compositionLocalMapIk3, companion22.O());
            function2Rl = companion22.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO3, companion22.nr());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                int i222 = i212 >> 3;
                int i232 = (i212 & 14) | ((i212 >> 24) & 112) | ((i212 << 3) & 896) | (i222 & 7168) | (i222 & 57344) | ((i212 << 6) & 458752);
                int i242 = i16;
                aC aCVar42 = aCVar3;
                Dsr.rl(title, aCVar42, z5, onBackClicked, onSaveClicked, tags, null, composerKN, i232, 64);
                composer2 = composerKN;
                Modifier modifierKN2 = SizeKt.KN(ColumnScope.rl(columnScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyRl2 = RowKt.rl(arrangement2.J2(), companion3.qie(), composer2, 0);
                iN2 = ComposablesKt.n(composer2, 0);
                CompositionLocalMap compositionLocalMapIk22 = composer2.Ik();
                Modifier modifierO22 = ComposedModifierKt.O(composer2, modifierKN2);
                Function0 function0N22 = companion22.n();
                if (composer2.getApplier() == null) {
                }
                composer2.T();
                if (composer2.getInserting()) {
                }
                composerN2 = Updater.n(composer2);
                Updater.O(composerN2, measurePolicyRl2, companion22.t());
                Updater.O(composerN2, compositionLocalMapIk22, companion22.O());
                function2Rl2 = companion22.rl();
                if (!composerN2.getInserting()) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    Updater.O(composerN2, modifierO22, companion22.nr());
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                    composer2.eF(1664868869);
                    while (r0.hasNext()) {
                    }
                    composer2.Xw();
                    composer2.XQ();
                    int i252 = i212 >> 12;
                    int i262 = ((i212 >> 6) & 14) | 24576 | ((i242 >> 3) & 112) | (i252 & 896) | (i252 & 7168);
                    boolean z92 = z7;
                    CN3.t(z3, z92, onUseTemplateClicked, onSeeAllSavedClicked, PaddingKt.az(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.KN(20), 7, null), composer2, i262, 0);
                    composer2.XQ();
                    if (ComposerKt.v()) {
                    }
                    z6 = z92;
                    aCVar2 = aCVar42;
                    function03 = function05;
                    function04 = function06;
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(String str, boolean z2, boolean z3, List list, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Modifier modifier, aC aCVar, Function0 function05, Function0 function06, boolean z4, int i2, int i3, int i5, Composer composer, int i7) {
        rl(str, z2, z3, list, function0, function02, function03, function04, modifier, aCVar, function05, function06, z4, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
        return Unit.INSTANCE;
    }
}
