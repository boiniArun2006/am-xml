package androidx.work;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class InputMerger {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f42728n = Logger.J2("InputMerger");

    public abstract Data rl(List list);

    public static InputMerger n(String str) {
        try {
            return (InputMerger) Class.forName(str).newInstance();
        } catch (Exception e2) {
            Logger.t().rl(f42728n, "Trouble instantiating + " + str, e2);
            return null;
        }
    }
}
