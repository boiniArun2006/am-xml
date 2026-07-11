package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzafy extends BroadcastReceiver {
    private final String zza;
    private final /* synthetic */ zzafu zzb;

    public zzafy(zzafu zzafuVar, String str) {
        this.zzb = zzafuVar;
        this.zza = str;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (SmsRetriever.SMS_RETRIEVED_ACTION.equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).getStatusCode() == 0) {
                String str = (String) extras.get(SmsRetriever.EXTRA_SMS_MESSAGE);
                zzagb zzagbVar = (zzagb) this.zzb.zzd.get(this.zza);
                if (zzagbVar == null) {
                    zzafu.zza.e("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    String strZza = zzafu.zza(str);
                    zzagbVar.zze = strZza;
                    if (strZza == null) {
                        zzafu.zza.e("Unable to extract verification code.", new Object[0]);
                    } else if (!zzae.zzc(zzagbVar.zzd)) {
                        zzafu.zzb(this.zzb, this.zza);
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
