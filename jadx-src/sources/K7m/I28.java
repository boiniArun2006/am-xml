package K7m;

import a88.aC;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static aC f4837n = aC.UNKNOWN;

    class j extends BroadcastReceiver {
        j() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            aC aCVar;
            if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                if (intExtra == 0) {
                    aCVar = aC.NOT_DETECTED;
                } else if (intExtra == 1) {
                    aCVar = aC.UNKNOWN;
                } else {
                    return;
                }
                aC unused = I28.f4837n = aCVar;
            }
        }
    }

    public static void t(Context context) {
        context.registerReceiver(new j(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static aC n() {
        if (K7m.j.n() != a88.CN3.CTV) {
            return aC.UNKNOWN;
        }
        return f4837n;
    }
}
