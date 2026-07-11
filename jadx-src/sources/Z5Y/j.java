package Z5Y;

import CZF.fuX;
import androidx.content.core.CorruptionException;
import androidx.content.core.Serializer;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j implements Serializer {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f12283n = new j();
    private static final fuX rl;

    static {
        fuX fuxQie = fuX.qie();
        Intrinsics.checkNotNullExpressionValue(fuxQie, "getDefaultInstance(...)");
        rl = fuxQie;
    }

    @Override // androidx.content.core.Serializer
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public fuX getDefaultValue() {
        return rl;
    }

    private j() {
    }

    @Override // androidx.content.core.Serializer
    public Object readFrom(InputStream inputStream, Continuation continuation) throws CorruptionException {
        try {
            fuX fuxCk = fuX.ck(inputStream);
            Intrinsics.checkNotNullExpressionValue(fuxCk, "parseFrom(...)");
            return fuxCk;
        } catch (InvalidProtocolBufferException e2) {
            throw new CorruptionException("Cannot read proto.", e2);
        }
    }

    @Override // androidx.content.core.Serializer
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Object writeTo(fuX fux, OutputStream outputStream, Continuation continuation) throws IOException {
        fux.writeTo(outputStream);
        return Unit.INSTANCE;
    }
}
