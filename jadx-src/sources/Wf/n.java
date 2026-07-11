package Wf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f11551n;
    private final String rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f11551n, nVar.f11551n) && Intrinsics.areEqual(this.rl, nVar.rl);
    }

    public n(String encryptionPublicKey, String encryptionKeyId) {
        Intrinsics.checkNotNullParameter(encryptionPublicKey, "encryptionPublicKey");
        Intrinsics.checkNotNullParameter(encryptionKeyId, "encryptionKeyId");
        this.f11551n = encryptionPublicKey;
        this.rl = encryptionKeyId;
    }

    public int hashCode() {
        return (this.f11551n.hashCode() * 31) + this.rl.hashCode();
    }

    public final String n() {
        return this.rl;
    }

    public final String rl() {
        return this.f11551n;
    }

    public String toString() {
        return "EncryptionSettings(encryptionPublicKey=" + this.f11551n + ", encryptionKeyId=" + this.rl + ")";
    }
}
