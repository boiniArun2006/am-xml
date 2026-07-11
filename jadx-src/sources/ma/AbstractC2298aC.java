package ma;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.RadioButtonKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextFieldKt;
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
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.b;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ma.AbstractC2298aC;
import ma.InterfaceC2300j;

/* JADX INFO: renamed from: ma.aC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class AbstractC2298aC {

    /* JADX INFO: renamed from: ma.aC$j */
    static final class j implements Function2 {
        final /* synthetic */ Function2 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f70708O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f70709n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f70710t;

        j(List list, int i2, Function1 function1, Function2 function2) {
            this.f70709n = list;
            this.f70710t = i2;
            this.f70708O = function1;
            this.J2 = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Uo(Function2 function2, int i2, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            function2.invoke(Integer.valueOf(i2), it);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            nr((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void nr(Composer composer, int i2) {
            char c2;
            int i3 = 1;
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(3135891, i2, -1, "com.bendingspoons.secretmenu.backendoverride.internal.formComposables.RadioGroup.<anonymous> (RadioGroup.kt:42)");
            }
            List list = this.f70709n;
            int i5 = this.f70710t;
            final Function1 function1 = this.f70708O;
            final Function2 function2 = this.J2;
            Modifier.Companion companion = Modifier.INSTANCE;
            int i7 = 0;
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
            composer.eF(309734644);
            final int i8 = 0;
            for (Object obj : list) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                InterfaceC2300j interfaceC2300j = (InterfaceC2300j) obj;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierKN = SizeKt.KN(companion3, 0.0f, i3, null);
                boolean z2 = i8 == i5 ? i3 : i7;
                composer.eF(873892116);
                boolean zP5 = composer.p5(function1) | composer.t(i8);
                Object objIF = composer.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: ma.CN3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC2298aC.j.O(function1, i8);
                        }
                    };
                    composer.o(objIF);
                }
                composer.Xw();
                Modifier modifierNr = SelectableKt.nr(modifierKN, z2, false, null, (Function0) objIF, 6, null);
                MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), Alignment.INSTANCE.qie(), composer, i7);
                int iN2 = ComposablesKt.n(composer, i7);
                int i10 = i3;
                CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composer, modifierNr);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0 function0N2 = companion4.n();
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
                Updater.O(composerN2, measurePolicyRl, companion4.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
                Function2 function2Rl2 = companion4.rl();
                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion4.nr());
                RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                boolean z3 = i8 == i5 ? i10 : 0;
                composer.eF(902651475);
                boolean zP52 = composer.p5(function1) | composer.t(i8);
                Object objIF2 = composer.iF();
                if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new Function0() { // from class: ma.fuX
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC2298aC.j.J2(function1, i8);
                        }
                    };
                    composer.o(objIF2);
                }
                Function0 function0 = (Function0) objIF2;
                composer.Xw();
                composer.eF(902653634);
                boolean zP53 = composer.p5(function2) | composer.t(i8);
                Object objIF3 = composer.iF();
                if (zP53 || objIF3 == Composer.INSTANCE.n()) {
                    objIF3 = new Function1() { // from class: ma.Dsr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AbstractC2298aC.j.Uo(function2, i8, (String) obj2);
                        }
                    };
                    composer.o(objIF3);
                }
                composer.Xw();
                AbstractC2298aC.KN(interfaceC2300j, z3, function0, (Function1) objIF3, composer, 0);
                composer.XQ();
                composer.eF(309754656);
                if (i8 != list.size() - 1) {
                    c2 = 2;
                    DividerKt.rl(PaddingKt.gh(companion3, Dp.KN(16), 0.0f, 2, null), 0.0f, 0L, composer, 6, 6);
                } else {
                    c2 = 2;
                }
                composer.Xw();
                i8 = i9;
                i3 = i10;
                i7 = 0;
            }
            int i11 = i3;
            composer.Xw();
            composer.XQ();
            if (!(this.f70709n.get(this.f70710t) instanceof InterfaceC2300j.C1056j)) {
                FocusManager.qie((FocusManager) composer.ty(CompositionLocalsKt.Uo()), false, i11, null);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit J2(Function1 function1, int i2) {
            function1.invoke(Integer.valueOf(i2));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(Function1 function1, int i2) {
            function1.invoke(Integer.valueOf(i2));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: ma.aC$n */
    static final class n implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC2300j f70711n;

        n(InterfaceC2300j interfaceC2300j) {
            this.f70711n = interfaceC2300j;
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
                ComposerKt.p5(1795040882, i2, -1, "com.bendingspoons.secretmenu.backendoverride.internal.formComposables.RadioOption.<anonymous>.<anonymous> (RadioGroup.kt:118)");
            }
            TextKt.t(((InterfaceC2300j.C1056j) this.f70711n).n(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(final InterfaceC2300j interfaceC2300j, final boolean z2, final Function0 function0, Function1 function1, Composer composer, final int i2) {
        int i3;
        final Function1 function12;
        Composer composerKN = composer.KN(1263317009);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerKN.p5(interfaceC2300j) : composerKN.E2(interfaceC2300j) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.n(z2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(function1) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            function12 = function1;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1263317009, i3, -1, "com.bendingspoons.secretmenu.backendoverride.internal.formComposables.RadioOption (RadioGroup.kt:76)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f3 = 8;
            Modifier modifierGh = PaddingKt.gh(companion, Dp.KN(f3), 0.0f, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical verticalXMQ = companion2.xMQ();
            Arrangement arrangement = Arrangement.f17400n;
            MeasurePolicy measurePolicyRl = RowKt.rl(arrangement.J2(), verticalXMQ, composerKN, 48);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierGh);
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
            Updater.O(composerN, measurePolicyRl, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            composerKN.eF(1090661085);
            int i5 = i3 & 896;
            boolean z3 = i5 == 256;
            Object objIF = composerKN.iF();
            if (z3 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: ma.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC2298aC.xMQ(function0);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            int i7 = i3;
            RadioButtonKt.n(z2, (Function0) objIF, null, false, null, null, composerKN, (i3 >> 3) & 14, 60);
            if (interfaceC2300j instanceof InterfaceC2300j.n) {
                composerKN.eF(-549145345);
                InterfaceC2300j.n nVar = (InterfaceC2300j.n) interfaceC2300j;
                if (nVar.n() == null) {
                    composerKN.eF(-549112206);
                    TextKt.t(nVar.rl(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerKN, 0, 0, 131070);
                    composerKN = composerKN;
                    composerKN.Xw();
                } else {
                    composerKN.eF(-549032381);
                    Modifier modifierGh2 = PaddingKt.gh(companion, 0.0f, Dp.KN(f3), 1, null);
                    MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.Uo(), companion2.gh(), composerKN, 0);
                    int iN2 = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierGh2);
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
                    Updater.O(composerN2, measurePolicyN, companion3.t());
                    Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                    Function2 function2Rl2 = companion3.rl();
                    if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                        composerN2.o(Integer.valueOf(iN2));
                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    }
                    Updater.O(composerN2, modifierO2, companion3.nr());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                    TextKt.t(nVar.rl(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerKN, 0, 0, 131070);
                    SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(4)), composerKN, 6);
                    TextKt.t(nVar.n(), null, Color.INSTANCE.t(), TextUnitKt.KN(10), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerKN, 3456, 0, 131058);
                    composerKN = composerKN;
                    composerKN.XQ();
                    composerKN.Xw();
                }
                composerKN.Xw();
                function12 = function1;
            } else {
                if (!(interfaceC2300j instanceof InterfaceC2300j.C1056j)) {
                    composerKN.eF(1090663973);
                    composerKN.Xw();
                    throw new NoWhenBranchMatchedException();
                }
                composerKN.eF(-548590445);
                InterfaceC2300j.C1056j c1056j = (InterfaceC2300j.C1056j) interfaceC2300j;
                String strRl = c1056j.rl();
                Modifier modifierKN = SizeKt.KN(companion, 0.0f, 1, null);
                composerKN.eF(1090689282);
                boolean z4 = i5 == 256;
                Object objIF2 = composerKN.iF();
                if (z4 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new Function1() { // from class: ma.w6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC2298aC.mUb(function0, (FocusState) obj);
                        }
                    };
                    composerKN.o(objIF2);
                }
                composerKN.Xw();
                Modifier modifierN = FocusChangedModifierKt.n(modifierKN, (Function1) objIF2);
                RoundedCornerShape roundedCornerShapeT = RoundedCornerShapeKt.t(Dp.KN(f3));
                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f28299n;
                Color.Companion companion4 = Color.INSTANCE;
                TextFieldColors textFieldColorsO = textFieldDefaults.O(0L, 0L, 0L, companion4.O(), 0L, companion4.J2(), 0L, companion4.J2(), 0L, 0L, null, 0L, companion4.J2(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerKN, 12782592, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 0, 3072, 2147479383, 4095);
                boolean z5 = !c1056j.t();
                KeyboardOptions keyboardOptions = new KeyboardOptions(KeyboardCapitalization.INSTANCE.rl(), false, KeyboardType.INSTANCE.n(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, b.f61769v, (DefaultConstructorMarker) null);
                composerKN.eF(1090684394);
                boolean z6 = (i7 & 7168) == 2048;
                Object objIF3 = composerKN.iF();
                if (z6 || objIF3 == Composer.INSTANCE.n()) {
                    function12 = function1;
                    objIF3 = new Function1() { // from class: ma.Ml
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC2298aC.gh(function12, (String) obj);
                        }
                    };
                    composerKN.o(objIF3);
                } else {
                    function12 = function1;
                }
                composerKN.Xw();
                TextFieldKt.rl(strRl, (Function1) objIF3, modifierN, false, false, null, ComposableLambdaKt.nr(1795040882, true, new n(interfaceC2300j), composerKN, 54), null, null, null, null, null, null, z5, null, keyboardOptions, null, true, 0, 0, null, roundedCornerShapeT, textFieldColorsO, composerKN, 1572864, 12779520, 0, 1925048);
                composerKN = composerKN;
                composerKN.Xw();
            }
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            final Function1 function13 = function12;
            scopeUpdateScopeGh.n(new Function2() { // from class: ma.I28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC2298aC.qie(interfaceC2300j, z2, function0, function13, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void J2(final List choices, final int i2, final Function1 onSelect, final Function2 onOpenChoiceUpdated, Composer composer, final int i3) {
        int i5;
        Composer composer2;
        Intrinsics.checkNotNullParameter(choices, "choices");
        Intrinsics.checkNotNullParameter(onSelect, "onSelect");
        Intrinsics.checkNotNullParameter(onOpenChoiceUpdated, "onOpenChoiceUpdated");
        Composer composerKN = composer.KN(-670443528);
        if ((i3 & 6) == 0) {
            i5 = (composerKN.E2(choices) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerKN.t(i2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onSelect) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerKN.E2(onOpenChoiceUpdated) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-670443528, i5, -1, "com.bendingspoons.secretmenu.backendoverride.internal.formComposables.RadioGroup (RadioGroup.kt:37)");
            }
            composer2 = composerKN;
            SurfaceKt.n(null, MaterialTheme.f26164n.rl(composerKN, MaterialTheme.rl).getMedium(), 0L, 0L, 0.0f, Dp.KN(2), null, ComposableLambdaKt.nr(3135891, true, new j(choices, i2, onSelect, onOpenChoiceUpdated), composerKN, 54), composer2, 12779520, 93);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: ma.Wre
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC2298aC.Uo(choices, i2, onSelect, onOpenChoiceUpdated, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(List list, int i2, Function1 function1, Function2 function2, int i3, Composer composer, int i5) {
        J2(list, i2, function1, function2, composer, RecomposeScopeImplKt.n(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(Function0 function0, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.rl()) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(InterfaceC2300j interfaceC2300j, boolean z2, Function0 function0, Function1 function1, int i2, Composer composer, int i3) {
        KN(interfaceC2300j, z2, function0, function1, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
