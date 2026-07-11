package Qk;

import com.alightcreative.app.motion.scene.ExportParams;
import fX.InterfaceC2106j;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import z.OU;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class g9s implements SPz {
    private final OU J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private XK.j f8253O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final File f8254n;
    private int nr;
    private final ExportParams rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f8255t;

    public g9s(File exportFile, ExportParams exportParams) {
        Intrinsics.checkNotNullParameter(exportFile, "exportFile");
        Intrinsics.checkNotNullParameter(exportParams, "exportParams");
        this.f8254n = exportFile;
        this.rl = exportParams;
        this.f8255t = -1L;
        this.J2 = new OU(exportParams.getWidth(), exportParams.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Xw(long j2) {
        return "beginFrame(" + j2 + ")";
    }

    @Override // Qk.SPz
    public void T(InterfaceC2106j interfaceC2106j) {
        Intrinsics.checkNotNullParameter(interfaceC2106j, "<this>");
        XK.j jVar = this.f8253O;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("exporter");
            jVar = null;
        }
        jVar.rl(this.nr);
    }

    @Override // Qk.SPz
    public void Z(InterfaceC2106j interfaceC2106j, final long j2) {
        Intrinsics.checkNotNullParameter(interfaceC2106j, "<this>");
        XoT.C.Uo(interfaceC2106j, new Function0() { // from class: Qk.ci
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g9s.Xw(j2);
            }
        });
        interfaceC2106j.Uo(this.J2);
        if (this.f8255t < 0) {
            this.f8255t = j2;
        }
        long j3 = this.f8255t;
        int i2 = (int) ((j2 - j3) / ((long) 10000000));
        this.nr = i2;
        this.f8255t = j3 + (((long) i2) * 10000000);
    }

    @Override // Qk.SPz
    public void n() {
        String absolutePath = this.f8254n.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        this.f8253O = new XK.j(absolutePath, this.rl.getWidth(), this.rl.getHeight(), 0, XK.n.J2, false);
    }

    @Override // Cp.j
    public void release() {
        XK.j jVar = this.f8253O;
        if (jVar != null) {
            if (jVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("exporter");
                jVar = null;
            }
            jVar.n();
        }
    }
}
