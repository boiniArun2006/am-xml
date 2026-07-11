package BUw;

import SHQ.j;
import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class I28 implements j.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private YSF.n f481n;
    private YSF.n rl;

    private static void rl(YSF.n nVar, String str, Bundle bundle) {
        if (nVar == null) {
            return;
        }
        nVar.O(str, bundle);
    }

    private void t(String str, Bundle bundle) {
        rl("clx".equals(bundle.getString("_o")) ? this.f481n : this.rl, str, bundle);
    }

    public void O(YSF.n nVar) {
        this.f481n = nVar;
    }

    public void nr(YSF.n nVar) {
        this.rl = nVar;
    }

    I28() {
    }

    @Override // SHQ.j.n
    public void n(int i2, Bundle bundle) {
        String string;
        h1M.CN3.J2().xMQ(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i2), bundle));
        if (bundle != null && (string = bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME)) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            t(string, bundle2);
        }
    }
}
