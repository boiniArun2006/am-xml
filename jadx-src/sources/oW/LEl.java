package oW;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class LEl extends mz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f71461n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f71462t;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mz) {
            mz mzVar = (mz) obj;
            String str = this.f71461n;
            if (str != null ? str.equals(mzVar.nr()) : mzVar.nr() == null) {
                String str2 = this.rl;
                if (str2 != null ? str2.equals(mzVar.rl()) : mzVar.rl() == null) {
                    String str3 = this.f71462t;
                    if (str3 != null ? str3.equals(mzVar.t()) : mzVar.t() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private LEl(String str, String str2, String str3) {
        this.f71461n = str;
        this.rl = str2;
        this.f71462t = str3;
    }

    public final int hashCode() {
        String str = this.f71461n;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.rl;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f71462t;
        return iHashCode2 ^ (str3 != null ? str3.hashCode() : 0);
    }

    @Override // oW.mz
    public final String nr() {
        return this.f71461n;
    }

    @Override // oW.mz
    public final String rl() {
        return this.rl;
    }

    @Override // oW.mz
    public final String t() {
        return this.f71462t;
    }

    public final String toString() {
        return "AttestationResult{recaptchaV2Token=" + this.f71461n + ", playIntegrityToken=" + this.rl + ", recaptchaEnterpriseToken=" + this.f71462t + "}";
    }
}
