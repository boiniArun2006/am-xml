package com.alightcreative.app.motion.activities.creatorprogram.redeem;

import GJW.C;
import GJW.vd;
import GJW.xuv;
import MO.eO;
import MO.z;
import QmE.iF;
import QmE.j;
import androidx.view.ViewModel;
import androidx.view.ViewModelKt;
import androidx.view.ViewModelProvider;
import cg.o;
import com.alightcreative.app.motion.activities.creatorprogram.redeem.CN3;
import com.alightcreative.app.motion.activities.creatorprogram.redeem.Dsr;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class aC extends uW.n {
    private final W.n KN;
    private final o.C Uo;
    private final iF gh;
    private final W.j mUb;
    private final fuX xMQ;
    public static final j qie = new j(null);
    public static final int az = 8;

    static final class CN3 extends SuspendLambda implements Function2 {
        final /* synthetic */ cg.j E2;
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f44976O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ o f44977S;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f44979e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f44980g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44981n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f44982o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        long f44983r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f44984t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return aC.this.new CN3(this.f44977S, this.f44980g, this.E2, this.f44979e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((CN3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CN3(o oVar, String str, cg.j jVar, String str2, Continuation continuation) {
            super(2, continuation);
            this.f44977S = oVar;
            this.f44980g = str;
            this.E2 = jVar;
            this.f44979e = str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x00c6, code lost:
        
            if (r8 == r7) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objT;
            iF iFVar;
            o oVar;
            String str;
            String str2;
            long jRl;
            Object objO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44982o;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                aC aCVar = aC.this;
                eO eOVar = (eO) aCVar.nr();
                aCVar.mUb(eOVar != null ? eO.rl(eOVar, null, null, null, null, null, null, true, false, 191, null) : null);
                fuX fux = aC.this.xMQ;
                cg.n nVar = cg.n.f43808t;
                o oVar2 = this.f44977S;
                String str3 = this.f44980g;
                cg.j jVar = this.E2;
                String str4 = this.f44979e;
                this.f44982o = 1;
                objT = fux.t(nVar, oVar2, str3, jVar, str4, this);
                if (objT != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jRl = this.f44983r;
                str2 = (String) this.J2;
                str = (String) this.f44976O;
                oVar = (o) this.f44984t;
                iFVar = (iF) this.f44981n;
                ResultKt.throwOnFailure(obj);
                objO = obj;
                iFVar.n(new j.DAz(oVar, str, str2, jRl, ((Number) objO).longValue() - this.f44977S.rl()));
                aC.this.xMQ(Dsr.Ml.f44966n);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            objT = obj;
            com.alightcreative.app.motion.activities.creatorprogram.redeem.CN3 cn3 = (com.alightcreative.app.motion.activities.creatorprogram.redeem.CN3) objT;
            if (Intrinsics.areEqual(cn3, CN3.w6.f44965n)) {
                aC.this.gh.n(j.afx.f8480n);
                aC.this.xMQ(Dsr.w6.f44969n);
            } else if (Intrinsics.areEqual(cn3, CN3.I28.f44960n)) {
                iFVar = aC.this.gh;
                oVar = this.f44977S;
                str = this.f44980g;
                str2 = this.f44979e;
                jRl = oVar.rl();
                aC aCVar2 = aC.this;
                this.f44981n = iFVar;
                this.f44984t = oVar;
                this.f44976O = str;
                this.J2 = str2;
                this.f44983r = jRl;
                this.f44982o = 2;
                objO = aCVar2.o(this);
            } else {
                if (!Intrinsics.areEqual(cn3, CN3.j.f44963n) && !Intrinsics.areEqual(cn3, CN3.n.f44964n) && !Intrinsics.areEqual(cn3, CN3.Ml.f44961n) && !Intrinsics.areEqual(cn3, CN3.Wre.f44962n)) {
                    throw new NoWhenBranchMatchedException();
                }
                aC.this.xMQ(Dsr.n.f44968n);
            }
            return Unit.INSTANCE;
        }
    }

    static final class I28 extends SuspendLambda implements Function2 {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f44985O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44987n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f44988o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f44989r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f44990t;

        I28(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return aC.this.new I28(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objN;
            o oVar;
            Object objO;
            List list;
            aC aCVar;
            int i2;
            o oVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f44988o;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                W.n nVar = aC.this.KN;
                o.C c2 = aC.this.Uo;
                this.f44988o = 1;
                objN = nVar.n(c2, this);
                if (objN != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.f44989r;
                o oVar3 = (o) this.J2;
                List list2 = (List) this.f44985O;
                aC aCVar2 = (aC) this.f44990t;
                o oVar4 = (o) this.f44987n;
                ResultKt.throwOnFailure(obj);
                oVar2 = oVar3;
                aCVar = aCVar2;
                oVar = oVar4;
                list = list2;
                objO = obj;
                aCVar.mUb(new eO(list, oVar2, null, null, null, null, i2 == 0, ((Number) objO).longValue() < oVar.rl(), Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            objN = obj;
            List list3 = (List) objN;
            oVar = (o) CollectionsKt.first(list3);
            aC aCVar3 = aC.this;
            this.f44987n = oVar;
            this.f44990t = aCVar3;
            this.f44985O = list3;
            this.J2 = oVar;
            this.f44989r = 0;
            this.f44988o = 2;
            objO = aCVar3.o(this);
            if (objO != coroutine_suspended) {
                list = list3;
                aCVar = aCVar3;
                i2 = 0;
                oVar2 = oVar;
                if (((Number) objO).longValue() < oVar.rl()) {
                }
                aCVar.mUb(new eO(list, oVar2, null, null, null, null, i2 == 0, ((Number) objO).longValue() < oVar.rl(), Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null));
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    static final class Ml extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f44991O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f44992n;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44992n = obj;
            this.f44991O |= Integer.MIN_VALUE;
            return aC.this.o(this);
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f44994O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ o f44995Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44996n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f44998r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f44999t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return aC.this.new Wre(this.f44995Z, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(o oVar, Continuation continuation) {
            super(2, continuation);
            this.f44995Z = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            aC aCVar;
            eO eOVar;
            eO eOVarRl;
            o oVar;
            Object objO;
            int i2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f44998r;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                aCVar = aC.this;
                eOVar = (eO) aCVar.nr();
                if (eOVar == null) {
                    eOVarRl = null;
                    aCVar.mUb(eOVarRl);
                    return Unit.INSTANCE;
                }
                oVar = this.f44995Z;
                aC aCVar2 = aC.this;
                this.f44996n = aCVar;
                this.f44999t = eOVar;
                this.f44994O = oVar;
                this.J2 = 0;
                this.f44998r = 1;
                objO = aCVar2.o(this);
                if (objO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i2 = 0;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.J2;
                oVar = (o) this.f44994O;
                eOVar = (eO) this.f44999t;
                aCVar = (aC) this.f44996n;
                ResultKt.throwOnFailure(obj);
                objO = obj;
            }
            eOVarRl = eO.rl(eOVar, null, oVar, null, null, null, null, i2 != 0, ((Number) objO).longValue() >= this.f44995Z.rl(), Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, null);
            aCVar.mUb(eOVarRl);
            return Unit.INSTANCE;
        }
    }

    public static final class j {

        /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.creatorprogram.redeem.aC$j$j, reason: collision with other inner class name */
        public static final class C0627j implements ViewModelProvider.Factory {
            final /* synthetic */ n rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ o.C f45000t;

            C0627j(n nVar, o.C c2) {
                this.rl = nVar;
                this.f45000t = c2;
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public ViewModel t(Class modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aC aCVarN = this.rl.n(this.f45000t);
                Intrinsics.checkNotNull(aCVarN, "null cannot be cast to non-null type T of com.alightcreative.app.motion.activities.creatorprogram.redeem.RedeemTokensViewModel.Companion.provideFactory.<no name provided>.create");
                return aCVarN;
            }
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final ViewModelProvider.Factory n(n assistedFactory, o.C rewardType) {
            Intrinsics.checkNotNullParameter(assistedFactory, "assistedFactory");
            Intrinsics.checkNotNullParameter(rewardType, "rewardType");
            return new C0627j(assistedFactory, rewardType);
        }
    }

    public interface n {
        aC n(o.C c2);
    }

    public /* synthetic */ class w6 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[o.C.values().length];
            try {
                iArr[o.C.f43813n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.C.f43815t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.C.f43812O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public aC(o.C rewardType, W.n getRewardListUseCase, fuX redeemTokensUseCase, W.j getCreatorProgramDataUseCase, iF eventLogger) {
        Intrinsics.checkNotNullParameter(rewardType, "rewardType");
        Intrinsics.checkNotNullParameter(getRewardListUseCase, "getRewardListUseCase");
        Intrinsics.checkNotNullParameter(redeemTokensUseCase, "redeemTokensUseCase");
        Intrinsics.checkNotNullParameter(getCreatorProgramDataUseCase, "getCreatorProgramDataUseCase");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.Uo = rewardType;
        this.KN = getRewardListUseCase;
        this.xMQ = redeemTokensUseCase;
        this.mUb = getCreatorProgramDataUseCase;
        this.gh = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Continuation continuation) {
        Ml ml;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f44991O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f44991O = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object objG = ml.f44992n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.f44991O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objG);
            TFv.Wre wreT = this.mUb.t();
            ml.f44991O = 1;
            objG = TFv.fuX.g(wreT, ml);
            if (objG == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objG);
        }
        cg.Wre wre = (cg.Wre) objG;
        return Boxing.boxLong(wre != null ? wre.J2() : 0L);
    }

    static /* synthetic */ xuv te(aC aCVar, o oVar, String str, cg.j jVar, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            jVar = null;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        return aCVar.g(oVar, str, jVar, str2);
    }

    public final void S(o reward, cg.j amazonRegion, String phoneNumber, String confirmPhoneNumber, String email, String confirmEmail) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(amazonRegion, "amazonRegion");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(confirmPhoneNumber, "confirmPhoneNumber");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(confirmEmail, "confirmEmail");
        int i2 = w6.$EnumSwitchMapping$0[reward.t().ordinal()];
        if (i2 == 1) {
            aYN(reward, email, confirmEmail);
        } else if (i2 == 2) {
            ViF(reward, amazonRegion, email, confirmEmail);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            nY(reward, phoneNumber, confirmPhoneNumber, email, confirmEmail);
        }
    }

    public final xuv WPU(o reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        return C.nr(ViewModelKt.n(this), null, null, new Wre(reward, null), 3, null);
    }

    public final void Z() {
        xMQ(Dsr.j.f44967n);
    }

    private final boolean E2(String str) {
        eO eOVarRl = null;
        if (str.length() == 0) {
            eO eOVar = (eO) nr();
            if (eOVar != null) {
                eOVarRl = eO.rl(eOVar, null, null, z.f6603t, null, null, null, false, false, 251, null);
            }
            mUb(eOVarRl);
            return false;
        }
        eO eOVar2 = (eO) nr();
        if (eOVar2 != null) {
            eOVarRl = eO.rl(eOVar2, null, null, null, null, null, null, false, false, 251, null);
        }
        mUb(eOVarRl);
        return true;
    }

    private final void ViF(o oVar, cg.j jVar, String str, String str2) {
        if (E2(str) && iF(str, str2)) {
            te(this, oVar, str, jVar, null, 8, null);
        }
    }

    private final void aYN(o oVar, String str, String str2) {
        if (E2(str) && iF(str, str2)) {
            te(this, oVar, str, null, null, 12, null);
        }
    }

    private final boolean e(String str) {
        eO eOVarRl = null;
        if (StringsKt.toLongOrNull(str) == null) {
            eO eOVar = (eO) nr();
            if (eOVar != null) {
                eOVarRl = eO.rl(eOVar, null, null, null, null, z.f6602r, null, false, false, 239, null);
            }
            mUb(eOVarRl);
            return false;
        }
        eO eOVar2 = (eO) nr();
        if (eOVar2 != null) {
            eOVarRl = eO.rl(eOVar2, null, null, null, null, null, null, false, false, 239, null);
        }
        mUb(eOVarRl);
        return true;
    }

    private final boolean fD(String str, String str2) {
        boolean zAreEqual = Intrinsics.areEqual(str, str2);
        eO eOVarRl = null;
        if (!zAreEqual) {
            eO eOVar = (eO) nr();
            if (eOVar != null) {
                eOVarRl = eO.rl(eOVar, null, null, null, null, null, z.f6597O, false, false, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, null);
            }
            mUb(eOVarRl);
            return false;
        }
        eO eOVar2 = (eO) nr();
        if (eOVar2 != null) {
            eOVarRl = eO.rl(eOVar2, null, null, null, null, null, null, false, false, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, null);
        }
        mUb(eOVarRl);
        return true;
    }

    private final xuv g(o oVar, String str, cg.j jVar, String str2) {
        return C.nr(ViewModelKt.n(this), null, null, new CN3(oVar, str, jVar, str2, null), 3, null);
    }

    private final boolean iF(String str, String str2) {
        boolean zAreEqual = Intrinsics.areEqual(str, str2);
        eO eOVarRl = null;
        if (!zAreEqual) {
            eO eOVar = (eO) nr();
            if (eOVar != null) {
                eOVarRl = eO.rl(eOVar, null, null, null, z.J2, null, null, false, false, 247, null);
            }
            mUb(eOVarRl);
            return false;
        }
        eO eOVar2 = (eO) nr();
        if (eOVar2 != null) {
            eOVarRl = eO.rl(eOVar2, null, null, null, null, null, null, false, false, 247, null);
        }
        mUb(eOVarRl);
        return true;
    }

    private final void nY(o oVar, String str, String str2, String str3, String str4) {
        if (e(str) && fD(str, str2) && E2(str3) && iF(str3, str4)) {
            te(this, oVar, str3, null, str, 4, null);
        }
    }

    @Override // uW.w6
    public void Uo() {
        C.nr(ViewModelKt.n(this), null, null, new I28(null), 3, null);
    }

    public final void XQ() {
        eO eOVarRl;
        eO eOVar = (eO) nr();
        if (eOVar != null) {
            eOVarRl = eO.rl(eOVar, null, null, null, null, null, null, false, false, 191, null);
        } else {
            eOVarRl = null;
        }
        mUb(eOVarRl);
        xMQ(Dsr.j.f44967n);
    }
}
