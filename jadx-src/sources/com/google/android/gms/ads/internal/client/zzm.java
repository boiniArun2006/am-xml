package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@SafeParcelable.Class(creator = "AdRequestParcelCreator")
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzo();

    @SafeParcelable.Field(id = 27)
    public final long zzA;
    public final Bundle zzB = new Bundle();

    @SafeParcelable.Field(id = 1)
    public final int zza;

    @SafeParcelable.Field(id = 2)
    @Deprecated
    public final long zzb;

    @SafeParcelable.Field(id = 3)
    public final Bundle zzc;

    @SafeParcelable.Field(id = 4)
    @Deprecated
    public final int zzd;

    @SafeParcelable.Field(id = 5)
    public final List zze;

    @SafeParcelable.Field(id = 6)
    public final boolean zzf;

    @SafeParcelable.Field(id = 7)
    public final int zzg;

    @SafeParcelable.Field(id = 8)
    public final boolean zzh;

    @SafeParcelable.Field(id = 9)
    public final String zzi;

    @SafeParcelable.Field(id = 10)
    public final zzfx zzj;

    @SafeParcelable.Field(id = 11)
    public final Location zzk;

    @SafeParcelable.Field(id = 12)
    public final String zzl;

    @SafeParcelable.Field(id = 13)
    public final Bundle zzm;

    @SafeParcelable.Field(id = 14)
    public final Bundle zzn;

    @SafeParcelable.Field(id = 15)
    public final List zzo;

    @SafeParcelable.Field(id = 16)
    public final String zzp;

    @SafeParcelable.Field(id = 17)
    public final String zzq;

    @SafeParcelable.Field(id = 18)
    @Deprecated
    public final boolean zzr;

    @Nullable
    @SafeParcelable.Field(id = 19)
    public final zzc zzs;

    @SafeParcelable.Field(id = 20)
    public final int zzt;

    @Nullable
    @SafeParcelable.Field(id = 21)
    public final String zzu;

    @SafeParcelable.Field(id = 22)
    public final List zzv;

    @SafeParcelable.Field(id = 23)
    public final int zzw;

    @Nullable
    @SafeParcelable.Field(id = 24)
    public final String zzx;

    @SafeParcelable.Field(id = 25)
    public final int zzy;

    @SafeParcelable.Field(id = 26)
    public final long zzz;

    @SafeParcelable.Constructor
    public zzm(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) Bundle bundle, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) List list, @SafeParcelable.Param(id = 6) boolean z2, @SafeParcelable.Param(id = 7) int i5, @SafeParcelable.Param(id = 8) boolean z3, @SafeParcelable.Param(id = 9) String str, @SafeParcelable.Param(id = 10) zzfx zzfxVar, @SafeParcelable.Param(id = 11) Location location, @SafeParcelable.Param(id = 12) String str2, @SafeParcelable.Param(id = 13) Bundle bundle2, @SafeParcelable.Param(id = 14) Bundle bundle3, @SafeParcelable.Param(id = 15) List list2, @SafeParcelable.Param(id = 16) String str3, @SafeParcelable.Param(id = 17) String str4, @SafeParcelable.Param(id = 18) boolean z4, @Nullable @SafeParcelable.Param(id = 19) zzc zzcVar, @SafeParcelable.Param(id = 20) int i7, @Nullable @SafeParcelable.Param(id = 21) String str5, @SafeParcelable.Param(id = 22) List list3, @SafeParcelable.Param(id = 23) int i8, @Nullable @SafeParcelable.Param(id = 24) String str6, @SafeParcelable.Param(id = 25) int i9, @SafeParcelable.Param(id = 26) long j3, @SafeParcelable.Param(id = 27) long j4) {
        this.zza = i2;
        this.zzb = j2;
        this.zzc = bundle == null ? new Bundle() : bundle;
        this.zzd = i3;
        this.zze = list;
        this.zzf = z2;
        this.zzg = i5;
        this.zzh = z3;
        this.zzi = str;
        this.zzj = zzfxVar;
        this.zzk = location;
        this.zzl = str2;
        this.zzm = bundle2 == null ? new Bundle() : bundle2;
        this.zzn = bundle3;
        this.zzo = list2;
        this.zzp = str3;
        this.zzq = str4;
        this.zzr = z4;
        this.zzs = zzcVar;
        this.zzt = i7;
        this.zzu = str5;
        this.zzv = list3 == null ? new ArrayList() : list3;
        this.zzw = i8;
        this.zzx = str6;
        this.zzy = i9;
        this.zzz = j3;
        this.zzA = j4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzm) {
            return zza(obj) && this.zzz == ((zzm) obj).zzz;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), this.zze, Boolean.valueOf(this.zzf), Integer.valueOf(this.zzg), Boolean.valueOf(this.zzh), this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, Boolean.valueOf(this.zzr), Integer.valueOf(this.zzt), this.zzu, this.zzv, Integer.valueOf(this.zzw), this.zzx, Integer.valueOf(this.zzy), Long.valueOf(this.zzz), Long.valueOf(this.zzA));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i3);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeBundle(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeStringList(parcel, 5, this.zze, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzj, i2, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i2, false);
        SafeParcelWriter.writeString(parcel, 12, this.zzl, false);
        SafeParcelWriter.writeBundle(parcel, 13, this.zzm, false);
        SafeParcelWriter.writeBundle(parcel, 14, this.zzn, false);
        SafeParcelWriter.writeStringList(parcel, 15, this.zzo, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzp, false);
        SafeParcelWriter.writeString(parcel, 17, this.zzq, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzr);
        SafeParcelWriter.writeParcelable(parcel, 19, this.zzs, i2, false);
        SafeParcelWriter.writeInt(parcel, 20, this.zzt);
        SafeParcelWriter.writeString(parcel, 21, this.zzu, false);
        SafeParcelWriter.writeStringList(parcel, 22, this.zzv, false);
        SafeParcelWriter.writeInt(parcel, 23, this.zzw);
        SafeParcelWriter.writeString(parcel, 24, this.zzx, false);
        SafeParcelWriter.writeInt(parcel, 25, this.zzy);
        SafeParcelWriter.writeLong(parcel, 26, this.zzz);
        SafeParcelWriter.writeLong(parcel, 27, this.zzA);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zza(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzmVar = (zzm) obj;
        return this.zza == zzmVar.zza && this.zzb == zzmVar.zzb && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzc, zzmVar.zzc) && this.zzd == zzmVar.zzd && Objects.equal(this.zze, zzmVar.zze) && this.zzf == zzmVar.zzf && this.zzg == zzmVar.zzg && this.zzh == zzmVar.zzh && Objects.equal(this.zzi, zzmVar.zzi) && Objects.equal(this.zzj, zzmVar.zzj) && Objects.equal(this.zzk, zzmVar.zzk) && Objects.equal(this.zzl, zzmVar.zzl) && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzm, zzmVar.zzm) && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzn, zzmVar.zzn) && Objects.equal(this.zzo, zzmVar.zzo) && Objects.equal(this.zzp, zzmVar.zzp) && Objects.equal(this.zzq, zzmVar.zzq) && this.zzr == zzmVar.zzr && this.zzt == zzmVar.zzt && Objects.equal(this.zzu, zzmVar.zzu) && Objects.equal(this.zzv, zzmVar.zzv) && this.zzw == zzmVar.zzw && Objects.equal(this.zzx, zzmVar.zzx) && this.zzy == zzmVar.zzy;
    }

    public final boolean zzc() {
        return this.zzc.getBoolean("is_sdk_preload", false);
    }

    public final boolean zzd() {
        return this.zzc.getBoolean("zenith_v2", false);
    }

    public final boolean zzb() {
        if (!zzc() && !zzd()) {
            return false;
        }
        return true;
    }
}
