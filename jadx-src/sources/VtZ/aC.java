package VtZ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class aC {
    public static final aC rl = new aC(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f11360n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aC.class == obj.getClass()) {
            String str = this.f11360n;
            String str2 = ((aC) obj).f11360n;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f11360n;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String n() {
        return this.f11360n;
    }

    public boolean rl() {
        return this.f11360n != null;
    }

    public String toString() {
        return "User(uid:" + this.f11360n + ")";
    }

    public aC(String str) {
        this.f11360n = str;
    }
}
