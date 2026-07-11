package ka;

import Dj7.AbstractC1328c;
import Dj7.CM;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.net.Toe.GDEJgAYrPQHfw;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f69981n = Dp.KN(12);

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    static final class j implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f69982O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f69983n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f69984t;

        j(Function0 function0, Function0 function02, Function0 function03) {
            this.f69983n = function0;
            this.f69984t = function02;
            this.f69982O = function03;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-619487509, i2, -1, "com.alightcreative.app.motion.ranking.ui.CreatorProfileMenuChoices.<anonymous> (CardWithMenu.kt:84)");
            }
            Function0 function0 = this.f69983n;
            Function0 function02 = this.f69984t;
            Function0 function03 = this.f69982O;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer, 0);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
            if (composer.getApplier() == null) {
                ComposablesKt.t();
            }
            composer.T();
            if (composer.getInserting()) {
                composer.s7N(function0N);
            } else {
                composer.r();
            }
            Composer composerN = Updater.n(composer);
            Updater.O(composerN, measurePolicyN, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            Wre.gh(StringResources_androidKt.t(2132017619, composer, 6), 2131231686, function0, composer, 48);
            Wre.gh(StringResources_androidKt.t(2132017622, composer, 6), 2131231853, function02, composer, 48);
            Wre.gh(StringResources_androidKt.t(2132017615, composer, 6), 2131231930, function03, composer, 48);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final void J2(final float f3, final Function0 onEditClicked, final Function0 onOptOutClicked, final Function0 onFaqClicked, final Function0 onDismiss, final Function3 function3, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onEditClicked, "onEditClicked");
        Intrinsics.checkNotNullParameter(onOptOutClicked, "onOptOutClicked");
        Intrinsics.checkNotNullParameter(onFaqClicked, "onFaqClicked");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(function3, GDEJgAYrPQHfw.xZUMNMv);
        Composer composerKN = composer.KN(626742018);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.rl(f3) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onEditClicked) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onOptOutClicked) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(onFaqClicked) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(onDismiss) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(function3) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(626742018, i3, -1, "com.alightcreative.app.motion.ranking.ui.CardWithMenu (CardWithMenu.kt:41)");
            }
            composerKN.eF(-1028066320);
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = InteractionSourceKt.n();
                composerKN.o(objIF);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objIF;
            composerKN.Xw();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierJ2 = SizeKt.J2(BackgroundKt.nr(companion2, aD.w6.a63(), null, 2, null), 0.0f, 1, null);
            composerKN.eF(-1028058664);
            boolean z2 = (57344 & i3) == 16384;
            Object objIF2 = composerKN.iF();
            if (z2 || objIF2 == companion.n()) {
                objIF2 = new Function0() { // from class: ka.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Wre.Uo(onDismiss);
                    }
                };
                composerKN.o(objIF2);
            }
            composerKN.Xw();
            Modifier modifierT = OffsetKt.t(ClickableKt.nr(modifierJ2, mutableInteractionSource, null, false, null, null, (Function0) objIF2, 28, null), 0.0f, f3, 1, null);
            Arrangement.Vertical verticalUo = Arrangement.f17400n.Uo();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion3.gh(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierT);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion4.n();
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
            Updater.O(composerN, measurePolicyN, companion4.t());
            Updater.O(composerN, compositionLocalMapIk, companion4.O());
            Function2 function2Rl = companion4.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion4.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            function3.invoke(columnScopeInstance, composerKN, Integer.valueOf(((i3 >> 12) & 112) | 6));
            SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(8)), composerKN, 6);
            xMQ(BackgroundKt.nr(PaddingKt.gh(columnScopeInstance.t(companion2, companion3.mUb()), Dp.KN(16), 0.0f, 2, null), Color.INSTANCE.J2(), null, 2, null), onEditClicked, onOptOutClicked, onFaqClicked, composerKN, i3 & 8176, 0);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: ka.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Wre.KN(f3, onEditClicked, onOptOutClicked, onFaqClicked, onDismiss, function3, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(float f3, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function3 function3, int i2, Composer composer, int i3) {
        J2(f3, function0, function02, function03, function04, function3, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(String str, int i2, Function0 function0, int i3, Composer composer, int i5) {
        gh(str, i2, function0, composer, RecomposeScopeImplKt.n(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gh(final String str, int i2, final Function0 function0, Composer composer, final int i3) {
        int i5;
        final int i7;
        Composer composerKN = composer.KN(-1470969117);
        if ((i3 & 6) == 0) {
            i5 = (composerKN.p5(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerKN.t(i2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(function0) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            i7 = i2;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1470969117, i5, -1, "com.alightcreative.app.motion.ranking.ui.RankingMenuChoice (CardWithMenu.kt:109)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            composerKN.eF(348634607);
            boolean z2 = (i5 & 896) == 256;
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: ka.Ml
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Wre.qie(function0);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            Modifier modifierMUb = PaddingKt.mUb(ClickableKt.J2(companion, false, null, null, (Function0) objIF, 7, null), Dp.KN(16), Dp.KN(12));
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), Alignment.INSTANCE.qie(), composerKN, 48);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierMUb);
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
            CM.S(str, H9N.j.f3810n.rl(composerKN, 6).N(), null, 0L, null, null, null, 0, false, 0, null, composerKN, i5 & 14, 0, 2044);
            SpacerKt.n(RowScope.rl(rowScopeInstance, companion, 1.0f, false, 2, null), composerKN, 0);
            i7 = i2;
            IconKt.n(PainterResources_androidKt.t(i7, composerKN, (i5 >> 3) & 14), null, null, 0L, composerKN, 48, 12);
            composerKN = composerKN;
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: ka.I28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Wre.az(str, i7, function0, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(Modifier modifier, Function0 function0, Function0 function02, Function0 function03, int i2, int i3, Composer composer, int i5) {
        xMQ(modifier, function0, function02, function03, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final void xMQ(Modifier modifier, final Function0 onEditClicked, final Function0 onOptOutClicked, final Function0 onFaqClicked, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(onEditClicked, "onEditClicked");
        Intrinsics.checkNotNullParameter(onOptOutClicked, "onOptOutClicked");
        Intrinsics.checkNotNullParameter(onFaqClicked, "onFaqClicked");
        Composer composerKN = composer.KN(-2008394168);
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
            i5 |= composerKN.E2(onEditClicked) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onOptOutClicked) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(onFaqClicked) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            modifier3 = modifier2;
        } else {
            modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.v()) {
                ComposerKt.p5(-2008394168, i5, -1, "com.alightcreative.app.motion.ranking.ui.CreatorProfileMenuChoices (CardWithMenu.kt:71)");
            }
            Modifier modifierUo = SizeKt.Uo(modifier3, 0.7f);
            long jQZ6 = aD.w6.QZ6();
            float f3 = 0;
            float fKN = Dp.KN(f3);
            float f4 = f69981n;
            CardKt.n(AbstractC1328c.n(modifierUo, jQZ6, fKN, f4, (b.f61769v & 8) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 16) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 32) != 0 ? 1.0f : 0.0f, (b.f61769v & 64) != 0 ? 1.0f : 0.0f), RoundedCornerShapeKt.t(f4), Color.INSTANCE.KN(), 0L, null, Dp.KN(f3), ComposableLambdaKt.nr(-619487509, true, new j(onEditClicked, onOptOutClicked, onFaqClicked), composerKN, 54), composerKN, 1769856, 24);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: ka.w6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Wre.mUb(modifier3, onEditClicked, onOptOutClicked, onFaqClicked, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
