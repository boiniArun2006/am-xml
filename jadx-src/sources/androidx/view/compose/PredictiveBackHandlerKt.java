package androidx.view.compose;

import GJW.vd;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.LifecycleOwner;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a\\\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002A\u0010\f\u001a=\b\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u000f\u0012\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010²\u0006G\u0010\u000f\u001a=\b\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u000f\u0012\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "enabled", "Lkotlin/Function2;", "LTFv/Wre;", "Landroidx/activity/BackEventCompat;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "progress", "Lkotlin/coroutines/Continuation;", "", "", "onBack", c.f62177j, "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "currentOnBack", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPredictiveBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,200:1\n481#2:201\n480#2,4:202\n484#2,2:209\n488#2:215\n1225#3,3:206\n1228#3,3:212\n1225#3,6:216\n1225#3,6:222\n1225#3,6:228\n1225#3,6:235\n480#4:211\n77#5:234\n81#6:241\n*S KotlinDebug\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt\n*L\n80#1:201\n80#1:202,4\n80#1:209,2\n80#1:215\n80#1:206,3\n80#1:212,3\n82#1:216,6\n87#1:222,6\n92#1:228,6\n103#1:235,6\n80#1:211\n101#1:234\n79#1:241\n*E\n"})
public final class PredictiveBackHandlerKt {
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
    public static final void n(final boolean z2, final Function2 function2, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        int i8;
        Composer composerKN = composer.KN(-642000585);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerKN.n(z2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i7 | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            if (composerKN.E2(function2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i5 |= i8;
        }
        if ((i5 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            boolean z3 = true;
            if (i9 != 0) {
                z2 = true;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-642000585, i5, -1, "androidx.activity.compose.PredictiveBackHandler (PredictiveBackHandler.kt:76)");
            }
            State stateCk = SnapshotStateKt.ck(function2, composerKN, (i5 >> 3) & 14);
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN));
                composerKN.o(compositionScopedCoroutineScopeCanceller);
                objIF = compositionScopedCoroutineScopeCanceller;
            }
            vd coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objIF).getCoroutineScope();
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = new PredictiveBackHandlerCallback(z2, coroutineScope, rl(stateCk));
                composerKN.o(objIF2);
            }
            final PredictiveBackHandlerCallback predictiveBackHandlerCallback = (PredictiveBackHandlerCallback) objIF2;
            boolean zP5 = composerKN.p5(rl(stateCk)) | composerKN.p5(coroutineScope);
            Object objIF3 = composerKN.iF();
            if (zP5 || objIF3 == companion.n()) {
                predictiveBackHandlerCallback.HI(rl(stateCk));
                predictiveBackHandlerCallback.Ik(coroutineScope);
                composerKN.o(Unit.INSTANCE);
            }
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zE2 = composerKN.E2(predictiveBackHandlerCallback);
            int i10 = i5 & 14;
            if (i10 != 4) {
                z3 = false;
            }
            boolean z4 = zE2 | z3;
            Object objIF4 = composerKN.iF();
            if (z4 || objIF4 == companion.n()) {
                objIF4 = new PredictiveBackHandlerKt$PredictiveBackHandler$2$1(predictiveBackHandlerCallback, z2, null);
                composerKN.o(objIF4);
            }
            EffectsKt.O(boolValueOf, (Function2) objIF4, composerKN, i10);
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwnerN = LocalOnBackPressedDispatcherOwner.f13286n.n(composerKN, 6);
            if (onBackPressedDispatcherOwnerN != null) {
                final OnBackPressedDispatcher onBackPressedDispatcher = onBackPressedDispatcherOwnerN.getOnBackPressedDispatcher();
                final LifecycleOwner lifecycleOwner = (LifecycleOwner) composerKN.ty(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                boolean zE22 = composerKN.E2(onBackPressedDispatcher) | composerKN.E2(lifecycleOwner) | composerKN.E2(predictiveBackHandlerCallback);
                Object objIF5 = composerKN.iF();
                if (zE22 || objIF5 == companion.n()) {
                    objIF5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                            onBackPressedDispatcher.xMQ(lifecycleOwner, predictiveBackHandlerCallback);
                            final PredictiveBackHandlerCallback predictiveBackHandlerCallback2 = predictiveBackHandlerCallback;
                            return new DisposableEffectResult() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$3$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void n() {
                                    predictiveBackHandlerCallback2.gh();
                                }
                            };
                        }
                    };
                    composerKN.o(objIF5);
                }
                EffectsKt.n(lifecycleOwner, onBackPressedDispatcher, (Function1) objIF5, composerKN, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            } else {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i11) {
                    PredictiveBackHandlerKt.n(z2, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    private static final Function2 rl(State state) {
        return (Function2) state.getValue();
    }
}
