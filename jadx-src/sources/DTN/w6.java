package DTN;

import DSG.Wre;
import DTN.w6;
import GJW.vd;
import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.SwitchKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.view.compose.FlowExtKt;
import bH.CN3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class w6 {

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Context f1491n;

        /* JADX INFO: renamed from: DTN.w6$j$j, reason: collision with other inner class name */
        static final class C0058j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ MutableState f1492O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f1493n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Ml f1494t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C0058j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0058j(Ml ml, MutableState mutableState, Continuation continuation) {
                super(2, continuation);
                this.f1494t = ml;
                this.f1492O = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0058j(this.f1494t, this.f1492O, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1493n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Ml ml = this.f1494t;
                    boolean zO = j.O(this.f1492O);
                    this.f1493n = 1;
                    if (ml.rl(zO, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        j(Context context) {
            this.f1491n = context;
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
                ComposerKt.p5(-856968934, i2, -1, "com.bendingspoons.theirs.providerInstaller.registerProviderInstallerItems.<anonymous> (SecretMenuItems.kt:31)");
            }
            Ml ml = new Ml(this.f1491n);
            State stateRl = FlowExtKt.rl(ml.n(), null, null, null, null, composer, 48, 14);
            Boolean boolNr = nr(stateRl);
            if (boolNr != null) {
                composer.eF(-2120487152);
                Object objIF = composer.iF();
                Composer.Companion companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                    objIF = SnapshotStateKt__SnapshotStateKt.O(boolNr, null, 2, null);
                    composer.o(objIF);
                }
                final MutableState mutableState = (MutableState) objIF;
                composer.Xw();
                Modifier modifierXMQ = PaddingKt.xMQ(Modifier.INSTANCE, Dp.KN(2));
                Boolean boolNr2 = nr(stateRl);
                Intrinsics.checkNotNull(boolNr2, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = boolNr2.booleanValue();
                composer.eF(-2120479404);
                Object objIF2 = composer.iF();
                if (objIF2 == companion.n()) {
                    objIF2 = new Function1() { // from class: DTN.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return w6.j.Uo(mutableState, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.o(objIF2);
                }
                composer.Xw();
                SwitchKt.n(zBooleanValue, (Function1) objIF2, modifierXMQ, false, null, null, composer, 432, 56);
                Boolean boolValueOf = Boolean.valueOf(O(mutableState));
                composer.eF(-2120474482);
                boolean zE2 = composer.E2(ml);
                Object objIF3 = composer.iF();
                if (zE2 || objIF3 == companion.n()) {
                    objIF3 = new C0058j(ml, mutableState, null);
                    composer.o(objIF3);
                }
                composer.Xw();
                EffectsKt.O(boolValueOf, (Function2) objIF3, composer, 0);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        private static final void J2(MutableState mutableState, boolean z2) {
            mutableState.setValue(Boolean.valueOf(z2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean O(MutableState mutableState) {
            return ((Boolean) mutableState.getValue()).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Uo(MutableState mutableState, boolean z2) {
            J2(mutableState, z2);
            return Unit.INSTANCE;
        }

        private static final Boolean nr(State state) {
            return (Boolean) state.getValue();
        }
    }

    public static final void n(bH.CN3 cn3, Context context) {
        Intrinsics.checkNotNullParameter(cn3, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        cn3.t(CN3.I28.f43224n, CollectionsKt.listOf(new Wre.Ml("Security", "🔒", null, CollectionsKt.listOf(new Wre.n("Simulate outdated security provider", "🥸", "Simulates the presence of an outdated Android security provider, to test the update flow. You may need to close the app.", ComposableLambdaKt.rl(-856968934, true, new j(context)))), 4, null)));
    }
}
