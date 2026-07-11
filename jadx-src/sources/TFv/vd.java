package TFv;

import GJW.AbstractC1363t;
import GJW.xuv;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class vd extends teV.j implements SPz, Wre, teV.Pl {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10483o = AtomicReferenceFieldUpdater.newUpdater(vd.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f10484r;

    static final class j extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f10485O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f10486S;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f10488n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f10489o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f10490r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f10491t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10489o = obj;
            this.f10486S |= Integer.MIN_VALUE;
            return vd.this.n(null, this);
        }
    }

    private final boolean o(Object obj, Object obj2) {
        int i2;
        teV.w6[] w6VarArrHI;
        synchronized (this) {
            Object obj3 = f10483o.get(this);
            if (obj != null && !Intrinsics.areEqual(obj3, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(obj3, obj2)) {
                return true;
            }
            f10483o.set(this, obj2);
            int i3 = this.f10484r;
            if ((i3 & 1) != 0) {
                this.f10484r = i3 + 2;
                return true;
            }
            int i5 = i3 + 1;
            this.f10484r = i5;
            teV.w6[] w6VarArrHI2 = HI();
            Unit unit = Unit.INSTANCE;
            while (true) {
                h[] hVarArr = (h[]) w6VarArrHI2;
                if (hVarArr != null) {
                    for (h hVar : hVarArr) {
                        if (hVar != null) {
                            hVar.Uo();
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.f10484r;
                    if (i2 == i5) {
                        this.f10484r = i5 + 1;
                        return true;
                    }
                    w6VarArrHI = HI();
                    Unit unit2 = Unit.INSTANCE;
                }
                w6VarArrHI2 = w6VarArrHI;
                i5 = i2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // teV.j
    /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
    public h[] qie(int i2) {
        return new h[i2];
    }

    @Override // TFv.r
    public void KN() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // TFv.SPz
    public boolean Uo(Object obj, Object obj2) {
        if (obj == null) {
            obj = teV.z.f73659n;
        }
        if (obj2 == null) {
            obj2 = teV.z.f73659n;
        }
        return o(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // teV.j
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public h gh() {
        return new h();
    }

    @Override // TFv.SPz, TFv.rv6
    public Object getValue() {
        dzu.nKK nkk = teV.z.f73659n;
        Object obj = f10483o.get(this);
        if (obj == nkk) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (((TFv.K) r11).n(r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11, r12) == false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:36:0x00ac, B:52:0x00e2], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:40:0x00bb, B:42:0x00c1], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:42:0x00c1, B:40:0x00bb], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:42:0x00c1, B:50:0x00dc], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:52:0x00e2, B:36:0x00ac], limit reached: 56 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [teV.w6] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6, types: [TFv.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [teV.j] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e0 -> B:36:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f2 -> B:36:0x00ac). Please report as a decompilation issue!!! */
    @Override // TFv.Z, TFv.Wre
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(CN3 cn3, Continuation continuation) throws Throwable {
        j jVar;
        ?? r8;
        vd vdVar;
        h hVar;
        CN3 cn32;
        xuv xuvVar;
        Object obj;
        ?? r82;
        ?? r6;
        boolean zKN;
        Object obj2;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f10486S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f10486S = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj3 = jVar.f10489o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f10486S;
        ?? r62 = 1;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj3);
                h hVar2 = (h) mUb();
                try {
                    if (cn3 instanceof K) {
                        jVar.f10488n = this;
                        jVar.f10491t = cn3;
                        jVar.f10485O = hVar2;
                        jVar.f10486S = 1;
                    }
                    vdVar = this;
                    hVar = hVar2;
                } catch (Throwable th) {
                    th = th;
                    r8 = this;
                    r62 = hVar2;
                    r8.az(r62);
                    throw th;
                }
            } else if (i3 == 1) {
                h hVar3 = (h) jVar.f10485O;
                cn3 = (CN3) jVar.f10491t;
                vd vdVar2 = (vd) jVar.f10488n;
                ResultKt.throwOnFailure(obj3);
                hVar = hVar3;
                vdVar = vdVar2;
            } else if (i3 == 2) {
                obj = jVar.f10490r;
                xuvVar = (xuv) jVar.J2;
                h hVar4 = (h) jVar.f10485O;
                cn32 = (CN3) jVar.f10491t;
                vd vdVar3 = (vd) jVar.f10488n;
                ResultKt.throwOnFailure(obj3);
                r6 = hVar4;
                r82 = vdVar3;
                zKN = r6.KN();
                r62 = r6;
                r8 = r82;
                if (!zKN) {
                }
                Object obj4 = f10483o.get(r8);
                if (xuvVar != null) {
                }
                if (obj != null) {
                }
                if (obj4 != teV.z.f73659n) {
                }
                jVar.f10488n = r8;
                jVar.f10491t = cn32;
                jVar.f10485O = r62;
                jVar.J2 = xuvVar;
                jVar.f10490r = obj4;
                jVar.f10486S = 2;
                if (cn32.rl(obj2, jVar) != coroutine_suspended) {
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = jVar.f10490r;
                xuvVar = (xuv) jVar.J2;
                h hVar5 = (h) jVar.f10485O;
                cn32 = (CN3) jVar.f10491t;
                vd vdVar4 = (vd) jVar.f10488n;
                ResultKt.throwOnFailure(obj3);
                r62 = hVar5;
                r8 = vdVar4;
                Object obj42 = f10483o.get(r8);
                if (xuvVar != null) {
                    AbstractC1363t.gh(xuvVar);
                }
                if (obj != null) {
                    r6 = r62;
                    r82 = r8;
                }
                obj2 = obj42 != teV.z.f73659n ? null : obj42;
                jVar.f10488n = r8;
                jVar.f10491t = cn32;
                jVar.f10485O = r62;
                jVar.J2 = xuvVar;
                jVar.f10490r = obj42;
                jVar.f10486S = 2;
                if (cn32.rl(obj2, jVar) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = obj42;
                r6 = r62;
                r82 = r8;
                zKN = r6.KN();
                r62 = r6;
                r8 = r82;
                if (!zKN) {
                    jVar.f10488n = r82;
                    jVar.f10491t = cn32;
                    jVar.f10485O = r6;
                    jVar.J2 = xuvVar;
                    jVar.f10490r = obj;
                    jVar.f10486S = 3;
                    Object objO = r6.O(jVar);
                    r62 = r6;
                    r8 = r82;
                    if (objO != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                Object obj422 = f10483o.get(r8);
                if (xuvVar != null) {
                }
                if (obj != null) {
                }
                if (obj422 != teV.z.f73659n) {
                }
                jVar.f10488n = r8;
                jVar.f10491t = cn32;
                jVar.f10485O = r62;
                jVar.J2 = xuvVar;
                jVar.f10490r = obj422;
                jVar.f10486S = 2;
                if (cn32.rl(obj2, jVar) != coroutine_suspended) {
                }
            }
            cn32 = cn3;
            xuvVar = (xuv) jVar.getContext().get(xuv.nr);
            obj = null;
            r62 = hVar;
            r8 = vdVar;
            Object obj4222 = f10483o.get(r8);
            if (xuvVar != null) {
            }
            if (obj != null) {
            }
            if (obj4222 != teV.z.f73659n) {
            }
            jVar.f10488n = r8;
            jVar.f10491t = cn32;
            jVar.f10485O = r62;
            jVar.J2 = xuvVar;
            jVar.f10490r = obj4222;
            jVar.f10486S = 2;
            if (cn32.rl(obj2, jVar) != coroutine_suspended) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // TFv.SPz
    public void setValue(Object obj) {
        if (obj == null) {
            obj = teV.z.f73659n;
        }
        o(null, obj);
    }

    public vd(Object obj) {
        this._state$volatile = obj;
    }

    @Override // teV.Pl
    public Wre O(CoroutineContext coroutineContext, int i2, ILs.j jVar) {
        return Lu.nr(this, coroutineContext, i2, jVar);
    }

    @Override // TFv.r, TFv.CN3
    public Object rl(Object obj, Continuation continuation) {
        setValue(obj);
        return Unit.INSTANCE;
    }

    @Override // TFv.r
    public boolean t(Object obj) {
        setValue(obj);
        return true;
    }
}
