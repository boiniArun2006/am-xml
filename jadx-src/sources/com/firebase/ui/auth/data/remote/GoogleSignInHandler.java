package com.firebase.ui.auth.data.remote;

import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.impl.constraints.controllers.qRl.FijIa;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.IntentRequiredException;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.data.model.User;
import com.firebase.ui.auth.data.model.UserCancellationException;
import com.firebase.ui.auth.ui.HelperActivityBase;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@RestrictTo
public class GoogleSignInHandler extends SingleProviderSignInHandler<Params> {
    private AuthUI.IdpConfig mConfig;

    @Nullable
    private String mEmail;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public static final class Params {
        private final AuthUI.IdpConfig config;

        @Nullable
        private final String email;

        public Params(AuthUI.IdpConfig idpConfig) {
            this(idpConfig, null);
        }

        public Params(AuthUI.IdpConfig idpConfig, @Nullable String str) {
            this.config = idpConfig;
            this.email = str;
        }
    }

    public GoogleSignInHandler(Application application) {
        super(application, "google.com");
    }

    private static IdpResponse createIdpResponse(GoogleSignInAccount googleSignInAccount) {
        return new IdpResponse.Builder(new User.Builder("google.com", googleSignInAccount.getEmail()).setName(googleSignInAccount.getDisplayName()).setPhotoUri(googleSignInAccount.getPhotoUrl()).build()).setToken(googleSignInAccount.getIdToken()).build();
    }

    private GoogleSignInOptions getSignInOptions() {
        GoogleSignInOptions.Builder builder = new GoogleSignInOptions.Builder((GoogleSignInOptions) this.mConfig.getParams().getParcelable("extra_google_sign_in_options"));
        if (!TextUtils.isEmpty(this.mEmail)) {
            builder.setAccountName(this.mEmail);
        }
        return builder.build();
    }

    @Override // com.firebase.ui.auth.viewmodel.ProviderSignInBase
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        if (i2 != 110) {
            return;
        }
        try {
            setResult(Resource.forSuccess(createIdpResponse(GoogleSignIn.getSignedInAccountFromIntent(intent).getResult(ApiException.class))));
        } catch (ApiException e2) {
            if (e2.getStatusCode() == 5) {
                this.mEmail = null;
                start();
                return;
            }
            if (e2.getStatusCode() == 12502) {
                start();
                return;
            }
            if (e2.getStatusCode() == 12501) {
                setResult(Resource.forFailure(new UserCancellationException()));
                return;
            }
            if (e2.getStatusCode() == 10) {
                Log.w("GoogleSignInHandler", "Developer error: this application is misconfigured. Check your SHA1 and package name in the Firebase console.");
            }
            setResult(Resource.forFailure(new FirebaseUiException(4, "Code: " + e2.getStatusCode() + FijIa.EYIybV + e2.getMessage())));
        }
    }

    private void start() {
        setResult(Resource.forLoading());
        setResult(Resource.forFailure(new IntentRequiredException(GoogleSignIn.getClient(getApplication(), getSignInOptions()).getSignInIntent(), 110)));
    }

    @Override // com.firebase.ui.auth.viewmodel.ViewModelBase
    protected void onCreate() {
        Params arguments = getArguments();
        this.mConfig = arguments.config;
        this.mEmail = arguments.email;
    }

    @Override // com.firebase.ui.auth.viewmodel.ProviderSignInBase
    public void startSignIn(@NonNull FirebaseAuth firebaseAuth, @NonNull HelperActivityBase helperActivityBase, @NonNull String str) {
        start();
    }
}
