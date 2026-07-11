package fE;

import GJW.vd;
import android.util.Log;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.bendingspoons.monopoly.contracts.j;
import fE.Pl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class qz {
    private final vd J2;
    private final Function4 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final rB.Ml f66815O;
    private final jXF.j Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final gHt.j f66816n;
    private final eO nr;
    private final TFv.Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final fE.w6 f66817t;
    private final Function1 xMQ;
    public static final j mUb = new j(null);
    public static final int gh = 8;

    static final class CN3 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ List f66818O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66819n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CN3(List list, Continuation continuation) {
            super(2, continuation);
            this.f66818O = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return qz.this.new CN3(this.f66818O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return n(((Number) obj).intValue(), (Continuation) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66819n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            gHt.j jVar = qz.this.f66816n;
            List list = this.f66818O;
            this.f66819n = 1;
            Object objN = jVar.n(list, this);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objN;
        }

        public final Object n(int i2, Continuation continuation) {
            return ((CN3) create(Integer.valueOf(i2), continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class I28 extends SuspendLambda implements Function2 {
        final /* synthetic */ YV.o J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f66821O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66822n;

        static final class j extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ YV.o f66824O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f66825n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ qz f66826t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(qz qzVar, YV.o oVar, Continuation continuation) {
                super(1, continuation);
                this.f66826t = qzVar;
                this.f66824O = oVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new j(this.f66826t, this.f66824O, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f66825n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                fE.w6 w6Var = this.f66826t.f66817t;
                String strJ2 = this.f66824O.J2();
                this.f66825n = 1;
                Object objMUb = w6Var.mUb(strJ2, this);
                if (objMUb == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objMUb;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((j) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(String str, YV.o oVar, Continuation continuation) {
            super(2, continuation);
            this.f66821O = str;
            this.J2 = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return qz.this.new I28(this.f66821O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66822n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                rB.Ml ml = qz.this.f66815O;
                YV.Ml ml2 = YV.Ml.f12114n;
                String str = this.f66821O;
                if (str == null) {
                    str = "";
                }
                ajd.j jVarN = ml2.n(str);
                j jVar = new j(qz.this, this.J2, null);
                this.f66822n = 1;
                if (my.Ml.t(ml, jVarN, jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class Ml extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f66827O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f66828Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66829n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f66831r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f66832t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66831r = obj;
            this.f66828Z |= Integer.MIN_VALUE;
            return qz.this.xMQ(null, this);
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {
        final /* synthetic */ YV.o J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f66833O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66834n;

        static final class j extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ YV.o f66836O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f66837n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ qz f66838t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(qz qzVar, YV.o oVar, Continuation continuation) {
                super(1, continuation);
                this.f66838t = qzVar;
                this.f66836O = oVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new j(this.f66838t, this.f66836O, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f66837n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                fE.w6 w6Var = this.f66838t.f66817t;
                String strJ2 = this.f66836O.J2();
                this.f66837n = 1;
                Object objN = w6Var.n(strJ2, this);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objN;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((j) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(String str, YV.o oVar, Continuation continuation) {
            super(2, continuation);
            this.f66833O = str;
            this.J2 = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return qz.this.new Wre(this.f66833O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66834n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                rB.Ml ml = qz.this.f66815O;
                ajd.j jVarO = YV.Ml.f12114n.O(this.f66833O);
                j jVar = new j(qz.this, this.J2, null);
                this.f66834n = 1;
                if (my.Ml.t(ml, jVarO, jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
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

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f66839O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66840n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f66841r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f66842t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66839O = obj;
            this.f66841r |= Integer.MIN_VALUE;
            return qz.this.J2(null, this);
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ YV.o f66843O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66844n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(YV.o oVar, Continuation continuation) {
            super(2, continuation);
            this.f66843O = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return qz.this.new w6(this.f66843O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66844n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                fE.w6 w6Var = qz.this.f66817t;
                String strJ2 = this.f66843O.J2();
                this.f66844n = 1;
                obj = w6Var.n(strJ2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            qz qzVar = qz.this;
            YV.o oVar = this.f66843O;
            boolean z2 = nVar instanceof n.C1266n;
            String str = "";
            if (!z2) {
                if (nVar instanceof n.w6) {
                    YV.Ml ml = YV.Ml.f12114n;
                    String strT = oVar.t();
                    if (strT == null) {
                        strT = "";
                    }
                    qzVar.Uo(ml.KN(strT));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            qz qzVar2 = qz.this;
            YV.o oVar2 = this.f66843O;
            if (z2) {
                fE.j jVar = (fE.j) ((n.C1266n) nVar).n();
                YV.Ml ml2 = YV.Ml.f12114n;
                String strT2 = oVar2.t();
                if (strT2 != null) {
                    str = strT2;
                }
                qzVar2.Uo(ml2.J2(str, jVar));
            } else if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    public qz(gHt.j purchaseVerifier, TFv.Wre availableProductsFlow, fE.w6 billingClientWrapper, eO repository, rB.Ml spiderSense, vd scope, jXF.j jVar, Function4 trackPurchaseIdentifiers, Function1 shouldTrackPurchaseIdentifiers) {
        Intrinsics.checkNotNullParameter(purchaseVerifier, "purchaseVerifier");
        Intrinsics.checkNotNullParameter(availableProductsFlow, "availableProductsFlow");
        Intrinsics.checkNotNullParameter(billingClientWrapper, "billingClientWrapper");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(trackPurchaseIdentifiers, "trackPurchaseIdentifiers");
        Intrinsics.checkNotNullParameter(shouldTrackPurchaseIdentifiers, "shouldTrackPurchaseIdentifiers");
        this.f66816n = purchaseVerifier;
        this.rl = availableProductsFlow;
        this.f66817t = billingClientWrapper;
        this.nr = repository;
        this.f66815O = spiderSense;
        this.J2 = scope;
        this.Uo = jVar;
        this.KN = trackPurchaseIdentifiers;
        this.xMQ = shouldTrackPurchaseIdentifiers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean KN(int i2, com.bendingspoons.monopoly.contracts.j result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return !(result instanceof j.C0725j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Uo(ajd.j jVar) {
        this.f66815O.t(jVar);
    }

    public static /* synthetic */ Object mUb(qz qzVar, YV.o oVar, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            oVar = null;
        }
        return qzVar.xMQ(oVar, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J2(YV.o oVar, Continuation continuation) {
        n nVar;
        YV.o oVar2;
        qz qzVar;
        qz qzVar2;
        qz qzVar3;
        Object objXMQ;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f66841r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f66841r = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objViF = nVar.f66839O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f66841r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objViF);
            if (!this.f66817t.isConnected()) {
                eO eOVar = this.nr;
                nVar.f66840n = this;
                nVar.f66841r = 1;
                if (eOVar.O(nVar) != coroutine_suspended) {
                    qzVar2 = this;
                    qzVar2.Uo(YV.Ml.f12114n.Uo());
                    return new n.C1266n(YV.CN3.f12097t.rl());
                }
            } else {
                if (oVar.nr() == YV.qz.f12153t) {
                    return new n.w6(new Pl.j(oVar.J2()));
                }
                if (oVar.nr() == YV.qz.J2) {
                    Uo(YV.Ml.f12114n.qie());
                    return new n.C1266n(YV.CN3.f12097t.Uo());
                }
                TFv.Wre wre = this.rl;
                nVar.f66840n = this;
                oVar2 = oVar;
                nVar.f66842t = oVar2;
                nVar.f66841r = 2;
                objViF = TFv.fuX.ViF(wre, nVar);
                if (objViF != coroutine_suspended) {
                    qzVar = this;
                    if (!CollectionsKt.contains(((YV.n) objViF).nr().keySet(), oVar2.t())) {
                        GJW.C.nr(qzVar.J2, null, null, qzVar.new w6(oVar2, null), 3, null);
                    }
                    Function1 function1 = qzVar.xMQ;
                    nVar.f66840n = qzVar;
                    nVar.f66842t = oVar2;
                    nVar.f66841r = 3;
                    objViF = function1.invoke(nVar);
                    if (objViF != coroutine_suspended) {
                    }
                }
            }
        } else {
            if (i3 == 1) {
                qzVar2 = (qz) nVar.f66840n;
                ResultKt.throwOnFailure(objViF);
                qzVar2.Uo(YV.Ml.f12114n.Uo());
                return new n.C1266n(YV.CN3.f12097t.rl());
            }
            if (i3 == 2) {
                oVar2 = (YV.o) nVar.f66842t;
                qzVar = (qz) nVar.f66840n;
                ResultKt.throwOnFailure(objViF);
                if (!CollectionsKt.contains(((YV.n) objViF).nr().keySet(), oVar2.t()) && !oVar2.Uo()) {
                    GJW.C.nr(qzVar.J2, null, null, qzVar.new w6(oVar2, null), 3, null);
                }
                Function1 function12 = qzVar.xMQ;
                nVar.f66840n = qzVar;
                nVar.f66842t = oVar2;
                nVar.f66841r = 3;
                objViF = function12.invoke(nVar);
                if (objViF != coroutine_suspended) {
                    qzVar3 = qzVar;
                    if (((Boolean) objViF).booleanValue()) {
                    }
                    nVar.f66840n = null;
                    nVar.f66842t = null;
                    nVar.f66841r = 4;
                    objXMQ = qzVar3.xMQ(oVar2, nVar);
                    if (objXMQ == coroutine_suspended) {
                    }
                }
            } else {
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objViF);
                    return objViF;
                }
                oVar2 = (YV.o) nVar.f66842t;
                qzVar3 = (qz) nVar.f66840n;
                ResultKt.throwOnFailure(objViF);
                if (((Boolean) objViF).booleanValue()) {
                    Function4 function4 = qzVar3.KN;
                    String strT = oVar2.t();
                    if (strT == null) {
                        strT = "";
                    }
                    function4.invoke(strT, oVar2.J2(), Boxing.boxLong(oVar2.O()), new pq.Ml());
                }
                nVar.f66840n = null;
                nVar.f66842t = null;
                nVar.f66841r = 4;
                objXMQ = qzVar3.xMQ(oVar2, nVar);
                if (objXMQ == coroutine_suspended) {
                    return objXMQ;
                }
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x026a, code lost:
    
        if (r1.n(r14) == r3) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x029f, code lost:
    
        if (r1.O(r14) == r3) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0246  */
    /* JADX WARN: Type inference failed for: r2v22, types: [YV.Ml] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v5, types: [YV.Ml] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object xMQ(YV.o oVar, Continuation continuation) {
        Ml ml;
        qz qzVar;
        List list;
        Continuation continuation2;
        YV.o oVar2;
        List list2;
        qz qzVar2;
        String strT;
        com.bendingspoons.monopoly.contracts.j jVar;
        com.bendingspoons.monopoly.contracts.j jVar2;
        com.bendingspoons.monopoly.contracts.j jVar3;
        String str;
        ?? J2;
        Set setKeySet;
        jXF.j jVar4;
        YV.o oVar3 = oVar;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f66828Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f66828Z = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Ml ml2 = ml;
        Object objN = ml2.f66831r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (ml2.f66828Z) {
            case 0:
                ResultKt.throwOnFailure(objN);
                if (!this.f66817t.isConnected() && oVar3 != null) {
                    Uo(YV.Ml.f12114n.S());
                    return new n.C1266n(YV.CN3.f12097t.rl());
                }
                fE.w6 w6Var = this.f66817t;
                ml2.f66829n = this;
                ml2.f66832t = oVar3;
                ml2.f66828Z = 1;
                objN = fE.Wre.n(w6Var, ml2);
                if (objN != coroutine_suspended) {
                    qzVar = this;
                    list = (List) x0X.w6.nr((x0X.n) objN);
                    if (list == null) {
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(fuX.J2((PurchaseHistoryRecord) it.next()));
                        }
                        List arrayList2 = CollectionsKt.toMutableList((Collection) arrayList);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        if (oVar3 != null) {
                            if (arrayList2.isEmpty()) {
                                Log.e("Monopoly", "Missing last purchase from purchase history. Adding it.");
                                YV.Ml ml3 = YV.Ml.f12114n;
                                strT = oVar3.t();
                                if (strT == null) {
                                    strT = "";
                                }
                                qzVar.Uo(ml3.aYN(strT));
                                arrayList2.add(oVar3);
                            } else {
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    if (Intrinsics.areEqual(((YV.o) it2.next()).J2(), oVar3.J2())) {
                                    }
                                }
                                Log.e("Monopoly", "Missing last purchase from purchase history. Adding it.");
                                YV.Ml ml32 = YV.Ml.f12114n;
                                strT = oVar3.t();
                                if (strT == null) {
                                }
                                qzVar.Uo(ml32.aYN(strT));
                                arrayList2.add(oVar3);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            qzVar.Uo(YV.Ml.f12114n.Z());
                            return new n.C1266n(YV.CN3.f12097t.t());
                        }
                        CN3 cn3 = qzVar.new CN3(arrayList2, null);
                        Function2 function2 = new Function2() { // from class: fE.o
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return Boolean.valueOf(qz.KN(((Integer) obj).intValue(), (com.bendingspoons.monopoly.contracts.j) obj2));
                            }
                        };
                        ml2.f66829n = qzVar;
                        ml2.f66832t = oVar3;
                        ml2.f66827O = arrayList2;
                        ml2.f66828Z = 2;
                        qz qzVar3 = qzVar;
                        continuation2 = null;
                        Object objT = q3M.Ml.t(3, 500L, 0L, 0.0d, cn3, function2, null, ml2, 76, null);
                        if (objT != coroutine_suspended) {
                            oVar2 = oVar3;
                            list2 = arrayList2;
                            objN = objT;
                            qzVar2 = qzVar3;
                            jVar = (com.bendingspoons.monopoly.contracts.j) objN;
                            if (!(jVar instanceof j.w6)) {
                                eO eOVar = qzVar2.nr;
                                ml2.f66829n = qzVar2;
                                ml2.f66832t = oVar2;
                                ml2.f66827O = jVar;
                                ml2.f66828Z = 3;
                                if (eOVar.J2(ml2) != coroutine_suspended) {
                                    jVar2 = jVar;
                                    if (oVar2 != null) {
                                        String strT2 = oVar2.t();
                                        TFv.Wre wre = qzVar2.rl;
                                        ml2.f66829n = qzVar2;
                                        ml2.f66832t = oVar2;
                                        ml2.f66827O = jVar2;
                                        ml2.J2 = strT2;
                                        ml2.f66828Z = 4;
                                        Object objViF = TFv.fuX.ViF(wre, ml2);
                                        if (objViF != coroutine_suspended) {
                                            jVar3 = jVar2;
                                            str = strT2;
                                            objN = objViF;
                                            YV.n nVar = (YV.n) objN;
                                            setKeySet = nVar.nr().keySet();
                                            Set setKeySet2 = nVar.O().keySet();
                                            if (CollectionsKt.contains(setKeySet, str)) {
                                                GJW.C.nr(qzVar2.J2, null, null, qzVar2.new I28(str, oVar2, continuation2), 3, null);
                                            }
                                            if (str != null && setKeySet2.contains(str) && !oVar2.Uo()) {
                                                GJW.C.nr(qzVar2.J2, null, null, qzVar2.new Wre(str, oVar2, continuation2), 3, null);
                                            }
                                            qzVar2.Uo(YV.Ml.f12114n.ViF(oVar2.t()));
                                            if (CollectionsKt.contains(((j.w6) jVar3).n().t(), str) && (jVar4 = qzVar2.Uo) != null) {
                                                jVar4.trackEvent("subscription_started");
                                            }
                                        }
                                    }
                                }
                            } else if (jVar instanceof j.n) {
                                qzVar2.Uo(YV.Ml.f12114n.WPU(list2, oVar2 != null ? oVar2.t() : continuation2));
                                eO eOVar2 = qzVar2.nr;
                                ml2.f66829n = continuation2;
                                ml2.f66832t = continuation2;
                                ml2.f66827O = continuation2;
                                ml2.f66828Z = 5;
                            } else {
                                if (!(jVar instanceof j.C0725j)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                qzVar2.Uo(YV.Ml.f12114n.XQ((j.C0725j) jVar, list2, oVar2 != null ? oVar2.t() : continuation2));
                                eO eOVar3 = qzVar2.nr;
                                ml2.f66829n = continuation2;
                                ml2.f66832t = continuation2;
                                ml2.f66827O = continuation2;
                                ml2.f66828Z = 6;
                            }
                        }
                        break;
                    }
                    J2 = oVar2 == null ? oVar2.J2() : continuation2;
                    if (J2 == 0) {
                        J2 = "";
                    }
                    return new n.w6(new Pl.n(J2));
                }
                return coroutine_suspended;
            case 1:
                oVar3 = (YV.o) ml2.f66832t;
                qzVar = (qz) ml2.f66829n;
                ResultKt.throwOnFailure(objN);
                list = (List) x0X.w6.nr((x0X.n) objN);
                if (list == null) {
                }
                if (oVar2 == null) {
                }
                if (J2 == 0) {
                }
                return new n.w6(new Pl.n(J2));
            case 2:
                list2 = (List) ml2.f66827O;
                oVar2 = (YV.o) ml2.f66832t;
                qzVar2 = (qz) ml2.f66829n;
                ResultKt.throwOnFailure(objN);
                continuation2 = null;
                jVar = (com.bendingspoons.monopoly.contracts.j) objN;
                if (!(jVar instanceof j.w6)) {
                }
                return coroutine_suspended;
            case 3:
                jVar2 = (com.bendingspoons.monopoly.contracts.j) ml2.f66827O;
                oVar2 = (YV.o) ml2.f66832t;
                qzVar2 = (qz) ml2.f66829n;
                ResultKt.throwOnFailure(objN);
                continuation2 = null;
                if (oVar2 != null) {
                }
                if (oVar2 == null) {
                }
                if (J2 == 0) {
                }
                return new n.w6(new Pl.n(J2));
            case 4:
                str = (String) ml2.J2;
                jVar3 = (com.bendingspoons.monopoly.contracts.j) ml2.f66827O;
                oVar2 = (YV.o) ml2.f66832t;
                qzVar2 = (qz) ml2.f66829n;
                ResultKt.throwOnFailure(objN);
                continuation2 = null;
                YV.n nVar2 = (YV.n) objN;
                setKeySet = nVar2.nr().keySet();
                Set setKeySet22 = nVar2.O().keySet();
                if (CollectionsKt.contains(setKeySet, str)) {
                }
                if (str != null) {
                    GJW.C.nr(qzVar2.J2, null, null, qzVar2.new Wre(str, oVar2, continuation2), 3, null);
                }
                qzVar2.Uo(YV.Ml.f12114n.ViF(oVar2.t()));
                if (CollectionsKt.contains(((j.w6) jVar3).n().t(), str)) {
                    jVar4.trackEvent("subscription_started");
                }
                if (oVar2 == null) {
                }
                if (J2 == 0) {
                }
                return new n.w6(new Pl.n(J2));
            case 5:
                ResultKt.throwOnFailure(objN);
                return new n.C1266n(YV.CN3.f12097t.KN());
            case 6:
                ResultKt.throwOnFailure(objN);
                return new n.C1266n(YV.CN3.f12097t.KN());
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
