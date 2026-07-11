package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class AccountPicker {

    public static class AccountChooserOptions {

        @Nullable
        private Account zza;

        @Nullable
        private ArrayList zzb;

        @Nullable
        private ArrayList zzc;
        private boolean zzd;

        @Nullable
        private String zze;

        @Nullable
        private Bundle zzf;

        public static class Builder {

            @Nullable
            private Account zza;

            @Nullable
            private ArrayList zzb;

            @Nullable
            private ArrayList zzc;
            private boolean zzd = false;

            @Nullable
            private String zze;

            @Nullable
            private Bundle zzf;

            @NonNull
            public Builder setAlwaysShowAccountPicker(boolean z2) {
                this.zzd = z2;
                return this;
            }

            @NonNull
            public Builder setOptionsForAddingAccount(@Nullable Bundle bundle) {
                this.zzf = bundle;
                return this;
            }

            @NonNull
            public Builder setSelectedAccount(@Nullable Account account) {
                this.zza = account;
                return this;
            }

            @NonNull
            public Builder setTitleOverrideText(@Nullable String str) {
                this.zze = str;
                return this;
            }

            @NonNull
            public AccountChooserOptions build() {
                Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
                Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
                AccountChooserOptions accountChooserOptions = new AccountChooserOptions();
                accountChooserOptions.zzf(this.zzc);
                accountChooserOptions.zzd(this.zzb);
                accountChooserOptions.zzh(this.zzd);
                accountChooserOptions.zzl(this.zzf);
                accountChooserOptions.zzb(this.zza);
                accountChooserOptions.zzj(this.zze);
                return accountChooserOptions;
            }

            @NonNull
            public Builder setAllowableAccounts(@Nullable List<Account> list) {
                this.zzb = list == null ? null : new ArrayList(list);
                return this;
            }

            @NonNull
            public Builder setAllowableAccountsTypes(@Nullable List<String> list) {
                this.zzc = list == null ? null : new ArrayList(list);
                return this;
            }
        }

        final /* synthetic */ Account zza() {
            return this.zza;
        }

        final /* synthetic */ void zzb(Account account) {
            this.zza = account;
        }

        final /* synthetic */ ArrayList zzc() {
            return this.zzb;
        }

        final /* synthetic */ void zzd(ArrayList arrayList) {
            this.zzb = arrayList;
        }

        final /* synthetic */ ArrayList zze() {
            return this.zzc;
        }

        final /* synthetic */ void zzf(ArrayList arrayList) {
            this.zzc = arrayList;
        }

        final /* synthetic */ boolean zzg() {
            return this.zzd;
        }

        final /* synthetic */ void zzh(boolean z2) {
            this.zzd = z2;
        }

        final /* synthetic */ String zzi() {
            return this.zze;
        }

        final /* synthetic */ void zzj(String str) {
            this.zze = str;
        }

        final /* synthetic */ Bundle zzk() {
            return this.zzf;
        }

        final /* synthetic */ void zzl(Bundle bundle) {
            this.zzf = bundle;
        }
    }

    private AccountPicker() {
    }

    @NonNull
    @Deprecated
    public static Intent newChooseAccountIntent(@Nullable Account account, @Nullable ArrayList<Account> arrayList, @Nullable String[] strArr, boolean z2, @Nullable String str, @Nullable String str2, @Nullable String[] strArr2, @Nullable Bundle bundle) {
        Intent intent = new Intent();
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", strArr);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", z2);
        intent.putExtra("descriptionTextOverride", str);
        intent.putExtra("authTokenType", str2);
        intent.putExtra("addAccountRequiredFeatures", strArr2);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (String) null);
        return intent;
    }

    @NonNull
    public static Intent newChooseAccountIntent(@NonNull AccountChooserOptions accountChooserOptions) {
        Intent intent = new Intent();
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
        Preconditions.checkArgument(true, "Making the selected account non-clickable is only supported for the THEME_DAY_NIGHT_GOOGLE_MATERIAL2, THEME_LIGHT_GOOGLE_MATERIAL3, THEME_DARK_GOOGLE_MATERIAL3 or THEME_DAY_NIGHT_GOOGLE_MATERIAL3 themes");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", accountChooserOptions.zzc());
        if (accountChooserOptions.zze() != null) {
            intent.putExtra("allowableAccountTypes", (String[]) accountChooserOptions.zze().toArray(new String[0]));
        }
        intent.putExtra("addAccountOptions", accountChooserOptions.zzk());
        intent.putExtra("selectedAccount", accountChooserOptions.zza());
        intent.putExtra("selectedAccountIsNotClickable", false);
        intent.putExtra("alwaysPromptForAccount", accountChooserOptions.zzg());
        intent.putExtra("descriptionTextOverride", accountChooserOptions.zzi());
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("realClientPackage", (String) null);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (String) null);
        Bundle bundle = new Bundle();
        if (!bundle.isEmpty()) {
            intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
}
