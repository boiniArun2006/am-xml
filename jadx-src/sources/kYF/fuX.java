package kYF;

import androidx.view.DefaultLifecycleObserver;
import androidx.view.Lifecycle;
import androidx.view.LifecycleObserver;
import androidx.view.LifecycleOwner;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class fuX {

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f69945O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f69946n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f69947t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f69945O = obj;
            this.J2 |= Integer.MIN_VALUE;
            return fuX.n(null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    public static final class n implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ GJW.Pl f69948n;

        n(GJW.Pl pl) {
            this.f69948n = pl;
        }

        @Override // androidx.view.DefaultLifecycleObserver
        public void M(LifecycleOwner lifecycleOwner) {
            GJW.Pl pl = this.f69948n;
            Result.Companion companion = Result.INSTANCE;
            pl.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object, kYF.fuX$n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(Lifecycle lifecycle, Continuation continuation) throws Throwable {
        j jVar;
        Lifecycle lifecycle2;
        Ref.ObjectRef objectRef;
        Throwable th;
        LifecycleObserver lifecycleObserver;
        LifecycleObserver lifecycleObserver2;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.f69945O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) jVar.f69947t;
            lifecycle2 = (Lifecycle) jVar.f69946n;
            try {
                ResultKt.throwOnFailure(obj);
                lifecycleObserver2 = (LifecycleObserver) objectRef.element;
                if (lifecycleObserver2 != null) {
                    lifecycle2.nr(lifecycleObserver2);
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                lifecycleObserver = (LifecycleObserver) objectRef.element;
                if (lifecycleObserver != null) {
                }
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        if (lifecycle.getState().rl(Lifecycle.State.J2)) {
            return Unit.INSTANCE;
        }
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        try {
            jVar.f69946n = lifecycle;
            jVar.f69947t = objectRef2;
            jVar.J2 = 1;
            GJW.eO eOVar = new GJW.eO(IntrinsicsKt.intercepted(jVar), 1);
            eOVar.e();
            ?? nVar = new n(eOVar);
            objectRef2.element = nVar;
            Intrinsics.checkNotNull(nVar);
            lifecycle.n((LifecycleObserver) nVar);
            Object objWPU = eOVar.WPU();
            if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(jVar);
            }
            if (objWPU == coroutine_suspended) {
                return coroutine_suspended;
            }
            lifecycle2 = lifecycle;
            objectRef = objectRef2;
            lifecycleObserver2 = (LifecycleObserver) objectRef.element;
            if (lifecycleObserver2 != null) {
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            lifecycle2 = lifecycle;
            objectRef = objectRef2;
            th = th3;
            lifecycleObserver = (LifecycleObserver) objectRef.element;
            if (lifecycleObserver != null) {
                lifecycle2.nr(lifecycleObserver);
            }
            throw th;
        }
    }
}
