package qE;

import com.bendingspoons.oracle.models.OracleResponse;
import com.bendingspoons.oracle.models.Settings;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qE.u;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class eO {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final rB.Ml f72292O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final u f72293n;
    private final kotlinx.serialization.json.n nr;
    private final v8.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f72294t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class j extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f72295O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f72296n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f72297o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f72299t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f72297o |= Integer.MIN_VALUE;
            return eO.this.t(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(OracleResponse oracleResponse, Continuation continuation) {
        j jVar;
        String rawBody;
        eO eOVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f72297o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f72297o = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objO = jVar.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f72297o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objO);
            String defaultSettingsUrl = oracleResponse.getDefaultSettingsUrl();
            if (defaultSettingsUrl == null) {
                return new n.C1266n(new IllegalStateException("default settings url is null"));
            }
            rawBody = oracleResponse.getRawBody();
            if (rawBody == null) {
                return new n.C1266n(new IllegalStateException("response body is null"));
            }
            u uVar = this.f72293n;
            String overridesUrl = oracleResponse.getOverridesUrl();
            jVar.f72296n = this;
            jVar.f72299t = oracleResponse;
            jVar.f72295O = rawBody;
            jVar.f72297o = 1;
            objO = uVar.O(defaultSettingsUrl, overridesUrl, jVar);
            if (objO == coroutine_suspended) {
                return coroutine_suspended;
            }
            eOVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) jVar.f72295O;
            OracleResponse oracleResponse2 = (OracleResponse) jVar.f72299t;
            eOVar = (eO) jVar.f72296n;
            ResultKt.throwOnFailure(objO);
            rawBody = str;
            oracleResponse = oracleResponse2;
        }
        x0X.n nVar = (x0X.n) objO;
        if (nVar instanceof n.C1266n) {
            return new n.w6(oracleResponse);
        }
        if (!(nVar instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        u.n nVar2 = (u.n) ((n.w6) nVar).n();
        final Map mapN = nVar2.n();
        final Map mapRl = nVar2.rl();
        v8.n.O(eOVar.rl, new Function0() { // from class: qE.Pl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return eO.nr(mapN);
            }
        });
        v8.n.O(eOVar.rl, new Function0() { // from class: qE.Xo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return eO.O(mapRl);
            }
        });
        if (mapRl == null) {
            mapRl = qf.t(new Pair[0]);
        }
        Map mapUo = qf.Uo(mapN, mapRl);
        x0X.n nVarXMQ = l3D.xMQ(rawBody);
        if (nVarXMQ instanceof n.C1266n) {
            n.C1266n c1266n = (n.C1266n) nVarXMQ;
            eOVar.f72292O.t(l3D.Uo(qE.j.f72306n, "response", (Throwable) c1266n.n()));
            return c1266n;
        }
        if (!(nVarXMQ instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        x0X.n nVarMUb = l3D.mUb(qf.Uo(mapUo, ((qf) ((n.w6) nVarXMQ).n()).xMQ()), eOVar.f72294t, eOVar.nr);
        if (nVarMUb instanceof n.C1266n) {
            eOVar.f72292O.t(l3D.Uo(qE.j.f72306n, "merged", (Throwable) ((n.C1266n) nVarMUb).n()));
            return new n.w6(oracleResponse);
        }
        if (!(nVarMUb instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        Pair pair = (Pair) ((n.w6) nVarMUb).n();
        String str2 = (String) pair.component1();
        Settings settings = (Settings) pair.component2();
        x0X.n nVarGh = l3D.gh(rawBody, str2);
        if (nVarGh instanceof n.C1266n) {
            n.C1266n c1266n2 = (n.C1266n) nVarGh;
            eOVar.f72292O.t(qE.j.f72306n.t("ReplaceSettingInResponse", (Throwable) c1266n2.n(), pq.I28.n(pq.n.O(YjqZUJsVmhcjko.vSTEUOYyr, "fetched settings"))));
            return c1266n2;
        }
        if (!(nVarGh instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        oracleResponse.setRawBody((String) ((n.w6) nVarGh).n());
        oracleResponse.setSettings(settings);
        return new n.w6(oracleResponse);
    }

    public eO(u settingsFetcher, v8.j localLogger, rB.Ml spiderSense, boolean z2, kotlinx.serialization.json.n json) {
        Intrinsics.checkNotNullParameter(settingsFetcher, "settingsFetcher");
        Intrinsics.checkNotNullParameter(localLogger, "localLogger");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f72293n = settingsFetcher;
        this.rl = localLogger;
        this.f72294t = z2;
        this.nr = json;
        rB.Ml mlJ2 = d3.j.J2(spiderSense, "oracle", "service");
        this.f72292O = mlJ2;
        settingsFetcher.KN(mlJ2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O(Map map) {
        if (map == null) {
            return "No overrides URL.";
        }
        List listSorted = CollectionsKt.sorted(map.keySet());
        String str = listSorted.size() + " settings from overrides URL:   \t" + listSorted;
        return str == null ? "No overrides URL." : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nr(Map map) {
        List listSorted = CollectionsKt.sorted(map.keySet());
        return listSorted.size() + " settings from defaults URL:    \t" + listSorted;
    }
}
