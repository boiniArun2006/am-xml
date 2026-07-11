package HI0;

import java.io.InputStream;
import java.security.MessageDigest;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class nKK {
    public static final byte[] n(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            byte[] bArr = new byte[10240];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 < 0) {
                    byte[] bArrDigest = messageDigest.digest();
                    Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
                    CloseableKt.closeFinally(inputStream, null);
                    return bArrDigest;
                }
                if (i2 > 0) {
                    messageDigest.update(bArr, 0, i2);
                }
            }
        } finally {
        }
    }
}
