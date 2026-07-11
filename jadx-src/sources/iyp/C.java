package iyp;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.caoccao.javet.interop.engine.JavetEngineConfig;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class C {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(Function1 function1, int i2, int i3) {
        function1.invoke(Integer.valueOf(Math.max(0, i2 - i3)));
        return Unit.INSTANCE;
    }

    private static final void mUb(final String str, final int i2, final String str2, final List list, final Function1 function1, Composer composer, final int i3) {
        Composer composer2;
        Composer composerKN = composer.KN(-655389940);
        int i5 = (i3 & 6) == 0 ? (composerKN.p5(str) ? 4 : 2) | i3 : i3;
        if ((i3 & 48) == 0) {
            i5 |= composerKN.t(i2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(str2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerKN.E2(list) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= composerKN.E2(function1) ? 16384 : 8192;
        }
        if ((i5 & 9363) == 9362 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-655389940, i5, -1, "com.alightcreative.monorepo.sercretmenu.items.TimedDiscountsTestingItem (TimedDiscountsTestingScreen.kt:63)");
            }
            KN(composerKN, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            TextKt.t(str, SizeKt.KN(companion, 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, 6).te(), composerKN, (i5 & 14) | 48, 0, 65020);
            Composer composer3 = composerKN;
            float f3 = 12;
            Modifier modifierXMQ = PaddingKt.xMQ(companion, Dp.KN(f3));
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.ty(Dp.KN(f3)), Alignment.INSTANCE.qie(), composer3, 6);
            boolean z2 = false;
            int iN = ComposablesKt.n(composer3, 0);
            CompositionLocalMap compositionLocalMapIk = composer3.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer3, modifierXMQ);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
            if (composer3.getApplier() == null) {
                ComposablesKt.t();
            }
            composer3.T();
            if (composer3.getInserting()) {
                composer3.s7N(function0N);
            } else {
                composer3.r();
            }
            Composer composerN = Updater.n(composer3);
            Updater.O(composerN, measurePolicyRl, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            composer3.eF(-925101297);
            for (Pair pair : CollectionsKt.zip(CollectionsKt.listOf((Object[]) new String[]{"<<<", "<<", "<"}), CollectionsKt.reversed(list))) {
                String str3 = (String) pair.component1();
                final int iIntValue = ((Number) pair.component2()).intValue();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                composer3.eF(2015625821);
                boolean zT2 = ((i5 & 112) == 32 ? true : z2) | ((i5 & 57344) == 16384 ? true : z2) | composer3.t(iIntValue);
                Object objIF = composer3.iF();
                if (zT2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: iyp.CN3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C.gh(function1, i2, iIntValue);
                        }
                    };
                    composer3.o(objIF);
                }
                composer3.Xw();
                Composer composer4 = composer3;
                TextKt.t(str3, ClickableKt.J2(companion3, false, null, null, (Function0) objIF, 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer3, 6).ViF(), composer4, 0, 0, 65532);
                composer3 = composer4;
                z2 = z2;
            }
            boolean z3 = z2;
            composer3.Xw();
            Composer composer5 = composer3;
            TextKt.t(str2, RowScope.rl(rowScopeInstance, Modifier.INSTANCE, 2.0f, false, 2, null), 0L, 0L, null, null, null, 0L, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer3, 6).ViF(), composer5, (i5 >> 6) & 14, 0, 65020);
            Composer composer6 = composer5;
            composer6.eF(-925084987);
            for (Pair pair2 : CollectionsKt.zip(CollectionsKt.listOf((Object[]) new String[]{">", ">>", ">>>"}), list)) {
                String str4 = (String) pair2.component1();
                final int iIntValue2 = ((Number) pair2.component2()).intValue();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                composer6.eF(2015642131);
                boolean zT3 = ((i5 & 112) == 32 ? true : z3) | ((i5 & 57344) == 16384 ? true : z3) | composer6.t(iIntValue2);
                Object objIF2 = composer6.iF();
                if (zT3 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new Function0() { // from class: iyp.fuX
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C.qie(function1, i2, iIntValue2);
                        }
                    };
                    composer6.o(objIF2);
                }
                composer6.Xw();
                Composer composer7 = composer6;
                TextKt.t(str4, ClickableKt.J2(companion4, false, null, null, (Function0) objIF2, 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer6, 6).ViF(), composer7, 0, 0, 65532);
                composer6 = composer7;
            }
            composer2 = composer6;
            composer2.Xw();
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: iyp.Dsr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C.az(str, i2, str2, list, function1, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(Function1 function1, int i2, int i3) {
        function1.invoke(Integer.valueOf(i2 + i3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ik(MutableState mutableState, int i2) {
        com.alightcreative.app.motion.persist.j.INSTANCE.setTimeOffsetSeconds(i2);
        XQ(mutableState, i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(String str, int i2, String str2, List list, Function1 function1, int i3, Composer composer, int i5) {
        mUb(str, i2, str2, list, function1, composer, RecomposeScopeImplKt.n(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(MutableState mutableState, int i2) {
        com.alightcreative.app.motion.persist.j.INSTANCE.setSessionNumber(i2);
        o(mutableState, i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(int i2, Composer composer, int i3) {
        ty(composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void ty(Composer composer, final int i2) {
        Composer composerKN = composer.KN(-450641229);
        if (i2 == 0 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-450641229, i2, -1, "com.alightcreative.monorepo.sercretmenu.items.TimedDiscountsTestingScreen (TimedDiscountsTestingScreen.kt:25)");
            }
            composerKN.eF(-501824008);
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(Integer.valueOf(com.alightcreative.app.motion.persist.j.INSTANCE.getSessionNumber()), null, 2, null);
                composerKN.o(objIF);
            }
            final MutableState mutableState = (MutableState) objIF;
            composerKN.Xw();
            composerKN.eF(-501821444);
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = SnapshotStateKt__SnapshotStateKt.O(Integer.valueOf(com.alightcreative.app.motion.persist.j.INSTANCE.getTimeOffsetSeconds()), null, 2, null);
                composerKN.o(objIF2);
            }
            final MutableState mutableState2 = (MutableState) objIF2;
            composerKN.Xw();
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(12));
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalTy, Alignment.INSTANCE.gh(), composerKN, 6);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion3.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N);
            } else {
                composerKN.r();
            }
            Composer composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyN, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            int iHI = HI(mutableState);
            String strValueOf = String.valueOf(HI(mutableState));
            List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{1, 10, 100});
            composerKN.eF(1197507893);
            Object objIF3 = composerKN.iF();
            if (objIF3 == companion.n()) {
                objIF3 = new Function1() { // from class: iyp.Ml
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C.ck(mutableState, ((Integer) obj).intValue());
                    }
                };
                composerKN.o(objIF3);
            }
            composerKN.Xw();
            mUb("Session number", iHI, strValueOf, listListOf, (Function1) objIF3, composerKN, 27654);
            int iZ = Z(mutableState2);
            String str = (Z(mutableState2) / 86400) + " days, " + ((Z(mutableState2) % 86400) / JavetEngineConfig.DEFAULT_RESET_ENGINE_TIMEOUT_SECONDS) + " hours, " + ((Z(mutableState2) % JavetEngineConfig.DEFAULT_RESET_ENGINE_TIMEOUT_SECONDS) / 60) + " min.";
            List listListOf2 = CollectionsKt.listOf((Object[]) new Integer[]{60, Integer.valueOf(JavetEngineConfig.DEFAULT_RESET_ENGINE_TIMEOUT_SECONDS), 86400});
            composerKN.eF(1197522078);
            Object objIF4 = composerKN.iF();
            if (objIF4 == companion.n()) {
                objIF4 = new Function1() { // from class: iyp.I28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C.Ik(mutableState2, ((Integer) obj).intValue());
                    }
                };
                composerKN.o(objIF4);
            }
            composerKN.Xw();
            mUb("Time offset", iZ, str, listListOf2, (Function1) objIF4, composerKN, 27654);
            KN(composerKN, 0);
            TextKt.t("Don't forget to restart the app after modifying these values", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerKN, 6, 0, 131070);
            composerKN = composerKN;
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: iyp.Wre
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C.r(i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(int i2, Composer composer, int i3) {
        KN(composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    private static final int HI(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    private static final void KN(Composer composer, final int i2) {
        Composer composerKN = composer.KN(486988363);
        if (i2 == 0 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(486988363, i2, -1, "com.alightcreative.monorepo.sercretmenu.items.Divider (TimedDiscountsTestingScreen.kt:99)");
            }
            BoxKt.n(BackgroundKt.nr(SizeKt.xMQ(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), Dp.KN(1)), Color.INSTANCE.t(), null, 2, null), composerKN, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: iyp.aC
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C.xMQ(i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void XQ(MutableState mutableState, int i2) {
        mutableState.setValue(Integer.valueOf(i2));
    }

    private static final int Z(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    private static final void o(MutableState mutableState, int i2) {
        mutableState.setValue(Integer.valueOf(i2));
    }
}
