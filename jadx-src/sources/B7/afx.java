package B7;

import B7.Z;
import GJW.vd;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class afx {

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Object f260O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f261n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ yB.j f262t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(yB.j jVar, Object obj, Continuation continuation) {
            super(2, continuation);
            this.f262t = jVar;
            this.f260O = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f262t, this.f260O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f261n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                yB.j jVar = this.f262t;
                Object obj2 = this.f260O;
                this.f261n = 1;
                if (jVar.Z(obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static /* synthetic */ void O(yB.j jVar, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        nr(jVar, obj);
    }

    public static final Surface rl(g9s g9sVar) {
        Intrinsics.checkNotNullParameter(g9sVar, "<this>");
        Z z2 = (Z) g9sVar.t().getValue();
        if (Intrinsics.areEqual(z2, Z.j.f257n)) {
            return null;
        }
        if (z2 instanceof Z.n) {
            return ((Z.n) z2).rl();
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final void nr(yB.j jVar, Object obj) {
        if (!jVar.rl(obj)) {
            GJW.aC.rl(null, new j(jVar, obj, null), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Z t(SurfaceHolder surfaceHolder) {
        Surface currentSurface = surfaceHolder.getSurface();
        if (!currentSurface.isValid()) {
            return Z.j.f257n;
        }
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        if (surfaceFrame.width() > 0 && surfaceFrame.height() > 0) {
            Oe.w6 w6Var = new Oe.w6(surfaceFrame.width(), surfaceFrame.height());
            Intrinsics.checkNotNullExpressionValue(currentSurface, "currentSurface");
            return new Z.n(w6Var, currentSurface);
        }
        return Z.j.f257n;
    }
}
