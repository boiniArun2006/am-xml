package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@SafeParcelable.Class(creator = "AppMetadataCreator")
@SafeParcelable.Reserved({1, 13, 17, 19, 20, 24, 33})
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    @SafeParcelable.Field(id = 34)
    public final long zzA;

    @Nullable
    @SafeParcelable.Field(id = 35)
    public final String zzB;

    @SafeParcelable.Field(defaultValue = "", id = 36)
    public final String zzC;

    @SafeParcelable.Field(id = 37)
    public final long zzD;

    @SafeParcelable.Field(id = 38)
    public final int zzE;

    @Nullable
    @SafeParcelable.Field(id = 2)
    public final String zza;

    @Nullable
    @SafeParcelable.Field(id = 3)
    public final String zzb;

    @Nullable
    @SafeParcelable.Field(id = 4)
    public final String zzc;

    @Nullable
    @SafeParcelable.Field(id = 5)
    public final String zzd;

    @SafeParcelable.Field(id = 6)
    public final long zze;

    @SafeParcelable.Field(id = 7)
    public final long zzf;

    @Nullable
    @SafeParcelable.Field(id = 8)
    public final String zzg;

    @SafeParcelable.Field(defaultValue = "true", id = 9)
    public final boolean zzh;

    @SafeParcelable.Field(id = 10)
    public final boolean zzi;

    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MIN_VALUE", id = 11)
    public final long zzj;

    @Nullable
    @SafeParcelable.Field(id = 12)
    public final String zzk;

    @SafeParcelable.Field(id = 14)
    public final long zzl;

    @SafeParcelable.Field(id = 15)
    public final int zzm;

    @SafeParcelable.Field(defaultValue = "true", id = 16)
    public final boolean zzn;

    @SafeParcelable.Field(id = 18)
    public final boolean zzo;

    @Nullable
    @SafeParcelable.Field(id = 21)
    public final Boolean zzp;

    @SafeParcelable.Field(id = 22)
    public final long zzq;

    @Nullable
    @SafeParcelable.Field(id = 23)
    public final List zzr;

    @SafeParcelable.Field(defaultValue = "", id = 25)
    public final String zzs;

    @SafeParcelable.Field(defaultValue = "", id = 26)
    public final String zzt;

    @Nullable
    @SafeParcelable.Field(id = 27)
    public final String zzu;

    @SafeParcelable.Field(defaultValue = V8ValueBoolean.FALSE, id = 28)
    public final boolean zzv;

    @SafeParcelable.Field(id = 29)
    public final long zzw;

    @SafeParcelable.Field(defaultValue = "100", id = 30)
    public final int zzx;

    @SafeParcelable.Field(defaultValue = "", id = 31)
    public final String zzy;

    @SafeParcelable.Field(id = 32)
    public final int zzz;

    zzr(@Nullable String str, @Nullable String str2, @Nullable String str3, long j2, @Nullable String str4, long j3, long j4, @Nullable String str5, boolean z2, boolean z3, @Nullable String str6, long j5, int i2, boolean z4, boolean z5, @Nullable Boolean bool, long j6, @Nullable List list, String str7, String str8, @Nullable String str9, boolean z6, long j7, int i3, String str10, int i5, long j9, @Nullable String str11, String str12, long j10, int i7) {
        Preconditions.checkNotEmpty(str);
        this.zza = str;
        this.zzb = true == TextUtils.isEmpty(str2) ? null : str2;
        this.zzc = str3;
        this.zzj = j2;
        this.zzd = str4;
        this.zze = j3;
        this.zzf = j4;
        this.zzg = str5;
        this.zzh = z2;
        this.zzi = z3;
        this.zzk = str6;
        this.zzl = j5;
        this.zzm = i2;
        this.zzn = z4;
        this.zzo = z5;
        this.zzp = bool;
        this.zzq = j6;
        this.zzr = list;
        this.zzs = str7;
        this.zzt = str8;
        this.zzu = str9;
        this.zzv = z6;
        this.zzw = j7;
        this.zzx = i3;
        this.zzy = str10;
        this.zzz = i5;
        this.zzA = j9;
        this.zzB = str11;
        this.zzC = str12;
        this.zzD = j10;
        this.zzE = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeLong(parcel, 6, this.zze);
        SafeParcelWriter.writeLong(parcel, 7, this.zzf);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        SafeParcelWriter.writeString(parcel, 12, this.zzk, false);
        SafeParcelWriter.writeLong(parcel, 14, this.zzl);
        SafeParcelWriter.writeInt(parcel, 15, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzn);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzo);
        SafeParcelWriter.writeBooleanObject(parcel, 21, this.zzp, false);
        SafeParcelWriter.writeLong(parcel, 22, this.zzq);
        SafeParcelWriter.writeStringList(parcel, 23, this.zzr, false);
        SafeParcelWriter.writeString(parcel, 25, this.zzs, false);
        SafeParcelWriter.writeString(parcel, 26, this.zzt, false);
        SafeParcelWriter.writeString(parcel, 27, this.zzu, false);
        SafeParcelWriter.writeBoolean(parcel, 28, this.zzv);
        SafeParcelWriter.writeLong(parcel, 29, this.zzw);
        SafeParcelWriter.writeInt(parcel, 30, this.zzx);
        SafeParcelWriter.writeString(parcel, 31, this.zzy, false);
        SafeParcelWriter.writeInt(parcel, 32, this.zzz);
        SafeParcelWriter.writeLong(parcel, 34, this.zzA);
        SafeParcelWriter.writeString(parcel, 35, this.zzB, false);
        SafeParcelWriter.writeString(parcel, 36, this.zzC, false);
        SafeParcelWriter.writeLong(parcel, 37, this.zzD);
        SafeParcelWriter.writeInt(parcel, 38, this.zzE);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    zzr(@Nullable @SafeParcelable.Param(id = 2) String str, @Nullable @SafeParcelable.Param(id = 3) String str2, @Nullable @SafeParcelable.Param(id = 4) String str3, @Nullable @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) long j2, @SafeParcelable.Param(id = 7) long j3, @Nullable @SafeParcelable.Param(id = 8) String str5, @SafeParcelable.Param(id = 9) boolean z2, @SafeParcelable.Param(id = 10) boolean z3, @SafeParcelable.Param(id = 11) long j4, @Nullable @SafeParcelable.Param(id = 12) String str6, @SafeParcelable.Param(id = 14) long j5, @SafeParcelable.Param(id = 15) int i2, @SafeParcelable.Param(id = 16) boolean z4, @SafeParcelable.Param(id = 18) boolean z5, @Nullable @SafeParcelable.Param(id = 21) Boolean bool, @SafeParcelable.Param(id = 22) long j6, @Nullable @SafeParcelable.Param(id = 23) List list, @SafeParcelable.Param(id = 25) String str7, @SafeParcelable.Param(id = 26) String str8, @SafeParcelable.Param(id = 27) String str9, @SafeParcelable.Param(id = 28) boolean z6, @SafeParcelable.Param(id = 29) long j7, @SafeParcelable.Param(id = 30) int i3, @SafeParcelable.Param(id = 31) String str10, @SafeParcelable.Param(id = 32) int i5, @SafeParcelable.Param(id = 34) long j9, @Nullable @SafeParcelable.Param(id = 35) String str11, @SafeParcelable.Param(id = 36) String str12, @SafeParcelable.Param(id = 37) long j10, @SafeParcelable.Param(id = 38) int i7) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzj = j4;
        this.zzd = str4;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = str5;
        this.zzh = z2;
        this.zzi = z3;
        this.zzk = str6;
        this.zzl = j5;
        this.zzm = i2;
        this.zzn = z4;
        this.zzo = z5;
        this.zzp = bool;
        this.zzq = j6;
        this.zzr = list;
        this.zzs = str7;
        this.zzt = str8;
        this.zzu = str9;
        this.zzv = z6;
        this.zzw = j7;
        this.zzx = i3;
        this.zzy = str10;
        this.zzz = i5;
        this.zzA = j9;
        this.zzB = str11;
        this.zzC = str12;
        this.zzD = j10;
        this.zzE = i7;
    }
}
