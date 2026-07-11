package NQ;

import GJW.Qik;
import GJW.vd;
import K6D.Ml;
import NQ.Dsr;
import com.google.android.gms.ads.ResponseInfo;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Dsr f7055O;
    private final Ak.Ml nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final rB.Ml f7056t;

    /* JADX INFO: renamed from: NQ.j$j, reason: collision with other inner class name */
    public static final class C0238j extends SuspendLambda implements Function2 {
        final /* synthetic */ Ref.ObjectRef J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f7057O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Function1 f7058Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7059n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ pq.Ml f7060o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f7061r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ j f7062t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C0238j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0238j(Continuation continuation, j jVar, String str, Ref.ObjectRef objectRef, String str2, pq.Ml ml, Function1 function1) {
            super(2, continuation);
            this.f7062t = jVar;
            this.f7057O = str;
            this.J2 = objectRef;
            this.f7061r = str2;
            this.f7060o = ml;
            this.f7058Z = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C0238j(continuation, this.f7062t, this.f7057O, this.J2, this.f7061r, this.f7060o, this.f7058Z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            T tNr;
            K6D.Ml mlO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f7059n;
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
                Dsr dsrJ2 = this.f7062t.J2();
                String str = this.f7057O;
                this.f7059n = 1;
                obj = dsrJ2.t(str, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            x0X.n nVar = (x0X.n) obj;
            if (nVar != null) {
                return nVar;
            }
            Ref.ObjectRef objectRef = this.J2;
            k.Ml mlAz = this.f7062t.Uo().az(this.f7057O, this.f7061r, this.f7060o);
            this.f7062t.xMQ().invoke(mlAz);
            rB.Ml mlKN = this.f7062t.KN();
            if (mlKN != null && (mlO = mlKN.O()) != null) {
                tNr = Ml.n.nr(mlO, tCX.j.rl(mlAz), null, 2, null);
            } else {
                tNr = 0;
            }
            objectRef.element = tNr;
            Dsr dsrJ22 = this.f7062t.J2();
            String str2 = this.f7057O;
            int iN = this.f7062t.O().getConfig().n().n();
            long jNr = this.f7062t.O().getConfig().n().nr();
            w6 w6Var = new w6(this.f7058Z, null);
            this.f7059n = 2;
            Object objRl = aC.rl(dsrJ22, str2, iN, jNr, w6Var, this);
            if (objRl == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objRl;
        }
    }

    static final class n extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f7063O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        /* synthetic */ Object f7065Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f7066g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7067n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        long f7068o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f7069r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f7070t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7065Z = obj;
            this.f7066g |= Integer.MIN_VALUE;
            return j.this.mUb(null, null, null, 0L, null, this);
        }
    }

    static final class w6 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7071n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f7072t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(Function1 function1, Continuation continuation) {
            super(1, continuation);
            this.f7072t = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new w6(this.f7072t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f7071n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function1 function1 = this.f7072t;
            this.f7071n = 1;
            Object objInvoke = function1.invoke(this);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objInvoke;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public abstract InterfaceC2202n O();

    public abstract Function1 xMQ();

    public j(k.I28 adType, vd loadScope, rB.Ml ml) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(loadScope, "loadScope");
        this.f7056t = ml != null ? d3.j.nr(ml, adType.rl()) : null;
        this.nr = new Ak.Ml(adType);
        this.f7055O = new Dsr(loadScope);
    }

    protected final Dsr J2() {
        return this.f7055O;
    }

    protected final rB.Ml KN() {
        return this.f7056t;
    }

    protected final Ak.Ml Uo() {
        return this.nr;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object mUb(String str, String str2, pq.Ml ml, long j2, Function1 function1, Continuation continuation) {
        n nVar;
        String str3;
        String str4;
        pq.Ml ml2;
        j jVar;
        Ref.ObjectRef objectRef;
        x0X.n c1266n;
        boolean z2;
        long j3 = j2;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f7066g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f7066g = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objT = nVar.f7065Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f7066g;
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
                C0238j c0238j = new C0238j(null, this, str3, objectRef2, str4, ml2, function1);
                nVar.f7067n = this;
                str3 = str;
                try {
                    nVar.f7070t = str3;
                    str4 = str2;
                } catch (TimeoutCancellationException unused2) {
                    str4 = str2;
                    ml2 = ml;
                    jVar = this;
                    objectRef = objectRef2;
                    c1266n = new n.C1266n(new n.C0837n(j3));
                    z2 = c1266n instanceof n.C1266n;
                    if (z2) {
                    }
                    if (!z2) {
                    }
                    return c1266n;
                }
                try {
                    nVar.f7063O = str4;
                    ml2 = ml;
                    nVar.J2 = ml2;
                    nVar.f7069r = objectRef2;
                    nVar.f7068o = j3;
                    nVar.f7066g = 1;
                    objT = Qik.t(j3, c0238j, nVar);
                    if (objT == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    jVar = this;
                    objectRef = objectRef2;
                    c1266n = (x0X.n) objT;
                } catch (TimeoutCancellationException unused3) {
                    ml2 = ml;
                    jVar = this;
                    objectRef = objectRef2;
                    c1266n = new n.C1266n(new n.C0837n(j3));
                    z2 = c1266n instanceof n.C1266n;
                    if (z2) {
                    }
                    if (!z2) {
                    }
                    return c1266n;
                }
            } catch (TimeoutCancellationException unused4) {
                jVar = this;
                objectRef = objectRef2;
                c1266n = new n.C1266n(new n.C0837n(j3));
                z2 = c1266n instanceof n.C1266n;
                if (z2) {
                }
                if (!z2) {
                }
                return c1266n;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = nVar.f7068o;
            objectRef = (Ref.ObjectRef) nVar.f7069r;
            pq.Ml ml3 = (pq.Ml) nVar.J2;
            String str5 = (String) nVar.f7063O;
            String str6 = (String) nVar.f7070t;
            jVar = (j) nVar.f7067n;
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
                return c1266n;
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
            jVar.f7055O.nr(str3);
            k.Ml mlQie = jVar.nr.qie(str3, str4, nVar2, ml2);
            jVar.xMQ().invoke(mlQie);
            K6D.j jVar2 = (K6D.j) objectRef.element;
            if (jVar2 != null) {
                tCX.j.Uo(jVar2, nVar2, "admob", mlQie.rl());
            }
        } else if (!(c1266n instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!z2) {
            if (!(c1266n instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            ResponseInfo responseInfoRl = ((Dsr.j) ((n.w6) c1266n).n()).rl();
            k.Ml mlGh = jVar.nr.gh(str3, responseInfoRl != null ? responseInfoRl.getResponseId() : null, responseInfoRl != null ? responseInfoRl.getMediationAdapterClassName() : null, str4, ml2);
            jVar.xMQ().invoke(mlGh);
            K6D.j jVar3 = (K6D.j) objectRef.element;
            if (jVar3 != null) {
                jVar3.n(tCX.j.rl(mlGh).J2());
            }
        }
        return c1266n;
    }
}
