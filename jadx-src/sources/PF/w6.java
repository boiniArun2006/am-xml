package PF;

import PA.I28;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class w6 implements Iterator {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Iterator f7653n;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f7653n.hasNext();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public I28 next() {
        return new n(this.f7653n.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f7653n.remove();
    }

    public w6(Iterator it) {
        this.f7653n = it;
    }
}
