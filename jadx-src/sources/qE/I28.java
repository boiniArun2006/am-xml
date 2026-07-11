package qE;

import GJW.OU;
import GJW.vd;
import com.bendingspoons.oracle.models.OracleResponse;
import com.bendingspoons.oracle.models.Settings;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f72192n;
    private final kotlinx.serialization.json.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final rB.Ml f72193t;

    static final class j extends SuspendLambda implements Function2 {
        final /* synthetic */ I28 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f72194O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72195n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ OracleResponse f72196r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f72197t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, String str2, I28 i28, OracleResponse oracleResponse, Continuation continuation) {
            super(2, continuation);
            this.f72197t = str;
            this.f72194O = str2;
            this.J2 = i28;
            this.f72196r = oracleResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f72197t, this.f72194O, this.J2, this.f72196r, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f72195n == 0) {
                ResultKt.throwOnFailure(obj);
                x0X.n nVarXMQ = l3D.xMQ(this.f72197t);
                I28 i28 = this.J2;
                if (nVarXMQ instanceof n.C1266n) {
                    n.C1266n c1266n = (n.C1266n) nVarXMQ;
                    i28.f72193t.t(l3D.Uo(qE.j.f72306n, "cache", (Throwable) c1266n.n()));
                    return c1266n;
                }
                if (nVarXMQ instanceof n.w6) {
                    Map mapXMQ = ((qf) ((n.w6) nVarXMQ).n()).xMQ();
                    x0X.n nVarXMQ2 = l3D.xMQ(this.f72194O);
                    I28 i282 = this.J2;
                    if (nVarXMQ2 instanceof n.C1266n) {
                        n.C1266n c1266n2 = (n.C1266n) nVarXMQ2;
                        i282.f72193t.t(l3D.Uo(qE.j.f72306n, "response", (Throwable) c1266n2.n()));
                        return c1266n2;
                    }
                    if (nVarXMQ2 instanceof n.w6) {
                        x0X.n nVarMUb = l3D.mUb(qf.Uo(mapXMQ, ((qf) ((n.w6) nVarXMQ2).n()).xMQ()), this.J2.f72192n, this.J2.rl);
                        I28 i283 = this.J2;
                        if (nVarMUb instanceof n.C1266n) {
                            n.C1266n c1266n3 = (n.C1266n) nVarMUb;
                            i283.f72193t.t(l3D.Uo(qE.j.f72306n, "merged", (Throwable) c1266n3.n()));
                            return c1266n3;
                        }
                        if (nVarMUb instanceof n.w6) {
                            Pair pair = (Pair) ((n.w6) nVarMUb).n();
                            String str = (String) pair.component1();
                            Settings settings = (Settings) pair.component2();
                            OracleResponse oracleResponse = this.f72196r;
                            x0X.n nVarGh = l3D.gh(this.f72194O, str);
                            I28 i284 = this.J2;
                            if (nVarGh instanceof n.C1266n) {
                                n.C1266n c1266n4 = (n.C1266n) nVarGh;
                                i284.f72193t.t(qE.j.f72306n.t("ReplaceSettingInResponse", (Throwable) c1266n4.n(), pq.I28.n(pq.n.O("source", "cached settings"))));
                                return c1266n4;
                            }
                            if (nVarGh instanceof n.w6) {
                                oracleResponse.setRawBody((String) ((n.w6) nVarGh).n());
                                this.f72196r.setSettings(settings);
                                return new n.w6(this.f72196r);
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public I28(rB.Ml spiderSense, boolean z2, kotlinx.serialization.json.n json) {
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f72192n = z2;
        this.rl = json;
        this.f72193t = d3.j.J2(spiderSense, "oracle", "service");
    }

    public final Object nr(OracleResponse oracleResponse, OracleResponse oracleResponse2, Continuation continuation) {
        String rawBody = oracleResponse.getRawBody();
        if (rawBody == null) {
            return new n.C1266n(new IllegalArgumentException("response body is null"));
        }
        String rawBody2 = oracleResponse2.getRawBody();
        if (rawBody2 == null) {
            return new n.C1266n(new IllegalArgumentException("cached response body is null"));
        }
        return GJW.Dsr.Uo(OU.rl(), new j(rawBody2, rawBody, this, oracleResponse, null), continuation);
    }
}
