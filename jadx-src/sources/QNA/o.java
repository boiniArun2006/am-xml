package QNA;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final E8K.CN3 f8132n;
    private String rl = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f8133t = null;
    private static final FilenameFilter nr = new FilenameFilter() { // from class: QNA.aC
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("aqs.");
        }
    };

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Comparator f8131O = new Comparator() { // from class: QNA.C
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    };

    public synchronized void J2(String str) {
        if (!Objects.equals(this.f8133t, str)) {
            nr(this.f8132n, this.rl, str);
            this.f8133t = str;
        }
    }

    public synchronized void Uo(String str) {
        if (!Objects.equals(this.rl, str)) {
            nr(this.f8132n, str, this.f8133t);
            this.rl = str;
        }
    }

    public synchronized String t(String str) {
        if (Objects.equals(this.rl, str)) {
            return this.f8133t;
        }
        return O(this.f8132n, str);
    }

    static String O(E8K.CN3 cn3, String str) {
        List listR = cn3.r(str, nr);
        if (!listR.isEmpty()) {
            return ((File) Collections.min(listR, f8131O)).getName().substring(4);
        }
        h1M.CN3.J2().gh("Unable to read App Quality Sessions session id.");
        return null;
    }

    private static void nr(E8K.CN3 cn3, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            cn3.Ik(str, "aqs." + str2).createNewFile();
        } catch (IOException e2) {
            h1M.CN3.J2().qie("Failed to persist App Quality Sessions session id.", e2);
        }
    }

    o(E8K.CN3 cn3) {
        this.f8132n = cn3;
    }
}
