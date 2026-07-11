package SFf;

import GJW.vd;
import SFf.Z;
import androidx.view.MutableLiveData;
import androidx.view.ViewModelKt;
import com.bendingspoons.legal.privacy.Tracker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class afx extends R7M.n {
    public static final int gh = 8;
    private final List J2;
    private final List KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Pr.w6 f8986O;
    private final kHp.w6 Uo;
    private Map mUb;
    private final boolean nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final K0.n f8987t;
    private Map xMQ;

    static final class CN3 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f8988n;

        CN3(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return afx.this.new CN3(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f8988n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                K0.n nVar = afx.this.f8987t;
                this.f8988n = 1;
                obj = nVar.n(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return new Z.j.n(((Ds.w6) obj).n());
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((CN3) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Dsr extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f8990O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f8991S;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f8993n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f8994o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f8995r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f8996t;

        Dsr(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f8994o = obj;
            this.f8991S |= Integer.MIN_VALUE;
            return afx.this.E2(null, this);
        }
    }

    static final class I28 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f8997n;

        I28(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return afx.this.new I28(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f8997n == 0) {
                ResultKt.throwOnFailure(obj);
                afx.this.Uo.xMQ();
                return new Z.j.C0307j(false);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((I28) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Ml extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f8999n;

        Ml(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return afx.this.new Ml(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f8999n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                List listZ = afx.this.Z();
                afx afxVar = afx.this;
                Iterator it = listZ.iterator();
                while (it.hasNext()) {
                    afxVar.iF((Ew) it.next(), true);
                }
                afx.this.Uo.KN();
                afx afxVar2 = afx.this;
                kHp.n nVar = kHp.n.f69821t;
                this.f8999n = 1;
                if (afxVar2.r(nVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return new Z.j.C0307j(true);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Ml) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Wre extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f9001n;

        Wre(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return afx.this.new Wre(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f9001n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                List listZ = afx.this.Z();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listZ) {
                    if (((Ew) obj2).n() != Pr.Ml.f7844n) {
                        arrayList.add(obj2);
                    }
                }
                afx afxVar = afx.this;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    afxVar.iF((Ew) it.next(), false);
                }
                afx.this.Uo.mUb();
                afx afxVar2 = afx.this;
                kHp.n nVar = kHp.n.J2;
                this.f9001n = 1;
                if (afxVar2.r(nVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return new Z.j.C0307j(true);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Wre) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class fuX extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f9003n;

        fuX(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return afx.this.new fuX(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f9003n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                afx.this.Uo.qie();
                afx afxVar = afx.this;
                kHp.n nVar = kHp.n.f69818O;
                this.f9003n = 1;
                if (afxVar.r(nVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return new Z.j.C0307j(true);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((fuX) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f9005n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return afx.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean zXQ;
            boolean zIsEnabled;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f9005n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Pr.w6 w6Var = afx.this.f8986O;
                this.f9005n = 1;
                obj = w6Var.t(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Map map = (Map) obj;
            afx afxVar = afx.this;
            List<Tracker> list = afxVar.J2;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (Tracker tracker : list) {
                String name = tracker.getName();
                Boolean bool = (Boolean) map.get(tracker.getName());
                if (bool != null) {
                    zIsEnabled = bool.booleanValue();
                } else {
                    zIsEnabled = tracker.isEnabled();
                }
                Pair pair = TuplesKt.to(name, new MutableLiveData(Boxing.boxBoolean(zIsEnabled)));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            afxVar.xMQ = linkedHashMap;
            afx afxVar2 = afx.this;
            EnumEntries enumEntriesRl = Pr.Ml.rl();
            afx afxVar3 = afx.this;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(enumEntriesRl, 10)), 16));
            for (Object obj2 : enumEntriesRl) {
                Pr.Ml ml = (Pr.Ml) obj2;
                if (ml != Pr.Ml.f7844n) {
                    zXQ = afxVar3.XQ(ml);
                } else {
                    zXQ = true;
                }
                linkedHashMap2.put(obj2, new MutableLiveData(Boxing.boxBoolean(zXQ)));
            }
            afxVar2.mUb = linkedHashMap2;
            afx afxVar4 = afx.this;
            afxVar4.nr(Z.rl(afx.J2(afxVar4), false, afx.this.mUb, afx.this.xMQ, null, 8, null));
            return Unit.INSTANCE;
        }
    }

    static final class n extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f9007O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f9008n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f9009o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f9011t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f9009o |= Integer.MIN_VALUE;
            return afx.this.r(null, this);
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ afx f9012O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f9013n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f9014t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(Function1 function1, afx afxVar, Continuation continuation) {
            super(2, continuation);
            this.f9014t = function1;
            this.f9012O = afxVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new w6(this.f9014t, this.f9012O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f9013n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Function1 function1 = this.f9014t;
                this.f9013n = 1;
                obj = function1.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Z.j jVar = (Z.j) obj;
            afx afxVar = this.f9012O;
            afxVar.nr(Z.rl(afx.J2(afxVar), false, null, null, jVar, 6, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afx(K0.n legal, Function2 trackEvent, boolean z2) {
        super(new Z(true, null, null, null, 14, null));
        Intrinsics.checkNotNullParameter(legal, "legal");
        Intrinsics.checkNotNullParameter(trackEvent, "trackEvent");
        this.f8987t = legal;
        this.nr = z2;
        Pr.w6 w6VarUo = legal.Uo();
        this.f8986O = w6VarUo;
        List<Tracker> listKN = w6VarUo.KN();
        this.J2 = listKN;
        this.Uo = new kHp.w6(trackEvent, legal.J2());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listKN, 10));
        for (Tracker tracker : listKN) {
            arrayList.add(new Ew(tracker.getName(), tracker.getCategory(), tracker.getDescription(), tracker.getRetentionDuration(), tracker.getPrivacyPolicyEntries()));
        }
        this.KN = arrayList;
        this.xMQ = MapsKt.emptyMap();
        this.mUb = MapsKt.emptyMap();
        this.Uo.gh();
        GJW.C.nr(ViewModelKt.n(this), null, null, new j(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E2(kHp.n nVar, Continuation continuation) {
        Dsr dsr;
        afx afxVar;
        kHp.n nVar2;
        String str;
        kHp.n nVar3;
        Object objT;
        String str2;
        afx afxVar2;
        kHp.w6 w6Var;
        kHp.n nVar4;
        String str3;
        if (continuation instanceof Dsr) {
            dsr = (Dsr) continuation;
            int i2 = dsr.f8991S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dsr.f8991S = i2 - Integer.MIN_VALUE;
            } else {
                dsr = new Dsr(continuation);
            }
        }
        Object objN = dsr.f8994o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dsr.f8991S;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            K0.n nVar5 = this.f8987t;
            dsr.f8993n = this;
            dsr.f8996t = nVar;
            dsr.f8991S = 1;
            objN = nVar5.n(dsr);
            if (objN != coroutine_suspended) {
                afxVar = this;
                nVar2 = nVar;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                w6Var = (kHp.w6) dsr.f8995r;
                String str4 = (String) dsr.J2;
                String str5 = (String) dsr.f8990O;
                kHp.n nVar6 = (kHp.n) dsr.f8996t;
                afxVar2 = (afx) dsr.f8993n;
                ResultKt.throwOnFailure(objN);
                str2 = str4;
                nVar4 = nVar6;
                str3 = str5;
                w6Var.n((Map) objN, afxVar2.J2, str3, str2, nVar4, afxVar2.nr);
                return Unit.INSTANCE;
            }
            str = (String) dsr.f8990O;
            nVar3 = (kHp.n) dsr.f8996t;
            afxVar = (afx) dsr.f8993n;
            ResultKt.throwOnFailure(objN);
            String strRl = ((Ds.Ml) objN).rl();
            kHp.w6 w6Var2 = afxVar.Uo;
            Pr.w6 w6Var3 = afxVar.f8986O;
            dsr.f8993n = afxVar;
            dsr.f8996t = nVar3;
            dsr.f8990O = str;
            dsr.J2 = strRl;
            dsr.f8995r = w6Var2;
            dsr.f8991S = 3;
            objT = w6Var3.t(dsr);
            if (objT != coroutine_suspended) {
                afx afxVar3 = afxVar;
                str2 = strRl;
                objN = objT;
                afxVar2 = afxVar3;
                w6Var = w6Var2;
                nVar4 = nVar3;
                str3 = str;
                w6Var.n((Map) objN, afxVar2.J2, str3, str2, nVar4, afxVar2.nr);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        nVar2 = (kHp.n) dsr.f8996t;
        afxVar = (afx) dsr.f8993n;
        ResultKt.throwOnFailure(objN);
        String strRl2 = ((Ds.w6) objN).rl();
        K0.n nVar7 = afxVar.f8987t;
        dsr.f8993n = afxVar;
        dsr.f8996t = nVar2;
        dsr.f8990O = strRl2;
        dsr.f8991S = 2;
        Object objO = nVar7.O(dsr);
        if (objO != coroutine_suspended) {
            kHp.n nVar8 = nVar2;
            str = strRl2;
            objN = objO;
            nVar3 = nVar8;
            String strRl3 = ((Ds.Ml) objN).rl();
            kHp.w6 w6Var22 = afxVar.Uo;
            Pr.w6 w6Var32 = afxVar.f8986O;
            dsr.f8993n = afxVar;
            dsr.f8996t = nVar3;
            dsr.f8990O = str;
            dsr.J2 = strRl3;
            dsr.f8995r = w6Var22;
            dsr.f8991S = 3;
            objT = w6Var32.t(dsr);
            if (objT != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean XQ(Pr.Ml ml) {
        Boolean bool;
        List list = this.KN;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Ew) obj).n() == ml) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MutableLiveData mutableLiveData = (MutableLiveData) this.xMQ.get(((Ew) it.next()).t());
            if ((mutableLiveData == null || (bool = (Boolean) mutableLiveData.J2()) == null) ? false : bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        if (r5.E2(r11, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(kHp.n nVar, Continuation continuation) {
        n nVar2;
        kHp.n nVar3;
        Iterator it;
        afx afxVar;
        Boolean bool;
        if (continuation instanceof n) {
            nVar2 = (n) continuation;
            int i2 = nVar2.f9009o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar2.f9009o = i2 - Integer.MIN_VALUE;
            } else {
                nVar2 = new n(continuation);
            }
        }
        Object obj = nVar2.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar2.f9009o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            nVar3 = nVar;
            it = this.J2.iterator();
            afxVar = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            it = (Iterator) nVar2.f9007O;
            kHp.n nVar4 = (kHp.n) nVar2.f9011t;
            afxVar = (afx) nVar2.f9008n;
            ResultKt.throwOnFailure(obj);
            nVar3 = nVar4;
        }
        while (true) {
            if (it.hasNext()) {
                Tracker tracker = (Tracker) it.next();
                Pr.w6 w6Var = afxVar.f8986O;
                String name = tracker.getName();
                MutableLiveData mutableLiveData = (MutableLiveData) afxVar.xMQ.get(tracker.getName());
                boolean zBooleanValue = (mutableLiveData == null || (bool = (Boolean) mutableLiveData.J2()) == null) ? false : bool.booleanValue();
                nVar2.f9008n = afxVar;
                nVar2.f9011t = nVar3;
                nVar2.f9007O = it;
                nVar2.f9009o = 1;
                if (w6Var.J2(name, zBooleanValue, nVar2) == coroutine_suspended) {
                    break;
                }
            } else {
                nVar2.f9008n = null;
                nVar2.f9011t = null;
                nVar2.f9007O = null;
                nVar2.f9009o = 2;
            }
        }
        return coroutine_suspended;
    }

    public final void S() {
        o(new Ml(null));
    }

    public final void ViF() {
        o(new Wre(null));
    }

    public final void WPU() {
        o(new I28(null));
    }

    public final List Z() {
        return this.KN;
    }

    public final void aYN(Pr.Ml category, boolean z2) {
        Intrinsics.checkNotNullParameter(category, "category");
        MutableLiveData mutableLiveData = (MutableLiveData) this.mUb.get(category);
        if (mutableLiveData != null) {
            mutableLiveData.ty(Boolean.valueOf(z2));
        }
        List list = this.KN;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Ew) obj).n() == category) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MutableLiveData mutableLiveData2 = (MutableLiveData) this.xMQ.get(((Ew) it.next()).t());
            if (mutableLiveData2 != null) {
                mutableLiveData2.ck(Boolean.valueOf(z2));
            }
        }
    }

    public final void g() {
        o(new fuX(null));
    }

    public final void iF(Ew tracker, boolean z2) {
        boolean zBooleanValue;
        MutableLiveData mutableLiveData;
        Boolean bool;
        Boolean bool2;
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        MutableLiveData mutableLiveData2 = (MutableLiveData) this.xMQ.get(tracker.t());
        if (mutableLiveData2 != null) {
            mutableLiveData2.ck(Boolean.valueOf(z2));
        }
        List list = this.KN;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Ew ew = (Ew) obj;
            if (ew.n() == tracker.n() && !Intrinsics.areEqual(ew, tracker)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            zBooleanValue = false;
            if (!it.hasNext()) {
                break;
            }
            MutableLiveData mutableLiveData3 = (MutableLiveData) this.xMQ.get(((Ew) it.next()).t());
            if (mutableLiveData3 != null && (bool2 = (Boolean) mutableLiveData3.J2()) != null) {
                zBooleanValue = bool2.booleanValue();
            }
            arrayList2.add(Boolean.valueOf(zBooleanValue));
        }
        List listPlus = CollectionsKt.plus((Collection<? extends Boolean>) arrayList2, Boolean.valueOf(z2));
        MutableLiveData mutableLiveData4 = (MutableLiveData) this.mUb.get(tracker.n());
        boolean zBooleanValue2 = (mutableLiveData4 == null || (bool = (Boolean) mutableLiveData4.J2()) == null) ? false : bool.booleanValue();
        if (listPlus == null || !listPlus.isEmpty()) {
            Iterator it2 = listPlus.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((Boolean) it2.next()).booleanValue()) {
                        zBooleanValue = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (zBooleanValue2 == zBooleanValue || (mutableLiveData = (MutableLiveData) this.mUb.get(tracker.n())) == null) {
            return;
        }
        mutableLiveData.ty(Boolean.valueOf(zBooleanValue));
    }

    public final void nY() {
        o(new CN3(null));
    }

    public final void te(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        nr(Z.rl((Z) rl(), false, null, null, new Z.j.n(url), 7, null));
    }

    public static final /* synthetic */ Z J2(afx afxVar) {
        return (Z) afxVar.rl();
    }

    private final void o(Function1 function1) {
        if (((Z) rl()).J2()) {
            return;
        }
        nr(Z.rl((Z) rl(), true, null, null, null, 14, null));
        GJW.C.nr(ViewModelKt.n(this), null, null, new w6(function1, this, null), 3, null);
    }

    public final void fD() {
        nr(Z.rl((Z) rl(), false, null, null, null, 7, null));
    }
}
