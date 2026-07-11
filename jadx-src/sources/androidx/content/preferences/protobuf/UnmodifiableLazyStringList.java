package androidx.content.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Deprecated
public class UnmodifiableLazyStringList extends AbstractList<String> implements LazyStringList, RandomAccess {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LazyStringList f38182n;

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public void a(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public Object getRaw(int i2) {
        return this.f38182n.getRaw(i2);
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public List getUnderlyingElements() {
        return this.f38182n.getUnderlyingElements();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new Iterator<String>() { // from class: androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList.2

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Iterator f38186n;

            {
                this.f38186n = UnmodifiableLazyStringList.this.f38182n.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f38186n.hasNext();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public String next() {
                return (String) this.f38186n.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i2) {
        return new ListIterator<String>(i2) { // from class: androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList.1

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            ListIterator f38184n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ int f38185t;

            {
                this.f38185t = i2;
                this.f38184n = UnmodifiableLazyStringList.this.f38182n.listIterator(i2);
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f38184n.hasNext();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f38184n.hasPrevious();
            }

            @Override // java.util.ListIterator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public void add(String str) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f38184n.nextIndex();
            }

            @Override // java.util.ListIterator
            /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
            public void set(String str) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f38184n.previousIndex();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public String next() {
                return (String) this.f38184n.next();
            }

            @Override // java.util.ListIterator
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public String previous() {
                return (String) this.f38184n.previous();
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f38182n.size();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public String get(int i2) {
        return this.f38182n.get(i2);
    }
}
