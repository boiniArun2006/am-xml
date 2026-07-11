package X9;

import androidx.content.core.CorruptionException;
import androidx.content.core.Serializer;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rB.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class w6 implements Serializer {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w6 f11777n = new w6();
    private static final Wre rl;

    static {
        Wre wreMUb = Wre.mUb();
        Intrinsics.checkNotNullExpressionValue(wreMUb, "getDefaultInstance(...)");
        rl = wreMUb;
    }

    @Override // androidx.content.core.Serializer
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Wre getDefaultValue() {
        return rl;
    }

    private w6() {
    }

    @Override // androidx.content.core.Serializer
    public Object readFrom(InputStream inputStream, Continuation continuation) throws CorruptionException {
        try {
            Wre wreAz = Wre.az(inputStream);
            Intrinsics.checkNotNullExpressionValue(wreAz, "parseFrom(...)");
            return wreAz;
        } catch (InvalidProtocolBufferException e2) {
            throw new CorruptionException("Cannot read proto.", e2);
        }
    }

    @Override // androidx.content.core.Serializer
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Object writeTo(Wre wre, OutputStream outputStream, Continuation continuation) throws IOException {
        wre.writeTo(outputStream);
        return Unit.INSTANCE;
    }
}
