package EJn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j {
    private final List J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final List f2293O;
    private final List Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f2294n;
    private final Set nr;
    private List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f2295t;

    public j(String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f2294n = serialName;
        this.rl = CollectionsKt.emptyList();
        this.f2295t = new ArrayList();
        this.nr = new HashSet();
        this.f2293O = new ArrayList();
        this.J2 = new ArrayList();
        this.Uo = new ArrayList();
    }

    public static /* synthetic */ void rl(j jVar, String str, Wre wre, List list, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        jVar.n(str, wre, list, z2);
    }

    public final List J2() {
        return this.f2295t;
    }

    public final void KN(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.rl = list;
    }

    public final List O() {
        return this.f2293O;
    }

    public final List Uo() {
        return this.Uo;
    }

    public final void n(String elementName, Wre descriptor, List annotations, boolean z2) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (this.nr.add(elementName)) {
            this.f2295t.add(elementName);
            this.f2293O.add(descriptor);
            this.J2.add(annotations);
            this.Uo.add(Boolean.valueOf(z2));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f2294n).toString());
    }

    public final List nr() {
        return this.J2;
    }

    public final List t() {
        return this.rl;
    }
}
