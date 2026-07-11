package com.firebase.ui.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class AuthMethodPickerLayout implements Parcelable {
    public static final Parcelable.Creator<AuthMethodPickerLayout> CREATOR = new Parcelable.Creator<AuthMethodPickerLayout>() { // from class: com.firebase.ui.auth.AuthMethodPickerLayout.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthMethodPickerLayout createFromParcel(Parcel parcel) {
            return new AuthMethodPickerLayout(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthMethodPickerLayout[] newArray(int i2) {
            return new AuthMethodPickerLayout[i2];
        }
    };

    @LayoutRes
    private int mainLayout;
    private Map<String, Integer> providersButton;

    @IdRes
    private int tosPpView;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AuthMethodPickerLayout(@NonNull Parcel parcel) {
        this.tosPpView = -1;
        this.mainLayout = parcel.readInt();
        this.tosPpView = parcel.readInt();
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        this.providersButton = new HashMap();
        for (String str : bundle.keySet()) {
            this.providersButton.put(str, Integer.valueOf(bundle.getInt(str)));
        }
    }

    @LayoutRes
    public int getMainLayout() {
        return this.mainLayout;
    }

    public Map<String, Integer> getProvidersButton() {
        return this.providersButton;
    }

    @IdRes
    public int getTosPpView() {
        return this.tosPpView;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.mainLayout);
        parcel.writeInt(this.tosPpView);
        Bundle bundle = new Bundle();
        for (String str : this.providersButton.keySet()) {
            bundle.putInt(str, this.providersButton.get(str).intValue());
        }
        parcel.writeBundle(bundle);
    }
}
