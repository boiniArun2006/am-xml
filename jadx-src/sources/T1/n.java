package T1;

import GJW.C;
import GJW.Lu;
import GJW.OU;
import GJW.lej;
import GJW.vd;
import ScC.FuwU.pTYaLzzmJSGAPQ;
import TFv.CN3;
import TFv.Wre;
import android.content.Context;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Wre f10135n;
    private final vd nr;
    private final T1.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function1 f10136t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f10137n;

        /* JADX INFO: renamed from: T1.n$j$j, reason: collision with other inner class name */
        static final class C0351j implements CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ n f10139n;

            /* JADX INFO: renamed from: T1.n$j$j$j, reason: collision with other inner class name */
            static final class C0352j extends ContinuationImpl {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                /* synthetic */ Object f10140O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f10141n;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f10142r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                Object f10143t;

                C0352j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f10140O = obj;
                    this.f10142r |= Integer.MIN_VALUE;
                    return C0351j.this.rl(null, this);
                }
            }

            C0351j(n nVar) {
                this.f10139n = nVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
            
                if (r8.rl(r7, r0) != r1) goto L30;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Map map, Continuation continuation) {
                C0352j c0352j;
                C0351j c0351j;
                if (continuation instanceof C0352j) {
                    c0352j = (C0352j) continuation;
                    int i2 = c0352j.f10142r;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0352j.f10142r = i2 - Integer.MIN_VALUE;
                    } else {
                        c0352j = new C0352j(continuation);
                    }
                }
                Object objN = c0352j.f10140O;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0352j.f10142r;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(objN);
                    T1.j jVar = this.f10139n.rl;
                    c0352j.f10141n = this;
                    c0352j.f10143t = map;
                    c0352j.f10142r = 1;
                    objN = jVar.n(c0352j);
                    if (objN != coroutine_suspended) {
                        c0351j = this;
                    }
                    return coroutine_suspended;
                }
                if (i3 == 1) {
                    map = (Map) c0352j.f10143t;
                    c0351j = (C0351j) c0352j.f10141n;
                    ResultKt.throwOnFailure(objN);
                } else {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(objN);
                        return Unit.INSTANCE;
                    }
                    map = (Map) c0352j.f10143t;
                    c0351j = (C0351j) c0352j.f10141n;
                    ResultKt.throwOnFailure(objN);
                    T1.j jVar2 = c0351j.f10139n.rl;
                    c0352j.f10141n = null;
                    c0352j.f10143t = null;
                    c0352j.f10142r = 3;
                }
                if (!Intrinsics.areEqual(map, (Map) objN)) {
                    Function1 function1 = c0351j.f10139n.f10136t;
                    c0352j.f10141n = c0351j;
                    c0352j.f10143t = map;
                    c0352j.f10142r = 2;
                    if (function1.invoke(c0352j) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                T1.j jVar22 = c0351j.f10139n.rl;
                c0352j.f10141n = null;
                c0352j.f10143t = null;
                c0352j.f10142r = 3;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return n.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f10137n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Wre wre = n.this.f10135n;
                C0351j c0351j = new C0351j(n.this);
                this.f10137n = 1;
                if (wre.n(c0351j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public n(Wre experimentsFlow, T1.j store, lej coroutineDispatcher, Function1 onNewSegments) {
        Intrinsics.checkNotNullParameter(experimentsFlow, "experimentsFlow");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        Intrinsics.checkNotNullParameter(onNewSegments, "onNewSegments");
        this.f10135n = experimentsFlow;
        this.rl = store;
        this.f10136t = onNewSegments;
        this.nr = Lu.n(coroutineDispatcher);
    }

    public final void nr() {
        C.nr(this.nr, null, null, new j(null), 3, null);
    }

    public /* synthetic */ n(Wre wre, T1.j jVar, lej lejVar, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(wre, jVar, (i2 & 4) != 0 ? OU.rl() : lejVar, function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(Context context, Wre experimentsFlow, Function1 onNewSegments) {
        this(experimentsFlow, new T1.j(context), null, onNewSegments, 4, null);
        Intrinsics.checkNotNullParameter(context, pTYaLzzmJSGAPQ.EhsJbjw);
        Intrinsics.checkNotNullParameter(experimentsFlow, "experimentsFlow");
        Intrinsics.checkNotNullParameter(onNewSegments, "onNewSegments");
    }
}
