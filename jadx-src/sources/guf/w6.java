package guf;

import com.bendingspoons.spidersense.domain.entities.CompleteDebugEvent;
import com.bendingspoons.spidersense.domain.entities.j;
import ifA.w6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class w6 implements CU.j {
    public static final j KN = new j(null);
    public static final int xMQ = 8;
    private final v8.j J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final cA.I28 f67879O;
    private final Set Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function0 f67880n;
    private final Function2 nr;
    private final Function0 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final cA.Ml f67881t;

    static final class I28 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f67882n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f67883t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(Function1 function1, Continuation continuation) {
            super(1, continuation);
            this.f67883t = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new I28(this.f67883t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f67882n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function1 function1 = this.f67883t;
            this.f67882n = 1;
            Object objInvoke = function1.invoke(this);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objInvoke;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((I28) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Ml extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f67884O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f67885n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f67886r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f67887t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67884O = obj;
            this.f67886r |= Integer.MIN_VALUE;
            return w6.this.xMQ(this);
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
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f67888O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f67889n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f67890o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f67892t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f67890o |= Integer.MIN_VALUE;
            return w6.this.rl(null, false, false, null, this);
        }
    }

    /* JADX INFO: renamed from: guf.w6$w6, reason: collision with other inner class name */
    static final class C0952w6 extends SuspendLambda implements Function1 {
        final /* synthetic */ boolean E2;
        double J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f67893O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ j.C0739j f67894S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ ajd.j f67895Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f67896e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f67897g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f67898n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f67900r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f67901t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0952w6(ajd.j jVar, j.C0739j c0739j, boolean z2, boolean z3, List list, Continuation continuation) {
            super(1, continuation);
            this.f67895Z = jVar;
            this.f67894S = c0739j;
            this.f67897g = z2;
            this.E2 = z3;
            this.f67896e = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return w6.this.new C0952w6(this.f67895Z, this.f67894S, this.f67897g, this.E2, this.f67896e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            ajd.j jVar;
            Function2 function2;
            double d2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f67900r;
            if (i2 != 0) {
                if (i2 == 1) {
                    double d4 = this.J2;
                    ajd.j jVar2 = (ajd.j) this.f67893O;
                    Function2 function22 = (Function2) this.f67901t;
                    str = (String) this.f67898n;
                    ResultKt.throwOnFailure(obj);
                    jVar = jVar2;
                    function2 = function22;
                    d2 = d4;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Function2 function23 = w6.this.nr;
                ajd.j jVar3 = this.f67895Z;
                str = (String) w6.this.f67880n.invoke();
                double dDoubleValue = ((Number) w6.this.rl.invoke()).doubleValue();
                w6 w6Var = w6.this;
                this.f67898n = str;
                this.f67901t = function23;
                this.f67893O = jVar3;
                this.J2 = dDoubleValue;
                this.f67900r = 1;
                Object objXMQ = w6Var.xMQ(this);
                if (objXMQ == coroutine_suspended) {
                    return coroutine_suspended;
                }
                jVar = jVar3;
                obj = objXMQ;
                function2 = function23;
                d2 = dDoubleValue;
            }
            return function2.invoke(jVar, new com.bendingspoons.spidersense.domain.entities.j(str, d2, this.f67894S, (Map) obj, this.f67897g, this.E2, this.f67896e));
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((C0952w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public w6(Function0 idProvider, Function0 timestampProvider, cA.Ml deviceInfoProvider, Function2 eventConverter, cA.I28 eventDeposit, v8.j localLogger) {
        Intrinsics.checkNotNullParameter(idProvider, "idProvider");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        Intrinsics.checkNotNullParameter(eventConverter, "eventConverter");
        Intrinsics.checkNotNullParameter(eventDeposit, "eventDeposit");
        Intrinsics.checkNotNullParameter(localLogger, "localLogger");
        this.f67880n = idProvider;
        this.rl = timestampProvider;
        this.f67881t = deviceInfoProvider;
        this.nr = eventConverter;
        this.f67879O = eventDeposit;
        this.J2 = localLogger;
        this.Uo = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0067 -> B:20:0x006a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object xMQ(Continuation continuation) {
        Ml ml;
        Collection arrayList;
        Iterator it;
        Map mapN;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f67886r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f67886r = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object objUo = ml.f67884O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.f67886r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            Set set = this.Uo;
            arrayList = new ArrayList();
            it = set.iterator();
            Object next = null;
            if (it.hasNext()) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) ml.f67887t;
            arrayList = (Collection) ml.f67885n;
            ResultKt.throwOnFailure(objUo);
            x0X.n c1266n = (x0X.n) objUo;
            if (c1266n instanceof n.C1266n) {
                c1266n = new n.C1266n(new ifA.w6("SpiderSenseEventProcessor", w6.n.f68148O, w6.j.f68147t, "A registered info provider threw an exception.", (Throwable) ((n.C1266n) c1266n).n(), null, 32, null));
            } else if (!(c1266n instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            if (c1266n instanceof n.C1266n) {
                ifA.Ml.n((ifA.w6) ((n.C1266n) c1266n).n());
            } else if (!(c1266n instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            pq.Ml ml2 = (pq.Ml) x0X.w6.nr(c1266n);
            if (ml2 != null) {
                arrayList.add(ml2);
            }
            Object next2 = null;
            if (it.hasNext()) {
                I28 i28 = new I28((Function1) it.next(), null);
                ml.f67885n = arrayList;
                ml.f67887t = it;
                ml.f67886r = 1;
                objUo = x0X.w6.Uo(i28, ml);
                if (objUo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                x0X.n c1266n2 = (x0X.n) objUo;
                if (c1266n2 instanceof n.C1266n) {
                }
                if (c1266n2 instanceof n.C1266n) {
                }
                pq.Ml ml22 = (pq.Ml) x0X.w6.nr(c1266n2);
                if (ml22 != null) {
                }
                Object next22 = null;
                if (it.hasNext()) {
                    Iterator it2 = ((List) arrayList).iterator();
                    if (it2.hasNext()) {
                        next22 = it2.next();
                        while (it2.hasNext()) {
                            next22 = ((pq.Ml) next22).rl((pq.Ml) it2.next());
                        }
                    }
                    pq.Ml ml3 = (pq.Ml) next22;
                    return (ml3 == null || (mapN = ml3.n()) == null) ? MapsKt.emptyMap() : mapN;
                }
            }
        }
    }

    @Override // CU.j
    public void n(Function1 infoProvider) {
        Intrinsics.checkNotNullParameter(infoProvider, "infoProvider");
        this.Uo.add(infoProvider);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0117, code lost:
    
        if (r0 == r9) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // CU.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(ajd.j jVar, boolean z2, boolean z3, List list, Continuation continuation) {
        n nVar;
        final ajd.j jVar2;
        w6 w6Var;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f67890o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f67890o = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        n nVar2 = nVar;
        Object objUo = nVar2.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar2.f67890o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            x0X.n nVarN = this.f67881t.n();
            boolean z4 = nVarN instanceof n.C1266n;
            if (z4) {
                ifA.Ml.n((ifA.w6) ((n.C1266n) nVarN).n());
            } else if (!(nVarN instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z4) {
                return Unit.INSTANCE;
            }
            if (!(nVarN instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            jVar2 = jVar;
            C0952w6 c0952w6 = new C0952w6(jVar2, (j.C0739j) ((n.w6) nVarN).n(), z2, z3, list, null);
            nVar2.f67889n = this;
            nVar2.f67892t = jVar2;
            nVar2.f67890o = 1;
            objUo = x0X.w6.Uo(c0952w6, nVar2);
            if (objUo != coroutine_suspended) {
                w6Var = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar2 = (ajd.j) nVar2.f67892t;
            w6Var = (w6) nVar2.f67889n;
            ResultKt.throwOnFailure(objUo);
            x0X.n nVar3 = (x0X.n) objUo;
            boolean z5 = nVar3 instanceof n.C1266n;
            if (z5) {
                ifA.Ml.n((ifA.w6) ((n.C1266n) nVar3).n());
            } else if (!(nVar3 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!z5) {
                if (!(nVar3 instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                v8.n.O(w6Var.J2, new Function0() { // from class: guf.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w6.KN(jVar2);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        jVar2 = (ajd.j) nVar2.f67892t;
        w6Var = (w6) nVar2.f67889n;
        ResultKt.throwOnFailure(objUo);
        Object c1266n = (x0X.n) objUo;
        if (c1266n instanceof n.C1266n) {
            Throwable th = (Throwable) ((n.C1266n) c1266n).n();
            c1266n = new n.C1266n(new ifA.w6("SpiderSenseEventProcessor", w6.n.f68148O, w6.j.f68145n, "Unable to convert " + jVar2.t() + " into a CompleteDebugEvent.", th, null, 32, null));
        } else if (!(c1266n instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z6 = c1266n instanceof n.C1266n;
        if (z6) {
            ifA.Ml.n((ifA.w6) ((n.C1266n) c1266n).n());
        } else if (!(c1266n instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!z6) {
            if (!(c1266n instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            CompleteDebugEvent completeDebugEvent = (CompleteDebugEvent) ((n.w6) c1266n).n();
            cA.I28 i28 = w6Var.f67879O;
            nVar2.f67889n = w6Var;
            nVar2.f67892t = jVar2;
            nVar2.f67888O = c1266n;
            nVar2.f67890o = 2;
            objUo = i28.n(completeDebugEvent, nVar2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String KN(ajd.j jVar) {
        return "Event persisted locally: " + jVar.t() + ".";
    }
}
