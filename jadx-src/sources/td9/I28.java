package td9;

import QmE.iF;
import QmE.j;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import ga6.j;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import td9.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class I28 implements lej {
    private final List J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final iF f73509O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final sqD.n f73510n;
    private final xAo.vd nr;
    private final nYs.Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final xAo.lej f73511t;
    public static final j Uo = new j(null);
    public static final int KN = 8;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f73513n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f73514t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f73514t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return I28.this.n(this);
        }
    }

    static final class w6 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73515n;

        w6(Continuation continuation) {
            super(1, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final JSONObject xMQ(I28 i28) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("server_time_millis", i28.nr.invoke());
            return jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return I28.this.new w6(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00c7 A[LOOP:0: B:17:0x00c1->B:19:0x00c7, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws JSONException {
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f73515n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                nYs.j jVarInvoke = I28.this.rl.invoke();
                if (jVarInvoke == null || (strGh = jVarInvoke.gh()) == null) {
                    xAo.lej lejVar = I28.this.f73511t;
                    this.f73515n = 1;
                    obj = lejVar.n("crisper/mnt.js", this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                I28.this.f73509O.n(new j.lej(strGh));
                I28.this.f73510n.t(strGh);
                JSONObject jSONObject = new JSONObject();
                I28 i28 = I28.this;
                jSONObject.put(AppLovinBridge.f61288f, AppLovinBridge.f61290h);
                com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
                jSONObject.put(BrandSafetyEvent.ag, jVar.isFirstSession());
                jSONObject.put("session_number", jVar.getSessionNumber());
                jSONObject.put("install_date_timestamp", jVar.getInstallDateTimestamp());
                jSONObject.put("settings", i28.rl.t());
                I28.this.f73509O.n(new j.iwV(jSONObject));
                I28.this.f73510n.O(jSONObject);
                sqD.n nVar = I28.this.f73510n;
                final I28 i282 = I28.this;
                nVar.J2(new Function0() { // from class: td9.Wre
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return I28.w6.xMQ(i282);
                    }
                });
                List list = I28.this.J2;
                I28 i283 = I28.this;
                it = list.iterator();
                while (it.hasNext()) {
                    ((xAo.w6) it.next()).n(i283.f73510n);
                }
                return Unit.INSTANCE;
            }
            String strGh = (String) obj;
            I28.this.f73509O.n(new j.lej(strGh));
            I28.this.f73510n.t(strGh);
            JSONObject jSONObject2 = new JSONObject();
            I28 i284 = I28.this;
            jSONObject2.put(AppLovinBridge.f61288f, AppLovinBridge.f61290h);
            com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
            jSONObject2.put(BrandSafetyEvent.ag, jVar2.isFirstSession());
            jSONObject2.put("session_number", jVar2.getSessionNumber());
            jSONObject2.put("install_date_timestamp", jVar2.getInstallDateTimestamp());
            jSONObject2.put("settings", i284.rl.t());
            I28.this.f73509O.n(new j.iwV(jSONObject2));
            I28.this.f73510n.O(jSONObject2);
            sqD.n nVar2 = I28.this.f73510n;
            final I28 i2822 = I28.this;
            nVar2.J2(new Function0() { // from class: td9.Wre
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return I28.w6.xMQ(i2822);
                }
            });
            List list2 = I28.this.J2;
            I28 i2832 = I28.this;
            it = list2.iterator();
            while (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }
    }

    public I28(sqD.n crisper, nYs.Ml alightSettingsUseCase, xAo.lej loadCrisperScriptAssetUseCase, xAo.vd safeTimeWithOffsetUseCase, iF eventLogger, List providers) {
        Intrinsics.checkNotNullParameter(crisper, "crisper");
        Intrinsics.checkNotNullParameter(alightSettingsUseCase, "alightSettingsUseCase");
        Intrinsics.checkNotNullParameter(loadCrisperScriptAssetUseCase, "loadCrisperScriptAssetUseCase");
        Intrinsics.checkNotNullParameter(safeTimeWithOffsetUseCase, "safeTimeWithOffsetUseCase");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(providers, "providers");
        this.f73510n = crisper;
        this.rl = alightSettingsUseCase;
        this.f73511t = loadCrisperScriptAssetUseCase;
        this.nr = safeTimeWithOffsetUseCase;
        this.f73509O = eventLogger;
        this.J2 = providers;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // td9.lej
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        n nVar;
        I28 i28;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objUo = nVar.f73514t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            w6 w6Var = new w6(null);
            nVar.f73513n = this;
            nVar.J2 = 1;
            objUo = x0X.w6.Uo(w6Var, nVar);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            i28 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i28 = (I28) nVar.f73513n;
            ResultKt.throwOnFailure(objUo);
        }
        return M3.j.rl(M3.n.rl((x0X.n) objUo, j.w6.J2, j.EnumC0949j.f67611O, null, null, 12, null), i28.f73509O);
    }
}
