package YyP;

import Dk.Dsr;
import androidx.content.core.CorruptionException;
import androidx.content.core.Serializer;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n implements Serializer {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f12230n = new n();
    private static final Dsr rl;

    static {
        Dsr dsrGh = Dsr.gh();
        Intrinsics.checkNotNullExpressionValue(dsrGh, "getDefaultInstance(...)");
        rl = dsrGh;
    }

    @Override // androidx.content.core.Serializer
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Dsr getDefaultValue() {
        return rl;
    }

    private n() {
    }

    @Override // androidx.content.core.Serializer
    public Object readFrom(InputStream inputStream, Continuation continuation) throws CorruptionException {
        try {
            Dsr dsrCk = Dsr.ck(inputStream);
            Intrinsics.checkNotNullExpressionValue(dsrCk, "parseFrom(...)");
            return dsrCk;
        } catch (InvalidProtocolBufferException e2) {
            throw new CorruptionException("Cannot read proto.", e2);
        }
    }

    @Override // androidx.content.core.Serializer
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Object writeTo(Dsr dsr, OutputStream outputStream, Continuation continuation) throws IOException {
        dsr.writeTo(outputStream);
        return Unit.INSTANCE;
    }
}
