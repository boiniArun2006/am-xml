package kHp;

import com.bendingspoons.legal.privacy.Tracker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class o implements Pr.w6 {
    private final Map nr;
    private final Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f69823t;

    static final class j extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f69824O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f69825n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f69826o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f69828t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f69826o |= Integer.MIN_VALUE;
            return o.this.Uo(this);
        }
    }

    static final class n extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f69829O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f69830n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f69831o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f69833t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f69831o |= Integer.MIN_VALUE;
            return o.this.nr(null, this);
        }
    }

    static final class w6 extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f69834O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f69835n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f69836o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f69838t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f69836o |= Integer.MIN_VALUE;
            return o.this.ck(null, this);
        }
    }

    public o(Wre repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.rl = repository;
        this.nr = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(o oVar, String str, boolean z2, Map preferences, Map categories) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Tracker tracker = (Tracker) oVar.nr.get(str);
        if (tracker != null) {
            tracker.setEnabled(z2);
            preferences.put(str, Boolean.valueOf(z2));
            categories.put(tracker.getCategory(), Boolean.valueOf(oVar.qie(preferences, tracker.getCategory())));
        }
        return Unit.INSTANCE;
    }

    private final boolean az(Map map, Pr.Ml ml) {
        Collection collectionValues = this.nr.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((Tracker) obj).getCategory() == ml) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((Boolean) map.get(((Tracker) it.next()).getName()));
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.areEqual((Boolean) it2.next(), Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        if (r11.O(r10, r0) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ck(Function2 function2, Continuation continuation) {
        w6 w6Var;
        o oVar;
        Function2 function22;
        Map map;
        o oVar2;
        Wre wre;
        int i2;
        Map map2;
        o oVar3;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i3 = w6Var.f69836o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w6Var.f69836o = i3 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objT = w6Var.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = w6Var.f69836o;
        if (i5 == 0) {
            ResultKt.throwOnFailure(objT);
            Wre wre2 = this.rl;
            w6Var.f69835n = this;
            w6Var.f69838t = function2;
            w6Var.f69836o = 1;
            objT = wre2.t(w6Var);
            if (objT != coroutine_suspended) {
                oVar = this;
            }
            return coroutine_suspended;
        }
        if (i5 == 1) {
            function2 = (Function2) w6Var.f69838t;
            oVar = (o) w6Var.f69835n;
            ResultKt.throwOnFailure(objT);
        } else {
            if (i5 == 2) {
                map = (Map) w6Var.f69834O;
                function22 = (Function2) w6Var.f69838t;
                oVar2 = (o) w6Var.f69835n;
                ResultKt.throwOnFailure(objT);
                Map mutableMap = MapsKt.toMutableMap((Map) objT);
                function22.invoke(map, mutableMap);
                wre = oVar2.rl;
                i2 = oVar2.f69823t;
                w6Var.f69835n = oVar2;
                w6Var.f69838t = mutableMap;
                w6Var.f69834O = null;
                w6Var.f69836o = 3;
                if (wre.nr(map, i2, w6Var) != coroutine_suspended) {
                    map2 = mutableMap;
                    oVar3 = oVar2;
                    Wre wre3 = oVar3.rl;
                    w6Var.f69835n = null;
                    w6Var.f69838t = null;
                    w6Var.f69836o = 4;
                }
                return coroutine_suspended;
            }
            if (i5 != 3) {
                if (i5 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objT);
                return Unit.INSTANCE;
            }
            map2 = (Map) w6Var.f69838t;
            oVar3 = (o) w6Var.f69835n;
            ResultKt.throwOnFailure(objT);
            Wre wre32 = oVar3.rl;
            w6Var.f69835n = null;
            w6Var.f69838t = null;
            w6Var.f69836o = 4;
        }
        Map mutableMap2 = MapsKt.toMutableMap((Map) objT);
        Wre wre4 = oVar.rl;
        w6Var.f69835n = oVar;
        w6Var.f69838t = function2;
        w6Var.f69834O = mutableMap2;
        w6Var.f69836o = 2;
        Object objRl = wre4.rl(w6Var);
        if (objRl != coroutine_suspended) {
            o oVar4 = oVar;
            function22 = function2;
            map = mutableMap2;
            objT = objRl;
            oVar2 = oVar4;
            Map mutableMap3 = MapsKt.toMutableMap((Map) objT);
            function22.invoke(map, mutableMap3);
            wre = oVar2.rl;
            i2 = oVar2.f69823t;
            w6Var.f69835n = oVar2;
            w6Var.f69838t = mutableMap3;
            w6Var.f69834O = null;
            w6Var.f69836o = 3;
            if (wre.nr(map, i2, w6Var) != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    private final boolean qie(Map map, Pr.Ml ml) {
        Collection collectionValues = this.nr.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((Tracker) obj).getCategory() == ml) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((Boolean) map.get(((Tracker) it.next()).getName()));
        }
        if (arrayList2.isEmpty()) {
            return true;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (!Intrinsics.areEqual((Boolean) it2.next(), Boolean.TRUE)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ty(o oVar, boolean z2, Map preferences, Map categories) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Collection collectionValues = oVar.nr.values();
        ArrayList<Tracker> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((Tracker) obj).getCategory() != Pr.Ml.f7844n) {
                arrayList.add(obj);
            }
        }
        for (Tracker tracker : arrayList) {
            tracker.setEnabled(z2);
            preferences.put(tracker.getName(), Boolean.valueOf(z2));
        }
        Pr.Ml ml = Pr.Ml.f7846t;
        categories.put(ml, Boolean.valueOf(oVar.az(preferences, ml)));
        Pr.Ml ml2 = Pr.Ml.f7843O;
        categories.put(ml2, Boolean.valueOf(oVar.az(preferences, ml2)));
        return Unit.INSTANCE;
    }

    @Override // Pr.w6
    public Object J2(final String str, final boolean z2, Continuation continuation) {
        Object objCk = ck(new Function2() { // from class: kHp.C
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return o.HI(this.f69759n, str, z2, (Map) obj, (Map) obj2);
            }
        }, continuation);
        return objCk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCk : Unit.INSTANCE;
    }

    @Override // Pr.w6
    public List KN() {
        return CollectionsKt.toList(this.nr.values());
    }

    @Override // Pr.w6
    public Object O(Continuation continuation) {
        Object objJ2 = this.rl.J2(this.f69823t, continuation);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Pr.w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Uo(Continuation continuation) {
        j jVar;
        o oVar;
        boolean z2;
        o oVar2;
        int i2;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i3 = jVar.f69826o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jVar.f69826o = i3 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objN = jVar.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = jVar.f69826o;
        boolean z3 = true;
        if (i5 == 0) {
            ResultKt.throwOnFailure(objN);
            Wre wre = this.rl;
            jVar.f69825n = this;
            jVar.f69826o = 1;
            objN = wre.n(jVar);
            if (objN != coroutine_suspended) {
                oVar = this;
            }
            return coroutine_suspended;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = jVar.f69824O;
            z2 = jVar.f69828t;
            oVar2 = (o) jVar.f69825n;
            ResultKt.throwOnFailure(objN);
            Integer num = (Integer) objN;
            Object[] objArr = num != null || num.intValue() < oVar2.f69823t;
            if (i2 != 0 || (objArr == false && z2)) {
                z3 = false;
            }
            return Boxing.boxBoolean(z3);
        }
        oVar = (o) jVar.f69825n;
        ResultKt.throwOnFailure(objN);
        boolean zBooleanValue = ((Boolean) objN).booleanValue();
        int i7 = !oVar.nr.isEmpty() ? 1 : 0;
        Wre wre2 = oVar.rl;
        jVar.f69825n = oVar;
        jVar.f69828t = zBooleanValue;
        jVar.f69824O = i7;
        jVar.f69826o = 2;
        Object objUo = wre2.Uo(jVar);
        if (objUo != coroutine_suspended) {
            o oVar3 = oVar;
            z2 = zBooleanValue;
            objN = objUo;
            oVar2 = oVar3;
            i2 = i7;
            Integer num2 = (Integer) objN;
            if (num2 != null) {
            }
            if (i2 != 0) {
                z3 = false;
            }
            return Boxing.boxBoolean(z3);
        }
        return coroutine_suspended;
    }

    @Override // Pr.w6
    public Object n(Continuation continuation) {
        return this.rl.n(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Pr.w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object nr(Tracker tracker, Continuation continuation) {
        n nVar;
        o oVar;
        Tracker tracker2;
        Boolean bool;
        Tracker tracker3;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f69831o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f69831o = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objT = nVar.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f69831o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objT);
            this.nr.put(tracker.getName(), tracker);
            Wre wre = this.rl;
            nVar.f69830n = this;
            nVar.f69833t = tracker;
            nVar.f69829O = tracker;
            nVar.f69831o = 1;
            objT = wre.t(nVar);
            if (objT != coroutine_suspended) {
                oVar = this;
                tracker2 = tracker;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tracker = (Tracker) nVar.f69833t;
            tracker3 = (Tracker) nVar.f69830n;
            ResultKt.throwOnFailure(objT);
            bool = (Boolean) ((Map) objT).get(tracker3.getCategory());
            boolean zBooleanValue = bool == null ? bool.booleanValue() : false;
            tracker.setEnabled(zBooleanValue);
            return Unit.INSTANCE;
        }
        tracker = (Tracker) nVar.f69829O;
        tracker2 = (Tracker) nVar.f69833t;
        oVar = (o) nVar.f69830n;
        ResultKt.throwOnFailure(objT);
        bool = (Boolean) ((Map) objT).get(tracker2.getName());
        if (bool == null) {
            Wre wre2 = oVar.rl;
            nVar.f69830n = tracker2;
            nVar.f69833t = tracker;
            nVar.f69829O = null;
            nVar.f69831o = 2;
            objT = wre2.rl(nVar);
            if (objT != coroutine_suspended) {
                tracker3 = tracker2;
                bool = (Boolean) ((Map) objT).get(tracker3.getCategory());
                if (bool == null) {
                }
                tracker.setEnabled(zBooleanValue);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        tracker.setEnabled(zBooleanValue);
        return Unit.INSTANCE;
    }

    @Override // Pr.w6
    public Object rl(final boolean z2, Continuation continuation) {
        Object objCk = ck(new Function2() { // from class: kHp.aC
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return o.ty(this.f69815n, z2, (Map) obj, (Map) obj2);
            }
        }, continuation);
        return objCk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCk : Unit.INSTANCE;
    }

    @Override // Pr.w6
    public Object t(Continuation continuation) {
        return this.rl.t(continuation);
    }
}
