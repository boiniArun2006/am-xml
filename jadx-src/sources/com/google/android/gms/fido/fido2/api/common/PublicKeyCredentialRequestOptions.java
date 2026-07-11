package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.android.gms.internal.fido.zzia;
import com.safedk.android.utils.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@SafeParcelable.Class(creator = "PublicKeyCredentialRequestOptionsCreator")
@SafeParcelable.Reserved({1})
public class PublicKeyCredentialRequestOptions extends RequestOptions {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new zzar();

    @NonNull
    @SafeParcelable.Field(getter = "getChallenge", id = 2)
    private final byte[] zza;

    @Nullable
    @SafeParcelable.Field(getter = "getTimeoutSeconds", id = 3)
    private final Double zzb;

    @NonNull
    @SafeParcelable.Field(getter = "getRpId", id = 4)
    private final String zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getAllowList", id = 5)
    private final List zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getRequestId", id = 6)
    private final Integer zze;

    @Nullable
    @SafeParcelable.Field(getter = "getTokenBinding", id = 7)
    private final TokenBinding zzf;

    @Nullable
    @SafeParcelable.Field(getter = "getUserVerificationAsString", id = 8, type = n.f63225f)
    private final UserVerificationRequirement zzg;

    @Nullable
    @SafeParcelable.Field(getter = "getAuthenticationExtensions", id = 9)
    private final AuthenticationExtensions zzh;

    @Nullable
    @SafeParcelable.Field(getter = "getLongRequestId", id = 10)
    private final Long zzi;

    @Nullable
    @SafeParcelable.Field(getter = "getResultReceiver", id = 12)
    private ResultReceiver zzj;

    public static final class Builder {
        private byte[] zza;
        private Double zzb;
        private String zzc;
        private List zzd;
        private Integer zze;
        private TokenBinding zzf;
        private UserVerificationRequirement zzg;
        private AuthenticationExtensions zzh;
        private Long zzi;
        private ResultReceiver zzj;

        public Builder() {
        }

        @NonNull
        public Builder setAllowList(@Nullable List<PublicKeyCredentialDescriptor> list) {
            this.zzd = list;
            return this;
        }

        @NonNull
        public Builder setAuthenticationExtensions(@Nullable AuthenticationExtensions authenticationExtensions) {
            this.zzh = authenticationExtensions;
            return this;
        }

        @NonNull
        public Builder setRequestId(@Nullable Integer num) {
            this.zze = num;
            return this;
        }

        @NonNull
        public Builder setTimeoutSeconds(@Nullable Double d2) {
            this.zzb = d2;
            return this;
        }

        @NonNull
        public Builder setTokenBinding(@Nullable TokenBinding tokenBinding) {
            this.zzf = tokenBinding;
            return this;
        }

        @NonNull
        public final Builder zza(@Nullable Long l2) {
            this.zzi = l2;
            return this;
        }

        @NonNull
        public final Builder zzb(@Nullable ResultReceiver resultReceiver) {
            this.zzj = null;
            return this;
        }

        @NonNull
        public final Builder zzc(@Nullable UserVerificationRequirement userVerificationRequirement) {
            this.zzg = userVerificationRequirement;
            return this;
        }

        public Builder(@Nullable PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
            if (publicKeyCredentialRequestOptions != null) {
                this.zza = publicKeyCredentialRequestOptions.getChallenge();
                this.zzb = publicKeyCredentialRequestOptions.getTimeoutSeconds();
                this.zzc = publicKeyCredentialRequestOptions.getRpId();
                this.zzd = publicKeyCredentialRequestOptions.getAllowList();
                this.zze = publicKeyCredentialRequestOptions.getRequestId();
                this.zzf = publicKeyCredentialRequestOptions.getTokenBinding();
                this.zzg = publicKeyCredentialRequestOptions.zzb();
                this.zzh = publicKeyCredentialRequestOptions.getAuthenticationExtensions();
                this.zzi = publicKeyCredentialRequestOptions.zzc();
                this.zzj = publicKeyCredentialRequestOptions.zza();
            }
        }

        @NonNull
        public PublicKeyCredentialRequestOptions build() {
            byte[] bArr = this.zza;
            Double d2 = this.zzb;
            String str = this.zzc;
            List list = this.zzd;
            Integer num = this.zze;
            TokenBinding tokenBinding = this.zzf;
            UserVerificationRequirement userVerificationRequirement = this.zzg;
            return new PublicKeyCredentialRequestOptions(bArr, d2, str, list, num, tokenBinding, userVerificationRequirement == null ? null : userVerificationRequirement.toString(), this.zzh, this.zzi, null, this.zzj);
        }

