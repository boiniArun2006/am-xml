package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.android.gms.internal.ads.zzcdh;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import ep.oxM.esLNYym;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzay {
    private final String zza;

    @Nullable
    private final String zzb;

    @Nullable
    private final zzcdh zzc;

    /* synthetic */ zzay(zzax zzaxVar, byte[] bArr) {
        this.zza = zzaxVar.zzd();
        this.zzb = zzaxVar.zze();
        this.zzc = zzaxVar.zzf();
    }

    @Nullable
    final String zzd() {
        return this.zzb;
    }

    @Nullable
    final zzcdh zze() {
        return this.zzc;
    }

    public final Set zza() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String zzb() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzbgj.zza.EnumC0774zza zzc() {
        byte b2;
        String str = this.zza;
        switch (str.hashCode()) {
            case -1999289321:
                b2 = !str.equals("NATIVE") ? (byte) -1 : (byte) 2;
                break;
            case -1372958932:
                if (str.equals(esLNYym.jyOMKQAxjq)) {
                    b2 = 1;
                    break;
                }
                break;
            case 543046670:
                if (str.equals(BrandSafetyUtils.f61445k)) {
                    b2 = 3;
                    break;
                }
                break;
            case 1951953708:
                if (str.equals(BrandSafetyUtils.f61447m)) {
                    b2 = 0;
                    break;
                }
                break;
        }
        return b2 != 0 ? b2 != 1 ? b2 != 2 ? b2 != 3 ? zzbgj.zza.EnumC0774zza.AD_INITIATER_UNSPECIFIED : zzbgj.zza.EnumC0774zza.REWARD_BASED_VIDEO_AD : zzbgj.zza.EnumC0774zza.AD_LOADER : zzbgj.zza.EnumC0774zza.INTERSTITIAL : zzbgj.zza.EnumC0774zza.BANNER;
    }
}
