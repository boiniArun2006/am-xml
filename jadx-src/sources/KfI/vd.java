package KfI;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class vd implements rv6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final vd f5743n = new vd();

    private vd() {
    }

    @Override // KfI.rv6
    public UUID next() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
        return uuidRandomUUID;
    }
}
