package com.firebase.ui.auth.data.model;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.firebase.ui.auth.AuthMethodPickerLayout;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.util.Preconditions;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@RestrictTo
public class FlowParameters implements Parcelable {
    public static final Parcelable.Creator<FlowParameters> CREATOR = new Parcelable.Creator<FlowParameters>() { // from class: com.firebase.ui.auth.data.model.FlowParameters.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FlowParameters createFromParcel(Parcel parcel) {
            boolean z2;
            boolean z3;
            String string = parcel.readString();
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(AuthUI.IdpConfig.CREATOR);
            AuthUI.IdpConfig idpConfig = (AuthUI.IdpConfig) parcel.readParcelable(AuthUI.IdpConfig.class.getClassLoader());
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z4 = false;
            boolean z5 = true;
            boolean z6 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z2 = false;
                z4 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z5 = z2;
            }
            if (parcel.readInt() != 0) {
                z2 = z3;
            }
            return new FlowParameters(string, arrayListCreateTypedArrayList, idpConfig, i2, i3, string2, string3, z6, z4, z5, z2, parcel.readString(), (ActionCodeSettings) parcel.readParcelable(ActionCodeSettings.class.getClassLoader()), (AuthMethodPickerLayout) parcel.readParcelable(AuthMethodPickerLayout.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FlowParameters[] newArray(int i2) {
            return new FlowParameters[i2];
        }
    };
    public final boolean alwaysShowProviderChoice;

    @NonNull
    public final String appName;

    @Nullable
    public final AuthMethodPickerLayout authMethodPickerLayout;

    @Nullable
    public final AuthUI.IdpConfig defaultProvider;

    @Nullable
    public String emailLink;
    public final boolean enableAnonymousUpgrade;
    public final boolean enableCredentials;
    public final boolean lockOrientation;

    @DrawableRes
    public final int logoId;

    @Nullable
    public final ActionCodeSettings passwordResetSettings;

    @Nullable
    public final String privacyPolicyUrl;

    @NonNull
    public final List<AuthUI.IdpConfig> providers;

    @Nullable
    public final String termsOfServiceUrl;

    @StyleRes
    public final int themeId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static FlowParameters fromIntent(Intent intent) {
        return (FlowParameters) intent.getParcelableExtra(YjqZUJsVmhcjko.LdaiSxSBX);
    }

    public AuthUI.IdpConfig getDefaultOrFirstProvider() {
        AuthUI.IdpConfig idpConfig = this.defaultProvider;
        return idpConfig != null ? idpConfig : this.providers.get(0);
    }

    public boolean isAnonymousUpgradeEnabled() {
        return this.enableAnonymousUpgrade;
    }

    public boolean isPlayServicesRequired() {
        return isProviderEnabled("google.com") || this.enableCredentials;
    }

    public boolean isPrivacyPolicyUrlProvided() {
        return !TextUtils.isEmpty(this.privacyPolicyUrl);
    }

    public boolean isProviderEnabled(String str) {
        Iterator<AuthUI.IdpConfig> it = this.providers.iterator();
        while (it.hasNext()) {
            if (it.next().getProviderId().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean isSingleProviderFlow() {
        return this.providers.size() == 1;
    }

    public boolean isTermsOfServiceUrlProvided() {
        return !TextUtils.isEmpty(this.termsOfServiceUrl);
    }

    public boolean shouldShowProviderChoice() {
        if (this.defaultProvider == null) {
            return !isSingleProviderFlow() || this.alwaysShowProviderChoice;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.appName);
        parcel.writeTypedList(this.providers);
        parcel.writeParcelable(this.defaultProvider, i2);
        parcel.writeInt(this.themeId);
        parcel.writeInt(this.logoId);
        parcel.writeString(this.termsOfServiceUrl);
        parcel.writeString(this.privacyPolicyUrl);
        parcel.writeInt(this.enableCredentials ? 1 : 0);
        parcel.writeInt(this.enableAnonymousUpgrade ? 1 : 0);
        parcel.writeInt(this.alwaysShowProviderChoice ? 1 : 0);
        parcel.writeInt(this.lockOrientation ? 1 : 0);
        parcel.writeString(this.emailLink);
        parcel.writeParcelable(this.passwordResetSettings, i2);
        parcel.writeParcelable(this.authMethodPickerLayout, i2);
    }

    public FlowParameters(@NonNull String str, @NonNull List<AuthUI.IdpConfig> list, @Nullable AuthUI.IdpConfig idpConfig, @StyleRes int i2, @DrawableRes int i3, @Nullable String str2, @Nullable String str3, boolean z2, boolean z3, boolean z4, boolean z5, @Nullable String str4, @Nullable ActionCodeSettings actionCodeSettings, @Nullable AuthMethodPickerLayout authMethodPickerLayout) {
        this.appName = (String) Preconditions.checkNotNull(str, "appName cannot be null", new Object[0]);
        this.providers = Collections.unmodifiableList((List) Preconditions.checkNotNull(list, "providers cannot be null", new Object[0]));
        this.defaultProvider = idpConfig;
        this.themeId = i2;
        this.logoId = i3;
        this.termsOfServiceUrl = str2;
        this.privacyPolicyUrl = str3;
        this.enableCredentials = z2;
        this.enableAnonymousUpgrade = z3;
        this.alwaysShowProviderChoice = z4;
        this.lockOrientation = z5;
        this.emailLink = str4;
        this.passwordResetSettings = actionCodeSettings;
        this.authMethodPickerLayout = authMethodPickerLayout;
    }
}
