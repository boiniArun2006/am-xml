package com.alightcreative.app.motion.activities.main;

import GJW.vd;
import GJW.xuv;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.ViewModelKt;
import com.alightcreative.app.motion.activities.main.Wre;
import com.alightcreative.app.motion.activities.main.g9s;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import w.InterfaceC2413n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0019\u0010\u0010J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u000e¢\u0006\u0004\b$\u0010\u0010J\r\u0010%\u001a\u00020\u000e¢\u0006\u0004\b%\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/alightcreative/app/motion/activities/main/ci;", "LuW/n;", "Lcom/alightcreative/app/motion/activities/main/g9s;", "Lcom/alightcreative/app/motion/activities/main/Wre;", "LnYs/Ml;", "getAlightSettingsUseCase", "LAsx/n;", "setupAppUseCase", "Lw/n;", "getMonorepoLibUseCase", "LZs/j;", "shouldShowPrivacyBannerUseCase", "<init>", "(LnYs/Ml;LAsx/n;Lw/n;LZs/j;)V", "", "S", "()V", "ViF", "", "te", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "()Z", "nY", "r", "Uo", "LGJW/xuv;", "o", "()LGJW/xuv;", "openSettings", "WPU", "(Z)V", "openBanner", "isFromIntroFlow", "aYN", "(ZZ)V", "XQ", "Z", "LnYs/Ml;", "KN", "Lw/n;", "xMQ", "LZs/j;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ci extends uW.n {

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    public final InterfaceC2413n getMonorepoLibUseCase;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    public final nYs.Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    public final Zs.j shouldShowPrivacyBannerUseCase;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Asx.j.values().length];
            try {
                iArr[Asx.j.f120n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Asx.j.f123t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Asx.j.f119O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Asx.j.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // uW.w6
    public void Uo() {
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f45434n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f45435t;

        public n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ci.this.new n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            K0.n nVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f45435t;
            if (i2 != 0) {
                if (i2 == 1) {
                    nVar = (K0.n) this.f45434n;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                K0.n nVarN = ci.this.getMonorepoLibUseCase.n();
                ci ciVar = ci.this;
                this.f45434n = nVarN;
                this.f45435t = 1;
                Object objTe = ciVar.te(this);
                if (objTe == coroutine_suspended) {
                    return coroutine_suspended;
                }
                nVar = nVarN;
                obj = objTe;
            }
            if (!((Boolean) obj).booleanValue() || nVar == null) {
                ci.this.S();
            } else if (ci.this.r()) {
                ci.this.xMQ(Wre.CN3.f45418n);
            } else {
                ci.this.xMQ(Wre.C0639Wre.f45421n);
            }
            return Unit.INSTANCE;
        }
    }

    public ci(nYs.Ml getAlightSettingsUseCase, Asx.n setupAppUseCase, InterfaceC2413n getMonorepoLibUseCase, Zs.j shouldShowPrivacyBannerUseCase) {
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        Intrinsics.checkNotNullParameter(setupAppUseCase, "setupAppUseCase");
        Intrinsics.checkNotNullParameter(getMonorepoLibUseCase, "getMonorepoLibUseCase");
        Intrinsics.checkNotNullParameter(shouldShowPrivacyBannerUseCase, "shouldShowPrivacyBannerUseCase");
        this.getAlightSettingsUseCase = getAlightSettingsUseCase;
        this.getMonorepoLibUseCase = getMonorepoLibUseCase;
        this.shouldShowPrivacyBannerUseCase = shouldShowPrivacyBannerUseCase;
        int i2 = j.$EnumSwitchMapping$0[setupAppUseCase.rl().ordinal()];
        if (i2 == 1) {
            mUb(g9s.j.f45438n);
            xMQ(Wre.n.f45423n);
        } else if (i2 == 2) {
            mUb(g9s.j.f45438n);
        } else {
            if (i2 != 3 && i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            mUb(g9s.n.f45439n);
        }
    }

    private final void ViF() {
        mUb(g9s.n.f45439n);
        xMQ(Wre.I28.f45419n);
    }

    private final boolean g() {
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        return !jVar.getAgreedPrivacy() || jVar.getAgreedPrivacyPolicyVersion() < 4;
    }

    private final boolean nY() {
        nYs.j jVarInvoke;
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        return jVar.isFirstSession() && !jVar.getOnboardingCompletedOrSkipped() && (jVarInvoke = this.getAlightSettingsUseCase.invoke()) != null && jVarInvoke.P5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r() {
        nYs.j jVarInvoke = this.getAlightSettingsUseCase.invoke();
        return jVarInvoke != null && jVarInvoke.jB();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object te(Continuation continuation) {
        return this.shouldShowPrivacyBannerUseCase.n(continuation);
    }

    public final void WPU(boolean openSettings) {
        K0.n nVarN = this.getMonorepoLibUseCase.n();
        if (!openSettings || nVarN == null) {
            S();
        } else {
            xMQ(Wre.CN3.f45418n);
        }
    }

    public final void aYN(boolean openBanner, boolean isFromIntroFlow) {
        if (!isFromIntroFlow) {
            xMQ(Wre.j.f45422n);
            return;
        }
        K0.n nVarN = this.getMonorepoLibUseCase.n();
        if (!openBanner || nVarN == null || r()) {
            S();
        } else {
            xMQ(Wre.C0639Wre.f45421n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S() {
        if (g()) {
            xMQ(Wre.Ml.f45420n);
        } else {
            XQ();
        }
    }

    public final void XQ() {
        if (nY()) {
            xMQ(Wre.w6.f45424n);
        } else {
            ViF();
        }
    }

    public final void Z() {
        ViF();
    }

    public final xuv o() {
        return GJW.C.nr(ViewModelKt.n(this), null, null, new n(null), 3, null);
    }
}
