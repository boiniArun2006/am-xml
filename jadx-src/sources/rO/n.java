package rO;

import Dk.InterfaceC1335n;
import QmE.iF;
import QmE.j;
import com.bendingspoons.concierge.domain.entities.Id;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC1335n f73017n;
    private final iF rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set f73018t;
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f73016O = 8;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX INFO: renamed from: rO.n$n, reason: collision with other inner class name */
    static final class C1158n extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f73019O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f73020n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f73021r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f73022t;

        C1158n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f73019O = obj;
            this.f73021r |= Integer.MIN_VALUE;
            return n.this.t(null, this);
        }
    }

    static final class w6 implements OnCompleteListener {
        final /* synthetic */ String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Continuation f73024t;

        w6(String str, Continuation continuation) {
            this.rl = str;
            this.f73024t = continuation;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task task) {
            Intrinsics.checkNotNullParameter(task, "task");
            if (task.isSuccessful()) {
                n.this.f73018t.add(this.rl);
            } else {
                n.this.J2(task.getException());
            }
            Continuation continuation = this.f73024t;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
        }
    }

    public n(InterfaceC1335n concierge, iF eventLogger) {
        Intrinsics.checkNotNullParameter(concierge, "concierge");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f73017n = concierge;
        this.rl = eventLogger;
        this.f73018t = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J2(Exception exc) {
        this.rl.n(new j.rd(exc != null ? exc.getMessage() : null, "unable_to_set_device_id"));
    }

    private final void O(zD.j jVar) {
        this.rl.n(new j.rd(jVar.rl(), "unable_to_get_device_id"));
    }

    private final Object nr(String str, String str2, Continuation continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        com.google.firebase.functions.n.mUb.t().ck("setAccountProperty").rl(MapsKt.mapOf(TuplesKt.to("devid", str2))).addOnCompleteListener(new w6(str, safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? orThrow : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(String str, Continuation continuation) {
        C1158n c1158n;
        n nVar;
        x0X.n nVar2;
        x0X.n nVar3;
        n nVar4;
        if (continuation instanceof C1158n) {
            c1158n = (C1158n) continuation;
            int i2 = c1158n.f73021r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1158n.f73021r = i2 - Integer.MIN_VALUE;
            } else {
                c1158n = new C1158n(continuation);
            }
        }
        Object objO = c1158n.f73019O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c1158n.f73021r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objO);
            if (this.f73018t.contains(str)) {
                return Unit.INSTANCE;
            }
            InterfaceC1335n interfaceC1335n = this.f73017n;
            Id.Predefined.Internal.j jVar = Id.Predefined.Internal.j.f51217O;
            c1158n.f73020n = this;
            c1158n.f73022t = str;
            c1158n.f73021r = 1;
            objO = interfaceC1335n.O(jVar, c1158n);
            if (objO != coroutine_suspended) {
                nVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar3 = (x0X.n) c1158n.f73022t;
            nVar4 = (n) c1158n.f73020n;
            ResultKt.throwOnFailure(objO);
            nVar2 = nVar3;
            nVar = nVar4;
            if (!(nVar2 instanceof n.C1266n)) {
                nVar.O((zD.j) ((n.C1266n) nVar2).n());
            } else if (!(nVar2 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        str = (String) c1158n.f73022t;
        nVar = (n) c1158n.f73020n;
        ResultKt.throwOnFailure(objO);
        nVar2 = (x0X.n) objO;
        if (!(nVar2 instanceof n.C1266n)) {
            if (!(nVar2 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            String value = ((Id.Predefined.Internal) ((n.w6) nVar2).n()).getValue();
            c1158n.f73020n = nVar;
            c1158n.f73022t = nVar2;
            c1158n.f73021r = 2;
            if (nVar.nr(str, value, c1158n) != coroutine_suspended) {
                nVar3 = nVar2;
                nVar4 = nVar;
                nVar2 = nVar3;
                nVar = nVar4;
            }
            return coroutine_suspended;
        }
        if (!(nVar2 instanceof n.C1266n)) {
        }
        return Unit.INSTANCE;
    }
}
