package La;

import CZF.I28;
import Dk.InterfaceC1335n;
import La.Ml;
import La.w6;
import PMG.Ml;
import PMG.w6;
import com.bendingspoons.concierge.domain.entities.Id;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import x0X.n;
import yd.AbstractC2464j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class w6 {

    public static final class j implements Ml.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final n f6137n;
        private final C0217j rl;

        /* JADX INFO: renamed from: La.w6$j$j, reason: collision with other inner class name */
        public static final class C0217j implements Ml.n.j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Function0 f6138n;
            private final C0218j rl;

            /* JADX INFO: renamed from: La.w6$j$j$j, reason: collision with other inner class name */
            public static final class C0218j implements Ml.n.j.InterfaceC0211j {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private final PMG.w6 f6139n;
                private final Interceptor rl;

                /* JADX INFO: Access modifiers changed from: private */
                public static final Response O(HPn.j jVar, Interceptor.Chain it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return (Response) jVar.n().invoke(it);
                }

                @Override // La.Ml.n.j.InterfaceC0211j
                public PMG.w6 rl() {
                    return this.f6139n;
                }

                @Override // La.Ml.n.j.InterfaceC0211j
                public Interceptor t() {
                    return this.rl;
                }

                C0218j(I28.n nVar, final HPn.j jVar) {
                    PMG.w6 w6VarRl = nVar.rl();
                    if (w6VarRl == null) {
                        if (!nVar.n()) {
                            w6VarRl = w6.j.f7700n;
                        } else {
                            w6VarRl = w6.n.f7701n;
                        }
                    }
                    this.f6139n = w6VarRl;
                    this.rl = new Interceptor() { // from class: La.n
                        @Override // okhttp3.Interceptor
                        public final Response intercept(Interceptor.Chain chain) {
                            return w6.j.C0217j.C0218j.O(jVar, chain);
                        }
                    };
                }

                @Override // La.Ml.n.j.InterfaceC0211j
                public Function0 n() {
                    return Ml.n.j.InterfaceC0211j.C0212j.n(this);
                }
            }

            @Override // La.Ml.n.j
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public C0218j n() {
                return this.rl;
            }

            @Override // La.Ml.n.j
            public Function0 rl() {
                return this.f6138n;
            }

            C0217j(final I28.n nVar, HPn.j jVar) {
                this.f6138n = new Function0() { // from class: La.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(w6.j.C0217j.nr(nVar));
                    }
                };
                this.rl = new C0218j(nVar, jVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean nr(I28.n nVar) {
                return nVar.n();
            }
        }

        public static final class n implements Ml.n.InterfaceC0214n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Ml.n.InterfaceC0214n.AbstractC0215n f6140n;
            private final C0219j rl;

            /* JADX INFO: renamed from: La.w6$j$n$j, reason: collision with other inner class name */
            public static final class C0219j implements Ml.n.InterfaceC0214n.j {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private final String f6141n;
                private final Function1 rl;

                /* JADX INFO: renamed from: La.w6$j$n$j$j, reason: collision with other inner class name */
                static final class C0220j extends SuspendLambda implements Function1 {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    int f6142n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ InterfaceC1335n f6143t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0220j(InterfaceC1335n interfaceC1335n, Continuation continuation) {
                        super(1, continuation);
                        this.f6143t = interfaceC1335n;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Continuation continuation) {
                        return new C0220j(this.f6143t, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = this.f6142n;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            InterfaceC1335n interfaceC1335n = this.f6143t;
                            Id.Predefined.Internal.j jVar = Id.Predefined.Internal.j.J2;
                            this.f6142n = 1;
                            obj = interfaceC1335n.O(jVar, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        x0X.n w6Var = (x0X.n) obj;
                        if (!(w6Var instanceof n.C1266n)) {
                            if (w6Var instanceof n.w6) {
                                w6Var = new n.w6(((Id.Predefined.Internal) ((n.w6) w6Var).n()).getValue());
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        return AbstractC2464j.n(w6Var);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(Continuation continuation) {
                        return ((C0220j) create(continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                @Override // La.Ml.n.InterfaceC0214n.j
                public Function1 n() {
                    return this.rl;
                }

                @Override // La.Ml.n.InterfaceC0214n.j
                public String t() {
                    return this.f6141n;
                }

                C0219j(I28.n nVar, InterfaceC1335n interfaceC1335n) {
                    this.f6141n = nVar.t();
                    this.rl = new C0220j(interfaceC1335n, null);
                }
            }

            @Override // La.Ml.n.InterfaceC0214n
            public Ml.n.InterfaceC0214n.AbstractC0215n n() {
                return this.f6140n;
            }

            @Override // La.Ml.n.InterfaceC0214n
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public C0219j rl() {
                return this.rl;
            }

            n(I28.n nVar, InterfaceC1335n interfaceC1335n) {
                PMG.Ml mlUo = nVar.Uo();
                if (mlUo instanceof Ml.j) {
                    Ml.j jVar = (Ml.j) mlUo;
                    this.f6140n = new Ml.n.InterfaceC0214n.AbstractC0215n.j(jVar.rl(), q3M.I28.rl(q3M.n.rl, jVar.t(), jVar.n(), jVar.nr()));
                    this.rl = new C0219j(nVar, interfaceC1335n);
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        @Override // La.Ml.n
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public n rl() {
            return this.f6137n;
        }

        @Override // La.Ml.n
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public C0217j n() {
            return this.rl;
        }

        j(I28.n nVar, InterfaceC1335n interfaceC1335n, HPn.j jVar) {
            this.f6137n = new n(nVar, interfaceC1335n);
            this.rl = new C0217j(nVar, jVar);
        }
    }

    public static final class n implements HPn.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f6144n;

        @Override // HPn.n
        public String n() {
            return this.f6144n;
        }

        n(I28.n nVar) {
            this.f6144n = WYs.j.f11519n.n().n(nVar.O());
        }
    }

    public static final Ml.n n(I28.j jVar, I28.n config, InterfaceC1335n concierge) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(concierge, "concierge");
        return new j(config, concierge, HPn.j.f3890n.n(new n(config)));
    }
}
