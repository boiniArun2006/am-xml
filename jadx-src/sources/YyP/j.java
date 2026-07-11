package YyP;

import Dk.CN3;
import Hr.CQ.USEaHtCMH;
import androidx.content.core.CorruptionException;
import androidx.content.core.Serializer;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class j implements Serializer {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f12229n = new j();
    private static final CN3 rl;

    static {
        CN3 cn3Qie = CN3.qie();
        Intrinsics.checkNotNullExpressionValue(cn3Qie, "getDefaultInstance(...)");
        rl = cn3Qie;
    }

    @Override // androidx.content.core.Serializer
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public CN3 getDefaultValue() {
        return rl;
    }

    private j() {
    }

    @Override // androidx.content.core.Serializer
    public Object readFrom(InputStream inputStream, Continuation continuation) throws CorruptionException {
        try {
            CN3 cn3Ck = CN3.ck(inputStream);
            Intrinsics.checkNotNullExpressionValue(cn3Ck, USEaHtCMH.twKd);
            return cn3Ck;
        } catch (InvalidProtocolBufferException e2) {
            throw new CorruptionException("Cannot read proto.", e2);
        }
    }

    @Override // androidx.content.core.Serializer
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Object writeTo(CN3 cn3, OutputStream outputStream, Continuation continuation) throws IOException {
        cn3.writeTo(outputStream);
        return Unit.INSTANCE;
    }
}
