package com.firebase.ui.auth.util.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.R$string;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.firebase.ui.auth.util.data.ProviderUtils;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.Wre;
import com.google.firebase.auth.aC;
import com.google.firebase.auth.eO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public abstract class ProviderUtils {
    @NonNull
    public static String signInMethodToProviderId(@NonNull String str) {
        str.getClass();
        switch (str) {
            case "twitter.com":
                return "twitter.com";
            case "google.com":
                return "google.com";
            case "facebook.com":
                return "facebook.com";
            case "phone":
                return "phone";
            case "password":
                return "password";
            case "github.com":
                return "github.com";
            case "emailLink":
                return "emailLink";
            default:
                return str;
        }
    }

    public static Task<List<String>> fetchSortedProviders(@NonNull FirebaseAuth firebaseAuth, @NonNull final FlowParameters flowParameters, @NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new NullPointerException("Email cannot be empty"));
        }
        return firebaseAuth.Uo(str).continueWithTask(new Continuation<eO, Task<List<String>>>() { // from class: com.firebase.ui.auth.util.data.ProviderUtils.1
            private void reorderPriorities(List<String> list) {
                changePriority(list, "password", true);
                changePriority(list, "google.com", true);
                changePriority(list, "emailLink", false);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.gms.tasks.Continuation
            public Task<List<String>> then(@NonNull Task<eO> task) {
                List listN = task.getResult().n();
                if (listN == null) {
                    listN = new ArrayList();
                }
                ArrayList arrayList = new ArrayList(flowParameters.providers.size());
                Iterator<AuthUI.IdpConfig> it = flowParameters.providers.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getProviderId());
                }
                ArrayList arrayList2 = new ArrayList(listN.size());
                Iterator it2 = listN.iterator();
                while (it2.hasNext()) {
                    String strSignInMethodToProviderId = ProviderUtils.signInMethodToProviderId((String) it2.next());
                    if (arrayList.contains(strSignInMethodToProviderId)) {
                        arrayList2.add(0, strSignInMethodToProviderId);
                    }
                }
                if (arrayList.contains("emailLink") && listN.contains("password") && !listN.contains("emailLink")) {
                    arrayList2.add(0, ProviderUtils.signInMethodToProviderId("emailLink"));
                }
                if (task.isSuccessful() && arrayList2.isEmpty() && !listN.isEmpty()) {
                    return Tasks.forException(new FirebaseUiException(3));
                }
                reorderPriorities(arrayList2);
                return Tasks.forResult(arrayList2);
            }

            private void changePriority(List<String> list, String str2, boolean z2) {
                if (list.remove(str2)) {
                    if (z2) {
                        list.add(0, str2);
                    } else {
                        list.add(str2);
                    }
                }
            }
        });
    }

    public static Task<String> fetchTopProvider(@NonNull FirebaseAuth firebaseAuth, @NonNull FlowParameters flowParameters, @NonNull String str) {
        return fetchSortedProviders(firebaseAuth, flowParameters, str).continueWithTask(new Continuation() { // from class: ou.n
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return ProviderUtils.n(task);
            }
        });
    }

    @Nullable
    public static AuthCredential getAuthCredential(IdpResponse idpResponse) {
        if (idpResponse.hasCredentialForLinking()) {
            return idpResponse.getCredentialForLinking();
        }
        String providerType = idpResponse.getProviderType();
        providerType.getClass();
        if (!providerType.equals("google.com")) {
            if (!providerType.equals("facebook.com")) {
                return null;
            }
            return Wre.n(idpResponse.getIdpToken());
        }
        return aC.n(idpResponse.getIdpToken(), null);
    }

    @Nullable
    public static AuthUI.IdpConfig getConfigFromIdps(List<AuthUI.IdpConfig> list, String str) {
        for (AuthUI.IdpConfig idpConfig : list) {
            if (idpConfig.getProviderId().equals(str)) {
                return idpConfig;
            }
        }
        return null;
    }

    @NonNull
    public static AuthUI.IdpConfig getConfigFromIdpsOrThrow(List<AuthUI.IdpConfig> list, String str) {
        AuthUI.IdpConfig configFromIdps = getConfigFromIdps(list, str);
        if (configFromIdps != null) {
            return configFromIdps;
        }
        throw new IllegalStateException("Provider " + str + " not found.");
    }

    public static /* synthetic */ Task n(Task task) {
        if (!task.isSuccessful()) {
            return Tasks.forException(task.getException());
        }
        List list = (List) task.getResult();
        if (list.isEmpty()) {
            return Tasks.forResult(null);
        }
        return Tasks.forResult((String) list.get(0));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String providerIdToAccountType(@NonNull String str) {
        byte b2;
        switch (str.hashCode()) {
            case -1830313082:
                if (str.equals("twitter.com")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
                break;
            case -1536293812:
                if (str.equals("google.com")) {
                    b2 = 0;
                    break;
                }
                break;
            case -364826023:
                if (str.equals("facebook.com")) {
                    b2 = 1;
                    break;
                }
                break;
            case 106642798:
                if (str.equals("phone")) {
                    b2 = 4;
                    break;
                }
                break;
            case 1216985755:
                if (str.equals("password")) {
                    b2 = 5;
                    break;
                }
                break;
            case 1985010934:
                if (str.equals("github.com")) {
                    b2 = 3;
                    break;
                }
                break;
        }
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 != 2) {
                    if (b2 != 3) {
                        if (b2 != 4) {
                            return null;
                        }
                        return "https://phone.firebase";
                    }
                    return "https://github.com";
                }
                return "https://twitter.com";
            }
            return "https://www.facebook.com";
        }
        return "https://accounts.google.com";
    }

    public static String providerIdToProviderName(@NonNull String str) {
        str.getClass();
        switch (str) {
            case "twitter.com":
                return AuthUI.getApplicationContext().getString(R$string.fui_idp_name_twitter);
            case "google.com":
                return AuthUI.getApplicationContext().getString(R$string.fui_idp_name_google);
            case "facebook.com":
                return AuthUI.getApplicationContext().getString(R$string.fui_idp_name_facebook);
            case "phone":
                return AuthUI.getApplicationContext().getString(R$string.fui_idp_name_phone);
            case "password":
            case "emailLink":
                return AuthUI.getApplicationContext().getString(R$string.fui_idp_name_email);
            case "github.com":
                return AuthUI.getApplicationContext().getString(R$string.fui_idp_name_github);
            default:
                return null;
        }
    }
}
