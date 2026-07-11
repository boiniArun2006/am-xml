package F7;

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
    public static final j f2517n = new j();
    private static final CZF.j rl;

    static {
        CZF.j jVarMUb = CZF.j.mUb();
        Intrinsics.checkNotNullExpressionValue(jVarMUb, "getDefaultInstance(...)");
        rl = jVarMUb;
    }

    @Override // androidx.content.core.Serializer
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public CZF.j getDefaultValue() {
        return rl;
    }

    private j() {
    }

    @Override // androidx.content.core.Serializer
    public Object readFrom(InputStream inputStream, Continuation continuation) throws CorruptionException {
        try {
            CZF.j jVarQie = CZF.j.qie(inputStream);
            Intrinsics.checkNotNullExpressionValue(jVarQie, "parseFrom(...)");
            return jVarQie;
        } catch (InvalidProtocolBufferException e2) {
            throw new CorruptionException("Cannot read proto.", e2);
        }
    }

    @Override // androidx.content.core.Serializer
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Object writeTo(CZF.j jVar, OutputStream outputStream, Continuation continuation) throws IOException {
        jVar.writeTo(outputStream);
        return Unit.INSTANCE;
    }
}
