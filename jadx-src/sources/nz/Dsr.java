package nz;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import c8G.Fsz.qwlyMfUJj;
import com.alightcreative.app.motion.templates.Template;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class Dsr {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f71273n;

        j(boolean z2) {
            this.f71273n = z2;
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
                ComposerKt.p5(-1838267580, i2, -1, "com.alightcreative.app.motion.activities.main.templatepreview.composables.HeaderSection.<anonymous>.<anonymous>.<anonymous> (HeaderSection.kt:63)");
            }
            Painter painterT = PainterResources_androidKt.t(this.f71273n ? 2131231552 : 2131231553, composer, 0);
            String strT = StringResources_androidKt.t(2132020083, composer, 6);
            composer.eF(1939453291);
            long jCk = this.f71273n ? ((aF1.j) composer.ty(aF1.w6.t())).ck() : Color.INSTANCE.KN();
            composer.Xw();
            IconKt.t(painterT, strT, SizeKt.Z(Modifier.INSTANCE, Dp.KN(24)), jCk, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    static final class n implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f71274n;

        n(List list) {
            this.f71274n = list;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((FlowRowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(FlowRowScope FlowRow, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-562488655, i2, -1, "com.alightcreative.app.motion.activities.main.templatepreview.composables.HeaderSection.<anonymous>.<anonymous> (HeaderSection.kt:82)");
            }
            Iterator it = this.f71274n.iterator();
            while (it.hasNext()) {
                String value = ((Template.Tag) it.next()).getValue();
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                String upperCase = value.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                TextKt.t(upperCase, PaddingKt.xMQ(BackgroundKt.t(Modifier.INSTANCE, aD.w6.HV(), RoundedCornerShapeKt.t(Dp.KN(6))), Dp.KN(8)), aD.w6.EWS(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer, 6).aYN(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65528);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final String str, aC aCVar, boolean z2, final Function0 onBackClicked, final Function0 onSaveClicked, List list, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        Composer composer2;
        boolean z3;
        Object obj;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        aC aCVar2 = aCVar;
        List tags = list;
        Intrinsics.checkNotNullParameter(str, qwlyMfUJj.YESxMdTEfqljy);
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(onSaveClicked, "onSaveClicked");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Composer composerKN = composer.KN(669932566);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(str) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(aCVar2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.n(z2) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(onBackClicked) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 |= composerKN.E2(onSaveClicked) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i5 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i5 |= composerKN.E2(tags) ? 131072 : 65536;
        }
        int i7 = i3 & 64;
        if (i7 == 0) {
            if ((1572864 & i2) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 1048576 : 524288;
            }
            if ((i5 & 599187) == 599186 || !composerKN.xMQ()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(669932566, i5, -1, "com.alightcreative.app.motion.activities.main.templatepreview.composables.HeaderSection (HeaderSection.kt:38)");
                }
                Arrangement arrangement = Arrangement.f17400n;
                Arrangement.HorizontalOrVertical horizontalOrVerticalTy = arrangement.ty(Dp.KN(12));
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalTy, companion.gh(), composerKN, 6);
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
                Updater.O(composerN, measurePolicyN, companion2.t());
                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                function2Rl = companion2.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion2.nr());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                Arrangement.HorizontalOrVertical horizontalOrVerticalNr = arrangement.nr();
                Alignment.Vertical verticalXMQ = companion.xMQ();
                Modifier modifier5 = modifier4;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierKN = SizeKt.KN(companion3, 0.0f, 1, null);
                MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalNr, verticalXMQ, composerKN, 54);
                iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierKN);
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
                Updater.O(composerN2, measurePolicyRl, companion2.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
                function2Rl2 = companion2.rl();
                if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion2.nr());
                RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                int i8 = i5;
                IconButtonKt.O(onBackClicked, companion3, false, null, null, nz.n.f71298n.n(), composerKN, ((i5 >> 9) & 14) | 196656, 28);
                TextKt.t(str, null, Color.INSTANCE.KN(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, 6).te(), composerKN, (i8 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
                composer2 = composerKN;
                z3 = z2;
                IconButtonKt.O(onSaveClicked, null, false, null, null, ComposableLambdaKt.nr(-1838267580, true, new j(z3), composer2, 54), composer2, ((i8 >> 12) & 14) | 196608, 30);
                composer2.XQ();
                composer2.eF(-1948293158);
                aCVar2 = aCVar;
                if (aCVar2 != null) {
                    obj = null;
                } else {
                    obj = null;
                    o.rl(aCVar2, null, composer2, 0, 2);
                    Unit unit = Unit.INSTANCE;
                }
                composer2.Xw();
                float f3 = 4;
                tags = list;
                FlowLayoutKt.nr(SizeKt.KN(companion3, 0.0f, 1, obj), arrangement.ty(Dp.KN(f3)), arrangement.ty(Dp.KN(f3)), null, 0, 0, ComposableLambdaKt.nr(-562488655, true, new n(tags), composer2, 54), composer2, 1573302, 56);
                composer2.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier5;
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
                composer2 = composerKN;
                z3 = z2;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                final aC aCVar3 = aCVar2;
                final boolean z4 = z3;
                final List list2 = tags;
                scopeUpdateScopeGh.n(new Function2() { // from class: nz.fuX
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return Dsr.t(str, aCVar3, z4, onBackClicked, onSaveClicked, list2, modifier3, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 1572864;
        modifier2 = modifier;
        if ((i5 & 599187) == 599186) {
            if (i7 == 0) {
            }
            if (ComposerKt.v()) {
            }
            Arrangement arrangement2 = Arrangement.f17400n;
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy2 = arrangement2.ty(Dp.KN(12));
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN2 = ColumnKt.n(horizontalOrVerticalTy2, companion4.gh(), composerKN, 6);
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
            Updater.O(composerN, measurePolicyN2, companion22.t());
            Updater.O(composerN, compositionLocalMapIk3, companion22.O());
            function2Rl = companion22.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO3, companion22.nr());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                Arrangement.HorizontalOrVertical horizontalOrVerticalNr2 = arrangement2.nr();
                Alignment.Vertical verticalXMQ2 = companion4.xMQ();
                Modifier modifier52 = modifier4;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierKN2 = SizeKt.KN(companion32, 0.0f, 1, null);
                MeasurePolicy measurePolicyRl2 = RowKt.rl(horizontalOrVerticalNr2, verticalXMQ2, composerKN, 54);
                iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                Modifier modifierO22 = ComposedModifierKt.O(composerKN, modifierKN2);
                Function0 function0N22 = companion22.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN2 = Updater.n(composerKN);
                Updater.O(composerN2, measurePolicyRl2, companion22.t());
                Updater.O(composerN2, compositionLocalMapIk22, companion22.O());
                function2Rl2 = companion22.rl();
                if (!composerN2.getInserting()) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    Updater.O(composerN2, modifierO22, companion22.nr());
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                    int i82 = i5;
                    IconButtonKt.O(onBackClicked, companion32, false, null, null, nz.n.f71298n.n(), composerKN, ((i5 >> 9) & 14) | 196656, 28);
                    TextKt.t(str, null, Color.INSTANCE.KN(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, 6).te(), composerKN, (i82 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
                    composer2 = composerKN;
                    z3 = z2;
                    IconButtonKt.O(onSaveClicked, null, false, null, null, ComposableLambdaKt.nr(-1838267580, true, new j(z3), composer2, 54), composer2, ((i82 >> 12) & 14) | 196608, 30);
                    composer2.XQ();
                    composer2.eF(-1948293158);
                    aCVar2 = aCVar;
                    if (aCVar2 != null) {
                    }
                    composer2.Xw();
                    float f32 = 4;
                    tags = list;
                    FlowLayoutKt.nr(SizeKt.KN(companion32, 0.0f, 1, obj), arrangement2.ty(Dp.KN(f32)), arrangement2.ty(Dp.KN(f32)), null, 0, 0, ComposableLambdaKt.nr(-562488655, true, new n(tags), composer2, 54), composer2, 1573302, 56);
                    composer2.XQ();
                    if (ComposerKt.v()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(String str, aC aCVar, boolean z2, Function0 function0, Function0 function02, List list, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        rl(str, aCVar, z2, function0, function02, list, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }
}
