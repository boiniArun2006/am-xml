package JP;

import JP.Dsr;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class QJ {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f4520n;
    private final byte[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final t1.fuX f4519t = t1.fuX.J2(',');
    private static final QJ nr = n().J2(new Dsr.j(), true).J2(Dsr.n.f4494n, false);

    private QJ(InterfaceC1378z interfaceC1378z, boolean z2, QJ qj) {
        String strN = interfaceC1378z.n();
        t1.Xo.O(!strN.contains(","), "Comma is currently not allowed in message encoding");
        int size = qj.f4520n.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(qj.f4520n.containsKey(interfaceC1378z.n()) ? size : size + 1);
        for (j jVar : qj.f4520n.values()) {
            String strN2 = jVar.f4521n.n();
            if (!strN2.equals(strN)) {
                linkedHashMap.put(strN2, new j(jVar.f4521n, jVar.rl));
            }
        }
        linkedHashMap.put(strN, new j(interfaceC1378z, z2));
        this.f4520n = Collections.unmodifiableMap(linkedHashMap);
        this.rl = f4519t.nr(rl()).getBytes(Charset.forName(com.google.android.exoplayer2.C.ASCII_NAME));
    }

    private static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final InterfaceC1378z f4521n;
        final boolean rl;

        j(InterfaceC1378z interfaceC1378z, boolean z2) {
            this.f4521n = (InterfaceC1378z) t1.Xo.ck(interfaceC1378z, "decompressor");
            this.rl = z2;
        }
    }

    public static QJ n() {
        return new QJ();
    }

    public static QJ t() {
        return nr;
    }

    public QJ J2(InterfaceC1378z interfaceC1378z, boolean z2) {
        return new QJ(interfaceC1378z, z2, this);
    }

    public InterfaceC1378z O(String str) {
        j jVar = (j) this.f4520n.get(str);
        if (jVar != null) {
            return jVar.f4521n;
        }
        return null;
    }

    byte[] nr() {
        return this.rl;
    }

    public Set rl() {
        HashSet hashSet = new HashSet(this.f4520n.size());
        for (Map.Entry entry : this.f4520n.entrySet()) {
            if (((j) entry.getValue()).rl) {
                hashSet.add((String) entry.getKey());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private QJ() {
        this.f4520n = new LinkedHashMap(0);
        this.rl = new byte[0];
    }
}
