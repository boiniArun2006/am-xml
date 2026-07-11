package GJW;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class CM {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final dzu.nKK f3390n = new dzu.nKK("COMPLETING_ALREADY");
    public static final dzu.nKK rl = new dzu.nKK("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final dzu.nKK f3391t = new dzu.nKK("COMPLETING_RETRY");
    private static final dzu.nKK nr = new dzu.nKK("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final dzu.nKK f3389O = new dzu.nKK("SEALED");
    private static final fg J2 = new fg(false);
    private static final fg Uo = new fg(true);

    public static final Object KN(Object obj) {
        kO4 ko4;
        hQ hQVar = obj instanceof hQ ? (hQ) obj : null;
        return (hQVar == null || (ko4 = hQVar.f3490n) == null) ? obj : ko4;
    }

    public static final Object Uo(Object obj) {
        return obj instanceof kO4 ? new hQ((kO4) obj) : obj;
    }
}
