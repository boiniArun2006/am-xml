package com.firebase.ui.auth;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.data.model.User;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class IdpResponse implements Parcelable {
    public static final Parcelable.Creator<IdpResponse> CREATOR = new Parcelable.Creator<IdpResponse>() { // from class: com.firebase.ui.auth.IdpResponse.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IdpResponse createFromParcel(Parcel parcel) {
            return new IdpResponse((User) parcel.readParcelable(User.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 1, (FirebaseUiException) parcel.readSerializable(), (AuthCredential) parcel.readParcelable(AuthCredential.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IdpResponse[] newArray(int i2) {
            return new IdpResponse[i2];
        }
    };
    private final FirebaseUiException mException;
    private final boolean mIsNewUser;
    private final AuthCredential mPendingCredential;
    private final String mSecret;
    private final String mToken;
    private final User mUser;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    @RestrictTo
    public static class Builder {
        private boolean mIsNewUser;
        private AuthCredential mPendingCredential;
        private String mSecret;
        private String mToken;
        private User mUser;

        public Builder() {
        }

        public Builder(@NonNull User user) {
            this.mUser = user;
        }

        public IdpResponse build() {
            if (this.mPendingCredential != null && this.mUser == null) {
                return new IdpResponse(this.mPendingCredential, new FirebaseUiException(5));
            }
            String providerId = this.mUser.getProviderId();
            if (AuthUI.SOCIAL_PROVIDERS.contains(providerId) && TextUtils.isEmpty(this.mToken)) {
                throw new IllegalStateException("Token cannot be null when using a non-email provider.");
            }
            if (providerId.equals("twitter.com") && TextUtils.isEmpty(this.mSecret)) {
                throw new IllegalStateException("Secret cannot be null when using the Twitter provider.");
            }
            return new IdpResponse(this.mUser, this.mToken, this.mSecret, this.mPendingCredential, this.mIsNewUser);
        }

        public Builder setNewUser(boolean z2) {
            this.mIsNewUser = z2;
            return this;
        }

        public Builder setPendingCredential(AuthCredential authCredential) {
            this.mPendingCredential = authCredential;
            return this;
        }

        public Builder setSecret(String str) {
            this.mSecret = str;
            return this;
        }

        public Builder setToken(String str) {
            this.mToken = str;
            return this;
        }

        public Builder(@NonNull IdpResponse idpResponse) {
            this.mUser = idpResponse.mUser;
            this.mToken = idpResponse.mToken;
            this.mSecret = idpResponse.mSecret;
            this.mIsNewUser = idpResponse.mIsNewUser;
            this.mPendingCredential = idpResponse.mPendingCredential;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        FirebaseUiException firebaseUiException;
        AuthCredential authCredential;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            IdpResponse idpResponse = (IdpResponse) obj;
            User user = this.mUser;
            if (user != null ? user.equals(idpResponse.mUser) : idpResponse.mUser == null) {
                String str = this.mToken;
                if (str != null ? str.equals(idpResponse.mToken) : idpResponse.mToken == null) {
                    String str2 = this.mSecret;
                    if (str2 != null ? str2.equals(idpResponse.mSecret) : idpResponse.mSecret == null) {
                        if (this.mIsNewUser == idpResponse.mIsNewUser && ((firebaseUiException = this.mException) != null ? firebaseUiException.equals(idpResponse.mException) : idpResponse.mException == null) && ((authCredential = this.mPendingCredential) != null ? authCredential.T3L().equals(idpResponse.mPendingCredential.T3L()) : idpResponse.mPendingCredential == null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @NonNull
    @RestrictTo
    public static IdpResponse from(@NonNull Exception exc) {
        if (exc instanceof FirebaseUiException) {
            return new IdpResponse((FirebaseUiException) exc);
        }
        if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
            return ((FirebaseAuthAnonymousUpgradeException) exc).getResponse();
        }
        if (exc instanceof FirebaseUiUserCollisionException) {
            FirebaseUiUserCollisionException firebaseUiUserCollisionException = (FirebaseUiUserCollisionException) exc;
            return new IdpResponse(new User.Builder(firebaseUiUserCollisionException.getProviderId(), firebaseUiUserCollisionException.getEmail()).build(), (String) null, (String) null, false, new FirebaseUiException(firebaseUiUserCollisionException.getErrorCode(), firebaseUiUserCollisionException.getMessage()), firebaseUiUserCollisionException.getCredential());
        }
        FirebaseUiException firebaseUiException = new FirebaseUiException(0, exc.getMessage());
        firebaseUiException.setStackTrace(exc.getStackTrace());
        return new IdpResponse(firebaseUiException);
    }

    @Nullable
    public static IdpResponse fromResultIntent(@Nullable Intent intent) {
        if (intent != null) {
            return (IdpResponse) intent.getParcelableExtra(gUxOLwRQBPPLC.LRgLfaEHYWLbkmc);
        }
        return null;
    }

    @Nullable
    public AuthCredential getCredentialForLinking() {
        return this.mPendingCredential;
    }

    @Nullable
    public String getEmail() {
        User user = this.mUser;
        if (user != null) {
            return user.getEmail();
        }
        return null;
    }

    @Nullable
    public FirebaseUiException getError() {
        return this.mException;
    }

    @Nullable
    public String getIdpSecret() {
        return this.mSecret;
    }

    @Nullable
    public String getIdpToken() {
        return this.mToken;
    }

    @Nullable
    public String getProviderType() {
        User user = this.mUser;
        if (user != null) {
            return user.getProviderId();
        }
        return null;
    }

    @RestrictTo
    public User getUser() {
        return this.mUser;
    }

    @Nullable
    public boolean hasCredentialForLinking() {
        return this.mPendingCredential != null;
    }

    public int hashCode() {
        User user = this.mUser;
        int iHashCode = (user == null ? 0 : user.hashCode()) * 31;
        String str = this.mToken;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mSecret;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + (this.mIsNewUser ? 1 : 0)) * 31;
        FirebaseUiException firebaseUiException = this.mException;
        int iHashCode4 = (iHashCode3 + (firebaseUiException == null ? 0 : firebaseUiException.hashCode())) * 31;
        AuthCredential authCredential = this.mPendingCredential;
        return iHashCode4 + (authCredential != null ? authCredential.T3L().hashCode() : 0);
    }

    public boolean isRecoverableErrorResponse() {
        return (this.mPendingCredential == null && getEmail() == null) ? false : true;
    }

    @RestrictTo
    public boolean isSuccessful() {
        return this.mException == null;
    }

    @NonNull
    @RestrictTo
    public Intent toIntent() {
        return new Intent().putExtra("extra_idp_response", this);
    }

    public String toString() {
        return "IdpResponse{mUser=" + this.mUser + ", mToken='" + this.mToken + "', mSecret='" + this.mSecret + "', mIsNewUser='" + this.mIsNewUser + "', mException=" + this.mException + ", mPendingCredential=" + this.mPendingCredential + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) throws Throwable {
        ObjectOutputStream objectOutputStream;
        parcel.writeParcelable(this.mUser, i2);
        parcel.writeString(this.mToken);
        parcel.writeString(this.mSecret);
        parcel.writeInt(this.mIsNewUser ? 1 : 0);
        ?? r02 = 0;
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                try {
                    objectOutputStream = new ObjectOutputStream(new ByteArrayOutputStream());
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException unused) {
            }
            try {
                objectOutputStream.writeObject(this.mException);
                FirebaseUiException firebaseUiException = this.mException;
                parcel.writeSerializable(firebaseUiException);
                objectOutputStream.close();
                r02 = firebaseUiException;
            } catch (IOException unused2) {
                objectOutputStream2 = objectOutputStream;
                FirebaseUiException firebaseUiException2 = new FirebaseUiException(0, "Exception serialization error, forced wrapping. Original: " + this.mException + ", original cause: " + this.mException.getCause());
                firebaseUiException2.setStackTrace(this.mException.getStackTrace());
                parcel.writeSerializable(firebaseUiException2);
                r02 = objectOutputStream2;
                if (objectOutputStream2 != null) {
                    objectOutputStream2.close();
                    r02 = objectOutputStream2;
                }
            } catch (Throwable th2) {
                th = th2;
                r02 = objectOutputStream;
                if (r02 != 0) {
                    try {
                        r02.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (IOException unused4) {
        }
        parcel.writeParcelable(this.mPendingCredential, 0);
    }

    @NonNull
    @RestrictTo
    public static Intent getErrorIntent(@NonNull Exception exc) {
        return from(exc).toIntent();
    }

    @NonNull
    @RestrictTo
    public Builder mutate() {
        if (isSuccessful()) {
            return new Builder(this);
        }
        throw new IllegalStateException("Cannot mutate an unsuccessful response.");
    }

    @NonNull
    @RestrictTo
    public IdpResponse withResult(AuthResult authResult) {
        return mutate().setNewUser(authResult.qm().M7()).build();
    }

    private IdpResponse(@NonNull FirebaseUiException firebaseUiException) {
        this((User) null, (String) null, (String) null, false, firebaseUiException, (AuthCredential) null);
    }

    private IdpResponse(@NonNull User user, @Nullable String str, @Nullable String str2, @Nullable AuthCredential authCredential, boolean z2) {
        this(user, str, str2, z2, (FirebaseUiException) null, authCredential);
    }

    private IdpResponse(AuthCredential authCredential, FirebaseUiException firebaseUiException) {
        this((User) null, (String) null, (String) null, false, firebaseUiException, authCredential);
    }

    private IdpResponse(User user, String str, String str2, boolean z2, FirebaseUiException firebaseUiException, AuthCredential authCredential) {
        this.mUser = user;
        this.mToken = str;
        this.mSecret = str2;
        this.mIsNewUser = z2;
        this.mException = firebaseUiException;
        this.mPendingCredential = authCredential;
    }
}
