package com.fyber.inneractive.sdk.bidder;

import ScC.FuwU.XIvb;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class f extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f53171a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z2 = true;
        if (intent == null || intent.getAction() == null) {
            return;
        }
        String action = intent.getAction();
        action.getClass();
        switch (action) {
            case "android.intent.action.BATTERY_CHANGED":
                b bVar = (b) this.f53171a;
                bVar.f53126b.getClass();
                int intExtra = intent.getIntExtra("plugged", -1);
                if (intExtra != 1 && intExtra != 2 && intExtra != 4) {
                    z2 = false;
                }
                Boolean bool = bVar.f53127c.f53134B;
                if (bool == null || bool.booleanValue() != z2) {
                    bVar.f53127c.f53134B = Boolean.valueOf(z2);
                    bVar.d();
                }
                bVar.f53126b.getClass();
                if (!TextUtils.equals(bVar.f53127c.f53135C, com.fyber.inneractive.sdk.serverapi.b.a((intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / intent.getIntExtra("scale", -1)))) {
                    d dVar = bVar.f53127c;
                    bVar.f53126b.getClass();
                    dVar.f53135C = com.fyber.inneractive.sdk.serverapi.b.a((intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / intent.getIntExtra("scale", -1));
                    bVar.d();
                    break;
                }
                break;
            case "android.bluetooth.adapter.action.STATE_CHANGED":
            case "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED":
                b bVar2 = (b) this.f53171a;
                bVar2.getClass();
                Boolean bool2 = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", Integer.MIN_VALUE) == 2 ? Boolean.TRUE : null;
                d dVar2 = bVar2.f53127c;
                if (dVar2.f53164t != bool2) {
                    dVar2.f53164t = bool2;
                    bVar2.d();
                    break;
                }
                break;
            case "android.intent.action.AIRPLANE_MODE":
                b bVar3 = (b) this.f53171a;
                bVar3.f53127c.f53167w = Boolean.valueOf(intent.getBooleanExtra("state", false));
                bVar3.d();
                break;
            case "android.os.action.POWER_SAVE_MODE_CHANGED":
                b bVar4 = (b) this.f53171a;
                bVar4.f53127c.f53165u = com.fyber.inneractive.sdk.serverapi.b.n();
                bVar4.d();
                break;
            case "android.media.RINGER_MODE_CHANGED":
                b bVar5 = (b) this.f53171a;
                bVar5.getClass();
                int intExtra2 = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", -1);
                if (intExtra2 != 0 && intExtra2 != 1) {
                    z2 = false;
                }
                Boolean bool3 = bVar5.f53127c.f53169y;
                if (bool3 == null || bool3.booleanValue() != z2) {
                    bVar5.f53127c.f53169y = Boolean.valueOf(z2);
                    bVar5.d();
                    break;
                }
                break;
            case "android.app.action.INTERRUPTION_FILTER_CHANGED":
                ((b) this.f53171a).c();
                break;
        }
    }

    public final void a() {
        com.fyber.inneractive.sdk.util.o.f57018a.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        com.fyber.inneractive.sdk.util.o.f57018a.registerReceiver(this, new IntentFilter(XIvb.AHoeTNPo));
        com.fyber.inneractive.sdk.util.o.f57018a.registerReceiver(this, new IntentFilter("android.app.action.INTERRUPTION_FILTER_CHANGED"));
        com.fyber.inneractive.sdk.util.o.f57018a.registerReceiver(this, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
        com.fyber.inneractive.sdk.util.o.f57018a.registerReceiver(this, new IntentFilter("android.intent.action.AIRPLANE_MODE"));
        if (com.fyber.inneractive.sdk.util.o.a("android.permission.BLUETOOTH")) {
            com.fyber.inneractive.sdk.util.o.f57018a.registerReceiver(this, new IntentFilter("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED"));
            com.fyber.inneractive.sdk.util.o.f57018a.registerReceiver(this, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
    }

    public f(e eVar) {
        this.f53171a = eVar;
    }
}
