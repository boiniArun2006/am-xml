package Be4;

import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class QJ {
    private static final ByteString J2;
    private static final ByteString KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final ByteString f534O;
    private static final ByteString Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ByteString f535n;
    private static final ByteString nr;
    private static final ByteString rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final ByteString f536t;
    private static final ByteString xMQ;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        f535n = companion.encodeUtf8("GIF87a");
        rl = companion.encodeUtf8("GIF89a");
        f536t = companion.encodeUtf8("RIFF");
        nr = companion.encodeUtf8("WEBP");
        f534O = companion.encodeUtf8("VP8X");
        J2 = companion.encodeUtf8("ftyp");
        Uo = companion.encodeUtf8("msf1");
        KN = companion.encodeUtf8("hevc");
        xMQ = companion.encodeUtf8("hevx");
    }

    public static final boolean O(Dsr dsr, BufferedSource bufferedSource) {
        return bufferedSource.rangeEquals(0L, f536t) && bufferedSource.rangeEquals(8L, nr);
    }

    public static final boolean nr(Dsr dsr, BufferedSource bufferedSource) {
        return bufferedSource.rangeEquals(4L, J2);
    }

    public static final boolean t(Dsr dsr, BufferedSource bufferedSource) {
        return bufferedSource.rangeEquals(0L, rl) || bufferedSource.rangeEquals(0L, f535n);
    }

    public static final boolean n(Dsr dsr, BufferedSource bufferedSource) {
        if (nr(dsr, bufferedSource)) {
            if (bufferedSource.rangeEquals(8L, Uo) || bufferedSource.rangeEquals(8L, KN) || bufferedSource.rangeEquals(8L, xMQ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean rl(Dsr dsr, BufferedSource bufferedSource) {
        if (O(dsr, bufferedSource) && bufferedSource.rangeEquals(12L, f534O) && bufferedSource.request(17L) && ((byte) (bufferedSource.getBuffer().getByte(16L) & 2)) > 0) {
            return true;
        }
        return false;
    }
}
