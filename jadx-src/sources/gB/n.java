package gB;

import Fw3.Pl;
import GJW.V1;
import GJW.vd;
import MoG.Xo;
import Z4.Ml;
import gB.j;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class n implements Z4.Ml {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f67174O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final fuX f67175n;
    private final yB.j nr;
    private final gB.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f67176t;

    static final class Ml extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f67178n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f67179t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67179t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return n.this.te(null, null, this);
        }
    }

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f67180O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f67181n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f67182r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f67183t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67180O = obj;
            this.f67182r |= Integer.MIN_VALUE;
            return n.this.n(this);
        }
    }

    /* JADX INFO: renamed from: gB.n$n, reason: collision with other inner class name */
    static final class C0938n extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f67184O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f67185Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f67186n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f67188r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f67189t;

        C0938n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67188r = obj;
            this.f67185Z |= Integer.MIN_VALUE;
            return n.this.az(null, null, this);
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f67190n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return n.this.new w6(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f67190n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                n.this.g("release");
                n nVar = n.this;
                this.f67190n = 1;
                if (nVar.n(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            n.this.f67174O = true;
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ n(fuX fux, gB.j jVar, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fux, jVar, j2);
    }

    private n(fuX fux, gB.j jVar, long j2) {
        this.f67175n = fux;
        this.rl = jVar;
        this.f67176t = j2;
        this.nr = yB.CN3.rl(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(String str) {
        if (this.f67174O) {
            throw new IllegalStateException(("Cannot call " + str + " on released FMGraphicResourcePipeline").toString());
        }
    }

    private final void iF(Z4.n nVar, Z4.n nVar2) {
        if (nVar2 == null || Intrinsics.areEqual(Z4.n.t(nVar2, null, nVar.O(), 1, null), nVar)) {
            return;
        }
        throw new IllegalArgumentException(("Current slice " + nVar + " and predicted one " + nVar2 + " may differ only in time").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object te(Z4.n nVar, Ml.j jVar, Continuation continuation) {
        Ml ml;
        Z4.n nVar2;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.J2 = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object objRl = ml.f67179t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objRl);
            j.C0937j c0937jN = Pl.n(this.f67175n, nVar, jVar != null ? jVar.n() : null, this.f67176t, gB.w6.rl(jVar));
            gB.j jVar2 = this.rl;
            ml.f67178n = nVar;
            ml.J2 = 1;
            objRl = jVar2.rl(c0937jN, ml);
            if (objRl == coroutine_suspended) {
                return coroutine_suspended;
            }
            nVar2 = nVar;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar2 = (Z4.n) ml.f67178n;
            ResultKt.throwOnFailure(objRl);
        }
        Map map = (Map) objRl;
        Set<MoG.fuX> setN = nVar2.n();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setN, 10)), 16));
        for (MoG.fuX fux : setN) {
            Pair pair = TuplesKt.to(Xo.j.n(((MoG.C) fux.n()).n()), ((mF.w6) MapsKt.getValue(map, Wre.t((MoG.C) fux.n()))).getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Z4.Ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object az(Z4.n nVar, Ml.j jVar, Continuation continuation) throws Throwable {
        C0938n c0938n;
        yB.j jVar2;
        n nVar2;
        yB.j jVar3;
        if (continuation instanceof C0938n) {
            c0938n = (C0938n) continuation;
            int i2 = c0938n.f67185Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0938n.f67185Z = i2 - Integer.MIN_VALUE;
            } else {
                c0938n = new C0938n(continuation);
            }
        }
        Object obj = c0938n.f67188r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0938n.f67185Z;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar2 = this.nr;
                c0938n.f67186n = this;
                c0938n.f67189t = nVar;
                c0938n.f67184O = jVar;
                c0938n.J2 = jVar2;
                c0938n.f67185Z = 1;
                if (jVar2.Z(null, c0938n) != coroutine_suspended) {
                    nVar2 = this;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar3 = (yB.j) c0938n.f67186n;
                try {
                    ResultKt.throwOnFailure(obj);
                    Map map = (Map) obj;
                    jVar3.T(null);
                    return map;
                } catch (Throwable th) {
                    th = th;
                    jVar3.T(null);
                    throw th;
                }
            }
            yB.j jVar4 = (yB.j) c0938n.J2;
            jVar = (Ml.j) c0938n.f67184O;
            Z4.n nVar3 = (Z4.n) c0938n.f67189t;
            nVar2 = (n) c0938n.f67186n;
            ResultKt.throwOnFailure(obj);
            jVar2 = jVar4;
            nVar = nVar3;
            nVar2.g("graphicResourcesFor");
            nVar2.iF(nVar, jVar != null ? jVar.n() : null);
            c0938n.f67186n = jVar2;
            c0938n.f67189t = null;
            c0938n.f67184O = null;
            c0938n.J2 = null;
            c0938n.f67185Z = 2;
            Object objTe = nVar2.te(nVar, jVar, c0938n);
            if (objTe != coroutine_suspended) {
                yB.j jVar5 = jVar2;
                obj = objTe;
                jVar3 = jVar5;
                Map map2 = (Map) obj;
                jVar3.T(null);
                return map2;
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
            jVar3 = jVar2;
            jVar3.T(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Z4.Ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) throws Throwable {
        j jVar;
        yB.j jVar2;
        n nVar;
        yB.j jVar3;
        Throwable th;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f67182r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f67182r = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.f67180O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f67182r;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar2 = this.nr;
                jVar.f67181n = this;
                jVar.f67183t = jVar2;
                jVar.f67182r = 1;
                if (jVar2.Z(null, jVar) != coroutine_suspended) {
                    nVar = this;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar3 = (yB.j) jVar.f67181n;
                try {
                    ResultKt.throwOnFailure(obj);
                    Unit unit = Unit.INSTANCE;
                    jVar3.T(null);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    jVar3.T(null);
                    throw th;
                }
            }
            yB.j jVar4 = (yB.j) jVar.f67183t;
            nVar = (n) jVar.f67181n;
            ResultKt.throwOnFailure(obj);
            jVar2 = jVar4;
            nVar.g("clearCache");
            gB.j jVar5 = nVar.rl;
            jVar.f67181n = jVar2;
            jVar.f67183t = null;
            jVar.f67182r = 2;
            if (jVar5.n(jVar) != coroutine_suspended) {
                jVar3 = jVar2;
                Unit unit2 = Unit.INSTANCE;
                jVar3.T(null);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            jVar3 = jVar2;
            th = th3;
            jVar3.T(null);
            throw th;
        }
    }

    @Override // w9.aC
    public Object rl(Continuation continuation) {
        Object objUo = GJW.Dsr.Uo(V1.f3456n, new w6(null), continuation);
        return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : Unit.INSTANCE;
    }

    public /* synthetic */ n(fuX fux, gB.j jVar, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fux, jVar, (i2 & 4) != 0 ? d2n.j.f63374t.O(2.0d) : j2, null);
    }
}
