package gX;

import com.google.crypto.tink.internal.TinkBugException;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Objects;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Charset f67599n = Charset.forName(com.google.android.exoplayer2.C.UTF8_NAME);

    private static final byte nr(char c2) {
        if (c2 >= '!' && c2 <= '~') {
            return (byte) c2;
        }
        throw new TinkBugException("Not a printable ASCII character: " + c2);
    }

    public static boolean rl() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    public static int t() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i2 = 0;
        while (i2 == 0) {
            secureRandom.nextBytes(bArr);
            i2 = ((bArr[0] & ByteCompanionObject.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE);
        }
        return i2;
    }

    public static final nri.j O(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i2 = 0; i2 < str.length(); i2++) {
            bArr[i2] = nr(str.charAt(i2));
        }
        return nri.j.n(bArr);
    }

    public static Integer n() {
        if (!rl()) {
            return null;
        }
        return j.n();
    }
}
