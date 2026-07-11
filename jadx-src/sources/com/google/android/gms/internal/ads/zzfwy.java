package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfwy {
    private static final Object zzf = new Object();
    private final Context zza;
    private final SharedPreferences zzb;
    private final String zzc;
    private final zzfwf zzd;
    private boolean zze;

    @Nullable
    private final zzbcp zzk(int i2) {
        String string = i2 == 1 ? this.zzb.getString(zzg(), null) : this.zzb.getString(zzf(), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzian zzianVar = zzian.zza;
            return zzbcp.zzh(zzian.zzs(bArrStringToBytes, 0, bArrStringToBytes.length), this.zze ? zzibb.zza() : zzibb.zzb());
        } catch (zzicg unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, jCurrentTimeMillis);
            return null;
        }
    }

    private final File zze(@NonNull String str) {
        return new File(new File(this.zza.getDir("pccache", 0), this.zzc), str);
    }

    private final String zzf() {
        return "FBAMTD".concat(String.valueOf(this.zzc));
    }

    private final String zzg() {
        return "LATMTD".concat(String.valueOf(this.zzc));
    }

    private final void zzi(int i2, long j2) {
        this.zzd.zza(i2, j2);
    }

    private final void zzj(int i2, long j2, String str) {
        this.zzd.zzb(i2, j2, str);
    }

    public final boolean zza(@NonNull zzbcj zzbcjVar, @Nullable zzfwx zzfwxVar) {
        boolean z2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                zzbcp zzbcpVarZzk = zzk(1);
                String strZza = zzbcjVar.zza().zza();
                if (zzbcpVarZzk != null && zzbcpVarZzk.zza().equals(strZza)) {
                    zzi(4014, jCurrentTimeMillis);
                    return false;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File fileZze = zze(strZza);
                if (fileZze.exists()) {
                    String str = true != fileZze.isDirectory() ? "0" : "1";
                    String str2 = true != fileZze.isFile() ? "0" : "1";
                    z2 = false;
                    StringBuilder sb = new StringBuilder(7);
                    sb.append("d:");
                    sb.append(str);
                    sb.append(",f:");
                    sb.append(str2);
                    zzj(4023, jCurrentTimeMillis2, sb.toString());
                    zzi(4015, jCurrentTimeMillis2);
                } else {
                    z2 = false;
                    if (!fileZze.mkdirs()) {
                        zzj(4024, jCurrentTimeMillis2, "cw:".concat(true != fileZze.canWrite() ? "0" : "1"));
                        zzi(4015, jCurrentTimeMillis2);
                        return false;
                    }
                }
                File fileZze2 = zze(strZza);
                File file = new File(fileZze2, "pcam.jar");
                File file2 = new File(fileZze2, "pcbc");
                if (!zzfws.zzb(file, zzbcjVar.zzb().zzy())) {
                    zzi(4016, jCurrentTimeMillis);
                    return z2;
                }
                if (!zzfws.zzb(file2, zzbcjVar.zzc().zzy())) {
                    zzi(4017, jCurrentTimeMillis);
                    return z2;
                }
                if (zzfwxVar != null && !zzfwxVar.zza(file)) {
                    zzi(4018, jCurrentTimeMillis);
                    zzfws.zze(fileZze2);
                    return z2;
                }
                String strZzh = zzh(zzbcjVar);
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                SharedPreferences sharedPreferences = this.zzb;
                String string = sharedPreferences.getString(zzg(), null);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(zzg(), strZzh);
                if (string != null) {
                    editorEdit.putString(zzf(), string);
                }
                if (!editorEdit.commit()) {
                    zzi(4019, jCurrentTimeMillis3);
                    return z2;
                }
                HashSet hashSet = new HashSet();
                zzbcp zzbcpVarZzk2 = zzk(1);
                if (zzbcpVarZzk2 != null) {
                    hashSet.add(zzbcpVarZzk2.zza());
                }
                zzbcp zzbcpVarZzk3 = zzk(2);
                if (zzbcpVarZzk3 != null) {
                    hashSet.add(zzbcpVarZzk3.zza());
                }
                boolean z3 = z2;
                File[] fileArrListFiles = new File(this.zza.getDir("pccache", z3 ? 1 : 0), this.zzc).listFiles();
                int length = fileArrListFiles.length;
                for (int i2 = z3 ? 1 : 0; i2 < length; i2++) {
                    File file3 = fileArrListFiles[i2];
                    if (!hashSet.contains(file3.getName())) {
                        zzfws.zze(file3);
                    }
                }
                zzi(5014, jCurrentTimeMillis);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzfwy(@NonNull Context context, @NonNull zzbch zzbchVar, @NonNull zzfwf zzfwfVar, boolean z2) {
        this.zze = false;
        this.zza = context;
        this.zzc = Integer.toString(zzbchVar.zza());
        this.zzb = context.getSharedPreferences("pcvmspf", 0);
        this.zzd = zzfwfVar;
        this.zze = z2;
    }

    private static String zzh(@NonNull zzbcj zzbcjVar) {
        zzbco zzbcoVarZzi = zzbcp.zzi();
        zzbcoVarZzi.zza(zzbcjVar.zza().zza());
        zzbcoVarZzi.zzb(zzbcjVar.zza().zzb());
        zzbcoVarZzi.zzd(zzbcjVar.zza().zzd());
        zzbcoVarZzi.zze(zzbcjVar.zza().zze());
        zzbcoVarZzi.zzc(zzbcjVar.zza().zzc());
        return Hex.bytesToStringLowercase(((zzbcp) zzbcoVarZzi.zzbu()).zzaN());
    }

    public final boolean zzb(@NonNull zzbcj zzbcjVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                if (!zzfws.zzb(new File(zze(zzbcjVar.zza().zza()), "pcbc"), zzbcjVar.zzc().zzy())) {
                    zzi(4020, jCurrentTimeMillis);
                    return false;
                }
                String strZzh = zzh(zzbcjVar);
                SharedPreferences.Editor editorEdit = this.zzb.edit();
                editorEdit.putString(zzg(), strZzh);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    zzi(5015, jCurrentTimeMillis);
                } else {
                    zzi(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public final zzfwq zzc(int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                zzbcp zzbcpVarZzk = zzk(1);
                if (zzbcpVarZzk == null) {
                    zzi(4022, jCurrentTimeMillis);
                    return null;
                }
                File fileZze = zze(zzbcpVarZzk.zza());
                File file = new File(fileZze, "pcam.jar");
                if (!file.exists()) {
                    file = new File(fileZze, "pcam");
                }
                File file2 = new File(fileZze, "pcbc");
                File file3 = new File(fileZze, "pcopt");
                zzi(5016, jCurrentTimeMillis);
                return new zzfwq(zzbcpVarZzk, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzd(int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                zzbcp zzbcpVarZzk = zzk(1);
                if (zzbcpVarZzk == null) {
                    zzi(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileZze = zze(zzbcpVarZzk.zza());
                if (!new File(fileZze, "pcam.jar").exists()) {
                    zzi(4026, jCurrentTimeMillis);
                    return false;
                }
                if (!new File(fileZze, "pcbc").exists()) {
                    zzi(4027, jCurrentTimeMillis);
                    return false;
                }
                zzi(5019, jCurrentTimeMillis);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
