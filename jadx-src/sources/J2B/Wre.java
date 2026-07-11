package J2B;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Wre {
    private static final Pattern rl = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f4423n = new ArrayList();

    public List n() {
        return this.f4423n;
    }

    public void rl() {
        this.f4423n.clear();
    }
}
