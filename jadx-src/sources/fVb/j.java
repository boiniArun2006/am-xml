package fVb;

import Be4.aC;
import Be4.eO;
import Be4.psW;
import FjR.C;
import FjR.Pl;
import FjR.Xo;
import GJW.Lu;
import GJW.lej;
import GJW.vd;
import Lf.qz;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache;
import eQ.n;
import fVb.n;
import java.util.List;
import java.util.concurrent.CancellationException;
import kYF.SPz;
import kYF.g9s;
import kYF.l3D;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j implements fVb.n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final C0925j f66907O = new C0925j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final eQ.fuX f66908n;
    private final coil.memory.w6 nr;
    private final g9s rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Pl f66909t;

    static final class CN3 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f66910O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66911n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f66912r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f66913t;

        CN3(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66910O = obj;
            this.f66912r |= Integer.MIN_VALUE;
            return j.this.n(null, this);
        }
    }

    static final class Dsr extends SuspendLambda implements Function2 {
        final /* synthetic */ List E2;
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f66914O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ n f66915S;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ FjR.fuX f66916X;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ eQ.w6 f66918e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ C f66919g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66920n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f66921o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f66922r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f66923t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Dsr) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Dsr(n nVar, C c2, List list, eQ.w6 w6Var, FjR.fuX fux, Continuation continuation) {
            super(2, continuation);
            this.f66915S = nVar;
            this.f66919g = c2;
            this.E2 = list;
            this.f66918e = w6Var;
            this.f66916X = fux;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Dsr dsr = j.this.new Dsr(this.f66915S, this.f66919g, this.E2, this.f66918e, this.f66916X, continuation);
            dsr.f66921o = obj;
            return dsr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            vd vdVar;
            Bitmap bitmapKN;
            List list;
            C c2;
            int size;
            int i2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f66922r;
            if (i3 != 0) {
                if (i3 == 1) {
                    size = this.J2;
                    int i5 = this.f66914O;
                    c2 = (C) this.f66923t;
                    list = (List) this.f66920n;
                    vdVar = (vd) this.f66921o;
                    ResultKt.throwOnFailure(obj);
                    bitmapKN = (Bitmap) obj;
                    Lu.Uo(vdVar);
                    i2 = i5 + 1;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                vdVar = (vd) this.f66921o;
                bitmapKN = j.this.KN(this.f66915S.O(), this.f66919g, this.E2);
                this.f66918e.Uo(this.f66916X, bitmapKN);
                list = this.E2;
                c2 = this.f66919g;
                size = list.size();
                i2 = 0;
            }
            if (i2 >= size) {
                this.f66918e.qie(this.f66916X, bitmapKN);
                return n.rl(this.f66915S, new BitmapDrawable(this.f66916X.qie().getResources(), bitmapKN), false, null, null, 14, null);
            }
            android.support.v4.media.j.n(list.get(i2));
            c2.HI();
            this.f66921o = vdVar;
            this.f66920n = list;
            this.f66923t = c2;
            this.f66914O = i2;
            this.J2 = size;
            this.f66922r = 1;
            throw null;
        }
    }

    static final class I28 extends SuspendLambda implements Function2 {
        final /* synthetic */ Ref.ObjectRef J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f66924O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ eQ.w6 f66925S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f66926Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66927n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Object f66928o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ FjR.fuX f66929r;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, FjR.fuX fux, Object obj, Ref.ObjectRef objectRef3, eQ.w6 w6Var, Continuation continuation) {
            super(2, continuation);
            this.f66924O = objectRef;
            this.J2 = objectRef2;
            this.f66929r = fux;
            this.f66928o = obj;
            this.f66926Z = objectRef3;
            this.f66925S = w6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return j.this.new I28(this.f66924O, this.J2, this.f66929r, this.f66928o, this.f66926Z, this.f66925S, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66927n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            j jVar = j.this;
            qz qzVar = (qz) this.f66924O.element;
            eQ.n nVar = (eQ.n) this.J2.element;
            FjR.fuX fux = this.f66929r;
            Object obj2 = this.f66928o;
            C c2 = (C) this.f66926Z.element;
            eQ.w6 w6Var = this.f66925S;
            this.f66927n = 1;
            Object objXMQ = jVar.xMQ(qzVar, nVar, fux, obj2, c2, w6Var, this);
            if (objXMQ == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objXMQ;
        }
    }

    static final class Ml extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f66931O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        Object f66932S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        Object f66933Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66934e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f66935g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66936n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f66937o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f66938r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f66939t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66935g = obj;
            this.f66934e |= Integer.MIN_VALUE;
            return j.this.mUb(null, null, null, null, this);
        }
    }

    static final class Wre extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f66940O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f66941S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        Object f66942Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66943e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f66944g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66945n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f66946o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f66947r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f66948t;

        Wre(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66944g = obj;
            this.f66943e |= Integer.MIN_VALUE;
            return j.this.gh(null, null, null, null, null, this);
        }
    }

    static final class fuX extends SuspendLambda implements Function2 {
        final /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ FjR.fuX f66949O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ n.j f66950S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ MemoryCache.Key f66951Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66952n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ eQ.w6 f66953o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ C f66954r;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((fuX) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        fuX(FjR.fuX fux, Object obj, C c2, eQ.w6 w6Var, MemoryCache.Key key, n.j jVar, Continuation continuation) {
            super(2, continuation);
            this.f66949O = fux;
            this.J2 = obj;
            this.f66954r = c2;
            this.f66953o = w6Var;
            this.f66951Z = key;
            this.f66950S = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return j.this.new fuX(this.f66949O, this.J2, this.f66954r, this.f66953o, this.f66951Z, this.f66950S, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objMUb;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66952n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    objMUb = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                j jVar = j.this;
                FjR.fuX fux = this.f66949O;
                Object obj2 = this.J2;
                C c2 = this.f66954r;
                eQ.w6 w6Var = this.f66953o;
                this.f66952n = 1;
                objMUb = jVar.mUb(fux, obj2, c2, w6Var, this);
                if (objMUb == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            n nVar = (n) objMUb;
            j.this.rl.t();
            boolean zKN = j.this.nr.KN(this.f66951Z, this.f66949O, nVar);
            Drawable drawableO = nVar.O();
            FjR.fuX fux2 = this.f66949O;
            Be4.CN3 cn3T = nVar.t();
            MemoryCache.Key key = this.f66951Z;
            if (!zKN) {
                key = null;
            }
            return new Xo(drawableO, fux2, cn3T, key, nVar.nr(), nVar.J2(), kYF.C.o(this.f66950S));
        }
    }

    /* JADX INFO: renamed from: fVb.j$j, reason: collision with other inner class name */
    public static final class C0925j {
        public /* synthetic */ C0925j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0925j() {
        }
    }

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Drawable f66956n;
        private final String nr;
        private final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Be4.CN3 f66957t;

        public static /* synthetic */ n rl(n nVar, Drawable drawable, boolean z2, Be4.CN3 cn3, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                drawable = nVar.f66956n;
            }
            if ((i2 & 2) != 0) {
                z2 = nVar.rl;
            }
            if ((i2 & 4) != 0) {
                cn3 = nVar.f66957t;
            }
            if ((i2 & 8) != 0) {
                str = nVar.nr;
            }
            return nVar.n(drawable, z2, cn3, str);
        }

        public final boolean J2() {
            return this.rl;
        }

        public final Drawable O() {
            return this.f66956n;
        }

        public final n n(Drawable drawable, boolean z2, Be4.CN3 cn3, String str) {
            return new n(drawable, z2, cn3, str);
        }

        public final String nr() {
            return this.nr;
        }

        public final Be4.CN3 t() {
            return this.f66957t;
        }

        public n(Drawable drawable, boolean z2, Be4.CN3 cn3, String str) {
            this.f66956n = drawable;
            this.rl = z2;
            this.f66957t = cn3;
            this.nr = str;
        }
    }

    static final class w6 extends ContinuationImpl {
        /* synthetic */ Object E2;
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f66958O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        Object f66959S;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        int f66960X;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        Object f66961Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f66963g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66964n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f66965o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f66966r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f66967t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.E2 = obj;
            this.f66960X |= Integer.MIN_VALUE;
            return j.this.xMQ(null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap KN(Drawable drawable, C c2, List list) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (ArraysKt.contains(kYF.C.ty(), kYF.j.t(bitmap))) {
                return bitmap;
            }
        }
        return l3D.f69954n.n(drawable, c2.J2(), c2.HI(), c2.ty(), c2.t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0091 -> B:21:0x0095). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object gh(eQ.n nVar, FjR.fuX fux, Object obj, C c2, eQ.w6 w6Var, Continuation continuation) {
        Wre wre;
        int i2;
        j jVar;
        Pair pairMUb;
        psW pswT;
        if (continuation instanceof Wre) {
            wre = (Wre) continuation;
            int i3 = wre.f66943e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wre.f66943e = i3 - Integer.MIN_VALUE;
            } else {
                wre = new Wre(continuation);
            }
        }
        Object obj2 = wre.f66944g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = wre.f66943e;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj2);
            i2 = 0;
            jVar = this;
            pairMUb = nVar.mUb(obj, c2, jVar.f66908n, i2);
            if (pairMUb != null) {
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = wre.f66941S;
            Lf.Dsr dsr = (Lf.Dsr) wre.f66942Z;
            eQ.w6 w6Var2 = (eQ.w6) wre.f66946o;
            c2 = (C) wre.f66947r;
            Object obj3 = wre.J2;
            FjR.fuX fux2 = (FjR.fuX) wre.f66940O;
            eQ.n nVar2 = (eQ.n) wre.f66948t;
            jVar = (j) wre.f66945n;
            ResultKt.throwOnFailure(obj2);
            Wre wre2 = wre;
            int i8 = i7;
            nVar = nVar2;
            Wre wre3 = wre2;
            Lf.Dsr dsr2 = dsr;
            fux = fux2;
            w6Var = w6Var2;
            obj = obj3;
            Lf.fuX fux3 = (Lf.fuX) obj2;
            try {
                w6Var.KN(fux, dsr2, c2, fux3);
                if (fux3 == null) {
                    return fux3;
                }
                i2 = i8;
                wre = wre3;
                pairMUb = nVar.mUb(obj, c2, jVar.f66908n, i2);
                if (pairMUb != null) {
                    throw new IllegalStateException(("Unable to create a fetcher that supports: " + obj).toString());
                }
                dsr2 = (Lf.Dsr) pairMUb.getFirst();
                int iIntValue = ((Number) pairMUb.getSecond()).intValue() + 1;
                w6Var.ck(fux, dsr2, c2);
                wre.f66945n = jVar;
                wre.f66948t = nVar;
                wre.f66940O = fux;
                wre.J2 = obj;
                wre.f66947r = c2;
                wre.f66946o = w6Var;
                wre.f66942Z = dsr2;
                wre.f66941S = iIntValue;
                wre.f66943e = 1;
                Object objN = dsr2.n(wre);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Wre wre4 = wre;
                i8 = iIntValue;
                obj2 = objN;
                wre3 = wre4;
                Lf.fuX fux32 = (Lf.fuX) obj2;
                w6Var.KN(fux, dsr2, c2, fux32);
                if (fux32 == null) {
                }
            } catch (Throwable th) {
                qz qzVar = fux32 instanceof qz ? (qz) fux32 : null;
                if (qzVar != null && (pswT = qzVar.t()) != null) {
                    kYF.C.nr(pswT);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d3, code lost:
    
        if (r0 == r9) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r2v11, types: [FjR.C, T] */
    /* JADX WARN: Type inference failed for: r2v16, types: [T, eQ.n] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, eQ.n] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mUb(FjR.fuX fux, Object obj, C c2, eQ.w6 w6Var, Continuation continuation) throws Throwable {
        Ml ml;
        qz qzVar;
        psW pswT;
        j jVar;
        FjR.fuX fux2;
        Object obj2;
        eQ.w6 w6Var2;
        Ref.ObjectRef objectRef;
        T t3;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        FjR.fuX fux3;
        Ref.ObjectRef objectRef6;
        eQ.w6 w6Var3;
        n nVar;
        eQ.w6 w6Var4;
        j jVar2;
        qz qzVar2;
        psW pswT2;
        Object obj3;
        Object obj4;
        Bitmap bitmap;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f66934e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f66934e = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Ml ml2 = ml;
        Object obj5 = ml2.f66935g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Ref.ObjectRef objectRef7 = ml2.f66934e;
        try {
            if (objectRef7 == 0) {
                ResultKt.throwOnFailure(obj5);
                Ref.ObjectRef objectRef8 = new Ref.ObjectRef();
                objectRef8.element = c2;
                Ref.ObjectRef objectRef9 = new Ref.ObjectRef();
                objectRef9.element = this.f66908n.getComponents();
                Ref.ObjectRef objectRef10 = new Ref.ObjectRef();
                try {
                    objectRef8.element = this.f66909t.KN((C) objectRef8.element);
                    if (fux.WPU() != null || fux.HI() != null) {
                        n.j jVarKN = ((eQ.n) objectRef9.element).KN();
                        Pair pairWPU = fux.WPU();
                        if (pairWPU != null) {
                            jVarKN.Uo().add(0, pairWPU);
                        }
                        aC.j jVarHI = fux.HI();
                        if (jVarHI != null) {
                            jVarKN.J2().add(0, jVarHI);
                        }
                        objectRef9.element = jVarKN.O();
                    }
                    eQ.n nVar2 = (eQ.n) objectRef9.element;
                    C c4 = (C) objectRef8.element;
                    ml2.f66936n = this;
                    ml2.f66939t = fux;
                    ml2.f66931O = obj;
                    ml2.J2 = w6Var;
                    ml2.f66938r = objectRef8;
                    ml2.f66937o = objectRef9;
                    ml2.f66933Z = objectRef10;
                    ml2.f66932S = objectRef10;
                    ml2.f66934e = 1;
                    Object objGh = gh(nVar2, fux, obj, c4, w6Var, ml2);
                    if (objGh != coroutine_suspended) {
                        jVar = this;
                        fux2 = fux;
                        obj2 = obj;
                        w6Var2 = w6Var;
                        objectRef = objectRef8;
                        t3 = objGh;
                        objectRef2 = objectRef9;
                        objectRef3 = objectRef10;
                        objectRef4 = objectRef3;
                    }
                    return coroutine_suspended;
                } catch (Throwable th) {
                    th = th;
                    objectRef7 = objectRef10;
                    T t4 = objectRef7.element;
                    if (t4 instanceof qz) {
                    }
                    if (qzVar != null) {
                        kYF.C.nr(pswT);
                    }
                    throw th;
                }
            }
            if (objectRef7 == 1) {
                objectRef3 = (Ref.ObjectRef) ml2.f66932S;
                objectRef4 = (Ref.ObjectRef) ml2.f66933Z;
                Ref.ObjectRef objectRef11 = (Ref.ObjectRef) ml2.f66937o;
                Ref.ObjectRef objectRef12 = (Ref.ObjectRef) ml2.f66938r;
                eQ.w6 w6Var5 = (eQ.w6) ml2.J2;
                Object obj6 = ml2.f66931O;
                FjR.fuX fux4 = (FjR.fuX) ml2.f66939t;
                j jVar3 = (j) ml2.f66936n;
                try {
                    ResultKt.throwOnFailure(obj5);
                    objectRef2 = objectRef11;
                    objectRef = objectRef12;
                    w6Var2 = w6Var5;
                    obj2 = obj6;
                    fux2 = fux4;
                    jVar = jVar3;
                    t3 = obj5;
                } catch (Throwable th2) {
                    th = th2;
                    objectRef7 = objectRef4;
                    T t42 = objectRef7.element;
                    if (t42 instanceof qz) {
                    }
                    if (qzVar != null) {
                    }
                    throw th;
                }
            } else {
                if (objectRef7 != 2) {
                    if (objectRef7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj5);
                    obj4 = obj5;
                    n nVar3 = (n) obj4;
                    Drawable drawableO = nVar3.O();
                    BitmapDrawable bitmapDrawable = drawableO instanceof BitmapDrawable ? (BitmapDrawable) drawableO : null;
                    if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                        bitmap.prepareToDraw();
                    }
                    return nVar3;
                }
                objectRef5 = (Ref.ObjectRef) ml2.f66938r;
                objectRef6 = (Ref.ObjectRef) ml2.J2;
                w6Var4 = (eQ.w6) ml2.f66931O;
                fux3 = (FjR.fuX) ml2.f66939t;
                jVar2 = (j) ml2.f66936n;
                ResultKt.throwOnFailure(obj5);
                obj3 = obj5;
                w6Var3 = w6Var4;
                jVar = jVar2;
                nVar = (n) obj3;
                Ref.ObjectRef objectRef13 = objectRef6;
                T t5 = objectRef5.element;
                qzVar2 = t5 instanceof qz ? (qz) t5 : null;
                if (qzVar2 != null && (pswT2 = qzVar2.t()) != null) {
                    kYF.C.nr(pswT2);
                }
                C c5 = (C) objectRef13.element;
                ml2.f66936n = null;
                ml2.f66939t = null;
                ml2.f66931O = null;
                ml2.J2 = null;
                ml2.f66938r = null;
                ml2.f66937o = null;
                ml2.f66933Z = null;
                ml2.f66932S = null;
                ml2.f66934e = 3;
                Object objQie = jVar.qie(nVar, fux3, c5, w6Var3, ml2);
                obj4 = objQie;
            }
            objectRef3.element = t3;
            T t6 = objectRef4.element;
            Lf.fuX fux5 = (Lf.fuX) t6;
            if (fux5 instanceof qz) {
                lej lejVarTy = fux2.ty();
                Ref.ObjectRef objectRef14 = objectRef4;
                try {
                    I28 i28 = jVar.new I28(objectRef14, objectRef2, fux2, obj2, objectRef, w6Var2, null);
                    objectRef5 = objectRef14;
                    fux3 = fux2;
                    objectRef6 = objectRef;
                    w6Var4 = w6Var2;
                    ml2.f66936n = jVar;
                    ml2.f66939t = fux3;
                    ml2.f66931O = w6Var4;
                    ml2.J2 = objectRef6;
                    ml2.f66938r = objectRef5;
                    ml2.f66937o = null;
                    ml2.f66933Z = null;
                    ml2.f66932S = null;
                    ml2.f66934e = 2;
                    Object objUo = GJW.Dsr.Uo(lejVarTy, i28, ml2);
                    if (objUo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    jVar2 = jVar;
                    obj3 = objUo;
                    w6Var3 = w6Var4;
                    jVar = jVar2;
                    nVar = (n) obj3;
                    Ref.ObjectRef objectRef132 = objectRef6;
                    T t52 = objectRef5.element;
                    if (t52 instanceof qz) {
                    }
                    if (qzVar2 != null) {
                        kYF.C.nr(pswT2);
                    }
                    C c52 = (C) objectRef132.element;
                    ml2.f66936n = null;
                    ml2.f66939t = null;
                    ml2.f66931O = null;
                    ml2.J2 = null;
                    ml2.f66938r = null;
                    ml2.f66937o = null;
                    ml2.f66933Z = null;
                    ml2.f66932S = null;
                    ml2.f66934e = 3;
                    Object objQie2 = jVar.qie(nVar, fux3, c52, w6Var3, ml2);
                    obj4 = objQie2;
                } catch (Throwable th3) {
                    th = th3;
                    objectRef7 = objectRef14;
                    T t422 = objectRef7.element;
                    qzVar = t422 instanceof qz ? (qz) t422 : null;
                    if (qzVar != null && (pswT = qzVar.t()) != null) {
                        kYF.C.nr(pswT);
                    }
                    throw th;
                }
            } else {
                objectRef5 = objectRef4;
                fux3 = fux2;
                objectRef6 = objectRef;
                eQ.w6 w6Var6 = w6Var2;
                if (!(fux5 instanceof Lf.CN3)) {
                    throw new NoWhenBranchMatchedException();
                }
                w6Var3 = w6Var6;
                nVar = new n(((Lf.CN3) t6).rl(), ((Lf.CN3) objectRef5.element).t(), ((Lf.CN3) objectRef5.element).n(), null);
                Ref.ObjectRef objectRef1322 = objectRef6;
                T t522 = objectRef5.element;
                if (t522 instanceof qz) {
                }
                if (qzVar2 != null) {
                }
                C c522 = (C) objectRef1322.element;
                ml2.f66936n = null;
                ml2.f66939t = null;
                ml2.f66931O = null;
                ml2.J2 = null;
                ml2.f66938r = null;
                ml2.f66937o = null;
                ml2.f66933Z = null;
                ml2.f66932S = null;
                ml2.f66934e = 3;
                Object objQie22 = jVar.qie(nVar, fux3, c522, w6Var3, ml2);
                obj4 = objQie22;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0097 -> B:21:0x009e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object xMQ(qz qzVar, eQ.n nVar, FjR.fuX fux, Object obj, C c2, eQ.w6 w6Var, Continuation continuation) {
        w6 w6Var2;
        int i2;
        j jVar;
        Pair pairXMQ;
        if (continuation instanceof w6) {
            w6Var2 = (w6) continuation;
            int i3 = w6Var2.f66960X;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w6Var2.f66960X = i3 - Integer.MIN_VALUE;
            } else {
                w6Var2 = new w6(continuation);
            }
        }
        Object obj2 = w6Var2.E2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = w6Var2.f66960X;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj2);
            i2 = 0;
            jVar = this;
            pairXMQ = nVar.xMQ(qzVar, c2, jVar.f66908n, i2);
            if (pairXMQ != null) {
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = w6Var2.f66963g;
            aC aCVar = (aC) w6Var2.f66959S;
            eQ.w6 w6Var3 = (eQ.w6) w6Var2.f66961Z;
            C c4 = (C) w6Var2.f66965o;
            Object obj3 = w6Var2.f66966r;
            FjR.fuX fux2 = (FjR.fuX) w6Var2.J2;
            eQ.n nVar2 = (eQ.n) w6Var2.f66958O;
            qz qzVar2 = (qz) w6Var2.f66967t;
            jVar = (j) w6Var2.f66964n;
            ResultKt.throwOnFailure(obj2);
            w6 w6Var4 = w6Var2;
            int i8 = i7;
            qzVar = qzVar2;
            w6 w6Var5 = w6Var4;
            w6Var = w6Var3;
            fux = fux2;
            c2 = c4;
            obj = obj3;
            Be4.fuX fux3 = (Be4.fuX) obj2;
            w6Var.Ik(fux, aCVar, c2, fux3);
            if (fux3 == null) {
                Drawable drawableN = fux3.n();
                boolean zRl = fux3.rl();
                Be4.CN3 cn3N = qzVar.n();
                psW pswT = qzVar.t();
                eO eOVar = pswT instanceof eO ? (eO) pswT : null;
                return new n(drawableN, zRl, cn3N, eOVar != null ? eOVar.jB() : null);
            }
            i2 = i8;
            nVar = nVar2;
            w6Var2 = w6Var5;
            pairXMQ = nVar.xMQ(qzVar, c2, jVar.f66908n, i2);
            if (pairXMQ != null) {
                throw new IllegalStateException(("Unable to create a decoder that supports: " + obj).toString());
            }
            aC aCVar2 = (aC) pairXMQ.getFirst();
            int iIntValue = ((Number) pairXMQ.getSecond()).intValue() + 1;
            w6Var.gh(fux, aCVar2, c2);
            w6Var2.f66964n = jVar;
            w6Var2.f66967t = qzVar;
            w6Var2.f66958O = nVar;
            w6Var2.J2 = fux;
            w6Var2.f66966r = obj;
            w6Var2.f66965o = c2;
            w6Var2.f66961Z = w6Var;
            w6Var2.f66959S = aCVar2;
            w6Var2.f66963g = iIntValue;
            w6Var2.f66960X = 1;
            Object objN = aCVar2.n(w6Var2);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            nVar2 = nVar;
            aCVar = aCVar2;
            w6 w6Var6 = w6Var2;
            i8 = iIntValue;
            obj2 = objN;
            w6Var5 = w6Var6;
            Be4.fuX fux32 = (Be4.fuX) obj2;
            w6Var.Ik(fux, aCVar, c2, fux32);
            if (fux32 == null) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // fVb.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(n.j jVar, Continuation continuation) throws Throwable {
        CN3 cn3;
        Throwable th;
        j jVar2;
        MemoryCache.n nVarN;
        if (continuation instanceof CN3) {
            cn3 = (CN3) continuation;
            int i2 = cn3.f66912r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cn3.f66912r = i2 - Integer.MIN_VALUE;
            } else {
                cn3 = new CN3(continuation);
            }
        }
        Object obj = cn3.f66910O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = cn3.f66912r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                FjR.fuX fuxN = jVar.n();
                Object objAz = fuxN.az();
                Z.fuX size = jVar.getSize();
                eQ.w6 w6VarUo = kYF.C.Uo(jVar);
                C cJ2 = this.f66909t.J2(fuxN, size);
                Z.CN3 cn3Ty = cJ2.ty();
                w6VarUo.r(fuxN, objAz);
                Object objUo = this.f66908n.getComponents().Uo(objAz, cJ2);
                w6VarUo.ty(fuxN, objUo);
                MemoryCache.Key keyJ2 = this.nr.J2(fuxN, objUo, cJ2, w6VarUo);
                if (keyJ2 != null) {
                    try {
                        nVarN = this.nr.n(fuxN, keyJ2, size, cn3Ty);
                    } catch (Throwable th2) {
                        th = th2;
                        jVar2 = this;
                    }
                } else {
                    nVarN = null;
                }
                if (nVarN != null) {
                    return this.nr.Uo(jVar, fuxN, keyJ2, nVarN);
                }
                lej lejVarS = fuxN.S();
                try {
                    fuX fux = new fuX(fuxN, objUo, cJ2, w6VarUo, keyJ2, jVar, null);
                    cn3.f66911n = this;
                    cn3.f66913t = jVar;
                    cn3.f66912r = 1;
                    Object objUo2 = GJW.Dsr.Uo(lejVarS, fux, cn3);
                    return objUo2 == coroutine_suspended ? coroutine_suspended : objUo2;
                } catch (Throwable th3) {
                    th = th3;
                    jVar2 = this;
                    jVar = jVar;
                }
            } catch (Throwable th4) {
                th = th4;
                jVar2 = this;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (n.j) cn3.f66913t;
            jVar2 = (j) cn3.f66911n;
            try {
                ResultKt.throwOnFailure(obj);
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
        if (th instanceof CancellationException) {
            throw th;
        }
        return jVar2.f66909t.n(jVar.n(), th);
    }

    public j(eQ.fuX fux, g9s g9sVar, Pl pl, SPz sPz) {
        this.f66908n = fux;
        this.rl = g9sVar;
        this.f66909t = pl;
        this.nr = new coil.memory.w6(fux, pl, null);
    }

    public final Object qie(n nVar, FjR.fuX fux, C c2, eQ.w6 w6Var, Continuation continuation) {
        List listBzg = fux.bzg();
        if (listBzg.isEmpty()) {
            return nVar;
        }
        if (!(nVar.O() instanceof BitmapDrawable) && !fux.Uo()) {
            return nVar;
        }
        return GJW.Dsr.Uo(fux.rV9(), new Dsr(nVar, c2, listBzg, w6Var, fux, null), continuation);
    }
}
