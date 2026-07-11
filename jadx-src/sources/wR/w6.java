package wR;

import QmE.j;
import QmE.yg;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class w6 implements yg {
    @Override // QmE.yg
    public void n(QmE.j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof j.qf) {
            FirebaseCrashlytics.getInstance().log("crisper_evaluate: " + ((j.qf) event).n().getValue());
            return;
        }
        if (event instanceof j.lej) {
            FirebaseCrashlytics.getInstance().log("crisper_script: " + StringsKt.take(((j.lej) event).n(), 1000));
            return;
        }
        if (event instanceof j.iwV) {
            FirebaseCrashlytics.getInstance().log("crisper_app_info: " + ((j.iwV) event).n());
            return;
        }
        if (event instanceof j.xZD) {
            ga6.j jVarN = ((j.xZD) event).n();
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "getInstance(...)");
            firebaseCrashlytics.log("error_severity: " + jVarN.nr().rl());
            firebaseCrashlytics.log("error_category: " + jVarN.n().rl());
            firebaseCrashlytics.log("error_domain: " + jVarN.t().rl());
            firebaseCrashlytics.recordException(jVarN.O());
        }
    }
}
