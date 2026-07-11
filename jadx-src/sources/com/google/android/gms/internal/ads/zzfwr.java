package com.google.android.gms.internal.ads;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class zzfwr {

    @VisibleForTesting
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzbch zzd;

    @Nullable
    public final zzfwq zzb(int i2) {
        zzbcp zzbcpVarZzc = zzc(1);
        if (zzbcpVarZzc == null) {
            return null;
        }
        String strZza = zzbcpVarZzc.zza();
        File fileZza = zzfws.zza(strZza, "pcam.jar", zzd());
        if (!fileZza.exists()) {
            fileZza = zzfws.zza(strZza, "pcam", zzd());
        }
        return new zzfwq(zzbcpVarZzc, fileZza, zzfws.zza(strZza, "pcbc", zzd()), zzfws.zza(strZza, "pcopt", zzd()));
    }

    @Nullable
    @VisibleForTesting
    final zzbcp zzc(int i2) {
        String string = i2 == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzian zzianVar = zzian.zza;
            zzbcp zzbcpVarZzg = zzbcp.zzg(zzian.zzs(bArrStringToBytes, 0, bArrStringToBytes.length));
            String strZza = zzbcpVarZzg.zza();
            File fileZza = zzfws.zza(strZza, "pcam.jar", zzd());
            if (!fileZza.exists()) {
                fileZza = zzfws.zza(strZza, "pcam", zzd());
            }
            File fileZza2 = zzfws.zza(strZza, "pcbc", zzd());
            if (fileZza.exists()) {
                if (fileZza2.exists()) {
                    return zzbcpVarZzg;
                }
            }
        } catch (zzicg unused) {
        }
        return null;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd.zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        int iZza = this.zzd.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 6);
        sb.append(pTYaLzzmJSGAPQ.UkGSDiwi);
        sb.append(iZza);
        return sb.toString();
    }

    private final String zzf() {
        int iZza = this.zzd.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 6);
        sb.append("LATMTD");
        sb.append(iZza);
        return sb.toString();
    }

    public zzfwr(@NonNull Context context, zzbch zzbchVar) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfws.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfws.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzbchVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(@NonNull zzbcj zzbcjVar, @Nullable zzfwx zzfwxVar) {
        boolean z2;
        String strZza = zzbcjVar.zza().zza();
        byte[] bArrZzy = zzbcjVar.zzb().zzy();
        byte[] bArrZzy2 = zzbcjVar.zzc().zzy();
        if (!TextUtils.isEmpty(strZza) && bArrZzy2 != null && bArrZzy2.length != 0) {
            File file = this.zza;
            zzfws.zze(file);
            file.mkdirs();
            zzfws.zzc(strZza, file).mkdirs();
            File fileZza = zzfws.zza(strZza, "pcam.jar", file);
            if ((bArrZzy == null || bArrZzy.length <= 0 || zzfws.zzb(fileZza, bArrZzy)) && zzfws.zzb(zzfws.zza(strZza, "pcbc", file), bArrZzy2)) {
                File fileZza2 = zzfws.zza(zzbcjVar.zza().zza(), "pcam.jar", file);
                if (fileZza2.exists() && zzfwxVar != null && !zzfwxVar.zza(fileZza2)) {
                    return false;
                }
                String strZza2 = zzbcjVar.zza().zza();
                if (TextUtils.isEmpty(strZza2)) {
                    z2 = false;
                } else {
                    File fileZza3 = zzfws.zza(strZza2, "pcam.jar", file);
                    File fileZza4 = zzfws.zza(strZza2, "pcbc", file);
                    File fileZza5 = zzfws.zza(strZza2, "pcam.jar", zzd());
                    File fileZza6 = zzfws.zza(strZza2, "pcbc", zzd());
                    if ((!fileZza3.exists() || fileZza3.renameTo(fileZza5)) && fileZza4.exists() && fileZza4.renameTo(fileZza6)) {
                        zzbco zzbcoVarZzi = zzbcp.zzi();
                        zzbcoVarZzi.zza(zzbcjVar.zza().zza());
                        zzbcoVarZzi.zzb(zzbcjVar.zza().zzb());
                        zzbcoVarZzi.zzd(zzbcjVar.zza().zzd());
                        zzbcoVarZzi.zze(zzbcjVar.zza().zze());
                        zzbcoVarZzi.zzc(zzbcjVar.zza().zzc());
                        zzbcp zzbcpVar = (zzbcp) zzbcoVarZzi.zzbu();
                        zzbcp zzbcpVarZzc = zzc(1);
                        SharedPreferences.Editor editorEdit = this.zzc.edit();
                        if (zzbcpVarZzc != null && !zzbcpVar.zza().equals(zzbcpVarZzc.zza())) {
                            editorEdit.putString(zze(), Hex.bytesToStringLowercase(zzbcpVarZzc.zzaN()));
                        }
                        editorEdit.putString(zzf(), Hex.bytesToStringLowercase(zzbcpVar.zzaN()));
                        if (editorEdit.commit()) {
                            z2 = true;
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                zzbcp zzbcpVarZzc2 = zzc(1);
                if (zzbcpVarZzc2 != null) {
                    hashSet.add(zzbcpVarZzc2.zza());
                }
                zzbcp zzbcpVarZzc3 = zzc(2);
                if (zzbcpVarZzc3 != null) {
                    hashSet.add(zzbcpVarZzc3.zza());
                }
                for (File file2 : zzd().listFiles()) {
                    String name = file2.getName();
                    if (!hashSet.contains(name)) {
                        zzfws.zze(zzfws.zzc(name, zzd()));
                    }
                }
                return z2;
            }
        }
        return false;
    }
}
