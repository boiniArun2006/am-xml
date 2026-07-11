package com.google.android.gms.internal.ads;

import j$.util.Base64;
import java.security.GeneralSecurityException;
import java.util.Optional;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgku {
    private Optional zza;
    private Optional zzb;

    zzgku() {
    }

    public final boolean zza(zzbcf zzbcfVar) {
        byte[] bArrZzy = zzbcfVar.zza().zzb().zzb().zzy();
        byte[] bArrZzy2 = zzbcfVar.zza().zzd().zzy();
        try {
            if (this.zza == null && this.zzb == null) {
                try {
                    try {
                        zzhut.zza();
                        this.zza = Optional.of((zzhbs) zzhbu.zza(new String(Base64.getDecoder().decode("eyJwcmltYXJ5S2V5SWQiOjMzMTUxOTk4MTksImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQVNoRGZwOUM5QjcrMU1nMmJQbHJ5WExPOHVScDd6YWZJMldSYURmR1ZqVmlJaEFJNFZzTmVrcCs0bVY0d2toZlhVb3pQZWs5TjgxcUdIK2plNnhjOFpoQkhQIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMzE1MTk5ODE5LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0="))).zzg(zzhlf.zzc(), zzhbs.class));
                        this.zzb = Optional.of((zzhbs) zzhbu.zza(new String(Base64.getDecoder().decode("eyJwcmltYXJ5S2V5SWQiOjMwODI3ODA4ODgsImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQkEyWW5HaWFpc3pEcGtJcWpjalorUTJ2alFUUldQZjhFcTlkZVlhNFpKa3lJaEFCQWFESTd6QWJkQXVpQmlnOWdHSkJ1VTUzSGg5Z0RCa0t2amswS2tabDhjIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMDgyNzgwODg4LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0="))).zzg(zzhlf.zzc(), zzhbs.class));
                    } catch (Exception e2) {
                        throw new GeneralSecurityException("Failed to verify program", e2);
                    }
                } catch (GeneralSecurityException unused) {
                    return false;
                }
            }
            this.zza.isPresent();
            ((zzhbs) this.zza.get()).zza(bArrZzy, bArrZzy2);
            return true;
        } catch (GeneralSecurityException unused2) {
            this.zzb.isPresent();
            ((zzhbs) this.zzb.get()).zza(bArrZzy, bArrZzy2);
            return true;
        }
    }
}
