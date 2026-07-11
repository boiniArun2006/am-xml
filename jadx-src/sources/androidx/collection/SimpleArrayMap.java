package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0018\u0010\b\u001a\u0014\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0007J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0001H\u0001¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u001a\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00028\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010!\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010\u001cJ'\u0010&\u001a\u00020\n2\u0016\u0010\b\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b&\u0010\tJ!\u0010'\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b'\u0010\u001cJ\u0019\u0010(\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010\u0019J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010\u001fJ!\u0010+\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b+\u0010\u001cJ'\u0010+\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u00012\u0006\u0010-\u001a\u00028\u0001H\u0016¢\u0006\u0004\b+\u0010.J\u000f\u0010/\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b2\u0010\u0012J\u000f\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u00100J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u00107\u001a\u00020\u0004H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0004H\u0002¢\u0006\u0004\b:\u00100R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010@R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010B¨\u0006C"}, d2 = {"Landroidx/collection/SimpleArrayMap;", "K", "V", "", "", "capacity", "<init>", "(I)V", "map", "(Landroidx/collection/SimpleArrayMap;)V", "", "clear", "()V", "minimumCapacity", "O", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "Uo", "(Ljava/lang/Object;)I", "value", "t", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "defaultValue", "getOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "index", "xMQ", "(I)Ljava/lang/Object;", "az", "qie", "(ILjava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "put", "mUb", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "gh", V8ValueBuiltInSymbol.PROPERTY_REPLACE, "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "size", "()I", InneractiveMediationNameConsts.OTHER, "equals", "hashCode", "", "toString", "()Ljava/lang/String;", "hash", "J2", "(Ljava/lang/Object;I)I", "KN", "", c.f62177j, "[I", "hashes", "", "[Ljava/lang/Object;", "array", "I", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSimpleArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,761:1\n299#1,5:762\n299#1,5:767\n59#2,5:772\n59#2,5:777\n59#2,5:782\n59#2,5:788\n1#3:787\n*S KotlinDebug\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n*L\n278#1:762,5\n294#1:767,5\n315#1:772,5\n330#1:777,5\n346#1:782,5\n512#1:788,5\n*E\n"})
public class SimpleArrayMap<K, V> {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int[] hashes;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Object[] array;

    public SimpleArrayMap() {
        this(0, 1, null);
    }

