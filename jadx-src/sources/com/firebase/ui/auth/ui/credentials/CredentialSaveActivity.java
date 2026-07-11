package com.firebase.ui.auth.ui.credentials;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.view.ViewModelProvider;
import c8G.Fsz.qwlyMfUJj;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.ui.HelperActivityBase;
import com.firebase.ui.auth.ui.InvisibleActivityBase;
import com.firebase.ui.auth.viewmodel.ResourceObserver;
import com.firebase.ui.auth.viewmodel.credentialmanager.CredentialManagerHandler;
import com.google.android.gms.common.Scopes;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/firebase/ui/auth/ui/credentials/CredentialSaveActivity;", "Lcom/firebase/ui/auth/ui/InvisibleActivityBase;", "<init>", "()V", "credentialManagerHandler", "Lcom/firebase/ui/auth/viewmodel/credentialmanager/CredentialManagerHandler;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCredentialSaveActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CredentialSaveActivity.kt\ncom/firebase/ui/auth/ui/credentials/CredentialSaveActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
public final class CredentialSaveActivity extends InvisibleActivityBase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private CredentialManagerHandler credentialManagerHandler;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/firebase/ui/auth/ui/credentials/CredentialSaveActivity$Companion;", "", "<init>", "()V", "TAG", "", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "flowParams", "Lcom/firebase/ui/auth/data/model/FlowParameters;", Scopes.EMAIL, "password", "response", "Lcom/firebase/ui/auth/IdpResponse;", "auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent createIntent(Context context, FlowParameters flowParams, String email, String password, IdpResponse response) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(flowParams, "flowParams");
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(response, "response");
            Intent intentCreateBaseIntent = HelperActivityBase.createBaseIntent(context, CredentialSaveActivity.class, flowParams);
            intentCreateBaseIntent.putExtra("extra_email", email);
            intentCreateBaseIntent.putExtra("extra_password", password);
            intentCreateBaseIntent.putExtra("extra_idp_response", response);
            Intrinsics.checkNotNullExpressionValue(intentCreateBaseIntent, "apply(...)");
            return intentCreateBaseIntent;
        }
    }

    @JvmStatic
    public static final Intent createIntent(Context context, FlowParameters flowParameters, String str, String str2, IdpResponse idpResponse) {
        return INSTANCE.createIntent(context, flowParameters, str, str2, idpResponse);
    }

    @Override // com.firebase.ui.auth.ui.InvisibleActivityBase, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        String email;
        super.onCreate(savedInstanceState);
        final IdpResponse idpResponse = (IdpResponse) getIntent().getParcelableExtra("extra_idp_response");
        String stringExtra = getIntent().getStringExtra(qwlyMfUJj.wZjRFTNAqs);
        String stringExtra2 = getIntent().getStringExtra("extra_password");
        CredentialManagerHandler credentialManagerHandler = (CredentialManagerHandler) new ViewModelProvider(this).n(CredentialManagerHandler.class);
        credentialManagerHandler.init(getFlowParams());
        if (idpResponse != null) {
            credentialManagerHandler.setResponse(idpResponse);
        }
        credentialManagerHandler.getOperation().mUb(this, new ResourceObserver<IdpResponse>() { // from class: com.firebase.ui.auth.ui.credentials.CredentialSaveActivity$onCreate$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this.this$0);
            }

            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            protected void onFailure(Exception e2) {
                Intrinsics.checkNotNullParameter(e2, "e");
                IdpResponse idpResponse2 = idpResponse;
                if (idpResponse2 != null) {
                    this.this$0.finish(-1, idpResponse2.toIntent());
                } else {
                    this.this$0.finish(-1, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.firebase.ui.auth.viewmodel.ResourceObserver
            public void onSuccess(IdpResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                this.this$0.finish(-1, response.toIntent());
            }
        });
        this.credentialManagerHandler = credentialManagerHandler;
        CredentialManagerHandler credentialManagerHandler2 = null;
        if (credentialManagerHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("credentialManagerHandler");
            credentialManagerHandler = null;
        }
        if (((Resource) credentialManagerHandler.getOperation().J2()) == null) {
            Log.d("CredentialSaveActivity", "Launching save operation.");
            FirebaseUser firebaseUserXMQ = FirebaseAuth.getInstance().xMQ();
            if (firebaseUserXMQ != null && (email = firebaseUserXMQ.getEmail()) != null) {
                stringExtra = email;
            }
            CredentialManagerHandler credentialManagerHandler3 = this.credentialManagerHandler;
            if (credentialManagerHandler3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("credentialManagerHandler");
            } else {
                credentialManagerHandler2 = credentialManagerHandler3;
            }
            credentialManagerHandler2.saveCredentials(this, firebaseUserXMQ, stringExtra, stringExtra2);
            return;
        }
        Log.d("CredentialSaveActivity", "Save operation in progress, doing nothing.");
    }
}
