package nN;

import Dj7.hQ;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.FixedScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class eO {

    static final class j implements Function2 {
        final /* synthetic */ long J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ long f71080O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f71081n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f71082t;

        /* JADX INFO: renamed from: nN.eO$j$j, reason: collision with other inner class name */
        static final class C1066j implements Function2 {
            final /* synthetic */ long J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ long f71083O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Function0 f71084n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function0 f71085t;

            C1066j(Function0 function0, Function0 function02, long j2, long j3) {
                this.f71084n = function0;
                this.f71085t = function02;
                this.f71083O = j2;
                this.J2 = j3;
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
                    ComposerKt.p5(958302026, i2, -1, "com.alightcreative.app.motion.activities.creatorprogram.optin.CreatorStatusCard.<anonymous>.<anonymous> (CreatorStatusCard.kt:39)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierKN = SizeKt.KN(companion, 0.0f, 1, null);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Alignment.Horizontal horizontalUo = companion2.Uo();
                Function0 function0 = this.f71084n;
                Function0 function02 = this.f71085t;
                long j2 = this.f71083O;
                long j3 = this.J2;
                Arrangement arrangement = Arrangement.f17400n;
                MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.Uo(), horizontalUo, composer, 48);
                int iN = ComposablesKt.n(composer, 0);
                CompositionLocalMap compositionLocalMapIk = composer.Ik();
                Modifier modifierO = ComposedModifierKt.O(composer, modifierKN);
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
                Updater.O(composerN, measurePolicyN, companion3.t());
                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                Function2 function2Rl = companion3.rl();
                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion3.nr());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                hQ.rl(StringResources_androidKt.t(2132017542, composer, 6), columnScopeInstance.t(companion, companion2.mUb()), null, composer, 0, 4);
                float f3 = 4;
                SpacerKt.n(SizeKt.Z(companion, Dp.KN(f3)), composer, 6);
                String strT = StringResources_androidKt.t(2132017602, composer, 6);
                H9N.j jVar = H9N.j.f3810n;
                TextStyle textStyleG = jVar.rl(composer, 6).g();
                long jS2 = aD.w6.s();
                TextAlign.Companion companion4 = TextAlign.INSTANCE;
                TextKt.t(strT, null, jS2, 0L, null, null, null, 0L, null, TextAlign.KN(companion4.n()), 0L, 0, false, 0, 0, null, textStyleG, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65018);
                SpacerKt.n(SizeKt.Z(companion, Dp.KN(f3)), composer, 6);
                TextKt.t(StringResources_androidKt.t(2132017597, composer, 6), null, aD.w6.s(), 0L, null, null, null, 0L, null, TextAlign.KN(companion4.n()), 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).s7N(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65018);
                float f4 = 16;
                SpacerKt.n(SizeKt.Z(companion, Dp.KN(f4)), composer, 6);
                Modifier modifierN = IntrinsicKt.n(SizeKt.KN(companion, 0.0f, 1, null), IntrinsicSize.f17697t);
                MeasurePolicy measurePolicyRl = RowKt.rl(arrangement.J2(), companion2.qie(), composer, 0);
                int iN2 = ComposablesKt.n(composer, 0);
                CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composer, modifierN);
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
                Updater.O(composerN2, measurePolicyRl, companion3.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                Function2 function2Rl2 = companion3.rl();
                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion3.nr());
                RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                eO.O(j2, StringResources_androidKt.t(2132017596, composer, 6), 2131232003, RowScope.rl(rowScopeInstance, SizeKt.KN(companion, 0.0f, 1, null), 1.0f, false, 2, null), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                SpacerKt.n(SizeKt.Z(companion, Dp.KN(8)), composer, 6);
                eO.O(j3, StringResources_androidKt.t(2132017598, composer, 6), 2131232004, RowScope.rl(rowScopeInstance, SizeKt.KN(companion, 0.0f, 1, null), 1.0f, false, 2, null), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                composer.XQ();
                SpacerKt.n(SizeKt.Z(companion, Dp.KN(f4)), composer, 6);
                Dj7.eO.J2(function0, StringResources_androidKt.t(2132017595, composer, 6), SizeKt.KN(companion, 0.0f, 1, null), null, null, null, 0, 0, 0.0f, null, null, null, false, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 8184);
                SpacerKt.n(SizeKt.Z(companion, Dp.KN(12)), composer, 6);
                cg.z.t(StringResources_androidKt.t(2132017543, composer, 6), function02, columnScopeInstance.t(companion, companion2.Uo()), composer, 0, 0);
                composer.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        j(Function0 function0, Function0 function02, long j2, long j3) {
            this.f71081n = function0;
            this.f71082t = function02;
            this.f71080O = j2;
            this.J2 = j3;
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
                ComposerKt.p5(-1046216, i2, -1, "com.alightcreative.app.motion.activities.creatorprogram.optin.CreatorStatusCard.<anonymous> (CreatorStatusCard.kt:38)");
            }
            Dj7.QJ.rl(ComposableLambdaKt.nr(958302026, true, new C1066j(this.f71081n, this.f71082t, this.f71080O, this.J2), composer, 54), composer, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final void t(final long j2, final long j3, final Function0 onClaimRewardButtonClick, final Function0 onFAQsButtonClick, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onClaimRewardButtonClick, "onClaimRewardButtonClick");
        Intrinsics.checkNotNullParameter(onFAQsButtonClick, "onFAQsButtonClick");
        Composer composerKN = composer.KN(-1064446495);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.nr(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.nr(j3) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onClaimRewardButtonClick) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(onFAQsButtonClick) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1064446495, i3, -1, "com.alightcreative.app.motion.activities.creatorprogram.optin.CreatorStatusCard (CreatorStatusCard.kt:36)");
            }
            H9N.CN3.nr(ComposableLambdaKt.nr(-1046216, true, new j(onClaimRewardButtonClick, onFAQsButtonClick, j2, j3), composerKN, 54), composerKN, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: nN.Pl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return eO.nr(j2, j3, onClaimRewardButtonClick, onFAQsButtonClick, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(long j2, String str, int i2, Modifier modifier, int i3, int i5, Composer composer, int i7) {
        O(j2, str, i2, modifier, composer, RecomposeScopeImplKt.n(i3 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(final long j2, final String str, final int i2, Modifier modifier, Composer composer, final int i3, final int i5) {
        int i7;
        String str2;
        int i8;
        Modifier modifier2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1400546039);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.nr(j2) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                str2 = str;
                i7 |= composerKN.p5(str2) ? 32 : 16;
            }
            if ((i5 & 4) == 0) {
                i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i7 |= composerKN.t(i2) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    modifier2 = modifier;
                    i7 |= composerKN.p5(modifier2) ? 2048 : 1024;
                }
                if ((i7 & 1171) == 1170 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier3 = modifier2;
                    composer2 = composerKN;
                } else {
                    Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1400546039, i7, -1, "com.alightcreative.app.motion.activities.creatorprogram.optin.StatusItem (CreatorStatusCard.kt:108)");
                    }
                    Alignment.Companion companion = Alignment.INSTANCE;
                    Alignment.Vertical verticalXMQ = companion.xMQ();
                    Arrangement arrangement = Arrangement.f17400n;
                    MeasurePolicy measurePolicyRl = RowKt.rl(arrangement.J2(), verticalXMQ, composerKN, 48);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composerKN, modifier4);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
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
                    Updater.O(composerN, measurePolicyRl, companion2.t());
                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                    function2Rl = companion2.rl();
                    if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion2.nr());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                    Painter painterT = PainterResources_androidKt.t(i2, composerKN, (i7 >> 6) & 14);
                    FixedScale fixedScaleUo = ContentScale.INSTANCE.Uo();
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    int i9 = i7;
                    ImageKt.n(painterT, null, SizeKt.Z(companion3, Dp.KN(24)), null, fixedScaleUo, 0.0f, null, composerKN, 25008, 104);
                    SpacerKt.n(SizeKt.Z(companion3, Dp.KN(8)), composerKN, 6);
                    MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.Uo(), companion.gh(), composerKN, 0);
                    iN2 = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composerKN, companion3);
                    Function0 function0N2 = companion2.n();
                    if (composerKN.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                        composerKN.r();
                    } else {
                        composerKN.s7N(function0N2);
                    }
                    composerN2 = Updater.n(composerKN);
                    Updater.O(composerN2, measurePolicyN, companion2.t());
                    Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
                    function2Rl2 = companion2.rl();
                    if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                        composerN2.o(Integer.valueOf(iN2));
                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    }
                    Updater.O(composerN2, modifierO2, companion2.nr());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                    String strValueOf = String.valueOf(j2);
                    Modifier modifierKN = SizeKt.KN(companion3, 0.0f, 1, null);
                    H9N.j jVar = H9N.j.f3810n;
                    composer2 = composerKN;
                    TextKt.t(strValueOf, modifierKN, aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composerKN, 6).nY(), composer2, 432, 0, 65528);
                    TextKt.t(str2, SizeKt.KN(companion3, 0.0f, 1, null), aD.w6.Lp6(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composer2, 6).X(), composer2, ((i9 >> 3) & 14) | 432, 0, 65528);
                    composer2.XQ();
                    composer2.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier3 = modifier4;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: nN.Xo
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return eO.J2(j2, str, i2, modifier3, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i7 |= 3072;
            modifier2 = modifier;
            if ((i7 & 1171) == 1170) {
                if (i8 == 0) {
                }
                if (ComposerKt.v()) {
                }
                Alignment.Companion companion4 = Alignment.INSTANCE;
                Alignment.Vertical verticalXMQ2 = companion4.xMQ();
                Arrangement arrangement2 = Arrangement.f17400n;
                MeasurePolicy measurePolicyRl2 = RowKt.rl(arrangement2.J2(), verticalXMQ2, composerKN, 48);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifier4);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0 function0N3 = companion22.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyRl2, companion22.t());
                Updater.O(composerN, compositionLocalMapIk3, companion22.O());
                function2Rl = companion22.rl();
                if (!composerN.getInserting()) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                    Updater.O(composerN, modifierO3, companion22.nr());
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                    Painter painterT2 = PainterResources_androidKt.t(i2, composerKN, (i7 >> 6) & 14);
                    FixedScale fixedScaleUo2 = ContentScale.INSTANCE.Uo();
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    int i92 = i7;
                    ImageKt.n(painterT2, null, SizeKt.Z(companion32, Dp.KN(24)), null, fixedScaleUo2, 0.0f, null, composerKN, 25008, 104);
                    SpacerKt.n(SizeKt.Z(companion32, Dp.KN(8)), composerKN, 6);
                    MeasurePolicy measurePolicyN2 = ColumnKt.n(arrangement2.Uo(), companion4.gh(), composerKN, 0);
                    iN2 = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                    Modifier modifierO22 = ComposedModifierKt.O(composerKN, companion32);
                    Function0 function0N22 = companion22.n();
                    if (composerKN.getApplier() == null) {
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                    }
                    composerN2 = Updater.n(composerKN);
                    Updater.O(composerN2, measurePolicyN2, companion22.t());
                    Updater.O(composerN2, compositionLocalMapIk22, companion22.O());
                    function2Rl2 = companion22.rl();
                    if (!composerN2.getInserting()) {
                        composerN2.o(Integer.valueOf(iN2));
                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                        Updater.O(composerN2, modifierO22, companion22.nr());
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                        String strValueOf2 = String.valueOf(j2);
                        Modifier modifierKN2 = SizeKt.KN(companion32, 0.0f, 1, null);
                        H9N.j jVar2 = H9N.j.f3810n;
                        composer2 = composerKN;
                        TextKt.t(strValueOf2, modifierKN2, aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar2.rl(composerKN, 6).nY(), composer2, 432, 0, 65528);
                        TextKt.t(str2, SizeKt.KN(companion32, 0.0f, 1, null), aD.w6.Lp6(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar2.rl(composer2, 6).X(), composer2, ((i92 >> 3) & 14) | 432, 0, 65528);
                        composer2.XQ();
                        composer2.XQ();
                        if (ComposerKt.v()) {
                        }
                        modifier3 = modifier4;
                    }
                }
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        str2 = str;
        if ((i5 & 4) == 0) {
        }
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        modifier2 = modifier;
        if ((i7 & 1171) == 1170) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(long j2, long j3, Function0 function0, Function0 function02, int i2, Composer composer, int i3) {
        t(j2, j3, function0, function02, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