        @NonNull
        public Builder setChallenge(@NonNull byte[] bArr) {
            this.zza = (byte[]) Preconditions.checkNotNull(bArr);
            return this;
        }

        @NonNull
        public Builder setRpId(@NonNull String str) {
            this.zzc = (String) Preconditions.checkNotNull(str);
            return this;
        }
    }

    @Nullable
    public List<PublicKeyCredentialDescriptor> getAllowList() {
        return this.zzd;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @Nullable
    public AuthenticationExtensions getAuthenticationExtensions() {
        return this.zzh;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @NonNull
    public byte[] getChallenge() {
        return this.zza;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @Nullable
    public Integer getRequestId() {
        return this.zze;
    }

    @NonNull
    public String getRpId() {
        return this.zzc;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @Nullable
    public Double getTimeoutSeconds() {
        return this.zzb;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @Nullable
    public TokenBinding getTokenBinding() {
        return this.zzf;
    }

    @Nullable
    public final ResultReceiver zza() {
        return this.zzj;
    }

    @Nullable
    public final UserVerificationRequirement zzb() {
        return this.zzg;
    }

    @Nullable
    public final Long zzc() {
        return this.zzi;
    }

    @SafeParcelable.Constructor
    PublicKeyCredentialRequestOptions(@NonNull @SafeParcelable.Param(id = 2) byte[] bArr, @Nullable @SafeParcelable.Param(id = 3) Double d2, @NonNull @SafeParcelable.Param(id = 4) String str, @Nullable @SafeParcelable.Param(id = 5) List list, @Nullable @SafeParcelable.Param(id = 6) Integer num, @Nullable @SafeParcelable.Param(id = 7) TokenBinding tokenBinding, @Nullable @SafeParcelable.Param(id = 8) String str2, @Nullable @SafeParcelable.Param(id = 9) AuthenticationExtensions authenticationExtensions, @Nullable @SafeParcelable.Param(id = 10) Long l2, @Nullable @SafeParcelable.Param(id = 11) String str3, @Nullable @SafeParcelable.Param(id = 12) ResultReceiver resultReceiver) {
        this.zzj = resultReceiver;
        if (str3 == null || !zzia.zzc()) {
            this.zza = (byte[]) Preconditions.checkNotNull(bArr);
            this.zzb = d2;
            this.zzc = (String) Preconditions.checkNotNull(str);
            this.zzd = list;
            this.zze = num;
            this.zzf = tokenBinding;
            this.zzi = l2;
            if (str2 != null) {
                try {
                    this.zzg = UserVerificationRequirement.fromString(str2);
                } catch (zzbc e2) {
                    throw new IllegalArgumentException(e2);
                }
            } else {
                this.zzg = null;
            }
            this.zzh = authenticationExtensions;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str3);
            Builder builder = new Builder();
            builder.setChallenge(Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString(ClientData.KEY_CHALLENGE)));
            if (jSONObject.has("timeout")) {
                builder.setTimeoutSeconds(Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d));
            } else if (jSONObject.has("timeoutSeconds")) {
                builder.setTimeoutSeconds(Double.valueOf(jSONObject.getDouble("timeoutSeconds")));
            }
            builder.setRpId(jSONObject.getString("rpId"));
            JSONArray jSONArray = jSONObject.has("allowList") ? jSONObject.getJSONArray("allowList") : jSONObject.has("allowCredentials") ? jSONObject.getJSONArray("allowCredentials") : null;
            if (jSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add(PublicKeyCredentialDescriptor.zza(jSONArray.getJSONObject(i2)));
                }
                builder.setAllowList(arrayList);
            }
            if (jSONObject.has("requestId")) {
                builder.setRequestId(Integer.valueOf(jSONObject.getInt("requestId")));
            }
            if (jSONObject.has("tokenBinding")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("tokenBinding");
                builder.setTokenBinding(new TokenBinding(jSONObject2.getString("status"), jSONObject2.has("id") ? jSONObject2.getString("id") : null));
            }
            if (jSONObject.has("userVerification")) {
                builder.zzc(UserVerificationRequirement.fromString(jSONObject.getString("userVerification")));
            }
            if (jSONObject.has("authenticationExtensions")) {
                builder.setAuthenticationExtensions(AuthenticationExtensions.zza(jSONObject.getJSONObject("authenticationExtensions")));
            } else if (jSONObject.has("extensions")) {
                builder.setAuthenticationExtensions(AuthenticationExtensions.zza(jSONObject.getJSONObject("extensions")));
            }
            if (jSONObject.has("longRequestId")) {
                builder.zza(Long.valueOf(jSONObject.getLong("longRequestId")));
            }
            PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptionsBuild = builder.build();
            this.zza = publicKeyCredentialRequestOptionsBuild.zza;
            this.zzb = publicKeyCredentialRequestOptionsBuild.zzb;
            this.zzc = publicKeyCredentialRequestOptionsBuild.zzc;
            this.zzd = publicKeyCredentialRequestOptionsBuild.zzd;
            this.zze = publicKeyCredentialRequestOptionsBuild.zze;
            this.zzf = publicKeyCredentialRequestOptionsBuild.zzf;
            this.zzg = publicKeyCredentialRequestOptionsBuild.zzg;
            this.zzh = publicKeyCredentialRequestOptionsBuild.zzh;
            this.zzi = publicKeyCredentialRequestOptionsBuild.zzi;
        } catch (zzbc e3) {
            e = e3;
            throw new IllegalArgumentException(e);
        } catch (JSONException e4) {
            e = e4;
            throw new IllegalArgumentException(e);
        }
    }

    @NonNull
    public static PublicKeyCredentialRequestOptions deserializeFromBytes(@Nullable byte[] bArr) {
        return (PublicKeyCredentialRequestOptions) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(@NonNull Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        return Arrays.equals(this.zza, publicKeyCredentialRequestOptions.zza) && Objects.equal(this.zzb, publicKeyCredentialRequestOptions.zzb) && Objects.equal(this.zzc, publicKeyCredentialRequestOptions.zzc) && (((list = this.zzd) == null && publicKeyCredentialRequestOptions.zzd == null) || (list != null && (list2 = publicKeyCredentialRequestOptions.zzd) != null && list.containsAll(list2) && publicKeyCredentialRequestOptions.zzd.containsAll(this.zzd))) && Objects.equal(this.zze, publicKeyCredentialRequestOptions.zze) && Objects.equal(this.zzf, publicKeyCredentialRequestOptions.zzf) && Objects.equal(this.zzg, publicKeyCredentialRequestOptions.zzg) && Objects.equal(this.zzh, publicKeyCredentialRequestOptions.zzh) && Objects.equal(this.zzi, publicKeyCredentialRequestOptions.zzi);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
    }

    @NonNull
    public final String toString() {
        AuthenticationExtensions authenticationExtensions = this.zzh;
        UserVerificationRequirement userVerificationRequirement = this.zzg;
        TokenBinding tokenBinding = this.zzf;
        List list = this.zzd;
        return "PublicKeyCredentialRequestOptions{\n challenge=" + Base64Utils.encodeUrlSafeNoPadding(this.zza) + ", \n timeoutSeconds=" + this.zzb + ", \n rpId='" + this.zzc + "', \n allowList=" + String.valueOf(list) + ", \n requestId=" + this.zze + ", \n tokenBinding=" + String.valueOf(tokenBinding) + ", \n userVerification=" + String.valueOf(userVerificationRequirement) + ", \n authenticationExtensions=" + String.valueOf(authenticationExtensions) + ", \n longRequestId=" + this.zzi + "}";
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @NonNull
    public byte[] serializeToBytes() {
        if (zzia.zzd()) {
            Builder builder = new Builder(this);
            builder.zzb(null);
            return SafeParcelableSerializer.serializeToBytes(builder.build());
        }
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        String string;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getChallenge(), false);
        SafeParcelWriter.writeDoubleObject(parcel, 3, getTimeoutSeconds(), false);
        SafeParcelWriter.writeString(parcel, 4, getRpId(), false);
        SafeParcelWriter.writeTypedList(parcel, 5, getAllowList(), false);
        SafeParcelWriter.writeIntegerObject(parcel, 6, getRequestId(), false);
        SafeParcelWriter.writeParcelable(parcel, 7, getTokenBinding(), i2, false);
        UserVerificationRequirement userVerificationRequirement = this.zzg;
        if (userVerificationRequirement == null) {
            string = null;
        } else {
            string = userVerificationRequirement.toString();
        }
        SafeParcelWriter.writeString(parcel, 8, string, false);
        SafeParcelWriter.writeParcelable(parcel, 9, getAuthenticationExtensions(), i2, false);
        SafeParcelWriter.writeLongObject(parcel, 10, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 11, null, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzj, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
