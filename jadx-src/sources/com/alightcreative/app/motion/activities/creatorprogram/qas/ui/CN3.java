package com.alightcreative.app.motion.activities.creatorprogram.qas.ui;

import GJW.C;
import GJW.vd;
import androidx.view.ViewModel;
import androidx.view.ViewModelKt;
import androidx.view.ViewModelProvider;
import com.alightcreative.app.motion.activities.creatorprogram.qas.ui.fuX;
import com.alightcreative.app.motion.activities.creatorprogram.qas.ui.n;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class CN3 extends uW.n {
    private final NoE.j KN;
    private final F2p.Ml Uo;
    public static final j xMQ = new j(null);
    public static final int mUb = 8;

    public static final class j {

        /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.creatorprogram.qas.ui.CN3$j$j, reason: collision with other inner class name */
        public static final class C0625j implements ViewModelProvider.Factory {
            final /* synthetic */ n rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ F2p.Ml f44941t;

            C0625j(n nVar, F2p.Ml ml) {
                this.rl = nVar;
                this.f44941t = ml;
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public ViewModel t(Class modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CN3 cn3N = this.rl.n(this.f44941t);
                Intrinsics.checkNotNull(cn3N, "null cannot be cast to non-null type T of com.alightcreative.app.motion.activities.creatorprogram.qas.ui.QAsViewModel.Companion.provideFactory.<no name provided>.create");
                return cn3N;
            }
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final ViewModelProvider.Factory n(n assistedFactory, F2p.Ml ml) {
            Intrinsics.checkNotNullParameter(assistedFactory, "assistedFactory");
            return new C0625j(assistedFactory, ml);
        }
    }

    public interface n {
        CN3 n(F2p.Ml ml);
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44942n;

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CN3.this.new w6(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object jVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44942n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                NoE.j jVar2 = CN3.this.KN;
                F2p.Ml ml = CN3.this.Uo;
                this.f44942n = 1;
                obj = jVar2.n(ml, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            CN3 cn3 = CN3.this;
            boolean z2 = nVar instanceof n.C1266n;
            if (!z2) {
                if (nVar instanceof n.w6) {
                    List list = (List) ((n.w6) nVar).n();
                    if (!list.isEmpty()) {
                        jVar = new fuX.j(cn3.Uo, list);
                    } else {
                        jVar = fuX.n.f44953n;
                    }
                    cn3.mUb(jVar);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            CN3 cn32 = CN3.this;
            if (z2) {
                cn32.mUb(fuX.n.f44953n);
            } else if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    public CN3(F2p.Ml ml, NoE.j getQAsUseCase) {
        Intrinsics.checkNotNullParameter(getQAsUseCase, "getQAsUseCase");
        this.Uo = ml;
        this.KN = getQAsUseCase;
    }

    public final void Ik() {
        xMQ(n.j.f44958n);
    }

    @Override // uW.w6
    public void Uo() {
        if (this.Uo == null) {
            mUb(fuX.n.f44953n);
        } else {
            C.nr(ViewModelKt.n(this), null, null, new w6(null), 3, null);
        }
    }

    public final void ck() {
        xMQ(n.j.f44958n);
    }
}
