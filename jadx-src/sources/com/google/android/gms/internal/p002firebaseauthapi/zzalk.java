package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class zzalk {
    private volatile zzamc zza;
    private volatile zzajp zzb;
    private volatile boolean zzc;

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return this.zzb.zzb();
        }
        if (this.zza != null) {
            return this.zza.zzl();
        }
        return 0;
    }

    public final zzajp zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    return this.zzb;
                }
                if (this.zza == null) {
                    this.zzb = zzajp.zza;
                } else {
                    this.zzb = this.zza.a_();
                }
                return this.zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzalk)) {
            return false;
        }
        zzalk zzalkVar = (zzalk) obj;
        zzamc zzamcVar = this.zza;
        zzamc zzamcVar2 = zzalkVar.zza;
        return (zzamcVar == null && zzamcVar2 == null) ? zzb().equals(zzalkVar.zzb()) : (zzamcVar == null || zzamcVar2 == null) ? zzamcVar != null ? zzamcVar.equals(zzalkVar.zzb(zzamcVar.zzg())) : zzb(zzamcVar2.zzg()).equals(zzamcVar2) : zzamcVar.equals(zzamcVar2);
    }

    public final zzamc zza(zzamc zzamcVar) {
        zzamc zzamcVar2 = this.zza;
        this.zzb = null;
        this.zza = zzamcVar;
        return zzamcVar2;
    }

    private final zzamc zzb(zzamc zzamcVar) {
        if (this.zza == null) {
            synchronized (this) {
                if (this.zza == null) {
                    try {
                        this.zza = zzamcVar;
                        this.zzb = zzajp.zza;
                    } catch (zzalf unused) {
                        this.zzc = true;
                        this.zza = zzamcVar;
                        this.zzb = zzajp.zza;
                    }
                }
            }
        }
        return this.zza;
    }
}
