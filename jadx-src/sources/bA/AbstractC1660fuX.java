package bA;

/* JADX INFO: renamed from: bA.fuX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class AbstractC1660fuX extends AbstractC1661j {
    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Dzy.j.ViF("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
