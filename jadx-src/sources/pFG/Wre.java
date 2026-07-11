package pFG;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRightKt;
import androidx.compose.material.icons.filled.FavoriteBorderKt;
import androidx.compose.material.icons.filled.FavoriteKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ktm.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Wre {
    /* JADX WARN: Removed duplicated region for block: B:113:0x044c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(Modifier modifier, final CN3 experimentUIState, final boolean z2, final Function0 onClick, final Function0 onFavouriteIconClicked, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        final Modifier modifier3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(experimentUIState, "experimentUIState");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onFavouriteIconClicked, "onFavouriteIconClicked");
        Composer composerKN = composer.KN(-1746252824);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(experimentUIState) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.n(z2) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(onClick) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 |= composerKN.E2(onFavouriteIconClicked) ? 16384 : 8192;
        }
        if ((i5 & 9363) == 9362 && composerKN.xMQ()) {
            composerKN.wTp();
            modifier3 = modifier2;
            composer2 = composerKN;
        } else {
            modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.v()) {
                ComposerKt.p5(-1746252824, i5, -1, "com.bendingspoons.experiments.secretmenu.items.experiments.Experiment (Experiment.kt:33)");
            }
            Modifier modifierKN = SizeKt.KN(modifier3, 0.0f, 1, null);
            composerKN.eF(-802561625);
            boolean z3 = (i5 & 7168) == 2048;
            Object objIF = composerKN.iF();
            if (z3 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: pFG.Ml
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Wre.nr(onClick);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            Modifier modifierJ2 = ClickableKt.J2(modifierKN, false, null, null, (Function0) objIF, 7, null);
            Arrangement arrangement = Arrangement.f17400n;
            Arrangement.HorizontalOrVertical horizontalOrVerticalNr = arrangement.nr();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalNr, companion.qie(), composerKN, 6);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierJ2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
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
            Updater.O(composerN, measurePolicyRl, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            ImageVector imageVectorN = experimentUIState.Uo() ? FavoriteKt.n(Icons.f23855n.n()) : FavoriteBorderKt.n(Icons.f23855n.n());
            MaterialTheme materialTheme = MaterialTheme.f26164n;
            int i8 = MaterialTheme.rl;
            long primary = materialTheme.n(composerKN, i8).getPrimary();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            float f3 = 16;
            IconKt.nr(imageVectorN, null, rowScopeInstance.t(PaddingKt.xMQ(ClickableKt.J2(companion3, false, null, null, onFavouriteIconClicked, 7, null), Dp.KN(f3)), companion.xMQ()), primary, composerKN, 48, 0);
            Modifier modifierRl = RowScope.rl(rowScopeInstance, PaddingKt.mUb(companion3, Dp.KN(f3), Dp.KN(8)), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.Uo(), companion.gh(), composerKN, 0);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierRl);
            Function0 function0N2 = companion2.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N2);
            } else {
                composerKN.r();
            }
            Composer composerN2 = Updater.n(composerKN);
            Updater.O(composerN2, measurePolicyN, companion2.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
            Function2 function2Rl2 = companion2.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion2.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            float f4 = 2;
            TextKt.t(experimentUIState.rl(), PaddingKt.xMQ(companion3, Dp.KN(f4)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(materialTheme.t(composerKN, i8).getBodyLarge(), 0L, 0L, FontWeight.INSTANCE.n(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composerKN, 48, 0, 65532);
            Modifier modifierXMQ = PaddingKt.xMQ(companion3, Dp.KN(f4));
            String strO = experimentUIState.O();
            TextStyle labelSmall = materialTheme.t(composerKN, i8).getLabelSmall();
            FontStyle.Companion companion4 = FontStyle.INSTANCE;
            TextKt.t(strO, modifierXMQ, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(labelSmall, 0L, 0L, null, FontStyle.t(companion4.n()), null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777207, null), composerKN, 48, 0, 65532);
            composerKN.eF(-470977975);
            if (z2) {
                j.n nVarNr = experimentUIState.nr();
                composerKN.eF(-470976395);
                if (nVarNr != null) {
                    TextKt.t(J2(nVarNr), PaddingKt.xMQ(companion3, Dp.KN(f4)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(materialTheme.t(composerKN, i8).getLabelSmall(), 0L, 0L, null, FontStyle.t(companion4.n()), null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777207, null), composerKN, 48, 0, 65532);
                    Unit unit = Unit.INSTANCE;
                }
                composerKN.Xw();
                Boolean boolJ2 = experimentUIState.J2();
                if (boolJ2 == null) {
                    composer2 = composerKN;
                } else {
                    composer2 = composerKN;
                    TextKt.t(Uo(boolJ2.booleanValue()), PaddingKt.xMQ(companion3, Dp.KN(f4)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(materialTheme.t(composerKN, i8).getLabelSmall(), 0L, 0L, null, FontStyle.t(companion4.n()), null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777207, null), composer2, 48, 0, 65532);
                    Unit unit2 = Unit.INSTANCE;
                }
                composer2.Xw();
                composer2.XQ();
                IconKt.nr(KeyboardArrowRightKt.n(Icons.AutoMirrored.Filled.f23857n), null, rowScopeInstance.t(PaddingKt.xMQ(companion3, Dp.KN(4)), companion.xMQ()), 0L, composer2, 48, 8);
                composer2.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pFG.I28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Wre.O(modifier3, experimentUIState, z2, onClick, onFavouriteIconClicked, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j.n.values().length];
            try {
                iArr[j.n.f70294t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.n.f70290O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.n.J2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.n.f70293r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final String J2(j.n nVar) {
        int i2 = j.$EnumSwitchMapping$0[nVar.ordinal()];
        if (i2 == 1) {
            return "Draft 📜";
        }
        if (i2 == 2) {
            return "Running ⚙️";
        }
        if (i2 == 3) {
            return "Observing 👀";
        }
        if (i2 == 4) {
            return "Completed ☑️";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Modifier modifier, CN3 cn3, boolean z2, Function0 function0, Function0 function02, int i2, int i3, Composer composer, int i5) {
        t(modifier, cn3, z2, function0, function02, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    private static final String Uo(boolean z2) {
        return "Compatible: " + (z2 ? "✅" : "❌");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
