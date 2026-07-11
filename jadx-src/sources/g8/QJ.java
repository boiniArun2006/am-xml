package g8;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class QJ {

    static final class j implements Function3 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ s4 f67074O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f67075n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f67076t;

        /* JADX INFO: renamed from: g8.QJ$j$j, reason: collision with other inner class name */
        public /* synthetic */ class C0936j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[s4.values().length];
                try {
                    iArr[s4.f67124n.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[s4.f67125t.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        j(boolean z2, String str, s4 s4Var, String str2) {
            this.f67075n = z2;
            this.f67076t = str;
            this.f67074O = s4Var;
            this.J2 = str2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(ColumnScope OutlinedCard, Composer composer, int i2) {
            String strT;
            String strT2;
            String str;
            String strT3;
            String strNr;
            String strT4;
            Intrinsics.checkNotNullParameter(OutlinedCard, "$this$OutlinedCard");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1228071263, i2, -1, "com.alightcreative.monetization.stackedintro.components.PaywallTimeline.<anonymous> (PaywallTimeline.kt:49)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f3 = 16;
            Modifier modifierN = IntrinsicKt.n(PaddingKt.xMQ(companion, Dp.KN(f3)), IntrinsicSize.f17696n);
            boolean z2 = this.f67075n;
            String str2 = this.f67076t;
            s4 s4Var = this.f67074O;
            String str3 = this.J2;
            Arrangement arrangement = Arrangement.f17400n;
            Arrangement.Horizontal horizontalJ2 = arrangement.J2();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalJ2, companion2.qie(), composer, 0);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierN);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion3.n();
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
            Updater.O(composerN, measurePolicyRl, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            QJ.J2(z2, str2 != null, composer, 0);
            MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.ty(Dp.KN(f3)), companion2.gh(), composer, 6);
            int iN2 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer, companion);
            Function0 function0N2 = companion3.n();
            if (composer.getApplier() == null) {
                ComposablesKt.t();
            }
            composer.T();
            if (composer.getInserting()) {
                composer.s7N(function0N2);
            } else {
                composer.r();
            }
            Composer composerN2 = Updater.n(composer);
            Updater.O(composerN2, measurePolicyN, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            if (z2) {
                composer.eF(1834040048);
                strT = StringResources_androidKt.t(2132020217, composer, 6);
                composer.Xw();
            } else {
                composer.eF(1834165753);
                strT = StringResources_androidKt.t(2132020216, composer, 6);
                composer.Xw();
            }
            String str4 = strT;
            if (z2) {
                composer.eF(1834337741);
                strT2 = StringResources_androidKt.t(2132020215, composer, 6);
                composer.Xw();
            } else {
                composer.eF(1834466422);
                strT2 = StringResources_androidKt.t(2132020214, composer, 6);
                composer.Xw();
            }
            QJ.xMQ(null, z2, str4, strT2, ColorKt.nr(4294300786L), composer, 24576, 1);
            composer.eF(-79358260);
            if (str2 != null) {
                if (z2) {
                    composer.eF(1834928539);
                    strT4 = StringResources_androidKt.t(2132020211, composer, 6);
                    composer.Xw();
                } else {
                    composer.eF(1835043611);
                    strT4 = StringResources_androidKt.t(2132020210, composer, 6);
                    composer.Xw();
                }
                str = str2;
                QJ.xMQ(null, true, strT4, str, MaterialTheme.f26164n.n(composer, MaterialTheme.rl).getPrimary(), composer, 48, 1);
            } else {
                str = str2;
            }
            composer.Xw();
            if (str == null && !z2) {
                composer.eF(1835548539);
                strT3 = StringResources_androidKt.t(2132020210, composer, 6);
                composer.Xw();
            } else if (str == null || !z2) {
                composer.eF(1835730261);
                strT3 = StringResources_androidKt.t(2132020212, composer, 6);
                composer.Xw();
            } else {
                composer.eF(1835875093);
                strT3 = StringResources_androidKt.t(2132020213, composer, 6);
                composer.Xw();
            }
            String str5 = strT3;
            int i3 = C0936j.$EnumSwitchMapping$0[s4Var.ordinal()];
            if (i3 == 1) {
                composer.eF(-79318226);
                strNr = StringResources_androidKt.nr(2132020218, new Object[]{str3}, composer, 6);
                composer.Xw();
            } else {
                if (i3 != 2) {
                    composer.eF(-79320033);
                    composer.Xw();
                    throw new NoWhenBranchMatchedException();
                }
                composer.eF(-79314130);
                strNr = StringResources_androidKt.nr(2132020219, new Object[]{str3}, composer, 6);
                composer.Xw();
            }
            QJ.xMQ(null, true, str5, strNr, Color.INSTANCE.Uo(), composer, 24624, 1);
            composer.XQ();
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(final boolean z2, final boolean z3, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(532993557);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.n(z3) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(532993557, i3, -1, "com.alightcreative.monetization.stackedintro.components.TimelineMarker (PaywallTimeline.kt:149)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f3 = 16;
            Modifier modifierRl = IntrinsicKt.rl(PaddingKt.az(companion, 0.0f, 0.0f, Dp.KN(f3), 0.0f, 11, null), IntrinsicSize.f17696n);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierRl);
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
            Updater.O(composerN, measurePolicyUo, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            MaterialTheme materialTheme = MaterialTheme.f26164n;
            int i5 = MaterialTheme.rl;
            float f4 = 20;
            Modifier modifierViF = SizeKt.ViF(SizeKt.nr(BackgroundKt.nr(ClipKt.n(companion, materialTheme.rl(composerKN, i5).getMedium()), ColorKt.nr(4282795859L), null, 2, null), 0.0f, 1, null), Dp.KN(f4));
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion2.HI(), false);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierViF);
            Function0 function0N2 = companion3.n();
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
            Updater.O(composerN2, measurePolicyUo2, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            composerKN.XQ();
            Modifier modifierViF2 = SizeKt.ViF(SizeKt.t(BackgroundKt.nr(boxScopeInstance.n(ClipKt.n(companion, materialTheme.rl(composerKN, i5).getMedium()), companion2.rl()), materialTheme.n(composerKN, i5).getPrimary(), null, 2, null), Uo(AnimateAsStateKt.nr(z2 ? 1.0f : z3 ? 0.6f : 0.4f, null, 0.0f, null, null, composerKN, 0, 30))), Dp.KN(f4));
            MeasurePolicy measurePolicyUo3 = BoxKt.Uo(companion2.HI(), false);
            int iN3 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierViF2);
            Function0 function0N3 = companion3.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N3);
            } else {
                composerKN.r();
            }
            Composer composerN3 = Updater.n(composerKN);
            Updater.O(composerN3, measurePolicyUo3, companion3.t());
            Updater.O(composerN3, compositionLocalMapIk3, companion3.O());
            Function2 function2Rl3 = companion3.rl();
            if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                composerN3.o(Integer.valueOf(iN3));
                composerN3.az(Integer.valueOf(iN3), function2Rl3);
            }
            Updater.O(composerN3, modifierO3, companion3.nr());
            composerKN.XQ();
            Modifier modifierAz = PaddingKt.az(SizeKt.J2(companion, 0.0f, 1, null), 0.0f, Dp.KN(8), 0.0f, Dp.KN(f3), 5, null);
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.nr(), companion2.Uo(), composerKN, 54);
            int iN4 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk4 = composerKN.Ik();
            Modifier modifierO4 = ComposedModifierKt.O(composerKN, modifierAz);
            Function0 function0N4 = companion3.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N4);
            } else {
                composerKN.r();
            }
            Composer composerN4 = Updater.n(composerKN);
            Updater.O(composerN4, measurePolicyN, companion3.t());
            Updater.O(composerN4, compositionLocalMapIk4, companion3.O());
            Function2 function2Rl4 = companion3.rl();
            if (composerN4.getInserting() || !Intrinsics.areEqual(composerN4.iF(), Integer.valueOf(iN4))) {
                composerN4.o(Integer.valueOf(iN4));
                composerN4.az(Integer.valueOf(iN4), function2Rl4);
            }
            Updater.O(composerN4, modifierO4, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            IconKt.t(PainterResources_androidKt.t(2131231872, composerKN, 6), null, AlphaKt.n(companion, z2 ? 1.0f : 0.5f), 0L, composerKN, 48, 8);
            composerKN.eF(-1535851680);
            if (z3) {
                IconKt.t(PainterResources_androidKt.t(2131231873, composerKN, 6), null, null, 0L, composerKN, 48, 12);
            }
            composerKN.Xw();
            IconKt.t(PainterResources_androidKt.t(2131231874, composerKN, 6), null, null, 0L, composerKN, 48, 12);
            composerKN.XQ();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: g8.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QJ.KN(z2, z3, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(boolean z2, boolean z3, int i2, Composer composer, int i3) {
        J2(z2, z3, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(ColumnScope columnScope, Modifier modifier, s4 s4Var, boolean z2, String str, String str2, int i2, Composer composer, int i3) {
        nr(columnScope, modifier, s4Var, z2, str, str2, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(Modifier modifier, boolean z2, String str, String str2, long j2, int i2, int i3, Composer composer, int i5) {
        xMQ(modifier, z2, str, str2, j2, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final void nr(final ColumnScope columnScope, final Modifier modifier, final s4 periodicity, final boolean z2, final String str, final String price, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(periodicity, "periodicity");
        Intrinsics.checkNotNullParameter(price, "price");
        Composer composerKN = composer.KN(-1166063571);
        if ((i2 & 48) == 0) {
            i3 = (composerKN.p5(modifier) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.p5(periodicity) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.n(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.p5(str) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= composerKN.p5(price) ? 131072 : 65536;
        }
        if ((74897 & i3) == 74896 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1166063571, i3, -1, "com.alightcreative.monetization.stackedintro.components.PaywallTimeline (PaywallTimeline.kt:44)");
            }
            CardKt.O(modifier, null, CardDefaults.f24661n.rl(ColorKt.nr(4280361515L), 0L, 0L, 0L, composerKN, (CardDefaults.rl << 12) | 6, 14), null, null, ComposableLambdaKt.nr(-1228071263, true, new j(z2, str, periodicity, price), composerKN, 54), composerKN, ((i3 >> 3) & 14) | 196608, 26);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: g8.Xo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QJ.O(columnScope, modifier, periodicity, z2, str, price, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void xMQ(Modifier modifier, final boolean z2, final String str, final String str2, final long j2, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        String str3;
        String str4;
        int i7;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1576472260);
        int i8 = i3 & 1;
        if (i8 != 0) {
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
            i5 |= composerKN.n(z2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            str3 = str;
        } else {
            str3 = str;
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.p5(str3) ? 256 : 128;
            }
        }
        if ((i3 & 8) == 0) {
            if ((i2 & 3072) == 0) {
                str4 = str2;
                i5 |= composerKN.p5(str4) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i5 |= composerKN.nr(j2) ? 16384 : 8192;
            }
            i7 = i5;
            if ((i7 & 9363) == 9362 || !composerKN.xMQ()) {
                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(1576472260, i7, -1, "com.alightcreative.monetization.stackedintro.components.TimelineText (PaywallTimeline.kt:126)");
                }
                Modifier modifierN = AlphaKt.n(modifier4, !z2 ? 1.0f : 0.5f);
                MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0 function0N = companion.n();
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
                Updater.O(composerN, measurePolicyN, companion.t());
                Updater.O(composerN, compositionLocalMapIk, companion.O());
                function2Rl = companion.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion.nr());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                MaterialTheme materialTheme = MaterialTheme.f26164n;
                int i9 = MaterialTheme.rl;
                TextStyle titleMedium = materialTheme.t(composerKN, i9).getTitleMedium();
                FontWeight.Companion companion2 = FontWeight.INSTANCE;
                TextKt.t(str3, null, 0L, 0L, null, companion2.J2(), null, 0L, null, null, 0L, 0, false, 0, 0, null, titleMedium, composerKN, ((i7 >> 6) & 14) | 196608, 0, 65502);
                TextStyle titleSmall = materialTheme.t(composerKN, i9).getTitleSmall();
                composer2 = composerKN;
                TextKt.t(str4, null, !z2 ? j2 : Color.INSTANCE.Uo(), 0L, null, !z2 ? companion2.J2() : companion2.t(), null, 0L, null, null, 0L, 0, false, 0, 0, null, titleSmall, composer2, (i7 >> 9) & 14, 0, 65498);
                composer2.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier4;
            } else {
                composerKN.wTp();
                composer2 = composerKN;
                modifier3 = modifier2;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: g8.eO
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return QJ.mUb(modifier3, z2, str, str2, j2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 3072;
        str4 = str2;
        if ((i3 & 16) == 0) {
        }
        i7 = i5;
        if ((i7 & 9363) == 9362) {
            if (i8 == 0) {
            }
            if (ComposerKt.v()) {
            }
            Modifier modifierN2 = AlphaKt.n(modifier4, !z2 ? 1.0f : 0.5f);
            MeasurePolicy measurePolicyN2 = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierN2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N2 = companion3.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyN2, companion3.t());
            Updater.O(composerN, compositionLocalMapIk2, companion3.O());
            function2Rl = companion3.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO2, companion3.nr());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                MaterialTheme materialTheme2 = MaterialTheme.f26164n;
                int i92 = MaterialTheme.rl;
                TextStyle titleMedium2 = materialTheme2.t(composerKN, i92).getTitleMedium();
                FontWeight.Companion companion22 = FontWeight.INSTANCE;
                TextKt.t(str3, null, 0L, 0L, null, companion22.J2(), null, 0L, null, null, 0L, 0, false, 0, 0, null, titleMedium2, composerKN, ((i7 >> 6) & 14) | 196608, 0, 65502);
                TextStyle titleSmall2 = materialTheme2.t(composerKN, i92).getTitleSmall();
                composer2 = composerKN;
                TextKt.t(str4, null, !z2 ? j2 : Color.INSTANCE.Uo(), 0L, null, !z2 ? companion22.J2() : companion22.t(), null, 0L, null, null, 0L, 0, false, 0, 0, null, titleSmall2, composer2, (i7 >> 9) & 14, 0, 65498);
                composer2.XQ();
                if (ComposerKt.v()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    private static final float Uo(State state) {
        return ((Number) state.getValue()).floatValue();
    }
}
