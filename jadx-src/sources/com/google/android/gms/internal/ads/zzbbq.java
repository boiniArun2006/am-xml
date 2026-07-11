package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbbq extends zzbby {
    private final StackTraceElement[] zzh;

    public zzbbq(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i2, int i3, StackTraceElement[] stackTraceElementArr) {
        super(zzbakVar, "TnO68f+IpvRRkyv0ANYwkK+/mU2YJddrRcZ9TNokdmi5eEzcRJBPehtgPhuxRZAE", "PILFsXLzYdqBxxfwB9b+jT5mnzLC4LU5UXMk7tC1zw8=", zzawgVar, i2, 45);
        this.zzh = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzh;
        if (stackTraceElementArr != null) {
            zzbab zzbabVar = new zzbab((String) this.zze.invoke(null, stackTraceElementArr));
            zzawg zzawgVar = this.zzd;
            synchronized (zzawgVar) {
                try {
                    zzawgVar.zzC(zzbabVar.zza.longValue());
                    if (zzbabVar.zzb.booleanValue()) {
                        zzawgVar.zzag(true != zzbabVar.zzc.booleanValue() ? 2 : 1);
                    } else {
                        zzawgVar.zzag(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
