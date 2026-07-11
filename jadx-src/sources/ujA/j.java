package ujA;

import Dk.InterfaceC1335n;
import cb.InterfaceC1679Ml;
import cb.InterfaceC1680j;
import cb.InterfaceC1682w6;
import com.bendingspoons.concierge.domain.entities.Id;
import java.util.Collection;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import sJa.Dsr;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j implements InterfaceC1335n {
    public static final C1229j J2 = new C1229j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final rB.Ml f74559O;
    private final InterfaceC1680j nr;
    private final InterfaceC1679Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC1682w6 f74560t;

    /* synthetic */ class CN3 extends FunctionReferenceImpl implements Function1, SuspendFunction {
        CN3(Object obj) {
            super(1, obj, InterfaceC1679Ml.class, "resetIds", "resetIds(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((InterfaceC1679Ml) this.receiver).nr(continuation);
        }
    }

    static final class I28 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74562n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f74563t;

        I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f74563t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return j.this.O(null, this);
        }
    }

    static final class Ml extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74565n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f74566t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f74566t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return j.this.t(null, this);
        }
    }

    static final class Wre extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74568n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f74569t;

        Wre(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f74569t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return j.this.J2(this);
        }
    }

    /* synthetic */ class fuX extends FunctionReferenceImpl implements Function1, SuspendFunction {
        fuX(Object obj) {
            super(1, obj, InterfaceC1682w6.class, "resetIds", "resetIds(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((InterfaceC1682w6) this.receiver).nr(continuation);
        }
    }

    /* JADX INFO: renamed from: ujA.j$j, reason: collision with other inner class name */
    public static final class C1229j {
        public /* synthetic */ C1229j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1229j() {
        }
    }

    static final class n extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f74570O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74571n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f74572r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f74573t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f74570O = obj;
            this.f74572r |= Integer.MIN_VALUE;
            return j.this.n(this);
        }
    }

    static final class w6 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74575n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f74576t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f74576t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return j.this.KN(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // Dk.InterfaceC1335n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object J2(Continuation continuation) {
        Wre wre;
        j jVar;
        if (continuation instanceof Wre) {
            wre = (Wre) continuation;
            int i2 = wre.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wre.J2 = i2 - Integer.MIN_VALUE;
            } else {
                wre = new Wre(continuation);
            }
        }
        Object objN = wre.f74569t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = wre.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            Function1[] function1Arr = {new CN3(this.rl), new fuX(this.f74560t)};
            wre.f74568n = this;
            wre.J2 = 1;
            objN = Dsr.n(function1Arr, wre);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (j) wre.f74568n;
            ResultKt.throwOnFailure(objN);
        }
        x0X.n nVarT = x0X.w6.t((Collection) objN);
        if (nVarT instanceof n.C1266n) {
            jVar.f74559O.t(Bvn.j.f686n.nr((zD.j) ((n.C1266n) nVarT).n()));
            return nVarT;
        }
        if (nVarT instanceof n.w6) {
            return nVarT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public j(InterfaceC1679Ml internalIdManager, InterfaceC1682w6 externalIdManager, InterfaceC1680j customIdManager, rB.Ml spiderSense) {
        Intrinsics.checkNotNullParameter(internalIdManager, "internalIdManager");
        Intrinsics.checkNotNullParameter(externalIdManager, "externalIdManager");
        Intrinsics.checkNotNullParameter(customIdManager, "customIdManager");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        this.rl = internalIdManager;
        this.f74560t = externalIdManager;
        this.nr = customIdManager;
        this.f74559O = spiderSense;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Dk.InterfaceC1335n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object KN(String str, Continuation continuation) {
        w6 w6Var;
        j jVar;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.J2 = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objRl = w6Var.f74576t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objRl);
            InterfaceC1680j interfaceC1680j = this.nr;
            w6Var.f74575n = this;
            w6Var.J2 = 1;
            objRl = interfaceC1680j.rl(str, w6Var);
            if (objRl == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (j) w6Var.f74575n;
            ResultKt.throwOnFailure(objRl);
        }
        x0X.n nVar = (x0X.n) objRl;
        if (nVar instanceof n.C1266n) {
            jVar.f74559O.t(Bvn.j.f686n.n((zD.j) ((n.C1266n) nVar).n()));
            return nVar;
        }
        if (nVar instanceof n.w6) {
            return nVar;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Dk.InterfaceC1335n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object O(Id.Predefined.Internal.j jVar, Continuation continuation) {
        I28 i28;
        j jVar2;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i2 = i28.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i28.J2 = i2 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        Object objO = i28.f74563t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = i28.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objO);
            InterfaceC1679Ml interfaceC1679Ml = this.rl;
            i28.f74562n = this;
            i28.J2 = 1;
            objO = interfaceC1679Ml.O(jVar, i28);
            if (objO == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar2 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar2 = (j) i28.f74562n;
            ResultKt.throwOnFailure(objO);
        }
        x0X.n nVar = (x0X.n) objO;
        if (nVar instanceof n.C1266n) {
            jVar2.f74559O.t(Bvn.j.f686n.t((zD.j) ((n.C1266n) nVar).n()));
            return nVar;
        }
        if (nVar instanceof n.w6) {
            return nVar;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // Dk.InterfaceC1335n
    public void Uo(HX.j provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.nr.t(provider);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Dk.InterfaceC1335n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        n nVar;
        j jVar;
        Set set;
        j jVar2;
        Object objN;
        Set set2;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f74572r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f74572r = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objN2 = nVar.f74570O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f74572r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN2);
            InterfaceC1679Ml interfaceC1679Ml = this.rl;
            nVar.f74571n = this;
            nVar.f74572r = 1;
            objN2 = interfaceC1679Ml.n(nVar);
            if (objN2 != coroutine_suspended) {
                jVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                set2 = (Set) nVar.f74571n;
                ResultKt.throwOnFailure(objN2);
                return SetsKt.plus(set2, (Iterable) objN2);
            }
            set = (Set) nVar.f74573t;
            jVar2 = (j) nVar.f74571n;
            ResultKt.throwOnFailure(objN2);
            Set setPlus = SetsKt.plus(set, (Iterable) objN2);
            InterfaceC1680j interfaceC1680j = jVar2.nr;
            nVar.f74571n = setPlus;
            nVar.f74573t = null;
            nVar.f74572r = 3;
            objN = interfaceC1680j.n(nVar);
            if (objN != coroutine_suspended) {
                set2 = setPlus;
                objN2 = objN;
                return SetsKt.plus(set2, (Iterable) objN2);
            }
            return coroutine_suspended;
        }
        jVar = (j) nVar.f74571n;
        ResultKt.throwOnFailure(objN2);
        Set set3 = (Set) objN2;
        InterfaceC1682w6 interfaceC1682w6 = jVar.f74560t;
        nVar.f74571n = jVar;
        nVar.f74573t = set3;
        nVar.f74572r = 2;
        Object objN3 = interfaceC1682w6.n(nVar);
        if (objN3 != coroutine_suspended) {
            j jVar3 = jVar;
            set = set3;
            objN2 = objN3;
            jVar2 = jVar3;
            Set setPlus2 = SetsKt.plus(set, (Iterable) objN2);
            InterfaceC1680j interfaceC1680j2 = jVar2.nr;
            nVar.f74571n = setPlus2;
            nVar.f74573t = null;
            nVar.f74572r = 3;
            objN = interfaceC1680j2.n(nVar);
            if (objN != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Dk.InterfaceC1335n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(Id.Predefined.External.j jVar, Continuation continuation) {
        Ml ml;
        j jVar2;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.J2 = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object objT = ml.f74566t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objT);
            InterfaceC1682w6 interfaceC1682w6 = this.f74560t;
            ml.f74565n = this;
            ml.J2 = 1;
            objT = interfaceC1682w6.t(jVar, ml);
            if (objT == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar2 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar2 = (j) ml.f74565n;
            ResultKt.throwOnFailure(objT);
        }
        x0X.n nVar = (x0X.n) objT;
        if (nVar instanceof n.C1266n) {
            jVar2.f74559O.t(Bvn.j.f686n.rl((zD.j) ((n.C1266n) nVar).n()));
            return nVar;
        }
        if (nVar instanceof n.w6) {
            return nVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
