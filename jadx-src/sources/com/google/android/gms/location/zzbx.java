package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "UserPreferredSleepWindowCreator")
@SafeParcelable.Reserved({1000})
public final class zzbx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbx> CREATOR = new zzby();

    @SafeParcelable.Field(getter = "getStartHour", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getStartMinute", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getEndHour", id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getEndMinute", id = 4)
    private final int zzd;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbx)) {
            return false;
        }
        zzbx zzbxVar = (zzbx) obj;
        return this.zza == zzbxVar.zza && this.zzb == zzbxVar.zzb && this.zzc == zzbxVar.zzc && this.zzd == zzbxVar.zzd;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        int i2 = this.zza;
        int i3 = this.zzb;
        int i5 = this.zzc;
        int i7 = this.zzd;
        StringBuilder sb = new StringBuilder(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
        sb.append("UserPreferredSleepWindow [startHour=");
        sb.append(i2);
        sb.append(", startMinute=");
        sb.append(i3);
        sb.append(", endHour=");
        sb.append(i5);
        sb.append(", endMinute=");
        sb.append(i7);
        sb.append(']');
        return sb.toString();
    }

    @SafeParcelable.Constructor
    public zzbx(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) int i5, @SafeParcelable.Param(id = 4) int i7) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (i2 >= 0 && i2 <= 23) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkState(z2, "Start hour must be in range [0, 23].");
        if (i3 >= 0 && i3 <= 59) {
            z3 = true;
        } else {
            z3 = false;
        }
        Preconditions.checkState(z3, "Start minute must be in range [0, 59].");
        if (i5 >= 0 && i5 <= 23) {
            z4 = true;
        } else {
            z4 = false;
        }
        Preconditions.checkState(z4, "End hour must be in range [0, 23].");
        if (i7 >= 0 && i7 <= 59) {
            z5 = true;
        } else {
            z5 = false;
        }
        Preconditions.checkState(z5, "End minute must be in range [0, 59].");
        Preconditions.checkState(((i2 + i3) + i5) + i7 > 0, "Parameters can't be all 0.");
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i5;
        this.zzd = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
