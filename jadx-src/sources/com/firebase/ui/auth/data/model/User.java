package com.firebase.ui.auth.data.model;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class User implements Parcelable {
    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() { // from class: com.firebase.ui.auth.data.model.User.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public User createFromParcel(Parcel parcel) {
            return new User(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(Uri.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public User[] newArray(int i2) {
            return new User[i2];
        }
    };
    private final String mEmail;
    private final String mName;
    private final String mPhoneNumber;
    private final Uri mPhotoUri;
    private final String mProviderId;

    @RestrictTo
    public static class Builder {
        private String mEmail;
        private String mName;
        private String mPhoneNumber;
        private Uri mPhotoUri;
        private String mProviderId;

        public User build() {
            return new User(this.mProviderId, this.mEmail, this.mPhoneNumber, this.mName, this.mPhotoUri);
        }

        public Builder setName(String str) {
            this.mName = str;
            return this;
        }

        public Builder setPhoneNumber(String str) {
            this.mPhoneNumber = str;
            return this;
        }

        public Builder setPhotoUri(Uri uri) {
            this.mPhotoUri = uri;
            return this;
        }

        public Builder(@NonNull String str, @Nullable String str2) {
            this.mProviderId = str;
            this.mEmail = str2;
        }
    }

    public static User getUser(Intent intent) {
        return (User) intent.getParcelableExtra("extra_user");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            User user = (User) obj;
            if (this.mProviderId.equals(user.mProviderId) && ((str = this.mEmail) != null ? str.equals(user.mEmail) : user.mEmail == null) && ((str2 = this.mPhoneNumber) != null ? str2.equals(user.mPhoneNumber) : user.mPhoneNumber == null) && ((str3 = this.mName) != null ? str3.equals(user.mName) : user.mName == null)) {
                Uri uri = this.mPhotoUri;
                Uri uri2 = user.mPhotoUri;
                if (uri != null ? uri.equals(uri2) : uri2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    private User(String str, String str2, String str3, String str4, Uri uri) {
        this.mProviderId = str;
        this.mEmail = str2;
        this.mPhoneNumber = str3;
        this.mName = str4;
        this.mPhotoUri = uri;
    }

    public static User getUser(Bundle bundle) {
        return (User) bundle.getParcelable("extra_user");
    }

    @Nullable
    public String getEmail() {
        return this.mEmail;
    }

    @Nullable
    public String getName() {
        return this.mName;
    }

    @Nullable
    public Uri getPhotoUri() {
        return this.mPhotoUri;
    }

    @NonNull
    public String getProviderId() {
        return this.mProviderId;
    }

    public int hashCode() {
        int iHashCode = this.mProviderId.hashCode() * 31;
        String str = this.mEmail;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mPhoneNumber;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Uri uri = this.mPhotoUri;
        return iHashCode4 + (uri != null ? uri.hashCode() : 0);
    }

    public String toString() {
        return "User{mProviderId='" + this.mProviderId + "', mEmail='" + this.mEmail + "', mPhoneNumber='" + this.mPhoneNumber + "', mName='" + this.mName + "', mPhotoUri=" + this.mPhotoUri + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        parcel.writeString(this.mProviderId);
        parcel.writeString(this.mEmail);
        parcel.writeString(this.mPhoneNumber);
        parcel.writeString(this.mName);
        parcel.writeParcelable(this.mPhotoUri, i2);
    }
}
