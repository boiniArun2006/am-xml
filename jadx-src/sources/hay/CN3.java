package hay;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class CN3 {

    public enum j {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public abstract long rl();

    public abstract j t();

    public static CN3 J2() {
        return new n(j.TRANSIENT_ERROR, -1L);
    }

    public static CN3 O(long j2) {
        return new n(j.OK, j2);
    }

    public static CN3 n() {
        return new n(j.FATAL_ERROR, -1L);
    }

    public static CN3 nr() {
        return new n(j.INVALID_PAYLOAD, -1L);
    }
}
