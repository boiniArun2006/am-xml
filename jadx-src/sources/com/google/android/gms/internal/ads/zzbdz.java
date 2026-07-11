package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbdz {
    private final Object zza = new Object();
    private zzbdx zzb = null;
    private boolean zzc = false;

    public final void zza(Context context) {
        synchronized (this.zza) {
            try {
                if (!this.zzc) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Can not cast Context to Application");
                    } else {
                        if (this.zzb == null) {
                            this.zzb = new zzbdx();
                        }
                        this.zzb.zza(application, context);
                        this.zzc = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(zzbdy zzbdyVar) {
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    this.zzb = new zzbdx();
                }
                this.zzb.zzb(zzbdyVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(zzbdy zzbdyVar) {
        synchronized (this.zza) {
            try {
                zzbdx zzbdxVar = this.zzb;
                if (zzbdxVar == null) {
                    return;
                }
                zzbdxVar.zzc(zzbdyVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public final Activity zzd() {
        synchronized (this.zza) {
            try {
                zzbdx zzbdxVar = this.zzb;
                if (zzbdxVar == null) {
                    return null;
                }
                return zzbdxVar.zzd();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public final Context zze() {
        synchronized (this.zza) {
            try {
                zzbdx zzbdxVar = this.zzb;
                if (zzbdxVar == null) {
                    return null;
                }
                return zzbdxVar.zze();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzf() {
        synchronized (this.zza) {
            try {
                zzbdx zzbdxVar = this.zzb;
                if (zzbdxVar == null) {
                    return false;
                }
                return zzbdxVar.zzg().get();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzg(zzdvh zzdvhVar) {
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    this.zzb = new zzbdx();
                }
                this.zzb.zzj(zzdvhVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
