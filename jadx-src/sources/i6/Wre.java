package i6;

import GJW.vd;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.ViewModelKt;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import ga6.j;
import i6.aC;
import i6.j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000f\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Li6/Wre;", "LuW/n;", "Li6/aC;", "Li6/j;", "LAsx/n;", "setupAppUseCase", "<init>", "(LAsx/n;)V", "", "Ik", "()V", "Lga6/j;", MRAIDPresenter.ERROR, "r", "(Lga6/j;)V", "Uo", "LAsx/n;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Wre extends uW.n {

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final Asx.n setupAppUseCase;

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f68111n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Wre.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f68111n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Wre.this.mUb(aC.n.f68114n);
                Asx.n nVar = Wre.this.setupAppUseCase;
                this.f68111n = 1;
                obj = nVar.n(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar2 = (x0X.n) obj;
            Wre wre = Wre.this;
            boolean z2 = nVar2 instanceof n.C1266n;
            if (!z2) {
                if (nVar2 instanceof n.w6) {
                    wre.Ik();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            Wre wre2 = Wre.this;
            if (z2) {
                wre2.r((ga6.j) ((n.C1266n) nVar2).n());
            } else if (!(nVar2 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    public Wre(Asx.n setupAppUseCase) {
        Intrinsics.checkNotNullParameter(setupAppUseCase, "setupAppUseCase");
        this.setupAppUseCase = setupAppUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ik() {
        xMQ(j.C0966j.f68117n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(ga6.j error) {
        Object obj;
        if (error.t() == j.n.J2) {
            obj = aC.w6.f68115n;
        } else {
            obj = aC.j.f68113n;
        }
        mUb(obj);
    }

    @Override // uW.w6
    public void Uo() {
        GJW.C.nr(ViewModelKt.n(this), null, null, new j(null), 3, null);
    }
}
