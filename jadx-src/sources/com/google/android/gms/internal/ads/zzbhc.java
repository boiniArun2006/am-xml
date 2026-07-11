package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbhc implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;

    @VisibleForTesting
    volatile boolean zza = false;

    @Nullable
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    final boolean zzb() {
        return this.zzi;
    }

    public final boolean zzc() {
        return this.zzj;
    }

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzh = new JSONObject((String) zzbhg.zza(new zzgru() { // from class: com.google.android.gms.internal.ads.zzbgz
                    @Override // com.google.android.gms.internal.ads.zzgru
                    public final /* synthetic */ Object zza() {
                        return sharedPreferences.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #2 {all -> 0x0054, blocks: (B:22:0x0046, B:37:0x0064, B:39:0x006d, B:40:0x0075, B:42:0x007b, B:44:0x008b, B:46:0x00a0, B:50:0x00ae, B:52:0x00b2, B:54:0x00c2, B:56:0x00d7, B:59:0x00e3, B:69:0x0122, B:73:0x012f, B:75:0x013c, B:77:0x014a, B:78:0x0153, B:80:0x0161, B:82:0x0165, B:83:0x0168, B:62:0x00f4, B:64:0x0102, B:66:0x010a, B:67:0x0115, B:26:0x004d, B:32:0x005a), top: B:97:0x0046, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e3 A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #2 {all -> 0x0054, blocks: (B:22:0x0046, B:37:0x0064, B:39:0x006d, B:40:0x0075, B:42:0x007b, B:44:0x008b, B:46:0x00a0, B:50:0x00ae, B:52:0x00b2, B:54:0x00c2, B:56:0x00d7, B:59:0x00e3, B:69:0x0122, B:73:0x012f, B:75:0x013c, B:77:0x014a, B:78:0x0153, B:80:0x0161, B:82:0x0165, B:83:0x0168, B:62:0x00f4, B:64:0x0102, B:66:0x010a, B:67:0x0115, B:26:0x004d, B:32:0x005a), top: B:97:0x0046, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0126 A[Catch: all -> 0x000f, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:13:0x0012, B:15:0x0017, B:16:0x0019, B:18:0x002b, B:19:0x002f, B:20:0x0031, B:47:0x00a4, B:48:0x00ab, B:57:0x00db, B:71:0x0126, B:84:0x016f, B:85:0x0176, B:87:0x0178, B:88:0x017f, B:22:0x0046, B:37:0x0064, B:39:0x006d, B:40:0x0075, B:42:0x007b, B:44:0x008b, B:46:0x00a0, B:50:0x00ae, B:52:0x00b2, B:54:0x00c2, B:56:0x00d7, B:59:0x00e3, B:69:0x0122, B:73:0x012f, B:75:0x013c, B:77:0x014a, B:78:0x0153, B:80:0x0161, B:82:0x0165, B:83:0x0168, B:62:0x00f4, B:64:0x0102, B:66:0x010a, B:67:0x0115, B:26:0x004d, B:32:0x005a), top: B:100:0x0009, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012f A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #2 {all -> 0x0054, blocks: (B:22:0x0046, B:37:0x0064, B:39:0x006d, B:40:0x0075, B:42:0x007b, B:44:0x008b, B:46:0x00a0, B:50:0x00ae, B:52:0x00b2, B:54:0x00c2, B:56:0x00d7, B:59:0x00e3, B:69:0x0122, B:73:0x012f, B:75:0x013c, B:77:0x014a, B:78:0x0153, B:80:0x0161, B:82:0x0165, B:83:0x0168, B:62:0x00f4, B:64:0x0102, B:66:0x010a, B:67:0x0115, B:26:0x004d, B:32:0x005a), top: B:97:0x0046, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Context context) {
        Context applicationContext;
        final SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            try {
                if (this.zzd) {
                    return;
                }
                if (!this.zza) {
                    this.zza = true;
                }
                this.zzi = TextUtils.equals(context.getPackageName(), "com.google.android.gms");
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.zzg = context;
                try {
                    this.zzf = Wrappers.packageManager(context).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                }
                try {
                    Context context2 = this.zzg;
                    SharedPreferences sharedPreferencesZzb = null;
                    if (context2 == null) {
                        context2 = null;
                    } else {
                        try {
                            applicationContext = context2.createPackageContext("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            applicationContext = null;
                        }
                        if (applicationContext != null || (applicationContext = context2.getApplicationContext()) != null) {
                            context2 = applicationContext;
                        }
                    }
                    if (context2 != null) {
                        com.google.android.gms.ads.internal.client.zzbd.zza();
                        sharedPreferencesZzb = zzbgx.zzb(context2);
                    }
                    if (sharedPreferencesZzb != null) {
                        zzbjw.zzc(new zzbgy(this, sharedPreferencesZzb));
                    }
                    if (!this.zzi) {
                        zzbio zzbioVar = zzbiw.zzd;
                        if (((Long) zzbioVar.zze()).longValue() > 0 && zzbgp.zzd(this.zzg) >= ((Long) zzbioVar.zze()).longValue()) {
                            this.zzj = true;
                            this.zzd = true;
                        } else if (!this.zzi) {
                            zzbio zzbioVar2 = zzbiw.zzf;
                            if (((Long) zzbioVar2.zze()).longValue() <= 0 || zzbgp.zzc(this.zzg) < ((Long) zzbioVar2.zze()).longValue()) {
                                Context context3 = this.zzg;
                                if (!((Boolean) zzbje.zzk.zze()).booleanValue()) {
                                    if (((Boolean) zzbje.zzl.zze()).booleanValue() && (sharedPreferences = context3.getSharedPreferences("admob", 0)) != null) {
                                        try {
                                            if (new JSONObject((String) zzbhg.zza(new zzgru() { // from class: com.google.android.gms.internal.ads.zzbha
                                                @Override // com.google.android.gms.internal.ads.zzgru
                                                public final /* synthetic */ Object zza() {
                                                    return sharedPreferences.getString("app_settings_json", JsonUtils.EMPTY_JSON);
                                                }
                                            })).optBoolean("local_flags_enabled")) {
                                            }
                                        } catch (JSONException unused3) {
                                        }
                                    }
                                    if (context2 == null) {
                                        com.google.android.gms.ads.internal.client.zzbd.zza();
                                        this.zze = zzbgx.zzb(context2);
                                        if (!this.zzi && ((Boolean) zzbje.zze.zze()).booleanValue()) {
                                            com.google.android.gms.ads.internal.client.zzbd.zzd().zza(this.zzg);
                                        }
                                        if (!((Boolean) zzbje.zzc.zze()).booleanValue() && (sharedPreferences2 = this.zze) != null) {
                                            sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                        }
                                        zzg(this.zze);
                                        this.zzd = true;
                                        return;
                                    }
                                    this.zza = false;
                                    this.zzc.open();
                                }
                                context2 = this.zzg;
                                if (context2 == null) {
                                }
                            } else {
                                this.zzj = true;
                                this.zzd = true;
                                this.zza = false;
                                this.zzc.open();
                            }
                        }
                    }
                } finally {
                    this.zza = false;
                    this.zzc.open();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object zzd(final zzbgv zzbgvVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                try {
                    if (!this.zza) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbgvVar.zzf();
            }
        }
        if (zzbgvVar.zzm() != 2) {
            return (zzbgvVar.zzm() == 1 && this.zzh.has(zzbgvVar.zze())) ? zzbgvVar.zzc(this.zzh) : zzbhg.zza(new zzgru() { // from class: com.google.android.gms.internal.ads.zzbhb
                @Override // com.google.android.gms.internal.ads.zzgru
                public final /* synthetic */ Object zza() {
                    return this.zza.zzf(zzbgvVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbgvVar.zzf() : zzbgvVar.zza(bundle);
    }

    public final Object zze(zzbgv zzbgvVar) {
        return (this.zzd || this.zza) ? zzd(zzbgvVar) : zzbgvVar.zzf();
    }

    final /* synthetic */ Object zzf(zzbgv zzbgvVar) {
        return zzbgvVar.zzd(this.zze);
    }
}
