package Fw3;

import LQ.fuX;
import LQ.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import mF.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Ml implements C {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private kG.j f3227O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w6.Ml f3228n;
    private kG.j nr;
    private final kG.Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f3229t;

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3231n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f3232t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3232t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return Ml.this.rl(this);
        }
    }

    static final class n extends ContinuationImpl {
        boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f3233O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f3234Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3235n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f3237r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3238t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3237r = obj;
            this.f3234Z |= Integer.MIN_VALUE;
            return Ml.this.KN(0L, false, this);
        }
    }

    public Ml(w6.Ml resource, kG.Wre frameProvider) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(frameProvider, "frameProvider");
        this.f3228n = resource;
        this.rl = frameProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0 A[Catch: j -> 0x004e, TryCatch #2 {j -> 0x004e, blocks: (B:17:0x0049, B:55:0x00fc, B:59:0x0103, B:41:0x00aa, B:43:0x00b0, B:46:0x00c7, B:44:0x00c3, B:60:0x010c, B:61:0x0111), top: B:78:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3 A[Catch: j -> 0x004e, TryCatch #2 {j -> 0x004e, blocks: (B:17:0x0049, B:55:0x00fc, B:59:0x0103, B:41:0x00aa, B:43:0x00b0, B:46:0x00c7, B:44:0x00c3, B:60:0x010c, B:61:0x0111), top: B:78:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [Fw3.Ml] */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r8v0 */
    @Override // Fw3.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object KN(long j2, boolean z2, Continuation continuation) throws fuX.j {
        n nVar;
        LQ.CN3 cn3;
        Object nVar2;
        ?? r12;
        Object obj;
        LQ.CN3 cn32;
        ?? r13;
        Ml ml;
        kG.j jVar;
        Ml ml2;
        ?? r122;
        Ml ml3;
        Ml ml4;
        LQ.j nVar3;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f3234Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f3234Z = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object obj2 = nVar.f3237r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f3234Z;
        try {
        } catch (fuX.j e2) {
            e = e2;
        }
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj2);
            LQ.fuX fux = new LQ.fuX();
            try {
            } catch (fuX.j e3) {
                e = e3;
                z2 = this;
                cn3 = fux;
                if (e.rl() != cn3) {
                    throw e;
                }
                nVar2 = new j.n(e.n());
                r12 = z2;
                if (nVar2 instanceof j.n) {
                }
            }
            if (this.f3229t) {
                throw new IllegalStateException("Trying to render more frames on a failed TextureFrameRenderer");
            }
            kG.j jVar2 = this.nr;
            if (jVar2 != null && d2n.CN3.nr(jVar2.rl(), j2)) {
                cn3 = fux;
                jVar = jVar2;
                ml2 = this;
                r122 = z2;
                if (r122 != 0) {
                }
                ml4 = ml2;
                nVar2 = new j.w6(Unit.INSTANCE);
                r12 = ml4;
                if (nVar2 instanceof j.n) {
                }
            }
            this.nr = null;
            kG.Wre wre = this.rl;
            nVar.f3235n = this;
            nVar.f3238t = fux;
            nVar.f3233O = fux;
            nVar.J2 = z2;
            nVar.f3234Z = 1;
            Object objRl = wre.rl(j2, nVar);
            if (objRl != coroutine_suspended) {
                obj = objRl;
                cn32 = fux;
                cn3 = cn32;
                r13 = z2;
                ml = this;
                nVar3 = (LQ.j) obj;
                if (!(nVar3 instanceof j.n)) {
                }
                Object objO = cn32.O(nVar3);
                ml.nr = (kG.j) objO;
                jVar = (kG.j) objO;
                ?? r8 = r13;
                ml2 = ml;
                r122 = r8 == true ? 1 : 0;
                if (r122 != 0) {
                }
                ml4 = ml2;
                nVar2 = new j.w6(Unit.INSTANCE);
                r12 = ml4;
                if (nVar2 instanceof j.n) {
                }
            }
        } else if (i3 == 1) {
            boolean z3 = nVar.J2;
            cn32 = (LQ.CN3) nVar.f3233O;
            cn3 = (LQ.fuX) nVar.f3238t;
            Ml ml5 = (Ml) nVar.f3235n;
            try {
                ResultKt.throwOnFailure(obj2);
                r13 = z3;
                ml = ml5;
                obj = obj2;
                nVar3 = (LQ.j) obj;
                if (!(nVar3 instanceof j.n)) {
                    nVar3 = new j.n(new I28((kG.I28) ((j.n) nVar3).n()));
                } else if (!(nVar3 instanceof j.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objO2 = cn32.O(nVar3);
                ml.nr = (kG.j) objO2;
                jVar = (kG.j) objO2;
                ?? r82 = r13;
                ml2 = ml;
                r122 = r82 == true ? 1 : 0;
            } catch (fuX.j e4) {
                e = e4;
                z2 = ml5;
                if (e.rl() != cn3) {
                }
            }
            if (r122 != 0) {
                try {
                } catch (fuX.j e5) {
                    e = e5;
                    z2 = ml2;
                    if (e.rl() != cn3) {
                    }
                }
                if (!Intrinsics.areEqual(ml2.f3227O, jVar)) {
                    w6.Ml mlS = ml2.S();
                    w6.j.C1053j c1053j = new w6.j.C1053j(jVar.n());
                    nVar.f3235n = ml2;
                    nVar.f3238t = cn3;
                    nVar.f3233O = jVar;
                    nVar.f3234Z = 2;
                    if (mlS.qie(c1053j, nVar) != coroutine_suspended) {
                        ml3 = ml2;
                        ml3.f3227O = jVar;
                        ml4 = ml3;
                        nVar2 = new j.w6(Unit.INSTANCE);
                        r12 = ml4;
                        if (nVar2 instanceof j.n) {
                        }
                    }
                }
            }
            ml4 = ml2;
            nVar2 = new j.w6(Unit.INSTANCE);
            r12 = ml4;
            if (nVar2 instanceof j.n) {
            }
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                LQ.j jVar3 = (LQ.j) nVar.f3235n;
                ResultKt.throwOnFailure(obj2);
                return jVar3;
            }
            jVar = (kG.j) nVar.f3233O;
            Ml ml6 = (Ml) nVar.f3235n;
            ResultKt.throwOnFailure(obj2);
            ml3 = ml6;
            ml3.f3227O = jVar;
            ml4 = ml3;
            nVar2 = new j.w6(Unit.INSTANCE);
            r12 = ml4;
            if (nVar2 instanceof j.n) {
                boolean z4 = nVar2 instanceof j.w6;
                return nVar2;
            }
            r12.f3229t = true;
            r12.rl.release();
            w6.Ml mlS2 = r12.S();
            nVar.f3235n = nVar2;
            nVar.f3238t = null;
            nVar.f3233O = null;
            nVar.f3234Z = 3;
            if (mlS2.rl(nVar) != coroutine_suspended) {
                return nVar2;
            }
        }
        return coroutine_suspended;
    }

    @Override // Fw3.C
    /* JADX INFO: renamed from: aYN, reason: merged with bridge method [inline-methods] */
    public w6.Ml S() {
        return this.f3228n;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // w9.aC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(Continuation continuation) {
        j jVar;
        Ml ml;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.f3232t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f3229t) {
                return Unit.INSTANCE;
            }
            w6.Ml mlS = S();
            jVar.f3231n = this;
            jVar.J2 = 1;
            if (mlS.rl(jVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            ml = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ml = (Ml) jVar.f3231n;
            ResultKt.throwOnFailure(obj);
        }
        ml.rl.release();
        return Unit.INSTANCE;
    }
}
