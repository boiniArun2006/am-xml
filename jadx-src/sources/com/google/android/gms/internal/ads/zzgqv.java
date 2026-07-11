package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgqv extends zzgqs implements Serializable {
    private final Pattern zza;

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final zzgqr zza(CharSequence charSequence) {
        return new zzgqu(this.zza.matcher(charSequence));
    }

    zzgqv(Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }
}
