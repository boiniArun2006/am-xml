package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhp;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@SafeParcelable.Class(creator = "HmacSecretExtensionCreator")
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new zzaj();

    @VisibleForTesting
    static final zzhp zza = zzhp.zzg(1);

    @VisibleForTesting
    static final zzhp zzb = zzhp.zzg(2);

    @VisibleForTesting
    static final zzhp zzc = zzhp.zzg(3);

    @VisibleForTesting
    static final zzhp zzd = zzhp.zzg(4);

    @Nullable
    @SafeParcelable.Field(getter = "getCoseKeyAgreement", id = 1, type = "byte[]")
    private final zzgx zze;

    @Nullable
    @SafeParcelable.Field(getter = "getSaltEnc", id = 2, type = "byte[]")
    private final zzgx zzf;

    @Nullable
    @SafeParcelable.Field(getter = "getSaltAuth", id = 3, type = "byte[]")
    private final zzgx zzg;

    @SafeParcelable.Field(getter = "getPinUvAuthProtocol", id = 4)
    private final int zzh;

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        return Objects.equal(this.zze, zzaiVar.zze) && Objects.equal(this.zzf, zzaiVar.zzf) && Objects.equal(this.zzg, zzaiVar.zzg) && this.zzh == zzaiVar.zzh;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zze, this.zzf, this.zzg, Integer.valueOf(this.zzh));
    }

    @Nullable
    public final byte[] zza() {
        zzgx zzgxVar = this.zze;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    @Nullable
    public final byte[] zzb() {
        zzgx zzgxVar = this.zzg;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    @Nullable
    public final byte[] zzc() {
        zzgx zzgxVar = this.zzf;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    zzai(@Nullable zzgx zzgxVar, @Nullable zzgx zzgxVar2, @Nullable zzgx zzgxVar3, int i2) {
        this.zze = zzgxVar;
        this.zzf = zzgxVar2;
        this.zzg = zzgxVar3;
        this.zzh = i2;
    }

    public final String toString() {
        return "HmacSecretExtension{coseKeyAgreement=" + Base64Utils.encodeUrlSafeNoPadding(zza()) + ", saltEnc=" + Base64Utils.encodeUrlSafeNoPadding(zzc()) + ", saltAuth=" + Base64Utils.encodeUrlSafeNoPadding(zzb()) + ", getPinUvAuthProtocol=" + this.zzh + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, zza(), false);
        SafeParcelWriter.writeByteArray(parcel, 2, zzc(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, zzb(), false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzh);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
