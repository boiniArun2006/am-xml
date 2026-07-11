package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzgjd {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzika zzd;
    private final zzgoe zze;

    public final zzfwq zzb(int i2) {
        zzgdu zzgduVarZzc = zzc(1);
        if (zzgduVarZzc == null) {
            this.zze.zzb(15315);
            return null;
        }
        String strZza = zzgduVarZzc.zza().zza();
        File fileZza = zzfws.zza(strZza, "pcam.jar", zzd());
        fileZza.getClass();
        if (!fileZza.exists()) {
            fileZza = zzfws.zza(strZza, "pcam", zzd());
            fileZza.getClass();
        }
        File fileZza2 = zzfws.zza(strZza, "pcopt", zzd());
        fileZza2.getClass();
        File fileZza3 = zzfws.zza(strZza, "pcbc", zzd());
        fileZza3.getClass();
        return new zzfwq(zzgduVarZzc.zza(), fileZza, fileZza3, fileZza2);
    }

    public final zzgdu zzc(int i2) {
        zzgdu zzgduVarZzd;
        String strZza;
        File fileZza;
        String string = i2 == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzian zzianVar = zzian.zza;
            zzgduVarZzd = zzgdu.zzd(zzian.zzs(bArrStringToBytes, 0, bArrStringToBytes.length));
            strZza = zzgduVarZzd.zza().zza();
            fileZza = zzfws.zza(strZza, "pcam.jar", zzd());
        } catch (zzicg unused) {
            this.zze.zzb(15317);
        }
        if (fileZza == null) {
            throw null;
        }
        if (!fileZza.exists() && (fileZza = zzfws.zza(strZza, "pcam", zzd())) == null) {
            throw null;
        }
        File fileZza2 = zzfws.zza(strZza, "pcbc", zzd());
        if (fileZza2 == null) {
            throw null;
        }
        if (fileZza.exists() && fileZza2.exists()) {
            return zzgduVarZzd;
        }
        return null;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(((zzbch) this.zzd.zzb()).zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        int iZza = ((zzbch) this.zzd.zzb()).zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 6);
        sb.append("FBAMTD");
        sb.append(iZza);
        return sb.toString();
    }

    private final String zzf() {
        int iZza = ((zzbch) this.zzd.zzb()).zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 6);
        sb.append("LATMTD");
        sb.append(iZza);
        return sb.toString();
    }

    zzgjd(Context context, SharedPreferences sharedPreferences, zzika zzikaVar, zzgoe zzgoeVar) {
        this.zzc = sharedPreferences;
        File dir = context.getDir("pccache2", 0);
        zzfws.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache2", 0);
        zzfws.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzikaVar;
        this.zze = zzgoeVar;
    }

    public final boolean zza(zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        boolean z2;
        String strZza = zzgduVar.zza().zza();
        if (!TextUtils.isEmpty(strZza) && bArr2.length != 0) {
            File file = this.zza;
            zzfws.zze(file);
            file.mkdirs();
            File fileZzc = zzfws.zzc(strZza, file);
            fileZzc.getClass();
            fileZzc.mkdirs();
            File fileZza = zzfws.zza(strZza, "pcam.jar", file);
            fileZza.getClass();
            if (bArr == null || bArr.length <= 0 || zzfws.zzb(fileZza, bArr)) {
                File fileZza2 = zzfws.zza(strZza, "pcbc", file);
                fileZza2.getClass();
                if (zzfws.zzb(fileZza2, bArr2)) {
                    String strZza2 = zzgduVar.zza().zza();
                    if (TextUtils.isEmpty(strZza2)) {
                        z2 = false;
                    } else {
                        File fileZza3 = zzfws.zza(strZza2, "pcam.jar", file);
                        fileZza3.getClass();
                        File fileZza4 = zzfws.zza(strZza2, "pcbc", file);
                        fileZza4.getClass();
                        File fileZza5 = zzfws.zza(strZza2, "pcam.jar", zzd());
                        fileZza5.getClass();
                        File fileZza6 = zzfws.zza(strZza2, "pcbc", zzd());
                        fileZza6.getClass();
                        if (fileZza3.exists() && !fileZza3.renameTo(fileZza5)) {
                            this.zze.zzb(15318);
                        } else if (fileZza4.exists() && fileZza4.renameTo(fileZza6)) {
                            zzgdu zzgduVarZzc = zzc(1);
                            SharedPreferences.Editor editorEdit = this.zzc.edit();
                            if (zzgduVarZzc != null && !zzgduVar.zza().zza().equals(zzgduVarZzc.zza().zza())) {
                                editorEdit.putString(zze(), Hex.bytesToStringLowercase(zzgduVarZzc.zzaN()));
                            }
                            editorEdit.putString(zzf(), Hex.bytesToStringLowercase(zzgduVar.zzaN()));
                            if (!editorEdit.commit()) {
                                this.zze.zzb(15320);
                            } else {
                                z2 = true;
                            }
                        } else {
                            this.zze.zzb(15319);
                        }
                        z2 = false;
                    }
                    HashSet hashSet = new HashSet();
                    zzgdu zzgduVarZzc2 = zzc(1);
                    if (zzgduVarZzc2 != null) {
                        hashSet.add(zzgduVarZzc2.zza().zza());
                    }
                    zzgdu zzgduVarZzc3 = zzc(2);
                    if (zzgduVarZzc3 != null) {
                        hashSet.add(zzgduVarZzc3.zza().zza());
                    }
                    File[] fileArrListFiles = zzd().listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            String name = file2.getName();
                            if (!hashSet.contains(name)) {
                                File fileZzc2 = zzfws.zzc(name, zzd());
                                fileZzc2.getClass();
                                zzfws.zze(fileZzc2);
                            }
                        }
                    }
                    return z2;
                }
            }
        }
        this.zze.zzb(15316);
        return false;
    }
}
