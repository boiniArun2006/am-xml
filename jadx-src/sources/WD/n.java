package WD;

import ajd.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n implements K6D.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ajd.j f11444n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final K6D.Ml f11445t;

    public n(ajd.j debugEvent, String str, K6D.Ml helper) {
        Intrinsics.checkNotNullParameter(debugEvent, "debugEvent");
        Intrinsics.checkNotNullParameter(helper, "helper");
        this.f11444n = debugEvent;
        this.rl = str;
        this.f11445t = helper;
    }

    @Override // K6D.j
    public void n(pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        K6D.Ml ml = this.f11445t;
        ajd.j jVar = this.f11444n;
        ml.t(ajd.j.rl(jVar, null, null, null, null, jVar.J2().rl(additionalInfo), 15, null), this.rl);
    }

    @Override // K6D.j
    public void rl(String str, j.EnumC0481j severity, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        K6D.Ml ml = this.f11445t;
        ajd.j jVar = this.f11444n;
        ml.nr(ajd.j.rl(jVar, null, severity, null, str, jVar.J2().rl(additionalInfo), 5, null), this.rl);
    }
}
