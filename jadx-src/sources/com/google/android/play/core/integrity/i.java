package com.google.android.play.core.integrity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;
import qcD.nehv.Apsps;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class i implements k {
    i() {
    }

    @Override // com.google.android.play.core.integrity.k
    @Nullable
    public final ApiException a(Bundle bundle) {
        int i2 = bundle.getInt(Apsps.tgsmjHKaKHevS);
        if (i2 == 0) {
            return null;
        }
        return new IntegrityServiceException(i2, null);
    }
}
