package jS;

import android.os.Bundle;
import androidx.credentials.GetCustomCredentialOption;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class j extends GetCustomCredentialOption {
    public static final n ck = new n(null);
    private final boolean HI;
    private final List az;
    private final boolean gh;
    private final String mUb;
    private final String qie;
    private final boolean ty;
    private final String xMQ;

    /* JADX INFO: renamed from: jS.j$j, reason: collision with other inner class name */
    public static final class C0986j {
        private boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private boolean f69440O;
        private List Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f69441n = "";
        private boolean nr = true;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f69442t;

        public final j n() {
            return new j(this.f69441n, this.f69442t, this.nr, this.rl, this.Uo, this.f69440O, this.J2);
        }

        public final C0986j rl(boolean z2) {
            this.nr = z2;
            return this;
        }

        public final C0986j t(String serverClientId) {
            Intrinsics.checkNotNullParameter(serverClientId, "serverClientId");
            if (serverClientId.length() <= 0) {
                throw new IllegalArgumentException("serverClientId should not be empty");
            }
            this.f69441n = serverClientId;
            return this;
        }
    }

    public static final class n {
        public static final Bundle n(String serverClientId, String str, boolean z2, String str2, List list, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(serverClientId, "serverClientId");
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_SERVER_CLIENT_ID", serverClientId);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_NONCE", str);
            bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS", z2);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_LINKED_SERVICE_ID", str2);
            bundle.putStringArrayList("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES", list == null ? null : new ArrayList<>(list));
            bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER", z3);
            bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_AUTO_SELECT_ENABLED", z4);
            return bundle;
        }

        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String serverClientId, String str, boolean z2, String str2, List list, boolean z3, boolean z4) {
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", n.n(serverClientId, str, z2, str2, list, z3, z4), n.n(serverClientId, str, z2, str2, list, z3, z4), true, z4, null, 500, 32, null);
        Intrinsics.checkNotNullParameter(serverClientId, "serverClientId");
        this.xMQ = serverClientId;
        this.mUb = str;
        this.gh = z2;
        this.qie = str2;
        this.az = list;
        this.ty = z3;
        this.HI = z4;
        if (serverClientId.length() <= 0) {
            throw new IllegalArgumentException("serverClientId should not be empty");
        }
        if (z2 && z3) {
            throw new IllegalArgumentException("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true;  the Verified Phone Number feature only works in sign-ups.");
        }
    }

    public final boolean KN() {
        return this.gh;
    }

    public final boolean Uo() {
        return this.HI;
    }

    public final String az() {
        return this.xMQ;
    }

    public final String gh() {
        return this.mUb;
    }

    public final String mUb() {
        return this.qie;
    }

    public final boolean qie() {
        return this.ty;
    }

    public final List xMQ() {
        return this.az;
    }
}
