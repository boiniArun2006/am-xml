package com.firebase.ui.auth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.util.Preconditions;
import com.firebase.ui.auth.util.data.ProviderAvailability;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Scope;
import com.google.firebase.Wre;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class AuthUI {
    private static Context sApplicationContext;
    private final Wre mApp;
    private final FirebaseAuth mAuth;
    private String mEmulatorHost = null;
    private int mEmulatorPort = -1;
    public static final Set<String> SUPPORTED_PROVIDERS = Collections.unmodifiableSet(new HashSet(Arrays.asList("google.com", "facebook.com", "twitter.com", "github.com", "password", "phone", dpcnwfoVOnrtRA.LIDSeevaeJxiz, "emailLink")));
    public static final Set<String> SUPPORTED_OAUTH_PROVIDERS = Collections.unmodifiableSet(new HashSet(Arrays.asList("microsoft.com", "yahoo.com", "apple.com", "twitter.com", "github.com")));

    @RestrictTo
    public static final Set<String> SOCIAL_PROVIDERS = Collections.unmodifiableSet(new HashSet(Arrays.asList("google.com", "facebook.com")));
    private static final IdentityHashMap<Wre, AuthUI> INSTANCES = new IdentityHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public abstract class AuthIntentBuilder<T extends AuthIntentBuilder> {
        boolean mAlwaysShowProviderChoice;
        AuthMethodPickerLayout mAuthMethodPickerLayout;
        IdpConfig mDefaultProvider;
        boolean mEnableCredentials;
        boolean mLockOrientation;
        int mLogo;
        ActionCodeSettings mPasswordSettings;
        String mPrivacyPolicyUrl;
        final List<IdpConfig> mProviders;
        int mTheme;
        String mTosUrl;

        protected abstract FlowParameters getFlowParams();

        @NonNull
        public T setAvailableProviders(@NonNull List<IdpConfig> list) {
            Preconditions.checkNotNull(list, "idpConfigs cannot be null", new Object[0]);
            if (list.size() == 1 && list.get(0).getProviderId().equals("anonymous")) {
                throw new IllegalStateException("Sign in as guest cannot be the only sign in method. In this case, sign the user in anonymously your self; no UI is needed.");
            }
            this.mProviders.clear();
            for (IdpConfig idpConfig : list) {
                if (this.mProviders.contains(idpConfig)) {
                    throw new IllegalArgumentException("Each provider can only be set once. " + idpConfig.getProviderId() + " was set twice.");
                }
                this.mProviders.add(idpConfig);
            }
            return this;
        }

        private AuthIntentBuilder() {
            this.mProviders = new ArrayList();
            this.mDefaultProvider = null;
            this.mLogo = -1;
            this.mTheme = AuthUI.getDefaultTheme();
            this.mAlwaysShowProviderChoice = false;
            this.mLockOrientation = false;
            this.mEnableCredentials = true;
            this.mAuthMethodPickerLayout = null;
            this.mPasswordSettings = null;
        }

        @NonNull
        @CallSuper
        public Intent build() {
            if (this.mProviders.isEmpty()) {
                this.mProviders.add(new IdpConfig.EmailBuilder().build());
            }
            return KickoffActivity.createIntent(AuthUI.this.mApp.qie(), getFlowParams());
        }

        @NonNull
        public T setCredentialManagerEnabled(boolean z2) {
            this.mEnableCredentials = z2;
            return this;
        }

        @NonNull
        public T setLogo(@DrawableRes int i2) {
            this.mLogo = i2;
            return this;
        }

        @NonNull
        public T setTheme(@StyleRes int i2) {
            this.mTheme = Preconditions.checkValidStyle(AuthUI.this.mApp.qie(), i2, "theme identifier is unknown or not a style definition", new Object[0]);
            return this;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class IdpConfig implements Parcelable {
        public static final Parcelable.Creator<IdpConfig> CREATOR = new Parcelable.Creator<IdpConfig>() { // from class: com.firebase.ui.auth.AuthUI.IdpConfig.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public IdpConfig createFromParcel(Parcel parcel) {
                return new IdpConfig(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public IdpConfig[] newArray(int i2) {
                return new IdpConfig[i2];
            }
        };
        private final Bundle mParams;
        private final String mProviderId;

        public static class Builder {
            private final Bundle mParams = new Bundle();
            private String mProviderId;

            @NonNull
            @CallSuper
            public IdpConfig build() {
                return new IdpConfig(this.mProviderId, this.mParams);
            }

            @NonNull
            @RestrictTo
            protected final Bundle getParams() {
                return this.mParams;
            }

            @RestrictTo
            protected void setProviderId(@NonNull String str) {
                this.mProviderId = str;
            }

            protected Builder(@NonNull String str) {
                if (!AuthUI.SUPPORTED_PROVIDERS.contains(str) && !AuthUI.SUPPORTED_OAUTH_PROVIDERS.contains(str)) {
                    throw new IllegalArgumentException("Unknown provider: " + str);
                }
                this.mProviderId = str;
            }
        }

        public static final class EmailBuilder extends Builder {
            public EmailBuilder() {
                super("password");
            }

            @NonNull
            public EmailBuilder enableEmailLinkSignIn() {
                setProviderId("emailLink");
                return this;
            }

            @Override // com.firebase.ui.auth.AuthUI.IdpConfig.Builder
            public IdpConfig build() {
                if (((Builder) this).mProviderId.equals("emailLink")) {
                    ActionCodeSettings actionCodeSettings = (ActionCodeSettings) getParams().getParcelable("action_code_settings");
                    Preconditions.checkNotNull(actionCodeSettings, "ActionCodeSettings cannot be null when using email link sign in.", new Object[0]);
                    if (!actionCodeSettings.T3L()) {
                        throw new IllegalStateException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                    }
                }
                return super.build();
            }

            @NonNull
            public EmailBuilder setActionCodeSettings(ActionCodeSettings actionCodeSettings) {
                getParams().putParcelable("action_code_settings", actionCodeSettings);
                return this;
            }
        }

        public static final class FacebookBuilder extends Builder {
            public FacebookBuilder() {
                super("facebook.com");
                if (!ProviderAvailability.IS_FACEBOOK_AVAILABLE) {
                    throw new RuntimeException("Facebook provider cannot be configured without dependency. Did you forget to add 'com.facebook.android:facebook-login:VERSION' dependency?");
                }
                Preconditions.checkConfigured(AuthUI.getApplicationContext(), "Facebook provider unconfigured. Make sure to add a `facebook_application_id` string. See the docs for more info: https://github.com/firebase/FirebaseUI-Android/blob/master/auth/README.md#facebook", R$string.facebook_application_id);
                if (AuthUI.getApplicationContext().getString(R$string.facebook_login_protocol_scheme).equals("fbYOUR_APP_ID")) {
                    Log.w("FacebookBuilder", "Facebook provider unconfigured for Chrome Custom Tabs.");
                }
            }
        }

        public static final class GoogleBuilder extends Builder {
            public GoogleBuilder() {
                super("google.com");
            }

            @NonNull
            public GoogleBuilder setScopes(@NonNull List<String> list) {
                GoogleSignInOptions.Builder builderRequestEmail = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail();
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    builderRequestEmail.requestScopes(new Scope(it.next()), new Scope[0]);
                }
                return setSignInOptions(builderRequestEmail.build());
            }

            private void validateWebClientId() {
                Preconditions.checkConfigured(AuthUI.getApplicationContext(), "Check your google-services plugin configuration, the default_web_client_id string wasn't populated.", R$string.default_web_client_id);
            }

            @Override // com.firebase.ui.auth.AuthUI.IdpConfig.Builder
            @NonNull
            public IdpConfig build() {
                if (!getParams().containsKey("extra_google_sign_in_options")) {
                    validateWebClientId();
                    setScopes(Collections.EMPTY_LIST);
                }
                return super.build();
            }

            @NonNull
            public GoogleBuilder setSignInOptions(@NonNull GoogleSignInOptions googleSignInOptions) {
                Preconditions.checkUnset(getParams(), "Cannot overwrite previously set sign-in options.", "extra_google_sign_in_options");
                GoogleSignInOptions.Builder builder = new GoogleSignInOptions.Builder(googleSignInOptions);
                String serverClientId = googleSignInOptions.getServerClientId();
                if (serverClientId == null) {
                    validateWebClientId();
                    serverClientId = AuthUI.getApplicationContext().getString(R$string.default_web_client_id);
                }
                Iterator<Scope> it = googleSignInOptions.getScopes().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (Scopes.EMAIL.equals(it.next().getScopeUri())) {
                            break;
                        }
                    } else {
                        Log.w("AuthUI", "The GoogleSignInOptions passed to setSignInOptions does not request the 'email' scope. In most cases this is a mistake! Call requestEmail() on the GoogleSignInOptions object.");
                        break;
                    }
                }
                builder.requestIdToken(serverClientId);
                getParams().putParcelable("extra_google_sign_in_options", builder.build());
                return this;
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static class GenericOAuthProviderBuilder extends Builder {
            public GenericOAuthProviderBuilder(@NonNull String str, @NonNull String str2, int i2) {
                super(str);
                Preconditions.checkNotNull(str, "The provider ID cannot be null.", new Object[0]);
                Preconditions.checkNotNull(str2, "The provider name cannot be null.", new Object[0]);
                getParams().putString("generic_oauth_provider_id", str);
                getParams().putString("generic_oauth_provider_name", str2);
                getParams().putInt("generic_oauth_button_id", i2);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || IdpConfig.class != obj.getClass()) {
                return false;
            }
            return this.mProviderId.equals(((IdpConfig) obj).mProviderId);
        }

        @NonNull
        public Bundle getParams() {
            return new Bundle(this.mParams);
        }

        @NonNull
        public String getProviderId() {
            return this.mProviderId;
        }

        public final int hashCode() {
            return this.mProviderId.hashCode();
        }

        public String toString() {
            return "IdpConfig{mProviderId='" + this.mProviderId + "', mParams=" + this.mParams + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.mProviderId);
            parcel.writeBundle(this.mParams);
        }

        private IdpConfig(@NonNull String str, @NonNull Bundle bundle) {
            this.mProviderId = str;
            this.mParams = new Bundle(bundle);
        }

        private IdpConfig(Parcel parcel) {
            this.mProviderId = parcel.readString();
            this.mParams = parcel.readBundle(IdpConfig.class.getClassLoader());
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public final class SignInIntentBuilder extends AuthIntentBuilder<SignInIntentBuilder> {
        private String mEmailLink;
        private boolean mEnableAnonymousUpgrade;

        private SignInIntentBuilder() {
            super();
        }

        @Override // com.firebase.ui.auth.AuthUI.AuthIntentBuilder
        protected FlowParameters getFlowParams() {
            return new FlowParameters(AuthUI.this.mApp.HI(), this.mProviders, this.mDefaultProvider, this.mTheme, this.mLogo, this.mTosUrl, this.mPrivacyPolicyUrl, this.mEnableCredentials, this.mEnableAnonymousUpgrade, this.mAlwaysShowProviderChoice, this.mLockOrientation, this.mEmailLink, this.mPasswordSettings, this.mAuthMethodPickerLayout);
        }

        @NonNull
        public SignInIntentBuilder setEmailLink(@NonNull String str) {
            this.mEmailLink = str;
            return this;
        }

        @Override // com.firebase.ui.auth.AuthUI.AuthIntentBuilder
        @NonNull
        @CallSuper
        public /* bridge */ /* synthetic */ Intent build() {
            return super.build();
        }

        @Override // com.firebase.ui.auth.AuthUI.AuthIntentBuilder
        @NonNull
        public /* bridge */ /* synthetic */ AuthIntentBuilder setAvailableProviders(@NonNull List list) {
            return super.setAvailableProviders(list);
        }

        @Override // com.firebase.ui.auth.AuthUI.AuthIntentBuilder
        @NonNull
        public /* bridge */ /* synthetic */ AuthIntentBuilder setCredentialManagerEnabled(boolean z2) {
            return super.setCredentialManagerEnabled(z2);
        }

        @Override // com.firebase.ui.auth.AuthUI.AuthIntentBuilder
        @NonNull
        public /* bridge */ /* synthetic */ AuthIntentBuilder setLogo(@DrawableRes int i2) {
            return super.setLogo(i2);
        }

        @Override // com.firebase.ui.auth.AuthUI.AuthIntentBuilder
        @NonNull
        public /* bridge */ /* synthetic */ AuthIntentBuilder setTheme(@StyleRes int i2) {
            return super.setTheme(i2);
        }
    }

    @NonNull
    public static AuthUI getInstance() {
        return getInstance(Wre.az());
    }

    @RestrictTo
    public static void setApplicationContext(@NonNull Context context) {
        sApplicationContext = ((Context) Preconditions.checkNotNull(context, "App context cannot be null.", new Object[0])).getApplicationContext();
    }

    public static boolean canHandleIntent(@NonNull Intent intent) {
        if (intent == null || intent.getData() == null) {
            return false;
        }
        return FirebaseAuth.getInstance().HI(intent.getData().toString());
    }

    @NonNull
    @RestrictTo
    public static Context getApplicationContext() {
        return sApplicationContext;
    }

    @StyleRes
    public static int getDefaultTheme() {
        return R$style.FirebaseUI_DefaultMaterialTheme;
    }

    @NonNull
    public static AuthUI getInstance(@NonNull String str) {
        return getInstance(Wre.ty(str));
    }

    @NonNull
    public SignInIntentBuilder createSignInIntentBuilder() {
        return new SignInIntentBuilder();
    }

    @NonNull
    @RestrictTo
    public Wre getApp() {
        return this.mApp;
    }

    @NonNull
    @RestrictTo
    public FirebaseAuth getAuth() {
        return this.mAuth;
    }

    @RestrictTo
    public String getEmulatorHost() {
        return this.mEmulatorHost;
    }

    @RestrictTo
    public int getEmulatorPort() {
        return this.mEmulatorPort;
    }

    @RestrictTo
    public boolean isUseEmulator() {
        return this.mEmulatorHost != null && this.mEmulatorPort >= 0;
    }

    private AuthUI(Wre wre) {
        this.mApp = wre;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(wre);
        this.mAuth = firebaseAuth;
        try {
            firebaseAuth.Z("9.1.1");
        } catch (Exception e2) {
            Log.e("AuthUI", "Couldn't set the FUI version.", e2);
        }
        this.mAuth.g();
    }

    @NonNull
    public static AuthUI getInstance(@NonNull Wre wre) {
        AuthUI authUI;
        if (ProviderAvailability.IS_TWITTER_AVAILABLE) {
            Log.w("AuthUI", String.format("Beginning with FirebaseUI 6.2.0 you no longer need to include %s to sign in with %s. Go to %s for more information", "the TwitterKit SDK", "Twitter", "https://github.com/firebase/FirebaseUI-Android/releases/tag/6.2.0"));
        }
        if (ProviderAvailability.IS_GITHUB_AVAILABLE) {
            Log.w("AuthUI", String.format("Beginning with FirebaseUI 6.2.0 you no longer need to include %s to sign in with %s. Go to %s for more information", "com.firebaseui:firebase-ui-auth-github", "GitHub", "https://github.com/firebase/FirebaseUI-Android/releases/tag/6.2.0"));
        }
        IdentityHashMap<Wre, AuthUI> identityHashMap = INSTANCES;
        synchronized (identityHashMap) {
            try {
                authUI = identityHashMap.get(wre);
                if (authUI == null) {
                    authUI = new AuthUI(wre);
                    identityHashMap.put(wre, authUI);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return authUI;
    }
}
