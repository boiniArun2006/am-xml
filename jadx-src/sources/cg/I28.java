package cg;

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
final class I28 implements Serializer {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I28 f43780n = new I28();
    private static final w6 rl;

    static {
        w6 w6VarGh = w6.gh();
        Intrinsics.checkNotNullExpressionValue(w6VarGh, "getDefaultInstance(...)");
        rl = w6VarGh;
    }

    @Override // androidx.content.core.Serializer
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public w6 getDefaultValue() {
        return rl;
    }

    private I28() {
    }

    @Override // androidx.content.core.Serializer
    public Object readFrom(InputStream inputStream, Continuation continuation) throws CorruptionException {
        try {
            w6 w6VarHI = w6.HI(inputStream);
            Intrinsics.checkNotNullExpressionValue(w6VarHI, "parseFrom(...)");
            return w6VarHI;
        } catch (InvalidProtocolBufferException e2) {
            throw new CorruptionException("Cannot read proto.", e2);
        }
    }

    @Override // androidx.content.core.Serializer
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Object writeTo(w6 w6Var, OutputStream outputStream, Continuation continuation) throws IOException {
        w6Var.writeTo(outputStream);
        return Unit.INSTANCE;
    }
}
