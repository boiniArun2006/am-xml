package androidx.credentials;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b&\u0018\u0000  2\u00020\u0001:\u0002!\"BK\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\t\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u0017\u0010\r\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\r\u0010\u001b¨\u0006#"}, d2 = {"Landroidx/credentials/CreateCredentialRequest;", "", "", "type", "Landroid/os/Bundle;", "credentialData", "candidateQueryData", "", "isSystemProviderRequired", "isAutoSelectAllowed", "Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "displayInfo", "origin", "preferImmediatelyAvailableCredentials", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLandroidx/credentials/CreateCredentialRequest$DisplayInfo;Ljava/lang/String;Z)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Ljava/lang/String;", "O", "()Ljava/lang/String;", "rl", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "t", "nr", "Z", "J2", "()Z", "Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "()Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "Uo", "KN", "xMQ", "Companion", "DisplayInfo", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CreateCredentialRequest {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final DisplayInfo displayInfo;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final boolean preferImmediatelyAvailableCredentials;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final boolean isAutoSelectAllowed;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final String origin;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String type;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final boolean isSystemProviderRequired;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Bundle credentialData;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Bundle candidateQueryData;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "", "", "userId", "userDisplayName", "Landroid/graphics/drawable/Icon;", "credentialTypeIcon", "", "preferDefaultProvider", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/drawable/Icon;Ljava/lang/String;)V", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "Landroid/os/Bundle;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "()Landroid/os/Bundle;", "Ljava/lang/CharSequence;", "getUserId", "()Ljava/lang/CharSequence;", "rl", "getUserDisplayName", "t", "Landroid/graphics/drawable/Icon;", "getCredentialTypeIcon", "()Landroid/graphics/drawable/Icon;", "nr", "Ljava/lang/String;", "getPreferDefaultProvider", "()Ljava/lang/String;", "O", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCreateCredentialRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateCredentialRequest.kt\nandroidx/credentials/CreateCredentialRequest$DisplayInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,271:1\n1#2:272\n*E\n"})
    public static final class DisplayInfo {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final CharSequence userId;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private final String preferDefaultProvider;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final CharSequence userDisplayName;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final Icon credentialTypeIcon;

        public DisplayInfo(CharSequence userId, CharSequence charSequence, Icon icon, String str) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            this.userId = userId;
            this.userDisplayName = charSequence;
            this.credentialTypeIcon = icon;
            this.preferDefaultProvider = str;
            if (userId.length() <= 0) {
                throw new IllegalArgumentException("userId should not be empty");
            }
        }

        public final Bundle n() {
            Bundle bundle = new Bundle();
            bundle.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", this.userId);
            if (!TextUtils.isEmpty(this.userDisplayName)) {
                bundle.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", this.userDisplayName);
            }
            if (!TextUtils.isEmpty(this.preferDefaultProvider)) {
                bundle.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", this.preferDefaultProvider);
            }
            return bundle;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public DisplayInfo(CharSequence userId, CharSequence charSequence) {
            this(userId, charSequence, null, null);
            Intrinsics.checkNotNullParameter(userId, "userId");
        }
    }

    public CreateCredentialRequest(String type, Bundle credentialData, Bundle candidateQueryData, boolean z2, boolean z3, DisplayInfo displayInfo, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(credentialData, "credentialData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(displayInfo, "displayInfo");
        this.type = type;
        this.credentialData = credentialData;
        this.candidateQueryData = candidateQueryData;
        this.isSystemProviderRequired = z2;
        this.isAutoSelectAllowed = z3;
        this.displayInfo = displayInfo;
        this.origin = str;
        this.preferImmediatelyAvailableCredentials = z4;
        credentialData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z3);
        credentialData.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z4);
        candidateQueryData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z3);
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final boolean getIsSystemProviderRequired() {
        return this.isSystemProviderRequired;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final Bundle getCredentialData() {
        return this.credentialData;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final DisplayInfo getDisplayInfo() {
        return this.displayInfo;
    }
}
