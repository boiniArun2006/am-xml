package jS;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.credentials.CustomCredential;
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class n extends CustomCredential {
    public static final C0987n gh = new C0987n(null);
    private final String J2;
    private final String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f69443O;
    private final String Uo;
    private final String mUb;
    private final String nr;
    private final Uri xMQ;

    public static final class j {
        private Uri J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private String f69444O;
        private String Uo;
        private String nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f69446t;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f69445n = "";
        private String rl = "";

        public final j J2(String idToken) {
            Intrinsics.checkNotNullParameter(idToken, "idToken");
            this.rl = idToken;
            return this;
        }

        public final j KN(Uri uri) {
            this.J2 = uri;
            return this;
        }

        public final j O(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.f69445n = id;
            return this;
        }

        public final j Uo(String str) {
            this.Uo = str;
            return this;
        }

        public final n n() {
            return new n(this.f69445n, this.rl, this.f69446t, this.nr, this.f69444O, this.J2, this.Uo);
        }

        public final j nr(String str) {
            this.f69444O = str;
            return this;
        }

        public final j rl(String str) {
            this.f69446t = str;
            return this;
        }

        public final j t(String str) {
            this.nr = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: jS.n$n, reason: collision with other inner class name */
    public static final class C0987n {
        public final n n(Bundle data) throws GoogleIdTokenParsingException {
            Intrinsics.checkNotNullParameter(data, "data");
            try {
                String string = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
                String string2 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
                String string3 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
                String string4 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
                String string5 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
                Uri uri = Build.VERSION.SDK_INT >= 33 ? (Uri) data.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class) : (Uri) data.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
                String string6 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
                Intrinsics.checkNotNull(string);
                Intrinsics.checkNotNull(string2);
                return new n(string, string2, string3, string4, string5, uri, string6);
            } catch (Exception e2) {
                throw new GoogleIdTokenParsingException(e2);
            }
        }

        public /* synthetic */ C0987n(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public n(String id, String idToken, String str, String str2, String str3, Uri uri, String str4) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(idToken, "idToken");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(idToken, "idToken");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", id);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", idToken);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str4);
        bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle);
        this.nr = id;
        this.f69443O = idToken;
        this.J2 = str;
        this.Uo = str2;
        this.KN = str3;
        this.xMQ = uri;
        this.mUb = str4;
        if (id.length() <= 0) {
            throw new IllegalArgumentException("id should not be empty");
        }
        if (idToken.length() <= 0) {
            throw new IllegalArgumentException("idToken should not be empty");
        }
    }

    public final String t() {
        return this.f69443O;
    }
}
