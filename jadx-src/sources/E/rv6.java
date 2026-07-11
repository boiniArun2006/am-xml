package E;

import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.template.importpreview.ui.C;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class rv6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f2226n = Dp.KN(52);
    private static final float rl = Dp.KN(16);

    static final class j implements Function3 {
        final /* synthetic */ boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f2227O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f2228n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ a.w6 f2229t;

        /* synthetic */ class CN3 extends FunctionReferenceImpl implements Function0 {
            CN3(Object obj) {
                super(0, obj, a.w6.class, "onDragEnd", "onDragEnd()V", 0);
            }

            public final void n() {
                ((a.w6) this.receiver).mUb();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class I28 extends FunctionReferenceImpl implements Function1 {
            I28(Object obj) {
                super(1, obj, a.w6.class, "updateSelectionOnDrag", "updateSelectionOnDrag(F)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n(((Number) obj).floatValue());
                return Unit.INSTANCE;
            }

            public final void n(float f3) {
                ((a.w6) this.receiver).WPU(f3);
            }
        }

        /* synthetic */ class Ml extends FunctionReferenceImpl implements Function1 {
            Ml(Object obj) {
                super(1, obj, a.w6.class, "updatePlayerView", "updatePlayerView(Landroid/view/View;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((View) obj);
                return Unit.INSTANCE;
            }

            public final void n(View p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((a.w6) this.receiver).S(p0);
            }
        }

        /* synthetic */ class Wre extends FunctionReferenceImpl implements Function0 {
            Wre(Object obj) {
                super(0, obj, a.w6.class, "onDragStart", "onDragStart()V", 0);
            }

            public final void n() {
                ((a.w6) this.receiver).gh();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: E.rv6$j$j, reason: collision with other inner class name */
        /* synthetic */ class C0077j extends FunctionReferenceImpl implements Function0 {
            C0077j(Object obj) {
                super(0, obj, a.w6.class, "onPlayButtonClicked", "onPlayButtonClicked()V", 0);
            }

            public final void n() {
                ((a.w6) this.receiver).qie();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class n extends FunctionReferenceImpl implements Function1 {
            n(Object obj) {
                super(1, obj, a.w6.class, "updatePlayerWidthPx", "updatePlayerWidthPx(I)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void n(int i2) {
                ((a.w6) this.receiver).r(i2);
            }
        }

        /* synthetic */ class w6 extends FunctionReferenceImpl implements Function1 {
            w6(Object obj) {
                super(1, obj, a.w6.class, "updateProgressOnInput", "updateProgressOnInput(F)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n(((Number) obj).floatValue());
                return Unit.INSTANCE;
            }

            public final void n(float f3) {
                ((a.w6) this.receiver).o(f3);
            }
        }

        public final void n(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i2) {
            int i3;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i2 & 6) == 0) {
                i3 = i2 | (composer.p5(BoxWithConstraints) ? 4 : 2);
            } else {
                i3 = i2;
            }
            if ((i3 & 19) == 18 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1314526363, i3, -1, "com.alightcreative.template.importpreview.ui.components.VideoTrimmerContent.<anonymous> (VideoTrimmerContent.kt:52)");
            }
            Function0 function0 = this.f2228n;
            a.w6 w6Var = this.f2229t;
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
            Dj7.Ml.rl(columnScopeInstance, 0L, composer, 6, 1);
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(28)), composer, 6);
            Lu.rl(PaddingKt.xMQ(columnScopeInstance.t(companion, companion2.gh()), rv6.rl), function0, composer, 0, 0);
            Si.o oVarNr = w6Var.nr();
            boolean zXMQ = w6Var.xMQ();
            composer.eF(127277496);
            boolean zP5 = composer.p5(w6Var);
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new C0077j(w6Var);
                composer.o(objIF);
            }
            composer.Xw();
            s.Wre.J2(oVarNr, zXMQ, (Function0) ((KFunction) objIF), PaddingKt.xMQ(columnScopeInstance.n(SizeKt.xMQ(companion, BoxWithConstraints.t()), 1.0f, false), rv6.rl), null, null, composer, 0, 48);
            float f3 = 12;
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f3)), composer, 6);
            Modifier modifierGh = PaddingKt.gh(companion, rv6.rl, 0.0f, 2, null);
            composer.eF(127291320);
            boolean zP52 = composer.p5(w6Var);
            Object objIF2 = composer.iF();
            if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new n(w6Var);
                composer.o(objIF2);
            }
            composer.Xw();
            Function1 function1 = (Function1) ((KFunction) objIF2);
            composer.eF(127293114);
            boolean zP53 = composer.p5(w6Var);
            Object objIF3 = composer.iF();
            if (zP53 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new w6(w6Var);
                composer.o(objIF3);
            }
            composer.Xw();
            Function1 function12 = (Function1) ((KFunction) objIF3);
            composer.eF(127295381);
            boolean zP54 = composer.p5(w6Var);
            Object objIF4 = composer.iF();
            if (zP54 || objIF4 == Composer.INSTANCE.n()) {
                objIF4 = new Ml(w6Var);
                composer.o(objIF4);
            }
            composer.Xw();
            Function1 function13 = (Function1) ((KFunction) objIF4);
            composer.eF(127297434);
            boolean zP55 = composer.p5(w6Var);
            Object objIF5 = composer.iF();
            if (zP55 || objIF5 == Composer.INSTANCE.n()) {
                objIF5 = new I28(w6Var);
                composer.o(objIF5);
            }
            composer.Xw();
            Function1 function14 = (Function1) ((KFunction) objIF5);
            composer.eF(127299472);
            boolean zP56 = composer.p5(w6Var);
            Object objIF6 = composer.iF();
            if (zP56 || objIF6 == Composer.INSTANCE.n()) {
                objIF6 = new Wre(w6Var);
                composer.o(objIF6);
            }
            composer.Xw();
            Function0 function02 = (Function0) ((KFunction) objIF6);
            composer.eF(127301134);
            boolean zP57 = composer.p5(w6Var);
            Object objIF7 = composer.iF();
            if (zP57 || objIF7 == Composer.INSTANCE.n()) {
                objIF7 = new CN3(w6Var);
                composer.o(objIF7);
            }
            composer.Xw();
            qf.J2(modifierGh, function1, function12, function13, function14, function02, (Function0) ((KFunction) objIF7), composer, 6, 0);
            SpacerKt.n(SizeKt.gh(companion, Dp.KN(rv6.f2226n + Dp.KN(rv6.rl * 2)), 0.0f, 2, null), composer, 6);
            composer.XQ();
            Modifier modifierN = BoxWithConstraints.n(SizeKt.KN(companion, 0.0f, 1, null), companion2.rl());
            Alignment.Horizontal horizontalUo = companion2.Uo();
            Arrangement.Vertical verticalN = arrangement.n();
            Function0 function03 = this.f2227O;
            boolean z2 = this.J2;
            MeasurePolicy measurePolicyN2 = ColumnKt.n(verticalN, horizontalUo, composer, 54);
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
            Updater.O(composerN2, measurePolicyN2, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            Dj7.eO.J2(function03, StringResources_androidKt.t(2132020303, composer, 6), SizeKt.xMQ(SizeKt.KN(PaddingKt.xMQ(companion, rv6.rl), 0.0f, 1, null), rv6.f2226n), null, null, H9N.j.f3810n.rl(composer, 6).nY(), 0, 0, 0.0f, null, RoundedCornerShapeKt.rl(CornerSizeKt.rl(Dp.KN(f3))), null, z2, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 3032);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        j(Function0 function0, a.w6 w6Var, Function0 function02, boolean z2) {
            this.f2228n = function0;
            this.f2229t = w6Var;
            this.f2227O = function02;
            this.J2 = z2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(C.j jVar, Function0 function0, Function0 function02, int i2, Composer composer, int i3) {
        t(jVar, function0, function02, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(C.j jVar, Function0 function0, Function0 function02, int i2, Composer composer, int i3) {
        t(jVar, function0, function02, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void t(final C.j viewState, final Function0 onCloseButtonClicked, final Function0 onConfirmButtonClicked, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onCloseButtonClicked, "onCloseButtonClicked");
        Intrinsics.checkNotNullParameter(onConfirmButtonClicked, "onConfirmButtonClicked");
        Composer composerKN = composer.KN(220294321);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(viewState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onCloseButtonClicked) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onConfirmButtonClicked) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(220294321, i3, -1, "com.alightcreative.template.importpreview.ui.components.VideoTrimmerContent (VideoTrimmerContent.kt:34)");
            }
            composerKN.eF(492457634);
            if (viewState.J2() == null || viewState.Uo() == null) {
                BoxKt.n(SizeKt.KN(SizeKt.t(Modifier.INSTANCE, 0.93f), 0.0f, 1, null), composerKN, 6);
                composerKN.Xw();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: E.iwV
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return rv6.nr(viewState, onCloseButtonClicked, onConfirmButtonClicked, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            composerKN.Xw();
            BoxWithConstraintsKt.n(BackgroundKt.nr(WindowInsetsPadding_androidKt.t(SizeKt.KN(SizeKt.t(Modifier.INSTANCE, 0.93f), 0.0f, 1, null)), aD.w6.nO(), null, 2, null), null, false, ComposableLambdaKt.nr(1314526363, true, new j(onCloseButtonClicked, viewState.Uo(), onConfirmButtonClicked, !r4.KN()), composerKN, 54), composerKN, 3072, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh2 = composerKN.gh();
        if (scopeUpdateScopeGh2 != null) {
            scopeUpdateScopeGh2.n(new Function2() { // from class: E.M
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return rv6.O(viewState, onCloseButtonClicked, onConfirmButtonClicked, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
