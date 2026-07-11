package androidx.compose.runtime.collection;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.collection.ObjectListKt;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010!\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002!\u0010 \u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u000f0\u001d¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010\u0011R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+\u0088\u0001\u0005\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006,"}, d2 = {"Landroidx/compose/runtime/collection/MultiValueMap;", "", "K", "V", "Landroidx/collection/MutableScatterMap;", "map", "nr", "(Landroidx/collection/MutableScatterMap;)Landroidx/collection/MutableScatterMap;", "key", "value", "", c.f62177j, "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V", "t", "(Landroidx/collection/MutableScatterMap;)V", "", "J2", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z", "Landroidx/collection/ObjectList;", "KN", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Landroidx/collection/ObjectList;", "mUb", "(Landroidx/collection/MutableScatterMap;)Z", "gh", "az", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Ljava/lang/Object;", "qie", "Ik", "(Landroidx/collection/MutableScatterMap;)Landroidx/collection/ObjectList;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "condition", "ty", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "", "HI", "(Landroidx/collection/MutableScatterMap;)Ljava/lang/String;", "", "xMQ", "(Landroidx/collection/MutableScatterMap;)I", InneractiveMediationNameConsts.OTHER, "Uo", "Landroidx/collection/MutableScatterMap;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nMultiValueMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiValueMap.kt\nandroidx/compose/runtime/collection/MultiValueMap\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 ObjectList.kt\nandroidx/collection/ObjectList\n+ 8 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,141:1\n694#2,5:142\n701#2,8:151\n4658#3,4:147\n1516#4:159\n372#5,3:160\n329#5,6:163\n339#5,3:170\n342#5,9:174\n375#5:183\n1399#6:169\n1270#6:173\n287#7,6:184\n84#7:194\n943#8,4:190\n947#8,8:195\n*S KotlinDebug\n*F\n+ 1 MultiValueMap.kt\nandroidx/compose/runtime/collection/MultiValueMap\n*L\n44#1:142,5\n44#1:151,8\n45#1:147,4\n107#1:159\n108#1:160,3\n108#1:163,6\n108#1:170,3\n108#1:174,9\n108#1:183\n108#1:169\n108#1:173\n121#1:184,6\n132#1:194\n132#1:190,4\n132#1:195,8\n*E\n"})
public final class MultiValueMap<K, V> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableScatterMap map;

    public static String HI(MutableScatterMap mutableScatterMap) {
        return "MultiValueMap(map=" + mutableScatterMap + ')';
    }

    public static /* synthetic */ MutableScatterMap O(MutableScatterMap mutableScatterMap, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3 = 1;
        if ((i2 & 1) != 0) {
            mutableScatterMap = new MutableScatterMap(0, i3, null);
        }
        return nr(mutableScatterMap);
    }

    public static boolean Uo(MutableScatterMap mutableScatterMap, Object obj) {
        return (obj instanceof MultiValueMap) && Intrinsics.areEqual(mutableScatterMap, ((MultiValueMap) obj).getMap());
    }

    public static MutableScatterMap nr(MutableScatterMap mutableScatterMap) {
        return mutableScatterMap;
    }

    public static final /* synthetic */ MultiValueMap rl(MutableScatterMap mutableScatterMap) {
        return new MultiValueMap(mutableScatterMap);
    }

    public static int xMQ(MutableScatterMap mutableScatterMap) {
        return mutableScatterMap.hashCode();
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final /* synthetic */ MutableScatterMap getMap() {
        return this.map;
    }

    public boolean equals(Object obj) {
        return Uo(this.map, obj);
    }

    public int hashCode() {
        return xMQ(this.map);
    }

    public String toString() {
        return HI(this.map);
    }

    private /* synthetic */ MultiValueMap(MutableScatterMap mutableScatterMap) {
        this.map = mutableScatterMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ObjectList Ik(MutableScatterMap mutableScatterMap) {
        if (mutableScatterMap.KN()) {
            return ObjectListKt.J2();
        }
        MutableObjectList mutableObjectList = new MutableObjectList(0, 1, null);
        Object[] objArr = mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i3; i5++) {
                        if ((255 & j2) < 128) {
                            Object obj = objArr[(i2 << 3) + i5];
                            if (obj instanceof MutableObjectList) {
                                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>");
                                mutableObjectList.ck((MutableObjectList) obj);
                            } else {
                                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                mutableObjectList.ty(obj);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return mutableObjectList;
    }

    public static final boolean J2(MutableScatterMap mutableScatterMap, Object obj) {
        return mutableScatterMap.rl(obj);
    }

    public static final ObjectList KN(MutableScatterMap mutableScatterMap, Object obj) {
        Object objO = mutableScatterMap.O(obj);
        if (objO == null) {
            return ObjectListKt.J2();
        }
        if (objO instanceof MutableObjectList) {
            return (ObjectList) objO;
        }
        return ObjectListKt.xMQ(objO);
    }

    public static final Object az(MutableScatterMap mutableScatterMap, Object obj) {
        Object objO = mutableScatterMap.O(obj);
        if (objO == null) {
            return null;
        }
        if (objO instanceof MutableObjectList) {
            MutableObjectList mutableObjectList = (MutableObjectList) objO;
            Object objRl = ExtensionsKt.rl(mutableObjectList);
            Intrinsics.checkNotNull(objRl, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            if (mutableObjectList.Uo()) {
                mutableScatterMap.XQ(obj);
            }
            if (mutableObjectList.get_size() == 1) {
                mutableScatterMap.aYN(obj, mutableObjectList.t());
            }
            return objRl;
        }
        mutableScatterMap.XQ(obj);
        return objO;
    }

    public static final boolean gh(MutableScatterMap mutableScatterMap) {
        return mutableScatterMap.xMQ();
    }

    public static final boolean mUb(MutableScatterMap mutableScatterMap) {
        return mutableScatterMap.KN();
    }

    public static final void n(MutableScatterMap mutableScatterMap, Object obj, Object obj2) {
        boolean z2;
        Object obj3;
        int iTy = mutableScatterMap.ty(obj);
        if (iTy < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            obj3 = null;
        } else {
            obj3 = mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String[iTy];
        }
        TypeIntrinsics.isMutableList(obj3);
        if (obj3 != null) {
            if (obj3 instanceof MutableObjectList) {
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type androidx.collection.MutableObjectList<kotlin.Any>");
                MutableObjectList mutableObjectList = (MutableObjectList) obj3;
                mutableObjectList.ty(obj2);
                obj2 = mutableObjectList;
            } else {
                obj2 = ObjectListKt.KN(obj3, obj2);
            }
        }
        if (z2) {
            int i2 = ~iTy;
            mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String[i2] = obj;
            mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String[i2] = obj2;
            return;
        }
        mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String[iTy] = obj2;
    }

    public static final Object qie(MutableScatterMap mutableScatterMap, Object obj) {
        Object objO = mutableScatterMap.O(obj);
        if (objO == null) {
            return null;
        }
        if (objO instanceof MutableObjectList) {
            MutableObjectList mutableObjectList = (MutableObjectList) objO;
            Object objG = mutableObjectList.g(0);
            if (mutableObjectList.Uo()) {
                mutableScatterMap.XQ(obj);
            }
            if (mutableObjectList.get_size() == 1) {
                mutableScatterMap.aYN(obj, mutableObjectList.t());
            }
            return objG;
        }
        mutableScatterMap.XQ(obj);
        return objO;
    }

    public static final void t(MutableScatterMap mutableScatterMap) {
        mutableScatterMap.gh();
    }

    public static final void ty(MutableScatterMap mutableScatterMap, Object obj, Function1 function1) {
        Object objO = mutableScatterMap.O(obj);
        if (objO != null) {
            if (objO instanceof MutableObjectList) {
                MutableObjectList mutableObjectList = (MutableObjectList) objO;
                int i2 = mutableObjectList._size;
                Object[] objArr = mutableObjectList.content;
                int i3 = 0;
                IntRange intRangeUntil = RangesKt.until(0, i2);
                int first = intRangeUntil.getFirst();
                int last = intRangeUntil.getLast();
                if (first <= last) {
                    while (true) {
                        objArr[first - i3] = objArr[first];
                        if (((Boolean) function1.invoke(objArr[first])).booleanValue()) {
                            i3++;
                        }
                        if (first == last) {
                            break;
                        } else {
                            first++;
                        }
                    }
                }
                ArraysKt.fill(objArr, (Object) null, i2 - i3, i2);
                mutableObjectList._size -= i3;
                if (mutableObjectList.Uo()) {
                    mutableScatterMap.XQ(obj);
                }
                if (mutableObjectList.get_size() == 0) {
                    mutableScatterMap.aYN(obj, mutableObjectList.t());
                    return;
                }
                return;
            }
            if (((Boolean) function1.invoke(objO)).booleanValue()) {
                mutableScatterMap.XQ(obj);
            }
        }
    }
}
