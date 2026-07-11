package CbW;

import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.zip.Deflater;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class n {
    public static final byte[] n(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Charset charsetForName = Charset.forName(C.UTF8_NAME);
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        byte[] bytes = str.getBytes(charsetForName);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArr = new byte[bytes.length * 4];
        Deflater deflater = new Deflater();
        deflater.setInput(bytes);
        deflater.finish();
        return ArraysKt.copyOfRange(bArr, 0, deflater.deflate(bArr));
    }
}
