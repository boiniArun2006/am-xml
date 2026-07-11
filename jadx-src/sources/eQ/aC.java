package eQ;

import Be4.I28;
import FjR.Pl;
import FjR.Xo;
import FjR.fuX;
import FjR.qz;
import GJW.AbstractC1363t;
import GJW.Lu;
import GJW.N;
import GJW.OU;
import GJW.iwV;
import GJW.lej;
import GJW.vd;
import Lf.C;
import Lf.I28;
import Lf.Wre;
import Lf.aC;
import Lf.j;
import Lf.n;
import Lf.o;
import Lf.w6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.view.Lifecycle;
import coil.memory.MemoryCache;
import coil.request.NullRequestDataException;
import eQ.w6;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kYF.SPz;
import kYF.UGc;
import kYF.g9s;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.HttpUrl;
import q.InterfaceC2336j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class aC implements fuX {
    public static final j HI = new j(null);
    private final w6.InterfaceC0848w6 J2;
    private final UGc KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Lazy f63682O;
    private final eQ.n Uo;
    private final List az;
    private final Pl gh;
    private final g9s mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f63683n;
    private final Lazy nr;
    private final eQ.n qie;
    private final FjR.w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Lazy f63684t;
    private final AtomicBoolean ty;
    private final vd xMQ = Lu.n(N.rl(null, 1, null).plus(OU.t().p0N()).plus(new I28(iwV.rl, this)));

    public static final class I28 extends AbstractCoroutineContextElement implements iwV {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ aC f63685n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(iwV.j jVar, aC aCVar) {
            super(jVar);
            this.f63685n = aCVar;
        }

        @Override // GJW.iwV
        public void a(CoroutineContext coroutineContext, Throwable th) {
            this.f63685n.KN();
        }
    }

    static final class Ml extends SuspendLambda implements Function2 {
        final /* synthetic */ Z.fuX J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ aC f63686O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f63687n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Bitmap f63688o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ eQ.w6 f63689r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ FjR.fuX f63690t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(FjR.fuX fux, aC aCVar, Z.fuX fux2, eQ.w6 w6Var, Bitmap bitmap, Continuation continuation) {
            super(2, continuation);
            this.f63690t = fux;
            this.f63686O = aCVar;
            this.J2 = fux2;
            this.f63689r = w6Var;
            this.f63688o = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new Ml(this.f63690t, this.f63686O, this.J2, this.f63689r, this.f63688o, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f63687n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FjR.fuX fux = this.f63690t;
            List list = this.f63686O.az;
            FjR.fuX fux2 = this.f63690t;
            Z.fuX fux3 = this.J2;
            eQ.w6 w6Var = this.f63689r;
            if (this.f63688o != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            fVb.w6 w6Var2 = new fVb.w6(fux, list, 0, fux2, fux3, w6Var, z2);
            FjR.fuX fux4 = this.f63690t;
            this.f63687n = 1;
            Object objUo = w6Var2.Uo(fux4, this);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objUo;
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ FjR.fuX f63691O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f63692n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(FjR.fuX fux, Continuation continuation) {
            super(2, continuation);
            this.f63691O = fux;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return aC.this.new n(this.f63691O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f63692n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            aC aCVar = aC.this;
            FjR.fuX fux = this.f63691O;
            this.f63692n = 1;
            Object objJ2 = aCVar.J2(fux, 1, this);
            if (objJ2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objJ2;
        }
    }

    static final class w6 extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f63694O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f63695S;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f63697n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f63698o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f63699r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f63700t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63698o = obj;
            this.f63695S |= Integer.MIN_VALUE;
            return aC.this.J2(null, 0, this);
        }
    }

    public final SPz KN() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(4:(1:(7:13|114|14|76|(1:78)(2:79|(1:81)(2:84|85))|82|83)(2:18|19))(13:20|107|21|22|23|103|69|70|112|71|72|(5:75|76|(0)(0)|82|83)|74)|109|92|(3:94|95|96)(2:99|100))(4:26|105|27|41))(4:32|115|33|(2:35|(3:37|(2:40|41)|74)(1:44))(2:90|91))|110|45|(11:47|(1:49)(1:52)|(1:54)|(1:57)(1:58)|59|(1:61)|62|(1:64)|65|(9:68|23|103|69|70|112|71|72|(0))|74)|55|(0)(0)|59|(0)|62|(0)|65|(0)|74|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0106, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0107, code lost:
    
        r6 = r2;
        r4 = r5;
        r5 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116 A[Catch: all -> 0x0106, TryCatch #4 {all -> 0x0106, blocks: (B:45:0x00f5, B:47:0x00fb, B:49:0x0101, B:54:0x010e, B:57:0x0116, B:59:0x0128, B:61:0x012e, B:62:0x0131, B:64:0x013a, B:65:0x013d, B:58:0x0124), top: B:110:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0124 A[Catch: all -> 0x0106, TryCatch #4 {all -> 0x0106, blocks: (B:45:0x00f5, B:47:0x00fb, B:49:0x0101, B:54:0x010e, B:57:0x0116, B:59:0x0128, B:61:0x012e, B:62:0x0131, B:64:0x013a, B:65:0x013d, B:58:0x0124), top: B:110:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012e A[Catch: all -> 0x0106, TryCatch #4 {all -> 0x0106, blocks: (B:45:0x00f5, B:47:0x00fb, B:49:0x0101, B:54:0x010e, B:57:0x0116, B:59:0x0128, B:61:0x012e, B:62:0x0131, B:64:0x013a, B:65:0x013d, B:58:0x0124), top: B:110:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a A[Catch: all -> 0x0106, TryCatch #4 {all -> 0x0106, blocks: (B:45:0x00f5, B:47:0x00fb, B:49:0x0101, B:54:0x010e, B:57:0x0116, B:59:0x0128, B:61:0x012e, B:62:0x0131, B:64:0x013a, B:65:0x013d, B:58:0x0124), top: B:110:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018d A[Catch: all -> 0x004b, TryCatch #6 {all -> 0x004b, blocks: (B:14:0x0046, B:76:0x0187, B:78:0x018d, B:79:0x0198, B:81:0x019c, B:84:0x01aa, B:85:0x01af), top: B:114:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0198 A[Catch: all -> 0x004b, TryCatch #6 {all -> 0x004b, blocks: (B:14:0x0046, B:76:0x0187, B:78:0x018d, B:79:0x0198, B:81:0x019c, B:84:0x01aa, B:85:0x01af), top: B:114:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c4 A[Catch: all -> 0x01d5, TRY_LEAVE, TryCatch #3 {all -> 0x01d5, blocks: (B:92:0x01c0, B:94:0x01c4, B:99:0x01d7, B:100:0x01da), top: B:109:0x01c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d7 A[Catch: all -> 0x01d5, TRY_ENTER, TryCatch #3 {all -> 0x01d5, blocks: (B:92:0x01c0, B:94:0x01c4, B:99:0x01d7, B:100:0x01da), top: B:109:0x01c0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J2(FjR.fuX fux, int i2, Continuation continuation) {
        w6 w6Var;
        qz qzVarUo;
        FjR.fuX fuxN;
        aC aCVar;
        qz qzVar;
        eQ.w6 w6Var2;
        aC aCVar2;
        FjR.fuX fux2;
        eQ.w6 w6Var3;
        qz qzVar2;
        Bitmap bitmapN;
        InterfaceC2336j interfaceC2336jV;
        fuX.n nVarG;
        Object objN;
        FjR.fuX fux3;
        aC aCVar3;
        qz qzVar3;
        eQ.w6 w6Var4;
        FjR.Dsr dsr;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i3 = w6Var.f63695S;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w6Var.f63695S = i3 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objUo = w6Var.f63698o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = w6Var.f63695S;
        if (i5 == 0) {
            ResultKt.throwOnFailure(objUo);
            qzVarUo = this.gh.Uo(fux, AbstractC1363t.az(w6Var.getContext()));
            qzVarUo.M7();
            fuxN = FjR.fuX.U(fux, null, 1, null).t(n()).n();
            eQ.w6 w6VarRl = this.J2.rl(fuxN);
            try {
                if (fuxN.az() == FjR.aC.f3019n) {
                    throw new NullRequestDataException();
                }
                qzVarUo.start();
                if (i2 == 0) {
                    Lifecycle lifecycleNY = fuxN.nY();
                    w6Var.f63697n = this;
                    w6Var.f63700t = qzVarUo;
                    w6Var.f63694O = fuxN;
                    w6Var.J2 = w6VarRl;
                    w6Var.f63695S = 1;
                    if (kYF.fuX.n(lifecycleNY, w6Var) != coroutine_suspended) {
                        aCVar2 = this;
                        fux2 = fuxN;
                        w6Var3 = w6VarRl;
                        qzVar2 = qzVarUo;
                        qzVarUo = qzVar2;
                    }
                    return coroutine_suspended;
                }
                aCVar2 = this;
                fux2 = fuxN;
                w6Var3 = w6VarRl;
            } catch (Throwable th) {
                th = th;
                aCVar = this;
                qzVar = qzVarUo;
                w6Var2 = w6VarRl;
            }
        } else {
            if (i5 != 1) {
                if (i5 == 2) {
                    bitmapN = (Bitmap) w6Var.f63699r;
                    w6Var3 = (eQ.w6) w6Var.J2;
                    FjR.fuX fux4 = (FjR.fuX) w6Var.f63694O;
                    qzVar3 = (qz) w6Var.f63700t;
                    aC aCVar4 = (aC) w6Var.f63697n;
                    try {
                        ResultKt.throwOnFailure(objUo);
                        fux3 = fux4;
                        aCVar3 = aCVar4;
                        Bitmap bitmap = bitmapN;
                        try {
                            Z.fuX fux5 = (Z.fuX) objUo;
                            w6Var3.mUb(fux3, fux5);
                            lej lejVarViF = fux3.ViF();
                            w6Var4 = w6Var3;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        w6Var2 = w6Var3;
                        fuxN = fux4;
                        qzVar = qzVar3;
                        aCVar = aCVar4;
                    }
                    try {
                        Ml ml = new Ml(fux3, aCVar3, fux5, w6Var4, bitmap, null);
                        w6Var.f63697n = aCVar3;
                        w6Var.f63700t = qzVar3;
                        w6Var.f63694O = fux3;
                        w6Var.J2 = w6Var3;
                        w6Var.f63699r = null;
                        w6Var.f63695S = 3;
                        objUo = GJW.Dsr.Uo(lejVarViF, ml, w6Var);
                        if (objUo != coroutine_suspended) {
                            w6Var2 = w6Var3;
                            qzVar = qzVar3;
                            fuxN = fux3;
                            aCVar = aCVar3;
                            dsr = (FjR.Dsr) objUo;
                            if (!(dsr instanceof Xo)) {
                            }
                            return dsr;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th4) {
                        th = th4;
                        w6Var3 = w6Var4;
                        w6Var2 = w6Var3;
                        qzVar = qzVar3;
                        fuxN = fux3;
                        aCVar = aCVar3;
                        if (th instanceof CancellationException) {
                        }
                    }
                } else {
                    if (i5 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    w6Var2 = (eQ.w6) w6Var.J2;
                    fuxN = (FjR.fuX) w6Var.f63694O;
                    qzVar = (qz) w6Var.f63700t;
                    aCVar = (aC) w6Var.f63697n;
                    try {
                        ResultKt.throwOnFailure(objUo);
                        dsr = (FjR.Dsr) objUo;
                        if (!(dsr instanceof Xo)) {
                            aCVar.qie((Xo) dsr, fuxN.v(), w6Var2);
                        } else {
                            if (!(dsr instanceof FjR.I28)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aCVar.gh((FjR.I28) dsr, fuxN.v(), w6Var2);
                        }
                        return dsr;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                try {
                    if (th instanceof CancellationException) {
                        aCVar.mUb(fuxN, w6Var2);
                        throw th;
                    }
                    FjR.I28 i28N = aCVar.gh.n(fuxN, th);
                    aCVar.gh(i28N, fuxN.v(), w6Var2);
                    return i28N;
                } finally {
                    qzVar.rl();
                }
            }
            w6Var3 = (eQ.w6) w6Var.J2;
            fux2 = (FjR.fuX) w6Var.f63694O;
            qzVar2 = (qz) w6Var.f63700t;
            aCVar2 = (aC) w6Var.f63697n;
            try {
                ResultKt.throwOnFailure(objUo);
                qzVarUo = qzVar2;
            } catch (Throwable th6) {
                th = th6;
                w6Var2 = w6Var3;
                fuxN = fux2;
                qzVar = qzVar2;
                aCVar = aCVar2;
                if (th instanceof CancellationException) {
                }
            }
        }
        MemoryCache memoryCacheT = aCVar2.t();
        if (memoryCacheT != null) {
            MemoryCache.Key keyX = fux2.X();
            MemoryCache.n nVarRl = keyX != null ? memoryCacheT.rl(keyX) : null;
            if (nVarRl != null) {
                bitmapN = nVarRl.n();
            }
            Drawable bitmapDrawable = bitmapN == null ? new BitmapDrawable(fux2.qie().getResources(), bitmapN) : fux2.e();
            interfaceC2336jV = fux2.v();
            if (interfaceC2336jV != null) {
                interfaceC2336jV.t(bitmapDrawable);
            }
            w6Var3.nr(fux2);
            nVarG = fux2.g();
            if (nVarG != null) {
                nVarG.nr(fux2);
            }
            w6Var3.HI(fux2);
            Z.Dsr dsrS7N = fux2.s7N();
            w6Var.f63697n = aCVar2;
            w6Var.f63700t = qzVarUo;
            w6Var.f63694O = fux2;
            w6Var.J2 = w6Var3;
            w6Var.f63699r = bitmapN;
            w6Var.f63695S = 2;
            objN = dsrS7N.n(w6Var);
            if (objN != coroutine_suspended) {
                fux3 = fux2;
                aCVar3 = aCVar2;
                qzVar3 = qzVarUo;
                objUo = objN;
                Bitmap bitmap2 = bitmapN;
                Z.fuX fux52 = (Z.fuX) objUo;
                w6Var3.mUb(fux3, fux52);
                lej lejVarViF2 = fux3.ViF();
                w6Var4 = w6Var3;
                Ml ml2 = new Ml(fux3, aCVar3, fux52, w6Var4, bitmap2, null);
                w6Var.f63697n = aCVar3;
                w6Var.f63700t = qzVar3;
                w6Var.f63694O = fux3;
                w6Var.J2 = w6Var3;
                w6Var.f63699r = null;
                w6Var.f63695S = 3;
                objUo = GJW.Dsr.Uo(lejVarViF2, ml2, w6Var);
                if (objUo != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        bitmapN = null;
        if (bitmapN == null) {
        }
        interfaceC2336jV = fux2.v();
        if (interfaceC2336jV != null) {
        }
        w6Var3.nr(fux2);
        nVarG = fux2.g();
        if (nVarG != null) {
        }
        w6Var3.HI(fux2);
        Z.Dsr dsrS7N2 = fux2.s7N();
        w6Var.f63697n = aCVar2;
        w6Var.f63700t = qzVarUo;
        w6Var.f63694O = fux2;
        w6Var.J2 = w6Var3;
        w6Var.f63699r = bitmapN;
        w6Var.f63695S = 2;
        objN = dsrS7N2.n(w6Var);
        if (objN != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public final Context Uo() {
        return this.f63683n;
    }

    public final void az(int i2) {
        MemoryCache memoryCache;
        Lazy lazy = this.f63684t;
        if (lazy == null || (memoryCache = (MemoryCache) lazy.getValue()) == null) {
            return;
        }
        memoryCache.n(i2);
    }

    @Override // eQ.fuX
    public eQ.n getComponents() {
        return this.qie;
    }

    @Override // eQ.fuX
    public FjR.w6 n() {
        return this.rl;
    }

    @Override // eQ.fuX
    public MemoryCache t() {
        return (MemoryCache) this.f63684t.getValue();
    }

    public final UGc xMQ() {
        return this.KN;
    }

    public aC(Context context, FjR.w6 w6Var, Lazy lazy, Lazy lazy2, Lazy lazy3, w6.InterfaceC0848w6 interfaceC0848w6, eQ.n nVar, UGc uGc, SPz sPz) {
        this.f63683n = context;
        this.rl = w6Var;
        this.f63684t = lazy;
        this.nr = lazy2;
        this.f63682O = lazy3;
        this.J2 = interfaceC0848w6;
        this.Uo = nVar;
        this.KN = uGc;
        g9s g9sVar = new g9s(this);
        this.mUb = g9sVar;
        Pl pl = new Pl(this, g9sVar, null);
        this.gh = pl;
        this.qie = nVar.KN().nr(new USj.w6(), HttpUrl.class).nr(new USj.CN3(), String.class).nr(new USj.n(), Uri.class).nr(new USj.Wre(), Uri.class).nr(new USj.I28(), Integer.class).nr(new USj.j(), byte[].class).rl(new Ec7.w6(), Uri.class).rl(new Ec7.j(uGc.n()), File.class).t(new C.n(lazy3, lazy2, uGc.O()), Uri.class).t(new aC.j(), File.class).t(new j.C0222j(), Uri.class).t(new I28.j(), Uri.class).t(new o.n(), Uri.class).t(new Wre.j(), Drawable.class).t(new n.j(), Bitmap.class).t(new w6.j(), ByteBuffer.class).n(new I28.w6(uGc.t(), uGc.rl())).O();
        this.az = CollectionsKt.plus((Collection<? extends fVb.j>) getComponents().t(), new fVb.j(this, g9sVar, pl, null));
        this.ty = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void gh(FjR.I28 i28, InterfaceC2336j interfaceC2336j, eQ.w6 w6Var) {
        FjR.fuX fuxRl = i28.rl();
        if (!(interfaceC2336j instanceof VyM.Ml)) {
            if (interfaceC2336j != null) {
                interfaceC2336j.nr(i28.n());
            }
        } else {
            VyM.w6 w6VarN = i28.rl().Xw().n((VyM.Ml) interfaceC2336j, i28);
            if (!(w6VarN instanceof VyM.n)) {
                w6Var.J2(i28.rl(), w6VarN);
                w6VarN.n();
                w6Var.az(i28.rl(), w6VarN);
            }
        }
        w6Var.rl(fuxRl, i28);
        fuX.n nVarG = fuxRl.g();
        if (nVarG != null) {
            nVarG.rl(fuxRl, i28);
        }
    }

    private final void mUb(FjR.fuX fux, eQ.w6 w6Var) {
        w6Var.t(fux);
        fuX.n nVarG = fux.g();
        if (nVarG != null) {
            nVarG.t(fux);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void qie(Xo xo, InterfaceC2336j interfaceC2336j, eQ.w6 w6Var) {
        FjR.fuX fuxRl = xo.rl();
        xo.t();
        if (!(interfaceC2336j instanceof VyM.Ml)) {
            if (interfaceC2336j != null) {
                interfaceC2336j.rl(xo.n());
            }
        } else {
            VyM.w6 w6VarN = xo.rl().Xw().n((VyM.Ml) interfaceC2336j, xo);
            if (!(w6VarN instanceof VyM.n)) {
                w6Var.J2(xo.rl(), w6VarN);
                w6VarN.n();
                w6Var.az(xo.rl(), w6VarN);
            }
        }
        w6Var.n(fuxRl, xo);
        fuX.n nVarG = fuxRl.g();
        if (nVarG != null) {
            nVarG.n(fuxRl, xo);
        }
    }

    @Override // eQ.fuX
    public Object rl(FjR.fuX fux, Continuation continuation) {
        fux.v();
        return GJW.Dsr.Uo(OU.t().p0N(), new n(fux, null), continuation);
    }
}
