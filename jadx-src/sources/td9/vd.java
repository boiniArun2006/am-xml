package td9;

import QmE.iF;
import android.content.Context;
import com.alightcreative.account.o;
import com.bendingspoons.networking.NetworkError;
import com.bendingspoons.oracle.models.OracleResponse;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import ga6.j;
import java.util.List;
import java.util.Set;
import kP.InterfaceC2210n;
import kgE.K;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import qu.I28;
import w.InterfaceC2413n;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class vd implements lej {
    private final CZF.I28 J2;
    private final cKn.Wre KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final rB.Ml f73574O;
    private final nKt.n Uo;
    private final InterfaceC2210n gh;
    private final InterfaceC2413n mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final iF f73575n;
    private final qu.I28 nr;
    private final Context rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final NuI.Dsr f73576t;
    private final nYs.Ml xMQ;
    public static final j qie = new j(null);
    public static final int az = 8;

    static final class I28 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f73577O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f73578n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f73579r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f73580t;

        I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f73577O = obj;
            this.f73579r |= Integer.MIN_VALUE;
            return vd.this.n(this);
        }
    }

    static final class Ml extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73581n;

        Ml(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new Ml(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f73581n == 0) {
                ResultKt.throwOnFailure(obj);
                pq.Ml ml = new pq.Ml();
                FirebaseUser firebaseUserXMQ = FirebaseAuth.getInstance().xMQ();
                if (firebaseUserXMQ != null) {
                    List listP0N = firebaseUserXMQ.p0N();
                    Intrinsics.checkNotNullExpressionValue(listP0N, "getProviderData(...)");
                    ml.J2("firebase_auth_providers", rWZ.j.mUb(PJ9.DAz.a(listP0N)));
                }
                return ml;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Ml) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f73583n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f73584t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f73584t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return vd.this.O(null, this);
        }
    }

    static final class w6 implements AR.w6 {
        w6() {
        }

        @Override // AR.w6
        public final Object n(Continuation continuation) {
            String strF;
            List listEmptyList;
            List listP0N;
            FirebaseUser firebaseUserXMQ = FirebaseAuth.getInstance().xMQ();
            String strT = rWZ.j.t(XoT.fuX.r(vd.this.rl));
            String strT2 = rWZ.j.t(XoT.fuX.o(vd.this.rl));
            pq.Ml ml = new pq.Ml();
            if (firebaseUserXMQ == null || (strF = firebaseUserXMQ.f()) == null) {
                strF = "";
            }
            ml.O("firebase_id", strF);
            if (firebaseUserXMQ != null && (listP0N = firebaseUserXMQ.p0N()) != null) {
                listEmptyList = PJ9.DAz.a(listP0N);
            } else {
                listEmptyList = null;
            }
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            ml.J2("firebase_auth_providers", rWZ.j.mUb(listEmptyList));
            ml.O("external_storage_authorization_read", strT);
            ml.O("external_storage_authorization_write", strT2);
            o.j jVar = com.alightcreative.account.o.gh;
            Set setNr = jVar.n().nr();
            K.j jVar2 = kgE.K.f70071O;
            ml.KN("is_premium_user", setNr.containsAll(jVar2.n()));
            ml.KN("is_premium_ultra_user", jVar.n().nr().containsAll(jVar2.rl()));
            return ml;
        }
    }

    public vd(iF eventLogger, Context context, NuI.Dsr initializeAdMediatorUseCase, qu.I28 oracleResponseStore, rB.Ml spiderSense, CZF.I28 pico, nKt.n picoX, cKn.Wre theirs, nYs.Ml getAlightSettingsUseCase, InterfaceC2413n getMonorepoLibUseCase, InterfaceC2210n injet) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initializeAdMediatorUseCase, "initializeAdMediatorUseCase");
        Intrinsics.checkNotNullParameter(oracleResponseStore, "oracleResponseStore");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        Intrinsics.checkNotNullParameter(pico, "pico");
        Intrinsics.checkNotNullParameter(picoX, "picoX");
        Intrinsics.checkNotNullParameter(theirs, "theirs");
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        Intrinsics.checkNotNullParameter(getMonorepoLibUseCase, "getMonorepoLibUseCase");
        Intrinsics.checkNotNullParameter(injet, "injet");
        this.f73575n = eventLogger;
        this.rl = context;
        this.f73576t = initializeAdMediatorUseCase;
        this.nr = oracleResponseStore;
        this.f73574O = spiderSense;
        this.J2 = pico;
        this.Uo = picoX;
        this.KN = theirs;
        this.xMQ = getAlightSettingsUseCase;
        this.mUb = getMonorepoLibUseCase;
        this.gh = injet;
    }

    private final void J2() {
        wR.n.f74981t.n(new Function0() { // from class: td9.rv6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(vd.Uo(this.f73570n));
            }
        });
    }

    private final void KN() {
        this.J2.J2(new w6());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(OracleResponse oracleResponse, Continuation continuation) {
        n nVar;
        vd vdVar;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object obj = nVar.f73584t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            nYs.Ml ml = this.xMQ;
            nVar.f73583n = this;
            nVar.J2 = 1;
            if (ml.n(oracleResponse, nVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            vdVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vdVar = (vd) nVar.f73583n;
            ResultKt.throwOnFailure(obj);
        }
        vdVar.mUb.t();
        vdVar.J2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Uo(vd vdVar) {
        nYs.j jVarInvoke = vdVar.xMQ.invoke();
        return jVarInvoke != null && jVarInvoke.O();
    }

    private final void xMQ() {
        this.f73574O.n(new Ml(null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        if (r4.O(r1, r8) == r2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0128, code lost:
    
        if (r1.n(r8) != r2) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3 A[PHI: r3 r4
      0x00c3: PHI (r3v7 kotlin.jvm.internal.Ref$BooleanRef) = (r3v4 kotlin.jvm.internal.Ref$BooleanRef), (r3v11 kotlin.jvm.internal.Ref$BooleanRef) binds: [B:26:0x00b0, B:30:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r4v5 td9.vd) = (r4v2 td9.vd), (r4v12 td9.vd) binds: [B:26:0x00b0, B:30:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133 A[PHI: r1 r3 r4
      0x0133: PHI (r1v19 x0X.n) = (r1v11 x0X.n), (r1v24 x0X.n) binds: [B:43:0x00fe, B:53:0x012c] A[DONT_GENERATE, DONT_INLINE]
      0x0133: PHI (r3v20 kotlin.jvm.internal.Ref$BooleanRef) = (r3v14 kotlin.jvm.internal.Ref$BooleanRef), (r3v26 kotlin.jvm.internal.Ref$BooleanRef) binds: [B:43:0x00fe, B:53:0x012c] A[DONT_GENERATE, DONT_INLINE]
      0x0133: PHI (r4v21 td9.vd) = (r4v15 td9.vd), (r4v22 td9.vd) binds: [B:43:0x00fe, B:53:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // td9.lej
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        I28 i28;
        Ref.BooleanRef booleanRef;
        vd vdVar;
        OracleResponse oracleResponse;
        boolean z2;
        long duration;
        Object objN;
        Ref.BooleanRef booleanRef2;
        vd vdVar2;
        x0X.n w6Var;
        NetworkError networkError;
        NetworkError networkError2;
        x0X.n nVarRl;
        nYs.j jVarInvoke;
        InterfaceC2210n interfaceC2210n;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i2 = i28.f73579r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i28.f73579r = i2 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        I28 i282 = i28;
        Object obj = i282.f73577O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i282.f73579r) {
            case 0:
                ResultKt.throwOnFailure(obj);
                xMQ();
                KN();
                this.Uo.start();
                Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
                qu.I28 i283 = this.nr;
                i282.f73578n = this;
                i282.f73580t = booleanRef3;
                i282.f73579r = 1;
                Object objN2 = qu.Wre.n(i283, i282);
                if (objN2 != coroutine_suspended) {
                    booleanRef = booleanRef3;
                    obj = objN2;
                    vdVar = this;
                    oracleResponse = (OracleResponse) obj;
                    if (oracleResponse == null) {
                        i282.f73578n = vdVar;
                        i282.f73580t = booleanRef;
                        i282.f73579r = 2;
                    } else {
                        Ref.BooleanRef booleanRef4 = booleanRef;
                        vd vdVar3 = vdVar;
                        qu.I28 i284 = vdVar3.nr;
                        z2 = booleanRef4.element;
                        int i3 = !z2 ? 1 : 5;
                        if (z2) {
                            Duration.Companion companion = Duration.INSTANCE;
                            duration = DurationKt.toDuration(10, DurationUnit.SECONDS);
                        } else {
                            Duration.Companion companion2 = Duration.INSTANCE;
                            duration = DurationKt.toDuration(5, DurationUnit.SECONDS);
                        }
                        i282.f73578n = vdVar3;
                        i282.f73580t = booleanRef4;
                        i282.f73579r = 3;
                        objN = I28.w6.n(i284, i3, duration, null, i282, 4, null);
                        if (objN != coroutine_suspended) {
                            booleanRef2 = booleanRef4;
                            obj = objN;
                            vdVar2 = vdVar3;
                            w6Var = (x0X.n) obj;
                            if (w6Var instanceof n.C1266n) {
                                if (w6Var instanceof n.C1266n) {
                                    if (!(w6Var instanceof n.w6)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    nVarRl = M3.j.rl(M3.n.rl(w6Var, j.w6.J2, j.EnumC0949j.f67611O, null, null, 12, null), vdVar2.f73575n);
                                    jVarInvoke = vdVar2.xMQ.invoke();
                                    if (jVarInvoke != null) {
                                        interfaceC2210n = vdVar2.gh;
                                        i282.f73578n = nVarRl;
                                        i282.f73580t = null;
                                        i282.f73579r = 7;
                                        if (interfaceC2210n.n(i282) != coroutine_suspended) {
                                        }
                                    }
                                    return nVarRl;
                                }
                                networkError = (NetworkError) ((n.C1266n) w6Var).n();
                                if (booleanRef2.element) {
                                    NuI.Dsr dsr = vdVar2.f73576t;
                                    i282.f73578n = vdVar2;
                                    i282.f73580t = networkError;
                                    i282.f73579r = 6;
                                    if (dsr.n(i282) != coroutine_suspended) {
                                        networkError2 = networkError;
                                        networkError = networkError2;
                                    }
                                }
                                w6Var = new n.C1266n(new IllegalStateException(networkError.toString()));
                                nVarRl = M3.j.rl(M3.n.rl(w6Var, j.w6.J2, j.EnumC0949j.f67611O, null, null, 12, null), vdVar2.f73575n);
                                jVarInvoke = vdVar2.xMQ.invoke();
                                if (jVarInvoke != null && jVarInvoke.Xw()) {
                                    interfaceC2210n = vdVar2.gh;
                                    i282.f73578n = nVarRl;
                                    i282.f73580t = null;
                                    i282.f73579r = 7;
                                    if (interfaceC2210n.n(i282) != coroutine_suspended) {
                                    }
                                }
                                return nVarRl;
                            }
                            if (!(w6Var instanceof n.w6)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            OracleResponse oracleResponse2 = (OracleResponse) ((n.w6) w6Var).n();
                            i282.f73578n = vdVar2;
                            i282.f73580t = booleanRef2;
                            i282.f73579r = 4;
                            if (vdVar2.O(oracleResponse2, i282) != coroutine_suspended) {
                                NuI.Dsr dsr2 = vdVar2.f73576t;
                                i282.f73578n = vdVar2;
                                i282.f73580t = booleanRef2;
                                i282.f73579r = 5;
                            }
                        }
                    }
                    break;
                }
                return coroutine_suspended;
            case 1:
                booleanRef = (Ref.BooleanRef) i282.f73580t;
                vdVar = (vd) i282.f73578n;
                ResultKt.throwOnFailure(obj);
                oracleResponse = (OracleResponse) obj;
                if (oracleResponse == null) {
                }
                return coroutine_suspended;
            case 2:
                booleanRef = (Ref.BooleanRef) i282.f73580t;
                vdVar = (vd) i282.f73578n;
                ResultKt.throwOnFailure(obj);
                booleanRef.element = true;
                Ref.BooleanRef booleanRef42 = booleanRef;
                vd vdVar32 = vdVar;
                qu.I28 i2842 = vdVar32.nr;
                z2 = booleanRef42.element;
                if (!z2) {
                }
                if (z2) {
                }
                i282.f73578n = vdVar32;
                i282.f73580t = booleanRef42;
                i282.f73579r = 3;
                objN = I28.w6.n(i2842, i3, duration, null, i282, 4, null);
                if (objN != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 3:
                booleanRef2 = (Ref.BooleanRef) i282.f73580t;
                vdVar2 = (vd) i282.f73578n;
                ResultKt.throwOnFailure(obj);
                w6Var = (x0X.n) obj;
                if (w6Var instanceof n.C1266n) {
                }
                return coroutine_suspended;
            case 4:
                booleanRef2 = (Ref.BooleanRef) i282.f73580t;
                vdVar2 = (vd) i282.f73578n;
                ResultKt.throwOnFailure(obj);
                NuI.Dsr dsr22 = vdVar2.f73576t;
                i282.f73578n = vdVar2;
                i282.f73580t = booleanRef2;
                i282.f73579r = 5;
                break;
            case 5:
                booleanRef2 = (Ref.BooleanRef) i282.f73580t;
                vdVar2 = (vd) i282.f73578n;
                ResultKt.throwOnFailure(obj);
                w6Var = new n.w6(Unit.INSTANCE);
                if (w6Var instanceof n.C1266n) {
                }
                break;
            case 6:
                networkError2 = (NetworkError) i282.f73580t;
                vdVar2 = (vd) i282.f73578n;
                ResultKt.throwOnFailure(obj);
                networkError = networkError2;
                w6Var = new n.C1266n(new IllegalStateException(networkError.toString()));
                nVarRl = M3.j.rl(M3.n.rl(w6Var, j.w6.J2, j.EnumC0949j.f67611O, null, null, 12, null), vdVar2.f73575n);
                jVarInvoke = vdVar2.xMQ.invoke();
                if (jVarInvoke != null) {
                }
                return nVarRl;
            case 7:
                x0X.n nVar = (x0X.n) i282.f73578n;
                ResultKt.throwOnFailure(obj);
                return nVar;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
