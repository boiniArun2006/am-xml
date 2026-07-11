package f52;

import GJW.vd;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.State;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class SPz {

    static final class j extends SuspendLambda implements Function2 {
        final /* synthetic */ MutableIntState J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ MutableFloatState f66495O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66496n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ MutableLongState f66497r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ LazyStaggeredGridState f66498t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(LazyStaggeredGridState lazyStaggeredGridState, MutableFloatState mutableFloatState, MutableIntState mutableIntState, MutableLongState mutableLongState, Continuation continuation) {
            super(2, continuation);
            this.f66498t = lazyStaggeredGridState;
            this.f66495O = mutableFloatState;
            this.J2 = mutableIntState;
            this.f66497r = mutableLongState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f66498t, this.f66495O, this.J2, this.f66497r, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f66496n == 0) {
                ResultKt.throwOnFailure(obj);
                long jCurrentTimeMillis = System.currentTimeMillis();
                int iAbs = Math.abs(this.f66498t.o() - SPz.J2(this.J2));
                long jKN = jCurrentTimeMillis - SPz.KN(this.f66497r);
                MutableFloatState mutableFloatState = this.f66495O;
                float f3 = 0.0f;
                if (this.f66498t.t() && jKN > 0) {
                    f3 = (iAbs / jKN) * 1000;
                }
                mutableFloatState.Z(f3);
                SPz.Uo(this.J2, this.f66498t.o());
                SPz.xMQ(this.f66497r, jCurrentTimeMillis);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final State O(LazyStaggeredGridState lazyStaggeredGridState, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridState, "<this>");
        composer.eF(-1546909776);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1546909776, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.templates.rememberScrollVelocity (Utils.kt:17)");
        }
        composer.eF(1775118795);
        int i3 = (i2 & 14) ^ 6;
        boolean z2 = true;
        boolean z3 = (i3 > 4 && composer.p5(lazyStaggeredGridState)) || (i2 & 6) == 4;
        Object objIF = composer.iF();
        if (z3 || objIF == Composer.INSTANCE.n()) {
            objIF = PrimitiveSnapshotStateKt.n(0.0f);
            composer.o(objIF);
        }
        MutableFloatState mutableFloatState = (MutableFloatState) objIF;
        composer.Xw();
        composer.eF(1775120854);
        Object objIF2 = composer.iF();
        Composer.Companion companion = Composer.INSTANCE;
        if (objIF2 == companion.n()) {
            objIF2 = SnapshotIntStateKt.n(lazyStaggeredGridState.o());
            composer.o(objIF2);
        }
        MutableIntState mutableIntState = (MutableIntState) objIF2;
        composer.Xw();
        composer.eF(1775123228);
        Object objIF3 = composer.iF();
        if (objIF3 == companion.n()) {
            objIF3 = SnapshotLongStateKt.n(System.currentTimeMillis());
            composer.o(objIF3);
        }
        MutableLongState mutableLongState = (MutableLongState) objIF3;
        composer.Xw();
        Boolean boolValueOf = Boolean.valueOf(lazyStaggeredGridState.t());
        Integer numValueOf = Integer.valueOf(lazyStaggeredGridState.o());
        composer.eF(1775127531);
        if ((i3 <= 4 || !composer.p5(lazyStaggeredGridState)) && (i2 & 6) != 4) {
            z2 = false;
        }
        boolean zP5 = composer.p5(mutableFloatState) | z2;
        Object objIF4 = composer.iF();
        if (zP5 || objIF4 == companion.n()) {
            Object jVar = new j(lazyStaggeredGridState, mutableFloatState, mutableIntState, mutableLongState, null);
            composer.o(jVar);
            objIF4 = jVar;
        }
        composer.Xw();
        EffectsKt.nr(boolValueOf, numValueOf, (Function2) objIF4, composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return mutableFloatState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int J2(MutableIntState mutableIntState) {
        return mutableIntState.J2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KN(MutableLongState mutableLongState) {
        return mutableLongState.rl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo(MutableIntState mutableIntState, int i2) {
        mutableIntState.KN(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ(MutableLongState mutableLongState, long j2) {
        mutableLongState.nY(j2);
    }
}
