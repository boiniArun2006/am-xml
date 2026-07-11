package co4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface n extends stX.j {
    Object n(Object obj);

    Object rl(Object obj);

    public static final class j {
        public static Object n(n nVar, Object obj) {
            Object objN = nVar.n(obj);
            if (objN != null) {
                return objN;
            }
            throw new IllegalStateException("Field " + nVar.getName() + " is not set");
        }
    }
}
