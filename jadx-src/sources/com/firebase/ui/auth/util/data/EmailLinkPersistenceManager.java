package com.firebase.ui.auth.util.data;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.User;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.AuthCredential;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class EmailLinkPersistenceManager {
    private static final Set<String> KEYS = Collections.unmodifiableSet(new HashSet(Arrays.asList("com.firebase.ui.auth.data.client.email", "com.firebase.ui.auth.data.client.provider", "com.firebase.ui.auth.data.client.idpToken", "com.firebase.ui.auth.data.client.idpSecret")));
    private static final EmailLinkPersistenceManager instance = new EmailLinkPersistenceManager();
    private AuthCredential mCredentialForLinking;

    public static class SessionRecord {

        @Nullable
        private String mAnonymousUserId;
        private String mEmail;

        @Nullable
        private IdpResponse mIdpResponseForLinking;
        private String mSessionId;

        public String getEmail() {
            return this.mEmail;
        }

        @Nullable
        public IdpResponse getIdpResponseForLinking() {
            return this.mIdpResponseForLinking;
        }

        public String getSessionId() {
            return this.mSessionId;
        }

        public SessionRecord setEmail(@NonNull String str) {
            this.mEmail = str;
            return this;
        }

        public SessionRecord setIdpResponseForLinking(@NonNull IdpResponse idpResponse) {
            this.mIdpResponseForLinking = idpResponse;
            return this;
        }

        public SessionRecord(@NonNull String str, @Nullable String str2) {
            Preconditions.checkNotNull(str);
            this.mSessionId = str;
            this.mAnonymousUserId = str2;
        }
    }

    public static EmailLinkPersistenceManager getInstance() {
        return instance;
    }

    public void clearAllData(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.firebase.ui.auth.util.data.EmailLinkPersistenceManager", 0).edit();
        Iterator<String> it = KEYS.iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.apply();
    }

    @Nullable
    public SessionRecord retrieveSessionRecord(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.firebase.ui.auth.util.data.EmailLinkPersistenceManager", 0);
        String string = sharedPreferences.getString("com.firebase.ui.auth.data.client.email", null);
        String string2 = sharedPreferences.getString("com.firebase.ui.auth.data.client.sid", null);
        if (string == null || string2 == null) {
            return null;
        }
        String string3 = sharedPreferences.getString("com.firebase.ui.auth.data.client.auid", null);
        String string4 = sharedPreferences.getString("com.firebase.ui.auth.data.client.provider", null);
        String string5 = sharedPreferences.getString("com.firebase.ui.auth.data.client.idpToken", null);
        String string6 = sharedPreferences.getString("com.firebase.ui.auth.data.client.idpSecret", null);
        SessionRecord email = new SessionRecord(string2, string3).setEmail(string);
        if (string4 != null && (string5 != null || this.mCredentialForLinking != null)) {
            email.setIdpResponseForLinking(new IdpResponse.Builder(new User.Builder(string4, string).build()).setPendingCredential(this.mCredentialForLinking).setToken(string5).setSecret(string6).setNewUser(false).build());
        }
        this.mCredentialForLinking = null;
        return email;
    }

    public void saveEmail(@NonNull Context context, @NonNull String str, @NonNull String str2, @Nullable String str3) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(str);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.firebase.ui.auth.util.data.EmailLinkPersistenceManager", 0).edit();
        editorEdit.putString("com.firebase.ui.auth.data.client.email", str);
        editorEdit.putString("com.firebase.ui.auth.data.client.auid", str3);
        editorEdit.putString("com.firebase.ui.auth.data.client.sid", str2);
        editorEdit.apply();
    }

    public void saveIdpResponseForLinking(@NonNull Context context, @NonNull IdpResponse idpResponse) {
        if (idpResponse.hasCredentialForLinking()) {
            this.mCredentialForLinking = idpResponse.getCredentialForLinking();
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(idpResponse);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.firebase.ui.auth.util.data.EmailLinkPersistenceManager", 0).edit();
        editorEdit.putString("com.firebase.ui.auth.data.client.email", idpResponse.getEmail());
        editorEdit.putString("com.firebase.ui.auth.data.client.provider", idpResponse.getProviderType());
        editorEdit.putString("com.firebase.ui.auth.data.client.idpToken", idpResponse.getIdpToken());
        editorEdit.putString("com.firebase.ui.auth.data.client.idpSecret", idpResponse.getIdpSecret());
        editorEdit.apply();
    }
}
