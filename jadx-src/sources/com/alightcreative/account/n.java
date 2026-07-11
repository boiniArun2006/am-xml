package com.alightcreative.account;

import GJW.DC;
import GJW.OU;
import GJW.vd;
import GJW.xuv;
import GJW.yg;
import HI0.Lu;
import QmE.iF;
import QmE.j;
import TFv.rv6;
import YV.Wre;
import Zzk.j;
import android.app.Activity;
import android.content.Context;
import com.alightcreative.account.IAPMiddleware;
import com.alightcreative.account.PurchasePeriod;
import com.alightcreative.account.n;
import com.alightcreative.account.qz;
import com.bendingspoons.monopoly.Period;
import com.bendingspoons.monopoly.PeriodTimeUnit;
import com.bendingspoons.monopoly.product.BasePlan;
import com.bendingspoons.monopoly.product.Offer;
import com.bendingspoons.monopoly.product.PricingPhase;
import com.bendingspoons.monopoly.product.SubscriptionProduct;
import com.google.firebase.Timestamp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kgE.K;
import kgE.Zs;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wQ.z;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class n implements kgE.fuX {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private xuv f44141E;
    private kgE.Wre E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private boolean f44142FX;
    private final TFv.SPz HI;
    private final TFv.SPz Ik;
    private final Zzk.j J2;
    private final iF KN;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f44143M;
    private com.google.firebase.firestore.s4 M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private List f44144N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final rO.n f44145O;
    private boolean P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final vd f44146S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final Set f44147T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private List f44148U;
    private final nYs.Ml Uo;
    private final rv6 ViF;
    private boolean WPU;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final Map f44149X;
    private String XQ;
    private boolean Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f44150Z;
    private final TFv.SPz aYN;
    private final TFv.SPz az;
    private boolean bzg;
    private final rv6 ck;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f44151e;
    private boolean eF;
    private String fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f44152g;
    private final TFv.SPz gh;
    private List iF;
    private boolean jB;
    private final rv6 mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final IAPMiddleware f44153n;
    private final Set nHg;
    private final Map nY;
    private final cd.g9s nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f44154o;
    private com.google.firebase.firestore.s4 p5;
    private final rv6 qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final rv6 f44155r;
    private GJW.r rV9;
    private final sqD.n rl;
    private boolean s7N;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final YV.Wre f44156t;
    private int te;
    private final rv6 ty;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f44157v;
    private Map wTp;
    private final TFv.SPz xMQ;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final j f44138B = new j(null);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f44140J = 8;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final long f44139D = 3600000;

    static final class C extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f44158O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        /* synthetic */ Object f44160Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f44161g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44162n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f44163o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f44164r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f44165t;

        C(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44160Z = obj;
            this.f44161g |= Integer.MIN_VALUE;
            return n.this.uG(this);
        }
    }

    static final class DAz extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f44168O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        /* synthetic */ Object f44170Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f44171g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44172n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f44173o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f44174r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f44175t;

        DAz(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44170Z = obj;
            this.f44171g |= Integer.MIN_VALUE;
            return n.this.EN(null, this);
        }
    }

    static final class Ew extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44180n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f44181t;

        Ew(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44181t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return n.this.waP(this);
        }
    }

    public /* synthetic */ class I28 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[IAPMiddleware.n.values().length];
            try {
                iArr[IAPMiddleware.n.f44132n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IAPMiddleware.n.f44135t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IAPMiddleware.n.J2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IAPMiddleware.n.f44133o.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IAPMiddleware.n.f44129O.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IAPMiddleware.n.f44134r.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PeriodTimeUnit.values().length];
            try {
                iArr2[PeriodTimeUnit.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PeriodTimeUnit.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PeriodTimeUnit.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[PeriodTimeUnit.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class Ml {
        private static final Ml KN;
        private static final Ml gh;
        private static final Ml mUb;
        private static final Ml qie;
        private static final Ml xMQ;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private List f44182O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f44183n;
        private w6 nr;
        private final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f44184t;
        public static final j J2 = new j(null);
        private static final List Uo = new ArrayList();

        public static final class j {
            public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private j() {
            }

            public final List J2(boolean z2) {
                if (z2) {
                    return Ml.Uo;
                }
                List list = Ml.Uo;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((Ml) obj).az()) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }

            public final Ml O() {
                return Ml.gh;
            }

            public final Ml n() {
                return Ml.qie;
            }

            public final Ml nr() {
                return Ml.KN;
            }

            public final Ml rl() {
                return Ml.xMQ;
            }

            public final Ml t() {
                return Ml.mUb;
            }
        }

        private Ml(String str, boolean z2, w6 w6Var) {
            this.f44183n = str;
            this.rl = z2;
            this.nr = w6Var;
            Uo.add(this);
        }

        static {
            w6 w6Var = w6.f44296t;
            KN = new Ml("GetSkuList", false, w6Var, 2, null);
            xMQ = new Ml("GetAccountDocument", false, null, 4, null);
            mUb = new Ml("GetCloudConfig", false, null, 6, null);
            int i2 = 2;
            DefaultConstructorMarker defaultConstructorMarker = null;
            gh = new Ml("VerifyPurchases", false, w6Var, i2, defaultConstructorMarker);
            qie = new Ml("FetchAvailablePurchase", false, w6Var, i2, defaultConstructorMarker);
        }

        public static /* synthetic */ void KN(Ml ml, Throwable th, boolean z2, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                z2 = false;
            }
            ml.Uo(th, z2);
        }

        public static /* synthetic */ void mUb(Ml ml, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            ml.xMQ(z2);
        }

        public final int HI() {
            return this.f44184t;
        }

        public final void Ik(int i2) {
            this.f44184t = i2;
        }

        public final void Uo(Throwable error, boolean z2) {
            Intrinsics.checkNotNullParameter(error, "error");
            if (!z2) {
                this.f44184t = 0;
            }
            this.nr = w6.f44293O;
            this.f44182O = CollectionsKt.listOf(error);
        }

        public final boolean az() {
            return this.rl;
        }

        public final String ck() {
            return this.f44183n;
        }

        public final List gh() {
            List list = this.f44182O;
            if (this.nr != w6.f44293O) {
                list = null;
            }
            return list == null ? CollectionsKt.emptyList() : list;
        }

        public final w6 qie() {
            return this.nr;
        }

        public final boolean ty() {
            return this.f44184t > 0;
        }

        public final void xMQ(boolean z2) {
            if (!z2) {
                this.f44184t = 0;
            }
            this.nr = w6.f44296t;
            this.f44182O = null;
        }

        /* synthetic */ Ml(String str, boolean z2, w6 w6Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? w6.f44294n : w6Var);
        }
    }

    public static final class Pl extends SuspendLambda implements Function2 {
        final /* synthetic */ boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private /* synthetic */ Object f44185O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ n f44186Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44187n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ n f44188o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Ml f44189r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f44190t;

        public static final class Ml implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Ml f44191n;

            public Ml(Ml ml) {
                this.f44191n = ml;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "IAP: withIAPTaskContext(" + this.f44191n.ck() + ") OUT (instances=" + this.f44191n.HI() + ")";
            }
        }

        public static final class j implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Ml f44192n;

            public j(Ml ml) {
                this.f44192n = ml;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "IAP: withIAPTaskContext(" + this.f44192n.ck() + ") IN (instances=" + this.f44192n.HI() + ")";
            }
        }

        /* JADX INFO: renamed from: com.alightcreative.account.n$Pl$n, reason: collision with other inner class name */
        public static final class C0614n implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Ml f44193n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Throwable f44194t;

            public C0614n(Ml ml, Throwable th) {
                this.f44193n = ml;
                this.f44194t = th;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "IAP: withIAPTaskContext(" + this.f44193n.ck() + ") Failure: " + this.f44194t.getMessage();
            }
        }

        public static final class w6 implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Ml f44195n;

            public w6(Ml ml) {
                this.f44195n = ml;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "IAP: withIAPTaskContext(" + this.f44195n.ck() + ") Success";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pl(boolean z2, Ml ml, n nVar, Continuation continuation, n nVar2) {
            super(2, continuation);
            this.J2 = z2;
            this.f44189r = ml;
            this.f44188o = nVar;
            this.f44186Z = nVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Pl pl = new Pl(this.J2, this.f44189r, this.f44188o, continuation, this.f44186Z);
            pl.f44185O = obj;
            return pl;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Pl) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:84:0x01cb, code lost:
        
            if (r2.uG(r19) == r7) goto L85;
         */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0187  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01d5  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01da  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            vd vdVar;
            C0619n c0619n;
            boolean z2;
            C0619n c0619n2;
            Object objQie;
            List listEmptyList;
            Object objM313constructorimpl;
            Object objM313constructorimpl2;
            Throwable thM316exceptionOrNullimpl;
            boolean z3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44190t;
            String str = "";
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                vd vdVar2 = (vd) this.f44185O;
                if (this.J2) {
                    XoT.C.Uo(vdVar2, new j(this.f44189r));
                }
                Ml ml = this.f44189r;
                ml.Ik(ml.HI() + 1);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    c0619n = new C0619n(vdVar2.getCoroutineContext());
                    String uid = this.f44186Z.getUid();
                    if (uid == null) {
                        uid = "";
                    }
                    com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
                    String skuListUid = jVar.getSkuListUid();
                    long jAz = this.f44186Z.az() - jVar.getSkuListFetched();
                    XoT.C.Uo(c0619n, new eO(skuListUid, uid, jAz));
                    z2 = !StringsKt.isBlank(jVar.getSkuList()) && Intrinsics.areEqual(skuListUid, uid) && jAz < n.f44139D && jVar.getSkuListBuildVersionCode() == 1028425;
                    if (this.f44186Z.f44144N == null && z2) {
                        try {
                            Moshi moshiN = Lu.n();
                            String skuList = jVar.getSkuList();
                            JsonAdapter jsonAdapterAdapter = moshiN.adapter(CachedSkuInfo.class);
                            Intrinsics.checkNotNull(jsonAdapterAdapter);
                            CachedSkuInfo cachedSkuInfo = (CachedSkuInfo) jsonAdapterAdapter.fromJson(skuList);
                            objM313constructorimpl = Result.m313constructorimpl(cachedSkuInfo != null ? cachedSkuInfo.getSkus() : null);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
                        }
                        if (Result.m319isFailureimpl(objM313constructorimpl)) {
                            objM313constructorimpl = null;
                        }
                        List list = (List) objM313constructorimpl;
                        if (list != null) {
                            this.f44186Z.f44144N = list;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    vdVar = vdVar2;
                    Result.Companion companion3 = Result.INSTANCE;
                    objM313constructorimpl2 = Result.m313constructorimpl(ResultKt.createFailure(th));
                }
                if (!z2) {
                    XoT.C.Uo(c0619n, C1688z.f44297n);
                    IAPMiddleware iAPMiddleware = this.f44186Z.f44153n;
                    this.f44185O = vdVar2;
                    this.f44187n = c0619n;
                    this.f44190t = 1;
                    c0619n2 = c0619n;
                    objQie = IAPMiddleware.qie(iAPMiddleware, 0, false, null, this, 7, null);
                    if (objQie != coroutine_suspended) {
                        vdVar = vdVar2;
                    }
                    return coroutine_suspended;
                }
                listEmptyList = this.f44186Z.f44144N;
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                vdVar = vdVar2;
                objM313constructorimpl2 = Result.m313constructorimpl(listEmptyList);
                boolean z4 = this.J2;
                Ml ml2 = this.f44189r;
                thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl2);
                if (thM316exceptionOrNullimpl != null) {
                    if (z4) {
                        XoT.C.Uo(vdVar, new C0614n(ml2, thM316exceptionOrNullimpl));
                    }
                    if (!(thM316exceptionOrNullimpl instanceof CancellationException)) {
                        ml2.Uo(thM316exceptionOrNullimpl, true);
                        z3 = true;
                    }
                    boolean z5 = this.J2;
                    Ml ml3 = this.f44189r;
                    if (Result.m320isSuccessimpl(objM313constructorimpl2)) {
                        if (z5) {
                            XoT.C.Uo(vdVar, new w6(ml3));
                        }
                        ml3.xMQ(true);
                        z3 = true;
                    }
                    Ml ml4 = this.f44189r;
                    ml4.Ik(ml4.HI() - 1);
                    if (z3) {
                        n nVar = this.f44188o;
                        this.f44185O = vdVar;
                        this.f44187n = objM313constructorimpl2;
                        this.f44190t = 2;
                    }
                    if (Result.m319isFailureimpl(objM313constructorimpl2)) {
                    }
                    if (this.J2) {
                    }
                    return obj;
                }
                z3 = false;
                boolean z52 = this.J2;
                Ml ml32 = this.f44189r;
                if (Result.m320isSuccessimpl(objM313constructorimpl2)) {
                }
                Ml ml42 = this.f44189r;
                ml42.Ik(ml42.HI() - 1);
                if (z3) {
                }
                if (Result.m319isFailureimpl(objM313constructorimpl2)) {
                }
                if (this.J2) {
                }
                return obj;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objM313constructorimpl2 = this.f44187n;
                vdVar = (vd) this.f44185O;
                ResultKt.throwOnFailure(obj);
                Object obj2 = Result.m319isFailureimpl(objM313constructorimpl2) ? null : objM313constructorimpl2;
                if (this.J2) {
                    XoT.C.Uo(vdVar, new Ml(this.f44189r));
                }
                return obj2;
            }
            C0619n c0619n3 = (C0619n) this.f44187n;
            vdVar = (vd) this.f44185O;
            try {
                ResultKt.throwOnFailure(obj);
                c0619n2 = c0619n3;
                objQie = obj;
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion32 = Result.INSTANCE;
                objM313constructorimpl2 = Result.m313constructorimpl(ResultKt.createFailure(th));
            }
            listEmptyList = (List) objQie;
            XoT.C.Uo(c0619n2, QJ.f44198n);
            this.f44186Z.f44144N = listEmptyList;
            Moshi moshiN2 = Lu.n();
            CachedSkuInfo cachedSkuInfo2 = new CachedSkuInfo(listEmptyList);
            JsonAdapter jsonAdapterAdapter2 = moshiN2.adapter(CachedSkuInfo.class);
            Intrinsics.checkNotNull(jsonAdapterAdapter2);
            String json = jsonAdapterAdapter2.toJson(cachedSkuInfo2);
            Intrinsics.checkNotNull(json);
            com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
            jVar2.setSkuList(json);
            jVar2.setSkuListFetched(this.f44186Z.az());
            String uid2 = this.f44186Z.getUid();
            if (uid2 != null) {
                str = uid2;
            }
            jVar2.setSkuListUid(str);
            jVar2.setSkuListBuildVersionCode(1028425);
            objM313constructorimpl2 = Result.m313constructorimpl(listEmptyList);
            boolean z42 = this.J2;
            Ml ml22 = this.f44189r;
            thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl2);
            if (thM316exceptionOrNullimpl != null) {
            }
            z3 = false;
            boolean z522 = this.J2;
            Ml ml322 = this.f44189r;
            if (Result.m320isSuccessimpl(objM313constructorimpl2)) {
            }
            Ml ml422 = this.f44189r;
            ml422.Ik(ml422.HI() - 1);
            if (z3) {
            }
            if (Result.m319isFailureimpl(objM313constructorimpl2)) {
            }
            if (this.J2) {
            }
            return obj2;
        }
    }

    static final class QJ implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final QJ f44198n = new QJ();

        QJ() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "IAP: getBackendSkuInfos: GOT RESULT";
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {
        final /* synthetic */ n J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.firestore.fuX f44204O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44205n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Ml f44206o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f44207r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f44208t;

        public /* synthetic */ class j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[IAPMiddleware.n.values().length];
                try {
                    iArr[IAPMiddleware.n.f44132n.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IAPMiddleware.n.f44135t.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[IAPMiddleware.n.f44129O.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[IAPMiddleware.n.J2.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[IAPMiddleware.n.f44134r.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[IAPMiddleware.n.f44133o.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(com.google.firebase.firestore.fuX fux, n nVar, String str, Ml ml, Continuation continuation) {
            super(2, continuation);
            this.f44204O = fux;
            this.J2 = nVar;
            this.f44207r = str;
            this.f44206o = ml;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Wre wre = new Wre(this.f44204O, this.J2, this.f44207r, this.f44206o, continuation);
            wre.f44208t = obj;
            return wre;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String mUb(AccountDoc accountDoc) {
            return "IAP: accountDocumentChanged: VALID; accountDoc=" + accountDoc;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String qie() {
            return "IAP: accountDocumentChanged: INVALID; but alrady tried to update";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String gh(com.google.firebase.firestore.fuX fux) {
            return "IAP: accountDocumentChanged: INVALID; trying to update. Exists=" + fux.t();
        }

        /* JADX WARN: Code restructure failed: missing block: B:88:0x01b0, code lost:
        
            if (r13.uG(r12) == r1) goto L89;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws JSONException {
            Wre wre;
            IAPMiddleware iAPMiddleware;
            Long l2;
            long jLongValue;
            CreatorProgram creatorProgram;
            RankingProgram creatorRankingProgram;
            Throwable th;
            Object objM313constructorimpl;
            neA.j jVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44205n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    wre = this;
                } catch (Throwable th2) {
                    th = th2;
                    wre = this;
                    Result.Companion companion = Result.INSTANCE;
                    objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
                }
            } else {
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f44208t;
                if (this.f44204O.t() && this.f44204O.rl("documentFormatVersion")) {
                    Object objUo = this.f44204O.Uo("documentFormatVersion");
                    FX.n nVarN = null;
                    if (objUo instanceof Long) {
                        l2 = (Long) objUo;
                    } else {
                        l2 = null;
                    }
                    long jN = 0;
                    if (l2 != null) {
                        jLongValue = l2.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    if (((int) jLongValue) >= 1) {
                        final AccountDoc accountDoc = (AccountDoc) this.f44204O.qie(AccountDoc.class);
                        XoT.C.Uo(vdVar, new Function0() { // from class: com.alightcreative.account.w6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return n.Wre.mUb(accountDoc);
                            }
                        });
                        if (accountDoc != null) {
                            com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
                            Timestamp accountCreated = accountDoc.getAccountCreated();
                            if (accountCreated != null) {
                                jN = z.n(accountCreated);
                            }
                            jVar2.setAccountCreated(jN);
                            List<BackendLicenseInfo> licenses = accountDoc.getLicenses();
                            ArrayList arrayList = new ArrayList();
                            Iterator<T> it = licenses.iterator();
                            while (it.hasNext()) {
                                LicenseInfo licenseInfoT = com.alightcreative.account.C.t((BackendLicenseInfo) it.next());
                                if (licenseInfoT != null) {
                                    arrayList.add(licenseInfoT);
                                }
                            }
                            n nVar = this.J2;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : arrayList) {
                                if (!n.f44138B.nr((LicenseInfo) obj2, nVar)) {
                                    arrayList2.add(obj2);
                                }
                            }
                            this.J2.uQ(arrayList2, this.f44207r);
                            n nVar2 = this.J2;
                            nVar2.rxp(nVar2.rl, true);
                            TFv.SPz sPz = this.J2.xMQ;
                            Campaigns campaigns = accountDoc.getCampaigns();
                            if (campaigns != null) {
                                creatorProgram = campaigns.getCreatorProgram();
                            } else {
                                creatorProgram = null;
                            }
                            sPz.t(creatorProgram);
                            TFv.SPz sPz2 = this.J2.gh;
                            Campaigns campaigns2 = accountDoc.getCampaigns();
                            if (campaigns2 != null && (creatorRankingProgram = campaigns2.getCreatorRankingProgram()) != null) {
                                nVarN = FX.w6.n(creatorRankingProgram);
                            }
                            sPz2.t(nVarN);
                            this.J2.az.t(accountDoc.getCloud());
                        }
                        wre = this;
                    }
                    n nVar3 = wre.J2;
                    wre.f44205n = 2;
                }
                if (!this.J2.eF) {
                    final com.google.firebase.firestore.fuX fux = this.f44204O;
                    XoT.C.Uo(vdVar, new Function0() { // from class: com.alightcreative.account.Ml
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return n.Wre.gh(fux);
                        }
                    });
                    this.J2.eF = true;
                    n nVar4 = this.J2;
                    try {
                        Result.Companion companion2 = Result.INSTANCE;
                        iAPMiddleware = nVar4.f44153n;
                        this.f44205n = 1;
                        wre = this;
                    } catch (Throwable th3) {
                        th = th3;
                        wre = this;
                        th = th;
                        Result.Companion companion3 = Result.INSTANCE;
                        objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
                    }
                    try {
                        obj = IAPMiddleware.Ik(iAPMiddleware, 1L, null, wre, 2, null);
                    } catch (Throwable th4) {
                        th = th4;
                        th = th;
                        Result.Companion companion32 = Result.INSTANCE;
                        objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    wre = this;
                    XoT.C.Uo(vdVar, new Function0() { // from class: com.alightcreative.account.I28
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return n.Wre.qie();
                        }
                    });
                    n nVar32 = wre.J2;
                    wre.f44205n = 2;
                }
            }
            objM313constructorimpl = Result.m313constructorimpl((IAPMiddleware.n) obj);
            Ml ml = wre.f44206o;
            Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl);
            if (thM316exceptionOrNullimpl != null) {
                ml.Uo(thM316exceptionOrNullimpl, true);
            }
            Ml ml2 = wre.f44206o;
            if (Result.m320isSuccessimpl(objM313constructorimpl)) {
                switch (j.$EnumSwitchMapping$0[((IAPMiddleware.n) objM313constructorimpl).ordinal()]) {
                    case 1:
                        break;
                    case 2:
                        jVar = neA.j.f71183D;
                        ml2.Uo(neA.n.n(jVar), true);
                        break;
                    case 3:
                        jVar = neA.j.f71188J;
                        ml2.Uo(neA.n.n(jVar), true);
                        break;
                    case 4:
                        jVar = neA.j.f71197a;
                        ml2.Uo(neA.n.n(jVar), true);
                        break;
                    case 5:
                        jVar = neA.j.f71187I;
                        ml2.Uo(neA.n.n(jVar), true);
                        break;
                    case 6:
                        jVar = neA.j.f71197a;
                        ml2.Uo(neA.n.n(jVar), true);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            Result.m312boximpl(objM313constructorimpl);
            n nVar322 = wre.J2;
            wre.f44205n = 2;
        }
    }

    static final class Xo extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f44209O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f44210n;

        Xo(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44210n = obj;
            this.f44209O |= Integer.MIN_VALUE;
            return n.this.s(this);
        }
    }

    static final class Z extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f44212O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44213n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f44214r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f44215t;

        Z(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44212O = obj;
            this.f44214r |= Integer.MIN_VALUE;
            return n.this.H(null, this);
        }
    }

    static final class aC extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f44216O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44217n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f44218o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f44220t;

        aC(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f44218o |= Integer.MIN_VALUE;
            return n.this.UF(this);
        }
    }

    static final class ci extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ n f44234O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44235n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f44236t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ci(boolean z2, n nVar, Continuation continuation) {
            super(2, continuation);
            this.f44236t = z2;
            this.f44234O = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new ci(this.f44236t, this.f44234O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((ci) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ boolean f44237O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f44238n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ n f44239t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(n nVar, boolean z2, Continuation continuation) {
                super(2, continuation);
                this.f44239t = nVar;
                this.f44237O = z2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f44239t, this.f44237O, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
            
                if (r6.lNy(r1, r5) == r0) goto L15;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0041 -> B:16:0x0044). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f44238n;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ResultKt.throwOnFailure(obj);
                            if (!this.f44239t.f44143M) {
                                this.f44239t.f44141E = null;
                                return Unit.INSTANCE;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.f44238n = 1;
                    if (yg.rl(100L, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                this.f44239t.f44143M = false;
                this.f44239t.f44142FX = false;
                n nVar = this.f44239t;
                boolean z2 = this.f44237O;
                this.f44238n = 2;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f44235n == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z2 = false;
                if (this.f44236t) {
                    this.f44234O.te = 0;
                    this.f44234O.f44152g = null;
                }
                xuv xuvVar = this.f44234O.f44141E;
                if (xuvVar != null && xuvVar.isActive()) {
                    this.f44234O.f44143M = true;
                    n nVar = this.f44234O;
                    if (nVar.f44142FX || this.f44236t) {
                        z2 = true;
                    }
                    nVar.f44142FX = z2;
                    return Unit.INSTANCE;
                }
                n nVar2 = this.f44234O;
                nVar2.f44141E = GJW.C.nr(nVar2.f44146S, null, null, new j(this.f44234O, this.f44236t, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class eO implements Function0 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ long f44240O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f44241n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f44242t;

        eO(String str, String str2, long j2) {
            this.f44241n = str;
            this.f44242t = str2;
            this.f44240O = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String str = this.f44241n;
            String str2 = this.f44242t;
            boolean zAreEqual = Intrinsics.areEqual(str, str2);
            long j2 = this.f44240O;
            return "IAP: getBackendSkuInfos() allSkusUid=" + str + " acctUid=" + str2 + " eq?=" + zAreEqual + " elapsedSinceLastCall=" + j2 + " cacheValid=" + (j2 < n.f44139D);
        }
    }

    static final class fuX extends SuspendLambda implements Function2 {
        final /* synthetic */ IAPItemType J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ List f44243O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44244n;

        /* JADX INFO: renamed from: com.alightcreative.account.n$fuX$n, reason: collision with other inner class name */
        public static final class C0618n extends SuspendLambda implements Function2 {
            final /* synthetic */ n J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Iterable f44259O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f44260n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ IAPItemType f44261r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f44262t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0618n(Iterable iterable, Continuation continuation, n nVar, IAPItemType iAPItemType) {
                super(2, continuation);
                this.f44259O = iterable;
                this.J2 = nVar;
                this.f44261r = iAPItemType;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0618n c0618n = new C0618n(this.f44259O, continuation, this.J2, this.f44261r);
                c0618n.f44262t = obj;
                return c0618n;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C0618n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.alightcreative.account.n$fuX$n$j */
            public static final class j extends SuspendLambda implements Function2 {
                final /* synthetic */ n J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Object f44263O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f44264n;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ IAPItemType f44265r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private /* synthetic */ Object f44266t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public j(Object obj, Continuation continuation, n nVar, IAPItemType iAPItemType) {
                    super(2, continuation);
                    this.f44263O = obj;
                    this.J2 = nVar;
                    this.f44265r = iAPItemType;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    j jVar = new j(this.f44263O, continuation, this.J2, this.f44265r);
                    jVar.f44266t = obj;
                    return jVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(vd vdVar, Continuation continuation) {
                    return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f44264n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        String str = (String) this.f44263O;
                        this.J2.f44147T.add(str);
                        n nVar = this.J2;
                        IAPItemType iAPItemType = this.f44265r;
                        this.f44264n = 1;
                        if (nVar.vl(str, iAPItemType, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f44260n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f44262t;
                Iterable iterable = this.f44259O;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(GJW.C.rl(vdVar, null, null, new j(it.next(), null, this.J2, this.f44261r), 3, null));
                }
                this.f44260n = 1;
                Object objN = GJW.Wre.n(arrayList, this);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objN;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        fuX(List list, IAPItemType iAPItemType, Continuation continuation) {
            super(2, continuation);
            this.f44243O = list;
            this.J2 = iAPItemType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return n.this.new fuX(this.f44243O, this.J2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((fuX) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ boolean J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private /* synthetic */ Object f44246O;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            final /* synthetic */ n f44247S;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ List f44248Z;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ IAPItemType f44249g;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f44250n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ n f44251o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Ml f44252r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f44253t;

            public static final class Ml implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Ml f44254n;

                public Ml(Ml ml) {
                    this.f44254n = ml;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "IAP: withIAPTaskContext(" + this.f44254n.ck() + ") OUT (instances=" + this.f44254n.HI() + ")";
                }
            }

            /* JADX INFO: renamed from: com.alightcreative.account.n$fuX$j$j, reason: collision with other inner class name */
            public static final class C0616j implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Ml f44255n;

                public C0616j(Ml ml) {
                    this.f44255n = ml;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "IAP: withIAPTaskContext(" + this.f44255n.ck() + ") IN (instances=" + this.f44255n.HI() + ")";
                }
            }

            /* JADX INFO: renamed from: com.alightcreative.account.n$fuX$j$n, reason: collision with other inner class name */
            public static final class C0617n implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Ml f44256n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Throwable f44257t;

                public C0617n(Ml ml, Throwable th) {
                    this.f44256n = ml;
                    this.f44257t = th;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "IAP: withIAPTaskContext(" + this.f44256n.ck() + ") Failure: " + this.f44257t.getMessage();
                }
            }

            public static final class w6 implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Ml f44258n;

                public w6(Ml ml) {
                    this.f44258n = ml;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "IAP: withIAPTaskContext(" + this.f44258n.ck() + ") Success";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(boolean z2, Ml ml, n nVar, Continuation continuation, List list, n nVar2, IAPItemType iAPItemType) {
                super(2, continuation);
                this.J2 = z2;
                this.f44252r = ml;
                this.f44251o = nVar;
                this.f44248Z = list;
                this.f44247S = nVar2;
                this.f44249g = iAPItemType;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.J2, this.f44252r, this.f44251o, continuation, this.f44248Z, this.f44247S, this.f44249g);
                jVar.f44246O = obj;
                return jVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
            /* JADX WARN: Type inference failed for: r1v1 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objM313constructorimpl;
                Object obj2;
                Object obj3;
                Object obj4;
                Object obj5;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f44253t;
                Object obj6 = null;
                try {
                } catch (Throwable th) {
                    Result.Companion companion = Result.INSTANCE;
                    objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
                    obj2 = i2;
                }
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            obj3 = this.f44250n;
                            Object obj7 = (vd) this.f44246O;
                            ResultKt.throwOnFailure(obj);
                            obj5 = obj7;
                            objM313constructorimpl = obj3;
                            obj4 = obj5;
                            if (!Result.m319isFailureimpl(objM313constructorimpl)) {
                                obj6 = objM313constructorimpl;
                            }
                            if (this.J2) {
                                XoT.C.Uo(obj4, new Ml(this.f44252r));
                            }
                            return obj6;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vd vdVar = (vd) this.f44246O;
                    ResultKt.throwOnFailure(obj);
                    i2 = vdVar;
                } else {
                    ResultKt.throwOnFailure(obj);
                    vd vdVar2 = (vd) this.f44246O;
                    if (this.J2) {
                        XoT.C.Uo(vdVar2, new C0616j(this.f44252r));
                    }
                    Ml ml = this.f44252r;
                    ml.Ik(ml.HI() + 1);
                    Result.Companion companion2 = Result.INSTANCE;
                    new C0619n(vdVar2.getCoroutineContext());
                    C0618n c0618n = new C0618n(this.f44248Z, null, this.f44247S, this.f44249g);
                    this.f44246O = vdVar2;
                    this.f44253t = 1;
                    obj = GJW.Lu.J2(c0618n, this);
                    i2 = vdVar2;
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                objM313constructorimpl = Result.m313constructorimpl(obj);
                obj2 = i2;
                boolean z2 = this.J2;
                Ml ml2 = this.f44252r;
                Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl);
                boolean z3 = false;
                if (thM316exceptionOrNullimpl != null) {
                    if (z2) {
                        XoT.C.Uo(obj2, new C0617n(ml2, thM316exceptionOrNullimpl));
                    }
                    if (!(thM316exceptionOrNullimpl instanceof CancellationException)) {
                        ml2.Uo(thM316exceptionOrNullimpl, true);
                        z3 = true;
                    }
                }
                boolean z4 = this.J2;
                Ml ml3 = this.f44252r;
                if (Result.m320isSuccessimpl(objM313constructorimpl)) {
                    if (z4) {
                        XoT.C.Uo(obj2, new w6(ml3));
                    }
                    ml3.xMQ(true);
                    z3 = true;
                }
                Ml ml4 = this.f44252r;
                ml4.Ik(ml4.HI() - 1);
                obj4 = obj2;
                if (z3) {
                    n nVar = this.f44251o;
                    this.f44246O = obj2;
                    this.f44250n = objM313constructorimpl;
                    this.f44253t = 2;
                    if (nVar.uG(this) != coroutine_suspended) {
                        obj3 = objM313constructorimpl;
                        obj5 = obj2;
                        objM313constructorimpl = obj3;
                        obj4 = obj5;
                    }
                    return coroutine_suspended;
                }
                if (!Result.m319isFailureimpl(objM313constructorimpl)) {
                }
                if (this.J2) {
                }
                return obj6;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44244n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                n nVar = n.this;
                Ml mlN = Ml.J2.n();
                List list = this.f44243O;
                n nVar2 = n.this;
                IAPItemType iAPItemType = this.J2;
                DC dcT = OU.t();
                j jVar = new j(true, mlN, nVar, null, list, nVar2, iAPItemType);
                this.f44244n = 1;
                if (GJW.Dsr.Uo(dcT, jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class g9s extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private /* synthetic */ Object f44267O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44268n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f44269r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f44270t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g9s(boolean z2, Continuation continuation) {
            super(2, continuation);
            this.f44269r = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            g9s g9sVar = n.this.new g9s(this.f44269r, continuation);
            g9sVar.f44267O = obj;
            return g9sVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((g9s) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String gh() {
            return "IAP: getAccountStatusAndLicenses: Calling middleware";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String mUb() {
            return "IAP: refreshPurchaseStateInternal";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String qie(List list) {
            return "IAP: getAccountStatusAndLicenses: GOT RESULT (" + list.size() + " licenses)";
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x012e, code lost:
        
            if (r10.uG(r9) != r0) goto L55;
         */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x011f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            final List listN;
            vd vdVar;
            String uid;
            vd vdVar2;
            nYs.j jVarInvoke;
            Context applicationContext;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44270t;
            try {
            } catch (Exception unused) {
                listN = null;
            }
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
                        vdVar2 = (vd) this.f44267O;
                        ResultKt.throwOnFailure(obj);
                        listN = ((IAPMiddleware.j) obj).n();
                        XoT.C.Uo(vdVar2, new Function0() { // from class: com.alightcreative.account.aC
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return n.g9s.qie(listN);
                            }
                        });
                        if (listN != null) {
                            n.this.f44152g = listN;
                        }
                        n nVar = n.this;
                        this.f44267O = null;
                        this.f44270t = 4;
                    } else {
                        vdVar2 = (vd) this.f44267O;
                        ResultKt.throwOnFailure(obj);
                        if (!((Boolean) n.this.ck().getValue()).booleanValue() && n.this.f44152g == null && n.this.te < 3 && (jVarInvoke = n.this.Uo.invoke()) != null && jVarInvoke.T()) {
                            applicationContext = IvA.n.rl().getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                            if (!XoT.fuX.Ik(applicationContext)) {
                                n.this.te++;
                                XoT.C.Uo(vdVar2, new Function0() { // from class: com.alightcreative.account.Dsr
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return n.g9s.gh();
                                    }
                                });
                                IAPMiddleware iAPMiddleware = n.this.f44153n;
                                this.f44267O = vdVar2;
                                this.f44270t = 3;
                                obj = IAPMiddleware.mUb(iAPMiddleware, null, this, 1, null);
                                if (obj == coroutine_suspended) {
                                }
                                listN = ((IAPMiddleware.j) obj).n();
                                XoT.C.Uo(vdVar2, new Function0() { // from class: com.alightcreative.account.aC
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return n.g9s.qie(listN);
                                    }
                                });
                                if (listN != null) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        n nVar2 = n.this;
                        this.f44267O = null;
                        this.f44270t = 4;
                    }
                } else {
                    uid = (String) this.f44268n;
                    vdVar = (vd) this.f44267O;
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                vdVar = (vd) this.f44267O;
                XoT.C.Uo(vdVar, new Function0() { // from class: com.alightcreative.account.fuX
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n.g9s.mUb();
                    }
                });
                uid = n.this.getUid();
                if (((Boolean) n.this.ck().getValue()).booleanValue() && n.this.jB) {
                    n nVar3 = n.this;
                    this.f44267O = vdVar;
                    this.f44268n = uid;
                    this.f44270t = 1;
                    if (nVar3.waP(this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                n nVar22 = n.this;
                this.f44267O = null;
                this.f44270t = 4;
            }
            if (uid != null && n.this.E2 == kgE.Wre.f70097n) {
                n.this.Mh(uid);
            }
            n nVar4 = n.this;
            boolean z2 = this.f44269r;
            this.f44267O = vdVar;
            this.f44268n = null;
            this.f44270t = 2;
            if (nVar4.Fp(z2, this) != coroutine_suspended) {
                vdVar2 = vdVar;
                if (!((Boolean) n.this.ck().getValue()).booleanValue()) {
                    applicationContext = IvA.n.rl().getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    if (!XoT.fuX.Ik(applicationContext)) {
                    }
                }
                n nVar222 = n.this;
                this.f44267O = null;
                this.f44270t = 4;
            }
            return coroutine_suspended;
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean nr(LicenseInfo licenseInfo, kgE.fuX fux) {
            if (licenseInfo.getExpires() != null && licenseInfo.getExpires().longValue() < fux.az()) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean t(LicenseInfo licenseInfo, kgE.fuX fux) {
            if (licenseInfo.getValid() && !nr(licenseInfo, fux) && !licenseInfo.getBenefits().isEmpty()) {
                return true;
            }
            return false;
        }
    }

    static final class l3D extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44272n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f44273t;

        l3D(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            l3D l3d = n.this.new l3D(continuation);
            l3d.f44273t = obj;
            return l3d;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((l3D) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String O() {
            return "IAP: networkStateChange";
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44272n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                XoT.C.Uo((vd) this.f44273t, new Function0() { // from class: com.alightcreative.account.Wre
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n.l3D.O();
                    }
                });
                if (((Boolean) n.this.ck().getValue()).booleanValue() && n.this.jB) {
                    n nVar = n.this;
                    this.f44272n = 1;
                    if (nVar.waP(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            n.xzo(n.this, false, 1, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.account.n$n, reason: collision with other inner class name */
    private static final class C0619n implements vd {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final CoroutineContext f44274n;

        public C0619n(CoroutineContext coroutineContext) {
            Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
            this.f44274n = coroutineContext;
        }

        @Override // GJW.vd
        public CoroutineContext getCoroutineContext() {
            return this.f44274n;
        }
    }

    static final class nKK extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f44275O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f44276Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44277n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f44279r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f44280t;

        nKK(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44279r = obj;
            this.f44276Z |= Integer.MIN_VALUE;
            return n.this.Fp(false, this);
        }
    }

    static final class o extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f44281O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44282n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f44283o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f44285t;

        o(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f44283o |= Integer.MIN_VALUE;
            return n.this.vl(null, null, this);
        }
    }

    static final class qz extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44287n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f44288t;

        qz(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44288t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return n.this.Aum(null, this);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class w6 {
        private static final /* synthetic */ w6[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f44295r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f44294n = new w6("None", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final w6 f44296t = new w6("Success", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final w6 f44293O = new w6("Failure", 2);

        private static final /* synthetic */ w6[] n() {
            return new w6[]{f44294n, f44296t, f44293O};
        }

        static {
            w6[] w6VarArrN = n();
            J2 = w6VarArrN;
            f44295r = EnumEntriesKt.enumEntries(w6VarArrN);
        }

        public static w6 valueOf(String str) {
            return (w6) Enum.valueOf(w6.class, str);
        }

        public static w6[] values() {
            return (w6[]) J2.clone();
        }

        private w6(String str, int i2) {
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.account.n$z, reason: case insensitive filesystem */
    static final class C1688z implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C1688z f44297n = new C1688z();

        C1688z() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "IAP: getBackendSkuInfos: Calling middleware";
        }
    }

    @Override // kgE.fuX
    public void ty() {
        this.WPU = false;
    }

    static final class CN3 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44166n;

        CN3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return n.this.new CN3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((CN3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        
            if (r5.waP(r4) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44166n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        n.this.eF = false;
                        n.xzo(n.this, false, 1, null);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                n nVar = n.this;
                this.f44166n = 1;
                if (nVar.uG(this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (((Boolean) n.this.ck().getValue()).booleanValue()) {
                n nVar2 = n.this;
                this.f44166n = 2;
            }
            n.this.eF = false;
            n.xzo(n.this, false, 1, null);
            return Unit.INSTANCE;
        }
    }

    static final class Dsr extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ n f44176O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44177n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.firestore.fuX f44178t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Dsr(com.google.firebase.firestore.fuX fux, n nVar, Continuation continuation) {
            super(2, continuation);
            this.f44178t = fux;
            this.f44176O = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new Dsr(this.f44178t, this.f44176O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Dsr) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CloudBenefitValues benefitValues;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f44177n == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f44178t.t()) {
                    CloudStorageConfig cloudStorageConfig = (CloudStorageConfig) this.f44178t.qie(CloudStorageConfig.class);
                    TFv.SPz sPz = this.f44176O.HI;
                    if (cloudStorageConfig != null) {
                        benefitValues = cloudStorageConfig.getBenefitValues();
                    } else {
                        benefitValues = null;
                    }
                    sPz.t(benefitValues);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class Q extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44196n;

        Q(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return n.this.new Q(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Q) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44196n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                n nVar = n.this;
                this.f44196n = 1;
                if (nVar.Fp(true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class SPz extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44200n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f44201t;

        SPz(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return n.this.new SPz(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((SPz) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TFv.SPz sPz;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44201t;
            if (i2 != 0) {
                if (i2 == 1) {
                    sPz = (TFv.SPz) this.f44200n;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.SPz sPz2 = n.this.aYN;
                Zzk.j jVar = n.this.J2;
                this.f44200n = sPz2;
                this.f44201t = 1;
                Object objN = j.C0462j.n(jVar, false, this, 1, null);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sPz = sPz2;
                obj = objN;
            }
            sPz.setValue(obj);
            return Unit.INSTANCE;
        }
    }

    static final class UGc extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44202n;

        UGc(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return n.this.new UGc(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((UGc) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44202n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                n.this.P5 = true;
                n nVar = n.this;
                this.f44202n = 1;
                if (nVar.uG(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class afx extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f44221O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44222n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        afx(String str, Continuation continuation) {
            super(2, continuation);
            this.f44221O = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return n.this.new afx(this.f44221O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((afx) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44222n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                rO.n nVar = n.this.f44145O;
                String str = this.f44221O;
                this.f44222n = 1;
                if (nVar.t(str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.account.n$c, reason: case insensitive filesystem */
    static final class C1687c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44225n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f44226t;

        /* JADX INFO: renamed from: com.alightcreative.account.n$c$j */
        static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ vd f44227n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ n f44228t;

            /* JADX INFO: renamed from: com.alightcreative.account.n$c$j$j, reason: collision with other inner class name */
            static final class C0615j extends ContinuationImpl {
                /* synthetic */ Object J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                Object f44229O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f44230n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f44231o;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                Object f44233t;

                C0615j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.J2 = obj;
                    this.f44231o |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            j(vd vdVar, n nVar) {
                this.f44227n = vdVar;
                this.f44228t = nVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String J2(YV.Dsr dsr) {
                return "IAP: new purchase state " + dsr + " from monopoly";
            }

            /* JADX WARN: Code restructure failed: missing block: B:49:0x00f4, code lost:
            
                if (r9.uG(r0) == r1) goto L50;
             */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00e4  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(final YV.Dsr dsr, Continuation continuation) {
                C0615j c0615j;
                j jVar;
                YV.Dsr dsr2;
                TFv.SPz sPz;
                n nVar;
                j jVar2;
                if (continuation instanceof C0615j) {
                    c0615j = (C0615j) continuation;
                    int i2 = c0615j.f44231o;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0615j.f44231o = i2 - Integer.MIN_VALUE;
                    } else {
                        c0615j = new C0615j(continuation);
                    }
                }
                Object obj = c0615j.J2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0615j.f44231o;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    XoT.C.Uo(this.f44227n, new Function0() { // from class: com.alightcreative.account.CN3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return n.C1687c.j.J2(dsr);
                        }
                    });
                    if (dsr == YV.Dsr.f12101n) {
                        kgE.j jVarN = this.f44228t.nr.n();
                        if ((jVarN != null ? jVarN.nr() : null) == IAPItemType.Subscription) {
                            this.f44228t.WPU = true;
                            if (((Boolean) this.f44228t.WPU().getValue()).booleanValue()) {
                                TFv.SPz sPz2 = this.f44228t.aYN;
                                Zzk.j jVar3 = this.f44228t.J2;
                                c0615j.f44230n = this;
                                c0615j.f44233t = dsr;
                                c0615j.f44229O = sPz2;
                                c0615j.f44231o = 1;
                                Object objN = jVar3.n(true, c0615j);
                                if (objN != coroutine_suspended) {
                                    dsr2 = dsr;
                                    sPz = sPz2;
                                    obj = objN;
                                    jVar = this;
                                }
                                return coroutine_suspended;
                            }
                        }
                    }
                    jVar = this;
                    if (dsr != YV.Dsr.J2) {
                        jVar.f44228t.P5 = false;
                    }
                    if (dsr != YV.Dsr.f12103r || dsr == YV.Dsr.f12101n) {
                        nVar = jVar.f44228t;
                        c0615j.f44230n = jVar;
                        c0615j.f44233t = null;
                        c0615j.f44229O = null;
                        c0615j.f44231o = 2;
                        if (nVar.Fp(true, c0615j) != coroutine_suspended) {
                            jVar2 = jVar;
                            jVar = jVar2;
                            n nVar2 = jVar.f44228t;
                            c0615j.f44230n = null;
                            c0615j.f44233t = null;
                            c0615j.f44229O = null;
                            c0615j.f44231o = 3;
                        }
                        return coroutine_suspended;
                    }
                    jVar.f44228t.f44148U = CollectionsKt.emptyList();
                    n nVar22 = jVar.f44228t;
                    c0615j.f44230n = null;
                    c0615j.f44233t = null;
                    c0615j.f44229O = null;
                    c0615j.f44231o = 3;
                } else if (i3 == 1) {
                    sPz = (TFv.SPz) c0615j.f44229O;
                    dsr2 = (YV.Dsr) c0615j.f44233t;
                    jVar = (j) c0615j.f44230n;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    jVar2 = (j) c0615j.f44230n;
                    ResultKt.throwOnFailure(obj);
                    jVar = jVar2;
                    n nVar222 = jVar.f44228t;
                    c0615j.f44230n = null;
                    c0615j.f44233t = null;
                    c0615j.f44229O = null;
                    c0615j.f44231o = 3;
                }
                sPz.setValue(obj);
                dsr = dsr2;
                if (dsr != YV.Dsr.J2) {
                }
                if (dsr != YV.Dsr.f12103r) {
                }
                nVar = jVar.f44228t;
                c0615j.f44230n = jVar;
                c0615j.f44233t = null;
                c0615j.f44229O = null;
                c0615j.f44231o = 2;
                if (nVar.Fp(true, c0615j) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        }

        C1687c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C1687c c1687c = n.this.new C1687c(continuation);
            c1687c.f44226t = obj;
            return c1687c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C1687c) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44225n;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f44226t;
                rv6 rv6VarTy = n.this.f44156t.ty();
                j jVar = new j(vdVar, n.this);
                this.f44225n = 1;
                if (rv6VarTy.n(jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    static final class r extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44289n;

        r(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return n.this.new r(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((r) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44289n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                n nVar = n.this;
                this.f44289n = 1;
                if (nVar.Fp(true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class s4 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44291n;

        s4(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return n.this.new s4(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((s4) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44291n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                n nVar = n.this;
                this.f44291n = 1;
                if (n.Ro(nVar, false, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public n(IAPMiddleware iapMiddleware, sqD.n crisper, YV.Wre monopoly, cd.g9s purchaseBillingManager, rO.n setDeviceIdUseCase, Zzk.j isEligibleForFreeTrialUseCase, nYs.Ml getAlightSettingsUseCase, iF eventLogger) {
        Intrinsics.checkNotNullParameter(iapMiddleware, "iapMiddleware");
        Intrinsics.checkNotNullParameter(crisper, "crisper");
        Intrinsics.checkNotNullParameter(monopoly, "monopoly");
        Intrinsics.checkNotNullParameter(purchaseBillingManager, "purchaseBillingManager");
        Intrinsics.checkNotNullParameter(setDeviceIdUseCase, "setDeviceIdUseCase");
        Intrinsics.checkNotNullParameter(isEligibleForFreeTrialUseCase, "isEligibleForFreeTrialUseCase");
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f44153n = iapMiddleware;
        this.rl = crisper;
        this.f44156t = monopoly;
        this.nr = purchaseBillingManager;
        this.f44145O = setDeviceIdUseCase;
        this.J2 = isEligibleForFreeTrialUseCase;
        this.Uo = getAlightSettingsUseCase;
        this.KN = eventLogger;
        TFv.SPz sPzN = TFv.Lu.n(null);
        this.xMQ = sPzN;
        this.mUb = sPzN;
        TFv.SPz sPzN2 = TFv.Lu.n(null);
        this.gh = sPzN2;
        this.qie = sPzN2;
        TFv.SPz sPzN3 = TFv.Lu.n(null);
        this.az = sPzN3;
        this.ty = sPzN3;
        TFv.SPz sPzN4 = TFv.Lu.n(null);
        this.HI = sPzN4;
        this.ck = sPzN4;
        Boolean bool = Boolean.FALSE;
        TFv.SPz sPzN5 = TFv.Lu.n(bool);
        this.Ik = sPzN5;
        this.f44155r = sPzN5;
        this.f44154o = true;
        this.f44150Z = true;
        this.f44146S = GJW.Lu.rl();
        TFv.SPz sPzN6 = TFv.Lu.n(bool);
        this.aYN = sPzN6;
        this.ViF = sPzN6;
        this.nY = new LinkedHashMap();
        this.iF = CollectionsKt.emptyList();
        this.fD = "";
        this.E2 = kgE.Wre.f70097n;
        this.f44151e = new LinkedHashMap();
        this.f44149X = new LinkedHashMap();
        this.f44147T = new LinkedHashSet();
        this.nHg = new LinkedHashSet();
        this.wTp = MapsKt.emptyMap();
        this.rV9 = GJW.ci.n(null);
        this.f44148U = CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Aum(String str, Continuation continuation) {
        qz qzVar;
        if (continuation instanceof qz) {
            qzVar = (qz) continuation;
            int i2 = qzVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qzVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                qzVar = new qz(continuation);
            }
        }
        Object objS = qzVar.f44288t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = qzVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objS);
            qzVar.f44287n = str;
            qzVar.J2 = 1;
            objS = s(qzVar);
            if (objS == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) qzVar.f44287n;
            ResultKt.throwOnFailure(objS);
        }
        for (Object obj : (Iterable) objS) {
            if (Intrinsics.areEqual(((SKUInfo) obj).getSku(), str)) {
                return obj;
            }
        }
        return null;
    }

    private final xuv D76(String str) {
        return GJW.C.nr(this.f44146S, null, null, new afx(str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Path cross not found for [B:38:0x00ed, B:46:0x010c], limit reached: 76 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010f A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:34:0x00d1, B:36:0x00e1, B:38:0x00ed, B:43:0x0105, B:48:0x010f, B:49:0x011e), top: B:73:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c9 -> B:21:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x010f -> B:54:0x013e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0137 -> B:53:0x013c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EN(Collection collection, Continuation continuation) {
        DAz dAz;
        n nVar;
        Ml mlO;
        Ref.BooleanRef booleanRef;
        Iterator it;
        n nVar2;
        Object objM313constructorimpl;
        n nVar3;
        Ml ml;
        Ref.BooleanRef booleanRef2;
        Iterator it2;
        YV.o oVar;
        String str;
        SKUInfo sKUInfo;
        com.alightcreative.account.qz qzVar;
        if (continuation instanceof DAz) {
            dAz = (DAz) continuation;
            int i2 = dAz.f44171g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dAz.f44171g = i2 - Integer.MIN_VALUE;
                nVar = this;
            } else {
                nVar = this;
                dAz = nVar.new DAz(continuation);
            }
        }
        Object objAYN = dAz.f44170Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dAz.f44171g;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objAYN);
            mlO = Ml.J2.O();
            XoT.C.Uo(mlO, new Function0() { // from class: kgE.C
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.alightcreative.account.n.pS();
                }
            });
            Ml.mUb(mlO, false, 1, null);
            booleanRef = new Ref.BooleanRef();
            it = collection.iterator();
            nVar2 = nVar;
            while (it.hasNext()) {
            }
            XoT.C.Uo(mlO, new Function0() { // from class: kgE.eO
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.alightcreative.account.n.eo();
                }
            });
            return Boxing.boxBoolean(booleanRef.element);
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            YV.o oVar2 = (YV.o) dAz.f44174r;
            it = (Iterator) dAz.J2;
            Ref.BooleanRef booleanRef3 = (Ref.BooleanRef) dAz.f44168O;
            Ml ml2 = (Ml) dAz.f44175t;
            n nVar4 = (n) dAz.f44172n;
            try {
                ResultKt.throwOnFailure(objAYN);
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
                Ml ml3 = ml2;
                Ref.BooleanRef booleanRef4 = booleanRef3;
                nVar2 = nVar4;
                if (Result.m319isFailureimpl(objM313constructorimpl)) {
                }
                qzVar = (com.alightcreative.account.qz) objM313constructorimpl;
                if (Intrinsics.areEqual(qzVar, qz.j.f44301n)) {
                }
                booleanRef = booleanRef4;
                mlO = ml3;
                while (it.hasNext()) {
                }
                XoT.C.Uo(mlO, new Function0() { // from class: kgE.eO
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.alightcreative.account.n.eo();
                    }
                });
                return Boxing.boxBoolean(booleanRef.element);
            }
            Object nVar5 = (com.alightcreative.account.qz) objAYN;
            objM313constructorimpl = Result.m313constructorimpl(nVar5);
            Ml ml32 = ml2;
            Ref.BooleanRef booleanRef42 = booleanRef3;
            nVar2 = nVar4;
            if (Result.m319isFailureimpl(objM313constructorimpl)) {
                objM313constructorimpl = null;
            }
            qzVar = (com.alightcreative.account.qz) objM313constructorimpl;
            if (Intrinsics.areEqual(qzVar, qz.j.f44301n)) {
                XoT.C.Uo(ml32, new Function0() { // from class: kgE.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.alightcreative.account.n.tEO();
                    }
                });
                Ml.KN(ml32, neA.n.n(neA.j.f71201r), false, 2, null);
                nVar2.nHg.add(oVar2.J2());
            } else {
                if (qzVar instanceof qz.n) {
                    XoT.C.Uo(ml32, new Function0() { // from class: kgE.qz
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.alightcreative.account.n.yAc();
                        }
                    });
                    Ml.mUb(ml32, false, 1, null);
                    nVar2.nY.put(oVar2.J2(), qzVar);
                } else {
                    XoT.C.Uo(ml32, new Function0() { // from class: kgE.Pl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.alightcreative.account.n.h();
                        }
                    });
                    Ml.KN(ml32, neA.n.n(neA.j.f71201r), false, 2, null);
                }
                XoT.C.Uo(ml32, new Function0() { // from class: kgE.Xo
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.alightcreative.account.n.l();
                    }
                });
            }
            booleanRef = booleanRef42;
            mlO = ml32;
            while (it.hasNext()) {
                YV.o oVar3 = (YV.o) it.next();
                String strT = oVar3.t();
                if (strT != null) {
                    dAz.f44172n = nVar2;
                    dAz.f44175t = mlO;
                    dAz.f44168O = booleanRef;
                    dAz.J2 = it;
                    dAz.f44174r = oVar3;
                    dAz.f44173o = strT;
                    dAz.f44171g = 1;
                    Object objAum = nVar2.Aum(strT, dAz);
                    if (objAum != coroutine_suspended) {
                        ml = mlO;
                        objAYN = objAum;
                        nVar3 = nVar2;
                        it2 = it;
                        oVar = oVar3;
                        booleanRef2 = booleanRef;
                        str = strT;
                        sKUInfo = (SKUInfo) objAYN;
                        if (sKUInfo != null) {
                            it = it2;
                            booleanRef = booleanRef2;
                            mlO = ml;
                            nVar2 = nVar3;
                            while (it.hasNext()) {
                            }
                        } else {
                            ml.Ik(1);
                            try {
                            } catch (Throwable th2) {
                                oVar2 = oVar;
                                it = it2;
                                booleanRef3 = booleanRef2;
                                ml2 = ml;
                                nVar4 = nVar3;
                                Result.Companion companion2 = Result.INSTANCE;
                                objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th2));
                            }
                            Result.Companion companion3 = Result.INSTANCE;
                            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
                            Long l2 = jVar.getVerifiedPurchaseExpirationTime().get(str);
                            if (l2 != null) {
                                if (l2.longValue() > nVar3.az()) {
                                    String str2 = jVar.getVerifiedPurchaseUid().get(str);
                                    String uid = nVar3.getUid();
                                    if (uid == null) {
                                        uid = "";
                                    }
                                    if (Intrinsics.areEqual(str2, uid)) {
                                    }
                                    if (l2 != null) {
                                        nVar5 = new qz.n(l2.longValue());
                                        oVar2 = oVar;
                                        it = it2;
                                        booleanRef3 = booleanRef2;
                                        ml2 = ml;
                                        nVar4 = nVar3;
                                        objM313constructorimpl = Result.m313constructorimpl(nVar5);
                                        Ml ml322 = ml2;
                                        Ref.BooleanRef booleanRef422 = booleanRef3;
                                        nVar2 = nVar4;
                                        if (Result.m319isFailureimpl(objM313constructorimpl)) {
                                        }
                                        qzVar = (com.alightcreative.account.qz) objM313constructorimpl;
                                        if (Intrinsics.areEqual(qzVar, qz.j.f44301n)) {
                                        }
                                        booleanRef = booleanRef422;
                                        mlO = ml322;
                                        while (it.hasNext()) {
                                        }
                                    }
                                }
                                l2 = null;
                                if (l2 != null) {
                                }
                            }
                            booleanRef2.element = true;
                            IAPMiddleware iAPMiddleware = nVar3.f44153n;
                            dAz.f44172n = nVar3;
                            dAz.f44175t = ml;
                            dAz.f44168O = booleanRef2;
                            dAz.J2 = it2;
                            dAz.f44174r = oVar;
                            dAz.f44173o = null;
                            dAz.f44171g = 2;
                            objAYN = iAPMiddleware.aYN(oVar, sKUInfo, dAz);
                            if (objAYN != coroutine_suspended) {
                                oVar2 = oVar;
                                it = it2;
                                booleanRef3 = booleanRef2;
                                ml2 = ml;
                                nVar4 = nVar3;
                                Object nVar52 = (com.alightcreative.account.qz) objAYN;
                                objM313constructorimpl = Result.m313constructorimpl(nVar52);
                                Ml ml3222 = ml2;
                                Ref.BooleanRef booleanRef4222 = booleanRef3;
                                nVar2 = nVar4;
                                if (Result.m319isFailureimpl(objM313constructorimpl)) {
                                }
                                qzVar = (com.alightcreative.account.qz) objM313constructorimpl;
                                if (Intrinsics.areEqual(qzVar, qz.j.f44301n)) {
                                }
                                booleanRef = booleanRef4222;
                                mlO = ml3222;
                                while (it.hasNext()) {
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                }
            }
            XoT.C.Uo(mlO, new Function0() { // from class: kgE.eO
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.alightcreative.account.n.eo();
                }
            });
            return Boxing.boxBoolean(booleanRef.element);
        }
        str = (String) dAz.f44173o;
        oVar = (YV.o) dAz.f44174r;
        it2 = (Iterator) dAz.J2;
        booleanRef2 = (Ref.BooleanRef) dAz.f44168O;
        ml = (Ml) dAz.f44175t;
        nVar3 = (n) dAz.f44172n;
        ResultKt.throwOnFailure(objAYN);
        sKUInfo = (SKUInfo) objAYN;
        if (sKUInfo != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0192, code lost:
    
        if (r2.uG(r5) == r0) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Fp(boolean z2, Continuation continuation) {
        nKK nkk;
        Ref.BooleanRef booleanRef;
        n nVar;
        Ref.BooleanRef booleanRef2;
        if (continuation instanceof nKK) {
            nkk = (nKK) continuation;
            int i2 = nkk.f44276Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nkk.f44276Z = i2 - Integer.MIN_VALUE;
            } else {
                nkk = new nKK(continuation);
            }
        }
        nKK nkk2 = nkk;
        Object objEN = nkk2.f44279r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nkk2.f44276Z;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objEN);
            XoT.C.Uo(this, new Function0() { // from class: kgE.aC
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.alightcreative.account.n.SR();
                }
            });
            if (z2) {
                if (this.Xw) {
                    return Unit.INSTANCE;
                }
                this.Xw = true;
            }
            Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
            nkk2.f44277n = this;
            nkk2.f44280t = booleanRef3;
            nkk2.f44276Z = 1;
            Object objN = Wre.w6.n(this.f44156t, !z2, true, false, nkk2, 4, null);
            if (objN != coroutine_suspended) {
                objEN = objN;
                booleanRef = booleanRef3;
                nVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            booleanRef = (Ref.BooleanRef) nkk2.f44280t;
            n nVar2 = (n) nkk2.f44277n;
            ResultKt.throwOnFailure(objEN);
            nVar = nVar2;
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objEN);
                return Unit.INSTANCE;
            }
            booleanRef = (Ref.BooleanRef) nkk2.J2;
            booleanRef2 = (Ref.BooleanRef) nkk2.f44280t;
            nVar = (n) nkk2.f44277n;
            ResultKt.throwOnFailure(objEN);
            booleanRef.element = ((Boolean) objEN).booleanValue();
            booleanRef = booleanRef2;
            nVar.Xw = false;
            if (!booleanRef.element) {
                return Unit.INSTANCE;
            }
            nkk2.f44277n = null;
            nkk2.f44280t = null;
            nkk2.f44275O = null;
            nkk2.J2 = null;
            nkk2.f44276Z = 3;
        }
        x0X.n nVar3 = (x0X.n) objEN;
        if (nVar3 instanceof n.C1266n) {
            nVar.Xw = false;
            if (!booleanRef.element) {
            }
        } else {
            if (!(nVar3 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            List list = (List) ((n.w6) nVar3).n();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((YV.o) obj).nr() == YV.qz.f12153t) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            Pair pair = new Pair(arrayList, arrayList2);
            List list2 = (List) pair.component1();
            List list3 = (List) pair.component2();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                String strT = ((YV.o) it.next()).t();
                if (strT != null) {
                    arrayList3.add(strT);
                }
            }
            nVar.f44148U = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list3) {
                if (((YV.o) obj2).t() != null) {
                    arrayList4.add(obj2);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList4, 10)), 16));
            for (Object obj3 : arrayList4) {
                String strT2 = ((YV.o) obj3).t();
                Intrinsics.checkNotNull(strT2);
                linkedHashMap.put(strT2, obj3);
            }
            nVar.wTp = linkedHashMap;
            nVar.s7N = true;
            Collection collectionValues = linkedHashMap.values();
            nkk2.f44277n = nVar;
            nkk2.f44280t = booleanRef;
            nkk2.f44275O = nVar3;
            nkk2.J2 = booleanRef;
            nkk2.f44276Z = 2;
            objEN = nVar.EN(collectionValues, nkk2);
            if (objEN != coroutine_suspended) {
                booleanRef2 = booleanRef;
                booleanRef.element = ((Boolean) objEN).booleanValue();
                booleanRef = booleanRef2;
                nVar.Xw = false;
                if (!booleanRef.element) {
                }
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(YV.o oVar, Continuation continuation) {
        Z z2;
        n nVar;
        YV.o oVar2;
        LicenseType licenseTypeNr;
        if (continuation instanceof Z) {
            z2 = (Z) continuation;
            int i2 = z2.f44214r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z2.f44214r = i2 - Integer.MIN_VALUE;
            } else {
                z2 = new Z(continuation);
            }
        }
        Object objAum = z2.f44212O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = z2.f44214r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objAum);
            String strT = oVar.t();
            if (strT != null) {
                z2.f44213n = this;
                z2.f44215t = oVar;
                z2.f44214r = 1;
                objAum = Aum(strT, z2);
                if (objAum == coroutine_suspended) {
                    return coroutine_suspended;
                }
                nVar = this;
                oVar2 = oVar;
            }
            return null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oVar2 = (YV.o) z2.f44215t;
        nVar = (n) z2.f44213n;
        ResultKt.throwOnFailure(objAum);
        SKUInfo sKUInfo = (SKUInfo) objAum;
        if (sKUInfo == null || (licenseTypeNr = com.alightcreative.account.C.nr(sKUInfo.getType())) == null) {
            return null;
        }
        LicenseStore licenseStore = LicenseStore.GooglePlayStore;
        Set<K> benefits = sKUInfo.getBenefits();
        String sku = sKUInfo.getSku();
        boolean zKN = oVar2.KN();
        String strN = oVar2.n();
        PurchasePeriod period = sKUInfo.getPeriod();
        qz.n nVar2 = (qz.n) nVar.nY.get(oVar2.J2());
        return new LicenseInfo(true, licenseTypeNr, licenseStore, sku, zKN, strN, period, nVar2 != null ? Boxing.boxLong(nVar2.n()) : null, benefits);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String I9f() {
        return "retryAllFailedIAPTasks";
    }

    private final void LPV(sqD.n nVar, Set set) throws JSONException {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String strN = xAo.Wre.n((K) it.next());
            if (strN != null) {
                arrayList.add(strN);
            }
        }
        JSONArray jSONArray = new JSONArray((Collection) arrayList);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("active_benefits", jSONArray);
        this.KN.n(new j.iwV(jSONObject));
        nVar.O(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Lp6() {
        return "IAP: init";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Mh(String str) {
        List listEmptyList;
        XoT.C.Uo(this, new Function0() { // from class: kgE.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.account.n.jO();
            }
        });
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (jVar.getLicenseCacheVersion() == jVar.getLICENSE_CACHE_VERSION() && jVar.getAccountInfoCacheDate() > az() - 1296000000 && Intrinsics.areEqual(str, jVar.getLicenseUid())) {
            if (StringsKt.trim((CharSequence) jVar.getLicenseInfo()).toString().length() > 0) {
                Moshi moshiN = Lu.n();
                String licenseInfo = jVar.getLicenseInfo();
                JsonAdapter jsonAdapterAdapter = moshiN.adapter(Types.newParameterizedType(List.class, LicenseInfo.class));
                Intrinsics.checkNotNull(jsonAdapterAdapter);
                listEmptyList = (List) jsonAdapterAdapter.fromJson(licenseInfo);
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            if (listEmptyList != null) {
                this.iF = listEmptyList;
                this.E2 = kgE.Wre.f70099t;
                this.fD = str;
            }
        }
    }

    private final PurchasePeriod QgZ(Period period) {
        PurchasePeriod.Unit unit;
        int i2 = I28.$EnumSwitchMapping$1[period.getTimeUnit().ordinal()];
        if (i2 == 1) {
            unit = PurchasePeriod.Unit.Day;
        } else if (i2 == 2) {
            unit = PurchasePeriod.Unit.Week;
        } else if (i2 == 3) {
            unit = PurchasePeriod.Unit.Month;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            unit = PurchasePeriod.Unit.Year;
        }
        return new PurchasePeriod(unit, period.getValue());
    }

    private final boolean Qu(final FirebaseFirestoreException firebaseFirestoreException) {
        Ml mlT = Ml.J2.t();
        XoT.C.Uo(mlT, new Function0() { // from class: kgE.afx
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.account.n.HBN(firebaseFirestoreException);
            }
        });
        Ml.KN(mlT, firebaseFirestoreException, false, 2, null);
        return this.HI.t(null);
    }

    static /* synthetic */ Object Ro(n nVar, boolean z2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return nVar.Fp(z2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SR() {
        return "IAP: updatePurchasesFromGooglePlay";
    }

    private final boolean T3L(final FirebaseFirestoreException firebaseFirestoreException) throws JSONException {
        Ml mlRl = Ml.J2.rl();
        XoT.C.Uo(mlRl, new Function0() { // from class: kgE.g9s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.account.n.Bu(firebaseFirestoreException);
            }
        });
        Ml.KN(mlRl, firebaseFirestoreException, false, 2, null);
        rxp(this.rl, false);
        this.xMQ.t(null);
        this.gh.t(null);
        return this.az.t(null);
    }

    private final void Th(boolean z2) {
        XoT.C.Uo(this, new Function0() { // from class: kgE.lej
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.account.n.XNZ();
            }
        });
        GJW.C.nr(this.f44146S, null, null, new ci(z2, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Toy() {
        return "IAP: onActivityCreate";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0074 -> B:20:0x0077). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object UF(Continuation continuation) {
        aC aCVar;
        n nVar;
        Collection arrayList;
        Iterator it;
        if (continuation instanceof aC) {
            aCVar = (aC) continuation;
            int i2 = aCVar.f44218o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aCVar.f44218o = i2 - Integer.MIN_VALUE;
            } else {
                aCVar = new aC(continuation);
            }
        }
        Object objH = aCVar.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = aCVar.f44218o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objH);
            final Collection collectionValues = this.wTp.values();
            XoT.C.Uo(this, new Function0() { // from class: kgE.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.alightcreative.account.n.X4T(collectionValues);
                }
            });
            nVar = this;
            arrayList = new ArrayList();
            it = collectionValues.iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) aCVar.f44216O;
            arrayList = (Collection) aCVar.f44220t;
            nVar = (n) aCVar.f44217n;
            ResultKt.throwOnFailure(objH);
            LicenseInfo licenseInfo = (LicenseInfo) objH;
            if (licenseInfo != null) {
                arrayList.add(licenseInfo);
            }
            if (it.hasNext()) {
                YV.o oVar = (YV.o) it.next();
                aCVar.f44217n = nVar;
                aCVar.f44220t = arrayList;
                aCVar.f44216O = it;
                aCVar.f44218o = 1;
                objH = nVar.H(oVar, aCVar);
                if (objH == coroutine_suspended) {
                    return coroutine_suspended;
                }
                LicenseInfo licenseInfo2 = (LicenseInfo) objH;
                if (licenseInfo2 != null) {
                }
                if (it.hasNext()) {
                    final List list = (List) arrayList;
                    XoT.C.Uo(nVar, new Function0() { // from class: kgE.QJ
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.alightcreative.account.n.Zmq(list);
                        }
                    });
                    List listN7b = nVar.n7b();
                    final ArrayList<LicenseInfo> arrayList2 = new ArrayList();
                    for (Object obj : listN7b) {
                        if (f44138B.t((LicenseInfo) obj, nVar)) {
                            arrayList2.add(obj);
                        }
                    }
                    XoT.C.Uo(nVar, new Function0() { // from class: kgE.l3D
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.alightcreative.account.n.JVN(arrayList2);
                        }
                    });
                    final ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : list) {
                        if (f44138B.t((LicenseInfo) obj2, nVar)) {
                            arrayList3.add(obj2);
                        }
                    }
                    XoT.C.Uo(nVar, new Function0() { // from class: kgE.s4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.alightcreative.account.n.xVH(arrayList3);
                        }
                    });
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : arrayList3) {
                        LicenseInfo licenseInfo3 = (LicenseInfo) obj3;
                        if (!arrayList2.isEmpty()) {
                            for (LicenseInfo licenseInfo4 : arrayList2) {
                                if (licenseInfo4.getOrderNumber() == null || !Intrinsics.areEqual(licenseInfo4.getOrderNumber(), licenseInfo3.getOrderNumber())) {
                                }
                            }
                        }
                        arrayList4.add(obj3);
                    }
                    final List listPlus = CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4);
                    XoT.C.Uo(nVar, new Function0() { // from class: kgE.UGc
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.alightcreative.account.n.EF(listPlus);
                        }
                    });
                    return listPlus;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Uf() {
        return "clearAndRefreshIAPStatus";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Vvq() {
        return "IAP: computePurchaseStateAndNotifyObservers";
    }

    private final xuv VwL(com.google.firebase.firestore.fuX fux, String str) {
        Ml mlRl = Ml.J2.rl();
        XoT.C.Uo(mlRl, new Function0() { // from class: kgE.ci
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.account.n.mI();
            }
        });
        Ml.mUb(mlRl, false, 1, null);
        return GJW.C.nr(this.f44146S, null, null, new Wre(fux, this, str, mlRl, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String XNZ() {
        return "IAP: refreshPurchaseState";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Zn(List list, n nVar) {
        return "IAP Task State: " + CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, new Function1() { // from class: com.alightcreative.account.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.nO((n.Ml) obj);
            }
        }, 30, null) + "; updatingPurchasesFromGooglePlay=" + nVar.Xw + "; isPurchaseBeingMade=" + nVar.P5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String eo() {
        return "IAP: verifyPurchases: PURCHASED/UNSPEC OUT";
    }

    private final xuv f(com.google.firebase.firestore.fuX fux) {
        Ml mlT = Ml.J2.t();
        XoT.C.Uo(mlT, new Function0() { // from class: kgE.SPz
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.account.n.ub();
            }
        });
        Ml.mUb(mlT, false, 1, null);
        return GJW.C.nr(this.f44146S, null, null, new Dsr(fux, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g6(n nVar, boolean z2) {
        GJW.C.nr(nVar.f44146S, null, null, nVar.new l3D(null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h() {
        return "IAP: verifyPurchases: VerifyPurchaseResult Exception";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String jO() {
        return "IAP: loadAccountLicensesFromCache";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l() {
        return "IAP: verifyPurchases: verification done";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object lNy(boolean z2, Continuation continuation) {
        Object objJ2 = GJW.Lu.J2(new g9s(z2, null), continuation);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mI() {
        return "IAP: accountDocumentChanged";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence nO(Ml it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.ck() + ":" + it.qie() + (it.ty() ? "(R)" : "(-)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o9(n nVar, com.google.firebase.firestore.fuX fux, FirebaseFirestoreException firebaseFirestoreException) {
        if (fux != null) {
            nVar.f(fux);
        } else {
            Intrinsics.checkNotNull(firebaseFirestoreException);
            nVar.Qu(firebaseFirestoreException);
        }
    }

    private final void p0N() {
        GJW.C.nr(this.f44146S, null, null, new CN3(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String pS() {
        return "IAP: verifyPurchases IN";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rxp(sqD.n nVar, boolean z2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_creator_program_active", z2);
        this.KN.n(new j.iwV(jSONObject));
        nVar.O(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Continuation continuation) {
        Xo xo;
        if (continuation instanceof Xo) {
            xo = (Xo) continuation;
            int i2 = xo.f44209O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xo.f44209O = i2 - Integer.MIN_VALUE;
            } else {
                xo = new Xo(continuation);
            }
        }
        Object objUo = xo.f44210n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = xo.f44209O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            Ml mlNr = Ml.J2.nr();
            DC dcT = OU.t();
            Pl pl = new Pl(true, mlNr, this, null, this);
            xo.f44209O = 1;
            objUo = GJW.Dsr.Uo(dcT, pl, xo);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUo);
        }
        List list = (List) objUo;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tEO() {
        return "IAP: verifyPurchases: VerifyPurchaseResult.InvalidToken";
    }

    private final void tFV() {
        Ml.J2.rl().Ik(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0196, code lost:
    
        if (kgE.Sis.ck(r9, r2) == r3) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f2 A[Catch: all -> 0x0116, TRY_ENTER, TryCatch #1 {all -> 0x0116, blocks: (B:51:0x010e, B:48:0x00f2, B:60:0x015f, B:53:0x0112), top: B:80:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0112 A[Catch: all -> 0x0116, TRY_LEAVE, TryCatch #1 {all -> 0x0116, blocks: (B:51:0x010e, B:48:0x00f2, B:60:0x015f, B:53:0x0112), top: B:80:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011a A[Catch: all -> 0x019f, TRY_ENTER, TryCatch #3 {all -> 0x019f, blocks: (B:46:0x00ec, B:57:0x011a, B:58:0x0159, B:62:0x016d), top: B:84:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x010a -> B:80:0x010e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uG(Continuation continuation) throws Throwable {
        C c2;
        n nVar;
        n nVar2;
        Set set;
        Iterator it;
        n nVar3;
        Map map;
        Collection collection;
        List list;
        n nVar4;
        if (continuation instanceof C) {
            c2 = (C) continuation;
            int i2 = c2.f44161g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2.f44161g = i2 - Integer.MIN_VALUE;
            } else {
                c2 = new C(continuation);
            }
        }
        Object objUF = c2.f44160Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c2.f44161g;
        try {
            try {
                if (i3 == 0) {
                    ResultKt.throwOnFailure(objUF);
                    XoT.C.Uo(this, new Function0() { // from class: kgE.Ln
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.alightcreative.account.n.Vvq();
                        }
                    });
                    if (this.f44157v) {
                        return Unit.INSTANCE;
                    }
                    this.f44157v = true;
                    try {
                        c2.f44162n = this;
                        c2.f44161g = 1;
                        objUF = UF(c2);
                        if (objUF != coroutine_suspended) {
                            nVar2 = this;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th) {
                        th = th;
                        nVar = this;
                        nVar.f44157v = false;
                        throw th;
                    }
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(objUF);
                        return Unit.INSTANCE;
                    }
                    it = (Iterator) c2.f44163o;
                    collection = (Collection) c2.f44164r;
                    Map map2 = (Map) c2.J2;
                    set = (Set) c2.f44158O;
                    list = (List) c2.f44165t;
                    n nVar5 = (n) c2.f44162n;
                    ResultKt.throwOnFailure(objUF);
                    map = map2;
                    nVar3 = nVar5;
                    try {
                        SKUInfo sKUInfo = (SKUInfo) objUF;
                        if (sKUInfo != null) {
                            collection.add(sKUInfo);
                        }
                        if (it.hasNext()) {
                            String str = (String) it.next();
                            c2.f44162n = nVar3;
                            c2.f44165t = list;
                            c2.f44158O = set;
                            c2.J2 = map;
                            c2.f44164r = collection;
                            c2.f44163o = it;
                            c2.f44161g = 2;
                            objUF = nVar3.Aum(str, c2);
                            if (objUF == coroutine_suspended) {
                            }
                            SKUInfo sKUInfo2 = (SKUInfo) objUF;
                            if (sKUInfo2 != null) {
                            }
                            if (it.hasNext()) {
                                List list2 = (List) collection;
                                Zs zsY = nVar3.y();
                                boolean zBooleanValue = ((Boolean) nVar3.ck().getValue()).booleanValue();
                                kgE.Wre wre = nVar3.E2;
                                Long lBoxLong = Boxing.boxLong(com.alightcreative.app.motion.persist.j.INSTANCE.getAccountCreated());
                                List listJ2 = Ml.J2.J2(((Boolean) nVar3.ck().getValue()).booleanValue());
                                ArrayList arrayList = new ArrayList();
                                Iterator it2 = listJ2.iterator();
                                while (it2.hasNext()) {
                                    CollectionsKt.addAll(arrayList, ((Ml) it2.next()).gh());
                                }
                                nVar4 = nVar3;
                                try {
                                    com.alightcreative.account.o oVar = new com.alightcreative.account.o(set, list, map, zsY, zBooleanValue, wre, lBoxLong, arrayList, list2, ((Boolean) nVar3.aYN.getValue()).booleanValue());
                                    nVar4.f44157v = false;
                                    c2.f44162n = null;
                                    c2.f44165t = null;
                                    c2.f44158O = null;
                                    c2.J2 = null;
                                    c2.f44164r = null;
                                    c2.f44163o = null;
                                    c2.f44161g = 3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    nVar = nVar4;
                                    nVar.f44157v = false;
                                    throw th;
                                }
                            }
                        }
                        return coroutine_suspended;
                    } catch (Throwable th3) {
                        th = th3;
                        nVar = nVar3;
                        nVar.f44157v = false;
                        throw th;
                    }
                }
                nVar2 = (n) c2.f44162n;
                ResultKt.throwOnFailure(objUF);
                if (it.hasNext()) {
                }
                return coroutine_suspended;
            } catch (Throwable th4) {
                th = th4;
                nVar4 = nVar3;
            }
            List list3 = (List) objUF;
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                CollectionsKt.addAll(arrayList2, ((LicenseInfo) it3.next()).getBenefits());
            }
            Set set2 = CollectionsKt.toSet(arrayList2);
            if (nVar2.s7N) {
                nVar2.LPV(nVar2.rl, set2);
                nVar2.rV9.eF(Unit.INSTANCE);
            }
            Map mapPlus = ((Boolean) nVar2.aYN.getValue()).booleanValue() ? MapsKt.plus(nVar2.f44149X, nVar2.f44151e) : nVar2.f44151e;
            List list4 = nVar2.f44148U;
            ArrayList arrayList3 = new ArrayList();
            set = set2;
            it = list4.iterator();
            nVar3 = nVar2;
            map = mapPlus;
            collection = arrayList3;
            list = list3;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uQ(List list, String str) {
        this.iF = list;
        this.E2 = kgE.Wre.f70096O;
        this.fD = str;
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        JsonAdapter jsonAdapterAdapter = Lu.n().adapter(List.class);
        Intrinsics.checkNotNull(jsonAdapterAdapter);
        String json = jsonAdapterAdapter.toJson(list);
        Intrinsics.checkNotNull(json);
        jVar.setLicenseInfo(json);
        jVar.setLicenseCacheVersion(jVar.getLICENSE_CACHE_VERSION());
        jVar.setAccountInfoCacheDate(az());
        jVar.setLicenseUid(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ub() {
        return "IAP: cloudConfigChanged";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0j(n nVar, FirebaseUser firebaseUser, com.google.firebase.firestore.fuX fux, FirebaseFirestoreException firebaseFirestoreException) throws JSONException {
        if (fux == null) {
            Intrinsics.checkNotNull(firebaseFirestoreException);
            nVar.T3L(firebaseFirestoreException);
        } else {
            String strF = firebaseUser.f();
            Intrinsics.checkNotNullExpressionValue(strF, "getUid(...)");
            nVar.VwL(fux, strF);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object vl(String str, IAPItemType iAPItemType, Continuation continuation) {
        o oVar;
        n nVar;
        String str2;
        IAPItemType iAPItemType2;
        Integer numBoxInt;
        Period period;
        Period period2;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i2 = oVar.f44283o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.f44283o = i2 - Integer.MIN_VALUE;
            } else {
                oVar = new o(continuation);
            }
        }
        Object objGh = oVar.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oVar.f44283o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objGh);
            YV.Wre wre = this.f44156t;
            oVar.f44282n = this;
            oVar.f44285t = str;
            oVar.f44281O = iAPItemType;
            oVar.f44283o = 1;
            objGh = wre.gh(str, oVar);
            if (objGh == coroutine_suspended) {
                return coroutine_suspended;
            }
            nVar = this;
            str2 = str;
            iAPItemType2 = iAPItemType;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            IAPItemType iAPItemType3 = (IAPItemType) oVar.f44281O;
            String str3 = (String) oVar.f44285t;
            nVar = (n) oVar.f44282n;
            ResultKt.throwOnFailure(objGh);
            iAPItemType2 = iAPItemType3;
            str2 = str3;
        }
        SubscriptionProduct subscriptionProduct = (SubscriptionProduct) x0X.w6.nr((x0X.n) objGh);
        if (subscriptionProduct == null) {
            return Unit.INSTANCE;
        }
        BasePlan basePlan = (BasePlan) CollectionsKt.firstOrNull((List) subscriptionProduct.getBasePlans());
        if (basePlan == null) {
            return Unit.INSTANCE;
        }
        Offer offer = (Offer) CollectionsKt.firstOrNull((List) basePlan.getFreeTrialOffers());
        PricingPhase pricingPhaseN = offer != null ? KNH.w6.n(offer) : null;
        int i5 = 0;
        int iJ = (pricingPhaseN == null || (period2 = pricingPhaseN.getPeriod()) == null) ? 0 : nVar.j(period2);
        if (iJ == 0) {
            String strSubstringAfter$default = StringsKt.substringAfter$default(str2, '_', (String) null, 2, (Object) null);
            if (StringsKt.contains$default((CharSequence) strSubstringAfter$default, (CharSequence) "1w", false, 2, (Object) null)) {
                i5 = 7;
            } else if (StringsKt.contains$default((CharSequence) strSubstringAfter$default, (CharSequence) "3d", false, 2, (Object) null)) {
                i5 = 3;
            }
            numBoxInt = Boxing.boxInt(i5);
        } else {
            numBoxInt = null;
        }
        if (numBoxInt != null) {
            iJ = numBoxInt.intValue();
        }
        int i7 = iJ;
        Offer offer2 = (Offer) CollectionsKt.firstOrNull((List) basePlan.getIntroPriceOffers());
        PricingPhase pricingPhaseNr = offer2 != null ? KNH.w6.nr(offer2) : null;
        (i7 > 0 ? nVar.f44149X : nVar.f44151e).put(str2, new kgE.j(str2, subscriptionProduct.getTitle(), subscriptionProduct.getDescription(), iAPItemType2, i7, nVar.QgZ(basePlan.getPeriod()), basePlan.getFormattedPrice(), basePlan.getPriceAmountMicros(), basePlan.getPriceCurrencyCode(), (pricingPhaseNr == null || (period = pricingPhaseNr.getPeriod()) == null) ? null : nVar.QgZ(period), pricingPhaseNr != null ? pricingPhaseNr.getFormattedPrice() : null, pricingPhaseNr != null ? Boxing.boxLong(pricingPhaseNr.getPriceAmountMicros()) : null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wKp() {
        return "IAP: onActivityResume";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waP(Continuation continuation) {
        Ew ew;
        Throwable th;
        n nVar;
        Object objM313constructorimpl;
        if (continuation instanceof Ew) {
            ew = (Ew) continuation;
            int i2 = ew.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ew.J2 = i2 - Integer.MIN_VALUE;
            } else {
                ew = new Ew(continuation);
            }
        }
        Ew ew2 = ew;
        Object objIk = ew2.f44181t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ew2.J2;
        boolean z2 = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objIk);
            this.jB = false;
            try {
                Result.Companion companion = Result.INSTANCE;
                IAPMiddleware iAPMiddleware = this.f44153n;
                ew2.f44180n = this;
                ew2.J2 = 1;
                objIk = IAPMiddleware.Ik(iAPMiddleware, 1L, null, ew2, 2, null);
                if (objIk == coroutine_suspended) {
                    return coroutine_suspended;
                }
                nVar = this;
            } catch (Throwable th2) {
                th = th2;
                nVar = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = (n) ew2.f44180n;
            try {
                ResultKt.throwOnFailure(objIk);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion22 = Result.INSTANCE;
                objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
            }
        }
        objM313constructorimpl = Result.m313constructorimpl((IAPMiddleware.n) objIk);
        if (Result.m316exceptionOrNullimpl(objM313constructorimpl) != null) {
            nVar.jB = true;
        }
        if (Result.m320isSuccessimpl(objM313constructorimpl)) {
            switch (I28.$EnumSwitchMapping$0[((IAPMiddleware.n) objM313constructorimpl).ordinal()]) {
                case 5:
                case 6:
                    z2 = true;
                case 1:
                case 2:
                case 3:
                case 4:
                    nVar.jB = z2;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ void xzo(n nVar, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        nVar.Th(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Zs y() {
        Iterator it;
        Iterator it2;
        final List listJ2 = Ml.J2.J2(((Boolean) ck().getValue()).booleanValue());
        XoT.C.Uo(this, new Function0() { // from class: kgE.Q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.account.n.Zn(listJ2, this);
            }
        });
        if (listJ2 == null || !listJ2.isEmpty()) {
            Iterator it3 = listJ2.iterator();
            while (it3.hasNext()) {
                if (((Ml) it3.next()).ty()) {
                    break;
                }
            }
            if (!this.Xw && !this.P5) {
                if (listJ2 != null || !listJ2.isEmpty()) {
                    it = listJ2.iterator();
                    while (it.hasNext()) {
                        if (((Ml) it.next()).qie() == w6.f44293O) {
                            return Zs.f70101O;
                        }
                    }
                }
                if (listJ2 != null || !listJ2.isEmpty()) {
                    it2 = listJ2.iterator();
                    while (it2.hasNext()) {
                        if (((Ml) it2.next()).qie() != w6.f44296t) {
                            return Zs.f70102n;
                        }
                    }
                }
                return Zs.J2;
            }
        } else if (!this.Xw) {
            if (listJ2 != null) {
                it = listJ2.iterator();
                while (it.hasNext()) {
                }
            }
            if (listJ2 != null) {
                it2 = listJ2.iterator();
                while (it2.hasNext()) {
                }
            }
            return Zs.J2;
        }
        return Zs.f70105t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String yAc() {
        return "IAP: verifyPurchases: VerifyPurchaseResult SUCCESS";
    }

    @Override // kgE.fuX
    public void HI(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.WPU) {
            HI0.fuX.nr(activity, 2132019055, 2132019054);
        }
        ty();
    }

    @Override // kgE.fuX
    public List Ik() {
        return com.alightcreative.account.o.gh.n().O();
    }

    @Override // kgE.fuX
    public void J2(List productIds, IAPItemType itemType) {
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        ArrayList arrayList = new ArrayList();
        for (Object obj : productIds) {
            if (!this.f44147T.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        GJW.C.nr(this.f44146S, null, null, new fuX(arrayList, itemType, null), 3, null);
    }

    @Override // kgE.fuX
    public void KN() {
        XoT.C.Uo(this, new Function0() { // from class: kgE.qf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.account.n.wKp();
            }
        });
        GJW.C.nr(this.f44146S, null, null, new r(null), 3, null);
    }

    public void NP(String str) {
        this.XQ = str;
    }

    @Override // kgE.fuX
    public void O(FirebaseAuth auth) throws JSONException {
        Intrinsics.checkNotNullParameter(auth, "auth");
        com.google.firebase.firestore.s4 s4Var = this.M7;
        if (s4Var != null) {
            s4Var.remove();
        }
        this.M7 = null;
        com.google.firebase.firestore.s4 s4Var2 = this.p5;
        if (s4Var2 != null) {
            s4Var2.remove();
        }
        this.p5 = null;
        final FirebaseUser firebaseUserXMQ = auth.xMQ();
        FirebaseFirestore firebaseFirestoreJ2 = FirebaseFirestore.J2();
        Intrinsics.checkNotNullExpressionValue(firebaseFirestoreJ2, "getInstance(...)");
        this.Ik.t(Boolean.valueOf(firebaseUserXMQ != null));
        this.f44150Z = wQ.j.n(auth);
        this.f44153n.ty(rl());
        this.f44154o = firebaseUserXMQ != null ? firebaseUserXMQ.ub() : true;
        NP(firebaseUserXMQ != null ? firebaseUserXMQ.f() : null);
        this.f44153n.HI(getUid());
        p0N();
        if (firebaseUserXMQ != null) {
            String strF = firebaseUserXMQ.f();
            Intrinsics.checkNotNullExpressionValue(strF, "getUid(...)");
            D76(strF);
            tFV();
            this.M7 = firebaseFirestoreJ2.t("account").gh(firebaseUserXMQ.f()).nr(new com.google.firebase.firestore.Dsr() { // from class: kgE.Z
                @Override // com.google.firebase.firestore.Dsr
                public final void n(Object obj, FirebaseFirestoreException firebaseFirestoreException) throws JSONException {
                    com.alightcreative.account.n.v0j(this.f70100n, firebaseUserXMQ, (com.google.firebase.firestore.fuX) obj, firebaseFirestoreException);
                }
            });
        } else {
            rxp(this.rl, false);
            this.xMQ.t(null);
            this.gh.t(null);
            this.az.t(null);
        }
        if (this.p5 == null) {
            this.p5 = firebaseFirestoreJ2.t("client_config").gh("cloud_storage").nr(new com.google.firebase.firestore.Dsr() { // from class: kgE.Ew
                @Override // com.google.firebase.firestore.Dsr
                public final void n(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
                    com.alightcreative.account.n.o9(this.f70069n, (com.google.firebase.firestore.fuX) obj, firebaseFirestoreException);
                }
            });
        }
    }

    @Override // kgE.fuX
    public void S() {
        XoT.C.Uo(this, new Function0() { // from class: kgE.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.account.n.Toy();
            }
        });
        GJW.C.nr(this.f44146S, null, null, new Q(null), 3, null);
    }

    @Override // kgE.fuX
    public Set Uo() {
        return com.alightcreative.account.o.gh.n().nr();
    }

    @Override // kgE.fuX
    public rv6 WPU() {
        return this.ViF;
    }

    @Override // kgE.fuX
    public rv6 XQ() {
        return this.mUb;
    }

    @Override // kgE.fuX
    public rv6 Z() {
        return this.ck;
    }

    @Override // kgE.fuX
    public long az() {
        return Math.max(this.f44153n.az(), System.currentTimeMillis());
    }

    @Override // kgE.fuX
    public rv6 ck() {
        return this.f44155r;
    }

    @Override // kgE.fuX
    public String getUid() {
        return this.XQ;
    }

    @Override // kgE.fuX
    public boolean gh() {
        return this.f44154o;
    }

    @Override // kgE.fuX
    public void mUb() {
        GJW.C.nr(this.f44146S, null, null, new SPz(null), 3, null);
    }

    @Override // kgE.fuX
    public void n() {
        XoT.C.Uo(this, new Function0() { // from class: kgE.nKK
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.account.n.Lp6();
            }
        });
        if (!HI0.aC.n()) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.bzg) {
            return;
        }
        this.bzg = true;
        Context applicationContext = IvA.n.rl().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        XoT.fuX.ViF(applicationContext, new Function1() { // from class: kgE.DAz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.alightcreative.account.n.g6(this.f70068n, ((Boolean) obj).booleanValue());
            }
        });
        xzo(this, false, 1, null);
        mUb();
        GJW.C.nr(this.f44146S, null, null, new C1687c(null), 3, null);
        GJW.C.nr(this.f44146S, null, null, new s4(null), 3, null);
    }

    @Override // kgE.fuX
    public rv6 nr() {
        return this.qie;
    }

    @Override // kgE.fuX
    public rv6 o() {
        return this.ty;
    }

    @Override // kgE.fuX
    public void qie() {
        XoT.C.KN("IAP", new Function0() { // from class: kgE.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.account.n.I9f();
            }
        });
        xzo(this, false, 1, null);
    }

    @Override // kgE.fuX
    public Object r(Continuation continuation) {
        Object objAwait = this.rV9.await(continuation);
        return objAwait == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwait : Unit.INSTANCE;
    }

    @Override // kgE.fuX
    public boolean rl() {
        return this.f44150Z;
    }

    @Override // kgE.fuX
    public void t() {
        GJW.C.nr(this.f44146S, null, null, new UGc(null), 3, null);
    }

    @Override // kgE.fuX
    public void xMQ() {
        XoT.C.KN("IAP", new Function0() { // from class: kgE.Dsr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.alightcreative.account.n.Uf();
            }
        });
        this.f44153n.Uo();
        this.jB = true;
        Th(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Bu(FirebaseFirestoreException firebaseFirestoreException) {
        return "IAP: accountDocumentError: " + firebaseFirestoreException.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String EF(List list) {
        return "IAP: computeActiveLicenses: allActiveLicenses:" + list.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HBN(FirebaseFirestoreException firebaseFirestoreException) {
        return "IAP: cloudConfigError: " + firebaseFirestoreException.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String JVN(List list) {
        return "IAP: computeActiveLicenses: activeAccountLicenses:" + list.size() + " : " + list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String X4T(Collection collection) {
        return "IAP: computeActiveLicenses: validLocalPurchases:" + collection.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Zmq(List list) {
        return "IAP: computeActiveLicenses: localLicenses:" + list.size();
    }

    private final int j(Period period) {
        int i2 = I28.$EnumSwitchMapping$1[period.getTimeUnit().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        return period.getValue() * 365;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return period.getValue() * 30;
            }
            return period.getValue() * 7;
        }
        return period.getValue();
    }

    private final List n7b() {
        if (((Boolean) ck().getValue()).booleanValue() && Intrinsics.areEqual(getUid(), this.fD)) {
            return this.iF;
        }
        if (!((Boolean) ck().getValue()).booleanValue()) {
            List list = this.f44152g;
            if (list == null) {
                return CollectionsKt.emptyList();
            }
            return list;
        }
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String xVH(List list) {
        return "IAP: computeActiveLicenses: activeLocalLicenses:" + list.size();
    }
}
