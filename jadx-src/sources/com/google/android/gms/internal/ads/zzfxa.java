package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.vungle.ads.internal.protos.Sdk;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfxa {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfxb zzc;
    private final zzfvh zzd;
    private final zzfvc zze;
    private final boolean zzf;

    @Nullable
    private zzfwp zzg;
    private final Object zzh = new Object();

    public zzfxa(@NonNull Context context, @NonNull zzfxb zzfxbVar, @NonNull zzfvh zzfvhVar, @NonNull zzfvc zzfvcVar, boolean z2) {
        this.zzb = context;
        this.zzc = zzfxbVar;
        this.zzd = zzfvhVar;
        this.zze = zzfvcVar;
        this.zzf = z2;
    }

    private final synchronized Class zzd(@NonNull zzfwq zzfwqVar) throws zzfwz {
        try {
            if (zzfwqVar.zza() == null) {
                throw new zzfwz(4010, "mc");
            }
            String strZza = zzfwqVar.zza().zza();
            HashMap map = zza;
            Class cls = (Class) map.get(strZza);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.zze.zza(zzfwqVar.zzb())) {
                    throw new zzfwz(2026, "VM did not pass signature verification");
                }
                try {
                    File fileZzc = zzfwqVar.zzc();
                    if (!fileZzc.exists()) {
                        fileZzc.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(zzfwqVar.zzb().getAbsolutePath(), fileZzc.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strZza, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e2) {
                    e = e2;
                    throw new zzfwz(2008, e);
                } catch (IllegalArgumentException e3) {
                    e = e3;
                    throw new zzfwz(2008, e);
                } catch (SecurityException e4) {
                    e = e4;
                    throw new zzfwz(2008, e);
                }
            } catch (GeneralSecurityException e5) {
                throw new zzfwz(2026, e5);
            }
        } finally {
        }
    }

    @Nullable
    public final zzfvk zzb() {
        zzfwp zzfwpVar;
        synchronized (this.zzh) {
            zzfwpVar = this.zzg;
        }
        return zzfwpVar;
    }

    @Nullable
    public final zzfwq zzc() {
        synchronized (this.zzh) {
            try {
                zzfwp zzfwpVar = this.zzg;
                if (zzfwpVar == null) {
                    return null;
                }
                return zzfwpVar.zze();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zza(@NonNull zzfwq zzfwqVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfwp zzfwpVar = new zzfwp(zzd(zzfwqVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfwqVar.zzd(), null, new Bundle(), 2), zzfwqVar, this.zzc, this.zzd, this.zzf);
                if (zzfwpVar.zzf()) {
                    int iZzh = zzfwpVar.zzh();
                    if (iZzh == 0) {
                        synchronized (this.zzh) {
                            zzfwp zzfwpVar2 = this.zzg;
                            if (zzfwpVar2 != null) {
                                try {
                                    zzfwpVar2.zzg();
                                } catch (zzfwz e2) {
                                    this.zzd.zzc(e2.zza(), -1L, e2);
                                }
                                this.zzg = zzfwpVar;
                            } else {
                                this.zzg = zzfwpVar;
                            }
                        }
                        this.zzd.zzb(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, System.currentTimeMillis() - jCurrentTimeMillis);
                        return true;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzh).length() + 4);
                    sb.append("ci: ");
                    sb.append(iZzh);
                    throw new zzfwz(4001, sb.toString());
                }
                throw new zzfwz(Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE, "init failed");
            } catch (Exception e3) {
                throw new zzfwz(2004, e3);
            }
        } catch (zzfwz e4) {
            this.zzd.zzc(e4.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        } catch (Exception e5) {
            this.zzd.zzc(4010, System.currentTimeMillis() - jCurrentTimeMillis, e5);
            return false;
        }
    }
}
