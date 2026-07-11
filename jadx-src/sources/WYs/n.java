package WYs;

import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n implements WYs.j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f11521t = new j(null);
    private final List rl;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public n(List obfuscatedSecretKey) {
        Intrinsics.checkNotNullParameter(obfuscatedSecretKey, "obfuscatedSecretKey");
        this.rl = obfuscatedSecretKey;
    }

    @Override // WYs.j
    public String n(String encryptedSecret) throws BadPaddingException, IllegalBlockSizeException {
        Intrinsics.checkNotNullParameter(encryptedSecret, "encryptedSecret");
        byte[] bArrRl = CbW.j.rl(YaE.n.n(this.rl), 0, 1, null);
        byte[] bArrRl2 = CbW.j.rl(encryptedSecret, 0, 1, null);
        byte[] bArrCopyOfRange = ArraysKt.copyOfRange(bArrRl2, 0, 16);
        byte[] bArrRl3 = new pl2.j(null, 1, null).rl(ArraysKt.copyOfRange(bArrRl2, 16, bArrRl2.length), bArrRl, bArrCopyOfRange);
        Charset charsetForName = Charset.forName(C.UTF8_NAME);
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        return new String(bArrRl3, charsetForName);
    }
}
