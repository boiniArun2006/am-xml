package androidx.credentials.provider;

import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b&\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001cB5\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\r\u0010\u0016¨\u0006\u001d"}, d2 = {"Landroidx/credentials/provider/CredentialEntry;", "", "", "type", "Landroidx/credentials/provider/BeginGetCredentialOption;", "beginGetCredentialOption", "", "entryGroupId", "", "isDefaultIconPreferredAsSingleProvider", "affiliatedDomain", "<init>", "(Ljava/lang/String;Landroidx/credentials/provider/BeginGetCredentialOption;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Ljava/lang/String;", "nr", "()Ljava/lang/String;", "rl", "Landroidx/credentials/provider/BeginGetCredentialOption;", "()Landroidx/credentials/provider/BeginGetCredentialOption;", "t", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "Z", "O", "()Z", "J2", "Api34Impl", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CredentialEntry {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final CharSequence affiliatedDomain;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String type;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final boolean isDefaultIconPreferredAsSingleProvider;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final BeginGetCredentialOption beginGetCredentialOption;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final CharSequence entryGroupId;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/credentials/provider/CredentialEntry$Companion;", "", "<init>", "()V", "Landroid/app/slice/Slice;", "slice", "Landroidx/credentials/provider/CredentialEntry;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/app/slice/Slice;)Landroidx/credentials/provider/CredentialEntry;", "entry", "rl", "(Landroidx/credentials/provider/CredentialEntry;)Landroid/app/slice/Slice;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CredentialEntry n(Slice slice) {
            Intrinsics.checkNotNullParameter(slice, "slice");
            try {
                SliceSpec spec = slice.getSpec();
                String type = spec != null ? spec.getType() : null;
                if (Intrinsics.areEqual(type, "android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    PasswordCredentialEntry passwordCredentialEntryN = PasswordCredentialEntry.INSTANCE.n(slice);
                    Intrinsics.checkNotNull(passwordCredentialEntryN);
                    return passwordCredentialEntryN;
                }
                if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                    PublicKeyCredentialEntry publicKeyCredentialEntryN = PublicKeyCredentialEntry.INSTANCE.n(slice);
                    Intrinsics.checkNotNull(publicKeyCredentialEntryN);
                    return publicKeyCredentialEntryN;
                }
                CustomCredentialEntry customCredentialEntryN = CustomCredentialEntry.INSTANCE.n(slice);
                Intrinsics.checkNotNull(customCredentialEntryN);
                return customCredentialEntryN;
            } catch (Exception unused) {
                return CustomCredentialEntry.INSTANCE.n(slice);
            }
        }

        public final Slice rl(CredentialEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            if (entry instanceof PasswordCredentialEntry) {
                return PasswordCredentialEntry.INSTANCE.rl((PasswordCredentialEntry) entry);
            }
            if (entry instanceof PublicKeyCredentialEntry) {
                return PublicKeyCredentialEntry.INSTANCE.rl((PublicKeyCredentialEntry) entry);
            }
            if (entry instanceof CustomCredentialEntry) {
                return CustomCredentialEntry.INSTANCE.rl((CustomCredentialEntry) entry);
            }
            return null;
        }
    }

    @RequiresApi
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/CredentialEntry$Api34Impl;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Api34Impl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Api34Impl f37260n = new Api34Impl();

        private Api34Impl() {
        }
    }

    public CredentialEntry(String type, BeginGetCredentialOption beginGetCredentialOption, CharSequence entryGroupId, boolean z2, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(beginGetCredentialOption, "beginGetCredentialOption");
        Intrinsics.checkNotNullParameter(entryGroupId, "entryGroupId");
        this.type = type;
        this.beginGetCredentialOption = beginGetCredentialOption;
        this.entryGroupId = entryGroupId;
        this.isDefaultIconPreferredAsSingleProvider = z2;
        this.affiliatedDomain = charSequence;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final boolean getIsDefaultIconPreferredAsSingleProvider() {
        return this.isDefaultIconPreferredAsSingleProvider;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final CharSequence getAffiliatedDomain() {
        return this.affiliatedDomain;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final BeginGetCredentialOption getBeginGetCredentialOption() {
        return this.beginGetCredentialOption;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final CharSequence getEntryGroupId() {
        return this.entryGroupId;
    }
}
