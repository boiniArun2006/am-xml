package ISg;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public enum j {
    NO_ERROR(0, -1, 0),
    PROTOCOL_ERROR(1, 1, 1),
    INVALID_STREAM(1, 2, -1),
    UNSUPPORTED_VERSION(1, 4, -1),
    STREAM_IN_USE(1, 8, -1),
    STREAM_ALREADY_CLOSED(1, 9, -1),
    INTERNAL_ERROR(2, 6, 2),
    FLOW_CONTROL_ERROR(3, 7, -1),
    STREAM_CLOSED(5, -1, -1),
    FRAME_TOO_LARGE(6, 11, -1),
    REFUSED_STREAM(7, 3, -1),
    CANCEL(8, 5, -1),
    COMPRESSION_ERROR(9, -1, -1),
    CONNECT_ERROR(10, -1, -1),
    ENHANCE_YOUR_CALM(11, -1, -1),
    INADEQUATE_SECURITY(12, -1, -1),
    HTTP_1_1_REQUIRED(13, -1, -1),
    INVALID_CREDENTIALS(-1, 10, -1);


    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f4292O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f4293n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f4294t;

    j(int i2, int i3, int i5) {
        this.f4293n = i2;
        this.f4294t = i3;
        this.f4292O = i5;
    }

    public static j n(int i2) {
        for (j jVar : values()) {
            if (jVar.f4293n == i2) {
                return jVar;
            }
        }
        return null;
    }
}
