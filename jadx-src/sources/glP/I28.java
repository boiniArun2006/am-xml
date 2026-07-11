package glP;

import QmE.iF;
import QmE.j;
import android.app.Activity;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class I28 implements Zs.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final nYs.Ml f67636n;
    private final iF rl;

    public I28(nYs.Ml getAlightSettingsUseCase, iF eventLogger) {
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f67636n = getAlightSettingsUseCase;
        this.rl = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(I28 i28, FormError formError) {
        if (formError == null) {
            i28.rl.n(j.I28.f8402n);
            return;
        }
        iF iFVar = i28.rl;
        int errorCode = formError.getErrorCode();
        String message = formError.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "getMessage(...)");
        iFVar.n(new j.Ml(errorCode, message));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(Activity activity, final I28 i28) {
        UserMessagingPlatform.loadAndShowConsentFormIfRequired(activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: glP.Ml
            @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
            public final void onConsentFormDismissed(FormError formError) {
                I28.J2(this.f67637n, formError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo(I28 i28, FormError formError) {
        String message;
        iF iFVar = i28.rl;
        int errorCode = formError != null ? formError.getErrorCode() : -1;
        if (formError == null || (message = formError.getMessage()) == null) {
            message = "null error message";
        }
        iFVar.n(new j.Ml(errorCode, message));
    }

    @Override // Zs.n
    public void n(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        nYs.j jVarInvoke = this.f67636n.invoke();
        if (jVarInvoke == null || !jVarInvoke.rl()) {
            return;
        }
        ConsentRequestParameters consentRequestParametersBuild = new ConsentRequestParameters.Builder().build();
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(activity.getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(consentInformation, "getConsentInformation(...)");
        consentInformation.requestConsentInfoUpdate(activity, consentRequestParametersBuild, new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: glP.n
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
            public final void onConsentInfoUpdateSuccess() {
                I28.O(activity, this);
            }
        }, new ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: glP.w6
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
            public final void onConsentInfoUpdateFailure(FormError formError) {
                I28.Uo(this.f67643n, formError);
            }
        });
    }
}
