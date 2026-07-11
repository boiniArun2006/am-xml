package TFv;

import GJW.AbstractC1363t;
import GJW.O;
import GJW.xuv;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class Ew extends teV.j implements r, Wre, teV.Pl {
    private long E2;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Object[] f10258S;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f10259X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final ILs.j f10260Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10261e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f10262g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f10263o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f10264r;

    private static final class j implements O {
        public final Continuation J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final Object f10265O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Ew f10266n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f10267t;

        @Override // GJW.O
        public void n() {
            this.f10266n.g(this);
        }

        public j(Ew ew, long j2, Object obj, Continuation continuation) {
            this.f10266n = ew;
            this.f10267t = j2;
            this.f10265O = obj;
            this.J2 = continuation;
        }
    }

    static final class w6 extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f10268O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f10269Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f10270n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f10272r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f10273t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10272r = obj;
            this.f10269Z |= Integer.MIN_VALUE;
            return Ew.iF(Ew.this, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(j jVar) {
        synchronized (this) {
            if (jVar.f10267t < v()) {
                return;
            }
            Object[] objArr = this.f10258S;
            Intrinsics.checkNotNull(objArr);
            if (nKK.J2(objArr, jVar.f10267t) != jVar) {
                return;
            }
            nKK.Uo(objArr, jVar.f10267t, nKK.f10461n);
            te();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final Continuation[] s7N(Continuation[] continuationArr) {
        teV.w6[] w6VarArr;
        DAz dAz;
        Continuation continuation;
        int length = continuationArr.length;
        if (((teV.j) this).f73650t != 0 && (w6VarArr = ((teV.j) this).f73649n) != null) {
            int length2 = w6VarArr.length;
            int i2 = 0;
            continuationArr = continuationArr;
            while (i2 < length2) {
                teV.w6 w6Var = w6VarArr[i2];
                if (w6Var != null && (continuation = (dAz = (DAz) w6Var).rl) != null && eF(dAz) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) continuationArr, Math.max(2, continuationArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                        continuationArr = objArrCopyOf;
                    }
                    ((Continuation[]) continuationArr)[length] = continuation;
                    dAz.rl = null;
                    length++;
                }
                i2++;
                continuationArr = continuationArr;
            }
        }
        return (Continuation[]) continuationArr;
    }

    @Override // TFv.r
    public void KN() throws Throwable {
        synchronized (this) {
            try {
                try {
                    M(wTp(), this.E2, wTp(), Xw());
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // TFv.r
    public boolean t(Object obj) {
        int i2;
        boolean z2;
        Continuation[] continuationArrS7N = teV.n.f73655n;
        synchronized (this) {
            if (M7(obj)) {
                continuationArrS7N = s7N(continuationArrS7N);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        for (Continuation continuation : continuationArrS7N) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
            }
        }
        return z2;
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ILs.j.values().length];
            try {
                iArr[ILs.j.f4185n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ILs.j.f4184O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ILs.j.f4187t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final Object E(DAz dAz) {
        Object obj;
        Continuation[] continuationArrFX = teV.n.f73655n;
        synchronized (this) {
            try {
                long jEF = eF(dAz);
                if (jEF < 0) {
                    obj = nKK.f10461n;
                } else {
                    long j2 = dAz.f10251n;
                    Object objBzg = bzg(jEF);
                    dAz.f10251n = jEF + 1;
                    continuationArrFX = FX(j2);
                    obj = objBzg;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArrFX) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
            }
        }
        return obj;
    }

    private final Object N(Object obj, Continuation continuation) throws Throwable {
        Throwable th;
        Continuation[] continuationArrS7N;
        j jVar;
        GJW.eO eOVar = new GJW.eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        Continuation[] continuationArrS7N2 = teV.n.f73655n;
        synchronized (this) {
            try {
                if (M7(obj)) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        eOVar.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
                        continuationArrS7N = s7N(continuationArrS7N2);
                        jVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        jVar = new j(this, v() + ((long) U()), obj, eOVar);
                        nHg(jVar);
                        this.f10259X++;
                        if (this.f10263o == 0) {
                            continuationArrS7N2 = s7N(continuationArrS7N2);
                        }
                        continuationArrS7N = continuationArrS7N2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (jVar != null) {
                    GJW.QJ.n(eOVar, jVar);
                }
                for (Continuation continuation2 : continuationArrS7N) {
                    if (continuation2 != null) {
                        Result.Companion companion2 = Result.INSTANCE;
                        continuation2.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
                    }
                }
                Object objWPU = eOVar.WPU();
                if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWPU : Unit.INSTANCE;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    private final Object[] P5(Object[] objArr, int i2, int i3) {
        if (i3 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i3];
        this.f10258S = objArr2;
        if (objArr != null) {
            long jV = v();
            for (int i5 = 0; i5 < i2; i5++) {
                long j2 = ((long) i5) + jV;
                nKK.Uo(objArr2, j2, nKK.J2(objArr, j2));
            }
        }
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int U() {
        return this.f10261e + this.f10259X;
    }

    private final void X() {
        Object[] objArr = this.f10258S;
        Intrinsics.checkNotNull(objArr);
        nKK.Uo(objArr, v(), null);
        this.f10261e--;
        long jV = v() + 1;
        if (this.f10262g < jV) {
            this.f10262g = jV;
        }
        if (this.E2 < jV) {
            fD(jV);
        }
    }

    private final Object bzg(long j2) {
        Object[] objArr = this.f10258S;
        Intrinsics.checkNotNull(objArr);
        Object objJ2 = nKK.J2(objArr, j2);
        return objJ2 instanceof j ? ((j) objJ2).f10265O : objJ2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long eF(DAz dAz) {
        long j2 = dAz.f10251n;
        if (j2 >= wTp() && (this.f10263o > 0 || j2 > v() || this.f10259X == 0)) {
            return -1L;
        }
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (((TFv.K) r9).n(r0) == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object iF(Ew ew, CN3 cn3, Continuation continuation) throws Throwable {
        w6 w6Var;
        Ew ew2;
        Throwable th;
        DAz dAz;
        CN3 cn32;
        xuv xuvVar;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.f10269Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.f10269Z = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = ew.new w6(continuation);
            }
        }
        Object obj = w6Var.f10272r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.f10269Z;
        if (i3 != 0) {
            if (i3 == 1) {
                dAz = (DAz) w6Var.f10268O;
                CN3 cn33 = (CN3) w6Var.f10273t;
                Ew ew3 = (Ew) w6Var.f10270n;
                try {
                    ResultKt.throwOnFailure(obj);
                    cn32 = cn33;
                    ew = ew3;
                    try {
                        xuvVar = (xuv) w6Var.getContext().get(xuv.nr);
                    } catch (Throwable th2) {
                        ew2 = ew;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    ew2 = ew3;
                }
            } else {
                if (i3 != 2 && i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xuv xuvVar2 = (xuv) w6Var.J2;
                dAz = (DAz) w6Var.f10268O;
                CN3 cn34 = (CN3) w6Var.f10273t;
                ew2 = (Ew) w6Var.f10270n;
                try {
                    ResultKt.throwOnFailure(obj);
                    cn32 = cn34;
                    xuvVar = xuvVar2;
                    ew = ew2;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            ew2.az(dAz);
            throw th;
        }
        ResultKt.throwOnFailure(obj);
        DAz dAz2 = (DAz) ew.mUb();
        try {
            if (cn3 instanceof K) {
                w6Var.f10270n = ew;
                w6Var.f10273t = cn3;
                w6Var.f10268O = dAz2;
                w6Var.f10269Z = 1;
            }
            cn32 = cn3;
            dAz = dAz2;
            xuvVar = (xuv) w6Var.getContext().get(xuv.nr);
        } catch (Throwable th5) {
            ew2 = ew;
            th = th5;
            dAz = dAz2;
        }
        while (true) {
            Object objE = ew.E(dAz);
            if (objE == nKK.f10461n) {
                w6Var.f10270n = ew;
                w6Var.f10273t = cn32;
                w6Var.f10268O = dAz;
                w6Var.J2 = xuvVar;
                w6Var.f10269Z = 2;
                if (ew.nY(dAz, w6Var) == coroutine_suspended) {
                    break;
                }
            } else {
                if (xuvVar != null) {
                    AbstractC1363t.gh(xuvVar);
                }
                w6Var.f10270n = ew;
                w6Var.f10273t = cn32;
                w6Var.f10268O = dAz;
                w6Var.J2 = xuvVar;
                w6Var.f10269Z = 3;
                if (cn32.rl(objE, w6Var) == coroutine_suspended) {
                    break;
                }
            }
        }
        return coroutine_suspended;
    }

    private final Object nY(DAz dAz, Continuation continuation) {
        GJW.eO eOVar = new GJW.eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        synchronized (this) {
            try {
                if (eF(dAz) < 0) {
                    dAz.rl = eOVar;
                } else {
                    Result.Companion companion = Result.INSTANCE;
                    eOVar.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWPU : Unit.INSTANCE;
    }

    private final boolean p5(Object obj) {
        if (this.f10264r == 0) {
            return true;
        }
        nHg(obj);
        int i2 = this.f10261e + 1;
        this.f10261e = i2;
        if (i2 > this.f10264r) {
            X();
        }
        this.E2 = v() + ((long) this.f10261e);
        return true;
    }

    private final void te() {
        if (this.f10263o != 0 || this.f10259X > 1) {
            Object[] objArr = this.f10258S;
            Intrinsics.checkNotNull(objArr);
            while (this.f10259X > 0 && nKK.J2(objArr, (v() + ((long) U())) - 1) == nKK.f10461n) {
                this.f10259X--;
                nKK.Uo(objArr, v() + ((long) U()), null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long v() {
        return Math.min(this.E2, this.f10262g);
    }

    public final long B() {
        long j2 = this.f10262g;
        if (j2 < this.E2) {
            this.E2 = j2;
        }
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // teV.j
    /* JADX INFO: renamed from: E2, reason: merged with bridge method [inline-methods] */
    public DAz gh() {
        return new DAz();
    }

    public final Continuation[] FX(long j2) {
        long j3;
        long j4;
        long j5;
        teV.w6[] w6VarArr;
        if (j2 > this.E2) {
            return teV.n.f73655n;
        }
        long jV = v();
        long j6 = ((long) this.f10261e) + jV;
        if (this.f10263o == 0 && this.f10259X > 0) {
            j6++;
        }
        if (((teV.j) this).f73650t != 0 && (w6VarArr = ((teV.j) this).f73649n) != null) {
            for (teV.w6 w6Var : w6VarArr) {
                if (w6Var != null) {
                    long j7 = ((DAz) w6Var).f10251n;
                    if (j7 >= 0 && j7 < j6) {
                        j6 = j7;
                    }
                }
            }
        }
        if (j6 <= this.E2) {
            return teV.n.f73655n;
        }
        long jWTp = wTp();
        int iMin = ty() > 0 ? Math.min(this.f10259X, this.f10263o - ((int) (jWTp - j6))) : this.f10259X;
        Continuation[] continuationArr = teV.n.f73655n;
        long j9 = ((long) this.f10259X) + jWTp;
        if (iMin > 0) {
            continuationArr = new Continuation[iMin];
            Object[] objArr = this.f10258S;
            Intrinsics.checkNotNull(objArr);
            j5 = 1;
            long j10 = jWTp;
            int i2 = 0;
            while (true) {
                if (jWTp >= j9) {
                    j3 = jV;
                    j4 = j6;
                    jWTp = j10;
                    break;
                }
                Object objJ2 = nKK.J2(objArr, jWTp);
                j3 = jV;
                dzu.nKK nkk = nKK.f10461n;
                if (objJ2 != nkk) {
                    Intrinsics.checkNotNull(objJ2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    j jVar = (j) objJ2;
                    int i3 = i2 + 1;
                    j4 = j6;
                    continuationArr[i2] = jVar.J2;
                    nKK.Uo(objArr, jWTp, nkk);
                    nKK.Uo(objArr, j10, jVar.f10265O);
                    long j11 = j10 + 1;
                    if (i3 >= iMin) {
                        jWTp = j11;
                        break;
                    }
                    i2 = i3;
                    j10 = j11;
                } else {
                    j4 = j6;
                }
                jWTp++;
                jV = j3;
                j6 = j4;
            }
        } else {
            j3 = jV;
            j4 = j6;
            j5 = 1;
        }
        Continuation[] continuationArr2 = continuationArr;
        int i5 = (int) (jWTp - j3);
        long j12 = ty() == 0 ? jWTp : j4;
        long jMax = Math.max(this.f10262g, jWTp - ((long) Math.min(this.f10264r, i5)));
        if (this.f10263o == 0 && jMax < j9) {
            Object[] objArr2 = this.f10258S;
            Intrinsics.checkNotNull(objArr2);
            if (Intrinsics.areEqual(nKK.J2(objArr2, jMax), nKK.f10461n)) {
                jWTp += j5;
                jMax += j5;
            }
        }
        M(jMax, j12, jWTp, j9);
        te();
        return !(continuationArr2.length == 0) ? s7N(continuationArr2) : continuationArr2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // teV.j
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public DAz[] qie(int i2) {
        return new DAz[i2];
    }

    protected final Object rV9() {
        Object[] objArr = this.f10258S;
        Intrinsics.checkNotNull(objArr);
        return nKK.J2(objArr, (this.f10262g + ((long) jB())) - 1);
    }

    public Ew(int i2, int i3, ILs.j jVar) {
        this.f10264r = i2;
        this.f10263o = i3;
        this.f10260Z = jVar;
    }

    private final void M(long j2, long j3, long j4, long j5) {
        long jMin = Math.min(j3, j2);
        for (long jV = v(); jV < jMin; jV++) {
            Object[] objArr = this.f10258S;
            Intrinsics.checkNotNull(objArr);
            nKK.Uo(objArr, jV, null);
        }
        this.f10262g = j2;
        this.E2 = j3;
        this.f10261e = (int) (j4 - jMin);
        this.f10259X = (int) (j5 - j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M7(Object obj) {
        if (ty() == 0) {
            return p5(obj);
        }
        if (this.f10261e >= this.f10263o && this.E2 <= this.f10262g) {
            int i2 = n.$EnumSwitchMapping$0[this.f10260Z.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return true;
                }
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                return false;
            }
        }
        nHg(obj);
        int i3 = this.f10261e + 1;
        this.f10261e = i3;
        if (i3 > this.f10263o) {
            X();
        }
        if (jB() > this.f10264r) {
            M(this.f10262g + 1, this.E2, wTp(), Xw());
        }
        return true;
    }

    static /* synthetic */ Object T(Ew ew, Object obj, Continuation continuation) throws Throwable {
        if (ew.t(obj)) {
            return Unit.INSTANCE;
        }
        Object objN = ew.N(obj, continuation);
        if (objN == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objN;
        }
        return Unit.INSTANCE;
    }

    private final long Xw() {
        return v() + ((long) this.f10261e) + ((long) this.f10259X);
    }

    private final void fD(long j2) {
        teV.w6[] w6VarArr;
        if (((teV.j) this).f73650t != 0 && (w6VarArr = ((teV.j) this).f73649n) != null) {
            for (teV.w6 w6Var : w6VarArr) {
                if (w6Var != null) {
                    DAz dAz = (DAz) w6Var;
                    long j3 = dAz.f10251n;
                    if (j3 >= 0 && j3 < j2) {
                        dAz.f10251n = j2;
                    }
                }
            }
        }
        this.E2 = j2;
    }

    private final int jB() {
        return (int) ((v() + ((long) this.f10261e)) - this.f10262g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nHg(Object obj) {
        int iU = U();
        Object[] objArrP5 = this.f10258S;
        if (objArrP5 == null) {
            objArrP5 = P5(null, 0, 2);
        } else if (iU >= objArrP5.length) {
            objArrP5 = P5(objArrP5, iU, objArrP5.length * 2);
        }
        nKK.Uo(objArrP5, v() + ((long) iU), obj);
    }

    private final long wTp() {
        return v() + ((long) this.f10261e);
    }

    @Override // teV.Pl
    public Wre O(CoroutineContext coroutineContext, int i2, ILs.j jVar) {
        return nKK.O(this, coroutineContext, i2, jVar);
    }

    @Override // TFv.Z, TFv.Wre
    public Object n(CN3 cn3, Continuation continuation) {
        return iF(this, cn3, continuation);
    }

    @Override // TFv.r, TFv.CN3
    public Object rl(Object obj, Continuation continuation) {
        return T(this, obj, continuation);
    }
}
