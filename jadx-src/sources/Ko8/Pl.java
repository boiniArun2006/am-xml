package Ko8;

import QmE.iF;
import com.alightcreative.app.motion.scene.Scene;
import ga6.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Pl implements o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final eO f5797n;
    private final r53.o rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final iF f5798t;

    public Pl(eO readProjectFileUseCase, r53.o sceneSerializer, iF eventLogger) {
        Intrinsics.checkNotNullParameter(readProjectFileUseCase, "readProjectFileUseCase");
        Intrinsics.checkNotNullParameter(sceneSerializer, "sceneSerializer");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f5797n = readProjectFileUseCase;
        this.rl = sceneSerializer;
        this.f5798t = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Scene t(Pl pl, String str) {
        return pl.rl.rl(str);
    }

    @Override // Ko8.o
    public x0X.n n(String projectId) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        x0X.n nVarN = this.f5797n.n(projectId);
        if (nVarN instanceof n.C1266n) {
            return nVarN;
        }
        if (!(nVarN instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        final String str = (String) ((n.w6) nVarN).n();
        return M3.j.rl(M3.n.n(x0X.w6.n(new Function0() { // from class: Ko8.qz
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Pl.t(this.f5815n, str);
            }
        }), j.w6.f67628O, j.EnumC0949j.f67618r, j.n.f67621O, "Deserialization of project file content failed."), this.f5798t);
    }
}
