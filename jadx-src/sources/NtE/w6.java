package NtE;

import GJW.Lu;
import GJW.OU;
import GJW.P;
import GJW.V1;
import GJW.ci;
import GJW.vd;
import LQ.j;
import MoG.Xo;
import MoG.eO;
import Q6.Ml;
import android.content.Context;
import android.net.Uri;
import com.bendingspoons.fellini.utils.either.UnhandledFailureException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class w6 implements Q6.Ml {
    public static final j KN = new j(null);
    private final Map J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final n f7152O;
    private final yB.j Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f7153n;
    private final vd nr;
    private final VD.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final F3.n f7154t;

    static final class C extends SuspendLambda implements Function2 {
        final /* synthetic */ w6 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Q6.w6 f7155O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7156n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ P f7157t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C(P p2, Q6.w6 w6Var, w6 w6Var2, Continuation continuation) {
            super(2, continuation);
            this.f7157t = p2;
            this.f7155O = w6Var;
            this.J2 = w6Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C(this.f7157t, this.f7155O, this.J2, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (r5 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f7156n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        LQ.j jVar = (LQ.j) obj;
                        w6 w6Var = this.J2;
                        Q6.w6 w6Var2 = this.f7155O;
                        if (!(jVar instanceof j.n) && (jVar instanceof j.w6)) {
                            w6Var.ck((as.n) ((j.w6) jVar).n(), w6Var2);
                        }
                        return TuplesKt.to(this.f7155O.n(), jVar);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                P p2 = this.f7157t;
                this.f7156n = 1;
                obj = p2.await(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            d2n.Wre wreNr = NtE.Ml.nr(this.f7155O.t());
            this.f7156n = 2;
            obj = ((Fs8.j) obj).n(wreNr, this);
        }
    }

    static final class CN3 extends SuspendLambda implements Function2 {
        final /* synthetic */ w6 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Ml.j f7158O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7159n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f7160t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((CN3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CN3(Ml.j jVar, w6 w6Var, Continuation continuation) {
            super(2, continuation);
            this.f7158O = jVar;
            this.J2 = w6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            CN3 cn3 = new CN3(this.f7158O, this.J2, continuation);
            cn3.f7160t = obj;
            return cn3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UnhandledFailureException {
            w6 w6Var;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f7159n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                w6Var = (w6) this.f7160t;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f7160t;
                Set setRl = this.f7158O.rl();
                w6 w6Var2 = this.J2;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setRl, 10));
                Iterator it = setRl.iterator();
                while (it.hasNext()) {
                    arrayList.add(w6Var2.ty(vdVar, (Q6.w6) it.next()));
                }
                Set setN = this.f7158O.n().n();
                w6 w6Var3 = this.J2;
                Iterator it2 = setN.iterator();
                while (it2.hasNext()) {
                    w6Var3.gh(((Q6.w6) it2.next()).n());
                }
                w6Var = this.J2;
                this.f7160t = w6Var;
                this.f7159n = 1;
                obj = GJW.Wre.n(arrayList, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            Ml.j jVar = this.f7158O;
            this.f7160t = null;
            this.f7159n = 2;
            Object objAz = w6Var.az((List) obj, jVar, this);
            if (objAz == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objAz;
        }
    }

    static final class Dsr extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ List f7161O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7162n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f7163t;

        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f7164n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ P f7165t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(P p2, Continuation continuation) {
                super(2, continuation);
                this.f7165t = p2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f7165t, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
            
                if (((Fs8.j) r5).rl(r4) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f7164n;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    P p2 = this.f7165t;
                    this.f7164n = 1;
                    obj = p2.await(this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                this.f7164n = 2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Dsr) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Dsr(List list, Continuation continuation) {
            super(2, continuation);
            this.f7161O = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Dsr dsr = new Dsr(this.f7161O, continuation);
            dsr.f7163t = obj;
            return dsr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7162n == 0) {
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f7163t;
                Iterator it = this.f7161O.iterator();
                while (it.hasNext()) {
                    GJW.C.nr(vdVar, null, null, new j((P) it.next(), null), 3, null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class I28 extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f7166O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7167n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f7168o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f7170t;

        I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f7168o |= Integer.MIN_VALUE;
            return w6.this.rl(null, this);
        }
    }

    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ MoG.I28 f7171O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7172n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(MoG.I28 i28, Continuation continuation) {
            super(2, continuation);
            this.f7171O = i28;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return w6.this.new Ml(this.f7171O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f7172n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                F3.n nVar = w6.this.f7154t;
                Context context = w6.this.f7153n;
                Uri uriT = this.f7171O.rl().t();
                int iRl = this.f7171O.rl().rl().rl();
                this.f7172n = 1;
                obj = nVar.n(context, uriT, iRl, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            LQ.j jVar = (LQ.j) obj;
            w6 w6Var = w6.this;
            MoG.I28 i28 = this.f7171O;
            if (jVar instanceof j.n) {
                return w6Var.qie(i28, "AudioRetrieverFactoryFailure", (uPp.w6) ((j.n) jVar).n());
            }
            if (jVar instanceof j.w6) {
                return (Fs8.j) ((j.w6) jVar).n();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ w6 f7174O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7175n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ml.j f7176t;

        public static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Iterable f7177O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f7178n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f7179t;

            /* JADX INFO: renamed from: NtE.w6$Wre$j$j, reason: collision with other inner class name */
            public static final class C0244j extends SuspendLambda implements Function2 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Object f7180O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f7181n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private /* synthetic */ Object f7182t;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(vd vdVar, Continuation continuation) {
                    return ((C0244j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0244j(Object obj, Continuation continuation) {
                    super(2, continuation);
                    this.f7180O = obj;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    C0244j c0244j = new C0244j(this.f7180O, continuation);
                    c0244j.f7182t = obj;
                    return c0244j;
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
                
                    if (((Fs8.j) r5).rl(r4) == r0) goto L15;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f7181n;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    } else {
                        ResultKt.throwOnFailure(obj);
                        P p2 = (P) this.f7180O;
                        this.f7181n = 1;
                        obj = p2.await(this);
                        if (obj != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    this.f7181n = 2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(Iterable iterable, Continuation continuation) {
                super(2, continuation);
                this.f7177O = iterable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f7177O, continuation);
                jVar.f7179t = obj;
                return jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f7178n == 0) {
                    ResultKt.throwOnFailure(obj);
                    vd vdVar = (vd) this.f7179t;
                    Iterator it = this.f7177O.iterator();
                    while (it.hasNext()) {
                        GJW.C.nr(vdVar, null, null, new C0244j(it.next(), null), 3, null);
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(Ml.j jVar, w6 w6Var, Continuation continuation) {
            super(2, continuation);
            this.f7176t = jVar;
            this.f7174O = w6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new Wre(this.f7176t, this.f7174O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f7175n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Set setRl = this.f7176t.n().rl();
                w6 w6Var = this.f7174O;
                ArrayList arrayList = new ArrayList();
                Iterator it = setRl.iterator();
                while (it.hasNext()) {
                    P p2 = (P) w6Var.J2.remove(Xo.j.n(((Xo.j) it.next()).Uo()));
                    if (p2 != null) {
                        arrayList.add(p2);
                    }
                }
                j jVar = new j(arrayList, null);
                this.f7175n = 1;
                if (Lu.J2(jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class aC extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f7183O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        /* synthetic */ Object f7185Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f7186g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7187n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f7188o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f7189r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f7190t;

        aC(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7185Z = obj;
            this.f7186g |= Integer.MIN_VALUE;
            return w6.this.az(null, null, this);
        }
    }

    static final class fuX extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f7191O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7192n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f7193r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f7194t;

        fuX(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7191O = obj;
            this.f7193r |= Integer.MIN_VALUE;
            return w6.this.n(this);
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public enum n {
        THROW,
        SILENCE
    }

    public w6(Context context, VD.j logger, F3.n retrieverFactory, vd retrieverCreationScope, n failurePolicy) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(retrieverFactory, "retrieverFactory");
        Intrinsics.checkNotNullParameter(retrieverCreationScope, "retrieverCreationScope");
        Intrinsics.checkNotNullParameter(failurePolicy, "failurePolicy");
        this.f7153n = context;
        this.rl = logger;
        this.f7154t = retrieverFactory;
        this.nr = retrieverCreationScope;
        this.f7152O = failurePolicy;
        this.J2 = new LinkedHashMap();
        this.Uo = yB.CN3.rl(false, 1, null);
    }

    /* JADX INFO: renamed from: NtE.w6$w6, reason: collision with other inner class name */
    public /* synthetic */ class C0245w6 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.THROW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.SILENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final Map HI(Map map, Set set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String strUo = ((Xo.j) entry.getKey()).Uo();
            as.n nVarRl = (as.n) entry.getValue();
            boolean z2 = false;
            Object obj = null;
            for (Object obj2 : set) {
                if (Xo.j.nr(((Q6.w6) obj2).n().n(), strUo)) {
                    if (z2) {
                        throw new IllegalArgumentException("Collection contains more than one matching element.");
                    }
                    z2 = true;
                    obj = obj2;
                }
            }
            if (!z2) {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            long jRl = ((Q6.w6) obj).rl();
            if (!d2n.j.r(jRl)) {
                nVarRl = as.n.rl(nVarRl, v9.n.az(nVarRl.O(), as.aC.n(jRl, nVarRl.Uo())), null, 2, null);
            }
            linkedHashMap.put(key, nVarRl);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0107 -> B:33:0x010a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0121 -> B:39:0x0138). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object az(List list, Ml.j jVar, Continuation continuation) throws UnhandledFailureException {
        aC aCVar;
        Iterator it;
        Ml.j jVar2;
        Map map;
        w6 w6Var;
        if (continuation instanceof aC) {
            aCVar = (aC) continuation;
            int i2 = aCVar.f7186g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aCVar.f7186g = i2 - Integer.MIN_VALUE;
            } else {
                aCVar = new aC(continuation);
            }
        }
        Object objN = aCVar.f7185Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = aCVar.f7186g;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            it = list.iterator();
            jVar2 = jVar;
            map = linkedHashMap;
            w6Var = this;
            if (!it.hasNext()) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Xo.j jVar3 = (Xo.j) aCVar.f7188o;
            map = (Map) aCVar.f7189r;
            it = (Iterator) aCVar.J2;
            Map map2 = (Map) aCVar.f7183O;
            Ml.j jVar4 = (Ml.j) aCVar.f7190t;
            w6Var = (w6) aCVar.f7187n;
            ResultKt.throwOnFailure(objN);
            Pair pair = TuplesKt.to(jVar3, LQ.Wre.n((LQ.j) objN));
            map.put(pair.getFirst(), pair.getSecond());
            map = map2;
            jVar2 = jVar4;
            if (!it.hasNext()) {
                Pair pair2 = (Pair) it.next();
                MoG.I28 i28 = (MoG.I28) pair2.component1();
                LQ.j jVar5 = (LQ.j) pair2.component2();
                if (jVar5 instanceof j.n) {
                    Fs8.j jVarQie = w6Var.qie(i28, "AudioRetrievalFailure", (uPp.j) ((j.n) jVar5).n());
                    w6Var.J2.put(Xo.j.n(i28.n()), ci.rl(jVarQie));
                    Object obj = null;
                    boolean z2 = false;
                    for (Object obj2 : jVar2.rl()) {
                        if (Xo.j.nr(((Q6.w6) obj2).n().n(), i28.n())) {
                            if (z2) {
                                throw new IllegalArgumentException("Collection contains more than one matching element.");
                            }
                            z2 = true;
                            obj = obj2;
                        }
                    }
                    if (!z2) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    d2n.Wre wreNr = NtE.Ml.nr(((Q6.w6) obj).t());
                    Xo.j jVarN = Xo.j.n(i28.n());
                    aCVar.f7187n = w6Var;
                    aCVar.f7190t = jVar2;
                    aCVar.f7183O = map;
                    aCVar.J2 = it;
                    aCVar.f7189r = map;
                    aCVar.f7188o = jVarN;
                    aCVar.f7186g = 1;
                    objN = jVarQie.n(wreNr, aCVar);
                    if (objN == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    jVar4 = jVar2;
                    jVar3 = jVarN;
                    map2 = map;
                    Pair pair3 = TuplesKt.to(jVar3, LQ.Wre.n((LQ.j) objN));
                    map.put(pair3.getFirst(), pair3.getSecond());
                    map = map2;
                    jVar2 = jVar4;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (!(jVar5 instanceof j.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Pair pair4 = TuplesKt.to(Xo.j.n(i28.n()), (as.n) ((j.w6) jVar5).n());
                    jVar4 = jVar2;
                    map2 = map;
                    pair3 = pair4;
                    map.put(pair3.getFirst(), pair3.getSecond());
                    map = map2;
                    jVar2 = jVar4;
                    if (!it.hasNext()) {
                        return map;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final P gh(MoG.I28 i28) {
        Map map = this.J2;
        Xo.j jVarN = Xo.j.n(i28.n());
        Object objRl = map.get(jVarN);
        if (objRl == null) {
            objRl = GJW.C.rl(this.nr, null, null, new Ml(i28, null), 3, null);
            map.put(jVarN, objRl);
        }
        return (P) objRl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Fs8.j qie(MoG.I28 i28, String str, Object obj) throws UnhandledFailureException {
        int i2 = C0245w6.$EnumSwitchMapping$0[this.f7152O.ordinal()];
        if (i2 == 1) {
            throw new UnhandledFailureException(obj);
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        P2H.j.n(this.rl, str, obj);
        return new NtE.Wre(NtE.Ml.t(i28.nr().t()), new as.CN3(((eO.j) i28.rl().rl().n()).n(), ((eO.j) i28.rl().rl().n()).nr(), null), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Q6.Ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) throws Throwable {
        fuX fux;
        yB.j jVar;
        w6 w6Var;
        yB.j jVar2;
        Throwable th;
        if (continuation instanceof fuX) {
            fux = (fuX) continuation;
            int i2 = fux.f7193r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fux.f7193r = i2 - Integer.MIN_VALUE;
            } else {
                fux = new fuX(continuation);
            }
        }
        Object obj = fux.f7191O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = fux.f7193r;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = this.Uo;
                fux.f7192n = this;
                fux.f7194t = jVar;
                fux.f7193r = 1;
                if (jVar.Z(null, fux) != coroutine_suspended) {
                    w6Var = this;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar2 = (yB.j) fux.f7192n;
                try {
                    ResultKt.throwOnFailure(obj);
                    Unit unit = Unit.INSTANCE;
                    jVar2.T(null);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    jVar2.T(null);
                    throw th;
                }
            }
            yB.j jVar3 = (yB.j) fux.f7194t;
            w6Var = (w6) fux.f7192n;
            ResultKt.throwOnFailure(obj);
            jVar = jVar3;
            List list = CollectionsKt.toList(w6Var.J2.values());
            w6Var.J2.clear();
            V1 v1 = V1.f3456n;
            Dsr dsr = new Dsr(list, null);
            fux.f7192n = jVar;
            fux.f7194t = null;
            fux.f7193r = 2;
            if (GJW.Dsr.Uo(v1, dsr, fux) != coroutine_suspended) {
                jVar2 = jVar;
                Unit unit2 = Unit.INSTANCE;
                jVar2.T(null);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            jVar2 = jVar;
            th = th3;
            jVar2.T(null);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [Q6.Ml$j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v3, types: [Q6.Ml$j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v8, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [Q6.Ml$j] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [Q6.Ml$j, java.lang.Object] */
    @Override // Q6.Ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(Ml.j jVar, Continuation continuation) throws Throwable {
        I28 i28;
        yB.j jVar2;
        w6 w6Var;
        ?? r10;
        ?? r2;
        yB.j jVar3;
        w6 w6Var2;
        ?? r12;
        w6 w6Var3;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i2 = i28.f7168o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i28.f7168o = i2 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        Object objJ2 = i28.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = i28.f7168o;
        try {
            try {
                if (i3 == 0) {
                    ResultKt.throwOnFailure(objJ2);
                    jVar2 = this.Uo;
                    i28.f7167n = this;
                    i28.f7170t = jVar;
                    i28.f7166O = jVar2;
                    i28.f7168o = 1;
                    if (jVar2.Z(null, i28) != coroutine_suspended) {
                        w6Var = this;
                        r10 = jVar;
                    }
                    return coroutine_suspended;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yB.j jVar4 = (yB.j) i28.f7166O;
                        Ml.j jVar5 = (Ml.j) i28.f7170t;
                        w6Var3 = (w6) i28.f7167n;
                        ResultKt.throwOnFailure(objJ2);
                        r12 = jVar5;
                        jVar = jVar4;
                        Map mapHI = w6Var3.HI((Map) objJ2, r12.rl());
                        jVar.T(null);
                        return mapHI;
                    }
                    yB.j jVar6 = (yB.j) i28.f7166O;
                    Ml.j jVar7 = (Ml.j) i28.f7170t;
                    w6Var2 = (w6) i28.f7167n;
                    ResultKt.throwOnFailure(objJ2);
                    r2 = jVar7;
                    jVar3 = jVar6;
                    CN3 cn3 = new CN3(r2, w6Var2, null);
                    i28.f7167n = w6Var2;
                    i28.f7170t = r2;
                    i28.f7166O = jVar3;
                    i28.f7168o = 3;
                    objJ2 = Lu.J2(cn3, i28);
                    if (objJ2 != coroutine_suspended) {
                        r12 = r2;
                        w6Var3 = w6Var2;
                        jVar = jVar3;
                        Map mapHI2 = w6Var3.HI((Map) objJ2, r12.rl());
                        jVar.T(null);
                        return mapHI2;
                    }
                    return coroutine_suspended;
                }
                yB.j jVar8 = (yB.j) i28.f7166O;
                Ml.j jVar9 = (Ml.j) i28.f7170t;
                w6Var = (w6) i28.f7167n;
                ResultKt.throwOnFailure(objJ2);
                jVar2 = jVar8;
                r10 = jVar9;
                V1 v1 = V1.f3456n;
                Wre wre = new Wre(r10, w6Var, null);
                i28.f7167n = w6Var;
                i28.f7170t = r10;
                i28.f7166O = jVar2;
                i28.f7168o = 2;
                if (GJW.Dsr.Uo(v1, wre, i28) != coroutine_suspended) {
                    r2 = r10;
                    jVar3 = jVar2;
                    w6Var2 = w6Var;
                    CN3 cn32 = new CN3(r2, w6Var2, null);
                    i28.f7167n = w6Var2;
                    i28.f7170t = r2;
                    i28.f7166O = jVar3;
                    i28.f7168o = 3;
                    objJ2 = Lu.J2(cn32, i28);
                    if (objJ2 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            } catch (Throwable th) {
                yB.j jVar10 = jVar2;
                th = th;
                jVar = jVar10;
                jVar.T(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ck(as.n nVar, Q6.w6 w6Var) {
        int iT = as.aC.t(w6Var.t().t(), nVar.J2());
        if (as.Ml.nr(as.w6.t(nVar), iT)) {
            return;
        }
        throw new IllegalStateException(("Expected " + ((Object) as.Ml.mUb(iT)) + " audio frames for the requested range " + w6Var.t() + " but found " + ((Object) as.Ml.mUb(as.w6.t(nVar))) + '.').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final P ty(vd vdVar, Q6.w6 w6Var) {
        return GJW.C.rl(vdVar, null, null, new C(gh(w6Var.n()), w6Var, this, null), 3, null);
    }

    public /* synthetic */ w6(Context context, VD.j jVar, F3.n nVar, vd vdVar, n nVar2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, jVar, (i2 & 4) != 0 ? QSR.j.n() : nVar, (i2 & 8) != 0 ? Lu.n(OU.n()) : vdVar, (i2 & 16) != 0 ? n.SILENCE : nVar2);
    }
}
