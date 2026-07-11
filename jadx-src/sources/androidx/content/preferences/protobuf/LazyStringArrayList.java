package androidx.content.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class LazyStringArrayList extends AbstractProtobufList<String> implements LazyStringList, RandomAccess {
    public static final LazyStringList J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final LazyStringArrayList f38070O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f38071t;

    private static class ByteArrayListView extends AbstractList<byte[]> implements RandomAccess {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final LazyStringArrayList f38072n;

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public byte[] set(int i2, byte[] bArr) {
            Object objWPU = this.f38072n.WPU(i2, bArr);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.az(objWPU);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public byte[] remove(int i2) {
            String strRemove = this.f38072n.remove(i2);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.az(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void add(int i2, byte[] bArr) {
            this.f38072n.gh(i2, bArr);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f38072n.size();
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public byte[] get(int i2) {
            return this.f38072n.getByteArray(i2);
        }
    }

    private static class ByteStringListView extends AbstractList<ByteString> implements RandomAccess {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final LazyStringArrayList f38073n;

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public ByteString set(int i2, ByteString byteString) {
            Object objS = this.f38073n.S(i2, byteString);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.ty(objS);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public ByteString remove(int i2) {
            String strRemove = this.f38073n.remove(i2);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.ty(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void add(int i2, ByteString byteString) {
            this.f38073n.xMQ(i2, byteString);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f38073n.size();
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public ByteString get(int i2) {
            return this.f38073n.Ik(i2);
        }
    }

    private LazyStringArrayList(boolean z2) {
        super(z2);
        this.f38071t = Collections.EMPTY_LIST;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    static {
        LazyStringArrayList lazyStringArrayList = new LazyStringArrayList(false);
        f38070O = lazyStringArrayList;
        J2 = lazyStringArrayList;
    }

    private static String HI(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof ByteString ? ((ByteString) obj).T() : Internal.gh((byte[]) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] az(Object obj) {
        return obj instanceof byte[] ? (byte[]) obj : obj instanceof String ? Internal.mUb((String) obj) : ((ByteString) obj).fD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ByteString ty(Object obj) {
        return obj instanceof ByteString ? (ByteString) obj : obj instanceof String ? ByteString.ty((String) obj) : ByteString.qie((byte[]) obj);
    }

    public ByteString Ik(int i2) {
        Object obj = this.f38071t.get(i2);
        ByteString byteStringTy = ty(obj);
        if (byteStringTy != obj) {
            this.f38071t.set(i2, byteStringTy);
        }
        return byteStringTy;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection collection) {
        rl();
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f38071t.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public String get(int i2) {
        Object obj = this.f38071t.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String strT = byteString.T();
            if (byteString.XQ()) {
                this.f38071t.set(i2, strT);
            }
            return strT;
        }
        byte[] bArr = (byte[]) obj;
        String strGh = Internal.gh(bArr);
        if (Internal.Uo(bArr)) {
            this.f38071t.set(i2, strGh);
        }
        return strGh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public byte[] getByteArray(int i2) {
        Object obj = this.f38071t.get(i2);
        byte[] bArrAz = az(obj);
        if (bArrAz != obj) {
            this.f38071t.set(i2, bArrAz);
        }
        return bArrAz;
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public Object getRaw(int i2) {
        return this.f38071t.get(i2);
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f38071t);
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f38071t.size();
    }

    private LazyStringArrayList(ArrayList arrayList) {
        this.f38071t = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object S(int i2, ByteString byteString) {
        rl();
        return this.f38071t.set(i2, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object WPU(int i2, byte[] bArr) {
        rl();
        return this.f38071t.set(i2, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gh(int i2, byte[] bArr) {
        rl();
        this.f38071t.add(i2, bArr);
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xMQ(int i2, ByteString byteString) {
        rl();
        this.f38071t.add(i2, byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: XQ, reason: merged with bridge method [inline-methods] */
    public String set(int i2, String str) {
        rl();
        return HI(this.f38071t.set(i2, str));
    }

    @Override // androidx.content.preferences.protobuf.LazyStringList
    public void a(ByteString byteString) {
        rl();
        this.f38071t.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        rl();
        this.f38071t.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
    public void add(int i2, String str) {
        rl();
        this.f38071t.add(i2, str);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public String remove(int i2) {
        rl();
        Object objRemove = this.f38071t.remove(i2);
        ((AbstractList) this).modCount++;
        return HI(objRemove);
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public boolean add(String str) {
        rl();
        this.f38071t.add(str);
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public LazyStringArrayList mutableCopyWithCapacity(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.f38071t);
            return new LazyStringArrayList(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }
}
