package com.firebase.ui.auth.data.remote;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.facebook.Dsr;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.aC;
import com.facebook.g9s;
import com.facebook.login.LoginManager;
import com.facebook.login.Q;
import com.facebook.rv6;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.data.model.User;
import com.firebase.ui.auth.data.model.UserCancellationException;
import com.firebase.ui.auth.ui.HelperActivityBase;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class FacebookSignInHandler extends SingleProviderSignInHandler<AuthUI.IdpConfig> {
    private final aC mCallback;
    private final Dsr mCallbackManager;
    private List<String> mPermissions;

    private class Callback implements aC {
        private Callback() {
        }

        @Override // com.facebook.aC
        public void onCancel() {
            FacebookSignInHandler.this.setResult(Resource.forFailure(new UserCancellationException()));
        }

        @Override // com.facebook.aC
        public void onError(FacebookException facebookException) {
            FacebookSignInHandler.this.setResult(Resource.forFailure(new FirebaseUiException(4, facebookException)));
        }

        @Override // com.facebook.aC
        public void onSuccess(Q q2) {
            FacebookSignInHandler.this.setResult(Resource.forLoading());
            GraphRequest graphRequestTe = GraphRequest.te(q2.n(), FacebookSignInHandler.this.new ProfileRequest(q2));
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id,name,email,picture");
            graphRequestTe.T(bundle);
            graphRequestTe.qie();
        }
    }

    private class ProfileRequest implements GraphRequest.Ml {
        private final Q mResult;

        public ProfileRequest(Q q2) {
            this.mResult = q2;
        }

        @Override // com.facebook.GraphRequest.Ml
        public void onCompleted(JSONObject jSONObject, g9s g9sVar) {
            String string;
            String string2;
            FacebookRequestError facebookRequestErrorRl = g9sVar.rl();
            if (facebookRequestErrorRl != null) {
                FacebookSignInHandler.this.setResult(Resource.forFailure(new FirebaseUiException(4, facebookRequestErrorRl.getException())));
                return;
            }
            if (jSONObject == null) {
                FacebookSignInHandler.this.setResult(Resource.forFailure(new FirebaseUiException(4, "Facebook graph request failed")));
                return;
            }
            Uri uri = null;
            try {
                string = jSONObject.getString(Scopes.EMAIL);
            } catch (JSONException unused) {
                string = null;
            }
            try {
                string2 = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            } catch (JSONException unused2) {
                string2 = null;
            }
            try {
                uri = Uri.parse(jSONObject.getJSONObject("picture").getJSONObject("data").getString("url"));
            } catch (JSONException unused3) {
            }
            FacebookSignInHandler.this.setResult(Resource.forSuccess(FacebookSignInHandler.createIdpResponse(this.mResult, string, string2, uri)));
        }
    }

    public FacebookSignInHandler(Application application) {
        super(application, "facebook.com");
        this.mCallback = new Callback();
        this.mCallbackManager = Dsr.j.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IdpResponse createIdpResponse(Q q2, @Nullable String str, String str2, Uri uri) {
        return new IdpResponse.Builder(new User.Builder("facebook.com", str).setName(str2).setPhotoUri(uri).build()).setToken(q2.n().getToken()).build();
    }

    @Override // com.firebase.ui.auth.viewmodel.ProviderSignInBase
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        this.mCallbackManager.onActivityResult(i2, i3, intent);
    }

    @Override // com.firebase.ui.auth.viewmodel.ViewModelBase, androidx.view.ViewModel
    protected void onCleared() {
        super.onCleared();
        LoginManager.xMQ().WPU(this.mCallbackManager);
    }

    @Override // com.firebase.ui.auth.viewmodel.ViewModelBase
    protected void onCreate() {
        Collection stringArrayList = getArguments().getParams().getStringArrayList("extra_facebook_permissions");
        if (stringArrayList == null) {
            stringArrayList = Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(stringArrayList);
        if (!arrayList.contains(Scopes.EMAIL)) {
            arrayList.add(Scopes.EMAIL);
        }
        if (!arrayList.contains("public_profile")) {
            arrayList.add("public_profile");
        }
        this.mPermissions = arrayList;
        LoginManager.xMQ().ck(this.mCallbackManager, this.mCallback);
    }

    @Override // com.firebase.ui.auth.viewmodel.ProviderSignInBase
    public void startSignIn(@NonNull FirebaseAuth firebaseAuth, @NonNull HelperActivityBase helperActivityBase, @NonNull String str) {
        rv6.n(helperActivityBase.getFlowParams().themeId);
        LoginManager.xMQ().qie(helperActivityBase, this.mPermissions);
    }
}
