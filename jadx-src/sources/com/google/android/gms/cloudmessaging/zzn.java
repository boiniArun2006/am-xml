package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzn extends zzq<Void> {
    zzn(int i2, int i3, Bundle bundle) {
        super(i2, 2, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.zzq
    final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.cloudmessaging.zzq
    final void zza(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            zza((Object) null);
        } else {
            zza(new zzp(4, "Invalid response to one way request"));
        }
    }
}
