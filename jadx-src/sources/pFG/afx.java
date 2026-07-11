package pFG;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.view.HasDefaultViewModelProviderFactory;
import androidx.view.ViewModel;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStoreOwner;
import androidx.view.compose.FlowExtKt;
import androidx.view.viewmodel.CreationExtras;
import androidx.view.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.view.viewmodel.compose.ViewModelKt;
import com.bendingspoons.secretmenu.ui.items.exit.ExitActivity;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import com.safedk.android.internal.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import ktm.j;
import pFG.DAz;
import pFG.Z;
import pFG.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class afx {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f71780O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71781n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ew f71782t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Ew ew, Context context, Continuation continuation) {
            super(2, continuation);
            this.f71782t = ew;
            this.f71780O = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f71782t, this.f71780O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f71781n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Ew ew = this.f71782t;
                Context context = this.f71780O;
                this.f71781n = 1;
                if (afx.te(ew, context, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    static final class n implements TFv.CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Context f71783n;

        n(Context context) {
            this.f71783n = context;
        }

        @Override // TFv.CN3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object rl(DAz dAz, Continuation continuation) {
            if (dAz instanceof DAz.n) {
                Toast.makeText(this.f71783n, "Experiment segments successfully updated.", 0).show();
                ExitActivity.INSTANCE.n(this.f71783n);
            } else if (dAz instanceof DAz.j) {
                Toast.makeText(this.f71783n, ((DAz.j) dAz).n(), 0).show();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(int i2, Composer composer, int i3) {
        ty(composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(Ew ew, w6 w6Var, MutableState mutableState, j.C1041j c1041j) {
        ew.XQ(((w6.n) w6Var).n().rl(), c1041j);
        mutableState.setValue(w6.j.f71838n);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WPU(xWk.j jVar, S3.w6 w6Var, int i2, Composer composer, int i3) {
        ck(jVar, w6Var, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit XQ(MutableState mutableState) {
        mutableState.setValue(w6.j.f71838n);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(Z.n nVar, int i2, Composer composer, int i3) {
        qie(nVar, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void ck(final xWk.j experimentsUseCase, final S3.w6 favouriteExperimentRepository, Composer composer, final int i2) {
        int i3;
        MutableState mutableState;
        final MutableState mutableState2;
        Intrinsics.checkNotNullParameter(experimentsUseCase, "experimentsUseCase");
        Intrinsics.checkNotNullParameter(favouriteExperimentRepository, "favouriteExperimentRepository");
        Composer composerKN = composer.KN(-1131120796);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerKN.p5(experimentsUseCase) : composerKN.E2(experimentsUseCase) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? composerKN.p5(favouriteExperimentRepository) : composerKN.E2(favouriteExperimentRepository) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1131120796, i3, -1, "com.bendingspoons.experiments.secretmenu.items.experiments.ExperimentsScreen (ExperimentsScreen.kt:36)");
            }
            ViewModelProvider.Factory factoryRl = Ew.qie.rl(experimentsUseCase, favouriteExperimentRepository);
            composerKN.te(1729797275);
            ViewModelStoreOwner viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composerKN, 6);
            if (viewModelStoreOwnerT == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModel viewModelT = ViewModelKt.t(Reflection.getOrCreateKotlinClass(Ew.class), viewModelStoreOwnerT, null, factoryRl, viewModelStoreOwnerT instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerT).getDefaultViewModelCreationExtras() : CreationExtras.Empty.f39070t, composerKN, 0, 0);
            composerKN.M7();
            final Ew ew = (Ew) viewModelT;
            Context context = (Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo());
            Unit unit = Unit.INSTANCE;
            composerKN.eF(2130405822);
            boolean zE2 = composerKN.E2(ew) | composerKN.E2(context);
            Object objIF = composerKN.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new j(ew, context, null);
                composerKN.o(objIF);
            }
            composerKN.Xw();
            EffectsKt.O(unit, (Function2) objIF, composerKN, 6);
            State stateT = FlowExtKt.t(ew.ty(), null, null, null, composerKN, 0, 7);
            composerKN.eF(2130411937);
            Object objIF2 = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF2 == companion.n()) {
                objIF2 = SnapshotStateKt__SnapshotStateKt.O(w6.j.f71838n, null, 2, null);
                composerKN.o(objIF2);
            }
            final MutableState mutableState3 = (MutableState) objIF2;
            composerKN.Xw();
            Z zIk = Ik(stateT);
            if (zIk instanceof Z.j) {
                composerKN.eF(1618418740);
                Z.j jVar = (Z.j) zIk;
                composerKN.eF(2130430448);
                boolean zE22 = composerKN.E2(ew);
                Object objIF3 = composerKN.iF();
                if (zE22 || objIF3 == companion.n()) {
                    objIF3 = new Function1() { // from class: pFG.z
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return afx.aYN(ew, ((Boolean) obj).booleanValue());
                        }
                    };
                    composerKN.o(objIF3);
                }
                Function1 function1 = (Function1) objIF3;
                composerKN.Xw();
                composerKN.eF(2130433331);
                boolean zE23 = composerKN.E2(ew);
                Object objIF4 = composerKN.iF();
                if (zE23 || objIF4 == companion.n()) {
                    objIF4 = new Function1() { // from class: pFG.l3D
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return afx.ViF(ew, ((Boolean) obj).booleanValue());
                        }
                    };
                    composerKN.o(objIF4);
                }
                Function1 function12 = (Function1) objIF4;
                composerKN.Xw();
                composerKN.eF(2130435814);
                boolean zE24 = composerKN.E2(ew);
                Object objIF5 = composerKN.iF();
                if (zE24 || objIF5 == companion.n()) {
                    objIF5 = new Function1() { // from class: pFG.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return afx.nY(ew, (String) obj);
                        }
                    };
                    composerKN.o(objIF5);
                }
                Function1 function13 = (Function1) objIF5;
                composerKN.Xw();
                composerKN.eF(2130419894);
                Object objIF6 = composerKN.iF();
                if (objIF6 == companion.n()) {
                    objIF6 = new Function1() { // from class: pFG.s4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return afx.r(mutableState3, (CN3) obj);
                        }
                    };
                    composerKN.o(objIF6);
                }
                Function1 function14 = (Function1) objIF6;
                composerKN.Xw();
                composerKN.eF(2130423726);
                boolean zE25 = composerKN.E2(ew);
                Object objIF7 = composerKN.iF();
                if (zE25 || objIF7 == companion.n()) {
                    objIF7 = new Function1() { // from class: pFG.UGc
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return afx.o(ew, (CN3) obj);
                        }
                    };
                    composerKN.o(objIF7);
                }
                Function1 function15 = (Function1) objIF7;
                composerKN.Xw();
                composerKN.eF(2130427230);
                boolean zE26 = composerKN.E2(ew);
                Object objIF8 = composerKN.iF();
                if (zE26 || objIF8 == companion.n()) {
                    objIF8 = new Function0() { // from class: pFG.Q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return afx.Z(ew);
                        }
                    };
                    composerKN.o(objIF8);
                }
                composerKN.Xw();
                mutableState = mutableState3;
                Pl.t(null, jVar, function1, function12, function13, function14, function15, (Function0) objIF8, composerKN, 196608, 1);
                composerKN.Xw();
            } else {
                mutableState = mutableState3;
                if (Intrinsics.areEqual(zIk, Z.w6.f71777n)) {
                    composerKN.eF(2130438463);
                    ty(composerKN, 0);
                    composerKN.Xw();
                } else {
                    if (!(zIk instanceof Z.n)) {
                        composerKN.eF(2130414861);
                        composerKN.Xw();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerKN.eF(2130440585);
                    qie((Z.n) zIk, composerKN, 0);
                    composerKN.Xw();
                }
            }
            final w6 w6Var = (w6) mutableState.getValue();
            if (w6Var instanceof w6.n) {
                w6.n nVar = (w6.n) w6Var;
                if (nVar.n().n().isEmpty()) {
                    mutableState.setValue(w6.j.f71838n);
                } else {
                    composerKN.eF(2130450491);
                    Object objIF9 = composerKN.iF();
                    if (objIF9 == companion.n()) {
                        mutableState2 = mutableState;
                        objIF9 = new Function0() { // from class: pFG.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return afx.XQ(mutableState2);
                            }
                        };
                        composerKN.o(objIF9);
                    } else {
                        mutableState2 = mutableState;
                    }
                    Function0 function0 = (Function0) objIF9;
                    composerKN.Xw();
                    composerKN.eF(2130453448);
                    boolean zE27 = composerKN.E2(ew) | composerKN.p5(w6Var);
                    Object objIF10 = composerKN.iF();
                    if (zE27 || objIF10 == companion.n()) {
                        objIF10 = new Function1() { // from class: pFG.SPz
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return afx.S(ew, w6Var, mutableState2, (j.C1041j) obj);
                            }
                        };
                        composerKN.o(objIF10);
                    }
                    composerKN.Xw();
                    lej.rl(nVar, function0, (Function1) objIF10, composerKN, 48);
                }
            } else if (!Intrinsics.areEqual(w6Var, w6.j.f71838n)) {
                throw new NoWhenBranchMatchedException();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pFG.ci
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return afx.WPU(experimentsUseCase, favouriteExperimentRepository, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nY(Ew ew, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ew.ck(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Ew ew, CN3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ew.HI(it);
        return Unit.INSTANCE;
    }

    private static final void qie(final Z.n nVar, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerKN = composer.KN(1142464471);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(nVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1142464471, i3, -1, "com.bendingspoons.experiments.secretmenu.items.experiments.ExperimentsErrorScreen (ExperimentsScreen.kt:119)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierJ2 = SizeKt.J2(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.O(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierJ2);
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
            Modifier modifierViF = SizeKt.ViF(companion, Dp.KN(d.f62986a));
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), companion2.Uo(), composerKN, 48);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierViF);
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
            composer2 = composerKN;
            TextKt.t(nVar.n(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.f26164n.t(composerKN, MaterialTheme.rl).getBodyMedium(), composer2, 0, 0, 65534);
            composer2.XQ();
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pFG.g9s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return afx.az(nVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(MutableState mutableState, CN3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(new w6.n(it));
        return Unit.INSTANCE;
    }

    private static final void ty(Composer composer, final int i2) {
        Composer composer2;
        Composer composerKN = composer.KN(-748649101);
        if (i2 == 0 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-748649101, i2, -1, YjqZUJsVmhcjko.CeViipt);
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierJ2 = SizeKt.J2(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.O(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierJ2);
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
            Modifier modifierViF = SizeKt.ViF(companion, Dp.KN(d.f62986a));
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), companion2.Uo(), composerKN, 48);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierViF);
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
            ProgressIndicatorKt.az(PaddingKt.az(SizeKt.KN(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.KN(8), 7, null), 0L, 0L, 0, 0.0f, composerKN, 6, 30);
            composer2 = composerKN;
            TextKt.t("Loading experiments...", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.f26164n.t(composerKN, MaterialTheme.rl).getBodyMedium(), composer2, 6, 0, 65534);
            composer2.XQ();
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pFG.QJ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return afx.HI(i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final Z Ik(State state) {
        return (Z) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ViF(Ew ew, boolean z2) {
        ew.r(z2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(Ew ew) {
        ew.qie();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit aYN(Ew ew, boolean z2) {
        ew.o(z2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object te(Ew ew, Context context, Continuation continuation) {
        Object objN = ew.az().n(new n(context), continuation);
        if (objN == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objN;
        }
        return Unit.INSTANCE;
    }
}
