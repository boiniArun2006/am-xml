package cd;

import QmE.iF;
import QmE.j;
import YV.aC;
import YV.eO;
import android.app.Activity;
import com.alightcreative.account.IAPItemType;
import f.EnumC1982eO;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class g9s {
    private kgE.j J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private List f43730O;
    private EnumC1982eO Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final YV.Wre f43731n;
    private mg4.w6 nr;
    private final iF rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f43732t;

    static final class n extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f43733O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f43734n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f43735o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f43737t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f43735o |= Integer.MIN_VALUE;
            return g9s.this.t(null, null, null, null, null, null, this);
        }
    }

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[YV.fuX.values().length];
            try {
                iArr[YV.fuX.f12140n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[YV.fuX.f12142t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[YV.fuX.f12139O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public g9s(YV.Wre monopoly, iF eventLogger) {
        Intrinsics.checkNotNullParameter(monopoly, "monopoly");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f43731n = monopoly;
        this.rl = eventLogger;
        this.nr = mg4.w6.f70997n;
        this.f43730O = CollectionsKt.emptyList();
    }

    public final kgE.j n() {
        return this.J2;
    }

    public final void rl(YV.fuX monopolyPurchaseState) {
        Intrinsics.checkNotNullParameter(monopolyPurchaseState, "monopolyPurchaseState");
        kgE.j jVar = this.J2;
        if (jVar == null) {
            return;
        }
        int i2 = j.$EnumSwitchMapping$0[monopolyPurchaseState.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                this.rl.n(new j.ozJ(jVar.xMQ(), this.f43732t));
                return;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                this.rl.n(new j.AZy(jVar.xMQ(), this.f43732t));
                return;
            }
        }
        iF iFVar = this.rl;
        String strXMQ = jVar.xMQ();
        String str = this.f43732t;
        com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
        iFVar.n(new j.C1438dT(strXMQ, str, jVar2.getSessionNumber(), jVar2.isFirstPaywall(), this.nr, this.f43730O, this.Uo));
        if (jVar.nr() == IAPItemType.Subscription) {
            this.rl.n(j.S.f8449n);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(Activity activity, kgE.j jVar, String str, mg4.w6 w6Var, List list, EnumC1982eO enumC1982eO, Continuation continuation) {
        n nVar;
        g9s g9sVar;
        x0X.n nVar2;
        kgE.j jVar2 = jVar;
        String str2 = str;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f43735o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f43735o = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        n nVar3 = nVar;
        Object objN = nVar3.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar3.f43735o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            this.f43732t = str2;
            this.nr = w6Var;
            this.f43730O = list;
            this.J2 = jVar2;
            this.Uo = enumC1982eO;
            if (jVar2.nr() == IAPItemType.Subscription) {
                YV.Wre wre = this.f43731n;
                String strXMQ = jVar2.xMQ();
                KNH.I28 i28 = KNH.I28.f5294t;
                nVar3.f43734n = this;
                nVar3.f43737t = jVar2;
                nVar3.f43733O = str2;
                nVar3.f43735o = 1;
                objN = eO.j.n(wre, activity, strXMQ, null, null, i28, null, nVar3, 40, null);
                if (objN != coroutine_suspended) {
                    g9sVar = this;
                    nVar2 = (x0X.n) objN;
                }
            } else {
                YV.Wre wre2 = this.f43731n;
                String strXMQ2 = jVar2.xMQ();
                nVar3.f43734n = this;
                nVar3.f43737t = jVar2;
                nVar3.f43733O = str2;
                nVar3.f43735o = 2;
                objN = aC.j.n(wre2, activity, strXMQ2, null, nVar3, 4, null);
                if (objN != coroutine_suspended) {
                    g9sVar = this;
                    nVar2 = (x0X.n) objN;
                }
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            String str3 = (String) nVar3.f43733O;
            kgE.j jVar3 = (kgE.j) nVar3.f43737t;
            g9sVar = (g9s) nVar3.f43734n;
            ResultKt.throwOnFailure(objN);
            str2 = str3;
            jVar2 = jVar3;
            nVar2 = (x0X.n) objN;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str4 = (String) nVar3.f43733O;
            kgE.j jVar4 = (kgE.j) nVar3.f43737t;
            g9sVar = (g9s) nVar3.f43734n;
            ResultKt.throwOnFailure(objN);
            str2 = str4;
            jVar2 = jVar4;
            nVar2 = (x0X.n) objN;
        }
        boolean z2 = nVar2 instanceof n.C1266n;
        if (z2) {
            g9sVar.rl.n(new j.ozJ(jVar2.xMQ(), str2));
        } else if (!(nVar2 instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        if (z2) {
            return nVar2;
        }
        if (!(nVar2 instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        g9sVar.rl((YV.fuX) ((n.w6) nVar2).n());
        return nVar2;
    }
}
