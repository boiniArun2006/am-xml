package com.firebase.ui.auth.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.ComponentActivity;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.ui.credentials.CredentialSaveActivity;
import com.firebase.ui.auth.util.Preconditions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public abstract class HelperActivityBase extends AppCompatActivity implements ProgressView {
    private FlowParameters mParams;

    public static void safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(ComponentActivity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Intent createBaseIntent(@NonNull Context context, @NonNull Class<? extends Activity> cls, @NonNull FlowParameters flowParameters) {
        Intent intentPutExtra = new Intent((Context) Preconditions.checkNotNull(context, "context cannot be null", new Object[0]), (Class<?>) Preconditions.checkNotNull(cls, "target activity cannot be null", new Object[0])).putExtra("extra_flow_params", (Parcelable) Preconditions.checkNotNull(flowParameters, "flowParams cannot be null", new Object[0]));
        intentPutExtra.setExtrasClassLoader(AuthUI.class.getClassLoader());
        return intentPutExtra;
    }

    public FlowParameters getFlowParams() {
        if (this.mParams == null) {
            this.mParams = FlowParameters.fromIntent(getIntent());
        }
        return this.mParams;
    }

    public void finish(int i2, @Nullable Intent intent) {
        setResult(i2, intent);
        finish();
    }

    public FirebaseAuth getAuth() {
        return getAuthUI().getAuth();
    }

    public AuthUI getAuthUI() {
        return AuthUI.getInstance(getFlowParams().appName);
    }

    protected boolean isOffline() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getApplicationContext().getSystemService("connectivity");
        if (connectivityManager != null && connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting()) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 != 102 && i3 != 5) {
            return;
        }
        finish(i3, intent);
    }

    public void startSaveCredentials(FirebaseUser firebaseUser, IdpResponse idpResponse, @Nullable String str) {
        String email = firebaseUser.getEmail();
        if (email == null) {
            email = firebaseUser.getPhoneNumber();
        }
        safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(this, CredentialSaveActivity.createIntent(this, getFlowParams(), email, str, idpResponse), 102);
    }
}
