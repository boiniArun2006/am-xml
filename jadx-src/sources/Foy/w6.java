package Foy;

import Foy.j;
import GJW.Qik;
import GJW.vd;
import K6D.Ml;
import dI8.n;
import k.InterfaceC2202n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.TimeoutCancellationException;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class w6 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Foy.j f3201O;
    private final c3.j nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final rB.Ml f3202t;

    public static final class j extends SuspendLambda implements Function2 {
        final /* synthetic */ Ref.ObjectRef J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f3203O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Function1 f3204Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3205n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ pq.Ml f3206o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f3207r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ w6 f3208t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Continuation continuation, w6 w6Var, String str, Ref.ObjectRef objectRef, String str2, pq.Ml ml, Function1 function1) {
            super(2, continuation);
            this.f3208t = w6Var;
            this.f3203O = str;
            this.J2 = objectRef;
            this.f3207r = str2;
            this.f3206o = ml;
            this.f3204Z = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(continuation, this.f3208t, this.f3203O, this.J2, this.f3207r, this.f3206o, this.f3204Z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            T tNr;
            K6D.Ml mlO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3205n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Foy.j jVarJ2 = this.f3208t.J2();
                String str = this.f3203O;
                this.f3205n = 1;
                obj = jVarJ2.t(str, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            x0X.n nVar = (x0X.n) obj;
            if (nVar != null) {
                return nVar;
            }
            Ref.ObjectRef objectRef = this.J2;
            k.Ml mlAz = this.f3208t.Uo().az(this.f3203O, this.f3207r, this.f3206o);
            this.f3208t.xMQ().invoke(mlAz);
            rB.Ml mlKN = this.f3208t.KN();
            if (mlKN != null && (mlO = mlKN.O()) != null) {
                tNr = Ml.n.nr(mlO, tCX.j.rl(mlAz), null, 2, null);
            } else {
                tNr = 0;
            }
            objectRef.element = tNr;
            Foy.j jVarJ22 = this.f3208t.J2();
            String str2 = this.f3203O;
            int iN = this.f3208t.O().getConfig().n().n();
            long jNr = this.f3208t.O().getConfig().n().nr();
            C0111w6 c0111w6 = new C0111w6(this.f3204Z, null);
            this.f3205n = 2;
            Object objN = Foy.n.n(jVarJ22, str2, iN, jNr, c0111w6, this);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objN;
        }
    }

    static final class n extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f3209O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        /* synthetic */ Object f3211Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f3212g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3213n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        long f3214o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f3215r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3216t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3211Z = obj;
            this.f3212g |= Integer.MIN_VALUE;
            return w6.this.mUb(null, null, null, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: Foy.w6$w6, reason: collision with other inner class name */
    static final class C0111w6 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3217n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f3218t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0111w6(Function1 function1, Continuation continuation) {
            super(1, continuation);
            this.f3218t = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new C0111w6(this.f3218t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3217n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function1 function1 = this.f3218t;
            this.f3217n = 1;
            Object objInvoke = function1.invoke(this);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objInvoke;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((C0111w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public abstract InterfaceC2202n O();

    public abstract Function1 xMQ();

    public w6(k.I28 adType, vd loadScope, rB.Ml ml) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(loadScope, "loadScope");
        this.f3202t = ml != null ? d3.j.nr(ml, adType.rl()) : null;
        this.nr = new c3.j(adType);
        this.f3201O = new Foy.j(loadScope);
    }

    protected final Foy.j J2() {
        return this.f3201O;
    }

    protected final rB.Ml KN() {
        return this.f3202t;
    }

    protected final c3.j Uo() {
        return this.nr;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object mUb(String str, String str2, pq.Ml ml, long j2, Function1 function1, Continuation continuation) {
        n nVar;
        String str3;
        String str4;
        pq.Ml ml2;
        w6 w6Var;
        Ref.ObjectRef objectRef;
        x0X.n c1266n;
        boolean z2;
        long j3 = j2;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f3212g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f3212g = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objT = nVar.f3211Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f3212g;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objT);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                str3 = str;
                str4 = str2;
                ml2 = ml;
            } catch (TimeoutCancellationException unused) {
                str3 = str;
            }
            try {
                j jVar = new j(null, this, str3, objectRef2, str4, ml2, function1);
                nVar.f3213n = this;
                str3 = str;
                try {
                    nVar.f3216t = str3;
                    str4 = str2;
                } catch (TimeoutCancellationException unused2) {
                    str4 = str2;
                    ml2 = ml;
                    w6Var = this;
                    objectRef = objectRef2;
                    c1266n = new n.C1266n(new n.C0837n(j3));
                    z2 = c1266n instanceof n.C1266n;
                    if (z2) {
                    }
                    if (!z2) {
                    }
                    if (z2) {
                    }
                }
                try {
                    nVar.f3209O = str4;
                    ml2 = ml;
                    nVar.J2 = ml2;
                    nVar.f3215r = objectRef2;
                    nVar.f3214o = j3;
                    nVar.f3212g = 1;
                    objT = Qik.t(j3, jVar, nVar);
                    if (objT == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    w6Var = this;
                    objectRef = objectRef2;
                    c1266n = (x0X.n) objT;
                } catch (TimeoutCancellationException unused3) {
                    ml2 = ml;
                    w6Var = this;
                    objectRef = objectRef2;
                    c1266n = new n.C1266n(new n.C0837n(j3));
                    z2 = c1266n instanceof n.C1266n;
                    if (z2) {
                    }
                    if (!z2) {
                    }
                    if (z2) {
                    }
                }
            } catch (TimeoutCancellationException unused4) {
                w6Var = this;
                objectRef = objectRef2;
                c1266n = new n.C1266n(new n.C0837n(j3));
                z2 = c1266n instanceof n.C1266n;
                if (z2) {
                }
                if (!z2) {
                }
                if (z2) {
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = nVar.f3214o;
            objectRef = (Ref.ObjectRef) nVar.f3215r;
            pq.Ml ml3 = (pq.Ml) nVar.J2;
            String str5 = (String) nVar.f3209O;
            String str6 = (String) nVar.f3216t;
            w6Var = (w6) nVar.f3213n;
            try {
                ResultKt.throwOnFailure(objT);
                ml2 = ml3;
                str4 = str5;
                str3 = str6;
            } catch (TimeoutCancellationException unused5) {
                ml2 = ml3;
                str4 = str5;
                str3 = str6;
                c1266n = new n.C1266n(new n.C0837n(j3));
                z2 = c1266n instanceof n.C1266n;
                if (z2) {
                }
                if (!z2) {
                }
                if (z2) {
                }
            }
            try {
                c1266n = (x0X.n) objT;
            } catch (TimeoutCancellationException unused6) {
                c1266n = new n.C1266n(new n.C0837n(j3));
            }
        }
        z2 = c1266n instanceof n.C1266n;
        if (z2) {
            dI8.n nVar2 = (dI8.n) ((n.C1266n) c1266n).n();
            w6Var.f3201O.nr(str3);
            k.Ml mlQie = w6Var.nr.qie(str3, str4, nVar2, ml2);
            w6Var.xMQ().invoke(mlQie);
            K6D.j jVar2 = (K6D.j) objectRef.element;
            if (jVar2 != null) {
                tCX.j.Uo(jVar2, nVar2, "max", mlQie.rl());
            }
        } else if (!(c1266n instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!z2) {
            if (!(c1266n instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            k.Ml mlGh = w6Var.nr.gh(((j.C0109j) ((n.w6) c1266n).n()).n(), str4, ml2);
            w6Var.xMQ().invoke(mlGh);
            K6D.j jVar3 = (K6D.j) objectRef.element;
            if (jVar3 != null) {
                jVar3.n(tCX.j.rl(mlGh).J2());
            }
        }
        if (z2) {
            return c1266n;
        }
        if (c1266n instanceof n.w6) {
            return new n.w6(((j.C0109j) ((n.w6) c1266n).n()).rl());
        }
        throw new NoWhenBranchMatchedException();
    }
}
