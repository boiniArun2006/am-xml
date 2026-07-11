package juU;

import TFv.CN3;
import TFv.Wre;
import juU.Ml;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j implements Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PI.j f69629n;

    /* JADX INFO: renamed from: juU.j$j, reason: collision with other inner class name */
    public static final class C1000j implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Wre f69630n;

        /* JADX INFO: renamed from: juU.j$j$j, reason: collision with other inner class name */
        public static final class C1001j implements CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ CN3 f69631n;

            /* JADX INFO: renamed from: juU.j$j$j$j, reason: collision with other inner class name */
            public static final class C1002j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f69633n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f69634t;

                public C1002j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f69633n = obj;
                    this.f69634t |= Integer.MIN_VALUE;
                    return C1001j.this.rl(null, this);
                }
            }

            public C1001j(CN3 cn3) {
                this.f69631n = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C1002j c1002j;
                if (continuation instanceof C1002j) {
                    c1002j = (C1002j) continuation;
                    int i2 = c1002j.f69634t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1002j.f69634t = i2 - Integer.MIN_VALUE;
                    } else {
                        c1002j = new C1002j(continuation);
                    }
                }
                Object obj2 = c1002j.f69633n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c1002j.f69634t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    CN3 cn3 = this.f69631n;
                    Ml.j jVar = ((Boolean) obj).booleanValue() ? Ml.j.f69627n : Ml.j.f69628t;
                    c1002j.f69634t = 1;
                    if (cn3.rl(jVar, c1002j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public C1000j(Wre wre) {
            this.f69630n = wre;
        }

        @Override // TFv.Wre
        public Object n(CN3 cn3, Continuation continuation) {
            Object objN = this.f69630n.n(new C1001j(cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    public j(PI.j appLifecycleObserver) {
        Intrinsics.checkNotNullParameter(appLifecycleObserver, "appLifecycleObserver");
        this.f69629n = appLifecycleObserver;
    }

    @Override // juU.Ml
    public Wre n() {
        return new C1000j(this.f69629n.T());
    }
}
