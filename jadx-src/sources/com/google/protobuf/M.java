package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class M extends w6 implements rv6, RandomAccess {

    @Deprecated
    public static final rv6 EMPTY;
    private static final M EMPTY_LIST;
    private final List<Object> list;

    private static class j extends AbstractList implements RandomAccess {
        private final M list;

        @Override // java.util.AbstractList, java.util.List
        public void add(int i2, byte[] bArr) {
            this.list.add(i2, bArr);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] get(int i2) {
            return this.list.getByteArray(i2);
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] remove(int i2) {
            String strRemove = this.list.remove(i2);
            ((AbstractList) this).modCount++;
            return M.asByteArray(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] set(int i2, byte[] bArr) {
            Object andReturn = this.list.setAndReturn(i2, bArr);
            ((AbstractList) this).modCount++;
            return M.asByteArray(andReturn);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.list.size();
        }

        j(M m2) {
            this.list = m2;
        }
    }

    private static class n extends AbstractList implements RandomAccess {
        private final M list;

        @Override // java.util.AbstractList, java.util.List
        public void add(int i2, C c2) {
            this.list.add(i2, c2);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public C get(int i2) {
            return this.list.getByteString(i2);
        }

        @Override // java.util.AbstractList, java.util.List
        public C remove(int i2) {
            String strRemove = this.list.remove(i2);
            ((AbstractList) this).modCount++;
            return M.asByteString(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        public C set(int i2, C c2) {
            Object andReturn = this.list.setAndReturn(i2, c2);
            ((AbstractList) this).modCount++;
            return M.asByteString(andReturn);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.list.size();
        }

        n(M m2) {
            this.list = m2;
        }
    }

    public M() {
        this(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object setAndReturn(int i2, C c2) {
        ensureIsMutable();
        return this.list.set(i2, c2);
    }

    @Override // com.google.protobuf.w6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    static {
        M m2 = new M(false);
        EMPTY_LIST = m2;
        EMPTY = m2;
    }

    private M(boolean z2) {
        super(z2);
        this.list = Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] asByteArray(Object obj) {
        return obj instanceof byte[] ? (byte[]) obj : obj instanceof String ? nKK.toByteArray((String) obj) : ((C) obj).toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C asByteString(Object obj) {
        return obj instanceof C ? (C) obj : obj instanceof String ? C.copyFromUtf8((String) obj) : C.copyFrom((byte[]) obj);
    }

    private static String asString(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof C ? ((C) obj).toStringUtf8() : nKK.toStringUtf8((byte[]) obj);
    }

    public static M emptyList() {
        return EMPTY_LIST;
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection<? extends String> collection) {
        ensureIsMutable();
        if (collection instanceof rv6) {
            collection = ((rv6) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.list.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.rv6
    public List<byte[]> asByteArrayList() {
        return new j(this);
    }

    @Override // com.google.protobuf.rv6, com.google.protobuf.YzO
    public List<C> asByteStringList() {
        return new n(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i2) {
        Object obj = this.list.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C) {
            C c2 = (C) obj;
            String stringUtf8 = c2.toStringUtf8();
            if (c2.isValidUtf8()) {
                this.list.set(i2, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf82 = nKK.toStringUtf8(bArr);
        if (nKK.isValidUtf8(bArr)) {
            this.list.set(i2, stringUtf82);
        }
        return stringUtf82;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.rv6
    public byte[] getByteArray(int i2) {
        Object obj = this.list.get(i2);
        byte[] bArrAsByteArray = asByteArray(obj);
        if (bArrAsByteArray != obj) {
            this.list.set(i2, bArrAsByteArray);
        }
        return bArrAsByteArray;
    }

    @Override // com.google.protobuf.rv6
    public C getByteString(int i2) {
        Object obj = this.list.get(i2);
        C cAsByteString = asByteString(obj);
        if (cAsByteString != obj) {
            this.list.set(i2, cAsByteString);
        }
        return cAsByteString;
    }

    @Override // com.google.protobuf.rv6
    public Object getRaw(int i2) {
        return this.list.get(i2);
    }

    @Override // com.google.protobuf.rv6
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.list);
    }

    @Override // com.google.protobuf.w6, com.google.protobuf.nKK.Dsr, com.google.protobuf.nKK.CN3
    public M mutableCopyWithCapacity(int i2) {
        if (i2 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i2);
        arrayList.addAll(this.list);
        return new M((ArrayList<Object>) arrayList);
    }

    @Override // com.google.protobuf.w6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.List
    public String set(int i2, String str) {
        ensureIsMutable();
        return asString(this.list.set(i2, str));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object setAndReturn(int i2, byte[] bArr) {
        ensureIsMutable();
        return this.list.set(i2, bArr);
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.List
    public void add(int i2, String str) {
        ensureIsMutable();
        this.list.add(i2, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.rv6
    public boolean addAllByteArray(Collection<byte[]> collection) {
        ensureIsMutable();
        boolean zAddAll = this.list.addAll(collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.rv6
    public boolean addAllByteString(Collection<? extends C> collection) {
        ensureIsMutable();
        boolean zAddAll = this.list.addAll(collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ensureIsMutable();
        this.list.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.protobuf.rv6
    public rv6 getUnmodifiableView() {
        if (isModifiable()) {
            return new cA(this);
        }
        return this;
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.w6, com.google.protobuf.nKK.Dsr
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // com.google.protobuf.rv6
    public void mergeFrom(rv6 rv6Var) {
        ensureIsMutable();
        for (Object obj : rv6Var.getUnderlyingElements()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.list.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.list.add(obj);
            }
        }
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.List
    public String remove(int i2) {
        ensureIsMutable();
        Object objRemove = this.list.remove(i2);
        ((AbstractList) this).modCount++;
        return asString(objRemove);
    }

    @Override // com.google.protobuf.w6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.w6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public M(int i2) {
        this((ArrayList<Object>) new ArrayList(i2));
    }

    public M(rv6 rv6Var) {
        this.list = new ArrayList(rv6Var.size());
        addAll(rv6Var);
    }

    @Override // com.google.protobuf.rv6
    public void set(int i2, C c2) {
        setAndReturn(i2, c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int i2, C c2) {
        ensureIsMutable();
        this.list.add(i2, c2);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.rv6
    public void set(int i2, byte[] bArr) {
        setAndReturn(i2, bArr);
    }

    public M(List<String> list) {
        this((ArrayList<Object>) new ArrayList(list));
    }

    private M(ArrayList<Object> arrayList) {
        this.list = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int i2, byte[] bArr) {
        ensureIsMutable();
        this.list.add(i2, bArr);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.rv6
    public void add(C c2) {
        ensureIsMutable();
        this.list.add(c2);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.rv6
    public void add(byte[] bArr) {
        ensureIsMutable();
        this.list.add(bArr);
        ((AbstractList) this).modCount++;
    }
}
