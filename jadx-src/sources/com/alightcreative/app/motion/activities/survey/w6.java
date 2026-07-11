package com.alightcreative.app.motion.activities.survey;

import KQ.Xo;
import KQ.eO;
import KQ.r;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.view.OnBackPressedCallback;
import com.alightcreative.app.motion.activities.survey.CN3;
import com.alightcreative.app.motion.activities.survey.n;
import java.util.Map;
import kotlin.Function;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class w6 {

    /* synthetic */ class I28 extends FunctionReferenceImpl implements Function2 {
        I28(Object obj) {
            super(2, obj, com.alightcreative.app.motion.activities.survey.I28.class, "onOpenFieldUpdated", "onOpenFieldUpdated(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((String) obj, (String) obj2);
            return Unit.INSTANCE;
        }

        public final void n(String p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((com.alightcreative.app.motion.activities.survey.I28) this.receiver).r(p0, p1);
        }
    }

    /* synthetic */ class Ml extends FunctionReferenceImpl implements Function1 {
        Ml(Object obj) {
            super(1, obj, com.alightcreative.app.motion.activities.survey.I28.class, "onAnswerClick", "onAnswerClick(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void n(int i2) {
            ((com.alightcreative.app.motion.activities.survey.I28) this.receiver).ty(i2);
        }
    }

    static final class Wre implements KQ.n, FunctionAdapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final /* synthetic */ Function2 f45669n;

        Wre(Function2 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f45669n = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof KQ.n) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f45669n;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // KQ.n
        public final /* synthetic */ void n(String str, String str2) {
            this.f45669n.invoke(str, str2);
        }
    }

    /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
        j(Object obj) {
            super(0, obj, com.alightcreative.app.motion.activities.survey.I28.class, "onCtaClick", "onCtaClick()V", 0);
        }

        public final void n() {
            ((com.alightcreative.app.motion.activities.survey.I28) this.receiver).ck();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function0 {
        n(Object obj) {
            super(0, obj, com.alightcreative.app.motion.activities.survey.I28.class, "onBackPressed", "onBackPressed()V", 0);
        }

        public final void n() {
            ((com.alightcreative.app.motion.activities.survey.I28) this.receiver).HI();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.survey.w6$w6, reason: collision with other inner class name */
    /* synthetic */ class C0646w6 extends FunctionReferenceImpl implements Function0 {
        C0646w6(Object obj) {
            super(0, obj, com.alightcreative.app.motion.activities.survey.I28.class, "onDismissButtonClick", "onDismissButtonClick()V", 0);
        }

        public final void n() {
            ((com.alightcreative.app.motion.activities.survey.I28) this.receiver).Ik();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(com.alightcreative.app.motion.activities.survey.I28 i28, SurveyActivity surveyActivity, int i2, Composer composer, int i3) {
        nr(i28, surveyActivity, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(SurveyActivity surveyActivity, com.alightcreative.app.motion.activities.survey.n action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (Intrinsics.areEqual(action, n.C0645n.f45668n)) {
            surveyActivity.setResult(0);
            surveyActivity.finish();
        } else {
            if (!Intrinsics.areEqual(action, n.j.f45667n)) {
                throw new NoWhenBranchMatchedException();
            }
            surveyActivity.setResult(-1);
            surveyActivity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(com.alightcreative.app.motion.activities.survey.I28 i28, OnBackPressedCallback BackPressHandler) {
        Intrinsics.checkNotNullParameter(BackPressHandler, "$this$BackPressHandler");
        i28.HI();
        return Unit.INSTANCE;
    }

    public static final void nr(final com.alightcreative.app.motion.activities.survey.I28 viewModel, final SurveyActivity activity, Composer composer, final int i2) {
        int i3;
        int i5;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Composer composerKN = composer.KN(-1218579150);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(viewModel) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(activity) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1218579150, i3, -1, "com.alightcreative.app.motion.activities.survey.SurveyActivityScreen (SurveyActivity.kt:68)");
            }
            composerKN.eF(-2063921057);
            boolean zE2 = composerKN.E2(viewModel);
            Object objIF = composerKN.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: ID.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.alightcreative.app.motion.activities.survey.w6.O(viewModel, (OnBackPressedCallback) obj);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            N.I28.O(null, (Function1) objIF, composerKN, 0, 1);
            CN3 cn3 = (CN3) LiveDataAdapterKt.n(viewModel.t(), composerKN, 0).getValue();
            composerKN.eF(-2063918589);
            if (cn3 instanceof CN3.j) {
                Modifier modifierT = WindowInsetsPadding_androidKt.t(Modifier.INSTANCE);
                CN3.j jVar = (CN3.j) cn3;
                int i7 = i3;
                eO eOVarT = jVar.t();
                String strT = StringResources_androidKt.t(jVar.n(), composerKN, 0);
                boolean zO = jVar.O();
                composerKN.eF(-2063904533);
                boolean zE22 = composerKN.E2(viewModel);
                Object objIF2 = composerKN.iF();
                if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new j(viewModel);
                    composerKN.o(objIF2);
                }
                composerKN.Xw();
                Xo xo = new Xo(strT, zO, (Function0) ((KFunction) objIF2));
                Map mapRl = jVar.rl();
                boolean zNr = jVar.nr();
                boolean zJ2 = jVar.J2();
                composerKN.eF(-2063895730);
                boolean zE23 = composerKN.E2(viewModel);
                Object objIF3 = composerKN.iF();
                if (zE23 || objIF3 == Composer.INSTANCE.n()) {
                    objIF3 = new n(viewModel);
                    composerKN.o(objIF3);
                }
                KFunction kFunction = (KFunction) objIF3;
                composerKN.Xw();
                composerKN.eF(-2063893931);
                boolean zE24 = composerKN.E2(viewModel);
                Object objIF4 = composerKN.iF();
                if (zE24 || objIF4 == Composer.INSTANCE.n()) {
                    objIF4 = new C0646w6(viewModel);
                    composerKN.o(objIF4);
                }
                KFunction kFunction2 = (KFunction) objIF4;
                composerKN.Xw();
                composerKN.eF(-2063891858);
                boolean zE25 = composerKN.E2(viewModel);
                Object objIF5 = composerKN.iF();
                if (zE25 || objIF5 == Composer.INSTANCE.n()) {
                    objIF5 = new Ml(viewModel);
                    composerKN.o(objIF5);
                }
                KFunction kFunction3 = (KFunction) objIF5;
                composerKN.Xw();
                composerKN.eF(-2063889677);
                boolean zE26 = composerKN.E2(viewModel);
                Object objIF6 = composerKN.iF();
                if (zE26 || objIF6 == Composer.INSTANCE.n()) {
                    objIF6 = new I28(viewModel);
                    composerKN.o(objIF6);
                }
                composerKN.Xw();
                i5 = i7;
                r.qie(modifierT, eOVarT, xo, mapRl, zJ2, zNr, (Function0) kFunction2, (Function0) kFunction, (Function1) kFunction3, new Wre((Function2) ((KFunction) objIF6)), composerKN, 0, 0);
            } else {
                i5 = i3;
            }
            composerKN.Xw();
            composerKN.eF(-2063886086);
            boolean zE27 = composerKN.E2(activity);
            Object objIF7 = composerKN.iF();
            if (zE27 || objIF7 == Composer.INSTANCE.n()) {
                objIF7 = new Function1() { // from class: ID.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.alightcreative.app.motion.activities.survey.w6.J2(activity, (com.alightcreative.app.motion.activities.survey.n) obj);
                    }
                };
                composerKN.o(objIF7);
            }
            composerKN.Xw();
            uW.I28.rl(viewModel, (Function1) objIF7, composerKN, i5 & 14);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: ID.w6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return com.alightcreative.app.motion.activities.survey.w6.Uo(viewModel, activity, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
