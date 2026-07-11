package JiP;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import gm.n;
import mc.fuX;
import org.json.JSONArray;
import org.json.JSONException;
import u9n.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j extends BroadcastReceiver {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n f4679n;
    public boolean rl = false;

    public j(n nVar) {
        this.f4679n = nVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        n nVar;
        if ("com.dt.ignite.service.action.PROPERTY_CHANGED".equals(intent.getAction())) {
            eh.n.n("%s : broadcast received", "PropertyChangeReceiver");
            String stringExtra = intent.getStringExtra("PROPERTIES_CHANGED");
            if (stringExtra != null && (nVar = this.f4679n) != null) {
                Ml ml = (Ml) nVar;
                try {
                    JSONArray jSONArray = new JSONArray(stringExtra);
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        if ("DTID".equalsIgnoreCase(jSONArray.getString(i2))) {
                            eh.n.n("%s : onPropertiesChanged", "OneDTPropertyWatchdog");
                            if (ml.f74138t.c()) {
                                eh.n.n("%s : onPropertiesChanged: will reconnect", "OneDTPropertyWatchdog");
                                fuX fux = ml.nr;
                                if (fux != null) {
                                    eh.n.n("%s : one dt refresh required", "OneDTAuthenticator");
                                    fux.f70885e.set(true);
                                }
                                ml.f74138t.l();
                                return;
                            }
                            fuX fux2 = ml.nr;
                            if (fux2 != null) {
                                fux2.nr();
                                return;
                            }
                            return;
                        }
                    }
                } catch (JSONException e2) {
                    Msr.n.n(Msr.Ml.ONE_DT_BROADCAST_ERROR, e2);
                }
            }
        }
    }
}
