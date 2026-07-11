package S2;

import TFv.fuX;
import androidx.content.core.DataStore;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DataStore f8910n;

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f8911n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ S2.j f8912t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(S2.j jVar, Continuation continuation) {
            super(2, continuation);
            this.f8912t = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f8912t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f8911n == 0) {
                ResultKt.throwOnFailure(obj);
                return this.f8912t;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(S2.j jVar, Continuation continuation) {
            return ((j) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public Ml(DataStore dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.f8910n = dataStore;
    }

    public final Object n(Continuation continuation) {
        return fuX.g(this.f8910n.getData(), continuation);
    }

    public final Object rl(S2.j jVar, Continuation continuation) {
        Object objN = this.f8910n.n(new j(jVar, null), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }
}
