package ujA;

import GJW.C;
import GJW.Lu;
import GJW.OU;
import GJW.iwV;
import GJW.lej;
import GJW.vd;
import GJW.yg;
import ajd.j;
import cb.InterfaceC1679Ml;
import cb.InterfaceC1682w6;
import com.bendingspoons.concierge.domain.entities.Id;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class n {
    public static final j J2 = new j(null);
    private static final long KN;
    private static final long Uo;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final vd f74577O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC1679Ml f74578n;
    private final Function0 nr;
    private final InterfaceC1682w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final rB.Ml f74579t;

    static final class CN3 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f74580O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f74581n;

        CN3(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f74581n = obj;
            this.f74580O |= Integer.MIN_VALUE;
            return n.this.xMQ(this);
        }
    }

    /* synthetic */ class Dsr extends FunctionReferenceImpl implements Function1, SuspendFunction {
        Dsr(Object obj) {
            super(1, obj, InterfaceC1682w6.class, "warmUp", "warmUp(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((InterfaceC1682w6) this.receiver).rl(continuation);
        }
    }

    static final class Ml extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f74583O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74584n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f74585r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f74586t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f74583O = obj;
            this.f74585r |= Integer.MIN_VALUE;
            return n.this.Uo(this);
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f74587n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        Wre(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return n.this.new Wre(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f74587n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                n nVar = n.this;
                this.f74587n = 1;
                if (nVar.Uo(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class fuX extends FunctionReferenceImpl implements Function1, SuspendFunction {
        fuX(Object obj) {
            super(1, obj, InterfaceC1679Ml.class, "warmUp", "warmUp(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((InterfaceC1679Ml) this.receiver).rl(continuation);
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX INFO: renamed from: ujA.n$n, reason: collision with other inner class name */
    static final class C1230n extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f74589O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f74590S;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74592n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f74593o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f74594r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f74595t;

        C1230n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f74593o = obj;
            this.f74590S |= Integer.MIN_VALUE;
            return n.this.O(0, this);
        }
    }

    public static final class w6 extends SuspendLambda implements Function2 {
        final /* synthetic */ n J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Iterable f74596O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f74597n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f74598t;

        public static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ n J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Object f74599O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f74600n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f74601t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(Object obj, Continuation continuation, n nVar) {
                super(2, continuation);
                this.f74599O = obj;
                this.J2 = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f74599O, continuation, this.J2);
                jVar.f74601t = obj;
                return jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String str;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f74600n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        str = (String) this.f74601t;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Id.Predefined.External.j jVar = (Id.Predefined.External.j) this.f74599O;
                    String strN = jVar.n();
                    InterfaceC1682w6 interfaceC1682w6 = this.J2.rl;
                    this.f74601t = strN;
                    this.f74600n = 1;
                    obj = interfaceC1682w6.t(jVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = strN;
                }
                return TuplesKt.to(str, obj);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(Iterable iterable, Continuation continuation, n nVar) {
            super(2, continuation);
            this.f74596O = iterable;
            this.J2 = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            w6 w6Var = new w6(this.f74596O, continuation, this.J2);
            w6Var.f74598t = obj;
            return w6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f74597n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            vd vdVar = (vd) this.f74598t;
            Iterable iterable = this.f74596O;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(C.rl(vdVar, null, null, new j(it.next(), null, this.J2), 3, null));
            }
            this.f74597n = 1;
            Object objN = GJW.Wre.n(arrayList, this);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objN;
        }
    }

    public n(InterfaceC1679Ml internalIdManager, InterfaceC1682w6 externalIdManager, rB.Ml spiderSense, Function0 isUserAtLeast13, lej coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(internalIdManager, "internalIdManager");
        Intrinsics.checkNotNullParameter(externalIdManager, "externalIdManager");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        Intrinsics.checkNotNullParameter(isUserAtLeast13, "isUserAtLeast13");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        this.f74578n = internalIdManager;
        this.rl = externalIdManager;
        this.f74579t = spiderSense;
        this.nr = isUserAtLeast13;
        this.f74577O = Lu.n(coroutineDispatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object xMQ(Continuation continuation) {
        CN3 cn3;
        if (continuation instanceof CN3) {
            cn3 = (CN3) continuation;
            int i2 = cn3.f74580O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cn3.f74580O = i2 - Integer.MIN_VALUE;
            } else {
                cn3 = new CN3(continuation);
            }
        }
        Object objN = cn3.f74581n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = cn3.f74580O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            Function1[] function1Arr = {new fuX(this.f74578n), new Dsr(this.rl)};
            cn3.f74580O = 1;
            objN = sJa.Dsr.n(function1Arr, cn3);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objN);
        }
        return x0X.w6.t((Collection) objN);
    }

    public static final class I28 extends AbstractCoroutineContextElement implements iwV {
        public I28(iwV.j jVar) {
            super(jVar);
        }

        @Override // GJW.iwV
        public void a(CoroutineContext coroutineContext, Throwable th) {
            th.printStackTrace();
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        Uo = DurationKt.toDuration(500, DurationUnit.MILLISECONDS);
        KN = DurationKt.toDuration(5, DurationUnit.SECONDS);
    }

    private static final pq.Ml J2(List list) {
        pq.Ml ml = new pq.Ml();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String message = ((zD.j) obj).nr().getMessage();
            Object arrayList = linkedHashMap.get(message);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(message, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            List list2 = (List) ((Map.Entry) it.next()).getValue();
            ml.Uo(MRAIDPresenter.ERROR, ((zD.j) CollectionsKt.first(list2)).O());
            ml.nr("occurrences", Integer.valueOf(list2.size()));
        }
        return ml;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f8, code lost:
    
        if (GJW.yg.t(r14, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e3, code lost:
    
        r14 = r2;
        r2 = r8;
        r8 = r9;
        r9 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(int i2, Continuation continuation) {
        C1230n c1230n;
        int i3;
        int i5;
        C1230n c1230n2;
        List arrayList;
        n nVar;
        n nVar2;
        List list;
        int i7;
        int i8;
        boolean z2;
        if (continuation instanceof C1230n) {
            c1230n = (C1230n) continuation;
            int i9 = c1230n.f74590S;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1230n.f74590S = i9 - Integer.MIN_VALUE;
            } else {
                c1230n = new C1230n(continuation);
            }
        }
        Object obj = c1230n.f74593o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = c1230n.f74590S;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            i3 = i2;
            i5 = 0;
            c1230n2 = c1230n;
            arrayList = new ArrayList();
            nVar = this;
            if (i5 < i3) {
            }
        } else if (i10 == 1) {
            i5 = c1230n.f74594r;
            i8 = c1230n.J2;
            i7 = c1230n.f74589O;
            list = (List) c1230n.f74595t;
            nVar2 = (n) c1230n.f74592n;
            ResultKt.throwOnFailure(obj);
            x0X.n nVar3 = (x0X.n) obj;
            z2 = nVar3 instanceof n.C1266n;
            if (z2) {
            }
            if (!z2) {
            }
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i11 = c1230n.J2;
            int i12 = c1230n.f74589O;
            List list2 = (List) c1230n.f74595t;
            n nVar4 = (n) c1230n.f74592n;
            ResultKt.throwOnFailure(obj);
            i3 = i12;
            c1230n2 = c1230n;
            arrayList = list2;
            nVar = nVar4;
            i5 = i11 + 1;
            if (i5 < i3) {
                c1230n2.f74592n = nVar;
                c1230n2.f74595t = arrayList;
                c1230n2.f74589O = i3;
                c1230n2.J2 = i5;
                c1230n2.f74594r = i5;
                c1230n2.f74590S = 1;
                Object objXMQ = nVar.xMQ(c1230n2);
                if (objXMQ != coroutine_suspended) {
                    nVar2 = nVar;
                    i7 = i3;
                    obj = objXMQ;
                    list = arrayList;
                    c1230n = c1230n2;
                    i8 = i5;
                    x0X.n nVar32 = (x0X.n) obj;
                    z2 = nVar32 instanceof n.C1266n;
                    if (z2) {
                        list.add((zD.j) ((n.C1266n) nVar32).n());
                    } else if (!(nVar32 instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!z2) {
                        if (!(nVar32 instanceof n.w6)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pq.Ml ml = new pq.Ml();
                        ml.nr("retries", Boxing.boxInt(i5));
                        ml.Uo("warmupErrors", J2(list));
                        return new n.w6(ml);
                    }
                    if (i5 == 0) {
                        long j2 = KN;
                        c1230n.f74592n = nVar2;
                        c1230n.f74595t = list;
                        c1230n.f74589O = i7;
                        c1230n.J2 = i8;
                        c1230n.f74590S = 2;
                        if (yg.t(j2, c1230n) != coroutine_suspended) {
                            i11 = i8;
                            i12 = i7;
                            list2 = list;
                            nVar4 = nVar2;
                            i3 = i12;
                            c1230n2 = c1230n;
                            arrayList = list2;
                            nVar = nVar4;
                            i5 = i11 + 1;
                        }
                    } else {
                        long j3 = Uo;
                        c1230n.f74592n = nVar2;
                        c1230n.f74595t = list;
                        c1230n.f74589O = i7;
                        c1230n.J2 = i8;
                        c1230n.f74590S = 3;
                    }
                    if (i5 < i3) {
                        pq.Ml ml2 = new pq.Ml();
                        ml2.nr("retries", Boxing.boxInt(i3));
                        ml2.Uo("warmupErrors", J2(arrayList));
                        return new n.C1266n(ml2);
                    }
                }
                return coroutine_suspended;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Uo(Continuation continuation) {
        Ml ml;
        n nVar;
        pq.Ml ml2;
        n nVar2;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f74585r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f74585r = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object objO = ml.f74583O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.f74585r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objO);
            ml.f74584n = this;
            ml.f74585r = 1;
            objO = O(60, ml);
            if (objO != coroutine_suspended) {
                nVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ml2 = (pq.Ml) ml.f74586t;
            nVar2 = (n) ml.f74584n;
            ResultKt.throwOnFailure(objO);
            for (Pair pair : (Iterable) objO) {
                String str = (String) pair.component1();
                x0X.n nVar3 = (x0X.n) pair.component2();
                if (nVar3 instanceof n.C1266n) {
                    nVar2.f74579t.t(Bvn.j.f686n.O(j.EnumC0481j.J2, "errored_" + str + ".", ((zD.j) ((n.C1266n) nVar3).n()).O().rl(ml2)));
                    return Unit.INSTANCE;
                }
                if (!(nVar3 instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((Id.Predefined.External) ((n.w6) nVar3).n()) == null) {
                    nVar2.f74579t.t(Bvn.j.f686n.O(j.EnumC0481j.J2, "null_" + str, ml2));
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
        nVar = (n) ml.f74584n;
        ResultKt.throwOnFailure(objO);
        x0X.n nVar4 = (x0X.n) objO;
        if (nVar4 instanceof n.C1266n) {
            nVar.f74579t.t(Bvn.j.f686n.O(j.EnumC0481j.f13104r, "warmupFailed", (pq.Ml) ((n.C1266n) nVar4).n()));
            return Unit.INSTANCE;
        }
        if (!(nVar4 instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        pq.Ml ml3 = (pq.Ml) ((n.w6) nVar4).n();
        boolean zBooleanValue = ((Boolean) nVar.nr.invoke()).booleanValue();
        Set setN = ujA.w6.n();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setN) {
            Id.Predefined.External.j jVar = (Id.Predefined.External.j) obj;
            if (zBooleanValue || jVar.t()) {
                arrayList.add(obj);
            }
        }
        w6 w6Var = new w6(arrayList, null, nVar);
        ml.f74584n = nVar;
        ml.f74586t = ml3;
        ml.f74585r = 2;
        Object objJ2 = Lu.J2(w6Var, ml);
        if (objJ2 != coroutine_suspended) {
            ml2 = ml3;
            objO = objJ2;
            nVar2 = nVar;
            while (r10.hasNext()) {
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    public void KN() {
        C.nr(this.f74577O, new I28(iwV.rl), null, new Wre(null), 2, null);
    }

    public /* synthetic */ n(InterfaceC1679Ml interfaceC1679Ml, InterfaceC1682w6 interfaceC1682w6, rB.Ml ml, Function0 function0, lej lejVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC1679Ml, interfaceC1682w6, ml, function0, (i2 & 16) != 0 ? OU.rl() : lejVar);
    }
}
