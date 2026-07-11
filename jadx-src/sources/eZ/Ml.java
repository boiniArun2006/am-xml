package eZ;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class Ml implements Iterator {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayDeque f63761n = new ArrayDeque();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f63762t;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63761n.size() > 0;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        try {
            aC aCVar = (aC) this.f63761n.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(aCVar.getKey(), aCVar.getValue());
            if (this.f63762t) {
                for (fuX fuxT = aCVar.t(); !fuxT.isEmpty(); fuxT = fuxT.nr()) {
                    this.f63761n.push((aC) fuxT);
                }
            } else {
                for (fuX fuxNr = aCVar.nr(); !fuxNr.isEmpty(); fuxNr = fuxNr.t()) {
                    this.f63761n.push((aC) fuxNr);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }

    Ml(fuX fux, Object obj, Comparator comparator, boolean z2) {
        int iCompare;
        this.f63762t = z2;
        while (!fux.isEmpty()) {
            if (obj != null) {
                if (z2) {
                    iCompare = comparator.compare(obj, fux.getKey());
                } else {
                    iCompare = comparator.compare(fux.getKey(), obj);
                }
            } else {
                iCompare = 1;
            }
            if (iCompare < 0) {
                if (z2) {
                    fux = fux.t();
                } else {
                    fux = fux.nr();
                }
            } else {
                if (iCompare == 0) {
                    this.f63761n.push((aC) fux);
                    return;
                }
                this.f63761n.push((aC) fux);
                if (z2) {
                    fux = fux.nr();
                } else {
                    fux = fux.t();
                }
            }
        }
    }
}
