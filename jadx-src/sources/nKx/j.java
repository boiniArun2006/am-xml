package nKx;

import TFv.CN3;
import TFv.Wre;
import TFv.fuX;
import androidx.content.core.DataStore;
import com.google.protobuf.g9s;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class j {

    /* JADX INFO: renamed from: nKx.j$j, reason: collision with other inner class name */
    static final class C1064j extends SuspendLambda implements Function3 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Object f71043O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71044n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f71045t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1064j(Object obj, Continuation continuation) {
            super(3, continuation);
            this.f71043O = obj;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CN3 cn3, Throwable th, Continuation continuation) {
            C1064j c1064j = new C1064j(this.f71043O, continuation);
            c1064j.f71045t = cn3;
            return c1064j.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f71044n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                CN3 cn3 = (CN3) this.f71045t;
                Object obj2 = this.f71043O;
                this.f71044n = 1;
                if (cn3.rl(obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f71046O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71047n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f71048t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f71046O = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = new n(this.f71046O, continuation);
            nVar.f71048t = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f71047n == 0) {
                ResultKt.throwOnFailure(obj);
                return j.n((g9s) this.f71048t, this.f71046O);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g9s g9sVar, Continuation continuation) {
            return ((n) create(g9sVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final g9s n(g9s g9sVar, Function1 action) {
        Intrinsics.checkNotNullParameter(g9sVar, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        g9s.n builder = g9sVar.toBuilder();
        action.invoke(builder);
        g9s g9sVarBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(g9sVarBuild, "build(...)");
        return g9sVarBuild;
    }

    public static final Object nr(DataStore dataStore, Function1 function1, Continuation continuation) {
        Object objN = dataStore.n(new n(function1, null), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    public static final Wre t(DataStore dataStore, Object obj) {
        Intrinsics.checkNotNullParameter(dataStore, "<this>");
        return fuX.Uo(dataStore.getData(), new C1064j(obj, null));
    }

    public static final Object rl(DataStore dataStore, Object obj, Continuation continuation) {
        return fuX.ViF(t(dataStore, obj), continuation);
    }
}
