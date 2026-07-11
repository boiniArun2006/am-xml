package J2B;

import Vy.Pl;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class aC {
    private static aC nr = new aC();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WeakReference f4424n;
    private boolean rl = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f4425t = false;

    class j extends BroadcastReceiver {
        j() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            aC aCVar;
            boolean z2;
            boolean z3;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                aCVar = aC.this;
                z2 = aCVar.f4425t;
                z3 = true;
            } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                aCVar = aC.this;
                z2 = aCVar.f4425t;
                z3 = false;
            } else {
                return;
            }
            aCVar.t(z3, z2);
            aC.this.rl = z3;
        }
    }

    public void t(boolean z2, boolean z3) {
        if ((z3 || z2) == (this.f4425t || this.rl)) {
            return;
        }
        Iterator it = w6.O().t().iterator();
        while (it.hasNext()) {
            ((Pl) it.next()).qie().Ik(z3 || z2);
        }
    }

    public static aC J2() {
        return nr;
    }

    public void n() {
        KeyguardManager keyguardManager;
        Context context = (Context) this.f4424n.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        t(this.rl, zIsDeviceLocked);
        this.f4425t = zIsDeviceLocked;
    }

    public void rl(Context context) {
        if (context == null) {
            return;
        }
        this.f4424n = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new j(), intentFilter);
    }
}
