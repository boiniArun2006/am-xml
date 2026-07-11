package Vil;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class C {

    static final class j implements Function2 {
        final /* synthetic */ List J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f11042O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f11043n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f11044t;

        /* JADX INFO: renamed from: Vil.C$j$j, reason: collision with other inner class name */
        static final class C0394j implements Function2 {
            final /* synthetic */ List J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ boolean f11045O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Function0 f11046n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function0 f11047t;

            C0394j(Function0 function0, Function0 function02, boolean z2, List list) {
                this.f11046n = function0;
                this.f11047t = function02;
                this.f11045O = z2;
                this.J2 = list;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                n((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void n(Composer composer, int i2) {
                String strRl;
                if ((i2 & 3) == 2 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(2074351405, i2, -1, "com.alightcreative.maineditor.presetpreview.ui.components.PresetsDeleteDialog.<anonymous>.<anonymous> (PresetDeleteDialog.kt:45)");
                }
                Function0 function0 = this.f11046n;
                Function0 function02 = this.f11047t;
                boolean z2 = this.f11045O;
                List list = this.J2;
                Modifier.Companion companion = Modifier.INSTANCE;
                Arrangement arrangement = Arrangement.f17400n;
                Arrangement.Vertical verticalUo = arrangement.Uo();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion2.gh(), composer, 0);
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
                Updater.O(composerN, measurePolicyN, companion3.t());
                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                Function2 function2Rl = companion3.rl();
                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion3.nr());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                Modifier modifierXMQ = PaddingKt.xMQ(SizeKt.KN(companion, 0.0f, 1, null), Dp.KN(16));
                MeasurePolicy measurePolicyN2 = ColumnKt.n(arrangement.Uo(), companion2.Uo(), composer, 48);
                int iN2 = ComposablesKt.n(composer, 0);
                CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composer, modifierXMQ);
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
                Updater.O(composerN2, measurePolicyN2, companion3.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                Function2 function2Rl2 = companion3.rl();
                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion3.nr());
                if (z2) {
                    composer.eF(617991806);
                    strRl = StringResources_androidKt.t(2132019895, composer, 6);
                    composer.Xw();
                } else {
                    composer.eF(618112706);
                    strRl = StringResources_androidKt.rl(2131886123, list.size(), new Object[]{Integer.valueOf(list.size())}, composer, 6);
                    composer.Xw();
                }
                H9N.j jVar = H9N.j.f3810n;
                TextKt.t(strRl, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).gh(), composer, 0, 0, 65534);
                SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(2)), composer, 6);
                TextKt.t(GWY.j.rl(list, 15, null, null, 12, null), null, 0L, 0L, null, null, null, 0L, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).Ik(), composer, 0, 0, 65022);
                composer.XQ();
                float f3 = (float) 0.5d;
                BoxKt.n(BackgroundKt.nr(SizeKt.KN(SizeKt.xMQ(companion, Dp.KN(f3)), 0.0f, 1, null), aD.w6.Rl(), null, 2, null), composer, 6);
                float f4 = 44;
                Modifier modifierXMQ2 = SizeKt.xMQ(SizeKt.KN(companion, 0.0f, 1, null), Dp.KN(f4));
                Vil.j jVar2 = Vil.j.f11159n;
                ButtonKt.t(function0, modifierXMQ2, false, null, null, null, null, null, null, jVar2.n(), composer, 805306416, 508);
                BoxKt.n(BackgroundKt.nr(SizeKt.KN(SizeKt.xMQ(companion, Dp.KN(f3)), 0.0f, 1, null), aD.w6.Rl(), null, 2, null), composer, 6);
                ButtonKt.t(function02, SizeKt.xMQ(SizeKt.KN(companion, 0.0f, 1, null), Dp.KN(f4)), false, null, null, null, null, null, null, jVar2.rl(), composer, 805306416, 508);
                composer.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        j(Function0 function0, Function0 function02, boolean z2, List list) {
            this.f11043n = function0;
            this.f11044t = function02;
            this.f11042O = z2;
            this.J2 = list;
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
                ComposerKt.p5(-481307472, i2, -1, "com.alightcreative.maineditor.presetpreview.ui.components.PresetsDeleteDialog.<anonymous> (PresetDeleteDialog.kt:40)");
            }
            CardKt.n(SizeKt.g(Modifier.INSTANCE, 0.0f, Dp.KN(273), 1, null), RoundedCornerShapeKt.t(Dp.KN(14)), aD.w6.ul(), 0L, null, 0.0f, ComposableLambdaKt.nr(2074351405, true, new C0394j(this.f11043n, this.f11044t, this.f11042O, this.J2), composer, 54), composer, 1573254, 56);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final void rl(final List titles, final boolean z2, Function0 onCancel, final Function0 onConfirm, Composer composer, final int i2) {
        int i3;
        Function0 function0;
        Intrinsics.checkNotNullParameter(titles, "titles");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Composer composerKN = composer.KN(259957607);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(titles) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.n(z2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onCancel) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(onConfirm) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            function0 = onCancel;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(259957607, i3, -1, "com.alightcreative.maineditor.presetpreview.ui.components.PresetsDeleteDialog (PresetDeleteDialog.kt:38)");
            }
            function0 = onCancel;
            AndroidDialog_androidKt.n(function0, null, ComposableLambdaKt.nr(-481307472, true, new j(onConfirm, onCancel, z2, titles), composerKN, 54), composerKN, ((i3 >> 6) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            final Function0 function02 = function0;
            scopeUpdateScopeGh.n(new Function2() { // from class: Vil.aC
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C.t(titles, z2, function02, onConfirm, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(List list, boolean z2, Function0 function0, Function0 function02, int i2, Composer composer, int i3) {
        rl(list, z2, function0, function02, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
