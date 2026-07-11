package Li;

import com.google.firebase.perf.application.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Wre implements j.InterfaceC0810j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final yMa.j f6184n = yMa.j.O();

    @Override // com.google.firebase.perf.application.j.InterfaceC0810j
    public void n() {
        try {
            I28.t();
        } catch (IllegalStateException e2) {
            f6184n.gh("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e2);
        }
    }
}
