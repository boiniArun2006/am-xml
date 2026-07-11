package ON;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function2 f7399n;
    private final Function1 rl;

    static final class CN3 extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f7400O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f7401S;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7403n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f7404o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f7405r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f7406t;

        CN3(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7404o = obj;
            this.f7401S |= Integer.MIN_VALUE;
            return j.this.Uo(null, null, false, null, this);
        }
    }

    static final class I28 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f7407O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7408n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f7409r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f7410t;

        I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7407O = obj;
            this.f7409r |= Integer.MIN_VALUE;
            return j.this.O(false, this);
        }
    }

    static final class Ml extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f7411O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7412n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f7413r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f7414t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7411O = obj;
            this.f7413r |= Integer.MIN_VALUE;
            return j.this.nr(false, this);
        }
    }

    static final class Wre extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f7415O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7416n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f7417r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f7418t;

        Wre(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7415O = obj;
            this.f7417r |= Integer.MIN_VALUE;
            return j.this.J2(false, this);
        }
    }

    /* JADX INFO: renamed from: ON.j$j, reason: collision with other inner class name */
    static final class C0250j extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f7419O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f7420S;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7422n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f7423o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f7424r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f7425t;

        C0250j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7423o = obj;
            this.f7420S |= Integer.MIN_VALUE;
            return j.this.n(null, null, false, null, this);
        }
    }

    static final class n extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f7426O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        /* synthetic */ Object f7428Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f7429g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7430n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f7431o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f7432r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f7433t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7428Z = obj;
            this.f7429g |= Integer.MIN_VALUE;
            return j.this.rl(null, null, null, false, null, this);
        }
    }

    static final class w6 extends ContinuationImpl {
        boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f7434O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f7435Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7436n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f7438r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f7439t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7438r = obj;
            this.f7435Z |= Integer.MIN_VALUE;
            return j.this.t(null, null, false, this);
        }
    }

    public j(Function2 trackEvent, Function1 shouldTrackPurchaseEvents) {
        Intrinsics.checkNotNullParameter(trackEvent, "trackEvent");
        Intrinsics.checkNotNullParameter(shouldTrackPurchaseEvents, "shouldTrackPurchaseEvents");
        this.f7399n = trackEvent;
        this.rl = shouldTrackPurchaseEvents;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J2(boolean z2, Continuation continuation) {
        Wre wre;
        j jVar;
        if (continuation instanceof Wre) {
            wre = (Wre) continuation;
            int i2 = wre.f7417r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wre.f7417r = i2 - Integer.MIN_VALUE;
            } else {
                wre = new Wre(continuation);
            }
        }
        Object objInvoke = wre.f7415O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = wre.f7417r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            Function1 function1 = this.rl;
            wre.f7416n = this;
            wre.f7418t = z2;
            wre.f7417r = 1;
            objInvoke = function1.invoke(wre);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = wre.f7418t;
            jVar = (j) wre.f7416n;
            ResultKt.throwOnFailure(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            Function2 function2 = jVar.f7399n;
            pq.Ml ml = new pq.Ml();
            ml.KN("is_first_paywall", z2);
            Unit unit = Unit.INSTANCE;
            function2.invoke("purchase_restore_initiated", ml);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(boolean z2, Continuation continuation) {
        I28 i28;
        j jVar;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i2 = i28.f7409r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i28.f7409r = i2 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        Object objInvoke = i28.f7407O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = i28.f7409r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            Function1 function1 = this.rl;
            i28.f7408n = this;
            i28.f7410t = z2;
            i28.f7409r = 1;
            objInvoke = function1.invoke(i28);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = i28.f7410t;
            jVar = (j) i28.f7408n;
            ResultKt.throwOnFailure(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            Function2 function2 = jVar.f7399n;
            pq.Ml ml = new pq.Ml();
            ml.KN("is_first_paywall", z2);
            Unit unit = Unit.INSTANCE;
            function2.invoke("purchase_restore_failed", ml);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Uo(String str, String str2, boolean z2, pq.Ml ml, Continuation continuation) {
        CN3 cn3;
        j jVar;
        if (continuation instanceof CN3) {
            cn3 = (CN3) continuation;
            int i2 = cn3.f7401S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cn3.f7401S = i2 - Integer.MIN_VALUE;
            } else {
                cn3 = new CN3(continuation);
            }
        }
        Object objInvoke = cn3.f7404o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = cn3.f7401S;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            Function1 function1 = this.rl;
            cn3.f7403n = this;
            cn3.f7406t = str;
            cn3.f7400O = str2;
            cn3.J2 = ml;
            cn3.f7405r = z2;
            cn3.f7401S = 1;
            objInvoke = function1.invoke(cn3);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = cn3.f7405r;
            ml = (pq.Ml) cn3.J2;
            str2 = (String) cn3.f7400O;
            str = (String) cn3.f7406t;
            jVar = (j) cn3.f7403n;
            ResultKt.throwOnFailure(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            Function2 function2 = jVar.f7399n;
            pq.Ml ml2 = new pq.Ml();
            ml2.O("product_id", str);
            ml2.O("trigger", str2);
            ml2.KN("is_first_paywall", z2);
            Unit unit = Unit.INSTANCE;
            function2.invoke("purchase_initiated", ml2.rl(ml));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(String str, String str2, boolean z2, pq.Ml ml, Continuation continuation) {
        C0250j c0250j;
        j jVar;
        if (continuation instanceof C0250j) {
            c0250j = (C0250j) continuation;
            int i2 = c0250j.f7420S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0250j.f7420S = i2 - Integer.MIN_VALUE;
            } else {
                c0250j = new C0250j(continuation);
            }
        }
        Object objInvoke = c0250j.f7423o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0250j.f7420S;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            Function1 function1 = this.rl;
            c0250j.f7422n = this;
            c0250j.f7425t = str;
            c0250j.f7419O = str2;
            c0250j.J2 = ml;
            c0250j.f7424r = z2;
            c0250j.f7420S = 1;
            objInvoke = function1.invoke(c0250j);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = c0250j.f7424r;
            ml = (pq.Ml) c0250j.J2;
            str2 = (String) c0250j.f7419O;
            str = (String) c0250j.f7425t;
            jVar = (j) c0250j.f7422n;
            ResultKt.throwOnFailure(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            Function2 function2 = jVar.f7399n;
            pq.Ml ml2 = new pq.Ml();
            ml2.O("product_id", str);
            ml2.O("trigger", str2);
            ml2.KN("is_first_paywall", z2);
            Unit unit = Unit.INSTANCE;
            function2.invoke("purchase_canceled", ml2.rl(ml));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object nr(boolean z2, Continuation continuation) {
        Ml ml;
        j jVar;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f7413r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f7413r = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object objInvoke = ml.f7411O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.f7413r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            Function1 function1 = this.rl;
            ml.f7412n = this;
            ml.f7414t = z2;
            ml.f7413r = 1;
            objInvoke = function1.invoke(ml);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = ml.f7414t;
            jVar = (j) ml.f7412n;
            ResultKt.throwOnFailure(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            Function2 function2 = jVar.f7399n;
            pq.Ml ml2 = new pq.Ml();
            ml2.KN("is_first_paywall", z2);
            Unit unit = Unit.INSTANCE;
            function2.invoke("purchase_restore_completed", ml2);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rl(String str, String str2, String str3, boolean z2, pq.Ml ml, Continuation continuation) {
        n nVar;
        j jVar;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f7429g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f7429g = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objInvoke = nVar.f7428Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f7429g;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            Function1 function1 = this.rl;
            nVar.f7430n = this;
            nVar.f7433t = str;
            nVar.f7426O = str2;
            nVar.J2 = str3;
            nVar.f7432r = ml;
            nVar.f7431o = z2;
            nVar.f7429g = 1;
            objInvoke = function1.invoke(nVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = nVar.f7431o;
            ml = (pq.Ml) nVar.f7432r;
            str3 = (String) nVar.J2;
            str2 = (String) nVar.f7426O;
            str = (String) nVar.f7433t;
            jVar = (j) nVar.f7430n;
            ResultKt.throwOnFailure(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            Function2 function2 = jVar.f7399n;
            pq.Ml ml2 = new pq.Ml();
            ml2.O("product_id", str);
            ml2.O("purchase_token", str2);
            ml2.O("trigger", str3);
            ml2.KN("is_first_paywall", z2);
            Unit unit = Unit.INSTANCE;
            function2.invoke("purchase_completed", ml2.rl(ml));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(String str, String str2, boolean z2, Continuation continuation) {
        w6 w6Var;
        j jVar;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.f7435Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.f7435Z = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objInvoke = w6Var.f7438r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.f7435Z;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            Function1 function1 = this.rl;
            w6Var.f7436n = this;
            w6Var.f7439t = str;
            w6Var.f7434O = str2;
            w6Var.J2 = z2;
            w6Var.f7435Z = 1;
            objInvoke = function1.invoke(w6Var);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = w6Var.J2;
            str2 = (String) w6Var.f7434O;
            str = (String) w6Var.f7439t;
            jVar = (j) w6Var.f7436n;
            ResultKt.throwOnFailure(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            Function2 function2 = jVar.f7399n;
            pq.Ml ml = new pq.Ml();
            ml.O("product_id", str);
            ml.O("trigger", str2);
            ml.KN("is_first_paywall", z2);
            Unit unit = Unit.INSTANCE;
            function2.invoke("purchase_failed", ml);
        }
        return Unit.INSTANCE;
    }
}
