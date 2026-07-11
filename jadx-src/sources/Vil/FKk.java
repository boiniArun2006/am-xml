package Vil;

import Vil.FKk;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.CardKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class FKk {

    static final class j implements Function2 {
        final /* synthetic */ Function1 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f11048O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MutableState f11049n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f11050t;

        /* JADX INFO: renamed from: Vil.FKk$j$j, reason: collision with other inner class name */
        static final class C0395j implements Function2 {
            final /* synthetic */ Function1 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Function0 f11051O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ MutableState f11052n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f11053t;

            C0395j(MutableState mutableState, String str, Function0 function0, Function1 function1) {
                this.f11052n = mutableState;
                this.f11053t = str;
                this.f11051O = function0;
                this.J2 = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit nr(MutableState mutableState, String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                FKk.J2(mutableState, it);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                t((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void t(Composer composer, int i2) {
                if ((i2 & 3) == 2 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-808731284, i2, -1, "com.alightcreative.maineditor.presetpreview.ui.components.PresetRenameDialog.<anonymous>.<anonymous> (PresetRenameDialog.kt:50)");
                }
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Horizontal horizontalUo = companion.Uo();
                final MutableState mutableState = this.f11052n;
                final String str = this.f11053t;
                Function0 function0 = this.f11051O;
                final Function1 function1 = this.J2;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Arrangement arrangement = Arrangement.f17400n;
                MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.Uo(), horizontalUo, composer, 48);
                int iN = ComposablesKt.n(composer, 0);
                CompositionLocalMap compositionLocalMapIk = composer.Ik();
                Modifier modifierO = ComposedModifierKt.O(composer, companion2);
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
                String strT = StringResources_androidKt.t(2132020037, composer, 6);
                H9N.j jVar = H9N.j.f3810n;
                float f3 = 16;
                TextKt.t(strT, PaddingKt.xMQ(companion2, Dp.KN(f3)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).gh(), composer, 48, 0, 65532);
                Modifier modifierGh = PaddingKt.gh(companion2, Dp.KN(f3), 0.0f, 2, null);
                String strO = FKk.O(mutableState);
                float f4 = 6;
                RoundedCornerShape roundedCornerShapeT = RoundedCornerShapeKt.t(Dp.KN(f4));
                PaddingValues paddingValuesN = PaddingKt.n(Dp.KN(f4));
                TextStyle textStyleUo = jVar.rl(composer, 6).Uo();
                composer.eF(319760509);
                boolean zP5 = composer.p5(mutableState);
                Object objIF = composer.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1() { // from class: Vil.YzO
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FKk.j.C0395j.nr(mutableState, (String) obj);
                        }
                    };
                    composer.o(objIF);
                }
                composer.Xw();
                u.qz.nr(strO, (Function1) objIF, modifierGh, str, null, null, null, null, null, roundedCornerShapeT, paddingValuesN, textStyleUo, null, null, null, null, null, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 6, 127472);
                float f5 = (float) 0.5d;
                BoxKt.n(BackgroundKt.nr(SizeKt.KN(SizeKt.xMQ(PaddingKt.az(companion2, 0.0f, Dp.KN(f3), 0.0f, 0.0f, 13, null), Dp.KN(f5)), 0.0f, 1, null), aD.w6.Rl(), null, 2, null), composer, 6);
                Modifier modifierXMQ = SizeKt.xMQ(SizeKt.KN(companion2, 0.0f, 1, null), Dp.KN(44));
                MeasurePolicy measurePolicyRl = RowKt.rl(arrangement.J2(), companion.qie(), composer, 0);
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
                Updater.O(composerN2, measurePolicyRl, companion3.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                Function2 function2Rl2 = companion3.rl();
                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion3.nr());
                RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                Modifier modifierRl = RowScope.rl(rowScopeInstance, companion2, 1.0f, false, 2, null);
                n nVar = n.f11253n;
                boolean z2 = true;
                ButtonKt.t(function0, modifierRl, false, null, null, null, null, null, null, nVar.n(), composer, com.google.android.exoplayer2.C.ENCODING_PCM_32BIT, 508);
                BoxKt.n(BackgroundKt.nr(SizeKt.nr(SizeKt.ViF(companion2, Dp.KN(f5)), 0.0f, 1, null), aD.w6.Rl(), null, 2, null), composer, 6);
                composer.eF(73785850);
                boolean zP52 = composer.p5(function1) | composer.p5(mutableState) | composer.p5(str);
                Object objIF2 = composer.iF();
                if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new Function0() { // from class: Vil.QaP
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FKk.j.C0395j.O(function1, mutableState, str);
                        }
                    };
                    composer.o(objIF2);
                }
                Function0 function02 = (Function0) objIF2;
                composer.Xw();
                Modifier modifierRl2 = RowScope.rl(rowScopeInstance, companion2, 1.0f, false, 2, null);
                if (StringsKt.isBlank(FKk.O(mutableState)) && FKk.O(mutableState).length() != 0) {
                    z2 = false;
                }
                ButtonKt.t(function02, modifierRl2, z2, null, null, null, null, ButtonDefaults.f21598n.Uo(0L, aD.w6.Jk(), 0L, composer, (ButtonDefaults.qie << 9) | 48, 5), null, nVar.rl(), composer, com.google.android.exoplayer2.C.ENCODING_PCM_32BIT, 376);
                composer.XQ();
                composer.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit O(Function1 function1, MutableState mutableState, String str) {
                String strO = FKk.O(mutableState);
                if (!StringsKt.isBlank(strO)) {
                    str = strO;
                }
                function1.invoke(str);
                return Unit.INSTANCE;
            }
        }

        j(MutableState mutableState, String str, Function0 function0, Function1 function1) {
            this.f11049n = mutableState;
            this.f11050t = str;
            this.f11048O = function0;
            this.J2 = function1;
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
                ComposerKt.p5(1276304713, i2, -1, "com.alightcreative.maineditor.presetpreview.ui.components.PresetRenameDialog.<anonymous> (PresetRenameDialog.kt:45)");
            }
            CardKt.n(SizeKt.g(Modifier.INSTANCE, 0.0f, Dp.KN(273), 1, null), RoundedCornerShapeKt.t(Dp.KN(14)), aD.w6.ul(), 0L, null, 0.0f, ComposableLambdaKt.nr(-808731284, true, new C0395j(this.f11049n, this.f11050t, this.f11048O, this.J2), composer, 54), composer, 1573254, 56);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState nr() {
        return SnapshotStateKt__SnapshotStateKt.O("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(String str, Function0 function0, Function1 function1, int i2, Composer composer, int i3) {
        t(str, function0, function1, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void t(final String initialTitle, Function0 onCancel, final Function1 onRename, Composer composer, final int i2) {
        int i3;
        final Function0 function0;
        Intrinsics.checkNotNullParameter(initialTitle, "initialTitle");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Intrinsics.checkNotNullParameter(onRename, "onRename");
        Composer composerKN = composer.KN(1821974130);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(initialTitle) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onCancel) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onRename) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            function0 = onCancel;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1821974130, i3, -1, "com.alightcreative.maineditor.presetpreview.ui.components.PresetRenameDialog (PresetRenameDialog.kt:42)");
            }
            Object[] objArr = new Object[0];
            composerKN.eF(-61394263);
            Object objIF = composerKN.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: Vil.xZD
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FKk.nr();
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            Object objO = RememberSaveableKt.O(objArr, null, null, (Function0) objIF, composerKN, 3072, 6);
            composerKN = composerKN;
            function0 = onCancel;
            AndroidDialog_androidKt.n(function0, null, ComposableLambdaKt.nr(1276304713, true, new j((MutableState) objO, initialTitle, onCancel, onRename), composerKN, 54), composerKN, ((i3 >> 3) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Vil.M5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FKk.Uo(initialTitle, function0, onRename, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(MutableState mutableState, String str) {
        mutableState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O(MutableState mutableState) {
        return (String) mutableState.getValue();
    }
}
