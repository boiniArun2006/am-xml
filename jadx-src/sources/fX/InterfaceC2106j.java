package fX;

import z.KH;
import z.fg;

/* JADX INFO: renamed from: fX.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface InterfaceC2106j {

    /* JADX INFO: renamed from: fX.j$j, reason: collision with other inner class name */
    public static final class C0926j {
        public static /* synthetic */ void n(InterfaceC2106j interfaceC2106j, long j2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: swapBuffers");
            }
            if ((i2 & 1) != 0) {
                j2 = 0;
            }
            interfaceC2106j.J2(j2);
        }
    }

    void J2(long j2);

    int O();

    void Uo(fg fgVar);

    int nr();

    KH rl();
}
