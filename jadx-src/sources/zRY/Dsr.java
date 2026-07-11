package zRY;

import Dj7.AbstractC1328c;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.b;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f76465n = Dp.KN(12);

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ tN.n f76466n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ eQ.fuX f76467t;

        j(tN.n nVar, eQ.fuX fux) {
            this.f76466n = nVar;
            this.f76467t = fux;
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
                ComposerKt.p5(1056087410, i2, -1, "com.alightcreative.app.motion.premade.ui.PremadeContentItemCard.<anonymous> (PremadeContentItemCard.kt:54)");
            }
            tN.n nVar = this.f76466n;
            eQ.fuX fux = this.f76467t;
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, companion);
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
            Updater.O(composerN, measurePolicyUo, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            Modifier modifierNr = BackgroundKt.nr(ClipKt.n(companion, RoundedCornerShapeKt.t(Dsr.f76465n)), Color.INSTANCE.KN(), null, 2, null);
            Arrangement arrangement = Arrangement.f17400n;
            MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.Uo(), companion2.gh(), composer, 0);
            int iN2 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer, modifierNr);
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
            ImageKt.n(c0.fuX.nr(nVar.O(), fux, PainterResources_androidKt.t(2131232192, composer, 6), PainterResources_androidKt.t(2131232192, composer, 6), null, null, null, null, null, 0, null, composer, 0, 0, 2032), null, ColumnScope.rl(ColumnScopeInstance.f17468n, SizeKt.KN(companion, 0.0f, 1, null), 1.0f, false, 2, null), null, ContentScale.INSTANCE.n(), 0.0f, null, composer, 24624, 104);
            Modifier modifierXMQ = PaddingKt.xMQ(companion, Dp.KN(12));
            MeasurePolicy measurePolicyN2 = ColumnKt.n(arrangement.Uo(), companion2.gh(), composer, 0);
            int iN3 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk3 = composer.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composer, modifierXMQ);
            Function0 function0N3 = companion3.n();
            if (composer.getApplier() == null) {
                ComposablesKt.t();
            }
            composer.T();
            if (composer.getInserting()) {
                composer.s7N(function0N3);
            } else {
                composer.r();
            }
            Composer composerN3 = Updater.n(composer);
            Updater.O(composerN3, measurePolicyN2, companion3.t());
            Updater.O(composerN3, compositionLocalMapIk3, companion3.O());
            Function2 function2Rl3 = companion3.rl();
            if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                composerN3.o(Integer.valueOf(iN3));
                composerN3.az(Integer.valueOf(iN3), function2Rl3);
            }
            Updater.O(composerN3, modifierO3, companion3.nr());
            eO.rl((tN.CN3) CollectionsKt.firstOrNull(nVar.J2()), nVar.t(), composer, 0);
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(4)), composer, 6);
            Modifier modifierXMQ2 = SizeKt.xMQ(companion, Dp.KN(34));
            String strNr = nVar.nr();
            TextStyle textStyleT = TextStyle.t(H9N.j.f3810n.rl(composer, 6).ViF(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), null, 0, 0, null, 16252927, null);
            TextKt.t(strNr, modifierXMQ2, aD.w6.F(), 0L, null, null, null, 0L, null, TextAlign.KN(TextAlign.INSTANCE.J2()), 0L, TextOverflow.INSTANCE.rl(), false, 2, 0, null, textStyleT, composer, 432, 3120, 54776);
            composer.XQ();
            composer.XQ();
            ImageKt.n(PainterResources_androidKt.t(2131231891, composer, 6), null, SizeKt.Z(PaddingKt.xMQ(boxScopeInstance.n(companion, companion2.ty()), Dp.KN(8)), Dp.KN(20)), null, null, 0.0f, null, composer, 48, b.f61769v);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(Modifier modifier, tN.n nVar, eQ.fuX fux, Function0 function0, int i2, int i3, Composer composer, int i5) {
        nr(modifier, nVar, fux, function0, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(final Modifier modifier, final tN.n item, final eQ.fuX imageLoader, Function0 function0, Composer composer, final int i2, final int i3) {
        int i5;
        final Function0 function02;
        Function0 function03;
        final Function0 function04;
        boolean z2;
        Object objIF;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Composer composerKN = composer.KN(-640757352);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(item) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(imageLoader) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 == 0) {
            if ((i2 & 3072) == 0) {
                function02 = function0;
                i5 |= composerKN.E2(function02) ? 2048 : 1024;
            }
            if ((i5 & 1171) == 1170 || !composerKN.xMQ()) {
                if (i7 == 0) {
                    composerKN.eF(-1628786436);
                    Object objIF2 = composerKN.iF();
                    if (objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new Function0() { // from class: zRY.Wre
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Dsr.O();
                            }
                        };
                        composerKN.o(objIF2);
                    }
                    function03 = (Function0) objIF2;
                    composerKN.Xw();
                } else {
                    function03 = function02;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-640757352, i5, -1, "com.alightcreative.app.motion.premade.ui.PremadeContentItemCard (PremadeContentItemCard.kt:40)");
                }
                long jQZ6 = aD.w6.QZ6();
                float f3 = 0;
                function04 = function03;
                float fKN = Dp.KN(f3);
                float f4 = f76465n;
                z2 = false;
                Modifier modifierN = AbstractC1328c.n(modifier, jQZ6, fKN, f4, (b.f61769v & 8) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 16) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 32) != 0 ? 1.0f : 0.0f, (b.f61769v & 64) != 0 ? 1.0f : 0.0f);
                float fKN2 = Dp.KN(f3);
                RoundedCornerShape roundedCornerShapeT = RoundedCornerShapeKt.t(f4);
                composerKN.eF(-1628775807);
                if ((i5 & 7168) == 2048) {
                    z2 = true;
                }
                objIF = composerKN.iF();
                if (!z2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: zRY.CN3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Dsr.J2(function04);
                        }
                    };
                    composerKN.o(objIF);
                }
                composerKN.Xw();
                composer2 = composerKN;
                CardKt.rl((Function0) objIF, modifierN, false, roundedCornerShapeT, 0L, 0L, null, fKN2, null, ComposableLambdaKt.nr(1056087410, true, new j(item, imageLoader), composerKN, 54), composer2, 817889280, 372);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                function02 = function04;
            } else {
                composerKN.wTp();
                composer2 = composerKN;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: zRY.fuX
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Dsr.Uo(modifier, item, imageLoader, function02, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 3072;
        function02 = function0;
        if ((i5 & 1171) == 1170) {
            if (i7 == 0) {
            }
            if (ComposerKt.v()) {
            }
            long jQZ62 = aD.w6.QZ6();
            float f32 = 0;
            function04 = function03;
            float fKN3 = Dp.KN(f32);
            float f42 = f76465n;
            z2 = false;
            Modifier modifierN2 = AbstractC1328c.n(modifier, jQZ62, fKN3, f42, (b.f61769v & 8) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 16) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 32) != 0 ? 1.0f : 0.0f, (b.f61769v & 64) != 0 ? 1.0f : 0.0f);
            float fKN22 = Dp.KN(f32);
            RoundedCornerShape roundedCornerShapeT2 = RoundedCornerShapeKt.t(f42);
            composerKN.eF(-1628775807);
            if ((i5 & 7168) == 2048) {
            }
            objIF = composerKN.iF();
            if (!z2) {
                objIF = new Function0() { // from class: zRY.CN3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Dsr.J2(function04);
                    }
                };
                composerKN.o(objIF);
                composerKN.Xw();
                composer2 = composerKN;
                CardKt.rl((Function0) objIF, modifierN2, false, roundedCornerShapeT2, 0L, 0L, null, fKN22, null, ComposableLambdaKt.nr(1056087410, true, new j(item, imageLoader), composerKN, 54), composer2, 817889280, 372);
                if (ComposerKt.v()) {
                }
                function02 = function04;
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
