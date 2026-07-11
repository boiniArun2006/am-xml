package Si;

import GJW.OU;
import GJW.h;
import GJW.vd;
import Sbr.j;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SceneHolderState;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class aC {

    static final class j extends SuspendLambda implements Function2 {
        final /* synthetic */ CountDownLatch J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f9833O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f9834n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f9835t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Function2 function2, CountDownLatch countDownLatch, Continuation continuation) {
            super(2, continuation);
            this.f9833O = function2;
            this.J2 = countDownLatch;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(this.f9833O, this.J2, continuation);
            jVar.f9835t = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f9834n;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    vd vdVar = (vd) this.f9835t;
                    Function2 function2 = this.f9833O;
                    this.f9834n = 1;
                    if (function2.invoke(vdVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.J2.countDown();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.J2.countDown();
                throw th;
            }
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f9836O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f9837n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f9838t;

        static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f9839O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef f9840n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ C0322n f9841t;

            /* JADX INFO: renamed from: Si.aC$n$j$j, reason: collision with other inner class name */
            static final class C0321j extends ContinuationImpl {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                /* synthetic */ Object f9842O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f9843n;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f9844r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                Object f9845t;

                C0321j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f9842O = obj;
                    this.f9844r |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            j(Ref.ObjectRef objectRef, C0322n c0322n, TFv.CN3 cn3) {
                this.f9840n = objectRef;
                this.f9841t = c0322n;
                this.f9839O = cn3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0321j c0321j;
                j jVar;
                T t3;
                if (continuation instanceof C0321j) {
                    c0321j = (C0321j) continuation;
                    int i2 = c0321j.f9844r;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0321j.f9844r = i2 - Integer.MIN_VALUE;
                    } else {
                        c0321j = new C0321j(continuation);
                    }
                }
                Object obj2 = c0321j.f9842O;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0321j.f9844r;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    T t4 = this.f9840n.element;
                    if (t4 != this.f9841t) {
                        TFv.CN3 cn3 = this.f9839O;
                        Pair pair = TuplesKt.to(t4, obj);
                        c0321j.f9843n = this;
                        c0321j.f9845t = obj;
                        c0321j.f9844r = 1;
                        if (cn3.rl(pair, c0321j) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    jVar = this;
                    t3 = obj;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj3 = c0321j.f9845t;
                    jVar = (j) c0321j.f9843n;
                    ResultKt.throwOnFailure(obj2);
                    t3 = obj3;
                }
                jVar.f9840n.element = t3;
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: Si.aC$n$n, reason: collision with other inner class name */
        public static final class C0322n {
            C0322n() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(TFv.Wre wre, Continuation continuation) {
            super(2, continuation);
            this.f9836O = wre;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = new n(this.f9836O, continuation);
            nVar.f9838t = obj;
            return nVar;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [Si.aC$n$n, T] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f9837n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.CN3 cn3 = (TFv.CN3) this.f9838t;
                ?? c0322n = new C0322n();
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = c0322n;
                TFv.Wre wre = this.f9836O;
                j jVar = new j(objectRef, c0322n, cn3);
                this.f9837n = 1;
                if (wre.n(jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
            return ((n) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static /* synthetic */ Pl J2(SceneHolder sceneHolder, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return O(sceneHolder, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean KN(j.n nVar) {
        if (nVar instanceof j.n.C0316j) {
            return ((j.n.C0316j) nVar).t();
        }
        if (Intrinsics.areEqual(nVar, j.n.C0317n.f9787n)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pl O(SceneHolder sceneHolder, int i2) {
        return new Pl(new SceneHolderState(sceneHolder.getScene(), sceneHolder.getSelection(), sceneHolder.getEditMode(), sceneHolder.getUserPreviewMode(), sceneHolder.getEditCategory()), i2, sceneHolder.getEditMode(), sceneHolder.getSpoidEnv(), sceneHolder.getEditingSerial());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j.n.C0316j Uo(j.w6 w6Var) {
        j.w6.C0318j c0318j = w6Var instanceof j.w6.C0318j ? (j.w6.C0318j) w6Var : null;
        j.n nVarT = c0318j != null ? c0318j.t() : null;
        if (nVarT instanceof j.n.C0316j) {
            return (j.n.C0316j) nVarT;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TFv.Wre gh(TFv.Wre wre) {
        return TFv.fuX.iF(new n(wre, null));
    }

    static /* synthetic */ void mUb(vd vdVar, long j2, CoroutineContext coroutineContext, h hVar, Function2 function2, int i2, Object obj) throws InterruptedException {
        if ((i2 & 2) != 0) {
            coroutineContext = OU.n();
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i2 & 4) != 0) {
            hVar = h.J2;
        }
        xMQ(vdVar, j2, coroutineContext2, hVar, function2);
    }

    private static final void xMQ(vd vdVar, long j2, CoroutineContext coroutineContext, h hVar, Function2 function2) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        GJW.Dsr.t(vdVar, coroutineContext, hVar, new j(function2, countDownLatch, null));
        countDownLatch.await(j2, TimeUnit.MILLISECONDS);
    }
}
