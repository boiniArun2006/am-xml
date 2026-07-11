package upM;

import Vy.Dsr;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Dsr f74603n = Dsr.UNKNOWN;

    class j extends BroadcastReceiver {
        j() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Dsr dsr;
            if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                if (intExtra == 0) {
                    dsr = Dsr.NOT_DETECTED;
                } else if (intExtra == 1) {
                    dsr = Dsr.UNKNOWN;
                } else {
                    return;
                }
                Dsr unused = I28.f74603n = dsr;
            }
        }
    }

    public static void t(Context context) {
        context.registerReceiver(new j(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static Dsr n() {
        if (upM.j.n() != Vy.CN3.CTV) {
            return Dsr.UNKNOWN;
        }
        return f74603n;
    }
}
