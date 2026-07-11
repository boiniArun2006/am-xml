package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00032\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R*\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR2\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00120\u001c\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateRegistryImpl;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "", "", "", "", "restored", "Lkotlin/Function1;", "", "canBeSaved", "<init>", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "value", c.f62177j, "(Ljava/lang/Object;)Z", "key", "J2", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlin/Function0;", "valueProvider", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "rl", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "O", "()Ljava/util/Map;", "Lkotlin/jvm/functions/Function1;", "Landroidx/collection/MutableScatterMap;", "Landroidx/collection/MutableScatterMap;", "", "t", "valueProviders", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSaveableStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,184:1\n1#2:185\n1#2:187\n683#3:186\n357#4,4:188\n329#4,6:192\n339#4,3:199\n342#4,9:203\n361#4:212\n357#4,4:213\n329#4,6:217\n339#4,3:224\n342#4,9:228\n361#4:237\n1399#5:198\n1270#5:202\n1399#5:223\n1270#5:227\n*S KotlinDebug\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n*L\n134#1:187\n134#1:186\n156#1:188,4\n156#1:192,6\n156#1:199,3\n156#1:203,9\n156#1:212\n158#1:213,4\n158#1:217,6\n158#1:224,3\n158#1:228,9\n158#1:237\n156#1:198\n156#1:202\n158#1:223\n158#1:227\n*E\n"})
final class SaveableStateRegistryImpl implements SaveableStateRegistry {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function1 canBeSaved;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableScatterMap restored;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private MutableScatterMap valueProviders;

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object J2(String key) {
        MutableScatterMap mutableScatterMap;
        MutableScatterMap mutableScatterMap2 = this.restored;
        List list = mutableScatterMap2 != null ? (List) mutableScatterMap2.XQ(key) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && (mutableScatterMap = this.restored) != null) {
        }
        return list.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map O() {
        char c2;
        long j2;
        long j3;
        long j4;
        long[] jArr;
        int i2;
        long[] jArr2;
        int i3;
        char c4;
        long j5;
        MutableScatterMap mutableScatterMap = this.restored;
        if (mutableScatterMap == null && this.valueProviders == null) {
            return MapsKt.emptyMap();
        }
        int i5 = 0;
        int i7 = mutableScatterMap != null ? mutableScatterMap.get_size() : 0;
        MutableScatterMap mutableScatterMap2 = this.valueProviders;
        HashMap map = new HashMap(i7 + (mutableScatterMap2 != null ? mutableScatterMap2.get_size() : 0));
        MutableScatterMap mutableScatterMap3 = this.restored;
        char c5 = 7;
        long j6 = -9187201950435737472L;
        int i8 = 8;
        if (mutableScatterMap3 != null) {
            Object[] objArr = mutableScatterMap3.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
            Object[] objArr2 = mutableScatterMap3.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
            long[] jArr3 = mutableScatterMap3.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i9 = 0;
                j3 = 128;
                while (true) {
                    long j7 = jArr3[i9];
                    j4 = 255;
                    if ((((~j7) << c5) & j7 & j6) != j6) {
                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j7 & 255) < 128) {
                                int i12 = (i9 << 3) + i11;
                                c4 = c5;
                                j5 = j6;
                                map.put((String) objArr[i12], (List) objArr2[i12]);
                            } else {
                                c4 = c5;
                                j5 = j6;
                            }
                            j7 >>= 8;
                            i11++;
                            c5 = c4;
                            j6 = j5;
                        }
                        c2 = c5;
                        j2 = j6;
                        if (i10 != 8) {
                            break;
                        }
                    } else {
                        c2 = c5;
                        j2 = j6;
                    }
                    if (i9 == length) {
                        break;
                    }
                    i9++;
                    c5 = c2;
                    j6 = j2;
                }
            } else {
                c2 = 7;
                j2 = -9187201950435737472L;
                j3 = 128;
                j4 = 255;
            }
        }
        MutableScatterMap mutableScatterMap4 = this.valueProviders;
        if (mutableScatterMap4 != null) {
            Object[] objArr3 = mutableScatterMap4.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
            Object[] objArr4 = mutableScatterMap4.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
            long[] jArr4 = mutableScatterMap4.metadata;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i13 = 0;
                while (true) {
                    long j9 = jArr4[i13];
                    if ((((~j9) << c2) & j9 & j2) != j2) {
                        int i14 = 8 - ((~(i13 - length2)) >>> 31);
                        int i15 = i5;
                        while (i15 < i14) {
                            if ((j9 & j4) < j3) {
                                int i16 = (i13 << 3) + i15;
                                Object obj = objArr3[i16];
                                List list = (List) objArr4[i16];
                                String str = (String) obj;
                                i3 = i8;
                                if (list.size() == 1) {
                                    Object objInvoke = ((Function0) list.get(i5)).invoke();
                                    if (objInvoke != null) {
                                        if (!n(objInvoke)) {
                                            throw new IllegalStateException(RememberSaveableKt.rl(objInvoke).toString());
                                        }
                                        map.put(str, CollectionsKt.arrayListOf(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i5 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((Function0) list.get(i5)).invoke();
                                        if (objInvoke2 != null && !n(objInvoke2)) {
                                            throw new IllegalStateException(RememberSaveableKt.rl(objInvoke2).toString());
                                        }
                                        arrayList.add(objInvoke2);
                                        i5++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i3 = i8;
                            }
                            j9 >>= i3;
                            i15++;
                            i8 = i3;
                            jArr4 = jArr2;
                            i5 = 0;
                        }
                        jArr = jArr4;
                        i2 = i8;
                        if (i14 != i2) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i2 = i8;
                    }
                    if (i13 == length2) {
                        break;
                    }
                    i13++;
                    i8 = i2;
                    jArr4 = jArr;
                    i5 = 0;
                }
            }
        }
        return map;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean n(Object value) {
        return ((Boolean) this.canBeSaved.invoke(value)).booleanValue();
    }

    public SaveableStateRegistryImpl(Map map, Function1 function1) {
        MutableScatterMap mutableScatterMapJ2;
        this.canBeSaved = function1;
        if (map != null && !map.isEmpty()) {
            mutableScatterMapJ2 = SaveableStateRegistryKt.J2(map);
        } else {
            mutableScatterMapJ2 = null;
        }
        this.restored = mutableScatterMapJ2;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry rl(final String key, final Function0 valueProvider) {
        if (!SaveableStateRegistryKt.nr(key)) {
            final MutableScatterMap mutableScatterMapT = this.valueProviders;
            if (mutableScatterMapT == null) {
                mutableScatterMapT = ScatterMapKt.t();
                this.valueProviders = mutableScatterMapT;
            }
            Object objO = mutableScatterMapT.O(key);
            if (objO == null) {
                objO = new ArrayList();
                mutableScatterMapT.aYN(key, objO);
            }
            ((List) objO).add(valueProvider);
            return new SaveableStateRegistry.Entry() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryImpl$registerProvider$3
                @Override // androidx.compose.runtime.saveable.SaveableStateRegistry.Entry
                public void n() {
                    List list = (List) mutableScatterMapT.XQ(key);
                    if (list != null) {
                        list.remove(valueProvider);
                    }
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    mutableScatterMapT.aYN(key, list);
                }
            };
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
