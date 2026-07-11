package pUk;

import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Comparator f72019n = new Comparator() { // from class: pUk.CN3
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((fuX) obj).getKey().compareTo(((fuX) obj2).getKey());
        }
    };

    boolean J2();

    boolean KN();

    boolean O();

    boolean Uo();

    l3D getData();

    C getKey();

    UGc getVersion();

    UGc mUb();

    QJ n();

    uB.s4 nr(z zVar);

    boolean rl();

    boolean t();
}
