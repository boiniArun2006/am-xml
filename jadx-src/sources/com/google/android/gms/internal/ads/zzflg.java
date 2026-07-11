package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@SafeParcelable.Class(creator = "PoolConfigurationCreator")
public final class zzflg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzflg> CREATOR = new zzflh();
    public final Context zza;
    public final zzfld zzb;

    @SafeParcelable.Field(id = 2)
    public final int zzc;

    @SafeParcelable.Field(id = 3)
    public final int zzd;

    @SafeParcelable.Field(id = 4)
    public final int zze;

    @SafeParcelable.Field(id = 5)
    public final String zzf;
    public final int zzg;
    private final zzfld[] zzh;

    @SafeParcelable.Field(getter = "getFormatInt", id = 1)
    private final int zzi;

    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", id = 6)
    private final int zzj;

    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    @SafeParcelable.Constructor
    public zzflg(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) int i5, @SafeParcelable.Param(id = 4) int i7, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) int i8, @SafeParcelable.Param(id = 7) int i9) {
        zzfld[] zzfldVarArrValues = zzfld.values();
        this.zzh = zzfldVarArrValues;
        int[] iArrZza = zzfle.zza();
        this.zzl = iArrZza;
        int[] iArrZza2 = zzflf.zza();
        this.zzm = iArrZza2;
        this.zza = null;
        this.zzi = i2;
        this.zzb = zzfldVarArrValues[i2];
        this.zzc = i3;
        this.zzd = i5;
        this.zze = i7;
        this.zzf = str;
        this.zzj = i8;
        this.zzg = iArrZza[i8];
        this.zzk = i9;
        int i10 = iArrZza2[i9];
    }

    public static zzflg zza(zzfld zzfldVar, Context context) {
        if (zzfldVar == zzfld.Rewarded) {
            return new zzflg(context, zzfldVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhm)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhs)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhu)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhw), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzho), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhq));
        }
        if (zzfldVar == zzfld.Interstitial) {
            return new zzflg(context, zzfldVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhn)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzht)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhv)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhx), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhp), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhr));
        }
        if (zzfldVar != zzfld.AppOpen) {
            return null;
        }
        return new zzflg(context, zzfldVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhA)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhC)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhD)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhy), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhz), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhB));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.zzi;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i3);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzflg(Context context, zzfld zzfldVar, int i2, int i3, int i5, String str, String str2, String str3) {
        this.zzh = zzfld.values();
        this.zzl = zzfle.zza();
        this.zzm = zzflf.zza();
        this.zza = context;
        this.zzi = zzfldVar.ordinal();
        this.zzb = zzfldVar;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i5;
        this.zzf = str;
        int i7 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.zzg = i7;
        this.zzj = i7 - 1;
        this.zzk = 0;
    }
}
