package com.bendingspoons.forceupdater.internal;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class w6 implements Dm5.n {
    private final Function1 nr;
    private final Context rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function1 f51272t;

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f51274n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51275t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51275t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return w6.this.nr(this);
        }
    }

    static final class n extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f51277n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51278t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51278t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return w6.this.O(this);
        }
    }

    /* JADX INFO: renamed from: com.bendingspoons.forceupdater.internal.w6$w6, reason: collision with other inner class name */
    static final class C0720w6 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f51280n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f51281t;

        C0720w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51281t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return w6.this.n(this);
        }
    }

    public w6(Context context, Function1 minRequiredBuildNumberProvider, Function1 minSuggestedBuildNumberProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(minRequiredBuildNumberProvider, "minRequiredBuildNumberProvider");
        Intrinsics.checkNotNullParameter(minSuggestedBuildNumberProvider, "minSuggestedBuildNumberProvider");
        this.rl = context;
        this.f51272t = minRequiredBuildNumberProvider;
        this.nr = minSuggestedBuildNumberProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(Continuation continuation) {
        n nVar;
        long j2;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objInvoke = nVar.f51278t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            long jRl = YgZ.w6.f12217n.rl(this.rl);
            Function1 function1 = this.nr;
            nVar.f51277n = jRl;
            nVar.J2 = 1;
            objInvoke = function1.invoke(nVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            j2 = jRl;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = nVar.f51277n;
            ResultKt.throwOnFailure(objInvoke);
        }
        Integer num = (Integer) objInvoke;
        return Boxing.boxBoolean(j2 < ((long) (num != null ? num.intValue() : 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object nr(Continuation continuation) {
        j jVar;
        long j2;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objInvoke = jVar.f51275t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            long jRl = YgZ.w6.f12217n.rl(this.rl);
            Function1 function1 = this.f51272t;
            jVar.f51274n = jRl;
            jVar.J2 = 1;
            objInvoke = function1.invoke(jVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            j2 = jRl;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = jVar.f51274n;
            ResultKt.throwOnFailure(objInvoke);
        }
        Integer num = (Integer) objInvoke;
        return Boxing.boxBoolean(j2 < ((long) (num != null ? num.intValue() : 0)));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Dm5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        C0720w6 c0720w6;
        w6 w6Var;
        w6 w6Var2;
        if (continuation instanceof C0720w6) {
            c0720w6 = (C0720w6) continuation;
            int i2 = c0720w6.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0720w6.J2 = i2 - Integer.MIN_VALUE;
            } else {
                c0720w6 = new C0720w6(continuation);
            }
        }
        Object objNr = c0720w6.f51281t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0720w6.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objNr);
            c0720w6.f51280n = this;
            c0720w6.J2 = 1;
            objNr = nr(c0720w6);
            if (objNr != coroutine_suspended) {
                w6Var = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w6Var2 = (w6) c0720w6.f51280n;
            ResultKt.throwOnFailure(objNr);
            if (((Boolean) objNr).booleanValue()) {
                return Unit.INSTANCE;
            }
            ForceUpdateActivity.INSTANCE.n(w6Var2.rl, false);
            return Unit.INSTANCE;
        }
        w6Var = (w6) c0720w6.f51280n;
        ResultKt.throwOnFailure(objNr);
        if (((Boolean) objNr).booleanValue()) {
            ForceUpdateActivity.INSTANCE.n(w6Var.rl, true);
            return Unit.INSTANCE;
        }
        c0720w6.f51280n = w6Var;
        c0720w6.J2 = 2;
        objNr = w6Var.O(c0720w6);
        if (objNr != coroutine_suspended) {
            w6Var2 = w6Var;
            if (((Boolean) objNr).booleanValue()) {
            }
        }
        return coroutine_suspended;
    }
}
