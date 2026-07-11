package KQ;

import Dj7.Mf;
import Dj7.YzO;
import Dj7.o7q;
import Dj7.xZD;
import GJW.vd;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.internal.d;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class qz {

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5351n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ScrollState f5352t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ScrollState scrollState, Continuation continuation) {
            super(2, continuation);
            this.f5352t = scrollState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f5352t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f5351n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ScrollState scrollState = this.f5352t;
                this.f5351n = 1;
                if (scrollState.HI(0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class n implements Function4 {
        final /* synthetic */ KQ.n J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f5353O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ eO f5354n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Map f5355t;

        n(eO eOVar, Map map, Function1 function1, KQ.n nVar) {
            this.f5354n = eOVar;
            this.f5355t = map;
            this.f5353O = function1;
            this.J2 = nVar;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            n((AnimatedContentScope) obj, (eO) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return Unit.INSTANCE;
        }

        public final void n(AnimatedContentScope AnimatedContent, eO it, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.v()) {
                ComposerKt.p5(1323871860, i2, -1, "com.alightcreative.app.motion.activities.survey.ui.QuestionAndAnswers.<anonymous>.<anonymous>.<anonymous> (QuestionAndAnswers.kt:150)");
            }
            qz.gh(it, this.f5354n.nr(), this.f5355t, this.f5353O, this.J2, composer, (i2 >> 3) & 14);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final void ck(final Modifier modifier, final eO surveyPageUIModel, final Map openFieldValues, final Function1 onAnswerClick, final KQ.n openFieldUpdateListener, Composer composer, final int i2) {
        int i3;
        int i5;
        int i7;
        ScrollState scrollState;
        Composer composer2;
        int i8;
        Composer composer3;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(surveyPageUIModel, "surveyPageUIModel");
        Intrinsics.checkNotNullParameter(openFieldValues, "openFieldValues");
        Intrinsics.checkNotNullParameter(onAnswerClick, "onAnswerClick");
        Intrinsics.checkNotNullParameter(openFieldUpdateListener, "openFieldUpdateListener");
        Composer composerKN = composer.KN(1939274830);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(surveyPageUIModel) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(openFieldValues) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(onAnswerClick) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? composerKN.p5(openFieldUpdateListener) : composerKN.E2(openFieldUpdateListener) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerKN.xMQ()) {
            composerKN.wTp();
            composer3 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1939274830, i3, -1, "com.alightcreative.app.motion.activities.survey.ui.QuestionAndAnswers (QuestionAndAnswers.kt:54)");
            }
            final ScrollState scrollStateT = ScrollKt.t(0, composerKN, 0, 1);
            composerKN.eF(-1414672045);
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = SnapshotStateKt.O(new Function0() { // from class: KQ.w6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(qz.Ik(scrollStateT));
                    }
                });
                composerKN.o(objIF);
            }
            State state = (State) objIF;
            composerKN.Xw();
            composerKN.eF(-1414669466);
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = SnapshotStateKt.O(new Function0() { // from class: KQ.Ml
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(qz.S(scrollStateT));
                    }
                });
                composerKN.o(objIF2);
            }
            State state2 = (State) objIF2;
            composerKN.Xw();
            composerKN.eF(-1414666341);
            Object objIF3 = composerKN.iF();
            if (objIF3 == companion.n()) {
                objIF3 = SnapshotStateKt__SnapshotStateKt.O(0, null, 2, null);
                composerKN.o(objIF3);
            }
            MutableState mutableState = (MutableState) objIF3;
            composerKN.Xw();
            composerKN.eF(-1414665045);
            if (surveyPageUIModel.Uo() != ((Number) mutableState.getValue()).intValue()) {
                mutableState.setValue(Integer.valueOf(surveyPageUIModel.Uo()));
                Unit unit = Unit.INSTANCE;
                composerKN.eF(-1414660308);
                boolean zP5 = composerKN.p5(scrollStateT);
                Object objIF4 = composerKN.iF();
                if (zP5 || objIF4 == companion.n()) {
                    objIF4 = new j(scrollStateT, null);
                    composerKN.o(objIF4);
                }
                composerKN.Xw();
                EffectsKt.O(unit, (Function2) objIF4, composerKN, 6);
            }
            composerKN.Xw();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifier);
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
            composerKN.eF(-883340761);
            if (XQ(state)) {
                i5 = i3;
                i7 = 25;
                scrollState = scrollStateT;
                composer2 = composerKN;
            } else {
                composer2 = composerKN;
                scrollState = scrollStateT;
                i5 = i3;
                i7 = 25;
                YzO.rl(Color.az(Color.INSTANCE.n(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), ZIndexModifierKt.n(SizeKt.xMQ(Modifier.INSTANCE, Dp.KN(25)), 1.0f), null, composer2, 54, 4);
            }
            composer2.Xw();
            composer2.eF(-883332842);
            if (!WPU(state2)) {
                YzO.rl(Color.az(Color.INSTANCE.n(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), ZIndexModifierKt.n(SizeKt.xMQ(boxScopeInstance.n(Modifier.INSTANCE, companion2.rl()), Dp.KN(i7)), 1.0f), xZD.f1896t, composer2, 390, 0);
            }
            composer2.Xw();
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierNr = SizeKt.nr(ScrollKt.Uo(companion4, scrollState, false, null, false, 14, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), companion2.gh(), composer2, 0);
            int iN2 = ComposablesKt.n(composer2, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer2.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer2, modifierNr);
            Function0 function0N2 = companion3.n();
            if (composer2.getApplier() == null) {
                ComposablesKt.t();
            }
            composer2.T();
            if (composer2.getInserting()) {
                composer2.s7N(function0N2);
            } else {
                composer2.r();
            }
            Composer composerN2 = Updater.n(composer2);
            Updater.O(composerN2, measurePolicyN, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            int i9 = w6.$EnumSwitchMapping$0[((LayoutDirection) composer2.ty(CompositionLocalsKt.az())).ordinal()];
            if (i9 == 1) {
                i8 = 1;
            } else {
                if (i9 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i8 = -1;
            }
            final ContentTransform contentTransformUo = TBf.Ml.Uo(i8, 500, 200);
            final ContentTransform contentTransformUo2 = TBf.Ml.Uo(-i8, d.f62986a, 0);
            composer2.eF(-786928361);
            boolean zE2 = composer2.E2(contentTransformUo) | composer2.E2(contentTransformUo2);
            Object objIF5 = composer2.iF();
            if (zE2 || objIF5 == companion.n()) {
                objIF5 = new Function1() { // from class: KQ.I28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qz.o(contentTransformUo, contentTransformUo2, (AnimatedContentTransitionScope) obj);
                    }
                };
                composer2.o(objIF5);
            }
            composer2.Xw();
            int i10 = ((i5 >> 3) & 14) | 1597440;
            Composer composer4 = composer2;
            AnimatedContentKt.rl(surveyPageUIModel, null, (Function1) objIF5, null, "TopContent", null, KQ.j.f5344n.n(), composer4, i10, 42);
            composer4.eF(-786904738);
            boolean zE22 = composer4.E2(contentTransformUo) | composer4.E2(contentTransformUo2);
            Object objIF6 = composer4.iF();
            if (zE22 || objIF6 == companion.n()) {
                objIF6 = new Function1() { // from class: KQ.Wre
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qz.r(contentTransformUo, contentTransformUo2, (AnimatedContentTransitionScope) obj);
                    }
                };
                composer4.o(objIF6);
            }
            composer4.Xw();
            AnimatedContentKt.rl(surveyPageUIModel, null, (Function1) objIF6, null, "Answers", null, ComposableLambdaKt.nr(1323871860, true, new n(surveyPageUIModel, openFieldValues, onAnswerClick, openFieldUpdateListener), composer4, 54), composer4, i10, 42);
            composer3 = composer4;
            SpacerKt.n(SizeKt.xMQ(companion4, Dp.KN(32)), composer3, 6);
            composer3.XQ();
            composer3.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer3.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: KQ.CN3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qz.Z(modifier, surveyPageUIModel, openFieldValues, onAnswerClick, openFieldUpdateListener, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gh(final eO eOVar, final String str, final Map map, final Function1 function1, final KQ.n nVar, Composer composer, final int i2) {
        eO eOVar2;
        int i3;
        int i5;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer composerKN = composer.KN(824873225);
        if ((i2 & 6) == 0) {
            eOVar2 = eOVar;
            i3 = (composerKN.E2(eOVar2) ? 4 : 2) | i2;
        } else {
            eOVar2 = eOVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(str) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(map) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (i2 & 32768) == 0 ? composerKN.p5(nVar) : composerKN.E2(nVar) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(824873225, i3, -1, "com.alightcreative.app.motion.activities.survey.ui.Answers (QuestionAndAnswers.kt:202)");
            }
            String strXMQ = eOVar2.xMQ();
            Integer numKN = eOVar2.KN();
            List listN = eOVar2.n();
            Modifier modifierKN = SizeKt.KN(PaddingKt.gh(Modifier.INSTANCE, Dp.KN(16), 0.0f, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.ty(Dp.KN(12)), Alignment.INSTANCE.Uo(), composerKN, 54);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierKN);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
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
            Updater.O(composerN, measurePolicyN, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            composerKN.eF(968757537);
            if (strXMQ != null) {
                i9 = 0;
                i5 = 1;
                i8 = i3;
                i7 = 6;
                TextKt.t(strXMQ, null, aD.w6.JVN(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, 6).nY(), composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
                composerKN = composerKN;
            } else {
                i5 = 1;
                i7 = 6;
                i8 = i3;
                i9 = 0;
            }
            composerKN.Xw();
            composerKN.eF(968765538);
            final int i11 = i9;
            for (Object obj : listN) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final Pl pl = (Pl) obj;
                if (pl.t()) {
                    composerKN.eF(468073628);
                    String strRl = pl.rl();
                    String str2 = (String) map.get(pl.n());
                    if (str2 == null) {
                        str2 = "";
                    }
                    String strT = StringResources_androidKt.t(2132020274, composerKN, i7);
                    composerKN.eF(846391533);
                    int i13 = (((57344 & i8) == 16384 || ((i8 & 32768) != 0 && composerKN.E2(nVar))) ? i5 : i9) | (composerKN.p5(pl) ? 1 : 0);
                    Object objIF = composerKN.iF();
                    if (i13 != 0 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function1() { // from class: KQ.Dsr
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return qz.qie(nVar, pl, (String) obj2);
                            }
                        };
                        composerKN.o(objIF);
                    }
                    Function1 function12 = (Function1) objIF;
                    composerKN.Xw();
                    Modifier modifierKN2 = SizeKt.KN(Modifier.INSTANCE, 0.0f, i5, null);
                    o7q o7qVar = (numKN != null && i11 == numKN.intValue()) ? o7q.f1858t : o7q.f1857n;
                    composerKN.eF(846402546);
                    int i14 = ((i8 & 7168) == 2048 ? 1 : i9) | (composerKN.t(i11) ? 1 : 0);
                    Object objIF2 = composerKN.iF();
                    if (i14 != 0 || objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new Function0() { // from class: KQ.aC
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return qz.az(function1, i11);
                            }
                        };
                        composerKN.o(objIF2);
                    }
                    composerKN.Xw();
                    Composer composer2 = composerKN;
                    Mf.xMQ(strRl, str2, strT, function12, modifierKN2, o7qVar, (Function0) objIF2, composer2, 24576, 0);
                    composerKN = composer2;
                    composerKN.Xw();
                    i10 = 1;
                } else {
                    composerKN.eF(468753923);
                    String strRl2 = pl.rl();
                    i10 = 1;
                    Modifier modifierKN3 = SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null);
                    o7q o7qVar2 = ((numKN != null && i11 == numKN.intValue()) || Intrinsics.areEqual(str, pl.n())) ? o7q.f1858t : o7q.f1857n;
                    composerKN.eF(846420306);
                    int i15 = ((i8 & 7168) == 2048 ? 1 : i9) | (composerKN.t(i11) ? 1 : 0);
                    Object objIF3 = composerKN.iF();
                    if (i15 != 0 || objIF3 == Composer.INSTANCE.n()) {
                        objIF3 = new Function0() { // from class: KQ.C
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return qz.ty(function1, i11);
                            }
                        };
                        composerKN.o(objIF3);
                    }
                    composerKN.Xw();
                    Mf.qie(strRl2, modifierKN3, o7qVar2, (Function0) objIF3, composerKN, 48, 0);
                    composerKN.Xw();
                }
                i5 = i10;
                i11 = i12;
                i7 = 6;
            }
            composerKN.Xw();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: KQ.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return qz.HI(eOVar, str, map, function1, nVar, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public /* synthetic */ class w6 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.f34160n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.f34161t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(eO eOVar, String str, Map map, Function1 function1, KQ.n nVar, int i2, Composer composer, int i3) {
        gh(eOVar, str, map, function1, nVar, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ViF(String str, String str2, int i2, int i3, Composer composer, int i5) {
        aYN(str, str2, i2, composer, RecomposeScopeImplKt.n(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(Modifier modifier, eO eOVar, Map map, Function1 function1, KQ.n nVar, int i2, Composer composer, int i3) {
        ck(modifier, eOVar, map, function1, nVar, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void aYN(final String str, String str2, final int i2, Composer composer, final int i3) {
        int i5;
        Composer composer2;
        final String str3;
        Composer composerKN = composer.KN(-345211040);
        if ((i3 & 6) == 0) {
            i5 = (composerKN.p5(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerKN.p5(str2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.t(i2) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            str3 = str2;
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-345211040, i5, -1, "com.alightcreative.app.motion.activities.survey.ui.TopContent (QuestionAndAnswers.kt:169)");
            }
            Modifier modifierAz = PaddingKt.az(PaddingKt.gh(Modifier.INSTANCE, Dp.KN(16), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, Dp.KN(24), 7, null);
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.Uo(), composerKN, 48);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierAz);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
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
            Updater.O(composerN, measurePolicyN, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            ImageKt.n(PainterResources_androidKt.t(i2, composerKN, (i5 >> 6) & 14), "Survey image", null, null, null, 0.0f, null, composerKN, 48, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            TextAlign.Companion companion2 = TextAlign.INSTANCE;
            TextAlign textAlignKN = TextAlign.KN(companion2.n());
            H9N.j jVar = H9N.j.f3810n;
            TextKt.t(str, null, 0L, 0L, null, null, null, 0L, null, textAlignKN, 0L, 0, false, 0, 0, null, jVar.rl(composerKN, 6).iF(), composerKN, i5 & 14, 0, 65022);
            composerKN.eF(-1719938421);
            if (str2 == null) {
                str3 = str2;
                composer2 = composerKN;
            } else {
                composer2 = composerKN;
                str3 = str2;
                TextKt.t(str3, null, 0L, 0L, null, null, null, 0L, null, TextAlign.KN(companion2.n()), 0L, 0, false, 0, 0, null, jVar.rl(composerKN, 6).v(), composer2, 0, 0, 65022);
            }
            composer2.Xw();
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: KQ.fuX
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qz.ViF(str, str3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform o(ContentTransform contentTransform, ContentTransform contentTransform2, AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        int iUo = ((eO) AnimatedContent.getInitialState()).Uo();
        int iUo2 = ((eO) AnimatedContent.getTargetState()).Uo();
        return iUo < iUo2 ? contentTransform : iUo > iUo2 ? contentTransform2 : TBf.j.n(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(KQ.n nVar, Pl pl, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        nVar.n(pl.n(), it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform r(ContentTransform contentTransform, ContentTransform contentTransform2, AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        int iUo = ((eO) AnimatedContent.getInitialState()).Uo();
        int iUo2 = ((eO) AnimatedContent.getTargetState()).Uo();
        if (iUo >= iUo2) {
            if (iUo <= iUo2) {
                int iRl = ((eO) AnimatedContent.getInitialState()).rl();
                int iRl2 = ((eO) AnimatedContent.getTargetState()).rl();
                if (iRl >= iRl2) {
                    if (iRl <= iRl2) {
                        return TBf.j.n(0);
                    }
                }
            }
            return contentTransform2;
        }
        return contentTransform;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Ik(ScrollState scrollState) {
        if (scrollState.ty() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean S(ScrollState scrollState) {
        if (scrollState.ty() == scrollState.az()) {
            return true;
        }
        return false;
    }

    private static final boolean WPU(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final boolean XQ(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(Function1 function1, int i2) {
        function1.invoke(Integer.valueOf(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ty(Function1 function1, int i2) {
        function1.invoke(Integer.valueOf(i2));
        return Unit.INSTANCE;
    }
}
