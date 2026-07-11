package com.firebase.ui.auth.viewmodel.credentialmanager;

import GJW.C;
import GJW.vd;
import android.app.Application;
import android.content.Context;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CreatePasswordRequest;
import androidx.credentials.CredentialManager;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.view.ViewModelKt;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.util.GoogleApiUtils;
import com.firebase.ui.auth.viewmodel.AuthViewModelBase;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.common.Scopes;
import com.google.firebase.auth.FirebaseUser;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002J,\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/firebase/ui/auth/viewmodel/credentialmanager/CredentialManagerHandler;", "Lcom/firebase/ui/auth/viewmodel/AuthViewModelBase;", "Lcom/firebase/ui/auth/IdpResponse;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "credentialManager", "Landroidx/credentials/CredentialManager;", "response", "setResponse", "", "newResponse", "saveCredentials", "context", "Landroid/content/Context;", "firebaseUser", "Lcom/google/firebase/auth/FirebaseUser;", Scopes.EMAIL, "", "password", "auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CredentialManagerHandler extends AuthViewModelBase<IdpResponse> {
    private final CredentialManager credentialManager;
    private IdpResponse response;

    /* JADX INFO: renamed from: com.firebase.ui.auth.viewmodel.credentialmanager.CredentialManagerHandler$saveCredentials$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.firebase.ui.auth.viewmodel.credentialmanager.CredentialManagerHandler$saveCredentials$1", f = "CredentialManagerHandler.kt", i = {}, l = {TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ CreatePasswordRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, CreatePasswordRequest createPasswordRequest, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$request = createPasswordRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CredentialManagerHandler.this.new AnonymousClass1(this.$context, this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    CredentialManager credentialManager = CredentialManagerHandler.this.credentialManager;
                    Context context = this.$context;
                    CreatePasswordRequest createPasswordRequest = this.$request;
                    this.label = 1;
                    obj = credentialManager.J2(context, createPasswordRequest, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (((CreateCredentialResponse) obj) == null) {
                    CredentialManagerHandler.this.setResult(Resource.forFailure(new FirebaseUiException(0, "Received null response from Credential Manager.")));
                } else {
                    CredentialManagerHandler credentialManagerHandler = CredentialManagerHandler.this;
                    IdpResponse idpResponse = credentialManagerHandler.response;
                    Intrinsics.checkNotNull(idpResponse);
                    credentialManagerHandler.setResult(Resource.forSuccess(idpResponse));
                }
            } catch (CreateCredentialException e2) {
                CredentialManagerHandler.this.setResult(Resource.forFailure(new FirebaseUiException(0, "Error saving credential with Credential Manager.", e2)));
            } catch (Exception e3) {
                CredentialManagerHandler.this.setResult(Resource.forFailure(new FirebaseUiException(0, "Unexpected error saving credential.", e3)));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialManagerHandler(Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        CredentialManager credentialManager = GoogleApiUtils.getCredentialManager(application);
        Intrinsics.checkNotNullExpressionValue(credentialManager, "getCredentialManager(...)");
        this.credentialManager = credentialManager;
    }

    public final void saveCredentials(Context context, FirebaseUser firebaseUser, String email, String password) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!getArguments().enableCredentials) {
            IdpResponse idpResponse = this.response;
            Intrinsics.checkNotNull(idpResponse);
            setResult(Resource.forSuccess(idpResponse));
            return;
        }
        setResult(Resource.forLoading());
        if (firebaseUser == null || email == null || email.length() == 0 || password == null || password.length() == 0) {
            setResult(Resource.forFailure(new FirebaseUiException(0, "Invalid FirebaseUser or missing email/password.")));
        } else {
            C.nr(ViewModelKt.n(this), null, null, new AnonymousClass1(context, new CreatePasswordRequest(email, password, null, false, false, 28, null), null), 3, null);
        }
    }

    public final void setResponse(IdpResponse newResponse) {
        Intrinsics.checkNotNullParameter(newResponse, "newResponse");
        this.response = newResponse;
    }
}
