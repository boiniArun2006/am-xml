package zV;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zV.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class C2499j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function0 f76707n;
    private int nr;
    private final Function2 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f76708t;

    public C2499j(Function0 allocator, Function2 copier) {
        Intrinsics.checkNotNullParameter(allocator, "allocator");
        Intrinsics.checkNotNullParameter(copier, "copier");
        this.f76707n = allocator;
        this.rl = copier;
        this.f76708t = new ArrayList();
    }

    public final int n() {
        return this.nr;
    }

    public final void rl(Object obj) {
        int i2 = this.nr;
        if (i2 < 1) {
            throw new EmptyStackException();
        }
        int i3 = i2 - 1;
        this.nr = i3;
        this.rl.invoke(this.f76708t.get(i3), obj);
    }

    public final void t(Object obj) {
        if (this.nr >= this.f76708t.size()) {
            this.f76708t.add(this.f76707n.invoke());
        }
        this.rl.invoke(obj, this.f76708t.get(this.nr));
        this.nr++;
    }
}
