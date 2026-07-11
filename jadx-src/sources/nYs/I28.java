package nYs;

import TFv.Lu;
import TFv.SPz;
import TFv.rv6;
import com.alightcreative.monorepo.settings.AlightSettingsEntity;
import com.bendingspoons.oracle.models.OracleResponse;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import l3.AbstractC2255j;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class I28 implements Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final U5u.j f71161n;
    private JSONObject nr;
    private final SPz rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final rv6 f71162t;

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f71164n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f71165t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f71165t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return I28.this.n(null, this);
        }
    }

    public I28(U5u.j oracleAppSettings) {
        Intrinsics.checkNotNullParameter(oracleAppSettings, "oracleAppSettings");
        this.f71161n = oracleAppSettings;
        SPz sPzN = Lu.n(null);
        this.rl = sPzN;
        this.f71162t = sPzN;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nYs.Ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(OracleResponse oracleResponse, Continuation continuation) {
        j jVar;
        SPz sPz;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objN = jVar.f71165t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            try {
                Result.Companion companion = Result.INSTANCE;
                String rawBody = oracleResponse.getRawBody();
                this.nr = rawBody != null ? new JSONObject(rawBody).getJSONObject("settings") : null;
                Result.m313constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m313constructorimpl(ResultKt.createFailure(th));
            }
            sPz = this.rl;
            U5u.j jVar2 = this.f71161n;
            jVar.f71164n = sPz;
            jVar.J2 = 1;
            objN = AbstractC2255j.n(jVar2, jVar);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sPz = (SPz) jVar.f71164n;
            ResultKt.throwOnFailure(objN);
        }
        AlightSettingsEntity alightSettingsEntity = (AlightSettingsEntity) objN;
        sPz.setValue(alightSettingsEntity != null ? n.nr(alightSettingsEntity) : null);
        return Unit.INSTANCE;
    }

    @Override // nYs.Ml
    public rv6 rl() {
        return this.f71162t;
    }

    @Override // nYs.Ml
    public JSONObject t() {
        return this.nr;
    }

    @Override // nYs.Ml
    public nYs.j invoke() {
        return (nYs.j) rl().getValue();
    }
}
