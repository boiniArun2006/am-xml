package com.google.android.play.core.integrity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;
import com.vungle.ads.internal.presenter.MRAIDPresenter;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j implements k {
    j() {
    }

    @Override // com.google.android.play.core.integrity.k
    @Nullable
    public final ApiException a(Bundle bundle) {
        int i2 = bundle.getInt(MRAIDPresenter.ERROR);
        if (i2 == 0) {
            return null;
        }
        return new StandardIntegrityException(i2, null);
    }
}
