package Ko8;

import HI0.afx;
import QmE.iF;
import android.content.Context;
import ga6.j;
import java.util.UUID;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class QJ implements eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f5800n;
    private final iF rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f5799t = new j(null);
    public static final int nr = 8;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public QJ(Context context, iF eventLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f5800n = context;
        this.rl = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nr(QJ qj, UUID uuid) {
        return FilesKt.readText$default(afx.Z(qj.f5800n, uuid), null, 1, null);
    }

    @Override // Ko8.eO
    public x0X.n n(String projectId) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        UUID uuidFromString = UUID.fromString(projectId);
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        return t(uuidFromString);
    }

    public x0X.n t(final UUID projectId) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        return M3.j.rl(M3.n.n(x0X.w6.n(new Function0() { // from class: Ko8.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QJ.nr(this.f5820n, projectId);
            }
        }), j.w6.f67628O, j.EnumC0949j.f67618r, j.n.f67621O, "Reading project file content failed."), this.rl);
    }
}
