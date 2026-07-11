package ISg;

import okio.ByteString;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ByteString f4267n;
    public final ByteString rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final int f4268t;
    public static final ByteString nr = ByteString.encodeUtf8(":status");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final ByteString f4266O = ByteString.encodeUtf8(":method");
    public static final ByteString J2 = ByteString.encodeUtf8(":path");
    public static final ByteString Uo = ByteString.encodeUtf8(":scheme");
    public static final ByteString KN = ByteString.encodeUtf8(":authority");
    public static final ByteString xMQ = ByteString.encodeUtf8(":host");
    public static final ByteString mUb = ByteString.encodeUtf8(":version");

    public Ml(String str, String str2) {
        this(ByteString.encodeUtf8(str), ByteString.encodeUtf8(str2));
    }

    public Ml(ByteString byteString, String str) {
        this(byteString, ByteString.encodeUtf8(str));
    }

    public boolean equals(Object obj) {
        if (obj instanceof Ml) {
            Ml ml = (Ml) obj;
            if (this.f4267n.equals(ml.f4267n) && this.rl.equals(ml.rl)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f4267n.hashCode()) * 31) + this.rl.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", this.f4267n.utf8(), this.rl.utf8());
    }

    public Ml(ByteString byteString, ByteString byteString2) {
        this.f4267n = byteString;
        this.rl = byteString2;
        this.f4268t = byteString.size() + 32 + byteString2.size();
    }
}
