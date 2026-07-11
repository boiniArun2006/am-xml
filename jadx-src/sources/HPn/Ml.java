package HPn;

import com.google.android.exoplayer2.C;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import xFr.AbstractC2425j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Ml implements j {
    private final n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function1 f3889t;

    public Ml(n config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.rl = config;
        this.f3889t = new Function1() { // from class: HPn.w6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ml.t(this.f3892n, (Interceptor.Chain) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response t(Ml ml, Interceptor.Chain chain) throws NoSuchAlgorithmException, InvalidKeyException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        long jCurrentTimeMillis = System.currentTimeMillis();
        UUID uuidRandomUUID = UUID.randomUUID();
        Request request = chain.request();
        Intrinsics.checkNotNull(uuidRandomUUID);
        String strNr = ml.nr(request, jCurrentTimeMillis, uuidRandomUUID);
        Request.Builder builderAddHeader = chain.request().newBuilder().addHeader("Sesame-Timestamp", String.valueOf(jCurrentTimeMillis));
        String string = uuidRandomUUID.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return chain.proceed(builderAddHeader.addHeader("Sesame-Request-Id", string).addHeader("Sesame-Signature", strNr).addHeader("Sesame-Protocol", "Sha512").build());
    }

    @Override // HPn.j
    public Function1 n() {
        return this.f3889t;
    }

    public final String nr(Request request, long j2, UUID requestId) throws NoSuchAlgorithmException, InvalidKeyException {
        Intrinsics.checkNotNullParameter(request, gUxOLwRQBPPLC.AIJXATKoYpGgN);
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        String strRl = I28.rl(request);
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = strRl.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str = String.format(ROOT, "%s:%s:%s:%s", Arrays.copyOf(new Object[]{StringsKt.replace$default(request.url().getUrl(), d.f62220u, d.f62221v, false, 4, (Object) null), lowerCase, String.valueOf(j2), requestId.toString()}, 4));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Charset charsetForName = Charset.forName(C.UTF8_NAME);
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        byte[] bytes = str.getBytes(charsetForName);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        Mac mac = Mac.getInstance("HmacSha512");
        byte[] bytes2 = this.rl.n().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        mac.init(new SecretKeySpec(bytes2, "HmacSha512"));
        byte[] bArrDoFinal = mac.doFinal(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        String strN = AbstractC2425j.n(bArrDoFinal);
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase2 = strN.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return lowerCase2;
    }
}
