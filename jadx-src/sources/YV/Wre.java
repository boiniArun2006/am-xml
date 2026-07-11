package YV;

import TFv.SPz;
import TFv.rv6;
import YV.Wre;
import android.content.Context;
import com.bendingspoons.monopoly.contracts.OraclePurchaseVerifier;
import com.bendingspoons.oracle.models.OracleResponse;
import fE.l3D;
import fb.AbstractC2109j;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface Wre extends eO, aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f12124n = j.rl;

    public static final class j extends AbstractC2109j {
        static final /* synthetic */ j rl = new j();

        /* JADX INFO: renamed from: YV.Wre$j$j, reason: collision with other inner class name */
        public static final class C0433j implements TFv.Wre {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.Wre f12125n;

            /* JADX INFO: renamed from: YV.Wre$j$j$j, reason: collision with other inner class name */
            public static final class C0434j implements TFv.CN3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ TFv.CN3 f12126n;

                /* JADX INFO: renamed from: YV.Wre$j$j$j$j, reason: collision with other inner class name */
                public static final class C0435j extends ContinuationImpl {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    /* synthetic */ Object f12128n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    int f12129t;

                    public C0435j(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f12128n = obj;
                        this.f12129t |= Integer.MIN_VALUE;
                        return C0434j.this.rl(null, this);
                    }
                }

                public C0434j(TFv.CN3 cn3) {
                    this.f12126n = cn3;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // TFv.CN3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object rl(Object obj, Continuation continuation) {
                    C0435j c0435j;
                    if (continuation instanceof C0435j) {
                        c0435j = (C0435j) continuation;
                        int i2 = c0435j.f12129t;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0435j.f12129t = i2 - Integer.MIN_VALUE;
                        } else {
                            c0435j = new C0435j(continuation);
                        }
                    }
                    Object obj2 = c0435j.f12128n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i3 = c0435j.f12129t;
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        TFv.CN3 cn3 = this.f12126n;
                        QJ qjRl = l3D.rl((OracleResponse) obj);
                        c0435j.f12129t = 1;
                        if (cn3.rl(qjRl, c0435j) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public C0433j(TFv.Wre wre) {
                this.f12125n = wre;
            }

            @Override // TFv.Wre
            public Object n(TFv.CN3 cn3, Continuation continuation) {
                Object objN = this.f12125n.n(new C0434j(cn3), continuation);
                return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
            }
        }

        public static final class n implements TFv.Wre {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.Wre f12130n;

            /* JADX INFO: renamed from: YV.Wre$j$n$j, reason: collision with other inner class name */
            public static final class C0436j implements TFv.CN3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ TFv.CN3 f12131n;

                /* JADX INFO: renamed from: YV.Wre$j$n$j$j, reason: collision with other inner class name */
                public static final class C0437j extends ContinuationImpl {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    /* synthetic */ Object f12133n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    int f12134t;

                    public C0437j(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f12133n = obj;
                        this.f12134t |= Integer.MIN_VALUE;
                        return C0436j.this.rl(null, this);
                    }
                }

                public C0436j(TFv.CN3 cn3) {
                    this.f12131n = cn3;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // TFv.CN3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object rl(Object obj, Continuation continuation) {
                    C0437j c0437j;
                    if (continuation instanceof C0437j) {
                        c0437j = (C0437j) continuation;
                        int i2 = c0437j.f12134t;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0437j.f12134t = i2 - Integer.MIN_VALUE;
                        } else {
                            c0437j = new C0437j(continuation);
                        }
                    }
                    Object obj2 = c0437j.f12133n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i3 = c0437j.f12134t;
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        TFv.CN3 cn3 = this.f12131n;
                        YV.n nVarN = l3D.n((OracleResponse) obj);
                        c0437j.f12134t = 1;
                        if (cn3.rl(nVarN, c0437j) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public n(TFv.Wre wre) {
                this.f12130n = wre;
            }

            @Override // TFv.Wre
            public Object n(TFv.CN3 cn3, Continuation continuation) {
                Object objN = this.f12130n.n(new C0436j(cn3), continuation);
                return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Wre O(cKn.Wre wre, Context context, n nVar, TFv.Wre wre2, TFv.Wre wre3, gHt.j jVar, CZF.I28 i28, Function2 function2, Function4 function4, rB.Ml ml, bH.CN3 cn3) {
            fE.aC aCVar = new fE.aC(context, wre2, wre3, jVar, wre.n(), i28, function2, function4, new fE.I28(context), sJa.w6.rl, fE.z.f66847t.n(context), ml, nVar.t(), nVar.rl(), nVar.n());
            if (cn3 != null) {
                d3z.I28.n(cn3, context, aCVar);
            }
            return aCVar;
        }

        public final Wre nr(Context context, qu.I28 oracleResponseStore, qu.Dsr oracleService, cKn.Wre theirs, CZF.I28 i28, Function2 trackEvent, Function4 trackPurchaseIdentifiers, bH.CN3 cn3, rB.Ml spiderSense, n config) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(oracleResponseStore, "oracleResponseStore");
            Intrinsics.checkNotNullParameter(oracleService, "oracleService");
            Intrinsics.checkNotNullParameter(theirs, "theirs");
            Intrinsics.checkNotNullParameter(trackEvent, "trackEvent");
            Intrinsics.checkNotNullParameter(trackPurchaseIdentifiers, "trackPurchaseIdentifiers");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(config, "config");
            return t(context, new C0433j(qu.Wre.t(oracleResponseStore)), new n(qu.Wre.t(oracleResponseStore)), new OraclePurchaseVerifier(oracleService), theirs, i28, trackEvent, trackPurchaseIdentifiers, cn3, spiderSense, config);
        }

        public final Wre t(final Context context, final TFv.Wre userInfoFlow, final TFv.Wre availableProductsFlow, final gHt.j verifyPurchases, final cKn.Wre theirs, final CZF.I28 i28, final Function2 trackEvent, final Function4 trackPurchaseIdentifiers, final bH.CN3 cn3, final rB.Ml spiderSense, final n config) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(userInfoFlow, "userInfoFlow");
            Intrinsics.checkNotNullParameter(availableProductsFlow, "availableProductsFlow");
            Intrinsics.checkNotNullParameter(verifyPurchases, "verifyPurchases");
            Intrinsics.checkNotNullParameter(theirs, "theirs");
            Intrinsics.checkNotNullParameter(trackEvent, "trackEvent");
            Intrinsics.checkNotNullParameter(trackPurchaseIdentifiers, "trackPurchaseIdentifiers");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(config, "config");
            return (Wre) n(new Function0() { // from class: YV.I28
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Wre.j.O(theirs, context, config, userInfoFlow, availableProductsFlow, verifyPurchases, i28, trackEvent, trackPurchaseIdentifiers, spiderSense, cn3);
                }
            });
        }

        private j() {
        }
    }

    public interface n {

        public static final class j {
            public static boolean n(n nVar) {
                return true;
            }
        }

        boolean n();

        Function1 rl();

        Function1 t();
    }

    public static final class w6 {
        public static /* synthetic */ Object n(Wre wre, boolean z2, boolean z3, boolean z4, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getActivePurchases");
            }
            if ((i2 & 2) != 0) {
                z3 = false;
            }
            if ((i2 & 4) != 0) {
                z4 = false;
            }
            return wre.nr(z2, z3, z4, continuation);
        }

        public static /* synthetic */ Object rl(Wre wre, boolean z2, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: restorePurchases");
            }
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            return wre.mUb(z2, continuation);
        }
    }

    TFv.Wre KN();

    void ck(Boolean bool);

    Object mUb(boolean z2, Continuation continuation);

    SPz n();

    Object nr(boolean z2, boolean z3, boolean z4, Continuation continuation);

    Object t(Continuation continuation);

    rv6 ty();
}
