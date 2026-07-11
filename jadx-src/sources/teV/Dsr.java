package teV;

import GJW.vd;
import ILs.r;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Dsr {

    static final class j extends SuspendLambda implements Function2 {
        final /* synthetic */ TFv.CN3 E2;
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f73590O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Function0 f73591S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ TFv.Wre[] f73592Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function3 f73593g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f73594n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f73595o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f73596r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f73597t;

        /* JADX INFO: renamed from: teV.Dsr$j$j, reason: collision with other inner class name */
        static final class C1188j extends SuspendLambda implements Function2 {
            final /* synthetic */ AtomicInteger J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ int f73598O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f73599n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ ILs.CN3 f73600r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ TFv.Wre[] f73601t;

            /* JADX INFO: renamed from: teV.Dsr$j$j$j, reason: collision with other inner class name */
            static final class C1189j implements TFv.CN3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ ILs.CN3 f73602n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ int f73603t;

                /* JADX INFO: renamed from: teV.Dsr$j$j$j$j, reason: collision with other inner class name */
                static final class C1190j extends ContinuationImpl {

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    int f73604O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    /* synthetic */ Object f73605n;

                    C1190j(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f73605n = obj;
                        this.f73604O |= Integer.MIN_VALUE;
                        return C1189j.this.rl(null, this);
                    }
                }

                C1189j(ILs.CN3 cn3, int i2) {
                    this.f73602n = cn3;
                    this.f73603t = i2;
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
                
                    if (GJW.s6u.n(r0) == r1) goto L21;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // TFv.CN3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object rl(Object obj, Continuation continuation) {
                    C1190j c1190j;
                    if (continuation instanceof C1190j) {
                        c1190j = (C1190j) continuation;
                        int i2 = c1190j.f73604O;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c1190j.f73604O = i2 - Integer.MIN_VALUE;
                        } else {
                            c1190j = new C1190j(continuation);
                        }
                    }
                    Object obj2 = c1190j.f73605n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i3 = c1190j.f73604O;
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        ILs.CN3 cn3 = this.f73602n;
                        IndexedValue indexedValue = new IndexedValue(this.f73603t, obj);
                        c1190j.f73604O = 1;
                        if (cn3.mUb(indexedValue, c1190j) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj2);
                    c1190j.f73604O = 2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C1188j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1188j(TFv.Wre[] wreArr, int i2, AtomicInteger atomicInteger, ILs.CN3 cn3, Continuation continuation) {
                super(2, continuation);
                this.f73601t = wreArr;
                this.f73598O = i2;
                this.J2 = atomicInteger;
                this.f73600r = cn3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1188j(this.f73601t, this.f73598O, this.J2, this.f73600r, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                AtomicInteger atomicInteger;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f73599n;
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        TFv.Wre[] wreArr = this.f73601t;
                        int i3 = this.f73598O;
                        TFv.Wre wre = wreArr[i3];
                        C1189j c1189j = new C1189j(this.f73600r, i3);
                        this.f73599n = 1;
                        if (wre.n(c1189j, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        r.j.n(this.f73600r, null, 1, null);
                    }
                    return Unit.INSTANCE;
                } finally {
                    if (this.J2.decrementAndGet() == 0) {
                        r.j.n(this.f73600r, null, 1, null);
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(TFv.Wre[] wreArr, Function0 function0, Function3 function3, TFv.CN3 cn3, Continuation continuation) {
            super(2, continuation);
            this.f73592Z = wreArr;
            this.f73591S = function0;
            this.f73593g = function3;
            this.E2 = cn3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(this.f73592Z, this.f73591S, this.f73593g, this.E2, continuation);
            jVar.f73595o = obj;
            return jVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x0106, code lost:
        
            if (r10.invoke(r11, r9, r21) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0126, code lost:
        
            if (r11.invoke(r12, r10, r21) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0129, code lost:
        
            if (r6 != 0) goto L44;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c1 A[LOOP:0: B:28:0x00c1->B:47:?, LOOP_START, PHI: r6 r10
          0x00c1: PHI (r6v4 int) = (r6v3 int), (r6v5 int) binds: [B:25:0x00bc, B:47:?] A[DONT_GENERATE, DONT_INLINE]
          0x00c1: PHI (r10v5 kotlin.collections.IndexedValue) = (r10v4 kotlin.collections.IndexedValue), (r10v12 kotlin.collections.IndexedValue) binds: [B:25:0x00bc, B:47:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0106 -> B:44:0x0129). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0126 -> B:44:0x0129). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int length;
            int i2;
            byte[] bArr;
            Object[] objArr;
            ILs.CN3 cn3;
            Object objUo;
            Object[] objArr2;
            byte[] bArr2;
            int i3;
            int i5;
            IndexedValue indexedValue;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.f73596r;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f73595o;
                length = this.f73592Z.length;
                if (length == 0) {
                    return Unit.INSTANCE;
                }
                Object[] objArr3 = new Object[length];
                ArraysKt.fill$default(objArr3, z.rl, 0, 0, 6, (Object) null);
                ILs.CN3 cn3Rl = ILs.aC.rl(length, null, null, 6, null);
                AtomicInteger atomicInteger = new AtomicInteger(length);
                i2 = 0;
                int i8 = 0;
                while (i8 < length) {
                    AtomicInteger atomicInteger2 = atomicInteger;
                    GJW.C.nr(vdVar, null, null, new C1188j(this.f73592Z, i8, atomicInteger2, cn3Rl, null), 3, null);
                    i8++;
                    atomicInteger = atomicInteger2;
                }
                bArr = new byte[length];
                objArr = objArr3;
                cn3 = cn3Rl;
                byte b2 = (byte) (i2 + 1);
                this.f73595o = objArr;
                this.f73594n = cn3;
                this.f73597t = bArr;
                this.f73590O = length;
                this.J2 = b2;
                this.f73596r = 1;
                objUo = cn3.Uo(this);
                if (objUo != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i7 != 1) {
                if (i7 != 2 && i7 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5 = this.J2;
                i3 = this.f73590O;
                bArr2 = (byte[]) this.f73597t;
                cn3 = (ILs.CN3) this.f73594n;
                objArr2 = (Object[]) this.f73595o;
                ResultKt.throwOnFailure(obj);
                i2 = i5;
                length = i3;
                bArr = bArr2;
                objArr = objArr2;
                byte b22 = (byte) (i2 + 1);
                this.f73595o = objArr;
                this.f73594n = cn3;
                this.f73597t = bArr;
                this.f73590O = length;
                this.J2 = b22;
                this.f73596r = 1;
                objUo = cn3.Uo(this);
                if (objUo != coroutine_suspended) {
                    byte[] bArr3 = bArr;
                    i3 = length;
                    i5 = b22;
                    objArr2 = objArr;
                    bArr2 = bArr3;
                    indexedValue = (IndexedValue) ILs.C.J2(objUo);
                    if (indexedValue != null) {
                        return Unit.INSTANCE;
                    }
                    while (true) {
                        int index = indexedValue.getIndex();
                        Object obj2 = objArr2[index];
                        objArr2[index] = indexedValue.getValue();
                        if (obj2 == z.rl) {
                            i3--;
                        }
                        if (bArr2[index] != i5) {
                            bArr2[index] = (byte) i5;
                            indexedValue = (IndexedValue) ILs.C.J2(cn3.O());
                            if (indexedValue == null) {
                                if (i3 == 0) {
                                }
                            }
                        } else if (i3 == 0) {
                            Object[] objArr4 = (Object[]) this.f73591S.invoke();
                            if (objArr4 == null) {
                                Function3 function3 = this.f73593g;
                                TFv.CN3 cn32 = this.E2;
                                this.f73595o = objArr2;
                                this.f73594n = cn3;
                                this.f73597t = bArr2;
                                this.f73590O = i3;
                                this.J2 = i5;
                                this.f73596r = 2;
                            } else {
                                ArraysKt.copyInto$default(objArr2, objArr4, 0, 0, 0, 14, (Object) null);
                                Function3 function32 = this.f73593g;
                                TFv.CN3 cn33 = this.E2;
                                this.f73595o = objArr2;
                                this.f73594n = cn3;
                                this.f73597t = bArr2;
                                this.f73590O = i3;
                                this.J2 = i5;
                                this.f73596r = 3;
                            }
                        }
                        byte b222 = (byte) (i2 + 1);
                        this.f73595o = objArr;
                        this.f73594n = cn3;
                        this.f73597t = bArr;
                        this.f73590O = length;
                        this.J2 = b222;
                        this.f73596r = 1;
                        objUo = cn3.Uo(this);
                        if (objUo != coroutine_suspended) {
                        }
                    }
                }
                return coroutine_suspended;
            }
            i5 = this.J2;
            i3 = this.f73590O;
            bArr2 = (byte[]) this.f73597t;
            cn3 = (ILs.CN3) this.f73594n;
            objArr2 = (Object[]) this.f73595o;
            ResultKt.throwOnFailure(obj);
            objUo = ((ILs.C) obj).az();
            indexedValue = (IndexedValue) ILs.C.J2(objUo);
            if (indexedValue != null) {
            }
        }
    }

    public static final Object n(TFv.CN3 cn3, TFv.Wre[] wreArr, Function0 function0, Function3 function3, Continuation continuation) {
        Object objN = o.n(new j(wreArr, function0, function3, cn3, null), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }
}
