package Fw3;

import GJW.OU;
import GJW.lej;
import GJW.vd;
import LQ.fuX;
import LQ.j;
import android.graphics.Bitmap;
import d2n.j;
import gB.I28;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Wre implements gB.CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Oe.w6 f3246n;
    private final lej nr;
    private final Function2 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final lej f3247t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final j f3245O = new j(null);
    private static final Oe.w6 J2 = new Oe.w6(4096, 2160);

    static final class Ml extends SuspendLambda implements Function2 {
        final /* synthetic */ int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ MoG.qz f3248O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3249n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(MoG.qz qzVar, int i2, Continuation continuation) {
            super(2, continuation);
            this.f3248O = qzVar;
            this.J2 = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Wre.this.new Ml(this.f3248O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f3249n == 0) {
                ResultKt.throwOnFailure(obj);
                return Wre.this.rl.invoke(this.f3248O.rl(), Boxing.boxInt(this.J2));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    private static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Oe.w6 f3251n;
        private final int rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f3251n, nVar.f3251n) && this.rl == nVar.rl;
        }

        public n(Oe.w6 outputSize, int i2) {
            Intrinsics.checkNotNullParameter(outputSize, "outputSize");
            this.f3251n = outputSize;
            this.rl = i2;
        }

        public int hashCode() {
            return (this.f3251n.hashCode() * 31) + Integer.hashCode(this.rl);
        }

        public final Oe.w6 n() {
            return this.f3251n;
        }

        public final int rl() {
            return this.rl;
        }

        public String toString() {
            return "ImageLoadingSizeInfo(outputSize=" + this.f3251n + ", subsamplingSize=" + this.rl + ')';
        }
    }

    static final class w6 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f3252O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3253n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f3254r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3255t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3252O = obj;
            this.f3254r |= Integer.MIN_VALUE;
            return Wre.this.J2(null, this);
        }
    }

    public Wre(Oe.w6 maxSize, Function2 bitmapRetriever, lej defaultDispatcher, lej ioDispatcher) {
        Intrinsics.checkNotNullParameter(maxSize, "maxSize");
        Intrinsics.checkNotNullParameter(bitmapRetriever, "bitmapRetriever");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f3246n = maxSize;
        this.rl = bitmapRetriever;
        this.f3247t = defaultDispatcher;
        this.nr = ioDispatcher;
        LRC.n.t(Uo().t(), "max size width");
        LRC.n.t(Uo().rl(), "max size height");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071 A[Catch: j -> 0x0031, TryCatch #1 {j -> 0x0031, blocks: (B:12:0x002d, B:23:0x006b, B:25:0x0071, B:28:0x0088, B:26:0x0084, B:30:0x0094, B:31:0x0099), top: B:41:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084 A[Catch: j -> 0x0031, TryCatch #1 {j -> 0x0031, blocks: (B:12:0x002d, B:23:0x006b, B:25:0x0071, B:28:0x0088, B:26:0x0084, B:30:0x0094, B:31:0x0099), top: B:41:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J2(MoG.qz qzVar, Continuation continuation) throws fuX.j {
        w6 w6Var;
        LQ.fuX fux;
        LQ.CN3 cn3;
        LQ.j nVar;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.f3254r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.f3254r = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object obj = w6Var.f3252O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.f3254r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            LQ.fuX fux2 = new LQ.fuX();
            try {
                int iRl = KN(Oe.n.rl(qzVar.n())).rl();
                lej lejVar = this.nr;
                Ml ml = new Ml(qzVar, iRl, null);
                w6Var.f3253n = fux2;
                w6Var.f3255t = fux2;
                w6Var.f3254r = 1;
                Object objUo = GJW.Dsr.Uo(lejVar, ml, w6Var);
                if (objUo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = objUo;
                cn3 = fux2;
                nVar = (LQ.j) obj;
                if (!(nVar instanceof j.n)) {
                }
                return new j.w6((Bitmap) cn3.O(nVar));
            } catch (fuX.j e2) {
                e = e2;
                fux = fux2;
                if (e.rl() != fux) {
                    return new j.n(e.n());
                }
                throw e;
            }
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cn3 = (LQ.CN3) w6Var.f3255t;
        fux = (LQ.fuX) w6Var.f3253n;
        try {
            ResultKt.throwOnFailure(obj);
            nVar = (LQ.j) obj;
            if (!(nVar instanceof j.n)) {
                nVar = new j.n(new gB.Ml((t2.j) ((j.n) nVar).n()));
            } else if (!(nVar instanceof j.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return new j.w6((Bitmap) cn3.O(nVar));
        } catch (fuX.j e3) {
            e = e3;
            if (e.rl() != fux) {
            }
        }
    }

    public Oe.w6 Uo() {
        return this.f3246n;
    }

    @Override // gB.fuX
    public long n(gB.I28 resource) {
        double dO;
        Intrinsics.checkNotNullParameter(resource, "resource");
        double dO2 = Oe.Ml.O(t(resource), 0, 1, null);
        j.C0832j c0832j = d2n.j.f63374t;
        if (resource instanceof I28.n) {
            dO = ((dO2 * 0.4d) / Oe.Ml.O(Uo(), 0, 1, null)) + 0.2d;
        } else {
            if (!(resource instanceof I28.j)) {
                throw new NoWhenBranchMatchedException();
            }
            dO = ((dO2 * 0.5d) / Oe.Ml.O(J2, 0, 1, null)) + 0.5d;
        }
        return c0832j.O(dO);
    }

    @Override // gB.fuX
    public Oe.w6 t(gB.I28 resource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        if (resource instanceof I28.n) {
            return KN(Oe.n.rl(((I28.n) resource).n().n())).n();
        }
        if (resource instanceof I28.j) {
            return Oe.n.rl(MoG.Ml.n(((I28.j) resource).n()));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final n KN(Oe.w6 w6Var) {
        Oe.w6 w6VarUo = Uo();
        int i2 = 1;
        while (!Oe.Ml.n(w6VarUo, w6Var)) {
            w6Var = Oe.Ml.rl(w6Var, 2);
            i2 *= 2;
        }
        return new n(w6Var, i2);
    }

    @Override // gB.CN3
    public Object rl(I28.n nVar, Continuation continuation) {
        return J2(nVar.n(), continuation);
    }

    public /* synthetic */ Wre(Oe.w6 w6Var, Function2 function2, lej lejVar, lej lejVar2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(w6Var, function2, (i2 & 4) != 0 ? OU.n() : lejVar, (i2 & 8) != 0 ? OU.rl() : lejVar2);
    }
}
