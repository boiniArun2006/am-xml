package lm3;

import Dk.I28;
import androidx.content.core.CorruptionException;
import androidx.content.core.Serializer;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j implements Serializer {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f70438n = new j();
    private static final I28 rl;

    static {
        I28 i28Ik = I28.Ik();
        Intrinsics.checkNotNullExpressionValue(i28Ik, "getDefaultInstance(...)");
        rl = i28Ik;
    }

    @Override // androidx.content.core.Serializer
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public I28 getDefaultValue() {
        return rl;
    }

    private j() {
    }

    @Override // androidx.content.core.Serializer
    public Object readFrom(InputStream inputStream, Continuation continuation) throws CorruptionException {
        try {
            I28 i28Z = I28.Z(inputStream);
            Intrinsics.checkNotNullExpressionValue(i28Z, "parseFrom(...)");
            return i28Z;
        } catch (InvalidProtocolBufferException e2) {
            throw new CorruptionException("Cannot read proto.", e2);
        }
    }

    @Override // androidx.content.core.Serializer
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Object writeTo(I28 i28, OutputStream outputStream, Continuation continuation) throws IOException {
        i28.writeTo(outputStream);
        return Unit.INSTANCE;
    }
}
