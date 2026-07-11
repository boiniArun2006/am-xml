package pFG;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.PopupProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ktm.j;
import pFG.lej;
import pFG.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class lej {

    static final class Ml implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ w6.n f71802O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MutableState f71803n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ MutableState f71804t;

        static final class j implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ MutableState f71805n;

            j(MutableState mutableState) {
                this.f71805n = mutableState;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                n((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x00fd  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void n(Composer composer, int i2) {
                String str;
                if ((i2 & 3) == 2 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1592277656, i2, -1, "com.bendingspoons.experiments.secretmenu.items.experiments.SetSegmentDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SetSegmentDialog.kt:68)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Color.Companion companion2 = Color.INSTANCE;
                Modifier modifierXMQ = PaddingKt.xMQ(BorderKt.Uo(SizeKt.KN(BackgroundKt.nr(companion, companion2.KN(), null, 2, null), 0.0f, 1, null), Dp.KN((float) 0.5d), companion2.n(), null, 4, null), Dp.KN(4));
                Arrangement.HorizontalOrVertical horizontalOrVerticalNr = Arrangement.f17400n.nr();
                MutableState mutableState = this.f71805n;
                MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalNr, Alignment.INSTANCE.qie(), composer, 6);
                int iN = ComposablesKt.n(composer, 0);
                CompositionLocalMap compositionLocalMapIk = composer.Ik();
                Modifier modifierO = ComposedModifierKt.O(composer, modifierXMQ);
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
                j.C1041j c1041j = (j.C1041j) mutableState.getValue();
                if (c1041j != null) {
                    str = c1041j.n() + " - " + c1041j.rl();
                    if (str == null) {
                        str = "";
                    }
                }
                TextKt.t(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
                ImageKt.rl(ArrowDropDownKt.n(Icons.Filled.f23862n), null, null, null, null, 0.0f, null, composer, 48, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                composer.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        static final class n implements Function3 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ MutableState f71806O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ MutableState f71807n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ w6.n f71808t;

            static final class j implements Function2 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ j.C1041j f71809n;

                j(j.C1041j c1041j) {
                    this.f71809n = c1041j;
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
                        ComposerKt.p5(459247600, i2, -1, "com.bendingspoons.experiments.secretmenu.items.experiments.SetSegmentDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SetSegmentDialog.kt:112)");
                    }
                    TextKt.t(this.f71809n.n() + " - " + this.f71809n.rl(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit nr(MutableState mutableState, MutableState mutableState2) {
                mutableState.setValue(null);
                mutableState2.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            }

            n(MutableState mutableState, w6.n nVar, MutableState mutableState2) {
                this.f71807n = mutableState;
                this.f71808t = nVar;
                this.f71806O = mutableState2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                t((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            public final void t(ColumnScope DropdownMenu, Composer composer, int i2) {
                Composer composer2 = composer;
                Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
                if ((i2 & 17) == 16 && composer2.xMQ()) {
                    composer2.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(219339965, i2, -1, "com.bendingspoons.experiments.secretmenu.items.experiments.SetSegmentDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SetSegmentDialog.kt:98)");
                }
                composer2.eF(441817331);
                if (this.f71807n.getValue() != null) {
                    Function2 function2T = pFG.n.f71814n.t();
                    composer2.eF(441825490);
                    final MutableState mutableState = this.f71807n;
                    final MutableState mutableState2 = this.f71806O;
                    Object objIF = composer2.iF();
                    if (objIF == Composer.INSTANCE.n()) {
                        objIF = new Function0() { // from class: pFG.rv6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return lej.Ml.n.nr(mutableState, mutableState2);
                            }
                        };
                        composer2.o(objIF);
                    }
                    composer2.Xw();
                    AndroidMenu_androidKt.nr(function2T, (Function0) objIF, null, null, null, false, null, null, null, composer2, 54, 508);
                }
                composer2.Xw();
                List<j.C1041j> listN = this.f71808t.n().n();
                if (listN != null) {
                    final MutableState mutableState3 = this.f71807n;
                    final MutableState mutableState4 = this.f71806O;
                    for (final j.C1041j c1041j : listN) {
                        ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(459247600, true, new j(c1041j), composer2, 54);
                        composer2.eF(-718146668);
                        boolean zP5 = composer2.p5(c1041j);
                        Object objIF2 = composer2.iF();
                        if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                            objIF2 = new Function0() { // from class: pFG.vd
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return lej.Ml.n.O(mutableState3, c1041j, mutableState4);
                                }
                            };
                            composer2.o(objIF2);
                        }
                        composer2.Xw();
                        AndroidMenu_androidKt.nr(composableLambdaNr, (Function0) objIF2, null, null, null, false, null, null, null, composer2, 6, 508);
                        composer2 = composer;
                    }
                }
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit O(MutableState mutableState, j.C1041j c1041j, MutableState mutableState2) {
                mutableState.setValue(c1041j);
                mutableState2.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            }
        }

        Ml(MutableState mutableState, MutableState mutableState2, w6.n nVar) {
            this.f71803n = mutableState;
            this.f71804t = mutableState2;
            this.f71802O = nVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(MutableState mutableState) {
            mutableState.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            t((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void t(Composer composer, int i2) {
            final MutableState mutableState;
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(547661630, i2, -1, "com.bendingspoons.experiments.secretmenu.items.experiments.SetSegmentDialog.<anonymous> (SetSegmentDialog.kt:61)");
            }
            MutableState mutableState2 = this.f71803n;
            MutableState mutableState3 = this.f71804t;
            w6.n nVar = this.f71802O;
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
            TextKt.t("Select the new segment below", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            MeasurePolicy measurePolicyRl = RowKt.rl(arrangement.J2(), companion2.qie(), composer, 0);
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
            Updater.O(composerN2, measurePolicyRl, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            Modifier modifierKN = SizeKt.KN(companion, 0.0f, 1, null);
            ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(-1592277656, true, new j(mutableState3), composer, 54);
            composer.eF(-1400497049);
            Object objIF = composer.iF();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objIF == companion4.n()) {
                mutableState = mutableState2;
                objIF = new Function0() { // from class: pFG.iwV
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return lej.Ml.nr(mutableState);
                    }
                };
                composer.o(objIF);
            } else {
                mutableState = mutableState2;
            }
            composer.Xw();
            final MutableState mutableState4 = mutableState;
            AndroidMenu_androidKt.nr(composableLambdaNr, (Function0) objIF, modifierKN, null, null, false, null, null, null, composer, 438, 504);
            Modifier modifierNr = BackgroundKt.nr(companion, Color.INSTANCE.KN(), null, 2, null);
            boolean zBooleanValue = ((Boolean) mutableState4.getValue()).booleanValue();
            PopupProperties popupProperties = new PopupProperties(true, false, false, false, 14, (DefaultConstructorMarker) null);
            composer.eF(-1400488075);
            Object objIF2 = composer.iF();
            if (objIF2 == companion4.n()) {
                objIF2 = new Function0() { // from class: pFG.M
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return lej.Ml.O(mutableState4);
                    }
                };
                composer.o(objIF2);
            }
            composer.Xw();
            AndroidMenu_androidKt.t(zBooleanValue, (Function0) objIF2, modifierNr, 0L, null, popupProperties, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.nr(219339965, true, new n(mutableState3, nVar, mutableState4), composer, 54), composer, 197040, 48, 2008);
            composer.XQ();
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nr(MutableState mutableState) {
            mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
            return Unit.INSTANCE;
        }
    }

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f71810n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ MutableState f71811t;

        public final void rl(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-314408775, i2, -1, "com.bendingspoons.experiments.secretmenu.items.experiments.SetSegmentDialog.<anonymous> (SetSegmentDialog.kt:44)");
            }
            composer.eF(-1374288106);
            boolean zP5 = composer.p5(this.f71810n);
            final Function1 function1 = this.f71810n;
            final MutableState mutableState = this.f71811t;
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: pFG.Ln
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return lej.j.t(function1, mutableState);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            ButtonKt.n((Function0) objIF, null, false, null, null, null, null, null, null, pFG.n.f71814n.n(), composer, com.google.android.exoplayer2.C.ENCODING_PCM_32BIT, 510);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        j(Function1 function1, MutableState mutableState) {
            this.f71810n = function1;
            this.f71811t = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Function1 function1, MutableState mutableState) {
            function1.invoke(mutableState.getValue());
            return Unit.INSTANCE;
        }
    }

    static final class n implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f71812n;

        n(Function0 function0) {
            this.f71812n = function0;
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
                ComposerKt.p5(30419387, i2, -1, "com.bendingspoons.experiments.secretmenu.items.experiments.SetSegmentDialog.<anonymous> (SetSegmentDialog.kt:53)");
            }
            ButtonKt.n(this.f71812n, null, false, null, null, null, null, null, null, pFG.n.f71814n.rl(), composer, com.google.android.exoplayer2.C.ENCODING_PCM_32BIT, 510);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class w6 implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ w6.n f71813n;

        w6(w6.n nVar) {
            this.f71813n = nVar;
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
                ComposerKt.p5(375247549, i2, -1, "com.bendingspoons.experiments.secretmenu.items.experiments.SetSegmentDialog.<anonymous> (SetSegmentDialog.kt:58)");
            }
            TextKt.t(this.f71813n.n().rl(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final void rl(final w6.n state, final Function0 onDismiss, final Function1 onConfirm, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Composer composerKN = composer.KN(-90534287);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(state) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onDismiss) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onConfirm) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-90534287, i3, -1, "com.bendingspoons.experiments.secretmenu.items.experiments.SetSegmentDialog (SetSegmentDialog.kt:33)");
            }
            composerKN.eF(-1041608265);
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(state.n().t(), null, 2, null);
                composerKN.o(objIF);
            }
            MutableState mutableState = (MutableState) objIF;
            composerKN.Xw();
            composerKN.eF(-1041604572);
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                composerKN.o(objIF2);
            }
            composerKN.Xw();
            composer2 = composerKN;
            AndroidAlertDialog_androidKt.n(onDismiss, ComposableLambdaKt.nr(-314408775, true, new j(onConfirm, mutableState), composerKN, 54), null, ComposableLambdaKt.nr(30419387, true, new n(onDismiss), composerKN, 54), null, ComposableLambdaKt.nr(375247549, true, new w6(state), composerKN, 54), ComposableLambdaKt.nr(547661630, true, new Ml((MutableState) objIF2, mutableState, state), composerKN, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, ((i3 >> 3) & 14) | 1772592, 0, 16276);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pFG.qf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return lej.t(state, onDismiss, onConfirm, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(w6.n nVar, Function0 function0, Function1 function1, int i2, Composer composer, int i3) {
        rl(nVar, function0, function1, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