    public Object az(int index) {
        boolean z2 = false;
        if (index >= 0 && index < this.size) {
            z2 = true;
        }
        if (!z2) {
            RuntimeHelpersKt.n("Expected index to be within 0..size()-1, but was " + index);
        }
        return this.array[(index << 1) + 1];
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        try {
            if (other instanceof SimpleArrayMap) {
                if (getSize() != ((SimpleArrayMap) other).getSize()) {
                    return false;
                }
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) other;
                int i2 = this.size;
                for (int i3 = 0; i3 < i2; i3++) {
                    Object objXMQ = xMQ(i3);
                    Object objAz = az(i3);
                    Object obj = simpleArrayMap.get(objXMQ);
                    if (objAz == null) {
                        if (obj != null || !simpleArrayMap.containsKey(objXMQ)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(objAz, obj)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(other instanceof Map) || getSize() != ((Map) other).size()) {
                return false;
            }
            int i5 = this.size;
            for (int i7 = 0; i7 < i5; i7++) {
                Object objXMQ2 = xMQ(i7);
                Object objAz2 = az(i7);
                Object obj2 = ((Map) other).get(objXMQ2);
                if (objAz2 == null) {
                    if (obj2 != null || !((Map) other).containsKey(objXMQ2)) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(objAz2, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object gh(int index) {
        if (!(index >= 0 && index < this.size)) {
            RuntimeHelpersKt.n("Expected index to be within 0..size()-1, but was " + index);
        }
        Object[] objArr = this.array;
        int i2 = index << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.size;
        if (i3 <= 1) {
            clear();
            return obj;
        }
        int i5 = i3 - 1;
        int[] iArr = this.hashes;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            if (index < i5) {
                int i7 = index + 1;
                ArraysKt.copyInto(iArr, iArr, index, i7, i3);
                Object[] objArr2 = this.array;
                ArraysKt.copyInto(objArr2, objArr2, i2, i7 << 1, i3 << 1);
            }
            Object[] objArr3 = this.array;
            int i8 = i5 << 1;
            objArr3[i8] = null;
            objArr3[i8 + 1] = null;
        } else {
            int i9 = i3 > 8 ? i3 + (i3 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i9);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i9 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.array = objArrCopyOf;
            if (i3 != this.size) {
                throw new ConcurrentModificationException();
            }
            if (index > 0) {
                ArraysKt.copyInto(iArr, this.hashes, 0, 0, index);
                ArraysKt.copyInto(objArr, this.array, 0, 0, i2);
            }
            if (index < i5) {
                int i10 = index + 1;
                ArraysKt.copyInto(iArr, this.hashes, index, i10, i3);
                ArraysKt.copyInto(objArr, this.array, i2, i10 << 1, i3 << 1);
            }
        }
        if (i3 != this.size) {
            throw new ConcurrentModificationException();
        }
        this.size = i5;
        return obj;
    }

    public Object qie(int index, Object value) {
        boolean z2 = false;
        if (index >= 0 && index < this.size) {
            z2 = true;
        }
        if (!z2) {
            RuntimeHelpersKt.n("Expected index to be within 0..size()-1, but was " + index);
        }
        int i2 = (index << 1) + 1;
        Object[] objArr = this.array;
        Object obj = objArr[i2];
        objArr[i2] = value;
        return obj;
    }

    public Object remove(Object key) {
        int iUo = Uo(key);
        if (iUo >= 0) {
            return gh(iUo);
        }
        return null;
    }

    public Object replace(Object key, Object value) {
        int iUo = Uo(key);
        if (iUo >= 0) {
            return qie(iUo, value);
        }
        return null;
    }

    public Object xMQ(int index) {
        boolean z2 = false;
        if (index >= 0 && index < this.size) {
            z2 = true;
        }
        if (!z2) {
            RuntimeHelpersKt.n("Expected index to be within 0..size()-1, but was " + index);
        }
        return this.array[index << 1];
    }

    public SimpleArrayMap(int i2) {
        this.hashes = i2 == 0 ? ContainerHelpersKt.f14931n : new int[i2];
        this.array = i2 == 0 ? ContainerHelpersKt.f14932t : new Object[i2 << 1];
    }

    private final int J2(Object key, int hash) {
        int i2 = this.size;
        if (i2 == 0) {
            return -1;
        }
        int iN = ContainerHelpersKt.n(this.hashes, i2, hash);
        if (iN < 0 || Intrinsics.areEqual(key, this.array[iN << 1])) {
            return iN;
        }
        int i3 = iN + 1;
        while (i3 < i2 && this.hashes[i3] == hash) {
            if (Intrinsics.areEqual(key, this.array[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i5 = iN - 1; i5 >= 0 && this.hashes[i5] == hash; i5--) {
            if (Intrinsics.areEqual(key, this.array[i5 << 1])) {
                return i5;
            }
        }
        return ~i3;
    }

    private final int KN() {
        int i2 = this.size;
        if (i2 == 0) {
            return -1;
        }
        int iN = ContainerHelpersKt.n(this.hashes, i2, 0);
        if (iN < 0 || this.array[iN << 1] == null) {
            return iN;
        }
        int i3 = iN + 1;
        while (i3 < i2 && this.hashes[i3] == 0) {
            if (this.array[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i5 = iN - 1; i5 >= 0 && this.hashes[i5] == 0; i5--) {
            if (this.array[i5 << 1] == null) {
                return i5;
            }
        }
        return ~i3;
    }

    public void O(int minimumCapacity) {
        int i2 = this.size;
        int[] iArr = this.hashes;
        if (iArr.length < minimumCapacity) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, minimumCapacity);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, minimumCapacity * 2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.array = objArrCopyOf;
        }
        if (this.size != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public int Uo(Object key) {
        return key == null ? KN() : J2(key, key.hashCode());
    }

    public void clear() {
        if (this.size > 0) {
            this.hashes = ContainerHelpersKt.f14931n;
            this.array = ContainerHelpersKt.f14932t;
            this.size = 0;
        }
        if (this.size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.array;
        int i2 = this.size;
        int i3 = 1;
        int i5 = 0;
        int iHashCode = 0;
        while (i5 < i2) {
            Object obj = objArr[i3];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i5];
            i5++;
            i3 += 2;
        }
        return iHashCode;
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public void mUb(SimpleArrayMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        int i2 = map.size;
        O(this.size + i2);
        if (this.size != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(map.xMQ(i3), map.az(i3));
            }
        } else if (i2 > 0) {
            ArraysKt.copyInto(map.hashes, this.hashes, 0, 0, i2);
            ArraysKt.copyInto(map.array, this.array, 0, 0, i2 << 1);
            this.size = i2;
        }
    }

    public Object put(Object key, Object value) {
        int i2 = this.size;
        int iHashCode = key != null ? key.hashCode() : 0;
        int iJ2 = key != null ? J2(key, iHashCode) : KN();
        if (iJ2 >= 0) {
            int i3 = (iJ2 << 1) + 1;
            Object[] objArr = this.array;
            Object obj = objArr[i3];
            objArr[i3] = value;
            return obj;
        }
        int i5 = ~iJ2;
        int[] iArr = this.hashes;
        if (i2 >= iArr.length) {
            int i7 = 8;
            if (i2 >= 8) {
                i7 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i7 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i7 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.array = objArrCopyOf;
            if (i2 != this.size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i2) {
            int[] iArr2 = this.hashes;
            int i8 = i5 + 1;
            ArraysKt.copyInto(iArr2, iArr2, i8, i5, i2);
            Object[] objArr2 = this.array;
            ArraysKt.copyInto(objArr2, objArr2, i8 << 1, i5 << 1, this.size << 1);
        }
        int i9 = this.size;
        if (i2 == i9) {
            int[] iArr3 = this.hashes;
            if (i5 < iArr3.length) {
                iArr3[i5] = iHashCode;
                Object[] objArr3 = this.array;
                int i10 = i5 << 1;
                objArr3[i10] = key;
                objArr3[i10 + 1] = value;
                this.size = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: renamed from: size, reason: from getter */
    public int getSize() {
        return this.size;
    }

    public final int t(Object value) {
        int i2 = this.size * 2;
        Object[] objArr = this.array;
        if (value == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i5 = 1; i5 < i2; i5 += 2) {
            if (Intrinsics.areEqual(value, objArr[i5])) {
                return i5 >> 1;
            }
        }
        return -1;
    }

    public boolean containsKey(Object key) {
        if (Uo(key) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object value) {
        if (t(value) >= 0) {
            return true;
        }
        return false;
    }

    public Object get(Object key) {
        int iUo = Uo(key);
        if (iUo >= 0) {
            return this.array[(iUo << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object key, Object defaultValue) {
        int iUo = Uo(key);
        if (iUo >= 0) {
            return this.array[(iUo << 1) + 1];
        }
        return defaultValue;
    }

    public Object putIfAbsent(Object key, Object value) {
        Object obj = get(key);
        if (obj == null) {
            return put(key, value);
        }
        return obj;
    }

    public boolean remove(Object key, Object value) {
        int iUo = Uo(key);
        if (iUo < 0 || !Intrinsics.areEqual(value, az(iUo))) {
            return false;
        }
        gh(iUo);
        return true;
    }

    public boolean replace(Object key, Object oldValue, Object newValue) {
        int iUo = Uo(key);
        if (iUo < 0 || !Intrinsics.areEqual(oldValue, az(iUo))) {
            return false;
        }
        qie(iUo, newValue);
        return true;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object objXMQ = xMQ(i3);
            if (objXMQ != sb) {
                sb.append(objXMQ);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objAz = az(i3);
            if (objAz != sb) {
                sb.append(objAz);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public /* synthetic */ SimpleArrayMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i2);
    }

    public SimpleArrayMap(SimpleArrayMap simpleArrayMap) {
        this(0, 1, null);
        if (simpleArrayMap != null) {
            mUb(simpleArrayMap);
        }
    }
}
