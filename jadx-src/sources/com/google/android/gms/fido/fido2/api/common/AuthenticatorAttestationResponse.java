package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgj;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhj;
import com.google.android.gms.internal.fido.zzhm;
import com.google.android.gms.internal.fido.zzho;
import com.google.android.gms.internal.fido.zzhp;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@SafeParcelable.Class(creator = "AuthenticatorAttestationResponseCreator")
@SafeParcelable.Reserved({1})
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new zzk();

    @NonNull
    @SafeParcelable.Field(getter = "getKeyHandle", id = 2, type = "byte[]")
    private final zzgx zza;

    @NonNull
    @SafeParcelable.Field(getter = "getClientDataJSON", id = 3, type = "byte[]")
    private final zzgx zzb;

    @NonNull
    @SafeParcelable.Field(getter = "getAttestationObject", id = 4, type = "byte[]")
    private final zzgx zzc;

    @NonNull
    @SafeParcelable.Field(getter = "getTransports", id = 5)
    private final String[] zzd;

    public zzgx getAttestationObjectAsByteString() {
        return this.zzc;
    }

    public zzgx getClientDataJSONAsByteString() {
        return this.zzb;
    }

    public zzgx getKeyHandleAsByteString() {
        return this.zza;
    }

    @NonNull
    public String[] getTransports() {
        return this.zzd;
    }

    @NonNull
    public static AuthenticatorAttestationResponse deserializeFromBytes(@NonNull byte[] bArr) {
        return (AuthenticatorAttestationResponse) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return Objects.equal(this.zza, authenticatorAttestationResponse.zza) && Objects.equal(this.zzb, authenticatorAttestationResponse.zzb) && Objects.equal(this.zzc, authenticatorAttestationResponse.zzc);
    }

    @NonNull
    public byte[] getAttestationObject() {
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

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Objects.hashCode(this.zza)), Integer.valueOf(Objects.hashCode(this.zzb)), Integer.valueOf(Objects.hashCode(this.zzc)));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0125 A[Catch: JSONException -> 0x0019, zzho -> 0x018e, TRY_LEAVE, TryCatch #1 {zzho -> 0x018e, blocks: (B:33:0x00f4, B:39:0x0113, B:41:0x0125, B:46:0x0139, B:49:0x015b, B:51:0x0171, B:53:0x0177, B:56:0x0191, B:57:0x0196, B:58:0x0197, B:59:0x019c, B:64:0x01a7, B:66:0x01b7, B:68:0x01c5, B:69:0x01d8, B:70:0x01dd, B:71:0x01de, B:72:0x01e3, B:77:0x0202, B:78:0x0207), top: B:108:0x00f4, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0202 A[Catch: JSONException -> 0x0019, zzho -> 0x018e, TRY_ENTER, TryCatch #1 {zzho -> 0x018e, blocks: (B:33:0x00f4, B:39:0x0113, B:41:0x0125, B:46:0x0139, B:49:0x015b, B:51:0x0171, B:53:0x0177, B:56:0x0191, B:57:0x0196, B:58:0x0197, B:59:0x019c, B:64:0x01a7, B:66:0x01b7, B:68:0x01c5, B:69:0x01d8, B:70:0x01dd, B:71:0x01de, B:72:0x01e3, B:77:0x0202, B:78:0x0207), top: B:108:0x00f4, outer: #3 }] */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject zza() {
        zzhp zzhpVar;
        byte[] bArrZza;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.zzb != null) {
                jSONObject.put("clientDataJSON", Base64Utils.encodeUrlSafeNoPadding(getClientDataJSON()));
            }
            if (this.zzc != null) {
                jSONObject.put("attestationObject", Base64Utils.encodeUrlSafeNoPadding(getAttestationObject()));
            }
            JSONArray jSONArray = new JSONArray();
            int i2 = 0;
            while (true) {
                String[] strArr = this.zzd;
                if (i2 >= strArr.length) {
                    break;
                }
                if (strArr[i2].equals(Transport.HYBRID.toString())) {
                    jSONArray.put(i2, "hybrid");
                } else {
                    jSONArray.put(i2, this.zzd[i2]);
                }
                i2++;
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    zzhp zzhpVar2 = (zzhp) zzhp.zzj(getAttestationObject()).zzh().zzc().get(zzhp.zzi("authData"));
                    if (zzhpVar2 == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    zzgx zzgxVarZzc = zzhpVar2.zze().zzc();
                    ByteBuffer byteBufferZzi = zzgxVarZzc.zzi();
                    try {
                        byteBufferZzi.position(byteBufferZzi.position() + 32);
                        if ((byteBufferZzi.get() & 64) == 0) {
                            throw new IllegalArgumentException("authData does not include credential data");
                        }
                        byteBufferZzi.position(byteBufferZzi.position() + 4);
                        byteBufferZzi.position(byteBufferZzi.position() + 16);
                        byteBufferZzi.position(byteBufferZzi.position() + byteBufferZzi.getShort());
                        try {
                            zzhm zzhmVarZzh = zzhp.zzk(zzgxVarZzc.zzg(byteBufferZzi.position(), zzgxVarZzc.zzd()).zzh()).zzh();
                            zzhp zzhpVar3 = (zzhp) zzhmVarZzh.zzc().get(zzhp.zzg(3L));
                            zzhp zzhpVar4 = (zzhp) zzhmVarZzh.zzc().get(zzhp.zzg(1L));
                            if (zzhpVar3 == null || zzhpVar4 == null) {
                                throw new IllegalArgumentException("COSE key missing required fields");
                            }
                            try {
                                long jZzc = zzhpVar3.zzf().zzc();
                                long jZzc2 = zzhpVar4.zzf().zzc();
                                if (jZzc2 == 1) {
                                    zzhpVar = (zzhp) zzhmVarZzh.zzc().get(zzhp.zzg(-1L));
                                    if (zzhpVar != null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    long jZzc3 = zzhpVar.zzf().zzc();
                                    if (jZzc2 == 2 && jZzc3 == 1) {
                                        zzhp zzhpVar5 = (zzhp) zzhmVarZzh.zzc().get(zzhp.zzg(-2L));
                                        zzhp zzhpVar6 = (zzhp) zzhmVarZzh.zzc().get(zzhp.zzg(-3L));
                                        if (zzhpVar5 == null || zzhpVar6 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        zzgx zzgxVarZzc2 = zzhpVar5.zze().zzc();
                                        zzgx zzgxVarZzc3 = zzhpVar6.zze().zzc();
                                        if (zzgxVarZzc2.zzd() != 32 || zzgxVarZzc3.zzd() != 32) {
                                            throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                        }
                                        bArrZza = zzgj.zza(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), zzgxVarZzc2.zzm(), zzgxVarZzc3.zzm());
                                    } else if (jZzc2 == 1 && jZzc3 == 6) {
                                        zzhp zzhpVar7 = (zzhp) zzhmVarZzh.zzc().get(zzhp.zzg(-2L));
                                        if (zzhpVar7 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        zzgx zzgxVarZzc4 = zzhpVar7.zze().zzc();
                                        if (zzgxVarZzc4.zzd() != 32) {
                                            throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                        }
                                        bArrZza = zzgj.zza(Base64.decode("MCowBQYDK2VwAyEA", 0), zzgxVarZzc4.zzm());
                                    } else {
                                        bArrZza = null;
                                    }
                                } else {
                                    if (jZzc2 == 2) {
                                        jZzc2 = 2;
                                        zzhpVar = (zzhp) zzhmVarZzh.zzc().get(zzhp.zzg(-1L));
                                        if (zzhpVar != null) {
                                        }
                                    }
                                    bArrZza = null;
                                }
                                jSONObject.put("authenticatorData", Base64Utils.encodeUrlSafeNoPadding(zzgxVarZzc.zzm()));
                                jSONObject.put("publicKeyAlgorithm", jZzc);
                                if (bArrZza != null) {
                                    jSONObject.put("publicKey", Base64Utils.encodeUrlSafeNoPadding(bArrZza));
                                }
                                return jSONObject;
                            } catch (zzho e2) {
                                throw new IllegalArgumentException("COSE key ill-formed", e2);
                            }
                        } catch (zzhj e3) {
                            e = e3;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        } catch (zzho e4) {
                            e = e4;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        }
                    } catch (IllegalArgumentException e5) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e5);
                    }
                } catch (zzho e6) {
                    throw new IllegalArgumentException("authData value has wrong type", e6);
                }
            } catch (zzhj e7) {
                e = e7;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            } catch (zzho e8) {
                e = e8;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            }
        } catch (JSONException e9) {
            throw new RuntimeException("Error encoding AuthenticatorAttestationResponse to JSON object", e9);
        }
    }

    @SafeParcelable.Constructor
    AuthenticatorAttestationResponse(@NonNull @SafeParcelable.Param(id = 2) byte[] bArr, @NonNull @SafeParcelable.Param(id = 3) byte[] bArr2, @NonNull @SafeParcelable.Param(id = 4) byte[] bArr3, @NonNull @SafeParcelable.Param(id = 5) String[] strArr) {
        byte[] bArr4 = (byte[]) Preconditions.checkNotNull(bArr);
        zzgx zzgxVar = zzgx.zzb;
        zzgx zzgxVarZzl = zzgx.zzl(bArr4, 0, bArr4.length);
        byte[] bArr5 = (byte[]) Preconditions.checkNotNull(bArr2);
        zzgx zzgxVarZzl2 = zzgx.zzl(bArr5, 0, bArr5.length);
        byte[] bArr6 = (byte[]) Preconditions.checkNotNull(bArr3);
        zzgx zzgxVarZzl3 = zzgx.zzl(bArr6, 0, bArr6.length);
        this.zza = (zzgx) Preconditions.checkNotNull(zzgxVarZzl);
        this.zzb = (zzgx) Preconditions.checkNotNull(zzgxVarZzl2);
        this.zzc = (zzgx) Preconditions.checkNotNull(zzgxVarZzl3);
        this.zzd = (String[]) Preconditions.checkNotNull(strArr);
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
        byte[] attestationObject = getAttestationObject();
        zzbiVarZza.zzb("attestationObject", zzgfVarZzf3.zzg(attestationObject, 0, attestationObject.length));
        zzbiVarZza.zzb("transports", Arrays.toString(this.zzd));
        return zzbiVarZza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getKeyHandle(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getClientDataJSON(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getAttestationObject(), false);
        SafeParcelWriter.writeStringArray(parcel, 5, getTransports(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
