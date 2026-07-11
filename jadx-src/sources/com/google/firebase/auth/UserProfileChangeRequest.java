package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@SafeParcelable.Class(creator = "UserProfileChangeRequestCreator")
@SafeParcelable.Reserved({1})
public class UserProfileChangeRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UserProfileChangeRequest> CREATOR = new Ln();
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f60148O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f60149n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Uri f60150r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f60151t;

    public static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f60152n;
        private boolean nr;
        private Uri rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f60153t;

        public UserProfileChangeRequest n() {
            String str = this.f60152n;
            Uri uri = this.rl;
            return new UserProfileChangeRequest(str, uri == null ? null : uri.toString(), this.f60153t, this.nr);
        }

        public j rl(String str) {
            if (str == null) {
                this.f60153t = true;
                return this;
            }
            this.f60152n = str;
            return this;
        }

        public j t(Uri uri) {
            if (uri == null) {
                this.nr = true;
                return this;
            }
            this.rl = uri;
            return this;
        }
    }

    public Uri T3L() {
        return this.f60150r;
    }

    public String getDisplayName() {
        return this.f60149n;
    }

    public final String zza() {
        return this.f60151t;
    }

    public final boolean zzb() {
        return this.f60148O;
    }

    public final boolean zzc() {
        return this.J2;
    }

    UserProfileChangeRequest(String str, String str2, boolean z2, boolean z3) {
        Uri uri;
        this.f60149n = str;
        this.f60151t = str2;
        this.f60148O = z2;
        this.J2 = z3;
        if (TextUtils.isEmpty(str2)) {
            uri = null;
        } else {
            uri = Uri.parse(str2);
        }
        this.f60150r = uri;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getDisplayName(), false);
        SafeParcelWriter.writeString(parcel, 3, this.f60151t, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f60148O);
        SafeParcelWriter.writeBoolean(parcel, 5, this.J2);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
