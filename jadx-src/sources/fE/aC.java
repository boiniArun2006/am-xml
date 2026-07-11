package fE;

import GJW.Lu;
import GJW.vd;
import OS.InterfaceC1422c;
import TFv.rv6;
import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.bendingspoons.monopoly.contracts.j;
import com.bendingspoons.monopoly.product.BasePlan;
import com.bendingspoons.monopoly.product.SubscriptionProduct;
import fE.Pl;
import fE.w6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class aC implements YV.Wre, InterfaceC1422c {
    private final vd HI;
    private final TFv.r Ik;
    private final jXF.j J2;
    private Function4 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final gHt.j f66650O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final TFv.SPz f66651S;
    private Function2 Uo;
    private final TFv.Wre ViF;
    private final Lazy WPU;
    private final TFv.Wre XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final TFv.Wre f66652Z;
    private final TFv.r aYN;
    private final Function1 az;
    private final TFv.SPz ck;
    private final fE.qz fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TFv.Wre f66653g;
    private final fE.eO gh;
    private final ON.j iF;
    private final sJa.Ml mUb;
    private final TFv.Wre nY;
    private final TFv.Wre nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final TFv.r f66654o;
    private final Function1 qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List f66655r;
    private final Context rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TFv.Wre f66656t;
    private GJW.r te;
    private final rB.Ml ty;
    private final fE.w6 xMQ;

    static final class C extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f66657O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f66658n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f66659r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f66660t;

        C(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66657O = obj;
            this.f66659r |= Integer.MIN_VALUE;
            return aC.this.nr(false, false, false, this);
        }
    }

    static final class CN3 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66662n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f66663t;

        CN3(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66663t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return aC.this.fD(this);
        }
    }

    static final class DAz extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66664n;

        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ aC f66666O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f66667n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f66668t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(aC aCVar, Continuation continuation) {
                super(2, continuation);
                this.f66666O = aCVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f66666O, continuation);
                jVar.f66668t = obj;
                return jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f66667n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    YV.QJ qj = (YV.QJ) this.f66668t;
                    TFv.r rVar = this.f66666O.aYN;
                    List listT = qj.t();
                    this.f66667n = 1;
                    if (rVar.rl(listT, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(YV.QJ qj, Continuation continuation) {
                return ((j) create(qj, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((DAz) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        DAz(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return aC.this.new DAz(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66664n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wre = aC.this.f66656t;
                j jVar = new j(aC.this, null);
                this.f66664n = 1;
                if (TFv.fuX.gh(wre, jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class Dsr extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f66669O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66670n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Dsr(String str, Continuation continuation) {
            super(1, continuation);
            this.f66669O = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return aC.this.new Dsr(this.f66669O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66670n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            fE.eO eOVarNHg = aC.this.nHg();
            String str = this.f66669O;
            this.f66670n = 1;
            Object objRl = eOVarNHg.rl(str, this);
            if (objRl == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objRl;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Dsr) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class Ew implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f66672n;

        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f66673n;

            /* JADX INFO: renamed from: fE.aC$Ew$j$j, reason: collision with other inner class name */
            public static final class C0920j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f66675n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f66676t;

                public C0920j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f66675n = obj;
                    this.f66676t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3) {
                this.f66673n = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0920j c0920j;
                if (continuation instanceof C0920j) {
                    c0920j = (C0920j) continuation;
                    int i2 = c0920j.f66676t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0920j.f66676t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0920j = new C0920j(continuation);
                    }
                }
                Object obj2 = c0920j.f66675n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0920j.f66676t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f66673n;
                    List listNr = ((YV.QJ) obj).nr();
                    c0920j.f66676t = 1;
                    if (cn3.rl(listNr, c0920j) == coroutine_suspended) {
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

        public Ew(TFv.Wre wre) {
            this.f66672n = wre;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f66672n.n(new j(cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    static final class I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66677n;

        I28(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return aC.this.new I28(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66677n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                aC aCVar = aC.this;
                this.f66677n = 1;
                if (aCVar.jB(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
            return ((I28) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Pl extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66680n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f66681t;

        Pl(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66681t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return aC.this.gh(null, this);
        }
    }

    static final class Q extends ContinuationImpl {
        int E2;
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f66682O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        /* synthetic */ Object f66683S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        Object f66684Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66686n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f66687o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f66688r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f66689t;

        Q(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66683S = obj;
            this.E2 |= Integer.MIN_VALUE;
            return aC.this.J2(null, null, null, null, null, null, this);
        }
    }

    static final class QJ extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f66690O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f66691n;

        QJ(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66691n = obj;
            this.f66690O |= Integer.MIN_VALUE;
            return aC.this.az(this);
        }
    }

    static final class SPz extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f66693O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66694n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f66695r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f66696t;

        SPz(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66693O = obj;
            this.f66695r |= Integer.MIN_VALUE;
            return aC.this.Xw(null, this);
        }
    }

    static final class UGc extends SuspendLambda implements Function1 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Activity f66697O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66698n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ GJW.r f66699r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        UGc(Activity activity, String str, GJW.r rVar, Continuation continuation) {
            super(1, continuation);
            this.f66697O = activity;
            this.J2 = str;
            this.f66699r = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return aC.this.new UGc(this.f66697O, this.J2, this.f66699r, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66698n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                fE.w6 w6VarX = aC.this.X();
                Activity activity = this.f66697O;
                String str = this.J2;
                this.f66698n = 1;
                obj = w6VarX.xMQ(activity, str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            GJW.r rVar = this.f66699r;
            if (nVar instanceof n.C1266n) {
                my.j.n(rVar, fE.n.n((fE.j) ((n.C1266n) nVar).n()));
                return nVar;
            }
            if (nVar instanceof n.w6) {
                return nVar;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((UGc) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66701n;

        Wre(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return aC.this.new Wre(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66701n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                aC aCVar = aC.this;
                this.f66701n = 1;
                if (aCVar.U(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
            return ((Wre) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Xo extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f66703O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66704n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f66705o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f66707t;

        Xo(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f66705o |= Integer.MIN_VALUE;
            return aC.this.qie(null, this);
        }
    }

    public static final class Z implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f66708n;

        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f66709n;

            /* JADX INFO: renamed from: fE.aC$Z$j$j, reason: collision with other inner class name */
            public static final class C0921j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f66711n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f66712t;

                public C0921j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f66711n = obj;
                    this.f66712t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3) {
                this.f66709n = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0921j c0921j;
                if (continuation instanceof C0921j) {
                    c0921j = (C0921j) continuation;
                    int i2 = c0921j.f66712t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0921j.f66712t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0921j = new C0921j(continuation);
                    }
                }
                Object obj2 = c0921j.f66711n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0921j.f66712t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f66709n;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        String strT = ((YV.o) it.next()).t();
                        if (strT != null) {
                            arrayList.add(strT);
                        }
                    }
                    c0921j.f66712t = 1;
                    if (cn3.rl(arrayList, c0921j) == coroutine_suspended) {
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

        public Z(TFv.Wre wre) {
            this.f66708n = wre;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f66708n.n(new j(cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: fE.aC$aC, reason: collision with other inner class name */
    static final class C0922aC extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f66713O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66714n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f66715o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f66717t;

        C0922aC(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f66715o |= Integer.MIN_VALUE;
            return aC.this.e(null, this);
        }
    }

    static final class afx extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        boolean f66718O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66719n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f66720o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f66722t;

        afx(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f66720o |= Integer.MIN_VALUE;
            return aC.this.mUb(false, this);
        }
    }

    /* JADX INFO: renamed from: fE.aC$c, reason: case insensitive filesystem */
    static final class C2102c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ aC f66723O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66724n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Purchase f66725t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C2102c) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2102c(Purchase purchase, aC aCVar, Continuation continuation) {
            super(2, continuation);
            this.f66725t = purchase;
            this.f66723O = aCVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C2102c(this.f66725t, this.f66723O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66724n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                if (this.f66725t.nr().size() != 1) {
                    aC aCVar = this.f66723O;
                    YV.Ml ml = YV.Ml.f12114n;
                    List listNr = this.f66725t.nr();
                    Intrinsics.checkNotNullExpressionValue(listNr, "getProducts(...)");
                    aCVar.M7(ml.mUb(listNr));
                }
                aC aCVar2 = this.f66723O;
                YV.o oVarO = fE.fuX.O(this.f66725t);
                this.f66724n = 1;
                if (aCVar2.s7N(oVarO, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class ci extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f66726O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66727n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f66728o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f66730t;

        ci(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f66728o |= Integer.MIN_VALUE;
            return aC.this.jB(this);
        }
    }

    static final class eO extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66732n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f66733t;

        eO(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66733t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return aC.this.s7N(null, this);
        }
    }

    static final class fuX extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f66734O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f66735S;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66737n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f66738o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f66739r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f66740t;

        fuX(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66738o = obj;
            this.f66735S |= Integer.MIN_VALUE;
            return aC.this.E2(null, this);
        }
    }

    static final class g9s extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f66741O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66742n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f66743o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f66745t;

        g9s(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f66743o |= Integer.MIN_VALUE;
            return aC.this.U(this);
        }
    }

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66746n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return aC.this.new j(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
        
            if (r7.jB(r6) != r0) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            aC aCVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66746n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        aC.this.P5();
                        aC aCVar2 = aC.this;
                        this.f66746n = 4;
                    } else {
                        ResultKt.throwOnFailure(obj);
                        aCVar = aC.this;
                        this.f66746n = 3;
                        if (aCVar.wTp(this) != coroutine_suspended) {
                            aC.this.P5();
                            aC aCVar22 = aC.this;
                            this.f66746n = 4;
                        }
                        return coroutine_suspended;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                fE.w6 w6VarX = aC.this.X();
                this.f66746n = 1;
                if (w6VarX.t(this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            aC aCVar3 = aC.this;
            this.f66746n = 2;
            if (aCVar3.fD(this) != coroutine_suspended) {
                aCVar = aC.this;
                this.f66746n = 3;
                if (aCVar.wTp(this) != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    static final class l3D extends SuspendLambda implements Function3 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f66748O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66749n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f66750t;

        l3D(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(YV.QJ qj, Boolean bool, Continuation continuation) {
            l3D l3d = new l3D(continuation);
            l3d.f66750t = qj;
            l3d.f66748O = bool;
            return l3d.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean zBooleanValue;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f66749n == 0) {
                ResultKt.throwOnFailure(obj);
                YV.QJ qj = (YV.QJ) this.f66750t;
                Boolean bool = (Boolean) this.f66748O;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else if (qj.t().isEmpty() && !qj.O()) {
                    zBooleanValue = false;
                } else {
                    zBooleanValue = true;
                }
                return Boxing.boxBoolean(zBooleanValue);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class n implements AR.w6 {

        static final class j extends ContinuationImpl {
            /* synthetic */ Object J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            Object f66752O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f66753n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            int f66754o;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f66756t;

            j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.J2 = obj;
                this.f66754o |= Integer.MIN_VALUE;
                return n.this.n(this);
            }
        }

        n() {
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // AR.w6
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object n(Continuation continuation) {
            j jVar;
            pq.Ml ml;
            String str;
            pq.Ml ml2;
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i2 = jVar.f66754o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.f66754o = i2 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(continuation);
                }
            }
            Object obj = jVar.J2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = jVar.f66754o;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                pq.Ml ml3 = new pq.Ml();
                TFv.Wre wreKN = aC.this.KN();
                jVar.f66753n = ml3;
                jVar.f66756t = "is_premium_user";
                jVar.f66752O = ml3;
                jVar.f66754o = 1;
                Object objViF = TFv.fuX.ViF(wreKN, jVar);
                if (objViF == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ml = ml3;
                str = "is_premium_user";
                obj = objViF;
                ml2 = ml;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ml = (pq.Ml) jVar.f66752O;
                str = (String) jVar.f66756t;
                ml2 = (pq.Ml) jVar.f66753n;
                ResultKt.throwOnFailure(obj);
            }
            ml.KN(str, ((Boolean) obj).booleanValue());
            return ml2;
        }
    }

    public static final class nKK implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f66757n;

        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f66758n;

            /* JADX INFO: renamed from: fE.aC$nKK$j$j, reason: collision with other inner class name */
            public static final class C0923j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f66760n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f66761t;

                public C0923j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f66760n = obj;
                    this.f66761t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3) {
                this.f66758n = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0923j c0923j;
                if (continuation instanceof C0923j) {
                    c0923j = (C0923j) continuation;
                    int i2 = c0923j.f66761t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0923j.f66761t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0923j = new C0923j(continuation);
                    }
                }
                Object obj2 = c0923j.f66760n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0923j.f66761t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f66758n;
                    List listN = ((YV.QJ) obj).n();
                    c0923j.f66761t = 1;
                    if (cn3.rl(listN, c0923j) == coroutine_suspended) {
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

        public nKK(TFv.Wre wre) {
            this.f66757n = wre;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f66757n.n(new j(cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    static final class o extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66763n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f66764t;

        o(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66764t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return aC.this.T(null, this);
        }
    }

    static final class qz extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f66765O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f66766Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66767n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f66769r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f66770t;

        qz(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66769r = obj;
            this.f66766Z |= Integer.MIN_VALUE;
            return aC.this.N(null, null, this);
        }
    }

    static final class r extends SuspendLambda implements Function1 {
        final /* synthetic */ KNH.I28 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f66771O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ GJW.r f66772S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ YV.Pl f66773Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66774n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f66775o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Activity f66776r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, KNH.I28 i28, Activity activity, String str2, YV.Pl pl, GJW.r rVar, Continuation continuation) {
            super(1, continuation);
            this.f66771O = str;
            this.J2 = i28;
            this.f66776r = activity;
            this.f66775o = str2;
            this.f66773Z = pl;
            this.f66772S = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return aC.this.new r(this.f66771O, this.J2, this.f66776r, this.f66775o, this.f66773Z, this.f66772S, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
        
            if (r12 == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
        
            if (r12 == r0) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            x0X.n nVar;
            r rVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66774n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            ResultKt.throwOnFailure(obj);
                            rVar = this;
                            nVar = (x0X.n) obj;
                            GJW.r rVar2 = rVar.f66772S;
                            if (nVar instanceof n.C1266n) {
                                my.j.n(rVar2, fE.n.n((fE.j) ((n.C1266n) nVar).n()));
                                return nVar;
                            }
                            if (nVar instanceof n.w6) {
                                return nVar;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    nVar = (x0X.n) obj;
                    rVar = this;
                    GJW.r rVar22 = rVar.f66772S;
                    if (nVar instanceof n.C1266n) {
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                aC aCVar = aC.this;
                String str = this.f66771O;
                KNH.I28 i28 = this.J2;
                this.f66774n = 1;
                obj = aCVar.N(str, i28, this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            nVar = (x0X.n) obj;
            aC aCVar2 = aC.this;
            Activity activity = this.f66776r;
            String str2 = this.f66771O;
            String str3 = this.f66775o;
            YV.Pl pl = this.f66773Z;
            if (!(nVar instanceof n.C1266n)) {
                if (nVar instanceof n.w6) {
                    String str4 = (String) ((n.w6) nVar).n();
                    if (str4 == null) {
                        fE.w6 w6VarX = aCVar2.X();
                        this.f66774n = 2;
                        obj = w6VarX.rl(activity, str2, str3, this);
                    } else {
                        fE.w6 w6VarX2 = aCVar2.X();
                        int iRl = pl.rl();
                        this.f66774n = 3;
                        rVar = this;
                        obj = w6VarX2.nr(activity, str2, str3, str4, iRl, rVar);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            rVar = this;
            GJW.r rVar222 = rVar.f66772S;
            if (nVar instanceof n.C1266n) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((r) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class s4 extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f66778O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f66779Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66780n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f66782r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f66783t;

        s4(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66782r = obj;
            this.f66779Z |= Integer.MIN_VALUE;
            return aC.this.xMQ(null, null, null, this);
        }
    }

    static final class u extends ContinuationImpl {
        int E2;
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f66784O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        /* synthetic */ Object f66785S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        boolean f66786Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66788n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f66789o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f66790r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f66791t;

        u(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66785S = obj;
            this.E2 |= Integer.MIN_VALUE;
            return aC.this.p5(null, null, null, false, null, this);
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ rB.Ml f66792O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66793n;

        static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ rB.Ml f66795n;

            j(rB.Ml ml) {
                this.f66795n = ml;
            }

            public final Object n(boolean z2, Continuation continuation) {
                this.f66795n.J2(z2);
                return Unit.INSTANCE;
            }

            @Override // TFv.CN3
            public /* bridge */ /* synthetic */ Object rl(Object obj, Continuation continuation) {
                return n(((Boolean) obj).booleanValue(), continuation);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(rB.Ml ml, Continuation continuation) {
            super(2, continuation);
            this.f66792O = ml;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return aC.this.new w6(this.f66792O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66793n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreKN = aC.this.KN();
                j jVar = new j(this.f66792O);
                this.f66793n = 1;
                if (wreKN.n(jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: fE.aC$z, reason: case insensitive filesystem */
    static final class C2103z extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f66796O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66797n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f66798o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f66800t;

        C2103z(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f66798o |= Integer.MIN_VALUE;
            return aC.this.wTp(this);
        }
    }

    public aC(Context context, TFv.Wre userInfoFlow, TFv.Wre availableProductsFlow, gHt.j purchaseVerifier, jXF.j jVar, CZF.I28 i28, Function2 trackEvent, Function4 trackPurchaseIdentifiers, fE.w6 billingClientWrapper, sJa.Ml dispatcherProvider, fE.eO repository, rB.Ml spiderSense, Function1 shouldTrackPurchaseEvents, Function1 shouldTrackPurchaseIdentifiers, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userInfoFlow, "userInfoFlow");
        Intrinsics.checkNotNullParameter(availableProductsFlow, "availableProductsFlow");
        Intrinsics.checkNotNullParameter(purchaseVerifier, "purchaseVerifier");
        Intrinsics.checkNotNullParameter(trackEvent, "trackEvent");
        Intrinsics.checkNotNullParameter(trackPurchaseIdentifiers, "trackPurchaseIdentifiers");
        Intrinsics.checkNotNullParameter(billingClientWrapper, "billingClientWrapper");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        Intrinsics.checkNotNullParameter(shouldTrackPurchaseEvents, "shouldTrackPurchaseEvents");
        Intrinsics.checkNotNullParameter(shouldTrackPurchaseIdentifiers, "shouldTrackPurchaseIdentifiers");
        this.rl = context;
        this.f66656t = userInfoFlow;
        this.nr = availableProductsFlow;
        this.f66650O = purchaseVerifier;
        this.J2 = jVar;
        this.Uo = trackEvent;
        this.KN = trackPurchaseIdentifiers;
        this.xMQ = billingClientWrapper;
        this.mUb = dispatcherProvider;
        this.gh = repository;
        this.qie = shouldTrackPurchaseEvents;
        this.az = shouldTrackPurchaseIdentifiers;
        rB.Ml mlNr = d3.j.nr(spiderSense, "monopoly");
        this.ty = mlNr;
        vd vdVarN = Lu.n(dispatcherProvider.rl());
        this.HI = vdVarN;
        this.ck = TFv.Lu.n(YV.Dsr.J2);
        ILs.j jVar2 = ILs.j.f4187t;
        this.Ik = TFv.nKK.rl(1, 0, jVar2, 2, null);
        TFv.r rVarRl = TFv.nKK.rl(1, 0, jVar2, 2, null);
        this.f66654o = rVarRl;
        this.f66652Z = xFr.Ml.rl(rVarRl, new I28(null));
        this.XQ = new Z(rl());
        this.f66651S = TFv.Lu.n(null);
        this.WPU = LazyKt.lazy(new Function0() { // from class: fE.Dsr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return aC.v(this.f66597n);
            }
        });
        TFv.r rVarRl2 = TFv.nKK.rl(1, 0, null, 6, null);
        this.aYN = rVarRl2;
        this.ViF = rVarRl2;
        this.nY = new Ew(userInfoFlow);
        this.f66653g = new nKK(userInfoFlow);
        this.iF = new ON.j(this.Uo, shouldTrackPurchaseEvents);
        this.fD = new fE.qz(purchaseVerifier, availableProductsFlow, billingClientWrapper, repository, mlNr, vdVarN, jVar, this.KN, shouldTrackPurchaseIdentifiers);
        w6.j.n(billingClientWrapper, this, null, 2, null);
        GJW.C.nr(vdVarN, null, null, new j(null), 3, null);
        if (i28 != null) {
            i28.J2(new n());
        }
        if (z2) {
            GJW.C.nr(vdVarN, null, null, new w6(spiderSense, null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // YV.Wre
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mUb(boolean z2, Continuation continuation) {
        afx afxVar;
        aC aCVar;
        K6D.j jVar;
        aC aCVar2;
        x0X.n nVar;
        aC aCVar3;
        com.bendingspoons.monopoly.contracts.j jVar2;
        YV.Xo xo;
        if (continuation instanceof afx) {
            afxVar = (afx) continuation;
            int i2 = afxVar.f66720o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                afxVar.f66720o = i2 - Integer.MIN_VALUE;
            } else {
                afxVar = new afx(continuation);
            }
        }
        Object objN = afxVar.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = afxVar.f66720o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            ON.j jVar3 = this.iF;
            afxVar.f66719n = this;
            afxVar.f66718O = z2;
            afxVar.f66720o = 1;
            if (jVar3.J2(z2, afxVar) != coroutine_suspended) {
                aCVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                z2 = afxVar.f66718O;
                jVar = (K6D.j) afxVar.f66722t;
                aCVar2 = (aC) afxVar.f66719n;
                ResultKt.throwOnFailure(objN);
                nVar = (x0X.n) objN;
                if (!(nVar instanceof n.C1266n)) {
                    fE.fuX.KN(jVar, (fE.j) ((n.C1266n) nVar).n());
                    return YV.Xo.f12136n;
                }
                if (!(nVar instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                Iterable iterable = (Iterable) ((n.w6) nVar).n();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(fE.fuX.J2((PurchaseHistoryRecord) it.next()));
                }
                if (arrayList.isEmpty()) {
                    return YV.Xo.f12135O;
                }
                gHt.j jVar4 = aCVar2.f66650O;
                afxVar.f66719n = aCVar2;
                afxVar.f66722t = jVar;
                afxVar.f66718O = z2;
                afxVar.f66720o = 3;
                objN = jVar4.n(arrayList, afxVar);
                if (objN != coroutine_suspended) {
                    aCVar3 = aCVar2;
                    jVar2 = (com.bendingspoons.monopoly.contracts.j) objN;
                    if (!(jVar2 instanceof j.w6)) {
                    }
                    if (xo == YV.Xo.f12136n) {
                    }
                }
                return coroutine_suspended;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    YV.Xo xo2 = (YV.Xo) afxVar.f66719n;
                    ResultKt.throwOnFailure(objN);
                    return xo2;
                }
                if (i3 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                YV.Xo xo3 = (YV.Xo) afxVar.f66719n;
                ResultKt.throwOnFailure(objN);
                return xo3;
            }
            z2 = afxVar.f66718O;
            jVar = (K6D.j) afxVar.f66722t;
            aCVar3 = (aC) afxVar.f66719n;
            ResultKt.throwOnFailure(objN);
            jVar2 = (com.bendingspoons.monopoly.contracts.j) objN;
            if (!(jVar2 instanceof j.w6)) {
                j.w6 w6Var = (j.w6) jVar2;
                xo = (w6Var.n().t().isEmpty() && w6Var.n().rl().isEmpty() && w6Var.n().n().isEmpty()) ? YV.Xo.f12135O : YV.Xo.f12138t;
            } else if (jVar2 instanceof j.n) {
                xo = YV.Xo.f12135O;
            } else {
                if (!(jVar2 instanceof j.C0725j)) {
                    throw new NoWhenBranchMatchedException();
                }
                fE.fuX.Uo(jVar, (j.C0725j) jVar2);
                xo = YV.Xo.f12136n;
            }
            if (xo == YV.Xo.f12136n) {
                jVar.n(pq.I28.n(pq.n.O("restore_state", xo.name())));
                ON.j jVar5 = aCVar3.iF;
                afxVar.f66719n = xo;
                afxVar.f66722t = null;
                afxVar.f66720o = 4;
                if (jVar5.nr(z2, afxVar) != coroutine_suspended) {
                    return xo;
                }
            } else {
                ON.j jVar6 = aCVar3.iF;
                afxVar.f66719n = xo;
                afxVar.f66722t = null;
                afxVar.f66720o = 5;
                if (jVar6.O(z2, afxVar) != coroutine_suspended) {
                    return xo;
                }
            }
            return coroutine_suspended;
        }
        z2 = afxVar.f66718O;
        aCVar = (aC) afxVar.f66719n;
        ResultKt.throwOnFailure(objN);
        K6D.j jVarRl = aCVar.ty.O().rl(YV.Ml.f12114n.o(), UUID.randomUUID().toString());
        fE.w6 w6Var2 = aCVar.xMQ;
        afxVar.f66719n = aCVar;
        afxVar.f66722t = jVarRl;
        afxVar.f66718O = z2;
        afxVar.f66720o = 2;
        Object objN2 = fE.Wre.n(w6Var2, afxVar);
        if (objN2 != coroutine_suspended) {
            aC aCVar4 = aCVar;
            jVar = jVarRl;
            objN = objN2;
            aCVar2 = aCVar4;
            nVar = (x0X.n) objN;
            if (!(nVar instanceof n.C1266n)) {
            }
        }
        return coroutine_suspended;
    }

    public /* synthetic */ class Ml {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KNH.I28.values().length];
            try {
                iArr[KNH.I28.f5294t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KNH.I28.f5293n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007c -> B:20:0x007f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E2(List list, Continuation continuation) {
        fuX fux;
        aC aCVar;
        List list2;
        List arrayList;
        Iterator it;
        if (continuation instanceof fuX) {
            fux = (fuX) continuation;
            int i2 = fux.f66735S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fux.f66735S = i2 - Integer.MIN_VALUE;
            } else {
                fux = new fuX(continuation);
            }
        }
        Object objUo = fux.f66738o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = fux.f66735S;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            ArrayList arrayList2 = new ArrayList();
            aCVar = this;
            list2 = arrayList2;
            arrayList = new ArrayList();
            it = list.iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) fux.f66739r;
            it = (Iterator) fux.J2;
            arrayList = (List) fux.f66734O;
            list2 = (List) fux.f66740t;
            aCVar = (aC) fux.f66737n;
            ResultKt.throwOnFailure(objUo);
            x0X.n nVarT = (x0X.n) objUo;
            boolean z2 = nVarT instanceof n.C1266n;
            if (z2) {
                aCVar.M7(YV.Ml.f12114n.rl(str, (Throwable) ((n.C1266n) nVarT).n()));
            } else if (!(nVarT instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!z2) {
                if (!(nVarT instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                nVarT = n.j.t(x0X.n.f75185n, (SubscriptionProduct) ((n.w6) nVarT).n(), null, 2, null);
            }
            boolean z3 = nVarT instanceof n.C1266n;
            if (!z3) {
                if (!(nVarT instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                list2.add((SubscriptionProduct) ((n.w6) nVarT).n());
            }
            if (z3) {
                arrayList.add(str);
            } else if (!(nVarT instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            if (it.hasNext()) {
                str = (String) it.next();
                Dsr dsr = aCVar.new Dsr(str, null);
                fux.f66737n = aCVar;
                fux.f66740t = list2;
                fux.f66734O = arrayList;
                fux.J2 = it;
                fux.f66739r = str;
                fux.f66735S = 1;
                objUo = x0X.w6.Uo(dsr, fux);
                if (objUo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                x0X.n nVarT2 = (x0X.n) objUo;
                boolean z22 = nVarT2 instanceof n.C1266n;
                if (z22) {
                }
                if (!z22) {
                }
                boolean z32 = nVarT2 instanceof n.C1266n;
                if (!z32) {
                }
                if (z32) {
                }
                if (it.hasNext()) {
                    return TuplesKt.to(list2, arrayList);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M7(ajd.j jVar) {
        this.ty.t(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0105, code lost:
    
        if (r13 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0105 -> B:46:0x0108). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object N(String str, KNH.I28 i28, Continuation continuation) {
        qz qzVar;
        aC aCVar;
        String str2;
        List list;
        int i2;
        Object next;
        aC aCVar2;
        Iterator it;
        aC aCVar3;
        Set set;
        if (continuation instanceof qz) {
            qzVar = (qz) continuation;
            int i3 = qzVar.f66766Z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qzVar.f66766Z = i3 - Integer.MIN_VALUE;
            } else {
                qzVar = new qz(continuation);
            }
        }
        Object objUo = qzVar.f66769r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = qzVar.f66766Z;
        String strJ2 = null;
        if (i5 == 0) {
            ResultKt.throwOnFailure(objUo);
            fE.w6 w6Var = this.xMQ;
            qzVar.f66767n = this;
            qzVar.f66770t = str;
            qzVar.f66765O = i28;
            qzVar.f66766Z = 1;
            objUo = w6Var.Uo("subs", qzVar);
            if (objUo != coroutine_suspended) {
                aCVar = this;
            }
            return coroutine_suspended;
        }
        if (i5 == 1) {
            i28 = (KNH.I28) qzVar.f66765O;
            str = (String) qzVar.f66770t;
            aCVar = (aC) qzVar.f66767n;
            ResultKt.throwOnFailure(objUo);
        } else {
            if (i5 == 2) {
                list = (List) qzVar.J2;
                i28 = (KNH.I28) qzVar.f66765O;
                String str3 = (String) qzVar.f66770t;
                aC aCVar4 = (aC) qzVar.f66767n;
                ResultKt.throwOnFailure(objUo);
                str2 = str3;
                aCVar = aCVar4;
                i2 = Ml.$EnumSwitchMapping$0[i28.ordinal()];
                if (i2 != 1) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (!Intrinsics.areEqual(((YV.o) next).t(), str2)) {
                            break;
                        }
                    }
                    YV.o oVar = (YV.o) next;
                    if (oVar != null) {
                        strJ2 = oVar.J2();
                    }
                    return new n.w6(strJ2);
                }
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                qzVar.f66767n = aCVar;
                qzVar.f66770t = list;
                qzVar.f66765O = null;
                qzVar.J2 = null;
                qzVar.f66766Z = 3;
                objUo = aCVar.T(str2, qzVar);
                if (objUo != coroutine_suspended) {
                    aCVar2 = aCVar;
                    it = list.iterator();
                    aCVar3 = aCVar2;
                    set = (Set) objUo;
                    if (it.hasNext()) {
                    }
                }
                return coroutine_suspended;
            }
            if (i5 != 3) {
                if (i5 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                set = (Set) qzVar.J2;
                Object next2 = qzVar.f66765O;
                it = (Iterator) qzVar.f66770t;
                aCVar3 = (aC) qzVar.f66767n;
                ResultKt.throwOnFailure(objUo);
                if (CollectionsKt.intersect((Iterable) objUo, set).isEmpty()) {
                    if (it.hasNext()) {
                        next2 = it.next();
                        String strT = ((YV.o) next2).t();
                        qzVar.f66767n = aCVar3;
                        qzVar.f66770t = it;
                        qzVar.f66765O = next2;
                        qzVar.J2 = set;
                        qzVar.f66766Z = 4;
                        objUo = aCVar3.T(strT, qzVar);
                    } else {
                        next2 = null;
                    }
                }
                YV.o oVar2 = (YV.o) next2;
                if (oVar2 != null) {
                    strJ2 = oVar2.J2();
                }
                return new n.w6(strJ2);
            }
            list = (List) qzVar.f66770t;
            aCVar2 = (aC) qzVar.f66767n;
            ResultKt.throwOnFailure(objUo);
            it = list.iterator();
            aCVar3 = aCVar2;
            set = (Set) objUo;
            if (it.hasNext()) {
            }
        }
        x0X.n nVar = (x0X.n) objUo;
        if (nVar instanceof n.C1266n) {
            return nVar;
        }
        if (!(nVar instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        List list2 = (List) ((n.w6) nVar).n();
        TFv.r rVar = aCVar.Ik;
        qzVar.f66767n = aCVar;
        qzVar.f66770t = str;
        qzVar.f66765O = i28;
        qzVar.J2 = list2;
        qzVar.f66766Z = 2;
        if (rVar.rl(list2, qzVar) != coroutine_suspended) {
            str2 = str;
            list = list2;
            i2 = Ml.$EnumSwitchMapping$0[i28.ordinal()];
            if (i2 != 1) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P5() {
        GJW.C.nr(this.HI, null, null, new DAz(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(String str, Continuation continuation) {
        o oVar;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i2 = oVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                oVar = new o(continuation);
            }
        }
        Object objViF = oVar.f66764t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objViF);
            TFv.Wre wre = this.nr;
            oVar.f66763n = str;
            oVar.J2 = 1;
            objViF = TFv.fuX.ViF(wre, oVar);
            if (objViF == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) oVar.f66763n;
            ResultKt.throwOnFailure(objViF);
        }
        Set set = (Set) ((YV.n) objViF).t().get(str);
        return set == null ? SetsKt.emptySet() : set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object U(Continuation continuation) {
        g9s g9sVar;
        aC aCVar;
        x0X.n nVar;
        TFv.r rVar;
        ArrayList arrayList;
        aC aCVar2;
        x0X.n nVar2;
        aC aCVar3;
        fE.j jVar;
        if (continuation instanceof g9s) {
            g9sVar = (g9s) continuation;
            int i2 = g9sVar.f66743o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g9sVar.f66743o = i2 - Integer.MIN_VALUE;
            } else {
                g9sVar = new g9s(continuation);
            }
        }
        Object objUo = g9sVar.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = g9sVar.f66743o;
        boolean z2 = true;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            fE.w6 w6Var = this.xMQ;
            g9sVar.f66742n = this;
            g9sVar.f66743o = 1;
            objUo = w6Var.Uo("subs", g9sVar);
            if (objUo != coroutine_suspended) {
                aCVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar = (fE.j) g9sVar.f66741O;
                aCVar3 = (aC) g9sVar.f66742n;
                ResultKt.throwOnFailure(objUo);
                aCVar3.M7(YV.Ml.f12114n.r(jVar));
                return Unit.INSTANCE;
            }
            nVar2 = (x0X.n) g9sVar.f66745t;
            aCVar2 = (aC) g9sVar.f66742n;
            ResultKt.throwOnFailure(objUo);
            nVar = nVar2;
            aCVar = aCVar2;
            if (!(nVar instanceof n.C1266n)) {
                if (!(nVar instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
            fE.j jVar2 = (fE.j) ((n.C1266n) nVar).n();
            aCVar.ck.setValue(YV.Dsr.J2);
            TFv.r rVar2 = aCVar.Ik;
            List listEmptyList = CollectionsKt.emptyList();
            g9sVar.f66742n = aCVar;
            g9sVar.f66745t = nVar;
            g9sVar.f66741O = jVar2;
            g9sVar.f66743o = 3;
            if (rVar2.rl(listEmptyList, g9sVar) != coroutine_suspended) {
                aCVar3 = aCVar;
                jVar = jVar2;
                aCVar3.M7(YV.Ml.f12114n.r(jVar));
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        aCVar = (aC) g9sVar.f66742n;
        ResultKt.throwOnFailure(objUo);
        nVar = (x0X.n) objUo;
        if (!(nVar instanceof n.C1266n)) {
            if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            List list = (List) ((n.w6) nVar).n();
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((YV.o) it.next()).nr() == YV.qz.f12153t) {
                        break;
                    }
                }
                z2 = false;
                aCVar.ck.setValue(!z2 ? YV.Dsr.f12103r : YV.Dsr.J2);
                rVar = aCVar.Ik;
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((YV.o) obj).nr() == YV.qz.f12149O) {
                        arrayList.add(obj);
                    }
                }
                g9sVar.f66742n = aCVar;
                g9sVar.f66745t = nVar;
                g9sVar.f66743o = 2;
                if (rVar.rl(arrayList, g9sVar) != coroutine_suspended) {
                    aCVar2 = aCVar;
                    nVar2 = nVar;
                    nVar = nVar2;
                    aCVar = aCVar2;
                    if (!(nVar instanceof n.C1266n)) {
                    }
                }
            } else {
                z2 = false;
                aCVar.ck.setValue(!z2 ? YV.Dsr.f12103r : YV.Dsr.J2);
                rVar = aCVar.Ik;
                arrayList = new ArrayList();
                while (r6.hasNext()) {
                }
                g9sVar.f66742n = aCVar;
                g9sVar.f66745t = nVar;
                g9sVar.f66743o = 2;
                if (rVar.rl(arrayList, g9sVar) != coroutine_suspended) {
                }
            }
            return Unit.INSTANCE;
        }
        if (!(nVar instanceof n.C1266n)) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Xw(fE.w6 w6Var, Continuation continuation) {
        SPz sPz;
        aC aCVar;
        List list;
        aC aCVar2;
        x0X.n nVar;
        if (continuation instanceof SPz) {
            sPz = (SPz) continuation;
            int i2 = sPz.f66695r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sPz.f66695r = i2 - Integer.MIN_VALUE;
            } else {
                sPz = new SPz(continuation);
            }
        }
        Object objUo = sPz.f66693O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = sPz.f66695r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            sPz.f66694n = this;
            sPz.f66696t = w6Var;
            sPz.f66695r = 1;
            objUo = w6Var.Uo("subs", sPz);
            if (objUo != coroutine_suspended) {
                aCVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) sPz.f66696t;
            aCVar2 = (aC) sPz.f66694n;
            ResultKt.throwOnFailure(objUo);
            nVar = (x0X.n) objUo;
            if (!(nVar instanceof n.C1266n)) {
                return nVar;
            }
            if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            List listPlus = CollectionsKt.plus((Collection) list, (Iterable) ((n.w6) nVar).n());
            aCVar2.f66655r = listPlus;
            return new n.w6(listPlus);
        }
        w6Var = (fE.w6) sPz.f66696t;
        aCVar = (aC) sPz.f66694n;
        ResultKt.throwOnFailure(objUo);
        x0X.n nVar2 = (x0X.n) objUo;
        if (nVar2 instanceof n.C1266n) {
            return nVar2;
        }
        if (!(nVar2 instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        List list2 = (List) ((n.w6) nVar2).n();
        sPz.f66694n = aCVar;
        sPz.f66696t = list2;
        sPz.f66695r = 2;
        Object objUo2 = w6Var.Uo("inapp", sPz);
        if (objUo2 != coroutine_suspended) {
            objUo = objUo2;
            list = list2;
            aCVar2 = aCVar;
            nVar = (x0X.n) objUo;
            if (!(nVar instanceof n.C1266n)) {
            }
        }
        return coroutine_suspended;
    }

    private final void bzg(fE.Pl pl) {
        YV.Dsr dsr;
        GJW.r rVar = this.te;
        if (rVar != null) {
            my.j.rl(rVar, pl);
            TFv.SPz sPz = this.ck;
            if (pl instanceof Pl.n) {
                dsr = YV.Dsr.f12101n;
            } else if (pl instanceof Pl.j) {
                dsr = YV.Dsr.f12103r;
            } else {
                if (!Intrinsics.areEqual(pl, Pl.w6.f66644n)) {
                    throw new NoWhenBranchMatchedException();
                }
                dsr = YV.Dsr.f12104t;
            }
            sPz.setValue(dsr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(List list, Continuation continuation) {
        C0922aC c0922aC;
        aC aCVar;
        aC aCVar2;
        Iterator it;
        x0X.n nVar;
        if (continuation instanceof C0922aC) {
            c0922aC = (C0922aC) continuation;
            int i2 = c0922aC.f66715o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0922aC.f66715o = i2 - Integer.MIN_VALUE;
            } else {
                c0922aC = new C0922aC(continuation);
            }
        }
        Object objO = c0922aC.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0922aC.f66715o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objO);
            fE.w6 w6Var = this.xMQ;
            c0922aC.f66714n = this;
            c0922aC.f66715o = 1;
            objO = w6Var.O(list, "subs", c0922aC);
            if (objO != coroutine_suspended) {
                aCVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c0922aC.f66713O;
            nVar = (x0X.n) c0922aC.f66717t;
            aCVar2 = (aC) c0922aC.f66714n;
            ResultKt.throwOnFailure(objO);
            while (it.hasNext()) {
                SubscriptionProduct subscriptionProduct = (SubscriptionProduct) it.next();
                fE.eO eOVar = aCVar2.gh;
                c0922aC.f66714n = aCVar2;
                c0922aC.f66717t = nVar;
                c0922aC.f66713O = it;
                c0922aC.f66715o = 2;
                if (eOVar.nr(subscriptionProduct, c0922aC) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return nVar;
        }
        aCVar = (aC) c0922aC.f66714n;
        ResultKt.throwOnFailure(objO);
        x0X.n w6Var2 = (x0X.n) objO;
        if (w6Var2 instanceof n.C1266n) {
            w6Var2 = new n.C1266n(fE.n.n((fE.j) ((n.C1266n) w6Var2).n()));
        } else if (!(w6Var2 instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!(w6Var2 instanceof n.C1266n)) {
            if (!(w6Var2 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            Pair pair = (Pair) ((n.w6) w6Var2).n();
            List<com.android.billingclient.api.Wre> list2 = (List) pair.component1();
            List mutableList = CollectionsKt.toMutableList((Collection) pair.component2());
            ArrayList arrayList = new ArrayList();
            for (com.android.billingclient.api.Wre wre : list2) {
                x0X.n nVarT = SubscriptionProduct.INSTANCE.t(wre);
                if (nVarT instanceof n.C1266n) {
                    String strNr = wre.nr();
                    Intrinsics.checkNotNullExpressionValue(strNr, "getProductId(...)");
                    mutableList.add(strNr);
                } else if (!(nVarT instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                SubscriptionProduct subscriptionProduct2 = (SubscriptionProduct) x0X.w6.nr(nVarT);
                if (subscriptionProduct2 != null) {
                    arrayList.add(subscriptionProduct2);
                }
            }
            w6Var2 = new n.w6(TuplesKt.to(arrayList, mutableList));
        }
        if (w6Var2 instanceof n.C1266n) {
            return w6Var2;
        }
        if (!(w6Var2 instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        aCVar2 = aCVar;
        it = ((List) ((Pair) ((n.w6) w6Var2).n()).component1()).iterator();
        nVar = w6Var2;
        while (it.hasNext()) {
        }
        return nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r14.t(r10, r11, r12, r7) == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        if (r1.rl(r10, r3, r11, r5, r6, r7) == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ec, code lost:
    
        if (r1.rl(r10, r11, r4, r5, r6, r7) == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0110, code lost:
    
        if (r11.n(r10, r4, r5, r6, r7) == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0112, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p5(x0X.n nVar, String str, String str2, boolean z2, pq.Ml ml, Continuation continuation) {
        u uVar;
        aC aCVar;
        if (continuation instanceof u) {
            uVar = (u) continuation;
            int i2 = uVar.E2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uVar.E2 = i2 - Integer.MIN_VALUE;
            } else {
                uVar = new u(continuation);
            }
        }
        u uVar2 = uVar;
        Object obj = uVar2.f66785S;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = uVar2.E2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (nVar instanceof n.C1266n) {
                ON.j jVar = this.iF;
                uVar2.f66788n = this;
                uVar2.f66791t = nVar;
                uVar2.f66784O = str;
                uVar2.J2 = str2;
                uVar2.f66790r = ml;
                uVar2.f66789o = nVar;
                uVar2.f66786Z = z2;
                uVar2.E2 = 1;
            } else if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            aCVar = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2 && i3 != 3 && i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            z2 = uVar2.f66786Z;
            ml = (pq.Ml) uVar2.f66790r;
            str2 = (String) uVar2.J2;
            str = (String) uVar2.f66784O;
            nVar = (x0X.n) uVar2.f66791t;
            aCVar = (aC) uVar2.f66788n;
            ResultKt.throwOnFailure(obj);
        }
        boolean z3 = z2;
        pq.Ml ml2 = ml;
        if (!(nVar instanceof n.C1266n)) {
            if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            fE.Pl pl = (fE.Pl) ((n.w6) nVar).n();
            if (pl instanceof Pl.n) {
                ON.j jVar2 = aCVar.iF;
                String strN = ((Pl.n) pl).n();
                uVar2.f66788n = nVar;
                uVar2.f66791t = null;
                uVar2.f66784O = null;
                uVar2.J2 = null;
                uVar2.f66790r = null;
                uVar2.f66789o = null;
                uVar2.E2 = 2;
            } else {
                String str3 = str2;
                if (pl instanceof Pl.j) {
                    ON.j jVar3 = aCVar.iF;
                    String strN2 = ((Pl.j) pl).n();
                    uVar2.f66788n = nVar;
                    uVar2.f66791t = null;
                    uVar2.f66784O = null;
                    uVar2.J2 = null;
                    uVar2.f66790r = null;
                    uVar2.f66789o = null;
                    uVar2.E2 = 3;
                } else {
                    if (!Intrinsics.areEqual(pl, Pl.w6.f66644n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ON.j jVar4 = aCVar.iF;
                    uVar2.f66788n = nVar;
                    uVar2.f66791t = null;
                    uVar2.f66784O = null;
                    uVar2.J2 = null;
                    uVar2.f66790r = null;
                    uVar2.f66789o = null;
                    uVar2.E2 = 4;
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final void rV9(YV.CN3 cn3) {
        GJW.r rVar = this.te;
        if (rVar != null) {
            my.j.n(rVar, cn3);
            this.ck.setValue(YV.Dsr.f12099O);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TFv.Wre v(aC aCVar) {
        return TFv.fuX.ty(aCVar.f66656t, aCVar.n(), new l3D(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object wTp(Continuation continuation) {
        C2103z c2103z;
        aC aCVar;
        x0X.n nVar;
        List list;
        x0X.n nVar2;
        Iterator it;
        if (continuation instanceof C2103z) {
            c2103z = (C2103z) continuation;
            int i2 = c2103z.f66798o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2103z.f66798o = i2 - Integer.MIN_VALUE;
            } else {
                c2103z = new C2103z(continuation);
            }
        }
        Object objXw = c2103z.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c2103z.f66798o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objXw);
            fE.w6 w6Var = this.xMQ;
            c2103z.f66797n = this;
            c2103z.f66798o = 1;
            objXw = Xw(w6Var, c2103z);
            if (objXw != coroutine_suspended) {
                aCVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                list = (List) c2103z.f66796O;
                nVar2 = (x0X.n) c2103z.f66800t;
                aCVar = (aC) c2103z.f66797n;
                ResultKt.throwOnFailure(objXw);
                YV.QJ qj = (YV.QJ) objXw;
                List listPlus = CollectionsKt.plus((Collection) qj.t(), (Iterable) qj.rl());
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    YV.o oVar = (YV.o) obj;
                    if (oVar.nr() == YV.qz.f12149O && (!oVar.Uo() || !CollectionsKt.contains(listPlus, oVar.t()))) {
                        arrayList.add(obj);
                    }
                }
                it = arrayList.iterator();
                while (it.hasNext()) {
                }
                nVar = nVar2;
                if (nVar instanceof n.C1266n) {
                }
                return Unit.INSTANCE;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c2103z.f66796O;
            nVar2 = (x0X.n) c2103z.f66800t;
            aCVar = (aC) c2103z.f66797n;
            ResultKt.throwOnFailure(objXw);
            while (it.hasNext()) {
                YV.o oVar2 = (YV.o) it.next();
                c2103z.f66797n = aCVar;
                c2103z.f66800t = nVar2;
                c2103z.f66796O = it;
                c2103z.f66798o = 3;
                if (aCVar.s7N(oVar2, c2103z) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            nVar = nVar2;
            if (nVar instanceof n.C1266n) {
                aCVar.M7(YV.Ml.f12114n.ck((fE.j) ((n.C1266n) nVar).n()));
            } else if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        aC aCVar2 = (aC) c2103z.f66797n;
        ResultKt.throwOnFailure(objXw);
        aCVar = aCVar2;
        nVar = (x0X.n) objXw;
        if (!(nVar instanceof n.C1266n)) {
            if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            list = (List) ((n.w6) nVar).n();
            TFv.Wre wre = aCVar.f66656t;
            c2103z.f66797n = aCVar;
            c2103z.f66800t = nVar;
            c2103z.f66796O = list;
            c2103z.f66798o = 2;
            Object objViF = TFv.fuX.ViF(wre, c2103z);
            if (objViF != coroutine_suspended) {
                nVar2 = nVar;
                objXw = objViF;
                YV.QJ qj2 = (YV.QJ) objXw;
                List listPlus2 = CollectionsKt.plus((Collection) qj2.t(), (Iterable) qj2.rl());
                ArrayList arrayList2 = new ArrayList();
                while (r2.hasNext()) {
                }
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                nVar = nVar2;
            }
            return coroutine_suspended;
        }
        if (nVar instanceof n.C1266n) {
        }
        return Unit.INSTANCE;
    }

    @Override // OS.InterfaceC1422c
    public void HI(com.android.billingclient.api.Ml billingResult, List list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        if (fE.CN3.rl(billingResult) && list != null) {
            M7(YV.Ml.f12114n.ty());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GJW.C.nr(this.HI, null, null, new C2102c((Purchase) it.next(), this, null), 3, null);
            }
            return;
        }
        if (fE.CN3.t(billingResult)) {
            M7(YV.Ml.f12114n.HI());
            this.ck.setValue(YV.Dsr.f12104t);
            GJW.r rVar = this.te;
            if (rVar != null) {
                my.j.rl(rVar, Pl.w6.f66644n);
                return;
            }
            return;
        }
        M7(YV.Ml.f12114n.az(billingResult));
        this.ck.setValue(YV.Dsr.f12099O);
        GJW.r rVar2 = this.te;
        if (rVar2 != null) {
            my.j.n(rVar2, YV.CN3.f12097t.J2(fE.CN3.n(billingResult)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // YV.eO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object J2(Activity activity, String str, String str2, YV.Pl pl, KNH.I28 i28, YV.z zVar, Continuation continuation) {
        Q q2;
        pq.Ml ml;
        GJW.r rVar;
        String str3;
        Activity activity2;
        String str4;
        YV.Pl pl3;
        KNH.I28 i282;
        aC aCVar;
        Boolean boolT;
        YV.z zVar2;
        GJW.r rVar2;
        aC aCVar2;
        YV.z zVar3;
        String str5;
        x0X.n nVar;
        Object obj;
        boolean zBooleanValue;
        pq.Ml ml2;
        Object obj2;
        aC aCVar3;
        Boolean boolT2;
        x0X.n nVar2;
        YV.z zVar4 = zVar;
        if (continuation instanceof Q) {
            q2 = (Q) continuation;
            int i2 = q2.E2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q2.E2 = i2 - Integer.MIN_VALUE;
            } else {
                q2 = new Q(continuation);
            }
        }
        Q q3 = q2;
        Object objAwait = q3.f66683S;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = q3.E2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objAwait);
            ON.j jVar = this.iF;
            String strRl = zVar4 != null ? zVar4.rl() : null;
            String str6 = strRl == null ? "" : strRl;
            boolean zBooleanValue2 = (zVar4 == null || (boolT = zVar4.t()) == null) ? false : boolT.booleanValue();
            if (zVar4 == null || (ml = zVar4.n()) == null) {
                ml = new pq.Ml();
            }
            pq.Ml ml3 = ml;
            q3.f66686n = this;
            q3.f66689t = activity;
            q3.f66682O = str;
            q3.J2 = str2;
            q3.f66688r = pl;
            q3.f66687o = i28;
            q3.f66684Z = zVar4;
            q3.E2 = 1;
            rVar = null;
            if (jVar.Uo(str, str6, zBooleanValue2, ml3, q3) != coroutine_suspended) {
                str3 = str;
                activity2 = activity;
                str4 = str2;
                pl3 = pl;
                i282 = i28;
                aCVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                rVar2 = (GJW.r) q3.J2;
                zVar2 = (YV.z) q3.f66682O;
                String str7 = (String) q3.f66689t;
                aC aCVar4 = (aC) q3.f66686n;
                ResultKt.throwOnFailure(objAwait);
                str3 = str7;
                aCVar2 = aCVar4;
                rVar = null;
                q3.f66686n = aCVar2;
                q3.f66689t = str3;
                q3.f66682O = zVar2;
                q3.J2 = rVar;
                q3.E2 = 3;
                objAwait = rVar2.await(q3);
                if (objAwait != coroutine_suspended) {
                    zVar3 = zVar2;
                    str5 = str3;
                    nVar = (x0X.n) objAwait;
                    if (zVar3 == null) {
                    }
                    if (objRl != null) {
                    }
                    if (zVar3 != null) {
                    }
                    if (zVar3 != null) {
                    }
                    ml2 = new pq.Ml();
                    q3.f66686n = aCVar2;
                    q3.f66689t = objAwait;
                    q3.f66682O = rVar;
                    q3.E2 = 4;
                    if (aCVar2.p5(nVar, str5, obj, zBooleanValue, ml2, q3) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i3 != 3) {
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = q3.f66689t;
                aCVar3 = (aC) q3.f66686n;
                ResultKt.throwOnFailure(objAwait);
                rVar = null;
                aCVar3.te = rVar;
                nVar2 = (x0X.n) obj2;
                if (!(nVar2 instanceof n.C1266n)) {
                    return nVar2;
                }
                if (nVar2 instanceof n.w6) {
                    return new n.w6(fE.Xo.n((fE.Pl) ((n.w6) nVar2).n()));
                }
                throw new NoWhenBranchMatchedException();
            }
            zVar3 = (YV.z) q3.f66682O;
            str5 = (String) q3.f66689t;
            aCVar2 = (aC) q3.f66686n;
            ResultKt.throwOnFailure(objAwait);
            rVar = null;
            nVar = (x0X.n) objAwait;
            Object objRl = zVar3 == null ? zVar3.rl() : rVar;
            obj = objRl != null ? objRl : "";
            zBooleanValue = (zVar3 != null || (boolT2 = zVar3.t()) == null) ? false : boolT2.booleanValue();
            if (zVar3 != null || (ml2 = zVar3.n()) == null) {
                ml2 = new pq.Ml();
            }
            q3.f66686n = aCVar2;
            q3.f66689t = objAwait;
            q3.f66682O = rVar;
            q3.E2 = 4;
            if (aCVar2.p5(nVar, str5, obj, zBooleanValue, ml2, q3) != coroutine_suspended) {
                obj2 = objAwait;
                aCVar3 = aCVar2;
                aCVar3.te = rVar;
                nVar2 = (x0X.n) obj2;
                if (!(nVar2 instanceof n.C1266n)) {
                }
            }
            return coroutine_suspended;
        }
        zVar4 = (YV.z) q3.f66684Z;
        KNH.I28 i283 = (KNH.I28) q3.f66687o;
        YV.Pl pl4 = (YV.Pl) q3.f66688r;
        String str8 = (String) q3.J2;
        str3 = (String) q3.f66682O;
        Activity activity3 = (Activity) q3.f66689t;
        aCVar = (aC) q3.f66686n;
        ResultKt.throwOnFailure(objAwait);
        i282 = i283;
        activity2 = activity3;
        pl3 = pl4;
        str4 = str8;
        rVar = null;
        aCVar.ck.setValue(YV.Dsr.J2);
        GJW.r rVarT = GJW.ci.t(rVar, 1, rVar);
        aCVar.te = rVarT;
        rB.Ml ml4 = aCVar.ty;
        ajd.j jVarGh = YV.Ml.f12114n.gh(str3);
        r rVar3 = aCVar.new r(str3, i282, activity2, str4, pl3, rVarT, null);
        q3.f66686n = aCVar;
        q3.f66689t = str3;
        q3.f66682O = zVar4;
        q3.J2 = rVarT;
        q3.f66688r = rVar;
        q3.f66687o = rVar;
        q3.f66684Z = rVar;
        q3.E2 = 2;
        if (my.Ml.t(ml4, jVarGh, rVar3, q3) != coroutine_suspended) {
            zVar2 = zVar4;
            rVar2 = rVarT;
            aCVar2 = aCVar;
            q3.f66686n = aCVar2;
            q3.f66689t = str3;
            q3.f66682O = zVar2;
            q3.J2 = rVar;
            q3.E2 = 3;
            objAwait = rVar2.await(q3);
            if (objAwait != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    @Override // YV.Wre
    public TFv.Wre KN() {
        return (TFv.Wre) this.WPU.getValue();
    }

    @Override // YV.eO
    public TFv.Wre O() {
        return this.ViF;
    }

    @Override // YV.eO
    public TFv.Wre Uo() {
        return xFr.Ml.rl(this.Ik, new Wre(null));
    }

    public final fE.w6 X() {
        return this.xMQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // YV.eO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object az(Continuation continuation) {
        QJ qj;
        if (continuation instanceof QJ) {
            qj = (QJ) continuation;
            int i2 = qj.f66690O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qj.f66690O = i2 - Integer.MIN_VALUE;
            } else {
                qj = new QJ(continuation);
            }
        }
        Object objJ2 = qj.f66691n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = qj.f66690O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objJ2);
            fE.w6 w6Var = this.xMQ;
            qj.f66690O = 1;
            objJ2 = w6Var.J2("subs", qj);
            if (objJ2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objJ2);
        }
        return Boxing.boxBoolean(((List) x0X.w6.nr((x0X.n) objJ2)) != null ? !r5.isEmpty() : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fD(Continuation continuation) {
        CN3 cn3;
        aC aCVar;
        aC aCVar2;
        boolean z2;
        if (continuation instanceof CN3) {
            cn3 = (CN3) continuation;
            int i2 = cn3.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cn3.J2 = i2 - Integer.MIN_VALUE;
            } else {
                cn3 = new CN3(continuation);
            }
        }
        Object objT = cn3.f66663t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = cn3.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objT);
            fE.eO eOVar = this.gh;
            cn3.f66662n = this;
            cn3.J2 = 1;
            objT = eOVar.t(cn3);
            if (objT != coroutine_suspended) {
                aCVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aCVar2 = (aC) cn3.f66662n;
            ResultKt.throwOnFailure(objT);
            x0X.n nVar = (x0X.n) objT;
            z2 = nVar instanceof n.C1266n;
            if (!z2) {
                if (!(nVar instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                aCVar2.bzg((fE.Pl) ((n.w6) nVar).n());
            }
            if (!z2) {
                aCVar2.rV9((YV.CN3) ((n.C1266n) nVar).n());
            } else if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        aCVar = (aC) cn3.f66662n;
        ResultKt.throwOnFailure(objT);
        if (((Boolean) objT).booleanValue()) {
            fE.qz qzVar = aCVar.fD;
            cn3.f66662n = aCVar;
            cn3.J2 = 2;
            objT = fE.qz.mUb(qzVar, null, cn3, 1, null);
            if (objT != coroutine_suspended) {
                aCVar2 = aCVar;
                x0X.n nVar2 = (x0X.n) objT;
                z2 = nVar2 instanceof n.C1266n;
                if (!z2) {
                }
                if (!z2) {
                }
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // YV.eO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object gh(String str, Continuation continuation) {
        Pl pl;
        Object next;
        if (continuation instanceof Pl) {
            pl = (Pl) continuation;
            int i2 = pl.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pl.J2 = i2 - Integer.MIN_VALUE;
            } else {
                pl = new Pl(continuation);
            }
        }
        Object objQie = pl.f66681t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = pl.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objQie);
            List listListOf = CollectionsKt.listOf(str);
            pl.f66680n = str;
            pl.J2 = 1;
            objQie = qie(listListOf, pl);
            if (objQie == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) pl.f66680n;
            ResultKt.throwOnFailure(objQie);
        }
        x0X.n nVar = (x0X.n) objQie;
        if (nVar instanceof n.C1266n) {
            return nVar;
        }
        if (!(nVar instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        List list = (List) ((Pair) ((n.w6) nVar).n()).component1();
        n.j jVar = x0X.n.f75185n;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((SubscriptionProduct) next).getProductId(), str)) {
                break;
            }
        }
        x0X.n nVarT = n.j.t(jVar, next, null, 2, null);
        if (nVarT instanceof n.C1266n) {
            return new n.C1266n(YV.CN3.f12097t.O());
        }
        if (nVarT instanceof n.w6) {
            return nVarT;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object jB(Continuation continuation) {
        ci ciVar;
        aC aCVar;
        x0X.n nVar;
        TFv.r rVar;
        ArrayList arrayList;
        aC aCVar2;
        x0X.n nVar2;
        aC aCVar3;
        fE.j jVar;
        if (continuation instanceof ci) {
            ciVar = (ci) continuation;
            int i2 = ciVar.f66728o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ciVar.f66728o = i2 - Integer.MIN_VALUE;
            } else {
                ciVar = new ci(continuation);
            }
        }
        Object objUo = ciVar.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ciVar.f66728o;
        boolean z2 = true;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            fE.w6 w6Var = this.xMQ;
            ciVar.f66727n = this;
            ciVar.f66728o = 1;
            objUo = w6Var.Uo("inapp", ciVar);
            if (objUo != coroutine_suspended) {
                aCVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar = (fE.j) ciVar.f66726O;
                aCVar3 = (aC) ciVar.f66727n;
                ResultKt.throwOnFailure(objUo);
                aCVar3.M7(YV.Ml.f12114n.Ik(jVar));
                return Unit.INSTANCE;
            }
            nVar2 = (x0X.n) ciVar.f66730t;
            aCVar2 = (aC) ciVar.f66727n;
            ResultKt.throwOnFailure(objUo);
            nVar = nVar2;
            aCVar = aCVar2;
            if (!(nVar instanceof n.C1266n)) {
                if (!(nVar instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
            fE.j jVar2 = (fE.j) ((n.C1266n) nVar).n();
            aCVar.ck.setValue(YV.Dsr.J2);
            TFv.r rVar2 = aCVar.f66654o;
            List listEmptyList = CollectionsKt.emptyList();
            ciVar.f66727n = aCVar;
            ciVar.f66730t = nVar;
            ciVar.f66726O = jVar2;
            ciVar.f66728o = 3;
            if (rVar2.rl(listEmptyList, ciVar) != coroutine_suspended) {
                aCVar3 = aCVar;
                jVar = jVar2;
                aCVar3.M7(YV.Ml.f12114n.Ik(jVar));
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        aCVar = (aC) ciVar.f66727n;
        ResultKt.throwOnFailure(objUo);
        nVar = (x0X.n) objUo;
        if (!(nVar instanceof n.C1266n)) {
            if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            List list = (List) ((n.w6) nVar).n();
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((YV.o) it.next()).nr() == YV.qz.f12153t) {
                        break;
                    }
                }
                z2 = false;
                aCVar.ck.setValue(!z2 ? YV.Dsr.f12103r : YV.Dsr.J2);
                rVar = aCVar.f66654o;
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((YV.o) obj).nr() == YV.qz.f12149O) {
                        arrayList.add(obj);
                    }
                }
                ciVar.f66727n = aCVar;
                ciVar.f66730t = nVar;
                ciVar.f66728o = 2;
                if (rVar.rl(arrayList, ciVar) != coroutine_suspended) {
                    aCVar2 = aCVar;
                    nVar2 = nVar;
                    nVar = nVar2;
                    aCVar = aCVar2;
                    if (!(nVar instanceof n.C1266n)) {
                    }
                }
            } else {
                z2 = false;
                aCVar.ck.setValue(!z2 ? YV.Dsr.f12103r : YV.Dsr.J2);
                rVar = aCVar.f66654o;
                arrayList = new ArrayList();
                while (r6.hasNext()) {
                }
                ciVar.f66727n = aCVar;
                ciVar.f66730t = nVar;
                ciVar.f66728o = 2;
                if (rVar.rl(arrayList, ciVar) != coroutine_suspended) {
                }
            }
            return Unit.INSTANCE;
        }
        if (!(nVar instanceof n.C1266n)) {
        }
        return coroutine_suspended;
    }

    @Override // YV.Wre
    public TFv.SPz n() {
        return this.f66651S;
    }

    public final fE.eO nHg() {
        return this.gh;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // YV.Wre
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object nr(boolean z2, boolean z3, boolean z4, Continuation continuation) {
        C c2;
        if (continuation instanceof C) {
            c2 = (C) continuation;
            int i2 = c2.f66659r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2.f66659r = i2 - Integer.MIN_VALUE;
            } else {
                c2 = new C(continuation);
            }
        }
        Object objXw = c2.f66657O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c2.f66659r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objXw);
            List list = this.f66655r;
            if (!z2) {
                list = null;
            }
            if (list != null) {
                return new n.w6(list);
            }
            fE.w6 w6Var = this.xMQ;
            c2.f66658n = z3;
            c2.f66660t = z4;
            c2.f66659r = 1;
            objXw = Xw(w6Var, c2);
            if (objXw == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = c2.f66660t;
            z3 = c2.f66658n;
            ResultKt.throwOnFailure(objXw);
        }
        Object c1266n = (x0X.n) objXw;
        if (c1266n instanceof n.C1266n) {
            c1266n = new n.C1266n(fE.n.n((fE.j) ((n.C1266n) c1266n).n()));
        } else if (!(c1266n instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        if (c1266n instanceof n.C1266n) {
            return c1266n;
        }
        if (!(c1266n instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        List list2 = (List) ((n.w6) c1266n).n();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            YV.o oVar = (YV.o) obj;
            if (oVar.nr() == YV.qz.f12149O || z3) {
                if (oVar.Uo() || z4) {
                    arrayList.add(obj);
                }
            }
        }
        return new n.w6(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // YV.eO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object qie(List list, Continuation continuation) {
        Xo xo;
        aC aCVar;
        x0X.n w6Var;
        List list2;
        List list3;
        x0X.n nVarRl;
        List list4;
        YV.CN3 cn3;
        aC aCVar2;
        boolean z2;
        Object next;
        List list5 = list;
        if (continuation instanceof Xo) {
            xo = (Xo) continuation;
            int i2 = xo.f66705o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xo.f66705o = i2 - Integer.MIN_VALUE;
            } else {
                xo = new Xo(continuation);
            }
        }
        Object objE = xo.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = xo.f66705o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objE);
            xo.f66704n = this;
            xo.f66707t = list5;
            xo.f66705o = 1;
            objE = e(list5, xo);
            if (objE != coroutine_suspended) {
                aCVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            list5 = (List) xo.f66707t;
            aC aCVar3 = (aC) xo.f66704n;
            ResultKt.throwOnFailure(objE);
            aCVar = aCVar3;
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cn3 = (YV.CN3) xo.f66703O;
                list4 = (List) xo.f66707t;
                aCVar2 = (aC) xo.f66704n;
                ResultKt.throwOnFailure(objE);
                nVarRl = fE.C.rl(new n.w6(objE), cn3);
                aCVar = aCVar2;
                list5 = list4;
                if (!(nVarRl instanceof n.C1266n)) {
                    if (!(nVarRl instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Pair pair = (Pair) ((n.w6) nVarRl).n();
                    List<SubscriptionProduct> list6 = (List) pair.component1();
                    List mutableList = CollectionsKt.toMutableList((Collection) pair.component2());
                    ArrayList arrayList = new ArrayList();
                    for (SubscriptionProduct subscriptionProduct : list6) {
                        Iterator<T> it = subscriptionProduct.getBasePlans().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (((BasePlan) next).isAutoRenewing()) {
                                break;
                            }
                        }
                        BasePlan basePlan = (BasePlan) next;
                        SubscriptionProduct subscriptionProductCopy$default = basePlan != null ? SubscriptionProduct.copy$default(subscriptionProduct, null, null, null, null, CollectionsKt.listOf(basePlan), 15, null) : null;
                        if (subscriptionProductCopy$default == null) {
                            mutableList.add(subscriptionProduct.getProductId());
                        }
                        if (subscriptionProductCopy$default != null) {
                            arrayList.add(subscriptionProductCopy$default);
                        }
                    }
                    nVarRl = fE.C.rl(new n.w6(TuplesKt.to(arrayList, mutableList)), YV.CN3.f12097t.n());
                }
                z2 = nVarRl instanceof n.C1266n;
                if (!z2) {
                    if (!(nVarRl instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List list7 = (List) ((Pair) ((n.w6) nVarRl).n()).component2();
                    if (!list7.isEmpty()) {
                        aCVar.M7(YV.Ml.nr(YV.Ml.f12114n, list7, null, 2, null));
                    }
                }
                if (z2) {
                    aCVar.M7(YV.Ml.f12114n.t(list5, (YV.CN3) ((n.C1266n) nVarRl).n()));
                    return nVarRl;
                }
                if (nVarRl instanceof n.w6) {
                    return nVarRl;
                }
                throw new NoWhenBranchMatchedException();
            }
            list3 = (List) xo.f66703O;
            list2 = (List) xo.f66707t;
            aCVar = (aC) xo.f66704n;
            ResultKt.throwOnFailure(objE);
            Pair pair2 = (Pair) objE;
            w6Var = new n.w6(TuplesKt.to(CollectionsKt.plus((Collection) list3, (Iterable) pair2.component1()), (List) pair2.component2()));
            list5 = list2;
            nVarRl = fE.C.rl(w6Var, YV.CN3.f12097t.n());
            if (nVarRl instanceof n.C1266n) {
                YV.CN3 cn32 = (YV.CN3) ((n.C1266n) nVarRl).n();
                xo.f66704n = aCVar;
                xo.f66707t = list5;
                xo.f66703O = cn32;
                xo.f66705o = 3;
                Object objE2 = aCVar.E2(list5, xo);
                if (objE2 != coroutine_suspended) {
                    list4 = list5;
                    cn3 = cn32;
                    objE = objE2;
                    aCVar2 = aCVar;
                    nVarRl = fE.C.rl(new n.w6(objE), cn3);
                    aCVar = aCVar2;
                    list5 = list4;
                    if (!(nVarRl instanceof n.C1266n)) {
                    }
                    z2 = nVarRl instanceof n.C1266n;
                    if (!z2) {
                    }
                    if (z2) {
                    }
                }
                return coroutine_suspended;
            }
            if (!(nVarRl instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(nVarRl instanceof n.C1266n)) {
            }
            z2 = nVarRl instanceof n.C1266n;
            if (!z2) {
            }
            if (z2) {
            }
        }
        w6Var = (x0X.n) objE;
        if (w6Var instanceof n.C1266n) {
            nVarRl = fE.C.rl(w6Var, YV.CN3.f12097t.n());
            if (nVarRl instanceof n.C1266n) {
            }
        } else {
            if (!(w6Var instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            Pair pair3 = (Pair) ((n.w6) w6Var).n();
            List list8 = (List) pair3.component1();
            List list9 = (List) pair3.component2();
            xo.f66704n = aCVar;
            xo.f66707t = list5;
            xo.f66703O = list8;
            xo.f66705o = 2;
            objE = aCVar.E2(list9, xo);
            if (objE != coroutine_suspended) {
                list2 = list5;
                list3 = list8;
                Pair pair22 = (Pair) objE;
                w6Var = new n.w6(TuplesKt.to(CollectionsKt.plus((Collection) list3, (Iterable) pair22.component1()), (List) pair22.component2()));
                list5 = list2;
                nVarRl = fE.C.rl(w6Var, YV.CN3.f12097t.n());
                if (nVarRl instanceof n.C1266n) {
                }
            }
        }
        return coroutine_suspended;
    }

    @Override // YV.aC
    public TFv.Wre rl() {
        return this.f66652Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s7N(YV.o oVar, Continuation continuation) {
        eO eOVar;
        aC aCVar;
        if (continuation instanceof eO) {
            eOVar = (eO) continuation;
            int i2 = eOVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eOVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                eOVar = new eO(continuation);
            }
        }
        Object objJ2 = eOVar.f66733t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = eOVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objJ2);
            fE.qz qzVar = this.fD;
            eOVar.f66732n = this;
            eOVar.J2 = 1;
            objJ2 = qzVar.J2(oVar, eOVar);
            if (objJ2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            aCVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aCVar = (aC) eOVar.f66732n;
            ResultKt.throwOnFailure(objJ2);
        }
        x0X.n nVar = (x0X.n) objJ2;
        boolean z2 = nVar instanceof n.C1266n;
        if (!z2) {
            if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            aCVar.bzg((fE.Pl) ((n.w6) nVar).n());
        }
        if (z2) {
            aCVar.rV9((YV.CN3) ((n.C1266n) nVar).n());
            return nVar;
        }
        if (nVar instanceof n.w6) {
            return nVar;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // YV.Wre
    public rv6 ty() {
        return this.ck;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [fE.aC] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [fE.aC, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // YV.aC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object xMQ(Activity activity, String str, YV.z zVar, Continuation continuation) {
        s4 s4Var;
        pq.Ml ml;
        GJW.r rVar;
        String str2;
        aC aCVar;
        Activity activity2;
        Boolean boolT;
        String str3;
        YV.z zVar2;
        GJW.r rVar2;
        YV.z zVar3;
        ?? r42;
        x0X.n nVar;
        ?? Rl;
        boolean z2;
        pq.Ml ml2;
        Object obj;
        ?? r3;
        Boolean boolT2;
        x0X.n nVar2;
        YV.z zVar4 = zVar;
        if (continuation instanceof s4) {
            s4Var = (s4) continuation;
            int i2 = s4Var.f66779Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s4Var.f66779Z = i2 - Integer.MIN_VALUE;
            } else {
                s4Var = new s4(continuation);
            }
        }
        s4 s4Var2 = s4Var;
        Object objAwait = s4Var2.f66782r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = s4Var2.f66779Z;
        boolean zBooleanValue = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objAwait);
            ON.j jVar = this.iF;
            String strRl = zVar4 != null ? zVar4.rl() : null;
            String str4 = strRl == null ? "" : strRl;
            boolean zBooleanValue2 = (zVar4 == null || (boolT = zVar4.t()) == null) ? false : boolT.booleanValue();
            if (zVar4 == null || (ml = zVar4.n()) == null) {
                ml = new pq.Ml();
            }
            pq.Ml ml3 = ml;
            s4Var2.f66780n = this;
            s4Var2.f66783t = activity;
            s4Var2.f66778O = str;
            s4Var2.J2 = zVar4;
            s4Var2.f66779Z = 1;
            rVar = null;
            if (jVar.Uo(str, str4, zBooleanValue2, ml3, s4Var2) != coroutine_suspended) {
                str2 = str;
                aCVar = this;
                activity2 = activity;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                rVar2 = (GJW.r) s4Var2.J2;
                zVar2 = (YV.z) s4Var2.f66778O;
                str3 = (String) s4Var2.f66783t;
                aCVar = (aC) s4Var2.f66780n;
                ResultKt.throwOnFailure(objAwait);
                rVar = null;
                s4Var2.f66780n = aCVar;
                s4Var2.f66783t = str3;
                s4Var2.f66778O = zVar2;
                s4Var2.J2 = rVar;
                s4Var2.f66779Z = 3;
                objAwait = rVar2.await(s4Var2);
                if (objAwait != coroutine_suspended) {
                    zVar3 = zVar2;
                    r42 = aCVar;
                    nVar = (x0X.n) objAwait;
                    if (zVar3 == null) {
                    }
                    if (Rl == 0) {
                    }
                    if (zVar3 != null) {
                        zBooleanValue = boolT2.booleanValue();
                    }
                    z2 = zBooleanValue;
                    if (zVar3 != null) {
                    }
                    ml2 = new pq.Ml();
                    s4Var2.f66780n = r42;
                    s4Var2.f66783t = objAwait;
                    s4Var2.f66778O = rVar;
                    s4Var2.f66779Z = 4;
                    if (r42.p5(nVar, str3, Rl, z2, ml2, s4Var2) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i3 != 3) {
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = s4Var2.f66783t;
                aC aCVar2 = (aC) s4Var2.f66780n;
                ResultKt.throwOnFailure(objAwait);
                rVar = null;
                r3 = aCVar2;
                r3.te = rVar;
                nVar2 = (x0X.n) obj;
                if (!(nVar2 instanceof n.C1266n)) {
                    return nVar2;
                }
                if (nVar2 instanceof n.w6) {
                    return new n.w6(fE.Xo.n((fE.Pl) ((n.w6) nVar2).n()));
                }
                throw new NoWhenBranchMatchedException();
            }
            zVar3 = (YV.z) s4Var2.f66778O;
            String str5 = (String) s4Var2.f66783t;
            aC aCVar3 = (aC) s4Var2.f66780n;
            ResultKt.throwOnFailure(objAwait);
            str3 = str5;
            r42 = aCVar3;
            rVar = null;
            nVar = (x0X.n) objAwait;
            Rl = zVar3 == null ? zVar3.rl() : rVar;
            if (Rl == 0) {
                Rl = "";
            }
            if (zVar3 != null && (boolT2 = zVar3.t()) != null) {
                zBooleanValue = boolT2.booleanValue();
            }
            z2 = zBooleanValue;
            if (zVar3 != null || (ml2 = zVar3.n()) == null) {
                ml2 = new pq.Ml();
            }
            s4Var2.f66780n = r42;
            s4Var2.f66783t = objAwait;
            s4Var2.f66778O = rVar;
            s4Var2.f66779Z = 4;
            if (r42.p5(nVar, str3, Rl, z2, ml2, s4Var2) != coroutine_suspended) {
                obj = objAwait;
                r3 = r42;
                r3.te = rVar;
                nVar2 = (x0X.n) obj;
                if (!(nVar2 instanceof n.C1266n)) {
                }
            }
            return coroutine_suspended;
        }
        zVar4 = (YV.z) s4Var2.J2;
        str2 = (String) s4Var2.f66778O;
        Activity activity3 = (Activity) s4Var2.f66783t;
        aCVar = (aC) s4Var2.f66780n;
        ResultKt.throwOnFailure(objAwait);
        activity2 = activity3;
        rVar = null;
        aCVar.ck.setValue(YV.Dsr.J2);
        GJW.r rVarT = GJW.ci.t(rVar, 1, rVar);
        aCVar.te = rVarT;
        rB.Ml ml4 = aCVar.ty;
        ajd.j jVarXMQ = YV.Ml.f12114n.xMQ(str2);
        UGc uGc = aCVar.new UGc(activity2, str2, rVarT, null);
        s4Var2.f66780n = aCVar;
        s4Var2.f66783t = str2;
        s4Var2.f66778O = zVar4;
        s4Var2.J2 = rVarT;
        s4Var2.f66779Z = 2;
        if (my.Ml.t(ml4, jVarXMQ, uGc, s4Var2) != coroutine_suspended) {
            str3 = str2;
            zVar2 = zVar4;
            rVar2 = rVarT;
            s4Var2.f66780n = aCVar;
            s4Var2.f66783t = str3;
            s4Var2.f66778O = zVar2;
            s4Var2.J2 = rVar;
            s4Var2.f66779Z = 3;
            objAwait = rVar2.await(s4Var2);
            if (objAwait != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    @Override // YV.Wre
    public void ck(Boolean bool) {
        n().setValue(bool);
    }

    @Override // YV.Wre
    public Object t(Continuation continuation) {
        return TFv.fuX.ViF(KN(), continuation);
    }
}
