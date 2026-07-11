package androidx.content.preferences.protobuf;

import aT.dE.JLZo;
import com.google.android.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class Internal {
    public static final CodedInputStream J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final ByteBuffer f38019O;
    public static final byte[] nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final Charset f38020n = Charset.forName(JLZo.nndPrrIIxpwUzrz);
    static final Charset rl = Charset.forName(C.UTF8_NAME);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final Charset f38021t = Charset.forName(C.ISO88591_NAME);

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public interface BooleanList extends ProtobufList<Boolean> {
        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        BooleanList mutableCopyWithCapacity(int i2);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public interface DoubleList extends ProtobufList<Double> {
        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        DoubleList mutableCopyWithCapacity(int i2);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public interface EnumLite {
        int getNumber();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public interface EnumLiteMap<T extends EnumLite> {
        EnumLite findValueByNumber(int i2);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public interface EnumVerifier {
        boolean isInRange(int i2);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public interface FloatList extends ProtobufList<Float> {
        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        FloatList mutableCopyWithCapacity(int i2);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public interface IntList extends ProtobufList<Integer> {
        int getInt(int i2);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        IntList mutableCopyWithCapacity(int i2);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static class IntListAdapter<T> extends AbstractList<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final IntList f38022n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final IntConverter f38023t;

        public interface IntConverter<T> {
            Object n(int i2);
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i2) {
            return this.f38023t.n(this.f38022n.getInt(i2));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f38022n.size();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static class ListAdapter<F, T> extends AbstractList<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f38024n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Converter f38025t;

        public interface Converter<F, T> {
            Object convert(Object obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i2) {
            return this.f38025t.convert(this.f38024n.get(i2));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f38024n.size();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public interface LongList extends ProtobufList<Long> {
        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        LongList mutableCopyWithCapacity(int i2);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static class MapAdapter<K, V, RealValue> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Map f38026n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Converter f38027t;

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Internal$MapAdapter$1, reason: invalid class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
        class AnonymousClass1 implements Converter<Integer, EnumLite> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ EnumLiteMap f38028n;
            final /* synthetic */ EnumLite rl;

            @Override // androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter
            /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
            public EnumLite n(Integer num) {
                EnumLite enumLiteFindValueByNumber = this.f38028n.findValueByNumber(num.intValue());
                return enumLiteFindValueByNumber == null ? this.rl : enumLiteFindValueByNumber;
            }

            @Override // androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public Integer rl(EnumLite enumLite) {
                return Integer.valueOf(enumLite.getNumber());
            }
        }

        public interface Converter<A, B> {
            Object n(Object obj);

            Object rl(Object obj);
        }

        private class EntryAdapter implements Map.Entry<K, V> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Map.Entry f38029n;

            @Override // java.util.Map.Entry
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof Map.Entry) && getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
            }

            public EntryAdapter(Map.Entry entry) {
                this.f38029n = entry;
            }

            @Override // java.util.Map.Entry
            public Object getKey() {
                return this.f38029n.getKey();
            }

            @Override // java.util.Map.Entry
            public Object getValue() {
                return MapAdapter.this.f38027t.n(this.f38029n.getValue());
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.f38029n.hashCode();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Map.Entry
            public Object setValue(Object obj) {
                Object value = this.f38029n.setValue(MapAdapter.this.f38027t.rl(obj));
                if (value == null) {
                    return null;
                }
                return MapAdapter.this.f38027t.n(value);
            }
        }

        private class IteratorAdapter implements Iterator<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Iterator f38031n;

            public IteratorAdapter(Iterator it) {
                this.f38031n = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f38031n.hasNext();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return new EntryAdapter((Map.Entry) this.f38031n.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f38031n.remove();
            }
        }

        private class SetAdapter extends AbstractSet<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Set f38033n;

            public SetAdapter(Set set) {
                this.f38033n = set;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return new IteratorAdapter(this.f38033n.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.f38033n.size();
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            return new SetAdapter(this.f38026n.entrySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            Object obj2 = this.f38026n.get(obj);
            if (obj2 == null) {
                return null;
            }
            return this.f38027t.n(obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            Object objPut = this.f38026n.put(obj, this.f38027t.rl(obj2));
            if (objPut == null) {
                return null;
            }
            return this.f38027t.n(objPut);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public interface ProtobufList<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        ProtobufList mutableCopyWithCapacity(int i2);
    }

    public static int J2(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static int nr(byte[] bArr) {
        return O(bArr, 0, bArr.length);
    }

    public static int t(boolean z2) {
        return z2 ? 1231 : 1237;
    }

    static int xMQ(int i2, byte[] bArr, int i3, int i5) {
        for (int i7 = i3; i7 < i3 + i5; i7++) {
            i2 = (i2 * 31) + bArr[i7];
        }
        return i2;
    }

    static {
        byte[] bArr = new byte[0];
        nr = bArr;
        f38019O = ByteBuffer.wrap(bArr);
        J2 = CodedInputStream.gh(bArr);
    }

    static Object KN(Object obj, Object obj2) {
        return ((MessageLite) obj).toBuilder().Uo((MessageLite) obj2).buildPartial();
    }

    public static String gh(byte[] bArr) {
        return new String(bArr, rl);
    }

    public static byte[] mUb(String str) {
        return str.getBytes(rl);
    }

    static Object rl(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    static int O(byte[] bArr, int i2, int i3) {
        int iXMQ = xMQ(i3, bArr, i2, i3);
        if (iXMQ == 0) {
            return 1;
        }
        return iXMQ;
    }

    public static boolean Uo(byte[] bArr) {
        return Utf8.Z(bArr);
    }

    static Object n(Object obj) {
        obj.getClass();
        return obj;
    }
}
