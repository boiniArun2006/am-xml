package com.firebase.ui.auth.data.remote;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.data.model.IntentRequiredException;
import com.firebase.ui.auth.data.model.Resource;
import com.firebase.ui.auth.data.model.User;
import com.firebase.ui.auth.data.model.UserCancellationException;
import com.firebase.ui.auth.ui.email.EmailActivity;
import com.firebase.ui.auth.ui.email.EmailLinkCatcherActivity;
import com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity;
import com.firebase.ui.auth.ui.idp.SingleSignInActivity;
import com.firebase.ui.auth.ui.phone.PhoneActivity;
import com.firebase.ui.auth.viewmodel.SignInViewModelBase;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\bJ'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/firebase/ui/auth/data/remote/SignInKickstarter;", "Lcom/firebase/ui/auth/viewmodel/SignInViewModelBase;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "", "startAuthMethodChoice", "()V", "", "provider", "id", "redirectSignIn", "(Ljava/lang/String;Ljava/lang/String;)V", TtmlNode.START, "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", PangleCreativeInfo.f62498a, "Landroid/app/Application;", "auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSignInKickstarter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignInKickstarter.kt\ncom/firebase/ui/auth/data/remote/SignInKickstarter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,247:1\n1#2:248\n*E\n"})
public final class SignInKickstarter extends SignInViewModelBase {
    private final Application app;

    private final void redirectSignIn(String provider, String id) {
        if (Intrinsics.areEqual(provider, "password")) {
            setResult(Resource.forFailure(new IntentRequiredException(EmailActivity.createIntent(this.app, getArguments(), id), 106)));
        } else {
            if (!Intrinsics.areEqual(provider, "phone")) {
                setResult(Resource.forFailure(new IntentRequiredException(SingleSignInActivity.createIntent(this.app, getArguments(), new User.Builder(provider, id).build()), 109)));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("extra_phone_number", id);
            setResult(Resource.forFailure(new IntentRequiredException(PhoneActivity.createIntent(this.app, getArguments(), bundle), 107)));
        }
    }

    public SignInKickstarter(Application application) {
        super(application);
        if (application != null) {
            this.app = application;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void startAuthMethodChoice() {
        if (!getArguments().shouldShowProviderChoice()) {
            AuthUI.IdpConfig defaultOrFirstProvider = getArguments().getDefaultOrFirstProvider();
            String providerId = defaultOrFirstProvider.getProviderId();
            Intrinsics.checkNotNullExpressionValue(providerId, "getProviderId(...)");
            int iHashCode = providerId.hashCode();
            if (iHashCode != 106642798) {
                if (iHashCode != 1216985755) {
                    setResult(Resource.forFailure(new IntentRequiredException(EmailActivity.createIntent(this.app, getArguments()), 106)));
                    return;
                } else {
                    setResult(Resource.forFailure(new IntentRequiredException(EmailActivity.createIntent(this.app, getArguments()), 106)));
                    return;
                }
            }
            if (providerId.equals("phone")) {
                setResult(Resource.forFailure(new IntentRequiredException(PhoneActivity.createIntent(this.app, getArguments(), defaultOrFirstProvider.getParams()), 107)));
                return;
            }
            redirectSignIn(providerId, null);
            return;
        }
        AuthMethodPickerActivity.Companion companion = AuthMethodPickerActivity.INSTANCE;
        Application application = this.app;
        FlowParameters arguments = getArguments();
        Intrinsics.checkNotNullExpressionValue(arguments, "getArguments(...)");
        setResult(Resource.forFailure(new IntentRequiredException(companion.createIntent(application, arguments), 105)));
    }

    public final void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 105:
            case 106:
            case 107:
            case 109:
                if (resultCode != 113 && resultCode != 114) {
                    IdpResponse idpResponseFromResultIntent = IdpResponse.fromResultIntent(data);
                    if (idpResponseFromResultIntent == null) {
                        setResult(Resource.forFailure(new UserCancellationException()));
                    } else if (idpResponseFromResultIntent.isSuccessful()) {
                        setResult(Resource.forSuccess(idpResponseFromResultIntent));
                    } else {
                        FirebaseUiException error = idpResponseFromResultIntent.getError();
                        Intrinsics.checkNotNull(error);
                        if (error.getErrorCode() == 5) {
                            handleMergeFailure(idpResponseFromResultIntent);
                        } else {
                            FirebaseUiException error2 = idpResponseFromResultIntent.getError();
                            Intrinsics.checkNotNull(error2);
                            setResult(Resource.forFailure(error2));
                        }
                    }
                } else {
                    startAuthMethodChoice();
                }
                break;
            case 108:
            default:
                startAuthMethodChoice();
                break;
        }
    }

    public final void start() {
        if (!TextUtils.isEmpty(getArguments().emailLink)) {
            setResult(Resource.forFailure(new IntentRequiredException(EmailLinkCatcherActivity.createIntent(this.app, getArguments()), 106)));
        } else {
            startAuthMethodChoice();
        }
    }
}
