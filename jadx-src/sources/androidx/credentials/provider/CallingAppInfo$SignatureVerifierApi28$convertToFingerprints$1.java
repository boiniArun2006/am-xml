package androidx.credentials.provider;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(B)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
final class CallingAppInfo$SignatureVerifierApi28$convertToFingerprints$1 extends Lambda implements Function1<Byte, CharSequence> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CallingAppInfo$SignatureVerifierApi28$convertToFingerprints$1 f37251n = new CallingAppInfo$SignatureVerifierApi28$convertToFingerprints$1();

    CallingAppInfo$SignatureVerifierApi28$convertToFingerprints$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ CharSequence invoke(Byte b2) {
        return n(b2.byteValue());
    }

    public final CharSequence n(byte b2) {
        String str = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        return str;
    }
}
