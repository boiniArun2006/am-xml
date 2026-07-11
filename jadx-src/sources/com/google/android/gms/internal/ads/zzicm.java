package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class zzicm {
    protected volatile zzidc zza;
    private volatile zzian zzb;
    private volatile boolean zzc;

    public int hashCode() {
        return 1;
    }

    public final zzidc zza(zzidc zzidcVar) {
        zzidc zzidcVar2 = this.zza;
        this.zzb = null;
        this.zza = zzidcVar;
        return zzidcVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzicm)) {
            return false;
        }
        zzicm zzicmVar = (zzicm) obj;
        zzidc zzidcVar = this.zza;
        zzidc zzidcVar2 = zzicmVar.zza;
        if (zzidcVar == null && zzidcVar2 == null) {
            return zzc().equals(zzicmVar.zzc());
        }
        if (zzidcVar != null && zzidcVar2 != null) {
            return zzidcVar.equals(zzidcVar2);
        }
        if (zzidcVar != null) {
            zzicmVar.zzd(zzidcVar.zzbw());
            return zzidcVar.equals(zzicmVar.zza);
        }
        zzd(zzidcVar2.zzbw());
        return this.zza.equals(zzidcVar2);
    }

    public final int zzb() {
        if (this.zzb != null) {
            return this.zzb.zzc();
        }
        if (this.zza != null) {
            return this.zza.zzbr();
        }
        return 0;
    }

    public final zzian zzc() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    return this.zzb;
                }
                if (this.zza == null) {
                    this.zzb = zzian.zza;
                } else {
                    this.zzb = this.zza.zzaM();
                }
                return this.zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final void zzd(zzidc zzidcVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzidcVar;
                this.zzb = zzian.zza;
            } catch (zzicg unused) {
                this.zzc = true;
                this.zza = zzidcVar;
                this.zzb = zzian.zza;
            }
        }
    }
}
