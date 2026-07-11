package K0;

import Ds.j;
import ajd.j;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class I28 implements K0.n {
    private final Function1 J2;
    private final Pr.w6 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function1 f4772O;
    private final JAr.j Uo;
    private boolean gh;
    private final rB.Ml mUb;
    private final Function1 nr;
    private final Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function1 f4773t;
    private final boolean xMQ;

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4775n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f4776t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4776t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return I28.this.nr(this);
        }
    }

    static final class n extends ContinuationImpl {
        boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f4777O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f4778S;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4780n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f4781o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f4782r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f4783t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4781o = obj;
            this.f4778S |= Integer.MIN_VALUE;
            return I28.this.t(this);
        }
    }

    public I28(rB.Ml spiderSense, Wre repository, Function1 tosProvider, Function1 pnProvider, Function1 userInfoProvider, Function1 legalNotificationsProvider, JAr.j legalAcceptanceManager, Pr.w6 trackerRegistry, boolean z2) {
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(tosProvider, "tosProvider");
        Intrinsics.checkNotNullParameter(pnProvider, "pnProvider");
        Intrinsics.checkNotNullParameter(userInfoProvider, "userInfoProvider");
        Intrinsics.checkNotNullParameter(legalNotificationsProvider, "legalNotificationsProvider");
        Intrinsics.checkNotNullParameter(legalAcceptanceManager, "legalAcceptanceManager");
        Intrinsics.checkNotNullParameter(trackerRegistry, "trackerRegistry");
        this.rl = repository;
        this.f4773t = tosProvider;
        this.nr = pnProvider;
        this.f4772O = userInfoProvider;
        this.J2 = legalNotificationsProvider;
        this.Uo = legalAcceptanceManager;
        this.KN = trackerRegistry;
        this.xMQ = z2;
        this.mUb = d3.j.nr(spiderSense, "legal");
    }

    @Override // K0.n
    public boolean J2() {
        return this.xMQ;
    }

    @Override // K0.n
    public Object O(Continuation continuation) {
        return this.f4773t.invoke(continuation);
    }

    @Override // K0.n
    public Pr.w6 Uo() {
        return this.KN;
    }

    @Override // K0.n
    public Object n(Continuation continuation) {
        return this.nr.invoke(continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r6 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // K0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object nr(Continuation continuation) {
        j jVar;
        I28 i28;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objN = jVar.f4776t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            Wre wre = this.rl;
            jVar.f4775n = this;
            jVar.J2 = 1;
            objN = wre.n(jVar);
            if (objN != coroutine_suspended) {
                i28 = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objN);
            return (x0X.n) objN;
        }
        i28 = (I28) jVar.f4775n;
        ResultKt.throwOnFailure(objN);
        x0X.n c1266n = (x0X.n) objN;
        if (c1266n instanceof n.C1266n) {
            c1266n = new n.C1266n(j.w6.f1941n);
        } else if (!(c1266n instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        if (c1266n instanceof n.C1266n) {
            return c1266n;
        }
        if (!(c1266n instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        JAr.j jVar2 = i28.Uo;
        jVar.f4775n = null;
        jVar.J2 = 2;
        objN = jVar2.n(jVar);
    }

    @Override // K0.n
    public Object rl(Continuation continuation) {
        return this.Uo.t(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7 A[PHI: r2 r15
      0x00b7: PHI (r2v5 K0.I28) = (r2v2 K0.I28), (r2v7 K0.I28) binds: [B:27:0x00b3, B:20:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r15v7 java.lang.Object) = (r15v6 java.lang.Object), (r15v1 java.lang.Object) binds: [B:27:0x00b3, B:20:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // K0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(Continuation continuation) {
        n nVar;
        I28 i28;
        Object objViF;
        boolean z2;
        I28 i282;
        boolean zBooleanValue;
        I28 i283;
        boolean z3;
        I28 i284;
        I28 i285;
        JAr.j jVar;
        I28 i286;
        Object objInvoke;
        JAr.j jVar2;
        String str;
        I28 i287;
        x0X.n nVar2;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f4778S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f4778S = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objViF2 = nVar.f4781o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (nVar.f4778S) {
            case 0:
                ResultKt.throwOnFailure(objViF2);
                Wre wre = this.rl;
                nVar.f4780n = this;
                nVar.f4778S = 1;
                if (wre.O(null, nVar) != coroutine_suspended) {
                    i28 = this;
                    TFv.Wre wreT = i28.rl.t();
                    nVar.f4780n = i28;
                    nVar.f4778S = 2;
                    objViF2 = TFv.fuX.ViF(wreT, nVar);
                    if (objViF2 != coroutine_suspended) {
                        boolean zBooleanValue2 = ((Boolean) objViF2).booleanValue();
                        TFv.Wre wreRl = i28.rl.rl();
                        nVar.f4780n = i28;
                        nVar.J2 = zBooleanValue2;
                        nVar.f4778S = 3;
                        objViF = TFv.fuX.ViF(wreRl, nVar);
                        if (objViF != coroutine_suspended) {
                            z2 = zBooleanValue2;
                            objViF2 = objViF;
                            i282 = i28;
                            zBooleanValue = ((Boolean) objViF2).booleanValue();
                            if (zBooleanValue) {
                                Wre wre2 = i282.rl;
                                nVar.f4780n = i282;
                                nVar.J2 = z2;
                                nVar.f4782r = zBooleanValue;
                                nVar.f4778S = 4;
                                if (wre2.nr(false, nVar) != coroutine_suspended) {
                                }
                            }
                            if (!z2) {
                                i283 = i282;
                                if (zBooleanValue) {
                                }
                                return new n.w6(Unit.INSTANCE);
                            }
                            Wre wre3 = i282.rl;
                            nVar.f4780n = i282;
                            nVar.J2 = z2;
                            nVar.f4782r = zBooleanValue;
                            nVar.f4778S = 5;
                            if (wre3.J2(false, nVar) != coroutine_suspended) {
                                z3 = z2;
                                i284 = i282;
                                I28 i288 = i284;
                                z2 = z3;
                                i283 = i288;
                                if (!zBooleanValue || z2) {
                                    return new n.w6(Unit.INSTANCE);
                                }
                                JAr.j jVar3 = i283.Uo;
                                Function1 function1 = i283.f4773t;
                                nVar.f4780n = i283;
                                nVar.f4783t = jVar3;
                                nVar.f4778S = 6;
                                Object objInvoke2 = function1.invoke(nVar);
                                if (objInvoke2 != coroutine_suspended) {
                                    i285 = i283;
                                    jVar = jVar3;
                                    objViF2 = objInvoke2;
                                    i286 = i285;
                                    String strRl = ((Ds.Ml) objViF2).rl();
                                    Function1 function12 = i286.nr;
                                    nVar.f4780n = i286;
                                    nVar.f4783t = jVar;
                                    nVar.f4777O = strRl;
                                    nVar.f4778S = 7;
                                    objInvoke = function12.invoke(nVar);
                                    if (objInvoke != coroutine_suspended) {
                                        jVar2 = jVar;
                                        str = strRl;
                                        objViF2 = objInvoke;
                                        JAr.j jVar4 = jVar2;
                                        String strRl2 = ((Ds.w6) objViF2).rl();
                                        nVar.f4780n = i286;
                                        nVar.f4783t = null;
                                        nVar.f4777O = null;
                                        nVar.f4778S = 8;
                                        objViF2 = jVar4.rl(str, strRl2, nVar);
                                        if (objViF2 != coroutine_suspended) {
                                            i287 = i286;
                                            nVar2 = (x0X.n) objViF2;
                                            if (!(nVar2 instanceof n.C1266n)) {
                                                rB.I28.rl(i287.mUb, CollectionsKt.listOf((Object[]) new String[]{"tosAndPp", MRAIDPresenter.ERROR}), j.EnumC0481j.J2, "Unable to acknowledge privacy notice and to accept terms of service.", null, ((Ds.j) ((n.C1266n) nVar2).n()).n(), 8, null);
                                            } else if (!(nVar2 instanceof n.w6)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            i287.gh = true;
                                            return nVar2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                i28 = (I28) nVar.f4780n;
                ResultKt.throwOnFailure(objViF2);
                TFv.Wre wreT2 = i28.rl.t();
                nVar.f4780n = i28;
                nVar.f4778S = 2;
                objViF2 = TFv.fuX.ViF(wreT2, nVar);
                if (objViF2 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 2:
                i28 = (I28) nVar.f4780n;
                ResultKt.throwOnFailure(objViF2);
                boolean zBooleanValue22 = ((Boolean) objViF2).booleanValue();
                TFv.Wre wreRl2 = i28.rl.rl();
                nVar.f4780n = i28;
                nVar.J2 = zBooleanValue22;
                nVar.f4778S = 3;
                objViF = TFv.fuX.ViF(wreRl2, nVar);
                if (objViF != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 3:
                boolean z4 = nVar.J2;
                I28 i289 = (I28) nVar.f4780n;
                ResultKt.throwOnFailure(objViF2);
                i282 = i289;
                z2 = z4;
                zBooleanValue = ((Boolean) objViF2).booleanValue();
                if (zBooleanValue) {
                }
                if (!z2) {
                }
                break;
            case 4:
                zBooleanValue = nVar.f4782r;
                z2 = nVar.J2;
                i282 = (I28) nVar.f4780n;
                ResultKt.throwOnFailure(objViF2);
                if (!z2) {
                }
                break;
            case 5:
                zBooleanValue = nVar.f4782r;
                z3 = nVar.J2;
                i284 = (I28) nVar.f4780n;
                ResultKt.throwOnFailure(objViF2);
                I28 i2882 = i284;
                z2 = z3;
                i283 = i2882;
                if (zBooleanValue) {
                }
                return new n.w6(Unit.INSTANCE);
            case 6:
                JAr.j jVar5 = (JAr.j) nVar.f4783t;
                I28 i2810 = (I28) nVar.f4780n;
                ResultKt.throwOnFailure(objViF2);
                i285 = i2810;
                jVar = jVar5;
                i286 = i285;
                String strRl3 = ((Ds.Ml) objViF2).rl();
                Function1 function122 = i286.nr;
                nVar.f4780n = i286;
                nVar.f4783t = jVar;
                nVar.f4777O = strRl3;
                nVar.f4778S = 7;
                objInvoke = function122.invoke(nVar);
                if (objInvoke != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 7:
                String str2 = (String) nVar.f4777O;
                JAr.j jVar6 = (JAr.j) nVar.f4783t;
                I28 i2811 = (I28) nVar.f4780n;
                ResultKt.throwOnFailure(objViF2);
                jVar2 = jVar6;
                str = str2;
                i286 = i2811;
                JAr.j jVar42 = jVar2;
                String strRl22 = ((Ds.w6) objViF2).rl();
                nVar.f4780n = i286;
                nVar.f4783t = null;
                nVar.f4777O = null;
                nVar.f4778S = 8;
                objViF2 = jVar42.rl(str, strRl22, nVar);
                if (objViF2 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 8:
                i287 = (I28) nVar.f4780n;
                ResultKt.throwOnFailure(objViF2);
                nVar2 = (x0X.n) objViF2;
                if (!(nVar2 instanceof n.C1266n)) {
                }
                i287.gh = true;
                return nVar2;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
