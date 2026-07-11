package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcda;
import com.google.android.gms.internal.ads.zzcdh;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfoo;
import com.google.android.gms.internal.ads.zzgzl;
import com.google.common.util.concurrent.Xo;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzad implements zzgzl {
    final /* synthetic */ Xo zza;
    final /* synthetic */ zzcdh zzb;
    final /* synthetic */ zzcda zzc;
    final /* synthetic */ zzfoe zzd;
    final /* synthetic */ zzau zze;

    zzad(zzau zzauVar, Xo xo, zzcdh zzcdhVar, zzcda zzcdaVar, zzfoe zzfoeVar) {
        this.zza = xo;
        this.zzb = zzcdhVar;
        this.zzc = zzcdaVar;
        this.zzd = zzfoeVar;
        Objects.requireNonNull(zzauVar);
        this.zze = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        Xo xo = this.zza;
        AtomicBoolean atomicBooleanZzN = this.zze.zzN();
        zzbj zzbjVar = (zzbj) obj;
        zzfoo zzfooVarZzy = zzau.zzy(xo, this.zzb);
        atomicBooleanZzN.set(true);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziF)).booleanValue()) {
            try {
                zzcda zzcdaVar = this.zzc;
                if (zzcdaVar != null) {
                    zzcdaVar.zzb("QueryInfo generation has been disabled.");
                }
            } catch (RemoteException e2) {
                String strConcat = "QueryInfo generation has been disabled.".concat(e2.toString());
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf(strConcat);
            }
            if (!((Boolean) zzbix.zze.zze()).booleanValue() || zzfooVarZzy == null) {
                return;
            }
            zzfoe zzfoeVar = this.zzd;
            zzfoeVar.zzk("QueryInfo generation has been disabled.");
            zzfoeVar.zzd(false);
            zzfooVarZzy.zza(zzfoeVar);
            zzfooVarZzy.zzh();
            return;
        }
        try {
            try {
                if (zzbjVar == null) {
                    zzcda zzcdaVar2 = this.zzc;
                    if (zzcdaVar2 != null) {
                        zzcdaVar2.zzc(null, null, null);
                    }
                    zzfoe zzfoeVar2 = this.zzd;
                    zzfoeVar2.zzd(true);
                    if (!((Boolean) zzbix.zze.zze()).booleanValue() || zzfooVarZzy == null) {
                        return;
                    }
                    zzfooVarZzy.zza(zzfoeVar2);
                    zzfooVarZzy.zzh();
                    return;
                }
                try {
                    if (TextUtils.isEmpty((!TextUtils.isEmpty(zzbjVar.zzc) ? new JSONObject(zzbjVar.zzc) : new JSONObject(zzbjVar.zzb)).optString("request_id", ""))) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("The request ID is empty in request JSON.");
                        zzcda zzcdaVar3 = this.zzc;
                        if (zzcdaVar3 != null) {
                            zzcdaVar3.zzb("Internal error: request ID is empty in request JSON.");
                        }
                        zzfoe zzfoeVar3 = this.zzd;
                        zzfoeVar3.zzk("Request ID empty");
                        zzfoeVar3.zzd(false);
                        if (!((Boolean) zzbix.zze.zze()).booleanValue() || zzfooVarZzy == null) {
                            return;
                        }
                        zzfooVarZzy.zza(zzfoeVar3);
                        zzfooVarZzy.zzh();
                        return;
                    }
                    Bundle bundle = zzbjVar.zzf;
                    zzau zzauVar = this.zze;
                    if (zzauVar.zzF() && bundle != null && bundle.getInt(zzauVar.zzH(), -1) == -1) {
                        bundle.putInt(zzauVar.zzH(), zzauVar.zzI().get());
                    }
                    if (zzauVar.zzE() && bundle != null && TextUtils.isEmpty(bundle.getString(zzauVar.zzG()))) {
                        if (TextUtils.isEmpty(zzauVar.zzK())) {
                            zzauVar.zzL(com.google.android.gms.ads.internal.zzt.zzc().zze(zzauVar.zzz(), zzauVar.zzJ().afmaVersion));
                        }
                        bundle.putString(zzauVar.zzG(), zzauVar.zzK());
                    }
                    zzcda zzcdaVar4 = this.zzc;
                    if (zzcdaVar4 != null) {
                        if (TextUtils.isEmpty(zzbjVar.zzc)) {
                            zzcdaVar4.zzc(zzbjVar.zza, zzbjVar.zzb, bundle);
                        } else {
                            zzcdaVar4.zzc(zzbjVar.zza, zzbjVar.zzc, bundle);
                        }
                    }
                    this.zzd.zzd(true);
                    if (!((Boolean) zzbix.zze.zze()).booleanValue() || zzfooVarZzy == null) {
                        return;
                    }
                    zzfooVarZzy.zza(this.zzd);
                    zzfooVarZzy.zzh();
                } catch (JSONException e3) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to create JSON object from the request string.");
                    zzcda zzcdaVar5 = this.zzc;
                    if (zzcdaVar5 != null) {
                        String string = e3.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 33);
                        sb.append("Internal error for request JSON: ");
                        sb.append(string);
                        zzcdaVar5.zzb(sb.toString());
                    }
                    zzfoe zzfoeVar4 = this.zzd;
                    zzfoeVar4.zzj(e3);
                    zzfoeVar4.zzd(false);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) zzbix.zze.zze()).booleanValue() || zzfooVarZzy == null) {
                        return;
                    }
                    zzfooVarZzy.zza(zzfoeVar4);
                    zzfooVarZzy.zzh();
                }
            } catch (RemoteException e4) {
                zzfoe zzfoeVar5 = this.zzd;
                zzfoeVar5.zzj(e4);
                zzfoeVar5.zzd(false);
                int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e4);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbix.zze.zze()).booleanValue() || zzfooVarZzy == null) {
                    return;
                }
                zzfooVarZzy.zza(this.zzd);
                zzfooVarZzy.zzh();
            }
        } catch (Throwable th) {
            if (((Boolean) zzbix.zze.zze()).booleanValue() && zzfooVarZzy != null) {
                zzfooVarZzy.zza(this.zzd);
                zzfooVarZzy.zzh();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziL)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "SignalGeneratorImpl.generateSignals");
        }
        zzfoo zzfooVarZzy = zzau.zzy(this.zza, this.zzb);
        if (((Boolean) zzbix.zze.zze()).booleanValue() && zzfooVarZzy != null) {
            zzfoe zzfoeVar = this.zzd;
            zzfoeVar.zzj(th);
            zzfoeVar.zzd(false);
            zzfooVarZzy.zza(zzfoeVar);
            zzfooVarZzy.zzh();
        }
        zzcda zzcdaVar = this.zzc;
        if (zzcdaVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                sb.append("Internal error. ");
                sb.append(message);
                message = sb.toString();
            }
            zzcdaVar.zzb(message);
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }
}
