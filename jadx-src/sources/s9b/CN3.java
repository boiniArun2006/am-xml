package s9b;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte f73179n = Byte.parseByte("01110000", 2);
    private static final byte rl = Byte.parseByte("00001111", 2);

    private static String rl(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    private static byte[] t(UUID uuid, byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        return byteBufferWrap.array();
    }

    public String n() {
        byte[] bArrT = t(UUID.randomUUID(), new byte[17]);
        byte b2 = bArrT[0];
        bArrT[16] = b2;
        bArrT[0] = (byte) ((b2 & rl) | f73179n);
        return rl(bArrT);
    }
}
