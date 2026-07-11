package NoE;

import QmE.iF;
import bIo.Wre;
import ga6.j;
import i.AbstractC2166Wre;
import i.C2165Ml;
import i.C2169w6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import xAo.Ln;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n implements NoE.j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f7101t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final nYs.Ml f7102n;
    private final iF rl;

    static final class Ml extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ F2p.Ml f7103O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7104n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(F2p.Ml ml, Continuation continuation) {
            super(1, continuation);
            this.f7103O = ml;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return n.this.new Ml(this.f7103O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException {
            C2165Ml c2165MlRl;
            C2169w6 c2169w6T;
            JSONObject jSONObjectRl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7104n == 0) {
                ResultKt.throwOnFailure(obj);
                JSONObject jSONObjectT = n.this.nr().t();
                String strO = n.this.O(this.f7103O);
                if (jSONObjectT != null && (jSONObjectRl = Ln.rl(jSONObjectT, strO)) != null) {
                    c2165MlRl = AbstractC2166Wre.rl(jSONObjectRl);
                } else {
                    c2165MlRl = null;
                }
                if (c2165MlRl != null && (c2169w6T = Iy.j.t(Iy.j.f4399n, c2165MlRl, null, 2, null)) != null) {
                    String strJ2 = n.this.J2(this.f7103O);
                    String strO2 = Wre.O(jSONObjectT, strJ2);
                    if (strO2 != null) {
                        List listRl = s7Q.n.f73178n.rl(strO2);
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listRl, 10));
                        Iterator it = listRl.iterator();
                        while (it.hasNext()) {
                            arrayList.add(F2p.w6.n((F2p.n) it.next(), c2169w6T));
                        }
                        return arrayList;
                    }
                    throw new IllegalStateException("Missing " + strJ2 + " key in settings");
                }
                throw new IllegalStateException("Missing or incorrect " + strO + " key in settings");
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Ml) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class w6 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7107n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f7108t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7108t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return n.this.n(null, this);
        }
    }

    /* JADX INFO: renamed from: NoE.n$n, reason: collision with other inner class name */
    public /* synthetic */ class C0240n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[F2p.Ml.values().length];
            try {
                iArr[F2p.Ml.f2486n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F2p.Ml.f2488t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[F2p.Ml.f2485O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public n(nYs.Ml getAlightSettingsUseCase, iF eventLogger) {
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f7102n = getAlightSettingsUseCase;
        this.rl = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String J2(F2p.Ml ml) {
        int i2 = C0240n.$EnumSwitchMapping$0[ml.ordinal()];
        if (i2 == 1) {
            return "creator_program_faq_list";
        }
        if (i2 == 2) {
            return "creator_ranking_faq_list";
        }
        if (i2 == 3) {
            return "creator_program_how_it_works_list";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String O(F2p.Ml ml) {
        int i2 = C0240n.$EnumSwitchMapping$0[ml.ordinal()];
        if (i2 == 1) {
            return "creator_program_remote_localization";
        }
        if (i2 == 2) {
            return "creator_ranking_remote_localization";
        }
        if (i2 == 3) {
            return "creator_program_remote_localization";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // NoE.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(F2p.Ml ml, Continuation continuation) {
        w6 w6Var;
        n nVar;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.J2 = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objUo = w6Var.f7108t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            Ml ml2 = new Ml(ml, null);
            w6Var.f7107n = this;
            w6Var.J2 = 1;
            objUo = x0X.w6.Uo(ml2, w6Var);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            nVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = (n) w6Var.f7107n;
            ResultKt.throwOnFailure(objUo);
        }
        return M3.j.rl(M3.n.rl((x0X.n) objUo, j.w6.J2, j.EnumC0949j.f67614Z, null, null, 12, null), nVar.rl);
    }

    public final nYs.Ml nr() {
        return this.f7102n;
    }
}
