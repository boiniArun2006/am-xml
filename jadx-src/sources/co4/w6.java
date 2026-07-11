package co4;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class w6 implements l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Xo f43867n;
    private final List rl;

    public w6(Xo mainFormat, List formats) {
        Intrinsics.checkNotNullParameter(mainFormat, "mainFormat");
        Intrinsics.checkNotNullParameter(formats, "formats");
        this.f43867n = mainFormat;
        this.rl = formats;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return Intrinsics.areEqual(this.f43867n, w6Var.f43867n) && Intrinsics.areEqual(this.rl, w6Var.rl);
    }

    public int hashCode() {
        return (this.f43867n.hashCode() * 31) + this.rl.hashCode();
    }

    @Override // co4.Xo
    public q6b.I28 n() {
        return this.f43867n.n();
    }

    public final Xo nr() {
        return this.f43867n;
    }

    public final List t() {
        return this.rl;
    }

    public String toString() {
        return "AlternativesParsing(" + this.rl + ')';
    }

    @Override // co4.Xo
    public stX.eO rl() {
        List listEmptyList = CollectionsKt.emptyList();
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(this.f43867n.rl());
        Iterator it = this.rl.iterator();
        while (it.hasNext()) {
            listCreateListBuilder.add(((Xo) it.next()).rl());
        }
        return new stX.eO(listEmptyList, CollectionsKt.build(listCreateListBuilder));
    }
}
