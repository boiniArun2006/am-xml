package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface zzwm {
    default void zzA(zzak zzakVar) {
    }

    void zzD(zzwi zzwiVar);

    zzwi zzG(zzwk zzwkVar, zzaan zzaanVar, long j2);

    @Nullable
    default zzbf zzH() {
        return null;
    }

    default boolean zzI() {
        return true;
    }

    zzak zzJ();

    void zzl(Handler handler, zzwv zzwvVar);

    void zzm(zzwv zzwvVar);

    void zzn(Handler handler, zztk zztkVar);

    void zzo(zztk zztkVar);

    void zzp(zzwl zzwlVar, @Nullable zzhz zzhzVar, zzpq zzpqVar);

    void zzq(zzwl zzwlVar);

    void zzr(zzwl zzwlVar);

    void zzs(zzwl zzwlVar);

    void zzt() throws IOException;
}
