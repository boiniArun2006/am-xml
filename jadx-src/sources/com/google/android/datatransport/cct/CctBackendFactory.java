package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import hay.fuX;
import hay.qz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Keep
public class CctBackendFactory implements hay.Ml {
    @Override // hay.Ml
    public qz create(fuX fux) {
        return new Ml(fux.rl(), fux.O(), fux.nr());
    }
}
