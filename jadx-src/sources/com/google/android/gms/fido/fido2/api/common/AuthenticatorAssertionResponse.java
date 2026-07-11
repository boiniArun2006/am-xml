package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgx;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@SafeParcelable.Class(creator = "AuthenticatorAssertionResponseCreator")
@SafeParcelable.Reserved({1})
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new zzj();

    @NonNull
    @SafeParcelable.Field(getter = "getKeyHandle", id = 2, type = "byte[]")
    private final zzgx zza;

    @NonNull
    @SafeParcelable.Field(getter = "getClientDataJSON", id = 3, type = "byte[]")
    private final zzgx zzb;

    @NonNull
    @SafeParcelable.Field(getter = "getAuthenticatorData", id = 4, type = "byte[]")
    private final zzgx zzc;

    @NonNull
    @SafeParcelable.Field(getter = "getSignature", id = 5, type = "byte[]")
    private final zzgx zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getUserHandle", id = 6, type = "byte[]")
    private final zzgx zze;

    public zzgx getAuthenticatorDataAsByteString() {
        return this.zzc;
    }

    public zzgx getClientDataJSONAsByteString() {
        return this.zzb;
    }

    @Deprecated
    public zzgx getKeyHandleAsByteString() {
        return this.zza;
    }

    public zzgx getSignatureAsByteString() {
        return this.zzd;
    }

    @Nullable
    public zzgx getUserHandleAsByteString() {
        return this.zze;
    }

    @NonNull
    public static AuthenticatorAssertionResponse deserializeFromBytes(@NonNull byte[] bArr) {
        return (AuthenticatorAssertionResponse) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return Objects.equal(this.zza, authenticatorAssertionResponse.zza) && Objects.equal(this.zzb, authenticatorAssertionResponse.zzb) && Objects.equal(this.zzc, authenticatorAssertionResponse.zzc) && Objects.equal(this.zzd, authenticatorAssertionResponse.zzd) && Objects.equal(this.zze, authenticatorAssertionResponse.zze);
    }

    @NonNull
    public byte[] getAuthenticatorData() {
        return this.zzc.zzm();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    @NonNull
    public byte[] getClientDataJSON() {
        return this.zzb.zzm();
    }

    @NonNull
    @Deprecated
    public byte[] getKeyHandle() {
        return this.zza.zzm();
    }

    @NonNull
    public byte[] getSignature() {
        return this.zzd.zzm();
    }

    @Nullable
    public byte[] getUserHandle() {
        zzgx zzgxVar = this.zze;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Objects.hashCode(this.zza)), Integer.valueOf(Objects.hashCode(this.zzb)), Integer.valueOf(Objects.hashCode(this.zzc)), Integer.valueOf(Objects.hashCode(this.zzd)), Integer.valueOf(Objects.hashCode(this.zze)));
    }

    @NonNull
    public final JSONObject zza() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", Base64Utils.encodeUrlSafeNoPadding(getClientDataJSON()));
            jSONObject.put("authenticatorData", Base64Utils.encodeUrlSafeNoPadding(getAuthenticatorData()));
            jSONObject.put("signature", Base64Utils.encodeUrlSafeNoPadding(getSignature()));
            if (this.zze == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", Base64Utils.encodeUrlSafeNoPadding(getUserHandle()));
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e2);
        }
    }

    @SafeParcelable.Constructor
    AuthenticatorAssertionResponse(@NonNull @SafeParcelable.Param(id = 2) byte[] bArr, @NonNull @SafeParcelable.Param(id = 3) byte[] bArr2, @NonNull @SafeParcelable.Param(id = 4) byte[] bArr3, @NonNull @SafeParcelable.Param(id = 5) byte[] bArr4, @Nullable @SafeParcelable.Param(id = 6) byte[] bArr5) {
        zzgx zzgxVarZzl;
        byte[] bArr6 = (byte[]) Preconditions.checkNotNull(bArr);
        zzgx zzgxVar = zzgx.zzb;
        zzgx zzgxVarZzl2 = zzgx.zzl(bArr6, 0, bArr6.length);
        byte[] bArr7 = (byte[]) Preconditions.checkNotNull(bArr2);
        zzgx zzgxVarZzl3 = zzgx.zzl(bArr7, 0, bArr7.length);
        byte[] bArr8 = (byte[]) Preconditions.checkNotNull(bArr3);
        zzgx zzgxVarZzl4 = zzgx.zzl(bArr8, 0, bArr8.length);
        byte[] bArr9 = (byte[]) Preconditions.checkNotNull(bArr4);
        zzgx zzgxVarZzl5 = zzgx.zzl(bArr9, 0, bArr9.length);
        if (bArr5 == null) {
            zzgxVarZzl = null;
        } else {
            zzgxVarZzl = zzgx.zzl(bArr5, 0, bArr5.length);
        }
        this.zza = (zzgx) Preconditions.checkNotNull(zzgxVarZzl2);
        this.zzb = (zzgx) Preconditions.checkNotNull(zzgxVarZzl3);
        this.zzc = (zzgx) Preconditions.checkNotNull(zzgxVarZzl4);
        this.zzd = (zzgx) Preconditions.checkNotNull(zzgxVarZzl5);
        this.zze = zzgxVarZzl;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    @NonNull
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @NonNull
    public String toString() {
        zzbi zzbiVarZza = zzbj.zza(this);
        zzgf zzgfVarZzf = zzgf.zzf();
        byte[] keyHandle = getKeyHandle();
        zzbiVarZza.zzb(SignResponseData.JSON_RESPONSE_DATA_KEY_HANDLE, zzgfVarZzf.zzg(keyHandle, 0, keyHandle.length));
        zzgf zzgfVarZzf2 = zzgf.zzf();
        byte[] clientDataJSON = getClientDataJSON();
        zzbiVarZza.zzb("clientDataJSON", zzgfVarZzf2.zzg(clientDataJSON, 0, clientDataJSON.length));
        zzgf zzgfVarZzf3 = zzgf.zzf();
        byte[] authenticatorData = getAuthenticatorData();
        zzbiVarZza.zzb("authenticatorData", zzgfVarZzf3.zzg(authenticatorData, 0, authenticatorData.length));
        zzgf zzgfVarZzf4 = zzgf.zzf();
        byte[] signature = getSignature();
        zzbiVarZza.zzb("signature", zzgfVarZzf4.zzg(signature, 0, signature.length));
        byte[] userHandle = getUserHandle();
        if (userHandle != null) {
            zzbiVarZza.zzb("userHandle", zzgf.zzf().zzg(userHandle, 0, userHandle.length));
        }
        return zzbiVarZza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getKeyHandle(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getClientDataJSON(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getAuthenticatorData(), false);
        SafeParcelWriter.writeByteArray(parcel, 5, getSignature(), false);
        SafeParcelWriter.writeByteArray(parcel, 6, getUserHandle(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
